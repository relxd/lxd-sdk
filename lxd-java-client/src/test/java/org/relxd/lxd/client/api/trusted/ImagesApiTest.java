
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

package org.relxd.lxd.client.api.trusted;

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
        unixSocketPath  = relxdApiClient.getUnixSocketPath();
    }

    
    /**
     * 
     *
     * Remove an alias
     *
     */

    @Test
    @Order(16)
    public void deleteImagesAliasesByNameTest(){
        getImagesAliasesByNameTest();
        String name = "";
        if (imagesAliasesByNameResponse != null)
            name = imagesAliasesByNameResponse.getName();


        try {
            BackgroundOperationResponse response = $( api.deleteImagesAliasesByName(name) );
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
    public void deleteImagesFingerprintTest() {
        getImagesTest();
        String[] splitUrl;
        String fingerprint = null;

        if (getImageResponseUrls != null) {

            for (String imageUrl: getImageResponseUrls) {
                splitUrl = imageUrl.split("/");
                logger.info("Image Fingerprint >>>>> {}", splitUrl[3]);
                fingerprint = splitUrl[3];


                try {
                    BackgroundOperationResponse response = $( api.deleteImagesFingerprint(fingerprint) );
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
    public void getImagesTest() {

        final String getImagesCommand = "curl -s --unix-socket " + unixSocketPath + " a/1.0/images";

        Integer recursion = null;
        String filter = null;
        try {
            final BackgroundOperationResponse expectedGetImagesResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(getImagesCommand, BackgroundOperationResponse.class);
            logger.info("Expected Get Images Response >>>>>>>>>> " + expectedGetImagesResponse);
            BackgroundOperationResponse actualGetImagesResponse = $( api.getImages(recursion, filter) );
            logger.info("Actual Get Images Response >>>>> {}", actualGetImagesResponse);

            if (actualGetImagesResponse != null){
                getImageResponseUrls = (List<String>) actualGetImagesResponse.getMetadata();

                if(getImageResponseUrls.size()>0)
                logger.info("Metadata >>>>>>> {}", getImageResponseUrls.get(0));
                }

            assertEquals(actualGetImagesResponse,expectedGetImagesResponse);

        }catch (IOException | InterruptedException e){

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
    public void getImagesAliasesTest() {
        final String getImageAliasesCommand = "curl -s --unix-socket " + unixSocketPath + " a/1.0/images/aliases";

        Integer recursion = null;
        String filter = null;

        try {
            final BackgroundOperationResponse expectedGetImageAliasesResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(getImageAliasesCommand, BackgroundOperationResponse.class);
            logger.info("Expected Get Image Aliases Response >>>>>>>>>> " + expectedGetImageAliasesResponse);
            BackgroundOperationResponse actualGetImageAliasesResponse = $( api.getImagesAliases(recursion, filter) );
            logger.info("Actual Get Image Aliases Response >>>>>> {}", actualGetImageAliasesResponse);

            if (actualGetImageAliasesResponse != null){
                getImageAliasesResponseUrls = (List<String>) actualGetImageAliasesResponse.getMetadata();

                logger.info("Metadata >>>>>>> {}", getImageAliasesResponseUrls);
            }

            assertEquals(actualGetImageAliasesResponse, expectedGetImageAliasesResponse);

        }catch(IOException | InterruptedException ex){

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
    public void getImagesAliasesByNameTest() {
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

        Integer recursion = null;
        String filter = null;

        try {
            final BackgroundOperationResponse expectedGetImageAliasesByNameResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(getImageAliasesCommand, BackgroundOperationResponse.class);
            logger.info("Expected Get Image Aliases By Name Response >>>>>>>>>> " + expectedGetImageAliasesByNameResponse);

            BackgroundOperationResponse actualGetImageAliasesByNameResponse = $( api.getImagesAliasesByName(name, recursion, filter) );
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
    public void getImagesByFingerprintExportTest() {
        getImagesTest();
        String[] splitUrl = null;
        String fingerprint = null;

        if ((getImageResponseUrls != null) && getImageResponseUrls.size() >0) {
            splitUrl = getImageResponseUrls.get(0).split("/");
            logger.info("Image Fingerprint >>>>> {}", splitUrl[3]);
            fingerprint = splitUrl[3];
        }
        Integer recursion = null;
        String filter = null;
        String secret = null;

        try {
            BackgroundOperationResponse response = $( api.getImagesByFingerprintExport(fingerprint, recursion, filter,secret) );
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
    public void getImagesFingerprintTest() {

        getImagesTest();
        String[] splitUrl = null;
        String fingerprint = null;

        if ((getImageResponseUrls != null) && getImageResponseUrls.size() >0) {
            splitUrl = getImageResponseUrls.get(0).split("/");
            logger.info("Image Fingerprint >>>>> {}", splitUrl[3]);
            fingerprint = splitUrl[3];
        }

        Integer recursion = null;
        String filter = null;
        String secret = null;

        try {
            BackgroundOperationResponse response = $( api.getImagesFingerprint(fingerprint, recursion, filter,secret) );
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
    public void getImagesFingerprintRefreshTest() {
        getImagesTest();
        String[] splitUrl;
        String fingerprint = null;

        if ((getImageResponseUrls != null) && getImageResponseUrls.size() >0) {
            splitUrl = getImageResponseUrls.get(0).split("/");
            logger.info("Image Fingerprint >>>>> {}", splitUrl[3]);
            fingerprint = splitUrl[3];
        }
        Integer recursion = null;
        String filter = null;
        try {
            BackgroundOperationResponse response = $( api.getImagesFingerprintRefresh(fingerprint, recursion, filter) );
            logger.info("Get Images Fingerprint Refresh Response >>>>> {}", response);
            assertEquals(response.getStatusCode(),Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }
    }
    
    /**
     * 
     *
     * Updates the alias target or description
     *
     */
    @Test
    @Order(14)
    public void patchImagesAliasesByNameTest() {
        getImagesTest();
        String[] splitUrl = null;
        String fingerprint = null;

        if ((getImageResponseUrls != null) && getImageResponseUrls.size() >0) {
            splitUrl = getImageResponseUrls.get(0).split("/");
            logger.info("Image Fingerprint >>>>> {}", splitUrl[3]);
            fingerprint = splitUrl[3];
        }

        String name = "new-alias-name";
        UpdateImagesAliasesByNameRequest request = new UpdateImagesAliasesByNameRequest();
        request.setTarget(fingerprint);
        request.setDescription("My new description after patch");

        try {
            BackgroundOperationResponse response = $( api.patchImagesAliasesByName(name, request) );
            logger.info("PATCH IMAGES ALIASES BY NAME >>>>>>>> {}", response);

            assertEquals(response.getStatusCode(), Integer.valueOf(200));

        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Updates the image properties, update information and visibility
     *
     */
    @Test
    @Order(15)
    public void patchImagesFingerprintTest() {
        getImagesTest();
        String[] splitUrl = null;
        String fingerprint = null;

        if ((getImageResponseUrls != null) && getImageResponseUrls.size() >0) {
            splitUrl = getImageResponseUrls.get(0).split("/");
            logger.info("Image Fingerprint >>>>> {}", splitUrl[3]);
            fingerprint = splitUrl[3];
        }

        Properties5 properties5 = new Properties5();
        properties5.setOs("ubuntu");
        properties5.setRelease("20201014");
        PatchImagesFingerprintRequest request = new PatchImagesFingerprintRequest();
        request.setProperties(properties5);
        request.setPublic(true);

        try {
            BackgroundOperationResponse response = $( api.patchImagesFingerprint(fingerprint, request) );
            logger.info("Patch Images Fingerprint Response >>>>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
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
    public void postImagesTest() {

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
        request.setFilename("another-ubuntu");
        request.setSource(source10);
        request.setProperties(properties3);
        //request.setCompressionAlgorithm("");
        request.setAutoUpdate(true);


        try {
            BackgroundOperationResponse response = $( api.postImages(xLXDFingerprint, xLXDFilename, xLXDPublic, xLXDProperties, request) );
            logger.info("POST IMAGES RESPONSE >>>>> {}", response);

            if (response.getStatusCode() == Integer.valueOf(100)){
                final String operationUrl = response.getOperation();
                final String[] splitUrl = operationUrl.split("/");
                logger.info("Image Fingerprint >>>>> {}", splitUrl[3]);
                final String uuid = splitUrl[3];

                final BackgroundOperationResponse operationsUUIDResponse = $( operationsApi.getOperationsUUID(uuid, null, null) );

                while ((operationsUUIDResponse != null) && (operationsUUIDResponse.getStatusCode()) == 200) {
                    final BackgroundOperationResponse operationResponse = $( operationsApi.getOperationsUUID(uuid, null, null) );
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
    public void postImagesAliasesTest() {

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
            BackgroundOperationResponse response = $( api.postImagesAliases(request) );
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
    public void postImagesAliasesByNameTest() {
        getImagesAliasesByNameTest();

        String name = null;
        if (imagesAliasesByNameResponse != null)
        name = imagesAliasesByNameResponse.getName();

        CreateImagesAliasesByNameRequest request = new CreateImagesAliasesByNameRequest();
        request.setName("new-alias-name");

        try {
            BackgroundOperationResponse response = $( api.postImagesAliasesByName(name, request) );
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
    public void postImagesFingerprintExportTest() {
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
        //request.setTarget(fingerprint) );
        request.setAliases(aliases);

        try {
            BackgroundOperationResponse response = $( api.postImagesFingerprintExport(fingerprint, request) );
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
    public void postImagesFingerprintSecretTest() throws ApiException {
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
            BackgroundOperationResponse response = $( api.postImagesFingerprintSecret(fingerprint, request) );
            logger.info("POST FINGER PRINT SECRET >>>>> {}", response);

            assertEquals(response.getStatusCode(), Integer.valueOf(100));

        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Replaces the alias target or description
     *
     */
    @Test
    @Order(9)
    public void putImagesAliasesByNameTest() throws ApiException {
        getImagesAliasesByNameTest();
        UpdateImagesAliasesByNameRequest request = null;
        String name = null;

        if (imagesAliasesByNameResponse != null) {
            name = imagesAliasesByNameResponse.getName();
            request = new UpdateImagesAliasesByNameRequest();
            request.setTarget(imagesAliasesByNameResponse.getTarget());
        }

        try {
            BackgroundOperationResponse response = $( api.putImagesAliasesByName(name, request) );
            logger.info("PUT IMAGES ALIASES BY NAME RESPONSE >>>>>> {}", response);

            assertEquals(response.getStatusCode(), Integer.valueOf(200));

        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Replaces the image properties, update information and visibility
     *
     */
    @Test
    @Order(10)
    public void putImagesFingerprintTest() throws ApiException {

        getImagesTest();
        String[] splitUrl;
        String fingerprint = null;

        if ((getImageResponseUrls != null) && getImageResponseUrls.size() >0) {
            splitUrl = getImageResponseUrls.get(0).split("/");
            logger.info("Image Fingerprint >>>>> {}", splitUrl[3]);
            fingerprint = splitUrl[3];
        }

        UpdateImagesFingerprintRequest request = new UpdateImagesFingerprintRequest();
        request.setAutoUpdate(true);
        request.setPublic(true);

        try {
            BackgroundOperationResponse response = $( api.putImagesFingerprint(fingerprint, request) );
            logger.info("PUT FINGERPRINT RESPONSE >>>>>> {}", response);

            assertEquals(response.getStatusCode(), Integer.valueOf(200));

        }catch (ApiException ex){
            catchApiException(ex);
        }

    }


    private <T> T serialiseAndDeserialiseObject(Object objectToSerialise, Class<T> type) throws JsonProcessingException {
        JSON json = new JSON();
        String serializedString = json.getMapper().writeValueAsString(objectToSerialise);
        return json.getMapper().readValue(serializedString, type);
    }

    private ErrorResponse catchApiException(ApiException e) {
        JSON json = new JSON();
        ErrorResponse errorResponse = new ErrorResponse();
        logger.info("EXCEPTION >>>> " + e);
        try {
            errorResponse = json.getMapper().readValue(e.getResponseBody(), ErrorResponse.class);
            logger.info("ERROR RESPONSE >>>> " + errorResponse);
        }catch (JsonSyntaxException | JsonProcessingException ex){
            logger.info("JSON SYNTAX EXCEPTION >>>>>> {}", ex);
        }
        return errorResponse;
    }
}
