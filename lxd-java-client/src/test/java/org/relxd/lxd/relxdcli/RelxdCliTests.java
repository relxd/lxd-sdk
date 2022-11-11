/*
 *
 * MIT License
 *
 * Copyright (c) 2020 ReLxd
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.relxd.lxd.relxdcli;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.JsonSyntaxException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.relxd.lxd.CompleteableFutureTestWrapper;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.JSON;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.client.api.ImagesApi;
import org.relxd.lxd.client.api.InstancesApi;
import org.relxd.lxd.client.api.OperationsApi;
import org.relxd.lxd.client.api.trusted.InstancesApiTest;
import org.relxd.lxd.builders.InstanceConfigBuilder;
import org.relxd.lxd.builders.SourceConfigBuilder;
import org.relxd.lxd.client.model.*;
import org.relxd.lxd.model.InstanceByNameResponseMetadata;
import org.relxd.lxd.model.OperationUUidAndSocketSecret;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RelxdCliTests implements CompleteableFutureTestWrapper {

    private RelxdApiClient relxdApiClient;
    private ImagesApi imagesApi;
    private InstancesApiTest instancesApiTest;
    private OperationsApi operationsApi;
    private InstancesApi instancesApi;

    private List<String> getImageResponseUrls;
    private Logger logger;

    @BeforeAll
    public void init(){
        logger = LoggerFactory.getLogger(InstancesApiTest.class);

        this.relxdApiClient = new RelxdApiClient();

        imagesApi = relxdApiClient.services().getImagesApi();
        operationsApi = relxdApiClient.services().getOperationsApi();
        instancesApi = relxdApiClient.services().getInstancesApi();
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
            final String nameOfContainer = "another-ubuntu-instance";

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
            final BackgroundOperationResponse images = $(imagesApi.getImages(0, null));
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
                SourceConfigBuilder sourceConfigBuilder = new SourceConfigBuilder();
                sourceConfigBuilder.setType("image");
                sourceConfigBuilder.setFingerprint(fingerprint);

                //Populate the CreateInstancesRequest and get a Response
                CreateInstancesRequest createInstancesRequest = InstancesApiTest.populateCreateInstancesRequest(devices, sourceConfigBuilder.asMap(), type, profiles, architecture, nameOfContainer, configBuilder.asMap(),false);

                final BackgroundOperationResponse backgroundOperationResponse = $(instancesApi.postInstances(target, createInstancesRequest));

                logger.info("Create Instance Response >>>>> {}", backgroundOperationResponse);

                //Get the background operation url from the response we got from creating an instance
                if (backgroundOperationResponse != null){
                    final String operation = backgroundOperationResponse.getOperation();
                    String[] splitOperationUrl = operation.split("/");
                    logger.info("Operation Fingerprint >>>>> {}", splitOperationUrl[3]);

                    //Get the operation UUID from the operation url
                    String operationUuid = splitOperationUrl[3];

                    //Use the operation UUID to get the operation
                    final BackgroundOperationResponse operationsUUIDResponse = $(operationsApi.getOperationsUUID(operationUuid, 0, null));

                    //Keep running the get Operation query every 2 seconds until the instance creation process is complete
                    while ((operationsUUIDResponse != null) && (operationsUUIDResponse.getStatusCode()) == 200) {
                        final BackgroundOperationResponse operationResponse = $(operationsApi.getOperationsUUID(operationUuid, null, null));
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

            List<String> profiles = new ArrayList<>();
            profiles.add("default");

            SourceConfigBuilder sourceConfigBuilder = new SourceConfigBuilder();
            sourceConfigBuilder.setType("image");
            sourceConfigBuilder.setProtocol("simplestreams");
            sourceConfigBuilder.setServer("https://cloud-images.ubuntu.com/releases");
            sourceConfigBuilder.setAlias("18.04");

            final CreateInstancesRequest createInstancesRequest = InstancesApiTest.populateCreateInstancesRequest(devices, sourceConfigBuilder.asMap(), "container", profiles, "x86_64", "ubuntu18", instanceConfigBuilder.asMap(), false);

            logger.info("REQUEST >>>>>>>>>> {}", createInstancesRequest);

            BackgroundOperationResponse backgroundOperationResponse = $(instancesApi.postInstances(null, createInstancesRequest));

            logger.info("Create Instance Response >>>>> {}", backgroundOperationResponse);

            if (backgroundOperationResponse != null) {
                final String operation = backgroundOperationResponse.getOperation();
                String[] splitOperationUrl = operation.split("/");
                logger.info("Operation Fingerprint >>>>> {}", splitOperationUrl[3]);
                String operationUuid = splitOperationUrl[3];

                final BackgroundOperationResponse operationsUUIDResponse = $(operationsApi.getOperationsUUID(operationUuid, 0, null));

                while ((operationsUUIDResponse != null) && (operationsUUIDResponse.getStatusCode()) == 200) {
                    final BackgroundOperationResponse operationResponse = $(operationsApi.getOperationsUUID(operationUuid, null, null));
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
    public void startContainer(){
        String containerName = "another-ubuntu-instance";
        String action = "start";
        boolean force = false;
        BigDecimal timeout = new BigDecimal(100);
        boolean stateful = false;

        manageContainer(containerName,action,force,timeout,stateful);
    }

    @Test
    public void stopContainer(){
        String containerName = "another-ubuntu-instance";
        String action = "stop";
        boolean force = false;
        BigDecimal timeout = new BigDecimal(100);
        boolean stateful = false;

        manageContainer(containerName,action,force,timeout,stateful);
    }

    @Test
    public void restartContainer(){
        String containerName = "another-ubuntu-instance";
        String action = "restart";
        boolean force = false;
        BigDecimal timeout = new BigDecimal(100);
        boolean stateful = false;

        manageContainer(containerName,action,force,timeout,stateful);
    }

    @Test
    public void freezeContainer(){
        String containerName = "another-ubuntu-instance";
        String action = "freeze";
        boolean force = false;
        BigDecimal timeout = new BigDecimal(100);
        boolean stateful = false;

        manageContainer(containerName,action,force,timeout,stateful);
    }

    @Test
    public void unfreezeContainer(){
        String containerName = "another-ubuntu-instance";
        String action = "unfreeze";
        boolean force = false;
        BigDecimal timeout = new BigDecimal(100);
        boolean stateful = false;

        manageContainer(containerName,action,force,timeout,stateful);
    }

    @Test
    public void deleteContainer(){
        String containerName = "another-ubuntu-instance";

        try {
            BackgroundOperationResponse response = $(instancesApi.deleteInstancesByName(containerName));
            logger.info("DELETE INSTANCE BY NAME RESPONSE >>>>>> {}", response);

        }catch (ApiException ex){
            catchApiException(ex);
        }

    }


    @Test
    public void viewContainerState(){

        try {

            final String ubuntu18 = "another-ubuntu-instance";

            final BackgroundOperationResponse instancesByNameState = $(instancesApi.getInstancesByNameState(ubuntu18, 0, null));
            logger.info("Instance State >>> {}", instancesByNameState);

        }catch (ApiException ex){
            catchApiException(ex);
        }
    }

    @Test
    public void runExecCommandToOpenContainerSocketConnection() throws JsonProcessingException {

        final String containerName = "c1";

        try{

            final Environment environment = new Environment();
            final CreateInstancesByNameExecRequest request = InstancesApiTest.populatePostInstancesByNameExecRequest(Arrays.asList("/bin/bash"), environment,true,false,true,80,25);

            final OperationUUidAndSocketSecret operationUUidAndSocketSecret = postInstancesByNameExecAndReturnOperationUUidAndSocketSecret(containerName, request);

            if (operationUUidAndSocketSecret != null)
            logger.info("\n\nOperationUUid::{}\nSocketSecret::{}", operationUUidAndSocketSecret.getOperationUuid(), operationUUidAndSocketSecret.getSocketSecret());

        }catch (ApiException ex){
            catchApiException(ex);
        }
    }

    private OperationUUidAndSocketSecret postInstancesByNameExecAndReturnOperationUUidAndSocketSecret(String containerName, CreateInstancesByNameExecRequest request) throws ApiException, JsonProcessingException {

        BackgroundOperationResponse backgroundOperationResponse = $( instancesApi.postInstancesByNameExec(containerName, request) );

        logger.info("POST INSTANCES BY NAME EXEC RESPONSE >>>>> " + backgroundOperationResponse);
        assertEquals(backgroundOperationResponse.getStatusCode(),Integer.valueOf(100));

        if (backgroundOperationResponse != null) {
            final String operation = backgroundOperationResponse.getOperation();
            String[] splitOperationUrl = operation.split("/");
            logger.info("Operation Fingerprint >>>>> {}", splitOperationUrl[3]);
            String operationUuid = splitOperationUrl[3];

            logger.info("\n\n\n METADATA >>>>>> {}", backgroundOperationResponse.getMetadata());

            InstanceByNameResponseMetadata responseMetadata = (InstanceByNameResponseMetadata) serialiseAndDeserialiseObject(backgroundOperationResponse.getMetadata(), InstanceByNameResponseMetadata.class);

            logger.info("\n\n\n CREATE INSTANCE METADATA >>>>>> {}", responseMetadata);

            operationUuid =  responseMetadata.getId();

            var operationMetadata = responseMetadata.getMetadata3();
            String secret = null;

            if (operationMetadata != null) {
                 secret = operationMetadata.getSecret();
                 logger.info("\n\n\n SECRET >>>>> {}", secret);
            }

            OperationUUidAndSocketSecret operationUUidAndSocketSecret = new OperationUUidAndSocketSecret();
            operationUUidAndSocketSecret.setOperationUuid(operationUuid);
            operationUUidAndSocketSecret.setSocketSecret(secret);


            /*final BackgroundOperationResponse operationsUUIDResponse = operationsApi.getOperationsUUID(operationUuid, 0, null);

            while ((operationsUUIDResponse != null) && (operationsUUIDResponse.getStatusCode()) == 200) {
                final BackgroundOperationResponse operationResponse = operationsApi.getOperationsUUID(operationUuid, null, null);
                logger.info("Operations by UUID Response >>>>> {}", operationsUUIDResponse);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }*/


            return operationUUidAndSocketSecret;

        }else {
            throw new RuntimeException("The postInstancesByNameExec request returned a null response");
        }
    }

    private void manageContainer(String constainerName, String action, boolean force, BigDecimal timeout, boolean stateful) {

        try {
            final UpdateInstancesByNameStateRequest request = InstancesApiTest.populatePutInstancesByNameState(action,force,timeout,stateful);

            BackgroundOperationResponse backgroundOperationResponse = $(instancesApi.putInstancesByNameState(constainerName, request));

            logger.info("PUT INSTANCES BY NAME STATE RESPONSE >>>>> " + backgroundOperationResponse);

            if (backgroundOperationResponse != null) {
                final String operation = backgroundOperationResponse.getOperation();
                String[] splitOperationUrl = operation.split("/");
                logger.info("Operation Fingerprint >>>>> {}", splitOperationUrl[3]);
                String operationUuid = splitOperationUrl[3];

                final BackgroundOperationResponse operationsUUIDResponse = $(operationsApi.getOperationsUUID(operationUuid, 0, null));

                while ((operationsUUIDResponse != null) && (operationsUUIDResponse.getStatusCode()) == 200) {
                    final BackgroundOperationResponse operationResponse = $(operationsApi.getOperationsUUID(operationUuid, null, null));
                    logger.info("Operations by UUID Response >>>>> {}", operationsUUIDResponse);
                    Thread.sleep(2000);
                }
            }
        }catch (ApiException | InterruptedException ex){
            ex.printStackTrace();
        }
    }

    private <T> T serialiseAndDeserialiseObject(Object objectToSerialise, Class<T> type) throws JsonProcessingException {
        JSON json = new JSON();
        String serializedString = json.getMapper().writeValueAsString(objectToSerialise);
        return json.getMapper().readValue(serializedString, type);
    }

    private ErrorResponse catchApiException(ApiException e) {
        logger.info("Exception >>>> " + e);
        JSON json = new JSON();
        ErrorResponse errorResponse = new ErrorResponse();
        try {
            errorResponse = json.getMapper().readValue(e.getResponseBody(), ErrorResponse.class);
            logger.info("ERROR RESPONSE >>>> " + errorResponse);
        }catch (JsonSyntaxException | JsonProcessingException ex){

        }
        return errorResponse;
    }

}
