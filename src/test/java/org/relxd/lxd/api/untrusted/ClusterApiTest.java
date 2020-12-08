
package org.relxd.lxd.api.untrusted;

import com.google.gson.JsonSyntaxException;
import org.junit.After;
import org.junit.jupiter.api.*;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.JSON;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.api.ClusterApi;
import org.relxd.lxd.api.trusted.InstancesApiTest;
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
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getCluster(recursion, filter);
            logger.info("Get Cluster Response >>>>>> {}", response);

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
