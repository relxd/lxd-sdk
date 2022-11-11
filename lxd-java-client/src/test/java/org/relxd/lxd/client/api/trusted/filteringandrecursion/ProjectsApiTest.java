
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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.JsonSyntaxException;
import org.junit.jupiter.api.*;
import org.relxd.lxd.CompleteableFutureTestWrapper;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.JSON;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.client.api.ProjectsApi;
import org.relxd.lxd.client.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static junit.framework.TestCase.assertEquals;

/**
 * API tests for ProjectsApi
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProjectsApiTest implements CompleteableFutureTestWrapper {

    private ProjectsApi api;
    private Logger logger;

    @BeforeAll
    public void setup() {
        var apiClient = new RelxdApiClient();
        api = apiClient.services().getProjectsApi();
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
            BackgroundOperationResponse response = $( api.getProjects(recursion, filter) );
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
            BackgroundOperationResponse response = $( api.getProjectsByName(name, recursion, filter) );
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
            BackgroundOperationResponse response = $( api.postProjects(request) );
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
            BackgroundOperationResponse response = $( api.postProjectsByName(name, request) );
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
            errorResponse = json.getMapper().readValue(e.getResponseBody(), ErrorResponse.class);
            logger.info("ERROR RESPONSE >>>> " + errorResponse);
        }catch (JsonSyntaxException | JsonProcessingException ex){

        }
        return errorResponse;
    }
    
}
