
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

package org.relxd.lxd.client.api.trusted.filteringandrecursion;

import org.junit.Before;
import org.junit.Test;
import org.relxd.lxd.CompleteableFutureTestWrapper;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.client.api.ServerConfigApi;
import org.relxd.lxd.client.model.BackgroundOperationResponse;
import org.relxd.lxd.client.model.ServerConfig;
import org.relxd.lxd.service.LinuxCmdService;
import org.relxd.lxd.service.LinuxCmdServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.spy;

/**
 * API tests for ServerConfigApi
 */
public class ServerConfigApiTest implements CompleteableFutureTestWrapper {

    private ServerConfigApi api;
    private LinuxCmdService linuxCmdService;
    private Logger logger;
    private String unixSocketPath;

    @Before
    public void setup() {
        final RelxdApiClient relxdApiClient = new RelxdApiClient();
        linuxCmdService = spy(new LinuxCmdServiceImpl());
        logger =  LoggerFactory.getLogger(ServerConfigApiTest.class);

        api = relxdApiClient.services().getServerConfigApi();
        unixSocketPath = relxdApiClient.getApplicationProperties().getProperty("unix.socket.base.path");
    }


    /**
     *
     *
     * Server configuration and environment information
     *
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getServerStateTest() throws ApiException {
        Integer recursion = 1;
        String filter = null;
        final String getServerStateCommand = "curl -s --unix-socket " + unixSocketPath + " a/1.0";

        try
        {

            final BackgroundOperationResponse expectedBackgroundOperationResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(getServerStateCommand, BackgroundOperationResponse.class);
            logger.info("Expected Server Information Response >>>>>>>>>> " + expectedBackgroundOperationResponse);

            BackgroundOperationResponse actualBackgroundOperationResponse = $( api.getServerState(recursion, filter) );
            logger.info("Actual Server Information Response >>>>>>>>>> " + actualBackgroundOperationResponse);

            assertEquals(actualBackgroundOperationResponse.getStatusCode(),Integer.valueOf(200));
            assertEquals(expectedBackgroundOperationResponse.getStatusCode(),Integer.valueOf(200));
            assertEquals(actualBackgroundOperationResponse, expectedBackgroundOperationResponse);

        } catch (IOException | InterruptedException e)
        {
            e.printStackTrace();
        }

    }

    /**
     *
     *
     * Updates the server configuration or other properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchServerStateTest() throws ApiException {
        final String patchServerStateCommand = "curl --data '{\"config\": {\"core.trust_password\": \"lxdpassword123\"}}' -X PATCH --unix-socket " + unixSocketPath + " a/1.0";
        ServerConfig serverConfigRequest = new ServerConfig();
        serverConfigRequest.setCoreTrustPassword("lxdpassword123");

        try {

            final BackgroundOperationResponse expectedBackgroundOperationResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(patchServerStateCommand, BackgroundOperationResponse.class);
            logger.info("EXPECTED PATCH SERVER CONFIG INFOR RESPONSE >>>>>>>> " + expectedBackgroundOperationResponse);

            final BackgroundOperationResponse actualBackgroundOperationResponse = $( api.patchServerState(serverConfigRequest) );
            logger.info("ACTUAL PATCH SERVER CONFIG INFOR RESPONSE >>>>>>>> " + actualBackgroundOperationResponse);

            assertEquals(actualBackgroundOperationResponse.getStatusCode(),Integer.valueOf(200));
            assertEquals(expectedBackgroundOperationResponse.getStatusCode(),Integer.valueOf(200));
            assertEquals(actualBackgroundOperationResponse, expectedBackgroundOperationResponse);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }

    /**
     *
     *
     * Replaces the server configuration or other properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putServerStateTest() throws ApiException {
        final String patchServerStateCommand = "curl --data '{\"config\": {\"core.trust_password\": \"lxdpassword123\", \"core.https_address\": \"192.168.43.157:8443\"}}' -X PATCH --unix-socket " + unixSocketPath + " a/1.0";
        ServerConfig serverConfigRequest = new ServerConfig();
        serverConfigRequest.setCoreTrustPassword("lxdpassword1234");
        serverConfigRequest.setCoreHttpsAddress("192.168.43.157:8443");

       try {

            final BackgroundOperationResponse expectedBackgroundOperationResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(patchServerStateCommand, BackgroundOperationResponse.class);
            logger.info("EXPECTED PUT SERVER CONFIG INFOR RESPONSE >>>>>>>> " + expectedBackgroundOperationResponse);

            final BackgroundOperationResponse actualBackgroundOperationResponse = $( api.patchServerState(serverConfigRequest) );
            logger.info("ACTUAL PUT SERVER CONFIG INFOR RESPONSE >>>>>>>> " + actualBackgroundOperationResponse);

            assertEquals(actualBackgroundOperationResponse.getStatusCode(),Integer.valueOf(200));
            assertEquals(expectedBackgroundOperationResponse.getStatusCode(),Integer.valueOf(200));
            assertEquals(actualBackgroundOperationResponse, expectedBackgroundOperationResponse);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }

}