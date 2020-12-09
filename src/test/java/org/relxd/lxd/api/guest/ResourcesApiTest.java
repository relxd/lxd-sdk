
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

import com.google.gson.JsonSyntaxException;
import org.junit.Before;
import org.junit.Test;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.JSON;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.api.ResourcesApi;
import org.relxd.lxd.api.trusted.InstancesApiTest;
import org.relxd.lxd.model.BackgroundOperationResponse;
import org.relxd.lxd.model.ErrorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static junit.framework.TestCase.assertEquals;

/**
 * API tests for ResourcesApi
 */

public class ResourcesApiTest {

    private ResourcesApi api;

    private Logger logger;

    @Before
    public void setup() {

        new RelxdApiClient();
        api = new ResourcesApi();
        logger = LoggerFactory.getLogger(InstancesApiTest.class);
    }

    /**
     * 
     *
     * Information about the resources available to the LXD server
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getResourcesTest() throws ApiException {
        Integer recursion = null;
        String filter = null;

        try {
        BackgroundOperationResponse response = api.getResources(recursion, filter);
        logger.info("Get Operations Response >>>>>> {}", response);

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
