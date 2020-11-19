package org.relxd.lxd.api.guest;

import com.google.gson.JsonSyntaxException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.JSON;
import org.relxd.lxd.api.OperationsApi;
import org.relxd.lxd.api.trusted.InstancesApiTest;
import org.relxd.lxd.model.BackgroundOperationResponse;
import org.relxd.lxd.model.ErrorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

import static junit.framework.TestCase.assertEquals;

/**
 * API tests for OperationsApi
 */

public class OperationsApiTest {

    private OperationsApi api;

    private Logger logger;

    @Before
    public void setup() {
        api  = new OperationsApi();
        logger = LoggerFactory.getLogger(InstancesApiTest.class);
    }
    
    /**
     * 
     *
     * -&lt; This connection is upgraded into a websocket connection speaking the protocol defined by the operation type. For example, in the case of an exec operation, the websocket is the bidirectional pipe for stdin/stdout/stderr to flow to and from the process inside the instance. In the case of migration, it will be the primary interface over which the migration information is communicated. The secret here is the one that was provided when the operation was created. Guests are allowed to connect provided they have the right secret.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOperationsUUIDWebsocketTest() throws ApiException {
        String uuid = "f1da0d97-66af-4318-82c9-0ef472cae718";
        String secret = "secret";
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getOperationsUUIDWebsocket(uuid,secret,recursion,filter);
            logger.info("Get Operations UUID Websocket Response >>>>>> {}", response);

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
