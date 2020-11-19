package org.relxd.lxd.api.guest;

import com.google.gson.JsonSyntaxException;
import org.junit.Before;
import org.junit.Test;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.JSON;
import org.relxd.lxd.api.ResourcesApi;
import org.relxd.lxd.api.trusted.InstancesApiTest;
import org.relxd.lxd.model.BackgroundOperationResponse;
import org.relxd.lxd.model.ErrorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static junit.framework.TestCase.assertEquals;

/**
 * API tests for ResourcesApi
 */

public class ResourcesApiTest {

    private ResourcesApi api;

    private Logger logger;

    @Before
    public void setup() {

        api = new ResourcesApi();
        logger = LoggerFactory.getLogger(InstancesApiTest.class);
    }

    /**
     * 
     *
     * Information about the resources available to the LXD server
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getResourcesTest() throws ApiException {
        Integer recursion = null;
        String filter = null;

        try {
        BackgroundOperationResponse response = api.getResources(recursion, filter);
        logger.info("Get Operations Response >>>>>> {}", response);

        assertEquals(response.getStatusCode(), Integer.valueOf(200));

    }catch (ApiException ex){
        catchApiException(ex);
    }

}

    private ErrorResponse catchApiException(ApiException e) {
        JSON json = new JSON();
        ErrorResponse errorResponse = new ErrorResponse();
        try {
            errorResponse = json.deserialize(e.getResponseBody(), ErrorResponse.class);
            logger.info("ERROR RESPONSE >>>> " + errorResponse);
        }catch (JsonSyntaxException ex){

        }
        return errorResponse;
    }
    
}
