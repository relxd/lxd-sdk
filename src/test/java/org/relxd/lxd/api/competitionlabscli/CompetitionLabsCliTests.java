package org.relxd.lxd.api.competitionlabscli;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.api.ImagesApi;
import org.relxd.lxd.api.InstancesApi;
import org.relxd.lxd.api.OperationsApi;
import org.relxd.lxd.api.trusted.*;
import org.relxd.lxd.model.BackgroundOperationResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class CompetitionLabsCliTests {

    private ImagesApiTest imagesApiTest;
    private ImagesApi imagesApi;
    private InstancesApiTest instancesApiTest;
    private ServerConfigApiTest serverConfigApiTest;
    private ClusterApiTest clusterApiTest;
    private OperationsApi operationsApi;
    private StoragePoolsApiTest storagePoolsApiTest;
    private InstancesApi instancesApi;

    private List<String> getImageResponseUrls;
    private Logger logger;

    @BeforeEach
    public void init(){
        imagesApiTest = new ImagesApiTest();
        imagesApi = new ImagesApi();
        instancesApiTest =  new InstancesApiTest();
        logger = LoggerFactory.getLogger(InstancesApiTest.class);
        serverConfigApiTest = new ServerConfigApiTest();
        clusterApiTest = new ClusterApiTest();
        operationsApi = new OperationsApi();
        storagePoolsApiTest = new StoragePoolsApiTest();
        instancesApi = new InstancesApi();
    }

    @Test
    public void createInstanceFromImage(){

        try {

        imagesApiTest.postImagesTest();

            final BackgroundOperationResponse images = imagesApi.getImages(0, null);
            if (images != null){
                getImageResponseUrls = (List<String>) images.getMetadata();
                if(getImageResponseUrls.size()>0)
                    logger.info("Metadata >>>>>>> {}", getImageResponseUrls.get(0));
            }

            String[] splitUrl;
            String fingerprint = null;

            if (getImageResponseUrls != null) {

                for (String imageUrl : getImageResponseUrls) {
                    splitUrl = imageUrl.split("/");
                    logger.info("Image Fingerprint >>>>> {}", splitUrl[3]);
                    fingerprint = splitUrl[3];
                }

                final BackgroundOperationResponse backgroundOperationResponse = instancesApiTest.postInstances(fingerprint);

                logger.info("Create Instance Response >>>>> {}", backgroundOperationResponse);

                if (backgroundOperationResponse != null){
                    final String operation = backgroundOperationResponse.getOperation();
                    String[] splitOperationUrl = operation.split("/");
                    logger.info("Operation Fingerprint >>>>> {}", splitOperationUrl[3]);
                    String operationUuid = splitOperationUrl[3];

                    final BackgroundOperationResponse operationsUUIDResponse = operationsApi.getOperationsUUID(operationUuid, 0, null);

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

        final BackgroundOperationResponse backgroundOperationResponse = instancesApiTest.postInstancesByNameExec("ubuntu18", Arrays.asList("bin","bash"));

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


}
