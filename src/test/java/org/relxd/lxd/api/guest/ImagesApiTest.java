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

package org.relxd.lxd.api.guest;

import com.google.gson.JsonSyntaxException;
import org.junit.jupiter.api.*;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.JSON;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.api.ImagesApi;
import org.relxd.lxd.api.trusted.InstancesApiTest;
import org.relxd.lxd.model.*;
import org.relxd.lxd.service.LinuxCmdService;
import org.relxd.lxd.service.LinuxCmdServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.spy;

/**
 * API tests for ImagesApi
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ImagesApiTest {

    private ImagesApi api;
    private Logger logger;
    private LinuxCmdService linuxCmdService;
    private List<String> getImageResponseUrls;
    private String unixSocketPath;

    @BeforeAll
    public void setup() {

        final RelxdApiClient relxdApiClient = new RelxdApiClient();
        linuxCmdService = spy(new LinuxCmdServiceImpl());
        api = new ImagesApi();
        logger = LoggerFactory.getLogger(InstancesApiTest.class);
        unixSocketPath  = relxdApiClient.getUnixSocketPath();
    }
    
    /**
     * 
     *
     * List of images (public or private)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Order(1)
    public void getImagesTest() {

        final String getImagesCommand = "curl -s --unix-socket " + unixSocketPath + " a/1.0/images";

        Integer recursion = null;
        String filter = null;
        try {
            final BackgroundOperationResponse expectedGetImagesResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(getImagesCommand, BackgroundOperationResponse.class);
            logger.info("Expected Get Images Response >>>>>>>>>> " + expectedGetImagesResponse);
            BackgroundOperationResponse actualGetImagesResponse = api.getImages(recursion, filter);
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
     * Image description and metadata
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Order(12)
    public void getImagesFingerprintTest() throws ApiException {

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
            BackgroundOperationResponse response = api.getImagesFingerprint(fingerprint, recursion, filter, secret);
            logger.info("Get Images Fingerprint Response >>>>> {}", response);
            assertEquals(response.getStatusCode(),Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }

    /**
     *
     *
     * Download the image tarball
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Order(11)
    public void getImagesByFingerprintExportTest() throws ApiException {
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
            BackgroundOperationResponse response = api.getImagesByFingerprintExport(fingerprint, recursion, filter, secret);
            logger.info("Get Images By FingerPrint Export Response >>>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }
    }

    /**
     *
     *
     * List of aliases (public or private based on image visibility)
     *
     * @throws ApiException
     *          if the Api call fails
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
            BackgroundOperationResponse actualGetImageAliasesResponse = api.getImagesAliases(recursion, filter);
            logger.info("Actual Get Image Aliases Response >>>>>> {}", actualGetImageAliasesResponse);

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
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Order(5)
    public void getImagesAliasesByNameTest() {

        String name = "myAlias";

        final String getImageAliasesCommand = "curl -s --unix-socket " + unixSocketPath + " a/1.0/images/aliases/" + name;

        Integer recursion = null;
        String filter = null;

        try {
            final BackgroundOperationResponse expectedGetImageAliasesByNameResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(getImageAliasesCommand, BackgroundOperationResponse.class);
            logger.info("Expected Get Image Aliases By Name Response >>>>>>>>>> " + expectedGetImageAliasesByNameResponse);

            BackgroundOperationResponse actualGetImageAliasesByNameResponse = api.getImagesAliasesByName(name, recursion, filter);
            logger.info("Actual Get Images Aliases By Name >>>>>> {}", actualGetImageAliasesByNameResponse);

            assertEquals(actualGetImageAliasesByNameResponse,expectedGetImageAliasesByNameResponse);

        }catch (IOException | InterruptedException ex){

        } catch (ApiException ex){
            catchApiException(ex);
        }

    }

    /**
     *
     *
     * Generate a random token and tell LXD to expect it be used by a guest
     *
     * @throws ApiException
     *          if the Api call fails
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
            BackgroundOperationResponse response = api.postImagesFingerprintSecret(fingerprint, request);
            logger.info("POST FINGER PRINT SECRET >>>>> {}", response);

            assertEquals(response.getStatusCode(), Integer.valueOf(100));

        }catch (ApiException ex){
            catchApiException(ex);
        }

    }

    private ErrorResponse catchApiException(ApiException e) {
        JSON json = new JSON();
        ErrorResponse errorResponse = new ErrorResponse();
        logger.info("EXCEPTION >>>> " + e);
        try {
            errorResponse = json.deserialize(e.getResponseBody(), ErrorResponse.class);
            logger.info("ERROR RESPONSE >>>> " + errorResponse);
        }catch (JsonSyntaxException ex){
            logger.info("JSON SYNTAX EXCEPTION >>>>>> {}", ex);
        }
        return errorResponse;
    }
}
