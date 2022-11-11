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

import org.junit.Before;
import org.relxd.lxd.CompleteableFutureTestWrapper;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.model.BackgroundOperationResponse;
import org.relxd.lxd.client.model.CreateInstancesByNameBackupsByNameRequest;
import org.relxd.lxd.client.model.CreateInstancesByNameBackupsRequest;
import org.relxd.lxd.client.model.CreateInstancesByNameConsoleRequest;
import org.relxd.lxd.client.model.CreateInstancesByNameExecRequest;
import org.relxd.lxd.client.model.CreateInstancesByNameRequest;
import org.relxd.lxd.client.model.CreateInstancesByNameSnapshotRequest;
import org.relxd.lxd.client.model.CreateInstancesByNameSnapshotsInformationRequest;
import org.relxd.lxd.client.model.CreateInstancesRequest;
import org.relxd.lxd.client.model.ErrorResponse;
import java.io.File;
import org.relxd.lxd.client.model.GetInstancesByNameMetadataResponse;
import org.relxd.lxd.client.model.PatchInstancesByNameRequest;
import org.relxd.lxd.client.model.RawFile;
import java.util.UUID;
import org.relxd.lxd.client.model.UpdateInstancesByNameRequest;
import org.relxd.lxd.client.model.UpdateInstancesByNameSnapshotsInformationRequest;
import org.relxd.lxd.client.model.UpdateInstancesByNameStateRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InstancesApi
 */
@Ignore
public class InstancesApiTest implements CompleteableFutureTestWrapper {

    private InstancesApi api;

    @Before
    public void CertificatesApiTest() {
        var apiClient = new RelxdApiClient();
        api = apiClient.services().getInstancesApi();
    }

    
    /**
     * 
     *
     * Remove the instance
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInstancesByNameTest() throws ApiException {
        String name = null;
        BackgroundOperationResponse response = $( api.deleteInstancesByName(name) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Remove the backup
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInstancesByNameBackupsByNameTest() throws ApiException {
        String name = null;
        String backupsName = null;
        BackgroundOperationResponse response = $( api.deleteInstancesByNameBackupsByName(name, backupsName) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Empty the instance&#39;s console log
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInstancesByNameConsoleTest() throws ApiException {
        String name = null;
        $( api.deleteInstancesByNameConsole(name) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete a file in the instance
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInstancesByNameFilesTest() throws ApiException {
        String name = null;
        String path = null;
        BackgroundOperationResponse response = $( api.deleteInstancesByNameFiles(name, path) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete a particular log file.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInstancesByNameLogsFileTest() throws ApiException {
        String name = null;
        String logFile = null;
        BackgroundOperationResponse response = $( api.deleteInstancesByNameLogsFile(name, logFile) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete an instance template
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInstancesByNameMetadataTemplatesTest() throws ApiException {
        String name = null;
        String path = null;
        BackgroundOperationResponse response = $( api.deleteInstancesByNameMetadataTemplates(name, path) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Remove the snapshot
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInstancesByNameSnapshotsInformationTest() throws ApiException {
        String name = null;
        String snapshotName = null;
        BackgroundOperationResponse response = $( api.deleteInstancesByNameSnapshotsInformation(name, snapshotName) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Return a list of URLs for instances this server hosts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstancesTest() throws ApiException {
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = $( api.getInstances(recursion, filter) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get Instance information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstancesByNameTest() throws ApiException {
        String name = null;
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = $( api.getInstancesByName(name, recursion, filter) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List of backups for the instance
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstancesByNameBackupsTest() throws ApiException {
        String name = null;
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = $( api.getInstancesByNameBackups(name, recursion, filter) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Backup information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstancesByNameBackupsByNameTest() throws ApiException {
        String name = null;
        String backupsName = null;
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = $( api.getInstancesByNameBackupsByName(name, backupsName, recursion, filter) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Fetch the backup tarball
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstancesByNameBackupsByNameExportTest() throws ApiException {
        String name = null;
        String backupsName = null;
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = $( api.getInstancesByNameBackupsByNameExport(name, backupsName, recursion, filter) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the contents of the instance&#39;s console log
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstancesByNameConsoleTest() throws ApiException {
        String name = null;
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = $( api.getInstancesByNameConsole(name, recursion, filter) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Download a file or directory listing from the instance
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstancesByNameFilesTest() throws ApiException {
        String name = null;
        Integer recursion = null;
        String filter = null;
        String path = null;
        Integer xLXDUid = null;
        Integer xLXDGid = null;
        Integer xLXDMode = null;
        UUID xLXDType = null;
        RawFile response = $( api.getInstancesByNameFiles(name, recursion, filter, path, xLXDUid, xLXDGid, xLXDMode, xLXDType) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of the log files available for this instance. Note that this works on instances that have been deleted (or were never created) to enable people to get logs for failed creations.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstancesByNameLogsTest() throws ApiException {
        String name = null;
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = $( api.getInstancesByNameLogs(name, recursion, filter) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the contents of a particular log file.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstancesByNameLogsFileTest() throws ApiException {
        String name = null;
        String logFile = null;
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = $( api.getInstancesByNameLogsFile(name, logFile, recursion, filter) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Instance metadata
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstancesByNameMetadataTest() throws ApiException {
        String name = null;
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = $( api.getInstancesByNameMetadata(name, recursion, filter) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List instance templates
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstancesByNameMetadataTemplatesTest() throws ApiException {
        String name = null;
        Integer recursion = null;
        String filter = null;
        String path = null;
        BackgroundOperationResponse response = $( api.getInstancesByNameMetadataTemplates(name, recursion, filter, path) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List of snapshots
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstancesByNameSnapshotsTest() throws ApiException {
        String name = null;
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = $( api.getInstancesByNameSnapshots(name, recursion, filter) );

        // TODO: test validations
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
    public void getInstancesByNameSnapshotsInformationTest() throws ApiException {
        String name = null;
        String snapshotName = null;
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = $( api.getInstancesByNameSnapshotsInformation(name, snapshotName, recursion, filter) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Current state
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstancesByNameStateTest() throws ApiException {
        String name = null;
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = $( api.getInstancesByNameState(name, recursion, filter) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update instance configuration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchInstancesByNameTest() throws ApiException {
        String name = null;
        PatchInstancesByNameRequest body = null;
        BackgroundOperationResponse response = $( api.patchInstancesByName(name, body) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create a new instance
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postInstancesTest() throws ApiException {
        String target = null;
        CreateInstancesRequest body = null;
        BackgroundOperationResponse response = $( api.postInstances(target, body) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Used to rename/migrate the instance
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postInstancesByNameTest() throws ApiException {
        String name = null;
        String target = null;
        CreateInstancesByNameRequest body = null;
        BackgroundOperationResponse response = $( api.postInstancesByName(name, target, body) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create a new backup
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postInstancesByNameBackupsTest() throws ApiException {
        String name = null;
        CreateInstancesByNameBackupsRequest body = null;
        BackgroundOperationResponse response = $( api.postInstancesByNameBackups(name, body) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Used to rename the backup
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postInstancesByNameBackupsByNameTest() throws ApiException {
        String name = null;
        String backupsName = null;
        CreateInstancesByNameBackupsByNameRequest body = null;
        BackgroundOperationResponse response = $( api.postInstancesByNameBackupsByName(name, backupsName, body) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Attach to an instance&#39;s console devices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postInstancesByNameConsoleTest() throws ApiException {
        String name = null;
        CreateInstancesByNameConsoleRequest body = null;
        BackgroundOperationResponse response = $( api.postInstancesByNameConsole(name, body) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Run a remote command
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postInstancesByNameExecTest() throws ApiException {
        String name = null;
        CreateInstancesByNameExecRequest body = null;
        BackgroundOperationResponse response = $( api.postInstancesByNameExec(name, body) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Upload a file to the instance
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postInstancesByNameFilesTest() throws ApiException {
        String name = null;
        String path = null;
        Integer xLXDUid = null;
        Integer xLXDGid = null;
        Integer xLXDMode = null;
        UUID xLXDWrite = null;
        String xLXDType = null;
        File body = null;
        BackgroundOperationResponse response = $( api.postInstancesByNameFiles(name, path, xLXDUid, xLXDGid, xLXDMode, xLXDWrite, xLXDType, body) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Add a container template
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postInstancesByNameMetadataTemplatesTest() throws ApiException {
        String name = null;
        String path = null;
        File body = null;
        BackgroundOperationResponse response = $( api.postInstancesByNameMetadataTemplates(name, path, body) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create a new snapshot
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postInstancesByNameSnapshotTest() throws ApiException {
        String name = null;
        CreateInstancesByNameSnapshotRequest body = null;
        BackgroundOperationResponse response = $( api.postInstancesByNameSnapshot(name, body) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Used to rename/migrate the snapshot
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postInstancesByNameSnapshotsInformationTest() throws ApiException {
        String name = null;
        String snapshotName = null;
        CreateInstancesByNameSnapshotsInformationRequest body = null;
        BackgroundOperationResponse response = $( api.postInstancesByNameSnapshotsInformation(name, snapshotName, body) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Replaces instance configuration or restore snapshot
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putInstancesByNameTest() throws ApiException {
        String name = null;
        UpdateInstancesByNameRequest body = null;
        BackgroundOperationResponse response = $( api.putInstancesByName(name, body) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Replaces instance metadata
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putInstancesByNameMetadataTest() throws ApiException {
        String name = null;
        GetInstancesByNameMetadataResponse body = null;
        BackgroundOperationResponse response = $( api.putInstancesByNameMetadata(name, body) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Replace content of a template
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putInstancesByNameMetadataTemplatesTest() throws ApiException {
        String name = null;
        String path = null;
        File body = null;
        BackgroundOperationResponse response = $( api.putInstancesByNameMetadataTemplates(name, path, body) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update the snapshot
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putInstancesByNameSnapshotsInformationTest() throws ApiException {
        String name = null;
        String snapshotName = null;
        UpdateInstancesByNameSnapshotsInformationRequest body = null;
        BackgroundOperationResponse response = $( api.putInstancesByNameSnapshotsInformation(name, snapshotName, body) );

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Change the instance state
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putInstancesByNameStateTest() throws ApiException {
        String name = null;
        UpdateInstancesByNameStateRequest body = null;
        BackgroundOperationResponse response = $( api.putInstancesByNameState(name, body) );

        // TODO: test validations
    }
    
}