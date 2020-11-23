package org.relxd.lxd.api.competitionlabscli;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.JSON;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.api.ImagesApi;
import org.relxd.lxd.api.InstancesApi;
import org.relxd.lxd.api.OperationsApi;
import org.relxd.lxd.api.trusted.InstancesApiTest;
import org.relxd.lxd.builders.InstanceConfigBuilder;
import org.relxd.lxd.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CompetitionLabsCliTests {

    private ImagesApi imagesApi;
    private InstancesApiTest instancesApiTest;
    private OperationsApi operationsApi;
    private InstancesApi instancesApi;

    private List<String> getImageResponseUrls;
    private Logger logger;

    @BeforeAll
    public void init(){
        new RelxdApiClient();
        imagesApi = new ImagesApi();
        logger = LoggerFactory.getLogger(InstancesApiTest.class);
        operationsApi = new OperationsApi();
        instancesApi = new InstancesApi();
    }

    @Test
    public void createInstanceFromImage(){

        /*Before running this test please make sure you have an existing image that you would want to use to create the container.
        The getImagesTest should be returning this image*/

        try {

            String target = null;

            //Architecture of Instance
            final String architecture = "x86_64";
            //Type of Instance
            final String type = "container";
            //Name of Instance
            final String nameOfContainer = "ubuntu-instance";

            //Instance Devices
            DevicesKvm devices = null;

            //Instance Config
            // Usgae of config builder
            InstanceConfigBuilder configBuilder = new InstanceConfigBuilder();
            configBuilder.setLimitsCpu("2");
            configBuilder.setBootAutoStart(true);

            //Instance Profiles
            List<String> profiles = new ArrayList<>();
            profiles.add("default");

            //Instance fingerprint
            String fingerprint = null;

            //Run a getImages query to extract a fingerprint from the found image
            final BackgroundOperationResponse images = imagesApi.getImages(0, null);
            if (images != null){
                getImageResponseUrls = (List<String>) images.getMetadata();
                if(getImageResponseUrls.size()>0)
                    logger.info("Metadata >>>>>>> {}", getImageResponseUrls.get(0));
            }
            String[] splitUrl;
            if (getImageResponseUrls != null) {
                for (String imageUrl : getImageResponseUrls) {
                    splitUrl = imageUrl.split("/");
                    logger.info("Image Fingerprint >>>>> {}", splitUrl[3]);
                    //Set fingerprint from the found image url
                    fingerprint = splitUrl[3];
                }

                //TODO - move to InstanceSourceBuilder - new class to create
                //Source for the Instance we want to create
                Map<String, Object> source = new HashMap<>();
                source.put("type", "image");
                source.put("fingerprint", fingerprint);

                //Populate the CreateInstancesRequest and get a Response
                //todo - clean up the create instance request - extend it to support other parameters
                CreateInstancesRequest createInstancesRequest = InstancesApiTest.populateCreateInstancesRequest(devices, source, type, profiles, architecture, nameOfContainer, configBuilder.asMap(),true);

                final BackgroundOperationResponse backgroundOperationResponse = instancesApi.postInstances(target, createInstancesRequest);

                logger.info("Create Instance Response >>>>> {}", backgroundOperationResponse);

                //Get the background operation url from the response we got from creating an instance
                if (backgroundOperationResponse != null){
                    final String operation = backgroundOperationResponse.getOperation();
                    String[] splitOperationUrl = operation.split("/");
                    logger.info("Operation Fingerprint >>>>> {}", splitOperationUrl[3]);

                    //Get the operation UUID from the operation url
                    String operationUuid = splitOperationUrl[3];

                    //Use the operation UUID to get the operation
                    final BackgroundOperationResponse operationsUUIDResponse = operationsApi.getOperationsUUID(operationUuid, 0, null);

                    //Keep running the get Operation query every 2 seconds until the instance creation process is complete
                    while ((operationsUUIDResponse != null) && (operationsUUIDResponse.getStatusCode()) == 200) {
                        final BackgroundOperationResponse operationResponse = operationsApi.getOperationsUUID(operationUuid, null, null);
                        logger.info("Operations by UUID Response >>>>> {}", operationResponse);
                        Thread.sleep(2000);
                    }
                }
            }

        } catch (ApiException | InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void createUbuntuContainer(){

        try {

            Kvm kvm = new Kvm();
            kvm.setPath("/dev/kvm");
            kvm.setType("unix-char");

            DevicesKvm devices = new DevicesKvm();
            devices.setKvm(kvm);

            InstanceConfigBuilder instanceConfigBuilder = new InstanceConfigBuilder();
            instanceConfigBuilder.setLimitsCpu("3");
            instanceConfigBuilder.setBootAutoStart(true);

//            CreateInstancesRequestConfig createInstancesRequestConfig = new CreateInstancesRequestConfig();
//            createInstancesRequestConfig.setCreateInstancesRequestConfig(instanceConfigBuilder.asMap());

            List<String> profiles = new ArrayList<>();
            profiles.add("default");

//            Source source = new Source();
//            source.setType("image");
//            source.setProtocol("simplestreams");
//            source.setServer("https://cloud-images.ubuntu.com/releases");
//            source.setAlias("18.04");

            final CreateInstancesRequest createInstancesRequest = InstancesApiTest.populateCreateInstancesRequest(devices, null, "container", profiles, "x86_64", "ubuntu18_1", null, true);

            logger.info("REQUEST >>>>>>>>>> {}", createInstancesRequest);

            BackgroundOperationResponse backgroundOperationResponse = instancesApi.postInstances(null, createInstancesRequest);

            logger.info("Create Instance Response >>>>> {}", backgroundOperationResponse);

            if (backgroundOperationResponse != null) {
                final String operation = backgroundOperationResponse.getOperation();
                String[] splitOperationUrl = operation.split("/");
                logger.info("Operation Fingerprint >>>>> {}", splitOperationUrl[3]);
                String operationUuid = splitOperationUrl[3];

                final BackgroundOperationResponse operationsUUIDResponse = operationsApi.getOperationsUUID(operationUuid, 0, null);

                while ((operationsUUIDResponse != null) && (operationsUUIDResponse.getStatusCode()) == 200) {
                    final BackgroundOperationResponse operationResponse = operationsApi.getOperationsUUID(operationUuid, null, null);
                    logger.info("Operations by UUID Response >>>>> {}", operationsUUIDResponse);
                    Thread.sleep(2000);
                }
            } else {
                throw new RuntimeException("The request returned a null response!");
            }
        }catch (ApiException ex){
            ex.printStackTrace();
        }catch (InterruptedException ex){
            ex.getCause();
        }
    }

    @Test
    public void manageContainer(){
        String containerName = "ubuntu18";
        String action = "start";

        try {
            final BackgroundOperationResponse backgroundOperationResponse = instancesApiTest.putInstancesByNameState(containerName, action);

            if (backgroundOperationResponse != null) {
                final String operation = backgroundOperationResponse.getOperation();
                String[] splitOperationUrl = operation.split("/");
                logger.info("Operation Fingerprint >>>>> {}", splitOperationUrl[3]);
                String operationUuid = splitOperationUrl[3];

                final BackgroundOperationResponse operationsUUIDResponse = operationsApi.getOperationsUUID(operationUuid, 0, null);

                while ((operationsUUIDResponse != null) && (operationsUUIDResponse.getStatusCode()) == 200) {
                    final BackgroundOperationResponse operationResponse = operationsApi.getOperationsUUID(operationUuid, null, null);
                    logger.info("Operations by UUID Response >>>>> {}", operationsUUIDResponse);
                    Thread.sleep(2000);
                }
            }
        }catch (ApiException | InterruptedException ex){
            ex.printStackTrace();
        }
    }

    @Test
    public void viewContainerState(){

        try {

            final String ubuntu18 = "ubuntu18";

            final BackgroundOperationResponse instancesByNameState = instancesApi.getInstancesByNameState(ubuntu18, 0, null);
            logger.info("Instance State >>> {}", instancesByNameState);

        }catch (ApiException ex){
            ex.printStackTrace();
        }
    }

    @Test
    public void installRabbitMQInContainer(){

        try{

        final CreateInstancesByNameExecRequest request = instancesApiTest.populatePostInstancesByNameExecRequest(Arrays.asList("sudo","apt","install", "rabbitmq-server"),new Environment(),true,false,true,80,25);

            BackgroundOperationResponse backgroundOperationResponse = instancesApi.postInstancesByNameExec("ubuntu18", request);

            logger.info("POST INSTANCES BY NAME EXEC RESPONSE >>>>> " + backgroundOperationResponse);
            assertEquals(backgroundOperationResponse.getStatusCode(),Integer.valueOf(100));

        if (backgroundOperationResponse != null) {
            final String operation = backgroundOperationResponse.getOperation();
            String[] splitOperationUrl = operation.split("/");
            logger.info("Operation Fingerprint >>>>> {}", splitOperationUrl[3]);
            String operationUuid = splitOperationUrl[3];

            logger.info("\n\n\n METADATA >>>>>> {}", backgroundOperationResponse.getMetadata());

//            InstanceByNameResponseMetadata responseMetadata = (InstanceByNameResponseMetadata) serialiseAndDeserialiseObject(backgroundOperationResponse.getMetadata(), InstanceByNameResponseMetadata.class);
//
//            logger.info("\n\n\n CREATE INSTANCE METADATA >>>>>> {}", responseMetadata);
//
//            final Metadata4 operationMetadata = responseMetadata.getMetadata4();
            String secret = null;

//            if (operationMetadata != null) {
//                 secret = operationMetadata.getFds().get0();
//                 logger.info("\n\n\n SECRET >>>>> {}", secret);
//            }

            final BackgroundOperationResponse operationsUUIDResponse = operationsApi.getOperationsUUID(operationUuid, 0,null);

            while ((operationsUUIDResponse != null) && (operationsUUIDResponse.getStatusCode()) == 200) {
                final BackgroundOperationResponse operationResponse = operationsApi.getOperationsUUID(operationUuid, null, null);
                logger.info("Operations by UUID Response >>>>> {}", operationsUUIDResponse);
                Thread.sleep(2000);
            }
        }
    }catch (ApiException | InterruptedException ex){
        ex.printStackTrace();
        logger.info("ERROR >>>> {}", ex);
    }
    }

    private <T> T serialiseAndDeserialiseObject(T objectToSerialise, Type type) {
        JSON json = new JSON();
        String serializedString = json.serialize(objectToSerialise);
        return json.deserialize(serializedString, type);
    }

}
