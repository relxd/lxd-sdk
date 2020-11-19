
package org.relxd.lxd.api.untrusted;

import org.junit.Before;
import org.junit.Test;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.api.ServerConfigApi;
import org.relxd.lxd.model.BackgroundOperationResponse;
import org.relxd.lxd.model.ServerConfig;
import org.relxd.lxd.service.linuxCmd.LinuxCmdService;
import org.relxd.lxd.service.linuxCmd.LinuxCmdServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.spy;

/**
 * API tests for ServerConfigApi
 */
public class ServerConfigApiTest {

    private ServerConfigApi api;
    private LinuxCmdService linuxCmdService;
    private Logger logger;
    private String unixSocketPath;

    @Before
    public void setup() {

        RelxdApiClient relxdApiClient = new RelxdApiClient();
        linuxCmdService = spy(new LinuxCmdServiceImpl());
        logger =  LoggerFactory.getLogger(ServerConfigApiTest.class);
        api = new ServerConfigApi();
        unixSocketPath = relxdApiClient.getApplicationProperties().getProperty("unix.socket.base.path");
    }


    /**
     *
     *
     * Server configuration and environment information
     *
     */

    @Test
    public void getServerStateTest() throws ApiException {
        Integer recursion = null;
        String filter = null;
        final String getServerStateCommand = "curl -s --unix-socket " + unixSocketPath + " a/1.0";

        try
        {

            final BackgroundOperationResponse expectedBackgroundOperationResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(getServerStateCommand, BackgroundOperationResponse.class);
            logger.info("Expected Server Information Response >>>>>>>>>> " + expectedBackgroundOperationResponse);

            BackgroundOperationResponse actualBackgroundOperationResponse = api.getServerState(recursion, filter);
            logger.info("Actual Server Information Response >>>>>>>>>> " + actualBackgroundOperationResponse);

            assertEquals(actualBackgroundOperationResponse.getStatusCode(),Integer.valueOf(200));
            assertEquals(expectedBackgroundOperationResponse.getStatusCode(),Integer.valueOf(200));
            assertEquals(actualBackgroundOperationResponse, expectedBackgroundOperationResponse);

        } catch (IOException | InterruptedException e)
        {
            e.printStackTrace();
        }

    }

}