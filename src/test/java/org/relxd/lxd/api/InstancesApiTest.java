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

import org.junit.Before;
import org.junit.Test;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.JSON;
import org.relxd.lxd.model.*;
import org.relxd.lxd.service.linuxCmd.LinuxCmdService;
import org.relxd.lxd.service.linuxCmd.LinuxCmdServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.spy;

/**
 * API tests for InstancesApi
 */

public class InstancesApiTest {

    private final InstancesApi api = new InstancesApi();
    private final Logger logger = LoggerFactory.getLogger(InstancesApiTest.class);

    private LinuxCmdService linuxCmdService;

    @Before
    public void setup() {

        linuxCmdService = spy(new LinuxCmdServiceImpl());
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
        String name = "";

        try {
            BackgroundOperationResponse response = api.deleteInstancesByName(name);
            logger.info("DELETE INSTANCE BY NAME RESPONSE >>>>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }
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
        String name = "";
        String backupsName = "";

        try {
            BackgroundOperationResponse response = api.deleteInstancesByNameBackupsByName(name, backupsName);
            logger.info("DELETE INSTANCES BY NAME BACKUPS RESPONSE >>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }

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
        String name = "";

        try {
            api.deleteInstancesByNameConsole(name);
        }catch (ApiException ex){
            catchApiException(ex);
        }

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
        String name = "";
        String path = "";

        try{
            BackgroundOperationResponse response = api.deleteInstancesByNameFiles(name, path);
            logger.info("DELETE INSTANCES BY NAME FILES RESPONSE >>>>>> {}", response);
            assertEquals(response.getStatusCode(),Integer.valueOf(100));
        }catch (ApiException ex){
            catchApiException(ex);
        }

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
        String name = "";
        String logFile = "";

        try {
            BackgroundOperationResponse response = api.deleteInstancesByNameLogsFile(name, logFile);
            logger.info("DELETE FILES BY NAME LOGS FILE RESPONSE >>>>> {}", response);
            assertEquals(response.getStatusCode(),Integer.valueOf(100));
        }catch (ApiException ex){
            catchApiException(ex);
        }

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
    public void deleteInstancesByNameMetadataTemplatesTest() {
        String name = "";
        String path = "";

        try {
            BackgroundOperationResponse response = api.deleteInstancesByNameMetadataTemplates(name, path);
            logger.info("DELETE INSTANCES BY NAME METADATA TEMPLATES >>>>>> {}", response);
            assertEquals(response.getStatusCode(),Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }


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
        String name = "";
        String snapshotName = "";

        try {
            BackgroundOperationResponse response = api.deleteInstancesByNameSnapshotsInformation(name, snapshotName);
            logger.info("DELETE INSTANCES BY NAME SNAPSHOTS INFORMATION RESPONSE >>>>>>> {}", response);
            assertEquals(response.getStatusCode(),Integer.valueOf(100));
        }catch (ApiException ex){
            catchApiException(ex);
        }

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
    public void getInstancesTest() {
        final String getInstancesCommand = "curl -s --unix-socket /var/snap/lxd/common/lxd/unix.socket a/1.0/instances";

        Integer recursion = null;
        String filter = null;

        try
        {

            final BackgroundOperationResponse expectedBackgroundOperationResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(getInstancesCommand, BackgroundOperationResponse.class);
            logger.info("Expected Get Instances Response >>>>>>>>>> " + expectedBackgroundOperationResponse);

            final BackgroundOperationResponse actualBackgroundOperationResponse = api.getInstances(recursion, filter);
            logger.info("Actual Get Instances Response >>>>>>>>>> " + actualBackgroundOperationResponse);

            assertEquals(expectedBackgroundOperationResponse, actualBackgroundOperationResponse);

        } catch (IOException | InterruptedException e)
        {
            e.printStackTrace();
        } catch (ApiException ex){
            catchApiException(ex);
        }

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
        final String getInstancesByNameCommand = "curl -s --unix-socket /var/snap/lxd/common/lxd/unix.socket a/1.0/instances/my-ubuntu-instance";
        String name = "my-ubuntu-instance";
        Integer recursion = null;
        String filter = null;

        try
        {

            final BackgroundOperationResponse expectedInstancesByNameResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(getInstancesByNameCommand, BackgroundOperationResponse.class);
            logger.info("Expected Get Instances Response >>>>>>>>>> " + expectedInstancesByNameResponse);

            final BackgroundOperationResponse actualInstancesByNameResponse = api.getInstancesByName(name,recursion, filter);
            logger.info("Actual Get Instances Response >>>>>>>>>> " + actualInstancesByNameResponse);

            assertEquals(expectedInstancesByNameResponse, actualInstancesByNameResponse);

        } catch (IOException | InterruptedException e)
        {
            e.printStackTrace();
        }catch (ApiException ex){
            catchApiException(ex);
        }

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
        String getInstancesByNameBackupsCommand = "curl -s --unix-socket /var/snap/lxd/common/lxd/unix.socket a/1.0/instances/lxd-instance/backups";
        String name = "lxd-instance";
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = api.getInstancesByNameBackups(name, recursion, filter);

        try {

            final BackgroundOperationResponse expectedInstancesByNameResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(getInstancesByNameBackupsCommand, BackgroundOperationResponse.class);
            logger.info("Expected Get Instances Response >>>>>>>>>> " + expectedInstancesByNameResponse);

            final BackgroundOperationResponse actualInstancesByNameResponse = api.getInstancesByNameBackups(name, recursion, filter);
            logger.info("Actual Get Instances Response >>>>>>>>>> " + actualInstancesByNameResponse);

            assertEquals(expectedInstancesByNameResponse, actualInstancesByNameResponse);
        } catch (IOException | InterruptedException e){
            e.printStackTrace();
        }catch (ApiException ex){
            catchApiException(ex);
        }


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
        String name = "lxd-instance";
        String backupsName = "lxd-instance-backup";
        Integer recursion = null;
        String filter = null;

        try{
        BackgroundOperationResponse response = api.getInstancesByNameBackupsByName(name, backupsName, recursion, filter);
        logger.info("GET INSTANCES BY NAME BACKUPS BY NAME RESPONSE >>>> " + response);
        assertEquals(response.getStatusCode(),Integer.valueOf(200));
        } catch (ApiException ex){
            catchApiException(ex);
        }
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
        String name = "lxd-instance";
        String backupsName = "lxd-instance-backup";
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getInstancesByNameBackupsByNameExport(name, backupsName, recursion, filter);
            logger.info("Get Instances By Name Backups By Name Export Response >>>>> " + response);
        }catch (ApiException ex){
            catchApiException(ex);
        }
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
    public void getInstancesByNameConsoleTest() {
        String name = "lxd-sdk";
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getInstancesByNameConsole(name, recursion, filter);
            logger.info("GET INSTANCES BY NAME CONSOLE RESPONSE >>>>> " + response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }
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
    public void getInstancesByNameFilesTest(){
        String name = "lxd-instance";
        Integer recursion = null;
        String filter = null;
        String path = "/";
        Integer xLXDUid = null;
        Integer xLXDGid = null;
        Integer xLXDMode = null;
        UUID xLXDType = null;

        try {
            RawFile response = api.getInstancesByNameFiles(name, recursion, filter, path, xLXDUid, xLXDGid, xLXDMode, xLXDType);
            logger.info("GET INSTANCES BY NAME FILES >>>>> {}", response);
            assertEquals(response.getStatusCode(),Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }

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
        String name = "lxd-instance";
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getInstancesByNameLogs(name, recursion, filter);
            logger.info("GET INSTANCES BY NAME LOGS RESPONSE >>>>> {}" , response);
            assertEquals(response.getStatusCode(),Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }
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
    public void getInstancesByNameLogsFileTest() {
        String name = "lxd-instance";
        String logFile = "lxc.log";
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getInstancesByNameLogsFile(name, logFile, recursion, filter);
            logger.info("INSTANCES BY NAME LOGS FILE RESPONSE >>>>> {}", response);
            if (response != null)
            assertEquals(response.getStatusCode(),Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }
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
    public void getInstancesByNameMetadataTest() {
        String name = "lxd-instance";
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getInstancesByNameMetadata(name, recursion, filter);
            logger.info("GET INSTANCES BY NAME METADATA RESPONSE >>>>>> {}", response);
            assertEquals(response.getStatusCode(),Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }
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
    public void getInstancesByNameMetadataTemplatesTest() {
        String name = "lxd-instance";
        Integer recursion = null;
        String filter = null;
        String path = null;

        try {
            BackgroundOperationResponse response = api.getInstancesByNameMetadataTemplates(name, recursion, filter, path);
            logger.info("GET INSTANCES BY NAME METADATA TEMPLATES RESPONSE >>>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }

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
    public void getInstancesByNameSnapshotsTest() {
        String name = "lxd-instance";
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getInstancesByNameSnapshots(name, recursion, filter);
            logger.info("GET INSTANCES BY NAME SNAPSHOTS >>>>> {} ", response);
            assertEquals(response.getStatusCode(),Integer.valueOf(200));
        }catch (ApiException ex){
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
    public void getInstancesByNameSnapshotsInformationTest() {
        String name = "lxd-instance";
        String snapshotName = "lxd-instance-snapshot";
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getInstancesByNameSnapshotsInformation(name, snapshotName, recursion, filter);
            logger.info("GET INSTANCES BY NAME SNAPSHOTS INFORMATION RESPONSE >>>>> {}", response);
            assertEquals(response.getStatusCode(),Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }
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
    public void getInstancesByNameStateTest(){
        String name = "my-ubuntu-instance";
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getInstancesByNameState(name, recursion, filter);
            logger.info("GET INSTANCE BY NAME STATE TEST >>>>>>>> " + response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }
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
    public void patchInstancesByNameTest(){

        String name = "lxd-instance";
        CpuConfig cpuConfig = new CpuConfig();
        cpuConfig.setLimitsCpu("2");

        Root2 root2 = new Root2();
        root2.setPath("/");
        root2.setPool("default");
        root2.setSize("5GB");

        Devices3 devices3 = new Devices3();
        devices3.setRoot(root2);

        PatchInstancesByNameRequest request = new PatchInstancesByNameRequest();
        request.setConfig(cpuConfig);
        request.setDevices(devices3);
        request.setEphemeral(true);


        try{
            BackgroundOperationResponse response = api.patchInstancesByName(name, request);
            logger.info("PATCH INSTANCES BY NAME RESPONSE >>>>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }

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
    public void postInstancesTest() {
        String target = null;

        Kvm kvm = new Kvm();
        kvm.setPath("/dev/kvm");
        kvm.setType("unix-char");

        Source source = new Source();
        source.setType("none");

        DevicesKvm devices = new DevicesKvm();
        devices.setKvm(kvm);

        CreateInstancesRequestConfig createInstancesRequestConfig = new CreateInstancesRequestConfig();
        createInstancesRequestConfig.setLimitsCpu("2");

        List<String> profiles = new ArrayList<>();
        profiles.add("default");

        CreateInstancesRequest createInstancesRequest = new CreateInstancesRequest();
        createInstancesRequest.setName("another-ubuntu-instance");
        createInstancesRequest.setArchitecture("x86_64");
        createInstancesRequest.setProfiles(profiles);
        createInstancesRequest.setEphemeral(true);
        createInstancesRequest.setConfig(createInstancesRequestConfig);
        createInstancesRequest.setType("container");
        createInstancesRequest.setDevices(devices);
        createInstancesRequest.setSource(source);

        try {
            BackgroundOperationResponse actualCreateInstancesResponse = api.postInstances(target, createInstancesRequest);
            logger.info("Create Instance Response >>>>>>>>>> " + actualCreateInstancesResponse);
            assertEquals(actualCreateInstancesResponse.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }

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
    public void postInstancesByNameTest() {
        String name = "another-ubuntu-instance";
        String target = null;
        CreateInstancesByNameRequest createInstancesByNameRequest = new CreateInstancesByNameRequest();
        createInstancesByNameRequest.setName("another-ubuntu-instance-1");

        try {
            BackgroundOperationResponse response = api.postInstancesByName(name, target, createInstancesByNameRequest);
            logger.info("RESPONSE >>>>>>>>> " + response);
            assertEquals(response.getStatusCode(), Integer.valueOf(100));
        }catch (ApiException ex){
            catchApiException(ex);
        }

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
    public void postInstancesByNameBackupsTest() {
        String name = "lxd-instance";
        CreateInstancesByNameBackupsRequest createInstancesByNameBackupsRequest = new CreateInstancesByNameBackupsRequest();
        createInstancesByNameBackupsRequest.setName("lxd-instance-backup");
        createInstancesByNameBackupsRequest.setExpiry(new BigDecimal(3600));
        createInstancesByNameBackupsRequest.setInstanceOnly(true);
        createInstancesByNameBackupsRequest.setOptimizedStorage(true);

        try {
            BackgroundOperationResponse response = api.postInstancesByNameBackups(name, createInstancesByNameBackupsRequest);
            logger.info("POST INSTANCE BACKUP RESPONSE >>>>> " + response);
            assertEquals(response.getStatusCode(), Integer.valueOf(100));
        }catch (ApiException ex){
            catchApiException(ex);
        }

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
    public void postInstancesByNameBackupsByNameTest() {
        String name = "lxd-instance";
        String backupsName = "lxd-instance-backup-rename";
        CreateInstancesByNameBackupsByNameRequest request = new CreateInstancesByNameBackupsByNameRequest();
        request.setName("lxd-instance-backup-rename");

        try {
            BackgroundOperationResponse response = api.postInstancesByNameBackupsByName(name, backupsName, request);
            logger.info("POST INSTANCES BY NAME BACKUPS BY NAME RESPONSE >>>>> " + response);
            assertEquals(response.getStatusCode(), Integer.valueOf(100));
        }catch (ApiException ex){
            catchApiException(ex);
        }
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
    public void postInstancesByNameConsoleTest() {
        String name = "lxd-instance";
        CreateInstancesByNameConsoleRequest request = new CreateInstancesByNameConsoleRequest();
        request.setWidth(80);
        request.setHeight(25);
        request.setType("console");

        try {
            BackgroundOperationResponse response = api.postInstancesByNameConsole(name, request);
            assertEquals(response.getStatusCode(), Integer.valueOf(100));
            logger.info("POST INSTANCES BY NAME CONSOLE RESPONSE >>>> " + response);
        }catch (ApiException e){
            catchApiException(e);
        }
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
    public void postInstancesByNameExecTest() {
        String name = "lxd-instance";
        List<String> command = new ArrayList<>();
        command.add("/bin/bash");
        Environment environment = new Environment();
        CreateInstancesByNameExecRequest request = new CreateInstancesByNameExecRequest();
        request.setCommand(command);
        request.setEnvironment(environment);
        request.setWaitForWebsocket(false);
        request.setRecordOutput(false);
        request.setInteractive(true);
        request.setWidth(80);
        request.setHeight(25);
        request.setUser(1000);
        request.setGroup(1000);
        request.setCwd("/tmp");

        try {
            BackgroundOperationResponse response = api.postInstancesByNameExec(name, request);
            logger.info("POST INSTANCES BY NAME RESPONSE >>>>> " + response);
            assertEquals(response.getStatusCode(),Integer.valueOf(100));
        }catch (ApiException e){
            catchApiException(e);
        }

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
    public void postInstancesByNameFilesTest() {

        UUID uuid = new UUID(10,00);

        String name = "lxd-instance";
        String path = "/data";
        Integer xLXDUid = 0;
        Integer xLXDGid = 0;
        Integer xLXDMode = 0700;
        UUID xLXDWrite = uuid;
        String xLXDType = "file";

        try {
            File body = new File("./myfile");
            BackgroundOperationResponse response = api.postInstancesByNameFiles(name, path, xLXDUid, xLXDGid, xLXDMode, xLXDWrite, xLXDType, body);
            logger.info("POST INSTANCES BY NAME FILES RESPONSE >>>> " + response);
            assertEquals(response.getStatusCode(),Integer.valueOf(100));
        }
        catch (ApiException e){
            catchApiException(e);
        }
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
    public void postInstancesByNameMetadataTemplatesTest() {
        String name = "lxd-instance";
        String path = "";
        File body = new File("");

        try {
            BackgroundOperationResponse response = api.postInstancesByNameMetadataTemplates(name, path, body);
            logger.info("POST INSTANCES BY NAME METADATA RESPONSE >>>>> " + response);
        }catch (ApiException ex){
            catchApiException(ex);
        }
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
    public void postInstancesByNameSnapshotTest() {
        String name = "lxd-instance";
        CreateInstancesByNameSnapshotRequest request = new CreateInstancesByNameSnapshotRequest();
        request.setName("lxd-instance-snapshot");
        request.setStateful(true);

        try {
            BackgroundOperationResponse response = api.postInstancesByNameSnapshot(name, request);
            logger.info("POST INSTANCES BY NAME RESPONSE >>>>> " + response);
            assertEquals(response.getStatusCode(), Integer.valueOf(100));
        }catch (ApiException ex){
            catchApiException(ex);
        }
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
    public void postInstancesByNameSnapshotsInformationTest() {
        String name = "lxd-instance";
        String snapshotName = "lxd-instance-snapshot";
        CreateInstancesByNameSnapshotsInformationRequest request = new CreateInstancesByNameSnapshotsInformationRequest();
        request.setName("lxd-instance-snapshot");

        try {

            BackgroundOperationResponse response = api.postInstancesByNameSnapshotsInformation(name, snapshotName, request);
            logger.info("SNAPSHOT INFORMATION RESPONSE >>>>>> ", response);
            assertEquals(response.getStatusCode(),Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }
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
    public void putInstancesByNameTest() {

        HardwareSpecsConfig hardwareSpecsConfig = new HardwareSpecsConfig();
        hardwareSpecsConfig.setLimitsCpu("2");
        hardwareSpecsConfig.setVolatileBaseImage("97d97a3d1d053840ca19c86cdd0596cf1be060c5157d31407f2a4f9f350c78cc");
        hardwareSpecsConfig.setVolatileEth0Hwaddr("00:16:3e:b0:84:28");

        Root root = new Root();
        root.setPath("/");
        root.setType("disk");
        DevicesRoot devicesRoot = new DevicesRoot();
        devicesRoot.setRoot(root);

        List<String> profiles = new ArrayList<>();
        profiles.add("default");

        String name = "lxd-instance";
        UpdateInstancesByNameRequest request = new UpdateInstancesByNameRequest();
        request.setArchitecture("x86_64");
        request.setConfig(hardwareSpecsConfig);
        request.setDevices(devicesRoot);
        request.setEphemeral(true);
        request.setProfiles(profiles);

        try {
            BackgroundOperationResponse response = api.putInstancesByName(name, request);
            logger.info("PUT INSTANCES BY NAME RESPONSE >>>>>>> " + response);
            assertEquals(response.getStatusCode(),Integer.valueOf(100));
        }catch (ApiException ex){
            catchApiException(ex);
        }

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

        Properties2 properties2 = new Properties2();
        properties2.setArchitecture("x86_64");
        properties2.setDescription("BusyBox x86_64");
        properties2.setName("busybox-x86_64");
        properties2.setOs("BusyBox");

        List<String> when = new ArrayList<>();
        when.add("");

        Template template = new Template();
        template.setCreateOnly(false);
        template.setTemplate("template.tpl");
        template.setWhen(when);
        template.setProperties(new Properties());

        Templates templates = new Templates();
        templates.setTemplate(template);

        String name = "lxd-instance";
        GetInstancesByNameMetadataResponse request = new GetInstancesByNameMetadataResponse();
        request.setArchitecture("x86_64");
        request.setCreationDate(new BigDecimal(1477146654));
        request.setExpiryDate(new BigDecimal(0));
        request.setProperties(properties2);
        request.setTemplates(templates);

        try {
            BackgroundOperationResponse response = api.putInstancesByNameMetadata(name, request);
            logger.info("PUT INSTANCES BY NAME METADATA RESPONSE >>>>> " + response);
            assertEquals(response.getStatusCode(),Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }

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
        String name = "lxd-instance";
        String path = "/";
        File body = new File("./");

        try {
            BackgroundOperationResponse response = api.putInstancesByNameMetadataTemplates(name, path, body);
            logger.info("PUT INSTANCES BY NAME METADATA TEMPLATES >>>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }
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
        String name = "lxd-instance";
        String snapshotName = "lxd-instance-snapshot";
        UpdateInstancesByNameSnapshotsInformationRequest request = new UpdateInstancesByNameSnapshotsInformationRequest();
        request.setExpiresAt("2020-11-16T12:34:56+02:00");

        try {
            BackgroundOperationResponse response = api.putInstancesByNameSnapshotsInformation(name, snapshotName, request);
            logger.info("PUT INSTANCE BY NAME SNAPSHOT RESPONSE >>>>> " + response);
            assertEquals(response.getStatusCode(), Integer.valueOf(100));

        }catch (ApiException ex){
            catchApiException(ex);
        }
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

        String name = "lxd-instance";
        UpdateInstancesByNameStateRequest request = new UpdateInstancesByNameStateRequest();
        request.setAction("start");
        request.setForce(true);
        request.setTimeout(new BigDecimal(30));
        request.setStateful(true);

        try {
            BackgroundOperationResponse response = api.putInstancesByNameState(name, request);
            logger.info("PUT INSTANCES BY NAME STATE RESPONSE >>>>> " + response);
            assertEquals(response.getStatusCode(),Integer.valueOf(100));
        }catch (ApiException ex){
            catchApiException(ex);
        }


    }

    private ErrorResponse catchApiException(ApiException e) {
        JSON json = new JSON();

        final ErrorResponse errorResponse = json.deserialize(e.getResponseBody(), ErrorResponse.class);
        logger.info("ERROR RESPONSE >>>> " + errorResponse);
        return errorResponse;
    }

}