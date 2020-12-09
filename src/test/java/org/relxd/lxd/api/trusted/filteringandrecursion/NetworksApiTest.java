
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
import org.junit.jupiter.api.*;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.JSON;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.api.NetworksApi;
import org.relxd.lxd.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static junit.framework.TestCase.assertEquals;

/**
 * API tests for NetworksApi
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NetworksApiTest {

    private NetworksApi api;

    private Logger logger;

    @BeforeAll
    public void setup() {
        new RelxdApiClient();
        api  = new NetworksApi();
        logger = LoggerFactory.getLogger(InstancesApiTest.class);
    }

    /**
     *
     *
     * List of networks
     *
     */
    @Test
    @Order(2)
    public void getNetworksTest() {

        Integer recursion = 1;
        String filter = "name eq lxdbr0";

        try {
            BackgroundOperationResponse response = api.getNetworks(recursion, filter);
            logger.info("Get Networks Response >>>>>> {}", response);
            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }

    /**
     *
     *
     * Information about a network
     *
     */
    @Test
    @Order(4)
    public void getNetworksByNameTest() {
        String name = "networkRename";
        Integer recursion = 1;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getNetworksByName(name, recursion, filter);
            logger.info("Get Networks By Name Response >>>>> {}", response);
            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }

    /**
     *
     *
     * Network state
     *
     */
    @Test
    @Order(5)
    public void getNetworksByNameStateTest() {
        String name = "networkRename";
        Integer recursion = 1;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getNetworksByNameState(name, recursion, filter);
            logger.info("Get Networks By Name Reponse >>>>> {}", response);
            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }

    /**
     *
     *
     * Define a new network
     *
     */
    @Test
    @Order(1)
    public void postNetworksTest() {

        CreateNetworksRequest request = new CreateNetworksRequest();

        NetworkIPConfig networkIPConfig = new NetworkIPConfig();
        networkIPConfig.setIpv4Address("none");
        networkIPConfig.setIpv6Address("2001:470:b368:4242::1/64");
        networkIPConfig.setIpv6Nat("true");


        request.setName("myNewNetwork");
        request.setDescription("This is my new Network for testing");
        request.setConfig(networkIPConfig);

        try {
            BackgroundOperationResponse response = api.postNetworks(request);
            logger.info("Post Networks By Name Reponse >>>>> {}", response);
            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }

    /**
     *
     *
     * Rename a network
     *
     */
    @Test
    @Order(3)
    public void postNetworksByNameTest() {
        String name = "myNewNetwork";
        CreateNetworksByNameRequest request = new CreateNetworksByNameRequest();
        request.setName("networkRename");

        try {
            BackgroundOperationResponse response = api.postNetworksByName(name, request);
            logger.info("Post Networks By Name Reponse >>>>> {}", response);
            assertEquals(Integer.valueOf(200), response.getStatusCode());
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