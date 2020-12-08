
package org.relxd.lxd.api.trusted.filteringandrecursion;

import com.google.gson.JsonSyntaxException;
import org.junit.Before;
import org.junit.Test;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.JSON;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.api.EventsApi;
import org.relxd.lxd.model.BackgroundOperationResponse;
import org.relxd.lxd.model.ErrorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static junit.framework.TestCase.assertEquals;

/**
 * API tests for EventsApi
 */

public class EventsApiTest {

    private EventsApi api;
    private Logger logger;

    @Before
    public void setup() {

        new RelxdApiClient();
        api = new EventsApi();
        logger = LoggerFactory.getLogger(InstancesApiTest.class);
    }
    
    /**
     * 
     *
     * Websocket upgrade
     *
     */
    @Test
    public void getEventsTest() {
        String type = "logging";
        Integer recursion = 1;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getEvents(type, recursion, filter);
            logger.info("Get Events Response >>>>>> {}", response);

            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }
    }

    private ErrorResponse catchApiException(ApiException e) {
        JSON json = new JSON();
        logger.info("ERROR >>>> " + e);
        ErrorResponse errorResponse = new ErrorResponse();
        try {
            errorResponse = json.deserialize(e.getResponseBody(), ErrorResponse.class);
            logger.info("ERROR RESPONSE >>>> " + errorResponse);
        }catch (JsonSyntaxException ex){
            ex.printStackTrace();
        }
        return errorResponse;
    }
    
}
