
package org.relxd.lxd.api.trusted;

import org.junit.Before;
import org.junit.Test;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.api.SupportedApisApi;
import org.relxd.lxd.model.BackgroundOperationResponse;
import org.relxd.lxd.service.linuxCmd.LinuxCmdService;
import org.relxd.lxd.service.linuxCmd.LinuxCmdServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.spy;

/**
 * API tests for SupportedApisApi
 */

public class SupportedApisApiTest {

    private final SupportedApisApi api = new SupportedApisApi();
    private final RelxdApiClient relxdApiClient = new RelxdApiClient();
    private final Logger logger = LoggerFactory.getLogger(SupportedApisApiTest.class);
    private LinuxCmdService linuxCmdService;
    private String unixSocketPath;

    @Before
    public void setup() {

        linuxCmdService = spy(new LinuxCmdServiceImpl());
        unixSocketPath =relxdApiClient.getUnixSocketPath();
    }

    /**
     *
     *
     * List of supported APIs
     *
     */
    @Test
    public void getApiListTest() throws ApiException {

        final String getApiListCommand = "curl -s --unix-socket " + unixSocketPath + " a/";
        Integer recursion = null;
        String filter = null;

        try
        {

            final BackgroundOperationResponse expectedApiListResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(getApiListCommand, BackgroundOperationResponse.class);
            logger.info("Expected Api List Response >>>>>>>>>> " + expectedApiListResponse);

            BackgroundOperationResponse actualApiListResponse = api.getApiList(recursion, filter);
            logger.info("Actual Api List Response >>>>>>>>>> " + actualApiListResponse);

            assertEquals(actualApiListResponse.getStatusCode(),Integer.valueOf(200));
            assertEquals(expectedApiListResponse.getStatusCode(),Integer.valueOf(200));
            assertEquals(actualApiListResponse, expectedApiListResponse);

        } catch (IOException | InterruptedException e)
        {
            e.printStackTrace();
        }
    }

}