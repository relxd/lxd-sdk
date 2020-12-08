
package org.relxd.lxd.api.trusted.filteringandrecursion;

import com.google.gson.JsonSyntaxException;
import org.junit.After;
import org.junit.jupiter.api.*;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.JSON;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.api.ProjectsApi;
import org.relxd.lxd.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static junit.framework.TestCase.assertEquals;

/**
 * API tests for ProjectsApi
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProjectsApiTest {

    private ProjectsApi api;
    private Logger logger;

    @BeforeAll
    public void setup() {
        new RelxdApiClient();
        api = new ProjectsApi();
        logger = LoggerFactory.getLogger(InstancesApiTest.class);
    }
    
    /**
     * 
     *
     * List of projects
     *
     */
    @Test
    @Order(2)
    public void getProjectsTest() {
        Integer recursion = 1;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getProjects(recursion, filter);
            logger.info("Get Projects Response >>>>>> {}", response);
            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Project configuration
     *
     */
    @Test
    @Order(4)
    public void getProjectsByNameTest() {
        String name = "project1rename";
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getProjectsByName(name, recursion, filter);
            logger.info("Get Projects By Name Response >>>>> {}", response);
            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Define a new project
     *
     */
    @Test
    @Order(1)
    public void postProjectsTest() {
        CreateProjectsRequest request = new CreateProjectsRequest();

        FeaturesConfig featuresConfig = new FeaturesConfig();
        featuresConfig.setFeaturesImages("true");
        featuresConfig.setFeaturesProfiles("true");

        request.setName("project1");
        request.setDescription("My new description for new project");
        request.setConfig(featuresConfig);

        try {
            BackgroundOperationResponse response = api.postProjects(request);
            logger.info("Post Projects Response >>>>>> {}", response);
            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Rename a project
     *
     */
    @Test
    @Order(3)
    public void postProjectsByNameTest() {
        String name = "project1";
        CreateProjectsByNameRequest request = new CreateProjectsByNameRequest();
        request.setName("project1rename");

        try {
            BackgroundOperationResponse response = api.postProjectsByName(name, request);
            logger.info("Post Projects By Name Response >>>>>> {}", response);
            assertEquals(Integer.valueOf(100), response.getStatusCode());
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
