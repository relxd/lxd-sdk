package org.relxd.lxd.api.competitionlabscli;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.JSON;
import org.relxd.lxd.api.ImagesApi;
import org.relxd.lxd.api.InstancesApi;
import org.relxd.lxd.api.OperationsApi;
import org.relxd.lxd.api.trusted.InstancesApiTest;
import org.relxd.lxd.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompetitionLabsCliTests {

    private ImagesApi imagesApi;
    private InstancesApiTest instancesApiTest;
    private OperationsApi operationsApi;
    private InstancesApi instancesApi;

    private List<String> getImageResponseUrls;
    private Logger logger;

    @BeforeAll
    public void init(){
        imagesApi = new ImagesApi();
        instancesApiTest =  new InstancesApiTest();
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

            //Instance Kvm
            Kvm kvm = new Kvm();
            kvm.setPath("/dev/kvm");
            kvm.setType("unix-char");

            //Instance Devices
            DevicesKvm devices = new DevicesKvm();
            devices.setKvm(kvm);

            //Instance Config
            CreateInstancesRequestConfig createInstancesRequestConfig = new CreateInstancesRequestConfig();
            createInstancesRequestConfig.setLimitsCpu("2");

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

                //Source for the Instance we want to create
                Source source = new Source();
                source.setType("image");
                source.setFingerprint(fingerprint);

                //Populate the CreateInstancesRequest and get a Response
                CreateInstancesRequest createInstancesRequest = instancesApiTest.populateCreateInstancesRequest(devices, source, type, profiles, architecture, nameOfContainer, createInstancesRequestConfig,true);

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

            final BackgroundOperationResponse backgroundOperationResponse = instancesApiTest.postUbuntuInstance("ubuntu18");

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
            }
        }catch (ApiException | InterruptedException ex){
            ex.printStackTrace();
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

        final BackgroundOperationResponse backgroundOperationResponse = instancesApiTest.postInstancesByNameExec("ubuntu18", Arrays.asList("sudo","apt","install", "rabbitmq-server"));

        if (backgroundOperationResponse != null) {
            final String operation = backgroundOperationResponse.getOperation();
            String[] splitOperationUrl = operation.split("/");
            logger.info("Operation Fingerprint >>>>> {}", splitOperationUrl[3]);
            String operationUuid = splitOperationUrl[3];

            logger.info("\n\n\n METADATA >>>>>> {}", backgroundOperationResponse.getMetadata());

            InstanceByNameResponseMetadata responseMetadata = (InstanceByNameResponseMetadata) serialiseAndDeserialiseObject(backgroundOperationResponse.getMetadata(), InstanceByNameResponseMetadata.class);

            logger.info("\n\n\n CREATE INSTANCE METADATA >>>>>> {}", responseMetadata);

            final Metadata4 operationMetadata = responseMetadata.getMetadata4();
            String secret = null;

            if (operationMetadata != null) {
                 secret = operationMetadata.getFds().get0();
                 logger.info("\n\n\n SECRET >>>>> {}", secret);
            }

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
