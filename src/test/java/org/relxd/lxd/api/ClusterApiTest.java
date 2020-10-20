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


package org.relxd.lxd.api;

import org.relxd.lxd.ApiException;
import org.relxd.lxd.model.BackgroundOperationResponse;
import java.math.BigDecimal;
import org.relxd.lxd.model.ErrorResponse;
import org.relxd.lxd.model.UpdateClusterMembersByNameRequest;
import org.relxd.lxd.model.UpdateClusterRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClusterApi
 */
@Ignore
public class ClusterApiTest {

    private final ClusterApi api = new ClusterApi();

    
    /**
     * 
     *
     * Remove a member of the cluster
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteClusterMembersByNameTest() throws ApiException {
        String name = null;
        BigDecimal force = null;
        BackgroundOperationResponse response = api.deleteClusterMembersByName(name, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Information about a cluster (such as networks and storage pools)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClusterTest() throws ApiException {
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = api.getCluster(recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List of LXD members in the cluster
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClusterMembersTest() throws ApiException {
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = api.getClusterMembers(recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve the member&#39;s information and status
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClusterMembersByNameTest() throws ApiException {
        String name = null;
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = api.getClusterMembersByName(name, recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Rename a cluster member
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postClusterMembersByNameTest() throws ApiException {
        String name = null;
        UpdateClusterMembersByNameRequest body = null;
        BackgroundOperationResponse response = api.postClusterMembersByName(name, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Bootstrap or join a cluster, or disable clustering on this node
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putClusterTest() throws ApiException {
        UpdateClusterRequest body = null;
        BackgroundOperationResponse response = api.putCluster(body);

        // TODO: test validations
    }
    
}
