
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
import org.junit.After;
import org.junit.jupiter.api.*;
import org.relxd.lxd.CompleteableFutureTestWrapper;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.JSON;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.client.api.ClusterApi;
import org.relxd.lxd.client.api.trusted.InstancesApiTest;
import org.relxd.lxd.client.model.BackgroundOperationResponse;
import org.relxd.lxd.client.model.ErrorResponse;
import org.relxd.lxd.client.model.UpdateClusterMembersByNameRequest;
import org.relxd.lxd.client.model.UpdateClusterRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

import static junit.framework.TestCase.assertEquals;

/**
 * API tests for ClusterApi
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ClusterApiTest implements CompleteableFutureTestWrapper {

    private ClusterApi api;
    private Logger logger;

    @BeforeAll
    public void setup() {
        var apiClient = new RelxdApiClient();
        api = apiClient.services().getClusterApi();
        logger = LoggerFactory.getLogger(InstancesApiTest.class);
    }
    
    /**
     * 
     *
     * Information about a cluster (such as networks and storage pools)
     *
     */
    @Test
    @Order(2)
    public void getClusterTest() {
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = $( api.getCluster(recursion, filter) );
            logger.info("Get Cluster Response >>>>>> {}", response);

            assertEquals(Integer.valueOf(200), response.getStatusCode());
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
            ex.printStackTrace();
        }
        return errorResponse;
    }
    
}
