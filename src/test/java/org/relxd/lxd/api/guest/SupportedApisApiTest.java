
/*
 *
 * MIT License
 *
 * Copyright (c) 2020 Daniel Frąk
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

package org.relxd.lxd.api.guest;

import org.junit.Before;
import org.junit.Test;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.api.SupportedApisApi;
import org.relxd.lxd.model.BackgroundOperationResponse;
import org.relxd.lxd.service.LinuxCmdService;
import org.relxd.lxd.service.LinuxCmdServiceImpl;
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
        RelxdApiClient apiClient = new RelxdApiClient();
        api = new SupportedApisApi();
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