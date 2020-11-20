package org.relxd.lxd.api.guest;

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

    private SupportedApisApi api;
    private Logger logger;
    private LinuxCmdService linuxCmdService;
    private String unixSocketPath;

    @Before
    public void setup() {

        api = new SupportedApisApi();
        api.setApiClient(new RelxdApiClient());
        RelxdApiClient apiClient = new RelxdApiClient();
        logger = LoggerFactory.getLogger(SupportedApisApiTest.class);
        linuxCmdService = spy(new LinuxCmdServiceImpl());
        unixSocketPath =apiClient.getUnixSocketPath();
    }

    /**
     *
     *
     * List of supported APIs
     *
     * @throws ApiException
     *          if the Api call fails
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