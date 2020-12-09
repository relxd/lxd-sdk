
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

package org.relxd.lxd.api.trusted.filteringandrecursion;

import com.google.gson.JsonSyntaxException;
import org.junit.After;
import org.junit.jupiter.api.*;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.JSON;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.api.ClusterApi;
import org.relxd.lxd.model.BackgroundOperationResponse;
import org.relxd.lxd.model.ErrorResponse;
import org.relxd.lxd.model.UpdateClusterMembersByNameRequest;
import org.relxd.lxd.model.UpdateClusterRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

import static junit.framework.TestCase.assertEquals;

/**
 * API tests for ClusterApi
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ClusterApiTest {

    private ClusterApi api;
    private Logger logger;

    @BeforeAll
    public void setup() {

        new RelxdApiClient();
        api = new ClusterApi();
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
        Integer recursion = 1;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getCluster(recursion, filter);
            logger.info("Get Cluster Response >>>>>> {}", response);

            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }


    }
    
    /**
     * 
     *
     * List of LXD members in the cluster
     *
     */
    @Test
    @Order(4)
    public void getClusterMembersTest() {
        Integer recursion = 1;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getClusterMembers(recursion, filter);
            logger.info("Get Cluster Response >>>>>> {}", response);

            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Retrieve the cluster member's information and status
     *
     */
    @Test
    @Order(5)
    public void getClusterMembersByNameTest() {
        String name = "new-server";
        Integer recursion = 1;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getClusterMembersByName(name, recursion, filter);
            logger.info("Get Cluster Members By Name Response >>>>>> {}", response);

            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Rename a cluster member
     *
     */
    @Test
    @Order(3)
    public void postClusterMembersByNameTest() {
        String name = "lxd1";
        UpdateClusterMembersByNameRequest request = new UpdateClusterMembersByNameRequest();
        request.serverName("new-server");

        try {
            BackgroundOperationResponse response = api.postClusterMembersByName(name, request);
            logger.info("Post Cluster Members By Name Response >>>>>> {}", response);

            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }
    }
    
    /**
     * 
     *
     * Bootstrap or join a cluster, or disable clustering on this node
     *
     */
    @Test
    @Order(1)
    public void putClusterTest() {
        UpdateClusterRequest request = new UpdateClusterRequest();
        request.setServerName("lxd1");
        request.setEnabled(true);

        try {
            BackgroundOperationResponse response = api.putCluster(request);
            logger.info("Put Cluster By Name Response >>>>>> {}", response);

            assertEquals(Integer.valueOf(100), response.getStatusCode());
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
            ex.printStackTrace();
        }
        return errorResponse;
    }
    
}
