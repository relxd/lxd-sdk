
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

package org.relxd.lxd.client.api.trusted.filteringandrecursion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.JsonSyntaxException;
import org.junit.jupiter.api.*;
import org.relxd.lxd.CompleteableFutureTestWrapper;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.JSON;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.client.api.ImagesApi;
import org.relxd.lxd.client.api.OperationsApi;
import org.relxd.lxd.client.model.*;
import org.relxd.lxd.service.LinuxCmdService;
import org.relxd.lxd.service.LinuxCmdServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.spy;

/**
 * API tests for ImagesApi
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ImagesApiTest implements CompleteableFutureTestWrapper {

    private ImagesApi api;
    private OperationsApi operationsApi;
    private Logger logger;
    private LinuxCmdService linuxCmdService;
    private List<String> getImageResponseUrls;
    private List<String> getImageAliasesResponseUrls;
    private GetImagesAliasesByNameResponse imagesAliasesByNameResponse;
    private String unixSocketPath;

    @BeforeAll
    public void setup() {
        final RelxdApiClient relxdApiClient = new RelxdApiClient();
        linuxCmdService = spy(new LinuxCmdServiceImpl());
        api = relxdApiClient.services().getImagesApi();
        operationsApi = relxdApiClient.services().getOperationsApi();
        logger = LoggerFactory.getLogger(InstancesApiTest.class);
        unixSocketPath  = relxdApiClient.getApplicationProperties().getProperty("unix.socket.base.path");
    }

    /**
     *
     *
     * Remove an alias
     *
     */

    @Test
    @Order(16)
    public void deleteImagesAliasesByNameTest() throws JsonProcessingException {
        getImagesAliasesByNameTest();
        String name = "";
        if (imagesAliasesByNameResponse != null)
            name = imagesAliasesByNameResponse.getName();


        try {
            BackgroundOperationResponse response = $(api.deleteImagesAliasesByName(name));
            logger.info("DELETE IMAGES ALIASES BY NAME RESPONSE >>>>>  {}", response);

        }catch (ApiException ex){
            catchApiException(ex);
        }

    }

    /**
     *
     *
     * Remove an image
     *
     */
    @Test
    @Order(17)
    public void deleteImagesFingerprintTest() throws JsonProcessingException {
        getImagesTest();
        String[] splitUrl;
        String fingerprint = null;

        if (getImageResponseUrls != null) {

            for (String imageUrl: getImageResponseUrls) {
                splitUrl = imageUrl.split("/");
                logger.info("Image Fingerprint >>>>> {}", splitUrl[3]);
                fingerprint = splitUrl[3];


                try {
                    BackgroundOperationResponse response = $(api.deleteImagesFingerprint(fingerprint));
                    logger.info("DELETE IMAGES BY FINGERPRINT RESPONSE >>>> {}", response);
                } catch (ApiException ex) {
                    catchApiException(ex);
                }

            }
        }

    }
    
    /**
     * 
     *
     * List of images (public or private)
     *
     */
    @Test
    @Order(2)
    public void getImagesTest() throws JsonProcessingException {

        Integer recursion = 1;
        String filter = "properties.os eq ubuntu";
        final String getImagesCommand = "curl -s --unix-socket " + unixSocketPath + " a/1.0/images?filter=properties.os eq ubuntu";

        try {
            final BackgroundOperationResponse expectedGetImagesResponse;
            try {
                expectedGetImagesResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(getImagesCommand, BackgroundOperationResponse.class);
                logger.info("Expected Get Images Response >>>>>>>>>> " + expectedGetImagesResponse);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }

            BackgroundOperationResponse actualGetImagesResponse = $(api.getImages(recursion, filter));
            logger.info("Actual Get Images Response >>>>> {}", actualGetImagesResponse);

            if (actualGetImagesResponse != null) {
                final BackgroundOperationResponse images = $(api.getImages(0, null));
                getImageResponseUrls = (List<String>) images.getMetadata();

                if (getImageResponseUrls.size() > 0)
                    logger.info("Metadata >>>>>>> {}", getImageResponseUrls.get(0));

                assertEquals(Integer.valueOf(200), actualGetImagesResponse.getStatusCode());

            }

        }
        catch (ApiException ex){
            catchApiException(ex);
        }
    }
    
    /**
     * 
     *
     * List of aliases (public or private based on image visibility)
     *
     */
    @Test
    @Order(4)
    public void getImagesAliasesTest() throws JsonProcessingException {
        final String getImageAliasesCommand = "curl -s --unix-socket " + unixSocketPath + " a/1.0/images/aliases?recursion=1&filter=name eq my-first-alias";

        Integer recursion = 1;
        String filter = "name eq my-first-alias";

        try {
            final BackgroundOperationResponse expectedGetImageAliasesResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(getImageAliasesCommand, BackgroundOperationResponse.class);
            logger.info("Expected Get Image Aliases Response >>>>>>>>>> " + expectedGetImageAliasesResponse);
            BackgroundOperationResponse actualGetImageAliasesResponse = $(api.getImagesAliases(recursion, filter));
            logger.info("Actual Get Image Aliases Response >>>>>> {}", actualGetImageAliasesResponse);

            if (actualGetImageAliasesResponse != null) {
                final BackgroundOperationResponse imagesAliases = $(api.getImagesAliases(0, null));
                getImageAliasesResponseUrls = (List<String>) imagesAliases.getMetadata();

                logger.info("Metadata >>>>>>> {}", getImageAliasesResponseUrls);
                 }

                assertEquals(Integer.valueOf(200), actualGetImageAliasesResponse.getStatusCode());

        }catch(IOException | InterruptedException ex){
            ex.printStackTrace();
        }catch(ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Alias description and target
     *
     */
    @Test
    @Order(5)
    public void getImagesAliasesByNameTest() throws JsonProcessingException {
        getImagesAliasesTest();
        String[] splitUrl = null;
        String name = null;

        if (getImageAliasesResponseUrls != null) {

            if (getImageAliasesResponseUrls.size()>0) {
                splitUrl = getImageAliasesResponseUrls.get(0).split("/");
                logger.info("Image Aliase Name >>>>> {}", splitUrl[4]);
                name = splitUrl[4];
            }
        }
        final String getImageAliasesCommand = "curl -s --unix-socket " + unixSocketPath + " a/1.0/images/aliases/" + name;

        Integer recursion = 1;
        String filter = "description eq This is my alias";

        try {
            final BackgroundOperationResponse expectedGetImageAliasesByNameResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(getImageAliasesCommand, BackgroundOperationResponse.class);
            logger.info("Expected Get Image Aliases By Name Response >>>>>>>>>> " + expectedGetImageAliasesByNameResponse);

            BackgroundOperationResponse actualGetImageAliasesByNameResponse = $(api.getImagesAliasesByName(name, recursion, filter));
            logger.info("Actual Get Images Aliases By Name >>>>>> {}", actualGetImageAliasesByNameResponse);

            if (actualGetImageAliasesByNameResponse != null){

                imagesAliasesByNameResponse = (GetImagesAliasesByNameResponse)serialiseAndDeserialiseObject(actualGetImageAliasesByNameResponse.getMetadata(), GetImagesAliasesByNameResponse.class);

                logger.info("My Metadata >>>>>>> {}", imagesAliasesByNameResponse);
            }

            assertEquals(actualGetImageAliasesByNameResponse,expectedGetImageAliasesByNameResponse);

        }catch (IOException | InterruptedException ex){

        } catch (ApiException ex){
            catchApiException(ex);
        }

    }

    /**
     * 
     *
     * Download the image tarball
     *
     */
    @Test
    @Order(11)
    public void getImagesByFingerprintExportTest() throws JsonProcessingException {
        getImagesTest();
        String[] splitUrl = null;
        String fingerprint = null;

        if ((getImageResponseUrls != null) && getImageResponseUrls.size() >0) {
            splitUrl = getImageResponseUrls.get(0).split("/");
            logger.info("Image Fingerprint >>>>> {}", splitUrl[3]);
            fingerprint = splitUrl[3];
        }
        Integer recursion = 1;
        String filter = null;
        String secret = null;

        try {
            BackgroundOperationResponse response = $(api.getImagesByFingerprintExport(fingerprint, recursion, filter, secret));
            logger.info("Get Images By FingerPrint Export Response >>>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }
    }
    
    /**
     * 
     *
     * Image description and metadata
     *
     */
    @Test
    @Order(12)
    public void getImagesFingerprintTest() throws JsonProcessingException {

        getImagesTest();
        String[] splitUrl = null;
        String fingerprint = null;

        if ((getImageResponseUrls != null) && getImageResponseUrls.size() >0) {
            splitUrl = getImageResponseUrls.get(0).split("/");
            logger.info("Image Fingerprint >>>>> {}", splitUrl[3]);
            fingerprint = splitUrl[3];
        }

        Integer recursion = 1;
        String filter = "properties.os eq ubuntu";
        String secret = null;

        try {
            BackgroundOperationResponse response = $(api.getImagesFingerprint(fingerprint, recursion, filter, secret));
            logger.info("Get Images Fingerprint Response >>>>> {}", response);
            assertEquals(response.getStatusCode(),Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Refresh an image from its origin
     *
     */
    @Test
    @Order(13)
    public void getImagesFingerprintRefreshTest() throws JsonProcessingException {
        getImagesTest();
        String[] splitUrl;
        String fingerprint = null;

        if ((getImageResponseUrls != null) && getImageResponseUrls.size() >0) {
            splitUrl = getImageResponseUrls.get(0).split("/");
            logger.info("Image Fingerprint >>>>> {}", splitUrl[3]);
            fingerprint = splitUrl[3];
        }
        Integer recursion = 1;
        String filter = "properties.os eq ubuntu";
        try {
            BackgroundOperationResponse response = $(api.getImagesFingerprintRefresh(fingerprint, recursion, filter));
            logger.info("Get Images Fingerprint Refresh Response >>>>> {}", response);
            assertEquals(response.getStatusCode(),Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }
    }
    
    /**
     * 
     *
     * Create and publish a new image
     *
     */
    @Test
    @Order(1)
    public void postImagesTest() throws JsonProcessingException {

        String xLXDFingerprint = null;
        String xLXDFilename = null;
        Boolean xLXDPublic = null;
        String xLXDProperties = null;

        Source10 source10 = new Source10();
        source10.setType("image");
        source10.setMode("pull");
        source10.setProtocol("simplestreams");
        source10.setServer("https://cloud-images.ubuntu.com/releases");
        source10.setAlias("20.04");

        Properties3 properties3 = new Properties3();
        properties3.setOs("ubuntu");

        CreateImagesRequest request = new CreateImagesRequest();
        request.setFilename("ubuntu20.4");
        request.setSource(source10);
        request.setProperties(properties3);
        //request.setCompressionAlgorithm("");
        request.setAutoUpdate(true);


        try {
            BackgroundOperationResponse response = $(api.postImages(xLXDFingerprint, xLXDFilename, xLXDPublic, xLXDProperties, request));
            logger.info("POST IMAGES RESPONSE >>>>> {}", response);

            if (response.getStatusCode() == Integer.valueOf(100)){
                final String operationUrl = response.getOperation();
                final String[] splitUrl = operationUrl.split("/");
                logger.info("Image Fingerprint >>>>> {}", splitUrl[3]);
                final String uuid = splitUrl[3];

                final BackgroundOperationResponse operationsUUIDResponse = $(operationsApi.getOperationsUUID(uuid, null, null));

                while ((operationsUUIDResponse != null) && (operationsUUIDResponse.getStatusCode()) == 200) {
                    final BackgroundOperationResponse operationResponse = $(operationsApi.getOperationsUUID(uuid, null, null));
                    logger.info("Operations by UUID Response >>>>> {}", operationResponse);
                    Thread.sleep(5000);
                }

            }


            assertEquals(response.getStatusCode(), Integer.valueOf(100));

        }catch (ApiException ex){
            catchApiException(ex);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    
    /**
     * 
     *
     * Create a new alias
     *
     */
    @Test
    @Order(3)
    public void postImagesAliasesTest() throws JsonProcessingException {

        getImagesTest();
        String[] splitUrl;
        String fingerprint = null;

        if ((getImageResponseUrls != null) && getImageResponseUrls.size() >0) {
            splitUrl = getImageResponseUrls.get(0).split("/");
            logger.info("Image Fingerprint >>>>> {}", splitUrl[3]);
            fingerprint = splitUrl[3];
        }

        CreateImagesAliasesRequest request = new CreateImagesAliasesRequest();
        request.setName("my-first-alias");
        request.setDescription("This is my alias");
        request.setTarget(fingerprint);

        try {
            BackgroundOperationResponse response = $(api.postImagesAliases(request));
            logger.info("POST ALIASES RESPONSE >>>>> {}", response);

            assertEquals(response.getStatusCode(), Integer.valueOf(200));

        }catch (ApiException ex){
            catchApiException(ex);
        }
    }
    
    /**
     * 
     *
     * Rename an alias
     *
     */
    @Test
    @Order(6)
    public void postImagesAliasesByNameTest() throws JsonProcessingException {
        getImagesAliasesByNameTest();

        String name = null;
        if (imagesAliasesByNameResponse != null)
        name = imagesAliasesByNameResponse.getName();

        CreateImagesAliasesByNameRequest request = new CreateImagesAliasesByNameRequest();
        request.setName("new-alias-name");

        try {
            BackgroundOperationResponse response = $(api.postImagesAliasesByName(name, request));
            logger.info("POST IMAGE ALIASES BY NAME RESPONSE >>>>> {}", response);

            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Upload the image tarball
     *
     */
    @Test
    @Order(7)
    public void postImagesFingerprintExportTest() throws JsonProcessingException {
        List<String> aliases = new ArrayList<>();
        aliases.add("new-alias-name");

        getImagesTest();
        String[] splitUrl;
        String fingerprint = null;

        if ((getImageResponseUrls != null) && getImageResponseUrls.size() >0) {
            splitUrl = getImageResponseUrls.get(0).split("/");
            logger.info("Image Fingerprint >>>>> {}", splitUrl[3]);
            fingerprint = splitUrl[3];
        }

        CreateImagesFingerprintExportRequest request = new CreateImagesFingerprintExportRequest();
        //request.setTarget(filter) );
        request.setAliases(aliases);

        try {
            BackgroundOperationResponse response = $(api.postImagesFingerprintExport(fingerprint, request));
            logger.info("Response >>>>> {}", response);
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Generate a random token and tell LXD to expect it be used by a guest
     *
     */
    @Test
    @Order(8)
    public void postImagesFingerprintSecretTest() throws JsonProcessingException {
        getImagesTest();
        String[] splitUrl;
        String fingerprint = null;

        if ((getImageResponseUrls != null) && getImageResponseUrls.size() >0) {
            splitUrl = getImageResponseUrls.get(0).split("/");
            logger.info("Image Fingerprint >>>>> {}", splitUrl[3]);
            fingerprint = splitUrl[3];
        }

        Object request = new Object();

        try {
            BackgroundOperationResponse response = $(api.postImagesFingerprintSecret(fingerprint, request));
            logger.info("POST FINGER PRINT SECRET >>>>> {}", response);

            assertEquals(response.getStatusCode(), Integer.valueOf(100));

        }catch (ApiException ex){
            catchApiException(ex);
        }

    }


    private <T> T serialiseAndDeserialiseObject(Object objectToSerialise, Class<T> type) throws JsonProcessingException {
        JSON json = new JSON();
        String serializedString = json.getMapper().writeValueAsString(objectToSerialise);
        return json.getMapper().readValue(serializedString, type);
    }

    private ErrorResponse catchApiException(ApiException e) throws JsonProcessingException {
        JSON json = new JSON();
        ErrorResponse errorResponse = new ErrorResponse();
        logger.info("EXCEPTION >>>> " + e);
        try {
            errorResponse = json.getMapper().readValue(e.getResponseBody(), ErrorResponse.class);
            logger.info("ERROR RESPONSE >>>> " + errorResponse);
        }catch (JsonSyntaxException ex){
            logger.info("JSON SYNTAX EXCEPTION >>>>>> {}", ex);
        }
        return errorResponse;
    }
}
