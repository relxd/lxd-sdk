
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

package org.relxd.lxd.client.api.untrusted;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.JsonSyntaxException;
import org.junit.jupiter.api.*;
import org.relxd.lxd.CompleteableFutureTestWrapper;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.JSON;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.client.api.ImagesApi;
import org.relxd.lxd.client.api.trusted.InstancesApiTest;
import org.relxd.lxd.client.model.*;
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
public class ImagesApiTest implements CompleteableFutureTestWrapper {

    private ImagesApi api;
    private Logger logger;
    private LinuxCmdService linuxCmdService;
    private List<String> getImageResponseUrls;
    private String unixSocketPath;

    @BeforeAll
    public void setup() {
        var apiClient = new RelxdApiClient();
        api = apiClient.services().getImagesApi();
        linuxCmdService = spy(new LinuxCmdServiceImpl());
        logger = LoggerFactory.getLogger(InstancesApiTest.class);
        unixSocketPath  = apiClient.getUnixSocketPath();
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
