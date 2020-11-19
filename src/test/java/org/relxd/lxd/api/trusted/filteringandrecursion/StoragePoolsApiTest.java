
package org.relxd.lxd.api.trusted.filteringandrecursion;

import com.google.gson.JsonSyntaxException;
import org.junit.After;
import org.junit.jupiter.api.*;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.JSON;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.api.StoragePoolsApi;
import org.relxd.lxd.model.*;
import org.relxd.lxd.service.linuxCmd.LinuxCmdService;
import org.relxd.lxd.service.linuxCmd.LinuxCmdServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.spy;

/**
 * API tests for StoragePoolsApi
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StoragePoolsApiTest {

    private StoragePoolsApi api;

    private Logger logger;

    private LinuxCmdService linuxCmdService;

    private String unixSocketPath;

    @BeforeAll
    public void setup() {

        final RelxdApiClient relxdApiClient = new RelxdApiClient();
        linuxCmdService = spy(new LinuxCmdServiceImpl());
        logger = LoggerFactory.getLogger(InstancesApiTest.class);
        api = new StoragePoolsApi();
        unixSocketPath = relxdApiClient.getApplicationProperties().getProperty("unix.socket.base.path");
    }

    @After
    public void deleteStoragePools(){
        deleteStoragePoolsByNameTest();
        deleteStoragePoolsByNameVolumesByTypeNameTest();
        deleteStoragePoolsByNameVolumesByTypeNameSnapshotsNameTest();
    }


    /**
     *
     *
     * Remove a storage pool
     *
     */
    @Test
    public void deleteStoragePoolsByNameTest() {
        String pool = "pool1";

        try {
            BackgroundOperationResponse response = api.deleteStoragePoolsByName(pool);
            logger.info("RESPONSE >>>>>>>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }
    }

    /**
     *
     *
     * Delete a storage volume of a given type on a given storage pool
     *
     */
    @Test
    public void deleteStoragePoolsByNameVolumesByTypeNameTest() {
        String pool = "pool1";
        String type = "xfs";
        String name = "pool2";

        try {
            BackgroundOperationResponse response = api.deleteStoragePoolsByNameVolumesByTypeName(pool, type, name);
            logger.info("RESPONSE >>>>>>>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){

        }
    }

    /**
     *
     *
     * Remove the volume snapshot
     *
     */
    @Test
    @Order(19)
    public void deleteStoragePoolsByNameVolumesByTypeNameSnapshotsNameTest() {
        String pool = "pool1";
        String type = "xfs";
        String name = "pool2";

        try {
            BackgroundOperationResponse response = api.deleteStoragePoolsByNameVolumesByTypeNameSnapshotsName(pool, type, name);
            logger.info("RESPONSE >>>>>>>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }

    /**
     * 
     *
     * List of storage pools
     *
     */
    @Test
    @Order(2)
    public void getStoragePoolsTest() {
        final String getStoragePoolsCommand = "curl -s --unix-socket "+ unixSocketPath +" a/1.0/storage-pools";

        Integer recursion = 1;
        String filter = null;

        try
        {

            final BackgroundOperationResponse expectedGetStoragePoolsResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(getStoragePoolsCommand, BackgroundOperationResponse.class);
            logger.info("Expected Get Storage Pools Response >>>>>>> {}", expectedGetStoragePoolsResponse);

            final BackgroundOperationResponse actualGetStoragePoolsResponse = api.getStoragePools(recursion, filter);
            logger.info("Actual Get Storage Pools Response >>>>>> {}", actualGetStoragePoolsResponse);

            assertEquals(Integer.valueOf(200), actualGetStoragePoolsResponse.getStatusCode());

        }catch (IOException | InterruptedException e)
        {
            e.printStackTrace();
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Information about a storage pool
     *
     */
    @Test
    @Order(3)
    public void getStoragePoolsByNameTest() {
        final String pool = "pool1";
        final String getStoragePoolsCommand = "curl -s --unix-socket "+ unixSocketPath +" a/1.0/storage-pools/"+pool;
        Integer recursion = 1;
        String filter = null;

        try {

            final BackgroundOperationResponse expectedGetStoragePoolsResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(getStoragePoolsCommand, BackgroundOperationResponse.class);
            logger.info("Expected Get Storage Pools Response >>>>>>> {}", expectedGetStoragePoolsResponse);

            BackgroundOperationResponse actualGetStoragePoolsByNameResponse = api.getStoragePoolsByName(pool, recursion, filter);
            logger.info("Actual Get Storage Pools Response >>>>>> {}", actualGetStoragePoolsByNameResponse);

            assertEquals(actualGetStoragePoolsByNameResponse,expectedGetStoragePoolsResponse);

        }catch (IOException | InterruptedException e) {
        e.printStackTrace();
        }catch (ApiException ex){
        catchApiException(ex);
    }
    }
    
    /**
     * 
     *
     * Information about the resources available to the storage pool
     *
     */
    @Test
    @Order(6)
    public void getStoragePoolsByNameResourcesTest() {
        String pool = "pool1";
        final String getStoragePoolsByNameResourcesCommand = "curl -s --unix-socket " + unixSocketPath +" a/1.0/storage-pools/"+pool+"/resources";
        Integer recursion = 1;
        String filter = null;

        try {
            final BackgroundOperationResponse expectedGetStoragePoolsByNameResourcesResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(getStoragePoolsByNameResourcesCommand, BackgroundOperationResponse.class);
            logger.info("Expected Get Storage Pools Response >>>>>>> {}", expectedGetStoragePoolsByNameResourcesResponse);

            BackgroundOperationResponse actualGetStoragePoolsByNameResourcesResponse = api.getStoragePoolsByNameResources(pool, recursion, filter);
            logger.info("Actual Get Storage Pools Response >>>>>> {}", actualGetStoragePoolsByNameResourcesResponse);

            assertEquals(actualGetStoragePoolsByNameResourcesResponse, expectedGetStoragePoolsByNameResourcesResponse);

        }catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * List of storage volumes
     *
     */
    @Test
    @Order(7)
    public void getStoragePoolsByNameVolumesTest() {
        String pool = "pool1";
        final String getStoragePoolsByNameResourcesCommand = "curl -s --unix-socket " +unixSocketPath+ " a/1.0/storage-pools/"+pool+"/volumes";
        Integer recursion = 1;
        String filter = null;

        try {
            final BackgroundOperationResponse expectedGetStoragePoolsByNameVolumesResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(getStoragePoolsByNameResourcesCommand, BackgroundOperationResponse.class);
            logger.info("Expected Get Storage Pools By Name Volumes Response >>>>>>> {}", expectedGetStoragePoolsByNameVolumesResponse);

            BackgroundOperationResponse actualGetStoragePoolsByNameVolumesResponse = api.getStoragePoolsByNameVolumes(pool, recursion, filter);
            logger.info("Actual Get Storage Pools By Name Volumes Response >>>>>> {}", actualGetStoragePoolsByNameVolumesResponse);

            assertEquals(actualGetStoragePoolsByNameVolumesResponse, expectedGetStoragePoolsByNameVolumesResponse);

        }catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Information about a storage volume of a given type on a storage pool
     *
     */
    @Test
    @Order(8)
    public void getStoragePoolsByNameVolumesByTypeNameTest() {
        String pool = "pool1";
        String type = "xfs";
        String name = "default";
        Integer recursion = 1;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getStoragePoolsByNameVolumesByTypeName(pool, type, name, recursion, filter);
            logger.info("RESPONSE >>>>>>>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * List of volume snapshots
     *
     */
    @Test
    @Order(9)
    public void getStoragePoolsByNameVolumesByTypeNameSnapshotsTest() {
        String pool = "pool1";
        String type = "xfs";
        String name = "default";
        Integer recursion = 1;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getStoragePoolsByNameVolumesByTypeNameSnapshots(pool, type, name, recursion, filter);
            logger.info("RESPONSE >>>>>>>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException  ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Snapshot information
     */
    @Test
    @Order(18)
    public void getStoragePoolsByNameVolumesByTypeNameSnapshotsNameTest() {
        String pool = "default";
        String type = "xfs";
        String name = "default";
        Integer recursion = 1;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getStoragePoolsByNameVolumesByTypeNameSnapshotsName(pool, type, name, recursion, filter);
            logger.info("RESPONSE >>>>>>>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Define a new storage pool
     *
     */
    @Test
    @Order(1)
    public void postStoragePoolsTest() {
        SizeConfig sizeConfig = new SizeConfig();
        sizeConfig.setSize("10GB");

        CreateStoragePoolsRequest request = new CreateStoragePoolsRequest();
        request.setConfig(sizeConfig);
        request.setDriver("zfs");
        request.setName("pool1");

        try {
            BackgroundOperationResponse postStoragePoolsResponse = api.postStoragePools(request);
            logger.info("Post Storage Pools Response >>>>> {}", postStoragePoolsResponse);
            assertEquals(postStoragePoolsResponse.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Create a new storage volume on a given storage pool
     */
    @Test
    @Order(4)
    public void postStoragePoolsByNameVolumesTest() {
        String pool = "pool1";

        CreateStoragePoolsByNameVolumesRequest request = new CreateStoragePoolsByNameVolumesRequest();
        request.setName("vol2");
        request.setType("zfs");

        try {
            BackgroundOperationResponse response = api.postStoragePoolsByNameVolumes(pool, request);
            logger.info("Post Storage Pools By Name Volumes Response >>>>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Create a new storage volume of a particular type on a given storage pool
     */
    @Test
    @Order(12)
    public void postStoragePoolsByNameVolumesByTypeTest() {
        String pool = "pool1";
        String type = "xfs";

        Source13 source13 = new Source13();

        CreateStoragePoolsByNameVolumesByTypeRequest request = new CreateStoragePoolsByNameVolumesByTypeRequest();
        request.setName("");
        request.setSource(source13);

        try {
            BackgroundOperationResponse response = api.postStoragePoolsByNameVolumesByType(pool, type, request);
            logger.info("RESPONSE >>>>>>>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Rename a storage volume on a given storage pool
     *
     */
    @Test
    @Order(13)
    public void postStoragePoolsByNameVolumesByTypeNameTest() {
        String pool = "pool1";
        String type = "default";
        String name = "pool2";
        CreateStoragePoolsByNameVolumesByTypeNameRequest request = new CreateStoragePoolsByNameVolumesByTypeNameRequest();
        request.setName("pool3");
        request.setMigration(true);
        request.setPool("");

        try {
            BackgroundOperationResponse response = api.postStoragePoolsByNameVolumesByTypeName(pool, type, name, request);
            logger.info("RESPONSE >>>>>>>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Create a new volume snapshot
     *
     */
    @Test
    @Order(14)
    public void postStoragePoolsByNameVolumesByTypeNameSnapshotsTest() {
        String pool = "default";
        String type = "xfs";
        String name = "pool2";
        CreateStoragePoolsByNameVolumesByTypeNameSnapshotsRequest request = new CreateStoragePoolsByNameVolumesByTypeNameSnapshotsRequest();
        request.setName("pool4");

        try {
            BackgroundOperationResponse response = api.postStoragePoolsByNameVolumesByTypeNameSnapshots(pool, type, name, request);
            logger.info("RESPONSE >>>>>>>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }
    }
    
    /**
     * 
     *
     * Used to rename the volume snapshot
     *
     */
    @Test
    @Order(15)
    public void postStoragePoolsByNameVolumesByTypeNameSnapshotsNameTest() {
        String pool = "default";
        String type = "xfs";
        String name = "pool1";
        CreateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest request = new CreateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest();
        request.setName("pool2");

        try {
            BackgroundOperationResponse response = api.postStoragePoolsByNameVolumesByTypeNameSnapshotsName(pool, type, name, request);
            logger.info("RESPONSE >>>>>>>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Replace the storage pool information
     */
    @Test
    @Order(5)
    public void putStoragePoolsByNameTest() {

        String pool = "pool1";

        DiskAndLvmConfig diskAndLvmConfig = new DiskAndLvmConfig();
        diskAndLvmConfig.setLvmThinpoolName("LXDThinPool");
        diskAndLvmConfig.setLvmVgName("pool1");
        diskAndLvmConfig.setVolumeSize("10737418240");
        diskAndLvmConfig.setVolumeBlockFilesystem("xfs");
        diskAndLvmConfig.setVolumeBlockMountOptions("discard");
        //diskAndLvmConfig.setSize("15032385536");
        diskAndLvmConfig.setSource("pool1");

        UpdateStoragePoolsByNameRequest request = new UpdateStoragePoolsByNameRequest();
        request.setConfig(diskAndLvmConfig);

        try {
            BackgroundOperationResponse response = api.putStoragePoolsByName(pool, request);
            logger.info("RESPONSE >>>>>>> {}", response);

            assertEquals(response.getStatusCode(),Integer.valueOf(200));

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
