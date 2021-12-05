
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
import org.junit.After;
import org.junit.Before;
import org.relxd.lxd.CompleteableFutureTestWrapper;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.JSON;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.client.api.OperationsApi;
import org.relxd.lxd.client.model.BackgroundOperationResponse;
import java.math.BigDecimal;
import org.relxd.lxd.client.model.ErrorResponse;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static junit.framework.TestCase.assertEquals;

/**
 * API tests for OperationsApi
 */

public class OperationsApiTest implements CompleteableFutureTestWrapper {

    private OperationsApi api;

    private Logger logger;

    @Before
    public void setup() {
        var apiClient = new RelxdApiClient();
        api = apiClient.services().getOperationsApi();
        logger = LoggerFactory.getLogger(InstancesApiTest.class);
    }

    @After
    public void deleteOperations(){
        deleteOperationsUUIDTest();
    }
    /**
     * 
     *
     * Cancel an operation. Calling this will change the state to \&quot;cancelling\&quot; rather than actually removing the entry.
     *
     */
    @Test
    public void deleteOperationsUUIDTest() {
        String uuid = "";

        try {
            BackgroundOperationResponse response = $( api.deleteOperationsUUID(uuid) );
            logger.info("Delete Networks Response >>>>>> {}", response);
            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }
    }
    
    /**
     * 
     *
     * List of operations
     *
     */
    @Test
    public void getOperationsTest() {
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = $( api.getOperations(recursion, filter) );
            logger.info("Get Operations Response >>>>>> {}", response);

            assertEquals(response.getStatusCode(), Integer.valueOf(200));

        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Background operation
     *
     */
    @Test
    public void getOperationsUUIDTest() {
        String uuid = "d3512713-3bb0-4d52-b94d-1ca4e2845704";
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = $( api.getOperationsUUID(uuid, recursion, filter) );
            logger.info("Get Operations UUID Response >>>>>> {}", response);

            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }
    }

    /**
     * 
     *
     * Wait for an operation to finish
     *
     */
    @Test
    public void getOperationsUUIDWaitTest() {
        String uuid = "f1da0d97-66af-4318-82c9-0ef472cae718";
        Integer recursion = null;
        String filter = null;
        BigDecimal timeout = new BigDecimal(10);

        try {
            BackgroundOperationResponse response = $( api.getOperationsUUIDWait(uuid, recursion, filter, timeout) );
            logger.info("Get Operations UUID Wait Response >>>>>> {}", response);

            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * -&lt; This connection is upgraded into a websocket connection speaking the protocol defined by the operation type. For example, in the case of an exec operation, the websocket is the bidirectional pipe for stdin/stdout/stderr to flow to and from the process inside the instance. In the case of migration, it will be the primary interface over which the migration information is communicated. The secret here is the one that was provided when the operation was created. Guests are allowed to connect provided they have the right secret.
     *
     */
    @Test
    public void getOperationsUUIDWebsocketTest() {
        String uuid = "1a4f6973-e9b0-46c9-9bdf-68c5c335c9dd";
        String secret = "815a261e5579167e963bc2ad761c4e0a8290c3a9db74f8caf51ed7d68eaa82c4";
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = $( api.getOperationsUUIDWebsocket(uuid,secret,recursion,filter) );
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
            errorResponse = json.getMapper().readValue(e.getResponseBody(), ErrorResponse.class);
            logger.info("ERROR RESPONSE >>>> " + errorResponse);
        }catch (JsonSyntaxException | JsonProcessingException ex){

        }
        return errorResponse;
    }
    
}
