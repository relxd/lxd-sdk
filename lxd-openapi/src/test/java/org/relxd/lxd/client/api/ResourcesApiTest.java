/*
 * LXD
 * The services listed below are referred as .....
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@relxd.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.relxd.lxd.client.api;

import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.model.BackgroundOperationResponse;
import org.relxd.lxd.client.model.ErrorResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for ResourcesApi
 */
@Ignore
public class ResourcesApiTest {

    private final ResourcesApi api = new ResourcesApi();

    
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
        CompletableFuture<BackgroundOperationResponse> response = 
        api.getResources(recursion, filter);
        
        // TODO: test validations
    }
    
}