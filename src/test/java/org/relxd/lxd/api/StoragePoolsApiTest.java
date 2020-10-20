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

import com.google.gson.JsonSyntaxException;
import org.junit.Before;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.JSON;
import org.relxd.lxd.model.*;
import org.junit.Test;
import org.junit.Ignore;
import org.relxd.lxd.service.linuxCmd.LinuxCmdService;
import org.relxd.lxd.service.linuxCmd.LinuxCmdServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.spy;

/**
 * API tests for StoragePoolsApi
 */

public class StoragePoolsApiTest {

    private final StoragePoolsApi api = new StoragePoolsApi();

    private final Logger logger = LoggerFactory.getLogger(InstancesApiTest.class);

    private LinuxCmdService linuxCmdService;

    @Before
    public void setup() {

        linuxCmdService = spy(new LinuxCmdServiceImpl());
    }

    
    /**
     * 
     *
     * Remove a storage pool
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStoragePoolsByNameTest() {
        String pool = "";

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
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStoragePoolsByNameVolumesByTypeNameTest() throws ApiException {
        String pool = "";
        String type = "";
        String name = "";

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
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStoragePoolsByNameVolumesByTypeNameSnapshotsNameTest() throws ApiException {
        String pool = "default";
        String type = "xfs";
        String name = "default";

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
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoragePoolsTest() {
        final String getStoragePoolsCommand = "curl -s --unix-socket /var/snap/lxd/common/lxd/unix.socket a/1.0/storage-pools";

        Integer recursion = null;
        String filter = null;

        try
        {

            final BackgroundOperationResponse expectedGetStoragePoolsResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(getStoragePoolsCommand, BackgroundOperationResponse.class);
            logger.info("Expected Get Storage Pools Response >>>>>>> {}", expectedGetStoragePoolsResponse);

            final BackgroundOperationResponse actualGetStoragePoolsResponse = api.getStoragePools(recursion, filter);
            logger.info("Actual Get Storage Pools Response >>>>>> {}", actualGetStoragePoolsResponse);

            assertEquals(actualGetStoragePoolsResponse,expectedGetStoragePoolsResponse);

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
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoragePoolsByNameTest() {
        final String pool = "default";
        final String getStoragePoolsCommand = "curl -s --unix-socket /var/snap/lxd/common/lxd/unix.socket a/1.0/storage-pools/"+pool;
        Integer recursion = null;
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
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoragePoolsByNameResourcesTest()  {
        String pool = "default";
        final String getStoragePoolsByNameResourcesCommand = "curl -s --unix-socket /var/snap/lxd/common/lxd/unix.socket a/1.0/storage-pools/"+pool+"/resources";
        Integer recursion = null;
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
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoragePoolsByNameVolumesTest() throws ApiException {
        String pool = "default";
        final String getStoragePoolsByNameResourcesCommand = "curl -s --unix-socket /var/snap/lxd/common/lxd/unix.socket a/1.0/storage-pools/"+pool+"/volumes";
        Integer recursion = null;
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
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoragePoolsByNameVolumesByTypeNameTest() throws ApiException {
        String pool = "default";
        String type = "xfs";
        String name = "default";
        Integer recursion = null;
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
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoragePoolsByNameVolumesByTypeNameSnapshotsTest() throws ApiException {
        String pool = "default";
        String type = "xfs";
        String name = "default";
        Integer recursion = null;
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
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoragePoolsByNameVolumesByTypeNameSnapshotsNameTest() throws ApiException {
        String pool = "default";
        String type = "xfs";
        String name = "default";
        Integer recursion = null;
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
     * Update the storage pool information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchStoragePoolsByNameTest() throws ApiException {
        String pool = "pool1";

        VolumeBlockFileSystemConfig volumeBlockFileSystemConfig = new VolumeBlockFileSystemConfig();
        volumeBlockFileSystemConfig.setVolumeBlockFilesystem("xfs");

        PatchStoragePoolsByNameRequest request = new PatchStoragePoolsByNameRequest();
        request.setConfig(volumeBlockFileSystemConfig);

        try {
            BackgroundOperationResponse patchStoragePoolsByNameResponse = api.patchStoragePoolsByName(pool, request);

            logger.info("PATCH STORAGE POOL BY NAME RESPONSE >>>>>>>>>> {}", patchStoragePoolsByNameResponse);

            assertEquals(patchStoragePoolsByNameResponse.getStatusCode(), Integer.valueOf(200));

        }catch (ApiException ex){
            catchApiException(ex);
        }
    }
    
    /**
     * 
     *
     * Update the storage volume information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchStoragePoolsByNameVolumesByTypeNameTest() throws ApiException {
        String pool = "default";
        String type = "xfs";
        String name = "default";

        FileSystemMountOptionsAndThinPoolConfig fileSystemMountOptionsAndThinPoolConfig = new FileSystemMountOptionsAndThinPoolConfig();
        fileSystemMountOptionsAndThinPoolConfig.setLvmThinpoolName("LXDThinPool");
        fileSystemMountOptionsAndThinPoolConfig.setLvmVgName("pool1");
        fileSystemMountOptionsAndThinPoolConfig.setSize("15032385536");
        fileSystemMountOptionsAndThinPoolConfig.setSource("pool1");
        fileSystemMountOptionsAndThinPoolConfig.setUsedBy("");
        fileSystemMountOptionsAndThinPoolConfig.setVolumeBlockFilesystem("xfs");
        fileSystemMountOptionsAndThinPoolConfig.setVolumeBlockMountOptions("discard");
        fileSystemMountOptionsAndThinPoolConfig.setVolumeSize("10737418240");

        UpdateStoragePoolsByNameVolumesByTypeNameRequest2 request = new UpdateStoragePoolsByNameVolumesByTypeNameRequest2();
        request.setConfig(fileSystemMountOptionsAndThinPoolConfig);

        try {
            BackgroundOperationResponse response = api.patchStoragePoolsByNameVolumesByTypeName(pool, type, name, request);
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
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
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
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postStoragePoolsByNameVolumesTest() throws ApiException {
        String pool = "default";

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
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postStoragePoolsByNameVolumesByTypeTest() throws ApiException {
        String pool = "default";
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
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postStoragePoolsByNameVolumesByTypeNameTest() throws ApiException {
        String pool = "default";
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
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postStoragePoolsByNameVolumesByTypeNameSnapshotsTest() throws ApiException {
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
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postStoragePoolsByNameVolumesByTypeNameSnapshotsNameTest() throws ApiException {
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
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putStoragePoolsByNameTest() throws ApiException {

        String pool = "pool1";

        DiskAndLvmConfig diskAndLvmConfig = new DiskAndLvmConfig();
        diskAndLvmConfig.setLvmThinpoolName("LXDThinPool");
        diskAndLvmConfig.setLvmVgName("pool1");
        diskAndLvmConfig.setVolumeSize("10737418240");
        diskAndLvmConfig.setVolumeBlockFilesystem("xfs");
        diskAndLvmConfig.setVolumeBlockMountOptions("discard");
        diskAndLvmConfig.setSize("15032385536");
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
    
    /**
     * 
     *
     * Replace the storage volume information or restore from snapshot
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putStoragePoolsByNameVolumesByTypeNameTest() throws ApiException {
        String pool = "default";
        String type = "xfs";
        String name = "pool1";

        FileSystemMountOptionsAndThinPoolConfig fileSystemMountOptionsAndThinPoolConfig = new FileSystemMountOptionsAndThinPoolConfig();
        fileSystemMountOptionsAndThinPoolConfig.setVolumeSize("10737418240");
        fileSystemMountOptionsAndThinPoolConfig.setVolumeBlockMountOptions("discard");
        fileSystemMountOptionsAndThinPoolConfig.setVolumeBlockFilesystem("xfs");
        fileSystemMountOptionsAndThinPoolConfig.setUsedBy("");
        fileSystemMountOptionsAndThinPoolConfig.setSource("pool1");
        fileSystemMountOptionsAndThinPoolConfig.setSize("15032385536");
        fileSystemMountOptionsAndThinPoolConfig.setLvmVgName("pool1");
        fileSystemMountOptionsAndThinPoolConfig.setLvmThinpoolName("LXDThinPool");

        UpdateStoragePoolsByNameVolumesByTypeNameRequest request = new UpdateStoragePoolsByNameVolumesByTypeNameRequest();
        request.setConfig(fileSystemMountOptionsAndThinPoolConfig);

        try {
            BackgroundOperationResponse response = api.putStoragePoolsByNameVolumesByTypeName(pool, type, name, request);
            logger.info("RESPONSE >>>>>>>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Volume snapshot information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putStoragePoolsByNameVolumesByTypeNameSnapshotsNameTest() throws ApiException {
        String pool = "default";
        String type = "xfs";
        String name = "pool1";
        UpdateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest request = new UpdateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest();
        request.setDescription("My description");

        try {
            BackgroundOperationResponse response = api.putStoragePoolsByNameVolumesByTypeNameSnapshotsName(pool, type, name, request);
            logger.info("RESPONSE >>>>>>>>> {}", response);
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
