
package org.relxd.lxd.api.trusted;

import com.google.gson.JsonSyntaxException;
import org.junit.After;
import org.junit.jupiter.api.*;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.JSON;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.api.InstancesApi;
import org.relxd.lxd.model.*;
import org.relxd.lxd.model.Properties;
import org.relxd.lxd.service.linuxCmd.LinuxCmdService;
import org.relxd.lxd.service.linuxCmd.LinuxCmdServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.spy;

/**
 * API tests for InstancesApi
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class InstancesApiTest {

    private InstancesApi api;
    private Logger logger;

    private LinuxCmdService linuxCmdService;
    private String unixSocketPath;


    @BeforeAll
    public void setup() {
        linuxCmdService = spy(new LinuxCmdServiceImpl());
        RelxdApiClient relxdApiClient = new RelxdApiClient();
        unixSocketPath = relxdApiClient.getUnixSocketPath();
        api = new InstancesApi();
        logger = LoggerFactory.getLogger(InstancesApiTest.class);

    }

    @After
    public void deleteInstances(){
        deleteInstancesByNameTest();
    }


    /**
     *
     *
     * Remove the instance
     *
     */
    @Test
    public void deleteInstancesByNameTest() {
        String name = "ubuntu18-1";

        try {
            BackgroundOperationResponse response = api.deleteInstancesByName(name);
            logger.info("DELETE INSTANCE BY NAME RESPONSE >>>>>> {}", response);
            assertEquals( Integer.valueOf(100), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }
    }

    /**
     *
     *
     * Remove the backup
     *
     */
    @Test
    public void deleteInstancesByNameBackupsByNameTest() {
        String name = "ubuntu-instance-backup";
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
     */
    @Test
    public void deleteInstancesByNameConsoleTest() {
        String name = "ubuntu-instance";

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
     */
    @Test
    public void deleteInstancesByNameFilesTest() {
        String name = "ubuntu-instance";
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
     */
    @Test
    public void deleteInstancesByNameLogsFileTest() {
        String name = "ubuntu-instance";
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
     */
    @Test
    public void deleteInstancesByNameMetadataTemplatesTest() {
        String name = "ubuntu-instance";
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
     */
    @Test
    public void deleteInstancesByNameSnapshotsInformationTest() {
        String name = "ubuntu-instance";
        String snapshotName = "ubuntu-instance-snapshot";

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
     */
    @Test
    @Order(2)
    public void getInstancesTest() {
        final String getInstancesCommand = "curl -s --unix-socket " + unixSocketPath + " a/1.0/instances";

        Integer recursion = null;
        String filter = null;

        try
        {

            final BackgroundOperationResponse expectedBackgroundOperationResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(getInstancesCommand, BackgroundOperationResponse.class);
            logger.info("Expected Get Instances Response >>>>>>>>>> " + expectedBackgroundOperationResponse);

            final BackgroundOperationResponse actualBackgroundOperationResponse = api.getInstances(recursion, filter);
            logger.info("Actual Get Instances Response >>>>>>>>>> " + actualBackgroundOperationResponse);

            if (actualBackgroundOperationResponse != null){
                final List<String> actualGetInstancesResponseUrls = (List<String>) actualBackgroundOperationResponse.getMetadata();

                logger.info("Metadata >>>>>>> {}", actualGetInstancesResponseUrls);
            }

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
     */
    @Test
    @Order(4)
    public void getInstancesByNameTest() {
        String name = "ubuntu18";
        final String getInstancesByNameCommand = "curl -s --unix-socket " +unixSocketPath+ " a/1.0/instances/" + name;
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
     */
    @Test
    @Order(6)
    public void getInstancesByNameBackupsTest() {
        String getInstancesByNameBackupsCommand = "curl -s --unix-socket " + unixSocketPath + " a/1.0/instances/lxd-instance/backups/ubuntu-instance-backup";
        String name = "ubuntu-instance-backup";
        Integer recursion = null;
        String filter = null;

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
     */
    @Test
    @Order(8)
    public void getInstancesByNameBackupsByNameTest() {
        String name = "ubuntu-instance";
        String backupsName = "ubuntu-instance-backup-rename";
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
     */
    @Test
    @Order(9)
    public void getInstancesByNameBackupsByNameExportTest() {
        String name = "ubuntu-instance";
        String backupsName = "ubuntu-instance-backup";
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
     */
    @Test
    @Order(11)
    public void getInstancesByNameConsoleTest() {
        String name = "ubuntu18";
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getInstancesByNameConsole(name, recursion, filter);
            logger.info("GET INSTANCES BY NAME CONSOLE RESPONSE >>>>> " + response);
            assertEquals(Integer.valueOf(200),response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }
    }

    /**
     *
     *
     * Download a file or directory listing from the instance
     *
     */
    @Test
    @Order(13)
    public void getInstancesByNameFilesTest(){
        String name = "ubuntu-instance";
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
     */
    @Test
    @Order(14)
    public void getInstancesByNameLogsTest() {
        String name = "ubuntu-instance";
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
     */
    @Test
    @Order(15)
    public void getInstancesByNameLogsFileTest() {
        String name = "ubuntu-instance";
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
     */
    @Test
    @Order(26)
    public void getInstancesByNameMetadataTest() {
        String name = "ubuntu-instance";
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getInstancesByNameMetadata(name, recursion, filter);
            logger.info("GET INSTANCES BY NAME METADATA RESPONSE >>>>>> {}", response);

            if (response != null)
            assertEquals(Integer.valueOf(200),response.getStatusCode());

        }catch (ApiException ex){
            catchApiException(ex);
        }
    }

    /**
     *
     *
     * List instance templates
     *
     */
    @Test
    @Order(17)
    public void getInstancesByNameMetadataTemplatesTest() {
        String name = "ubuntu-instance";
        Integer recursion = null;
        String filter = null;
        String path = null;

        try {
            BackgroundOperationResponse response = api.getInstancesByNameMetadataTemplates(name, recursion, filter, path);
            logger.info("GET INSTANCES BY NAME METADATA TEMPLATES RESPONSE >>>>> {}", response);
            if (response != null)
            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }

    /**
     *
     *
     * List of snapshots
     *
     */
    @Test
    @Order(20)
    public void getInstancesByNameSnapshotsTest() {
        String name = "ubuntu-instance";
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
     */
    @Test
    @Order(22)
    public void getInstancesByNameSnapshotsInformationTest() {
        String name = "ubuntu-instance";
        String snapshotName = "ubuntu-instance-snapshot";
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
     */
    @Test
    @Order(24)
    public void getInstancesByNameStateTest(){
        String name = "ubuntu18";
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
     */
    @Test
    @Order(25)
    public void patchInstancesByNameTest(){

        String name = "ubuntu-instance";
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
            assertEquals(Integer.valueOf(100), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }

    /**
     *
     *
     * Create a new instance
     *
     */
    @Test
    @Order(1)
    public void postInstancesTest() {

        String target = null;
        final String architecture = "x86_64";
        final String type = "container";
        final String fingerprint = "1503148c44359a349c17ce7cd4e0e36dae9ff3a44a7777cc1cee993491a73adf";
        final String nameOfContainer = "ubuntu-instance";

        Kvm kvm = new Kvm();
        kvm.setPath("/dev/kvm");
        kvm.setType("unix-char");

        Source source = new Source();
        source.setType("image");
        source.setFingerprint(fingerprint);

        DevicesKvm devices = new DevicesKvm();
        devices.setKvm(kvm);

        CreateInstancesRequestConfig createInstancesRequestConfig = new CreateInstancesRequestConfig();
        createInstancesRequestConfig.setLimitsCpu("2");

        List<String> profiles = new ArrayList<>();
        profiles.add("default");

        CreateInstancesRequest createInstancesRequest = populateCreateInstancesRequest(devices, source, type, profiles, architecture, nameOfContainer, createInstancesRequestConfig,true);

        try {
            BackgroundOperationResponse actualCreateInstancesResponse = api.postInstances(target, createInstancesRequest);
            logger.info("Create Instance Response >>>>>>>>>> " + actualCreateInstancesResponse);
            assertTrue((actualCreateInstancesResponse.getStatusCode() == Integer.valueOf(200)) ||
                    actualCreateInstancesResponse.getStatusCode() == Integer.valueOf(100));

        }catch (ApiException ex){
            catchApiException(ex);
        }
    }


    /**
     *
     *
     * Used to rename/migrate the instance
     *
     */
    @Test
    @Order(3)
    public void postInstancesByNameTest() {

        String name = "ubuntu-instance";
        String target = null;
        CreateInstancesByNameRequest createInstancesByNameRequest = new CreateInstancesByNameRequest();
        createInstancesByNameRequest.setName("another-instance");

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
     */
    @Test
    @Order(5)
    public void postInstancesByNameBackupsTest() {
        String name = "ubuntu-instance";
        CreateInstancesByNameBackupsRequest createInstancesByNameBackupsRequest = new CreateInstancesByNameBackupsRequest();
        createInstancesByNameBackupsRequest.setName("ubuntu-instance-backup");
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
     */
    @Test
    @Order(7)
    public void postInstancesByNameBackupsByNameTest() {
        String name = "ubuntu-instance";
        String backupsName = "ubuntu-instance-backup";
        CreateInstancesByNameBackupsByNameRequest request = new CreateInstancesByNameBackupsByNameRequest();
        request.setName("ubuntu-instance-backup-rename");

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
     */
    @Test
    @Order(10)
    public void postInstancesByNameConsoleTest() {
        String name = "ubuntu-instance";
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
     */
    @Test
    @Order(12)
    public void postInstancesByNameExecTest() {

        final CreateInstancesByNameExecRequest request = populatePostInstancesByNameExecRequest(Arrays.asList("bin", "bash"),new Environment(),true,false,true,80,25);

        try {
            BackgroundOperationResponse response = api.postInstancesByNameExec("ubuntu18", request);

            logger.info("POST INSTANCES BY NAME EXEC RESPONSE >>>>> " + response);
            assertEquals(response.getStatusCode(),Integer.valueOf(100));
        }catch (ApiException e){
            catchApiException(e);
            throw new RuntimeException(e);
        }



    }

    /**
     *
     *
     * Upload a file to the instance
     *
     */
    @Test
    @Order(12)
    public void postInstancesByNameFilesTest() {

        UUID uuid = new UUID(10,00);

        String name = "ubuntu-instance";
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
     */
    @Test
    @Order(16)
    public void postInstancesByNameMetadataTemplatesTest() {
        String name = "ubuntu-instance";
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
     */
    @Test
    @Order(19)
    public void postInstancesByNameSnapshotTest() {
        String name = "ubuntu-instance";
        CreateInstancesByNameSnapshotRequest request = new CreateInstancesByNameSnapshotRequest();
        request.setName("ubuntu-instance-snapshot");
        request.setStateful(true);

        try {
            BackgroundOperationResponse response = api.postInstancesByNameSnapshot(name, request);
            logger.info("POST INSTANCES BY NAME RESPONSE >>>>> " + response);
            assertEquals(Integer.valueOf(100), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }
    }

    /**
     *
     *
     * Used to rename/migrate the snapshot
     *
     */
    @Test
    @Order(21)
    public void postInstancesByNameSnapshotsInformationTest() {
        String name = "ubuntu-instance";
        String snapshotName = "ubuntu-instance-snapshot";
        CreateInstancesByNameSnapshotsInformationRequest request = new CreateInstancesByNameSnapshotsInformationRequest();
        request.setName("ubuntu-instance-snapshot");

        try {

            BackgroundOperationResponse response = api.postInstancesByNameSnapshotsInformation(name, snapshotName, request);
            logger.info("SNAPSHOT INFORMATION RESPONSE >>>>>> ", response);
            assertEquals(Integer.valueOf(100), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }
    }

    /**
     *
     *
     * Replaces instance configuration or restore snapshot
     *
     */
    @Test
    @Order(26)
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
            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }

    /**
     *
     *
     * Replaces instance metadata
     *
     */
    @Test
    @Order(27)
    public void putInstancesByNameMetadataTest() {

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
     */
    @Test
    @Order(28)
    public void putInstancesByNameMetadataTemplatesTest() {
        String name = "ubuntu-instance";
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
     */
    @Test
    @Order(29)
    public void putInstancesByNameSnapshotsInformationTest() {
        String name = "ubuntu-instance";
        String snapshotName = "ubuntu-instance-snapshot";
        UpdateInstancesByNameSnapshotsInformationRequest request = new UpdateInstancesByNameSnapshotsInformationRequest();
        request.setExpiresAt("2020-11-16T12:34:56+02:00");

        try {
            BackgroundOperationResponse response = api.putInstancesByNameSnapshotsInformation(name, snapshotName, request);
            logger.info("PUT INSTANCE BY NAME SNAPSHOT RESPONSE >>>>> " + response);
            assertEquals(Integer.valueOf(200), response.getStatusCode());

        }catch (ApiException ex){
            catchApiException(ex);
        }
    }

    /**
     *
     *
     * Change the instance state
     *
     */
    @Test
    @Order(23)
    public void putInstancesByNameStateTest() {
        putInstancesByNameState("ubuntu18","start");
    }

    public BackgroundOperationResponse putInstancesByNameState(String containerName, String action) {
        UpdateInstancesByNameStateRequest request = new UpdateInstancesByNameStateRequest();
        request.setAction(action);
        request.setForce(false);
        request.setTimeout(new BigDecimal(100));
        request.setStateful(false);

        try {
            BackgroundOperationResponse response = api.putInstancesByNameState(containerName, request);
            logger.info("PUT INSTANCES BY NAME STATE RESPONSE >>>>> " + response);
            assertEquals(response.getStatusCode(),Integer.valueOf(100));

            return response;
        }catch (ApiException ex){
            catchApiException(ex);
            throw new RuntimeException(ex);
        }
    }

    public static CreateInstancesRequest populateCreateInstancesRequest(DevicesKvm devices, Source source, String type, List<String> profiles, String architecture, String name, CreateInstancesRequestConfig createInstancesRequestConfig, Boolean setEphemerial) {
        CreateInstancesRequest createInstancesRequest = new CreateInstancesRequest();
        createInstancesRequest.setName(name);
        createInstancesRequest.setArchitecture(architecture);
        createInstancesRequest.setProfiles(profiles);
        createInstancesRequest.setEphemeral(setEphemerial);
        createInstancesRequest.setConfig(createInstancesRequestConfig);
        createInstancesRequest.setType(type);
        createInstancesRequest.setDevices(devices);
        createInstancesRequest.setSource(source);
        return createInstancesRequest;
    }

    public static CreateInstancesByNameExecRequest populatePostInstancesByNameExecRequest(List<String> command, Environment environment, Boolean waitForWebsocket, Boolean setRecordOutput, Boolean setInteractive, Integer width, Integer height) {
        //Environment environment = new Environment();
        CreateInstancesByNameExecRequest request = new CreateInstancesByNameExecRequest();
        request.setCommand(command);
        request.setEnvironment(environment);
        request.setWaitForWebsocket(true);
        request.setRecordOutput(false);
        request.setInteractive(true);
        request.setWidth(80);
        request.setHeight(25);/*
        request.setUser(1000);
        request.setGroup(1000);
        request.setCwd("/tmp");*/

        return request;

    }

    private ErrorResponse catchApiException(ApiException e) {
        logger.info("Exception >>>> " + e);
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