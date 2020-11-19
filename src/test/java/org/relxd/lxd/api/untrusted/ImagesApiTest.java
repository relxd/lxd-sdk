
package org.relxd.lxd.api.untrusted;

import com.google.gson.JsonSyntaxException;
import org.junit.jupiter.api.*;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.JSON;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.api.ImagesApi;
import org.relxd.lxd.api.OperationsApi;
import org.relxd.lxd.api.trusted.InstancesApiTest;
import org.relxd.lxd.model.*;
import org.relxd.lxd.service.linuxCmd.LinuxCmdService;
import org.relxd.lxd.service.linuxCmd.LinuxCmdServiceImpl;
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
public class ImagesApiTest {

    private ImagesApi api;
    private Logger logger;
    private LinuxCmdService linuxCmdService;
    private List<String> getImageResponseUrls;
    private String unixSocketPath;

    @BeforeAll
    public void setup() {
        RelxdApiClient relxdApiClient =  new RelxdApiClient();
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
