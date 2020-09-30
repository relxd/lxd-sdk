# Relxd - LXD OpenApi Java Client

LXD
- API version: 1.0.0
  - Build date: 2020-09-30T13:16:18.308214+01:00[Europe/London]

The services listed below are referred as .....

  For more information, please visit [https://www.relxd.org/](https://www.relxd.org/)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.relxd</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.relxd:openapi-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.CertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    CertificatesApi apiInstance = new CertificatesApi(defaultClient);
    String fingerprint = "fingerprint_example"; // String | Unique fingerprint
    try {
      BasicStandardReturnValueResponse result = apiInstance.deleteFingerprint(fingerprint);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatesApi#deleteFingerprint");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://lxd.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CertificatesApi* | [**deleteFingerprint**](docs/CertificatesApi.md#deleteFingerprint) | **DELETE** /1.0/certificates/{fingerprint} | 
*CertificatesApi* | [**getCertificates**](docs/CertificatesApi.md#getCertificates) | **GET** /1.0/certificates | 
*CertificatesApi* | [**getFingerprint**](docs/CertificatesApi.md#getFingerprint) | **GET** /1.0/certificates/{fingerprint} | 
*CertificatesApi* | [**patchFingerprint**](docs/CertificatesApi.md#patchFingerprint) | **PATCH** /1.0/certificates/{fingerprint} | 
*CertificatesApi* | [**postCertificates**](docs/CertificatesApi.md#postCertificates) | **POST** /1.0/certificates | 
*CertificatesApi* | [**putFingerprint**](docs/CertificatesApi.md#putFingerprint) | **PUT** /1.0/certificates/{fingerprint} | 
*ClusterApi* | [**deleteClusterMembersByName**](docs/ClusterApi.md#deleteClusterMembersByName) | **DELETE** /1.0/cluster/members/{name} | 
*ClusterApi* | [**getCluster**](docs/ClusterApi.md#getCluster) | **GET** /1.0/cluster | 
*ClusterApi* | [**getClusterMembers**](docs/ClusterApi.md#getClusterMembers) | **GET** /1.0/cluster/members | 
*ClusterApi* | [**getClusterMembersByName**](docs/ClusterApi.md#getClusterMembersByName) | **GET** /1.0/cluster/members/{name} | 
*ClusterApi* | [**postClusterMembersByName**](docs/ClusterApi.md#postClusterMembersByName) | **POST** /1.0/cluster/members/{name} | 
*ClusterApi* | [**putCluster**](docs/ClusterApi.md#putCluster) | **PUT** /1.0/cluster | 
*EventsApi* | [**getEvents**](docs/EventsApi.md#getEvents) | **GET** /1.0/events | 
*ImagesApi* | [**deleteImagesAliasesByName**](docs/ImagesApi.md#deleteImagesAliasesByName) | **DELETE** /1.0/images/aliases/{name} | 
*ImagesApi* | [**deleteImagesFingerprint**](docs/ImagesApi.md#deleteImagesFingerprint) | **DELETE** /1.0/images/{fingerprint} | 
*ImagesApi* | [**getImages**](docs/ImagesApi.md#getImages) | **GET** /1.0/images | 
*ImagesApi* | [**getImagesAliases**](docs/ImagesApi.md#getImagesAliases) | **GET** /1.0/images/aliases | 
*ImagesApi* | [**getImagesAliasesByName**](docs/ImagesApi.md#getImagesAliasesByName) | **GET** /1.0/images/aliases/{name} | 
*ImagesApi* | [**getImagesFingerprint**](docs/ImagesApi.md#getImagesFingerprint) | **GET** /1.0/images/{fingerprint} | 
*ImagesApi* | [**getImagesFingerprintExport**](docs/ImagesApi.md#getImagesFingerprintExport) | **GET** /1.0/images/{fingerprint}/export | 
*ImagesApi* | [**getImagesFingerprintRefresh**](docs/ImagesApi.md#getImagesFingerprintRefresh) | **GET** /1.0/images/{fingerprint}/refresh | 
*ImagesApi* | [**patchImagesAliasesByName**](docs/ImagesApi.md#patchImagesAliasesByName) | **PATCH** /1.0/images/aliases/{name} | 
*ImagesApi* | [**patchImagesFingerprint**](docs/ImagesApi.md#patchImagesFingerprint) | **PATCH** /1.0/images/{fingerprint} | 
*ImagesApi* | [**postImages**](docs/ImagesApi.md#postImages) | **POST** /1.0/images | 
*ImagesApi* | [**postImagesAliases**](docs/ImagesApi.md#postImagesAliases) | **POST** /1.0/images/aliases | 
*ImagesApi* | [**postImagesAliasesByName**](docs/ImagesApi.md#postImagesAliasesByName) | **POST** /1.0/images/aliases/{name} | 
*ImagesApi* | [**postImagesFingerprintExport**](docs/ImagesApi.md#postImagesFingerprintExport) | **POST** /1.0/images/{fingerprint}/export | 
*ImagesApi* | [**postImagesFingerprintSecret**](docs/ImagesApi.md#postImagesFingerprintSecret) | **POST** /1.0/images/{fingerprint}/secret | 
*ImagesApi* | [**putImagesAliasesByName**](docs/ImagesApi.md#putImagesAliasesByName) | **PUT** /1.0/images/aliases/{name} | 
*ImagesApi* | [**putImagesFingerprint**](docs/ImagesApi.md#putImagesFingerprint) | **PUT** /1.0/images/{fingerprint} | 
*InstancesApi* | [**deleteInstancesByName**](docs/InstancesApi.md#deleteInstancesByName) | **DELETE** /1.0/instances/{name} | 
*InstancesApi* | [**deleteInstancesByNameBackupsByName**](docs/InstancesApi.md#deleteInstancesByNameBackupsByName) | **DELETE** /1.0/instances/{name}/backups/{backupsName} | 
*InstancesApi* | [**deleteInstancesByNameConsole**](docs/InstancesApi.md#deleteInstancesByNameConsole) | **DELETE** /1.0/instances/{name}/console | 
*InstancesApi* | [**deleteInstancesByNameFiles**](docs/InstancesApi.md#deleteInstancesByNameFiles) | **DELETE** /1.0/instances/{name}/files | 
*InstancesApi* | [**deleteInstancesByNameLogsFile**](docs/InstancesApi.md#deleteInstancesByNameLogsFile) | **DELETE** /1.0/instances/{name}/logs/{logFile} | 
*InstancesApi* | [**deleteInstancesByNameMetadataTemplates**](docs/InstancesApi.md#deleteInstancesByNameMetadataTemplates) | **DELETE** /1.0/instances/{name}/metadata/templates | 
*InstancesApi* | [**deleteInstancesByNameSnapshotsInformation**](docs/InstancesApi.md#deleteInstancesByNameSnapshotsInformation) | **DELETE** /1.0/instances/{name}/snapshots/{snapshotName} | 
*InstancesApi* | [**getInstances**](docs/InstancesApi.md#getInstances) | **GET** /1.0/instances | 
*InstancesApi* | [**getInstancesByName**](docs/InstancesApi.md#getInstancesByName) | **GET** /1.0/instances/{name} | 
*InstancesApi* | [**getInstancesByNameBackups**](docs/InstancesApi.md#getInstancesByNameBackups) | **GET** /1.0/instances/{name}/backups | 
*InstancesApi* | [**getInstancesByNameBackupsByName**](docs/InstancesApi.md#getInstancesByNameBackupsByName) | **GET** /1.0/instances/{name}/backups/{backupsName} | 
*InstancesApi* | [**getInstancesByNameBackupsByNameExport**](docs/InstancesApi.md#getInstancesByNameBackupsByNameExport) | **GET** /1.0/instances/{name}/backups/{backupsName}/export | 
*InstancesApi* | [**getInstancesByNameConsole**](docs/InstancesApi.md#getInstancesByNameConsole) | **GET** /1.0/instances/{name}/console | 
*InstancesApi* | [**getInstancesByNameFiles**](docs/InstancesApi.md#getInstancesByNameFiles) | **GET** /1.0/instances/{name}/files | 
*InstancesApi* | [**getInstancesByNameLogs**](docs/InstancesApi.md#getInstancesByNameLogs) | **GET** /1.0/instances/{name}/logs | 
*InstancesApi* | [**getInstancesByNameLogsFile**](docs/InstancesApi.md#getInstancesByNameLogsFile) | **GET** /1.0/instances/{name}/logs/{logFile} | 
*InstancesApi* | [**getInstancesByNameMetadata**](docs/InstancesApi.md#getInstancesByNameMetadata) | **GET** /1.0/instances/{name}/metadata | 
*InstancesApi* | [**getInstancesByNameMetadataTemplates**](docs/InstancesApi.md#getInstancesByNameMetadataTemplates) | **GET** /1.0/instances/{name}/metadata/templates | 
*InstancesApi* | [**getInstancesByNameSnapshots**](docs/InstancesApi.md#getInstancesByNameSnapshots) | **GET** /1.0/instances/{name}/snapshots | 
*InstancesApi* | [**getInstancesByNameSnapshotsInformation**](docs/InstancesApi.md#getInstancesByNameSnapshotsInformation) | **GET** /1.0/instances/{name}/snapshots/{snapshotName} | 
*InstancesApi* | [**getInstancesByNameState**](docs/InstancesApi.md#getInstancesByNameState) | **GET** /1.0/instances/{name}/state | 
*InstancesApi* | [**patchInstancesByName**](docs/InstancesApi.md#patchInstancesByName) | **PATCH** /1.0/instances/{name} | 
*InstancesApi* | [**postInstances**](docs/InstancesApi.md#postInstances) | **POST** /1.0/instances | 
*InstancesApi* | [**postInstancesByName**](docs/InstancesApi.md#postInstancesByName) | **POST** /1.0/instances/{name} | 
*InstancesApi* | [**postInstancesByNameBackups**](docs/InstancesApi.md#postInstancesByNameBackups) | **POST** /1.0/instances/{name}/backups | 
*InstancesApi* | [**postInstancesByNameBackupsByName**](docs/InstancesApi.md#postInstancesByNameBackupsByName) | **POST** /1.0/instances/{name}/backups/{backupsName} | 
*InstancesApi* | [**postInstancesByNameConsole**](docs/InstancesApi.md#postInstancesByNameConsole) | **POST** /1.0/instances/{name}/console | 
*InstancesApi* | [**postInstancesByNameExec**](docs/InstancesApi.md#postInstancesByNameExec) | **POST** /1.0/instances/{name}/exec | 
*InstancesApi* | [**postInstancesByNameFiles**](docs/InstancesApi.md#postInstancesByNameFiles) | **POST** /1.0/instances/{name}/files | 
*InstancesApi* | [**postInstancesByNameMetadataTemplates**](docs/InstancesApi.md#postInstancesByNameMetadataTemplates) | **POST** /1.0/instances/{name}/metadata/templates | 
*InstancesApi* | [**postInstancesByNameSnapshot**](docs/InstancesApi.md#postInstancesByNameSnapshot) | **POST** /1.0/instances/{name}/snapshots | 
*InstancesApi* | [**postInstancesByNameSnapshotsInformation**](docs/InstancesApi.md#postInstancesByNameSnapshotsInformation) | **POST** /1.0/instances/{name}/snapshots/{snapshotName} | 
*InstancesApi* | [**putInstancesByName**](docs/InstancesApi.md#putInstancesByName) | **PUT** /1.0/instances/{name} | 
*InstancesApi* | [**putInstancesByNameMetadata**](docs/InstancesApi.md#putInstancesByNameMetadata) | **PUT** /1.0/instances/{name}/metadata | 
*InstancesApi* | [**putInstancesByNameMetadataTemplates**](docs/InstancesApi.md#putInstancesByNameMetadataTemplates) | **PUT** /1.0/instances/{name}/metadata/templates | 
*InstancesApi* | [**putInstancesByNameSnapshotsInformation**](docs/InstancesApi.md#putInstancesByNameSnapshotsInformation) | **PUT** /1.0/instances/{name}/snapshots/{snapshotName} | 
*InstancesApi* | [**putInstancesByNameState**](docs/InstancesApi.md#putInstancesByNameState) | **PUT** /1.0/instances/{name}/state | 
*LxdApi* | [**getApiList**](docs/LxdApi.md#getApiList) | **GET** / | 
*LxdApi* | [**getServerState**](docs/LxdApi.md#getServerState) | **GET** /1.0/ | 
*LxdApi* | [**patchServerState**](docs/LxdApi.md#patchServerState) | **PATCH** /1.0/ | 
*LxdApi* | [**putServerState**](docs/LxdApi.md#putServerState) | **PUT** /1.0/ | 
*NetworksApi* | [**deleteNetworksByName**](docs/NetworksApi.md#deleteNetworksByName) | **DELETE** /1.0/networks/{name} | 
*NetworksApi* | [**deleteNetworksUUID**](docs/NetworksApi.md#deleteNetworksUUID) | **DELETE** /1.0/networks/{uuid} | 
*NetworksApi* | [**getNetworks**](docs/NetworksApi.md#getNetworks) | **GET** /1.0/networks | 
*NetworksApi* | [**getNetworksByName**](docs/NetworksApi.md#getNetworksByName) | **GET** /1.0/networks/{name} | 
*NetworksApi* | [**getNetworksByNameState**](docs/NetworksApi.md#getNetworksByNameState) | **GET** /1.0/networks/{name}/state | 
*NetworksApi* | [**getNetworksUUID**](docs/NetworksApi.md#getNetworksUUID) | **GET** /1.0/networks/{uuid} | 
*NetworksApi* | [**getNetworksUUIDWait**](docs/NetworksApi.md#getNetworksUUIDWait) | **GET** /1.0/networks/{uuid}/wait | 
*NetworksApi* | [**getNetworksUUIDWebsocket**](docs/NetworksApi.md#getNetworksUUIDWebsocket) | **GET** /1.0/networks/{uuid}/websocket | 
*NetworksApi* | [**patchNetworksByName**](docs/NetworksApi.md#patchNetworksByName) | **PATCH** /1.0/networks/{name} | 
*NetworksApi* | [**postNetworks**](docs/NetworksApi.md#postNetworks) | **POST** /1.0/networks | 
*NetworksApi* | [**postNetworksByName**](docs/NetworksApi.md#postNetworksByName) | **POST** /1.0/networks/{name} | 
*NetworksApi* | [**putNetworksByName**](docs/NetworksApi.md#putNetworksByName) | **PUT** /1.0/networks/{name} | 
*OperationsApi* | [**getOperations**](docs/OperationsApi.md#getOperations) | **GET** /1.0/operations | 
*ProfilesApi* | [**deleteProfilesByName**](docs/ProfilesApi.md#deleteProfilesByName) | **DELETE** /1.0/profiles/{name} | 
*ProfilesApi* | [**getProfiles**](docs/ProfilesApi.md#getProfiles) | **GET** /1.0/profiles | 
*ProfilesApi* | [**getProfilesByName**](docs/ProfilesApi.md#getProfilesByName) | **GET** /1.0/profiles/{name} | 
*ProfilesApi* | [**patchProfilesByName**](docs/ProfilesApi.md#patchProfilesByName) | **PATCH** /1.0/profiles/{name} | 
*ProfilesApi* | [**postProfiles**](docs/ProfilesApi.md#postProfiles) | **POST** /1.0/profiles | 
*ProfilesApi* | [**postProfilesByName**](docs/ProfilesApi.md#postProfilesByName) | **POST** /1.0/profiles/{name} | 
*ProfilesApi* | [**putProfilesByName**](docs/ProfilesApi.md#putProfilesByName) | **PUT** /1.0/profiles/{name} | 
*ProjectsApi* | [**deleteProjectsByName**](docs/ProjectsApi.md#deleteProjectsByName) | **DELETE** /1.0/projects/{name} | 
*ProjectsApi* | [**getProjects**](docs/ProjectsApi.md#getProjects) | **GET** /1.0/projects | 
*ProjectsApi* | [**getProjectsByName**](docs/ProjectsApi.md#getProjectsByName) | **GET** /1.0/projects/{name} | 
*ProjectsApi* | [**patchProjectsByName**](docs/ProjectsApi.md#patchProjectsByName) | **PATCH** /1.0/projects/{name} | 
*ProjectsApi* | [**postProjects**](docs/ProjectsApi.md#postProjects) | **POST** /1.0/projects | 
*ProjectsApi* | [**postProjectsByName**](docs/ProjectsApi.md#postProjectsByName) | **POST** /1.0/projects/{name} | 
*ProjectsApi* | [**putProjectsByName**](docs/ProjectsApi.md#putProjectsByName) | **PUT** /1.0/projects/{name} | 
*ResourcesApi* | [**getResources**](docs/ResourcesApi.md#getResources) | **GET** /1.0/resources | 
*StoragePoolsApi* | [**deleteStoragePoolsByName**](docs/StoragePoolsApi.md#deleteStoragePoolsByName) | **DELETE** /1.0/storage-pools/{pool} | 
*StoragePoolsApi* | [**deleteStoragePoolsByNameVolumesByTypeName**](docs/StoragePoolsApi.md#deleteStoragePoolsByNameVolumesByTypeName) | **DELETE** /1.0/storage-pools/{pool}/volumes/{type}/{name} | 
*StoragePoolsApi* | [**deleteStoragePoolsByNameVolumesByTypeNameSnapshotsName**](docs/StoragePoolsApi.md#deleteStoragePoolsByNameVolumesByTypeNameSnapshotsName) | **DELETE** /1.0/storage-pools/{pool}/volumes/{type}/{name}/snapshots/name | 
*StoragePoolsApi* | [**getStoragePools**](docs/StoragePoolsApi.md#getStoragePools) | **GET** /1.0/storage-pools | 
*StoragePoolsApi* | [**getStoragePoolsByName**](docs/StoragePoolsApi.md#getStoragePoolsByName) | **GET** /1.0/storage-pools/{pool} | 
*StoragePoolsApi* | [**getStoragePoolsByNameResources**](docs/StoragePoolsApi.md#getStoragePoolsByNameResources) | **GET** /1.0/storage-pools/{pool}/resources | 
*StoragePoolsApi* | [**getStoragePoolsByNameVolumes**](docs/StoragePoolsApi.md#getStoragePoolsByNameVolumes) | **GET** /1.0/storage-pools/{pool}/volumes | 
*StoragePoolsApi* | [**getStoragePoolsByNameVolumesByTypeName**](docs/StoragePoolsApi.md#getStoragePoolsByNameVolumesByTypeName) | **GET** /1.0/storage-pools/{pool}/volumes/{type}/{name} | 
*StoragePoolsApi* | [**getStoragePoolsByNameVolumesByTypeNameSnapshots**](docs/StoragePoolsApi.md#getStoragePoolsByNameVolumesByTypeNameSnapshots) | **GET** /1.0/storage-pools/{pool}/volumes/{type}/{name}/snapshots | 
*StoragePoolsApi* | [**getStoragePoolsByNameVolumesByTypeNameSnapshotsName**](docs/StoragePoolsApi.md#getStoragePoolsByNameVolumesByTypeNameSnapshotsName) | **GET** /1.0/storage-pools/{pool}/volumes/{type}/{name}/snapshots/name | 
*StoragePoolsApi* | [**patchStoragePoolsByName**](docs/StoragePoolsApi.md#patchStoragePoolsByName) | **PATCH** /1.0/storage-pools/{pool} | 
*StoragePoolsApi* | [**patchStoragePoolsByNameVolumesByTypeName**](docs/StoragePoolsApi.md#patchStoragePoolsByNameVolumesByTypeName) | **PATCH** /1.0/storage-pools/{pool}/volumes/{type}/{name} | 
*StoragePoolsApi* | [**postStoragePools**](docs/StoragePoolsApi.md#postStoragePools) | **POST** /1.0/storage-pools | 
*StoragePoolsApi* | [**postStoragePoolsByNameVolumes**](docs/StoragePoolsApi.md#postStoragePoolsByNameVolumes) | **POST** /1.0/storage-pools/{pool}/volumes | 
*StoragePoolsApi* | [**postStoragePoolsByNameVolumesByType**](docs/StoragePoolsApi.md#postStoragePoolsByNameVolumesByType) | **POST** /1.0/storage-pools/{pool}/volumes/{type} | 
*StoragePoolsApi* | [**postStoragePoolsByNameVolumesByTypeName**](docs/StoragePoolsApi.md#postStoragePoolsByNameVolumesByTypeName) | **POST** /1.0/storage-pools/{pool}/volumes/{type}/{name} | 
*StoragePoolsApi* | [**postStoragePoolsByNameVolumesByTypeNameSnapshots**](docs/StoragePoolsApi.md#postStoragePoolsByNameVolumesByTypeNameSnapshots) | **POST** /1.0/storage-pools/{pool}/volumes/{type}/{name}/snapshots | 
*StoragePoolsApi* | [**postStoragePoolsByNameVolumesByTypeNameSnapshotsName**](docs/StoragePoolsApi.md#postStoragePoolsByNameVolumesByTypeNameSnapshotsName) | **POST** /1.0/storage-pools/{pool}/volumes/{type}/{name}/snapshots/name | 
*StoragePoolsApi* | [**putStoragePoolsByName**](docs/StoragePoolsApi.md#putStoragePoolsByName) | **PUT** /1.0/storage-pools/{pool} | 
*StoragePoolsApi* | [**putStoragePoolsByNameVolumesByTypeName**](docs/StoragePoolsApi.md#putStoragePoolsByNameVolumesByTypeName) | **PUT** /1.0/storage-pools/{pool}/volumes/{type}/{name} | 
*StoragePoolsApi* | [**putStoragePoolsByNameVolumesByTypeNameSnapshotsName**](docs/StoragePoolsApi.md#putStoragePoolsByNameVolumesByTypeNameSnapshotsName) | **PUT** /1.0/storage-pools/{pool}/volumes/{type}/{name}/snapshots/name | 


## Documentation for Models

 - [Addresses](docs/Addresses.md)
 - [Aliases](docs/Aliases.md)
 - [Args](docs/Args.md)
 - [BackgroundOperationResponse](docs/BackgroundOperationResponse.md)
 - [BasicBackgroundOperationResponse](docs/BasicBackgroundOperationResponse.md)
 - [BasicStandardReturnValueResponse](docs/BasicStandardReturnValueResponse.md)
 - [Config](docs/Config.md)
 - [Config1](docs/Config1.md)
 - [Config10](docs/Config10.md)
 - [Config11](docs/Config11.md)
 - [Config12](docs/Config12.md)
 - [Config13](docs/Config13.md)
 - [Config2](docs/Config2.md)
 - [Config3](docs/Config3.md)
 - [Config4](docs/Config4.md)
 - [Config5](docs/Config5.md)
 - [Config6](docs/Config6.md)
 - [Config7](docs/Config7.md)
 - [Config8](docs/Config8.md)
 - [Config9](docs/Config9.md)
 - [Containers](docs/Containers.md)
 - [Context](docs/Context.md)
 - [Counters](docs/Counters.md)
 - [Cpu](docs/Cpu.md)
 - [Cpu2](docs/Cpu2.md)
 - [CreateCertificatesRequest](docs/CreateCertificatesRequest.md)
 - [CreateImagesAliasesByNameRequest](docs/CreateImagesAliasesByNameRequest.md)
 - [CreateImagesAliasesRequest](docs/CreateImagesAliasesRequest.md)
 - [CreateImagesFingerprintExportRequest](docs/CreateImagesFingerprintExportRequest.md)
 - [CreateImagesFingerprintSecretResponse](docs/CreateImagesFingerprintSecretResponse.md)
 - [CreateImagesRequest](docs/CreateImagesRequest.md)
 - [CreateInstancesByNameBackupsByNameRequest](docs/CreateInstancesByNameBackupsByNameRequest.md)
 - [CreateInstancesByNameBackupsRequest](docs/CreateInstancesByNameBackupsRequest.md)
 - [CreateInstancesByNameConsoleRequest](docs/CreateInstancesByNameConsoleRequest.md)
 - [CreateInstancesByNameConsoleRequestOneOf](docs/CreateInstancesByNameConsoleRequestOneOf.md)
 - [CreateInstancesByNameExecRequest](docs/CreateInstancesByNameExecRequest.md)
 - [CreateInstancesByNameExecRequestOneOf](docs/CreateInstancesByNameExecRequestOneOf.md)
 - [CreateInstancesByNameExecResponse1](docs/CreateInstancesByNameExecResponse1.md)
 - [CreateInstancesByNameExecResponse2](docs/CreateInstancesByNameExecResponse2.md)
 - [CreateInstancesByNameExecResponse3](docs/CreateInstancesByNameExecResponse3.md)
 - [CreateInstancesByNameRequest](docs/CreateInstancesByNameRequest.md)
 - [CreateInstancesByNameRequestOneOf](docs/CreateInstancesByNameRequestOneOf.md)
 - [CreateInstancesByNameSnapshotRequest](docs/CreateInstancesByNameSnapshotRequest.md)
 - [CreateInstancesByNameSnapshotsInformationRequest](docs/CreateInstancesByNameSnapshotsInformationRequest.md)
 - [CreateInstancesRequest](docs/CreateInstancesRequest.md)
 - [CreateInstancesRequestConfig](docs/CreateInstancesRequestConfig.md)
 - [CreateNetworksByNameRequest](docs/CreateNetworksByNameRequest.md)
 - [CreateNetworksRequest](docs/CreateNetworksRequest.md)
 - [CreateProfilesByNameRequest](docs/CreateProfilesByNameRequest.md)
 - [CreateProfilesRequest](docs/CreateProfilesRequest.md)
 - [CreateProjectsByNameRequest](docs/CreateProjectsByNameRequest.md)
 - [CreateProjectsRequest](docs/CreateProjectsRequest.md)
 - [CreateStoragePoolsByNameVolumesByTypeNameRequest](docs/CreateStoragePoolsByNameVolumesByTypeNameRequest.md)
 - [CreateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest](docs/CreateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest.md)
 - [CreateStoragePoolsByNameVolumesByTypeNameSnapshotsRequest](docs/CreateStoragePoolsByNameVolumesByTypeNameSnapshotsRequest.md)
 - [CreateStoragePoolsByNameVolumesByTypeRequest](docs/CreateStoragePoolsByNameVolumesByTypeRequest.md)
 - [CreateStoragePoolsByNameVolumesRequest](docs/CreateStoragePoolsByNameVolumesRequest.md)
 - [CreateStoragePoolsRequest](docs/CreateStoragePoolsRequest.md)
 - [Devices1](docs/Devices1.md)
 - [Devices2](docs/Devices2.md)
 - [Devices3](docs/Devices3.md)
 - [Disk](docs/Disk.md)
 - [Environment](docs/Environment.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Eth0](docs/Eth0.md)
 - [Eth02](docs/Eth02.md)
 - [ExpandedConfig](docs/ExpandedConfig.md)
 - [ExpandedDevices](docs/ExpandedDevices.md)
 - [Fds1](docs/Fds1.md)
 - [Fds2](docs/Fds2.md)
 - [GetClusterMembersByNameResponse](docs/GetClusterMembersByNameResponse.md)
 - [GetClusterResponse](docs/GetClusterResponse.md)
 - [GetEventsResponse](docs/GetEventsResponse.md)
 - [GetFingerprintResponse](docs/GetFingerprintResponse.md)
 - [GetFingerprintResponseMetadata](docs/GetFingerprintResponseMetadata.md)
 - [GetImagesAliasesByNameResponse](docs/GetImagesAliasesByNameResponse.md)
 - [GetImagesFingerprintResponse](docs/GetImagesFingerprintResponse.md)
 - [GetInstancesByNameBackupsByNameExportResponse](docs/GetInstancesByNameBackupsByNameExportResponse.md)
 - [GetInstancesByNameBackupsByNameResponse](docs/GetInstancesByNameBackupsByNameResponse.md)
 - [GetInstancesByNameMetadataResponse](docs/GetInstancesByNameMetadataResponse.md)
 - [GetInstancesByNameResponse](docs/GetInstancesByNameResponse.md)
 - [GetInstancesByNameStateMetadataResponse](docs/GetInstancesByNameStateMetadataResponse.md)
 - [GetInstancesByNameStateResponse](docs/GetInstancesByNameStateResponse.md)
 - [GetInstancesByNameStateResponseAllOf](docs/GetInstancesByNameStateResponseAllOf.md)
 - [GetNetworksByNameResponse](docs/GetNetworksByNameResponse.md)
 - [GetNetworksByNameStateResponse](docs/GetNetworksByNameStateResponse.md)
 - [GetNetworksUUIDResponse](docs/GetNetworksUUIDResponse.md)
 - [GetOperationsResponse](docs/GetOperationsResponse.md)
 - [GetProfilesByNameResponse](docs/GetProfilesByNameResponse.md)
 - [GetProjectsByNameResponse](docs/GetProjectsByNameResponse.md)
 - [GetResourcesResponse](docs/GetResourcesResponse.md)
 - [GetResourcesResponseAllOf](docs/GetResourcesResponseAllOf.md)
 - [GetResourcesResponseMetadata](docs/GetResourcesResponseMetadata.md)
 - [GetServerStateResponse](docs/GetServerStateResponse.md)
 - [GetServerStateResponseMetadata](docs/GetServerStateResponseMetadata.md)
 - [GetSnapshotInformationResponse](docs/GetSnapshotInformationResponse.md)
 - [GetStoragePoolsByNameResourcesResponse](docs/GetStoragePoolsByNameResourcesResponse.md)
 - [GetStoragePoolsByNameResourcesResponseAllOf](docs/GetStoragePoolsByNameResourcesResponseAllOf.md)
 - [GetStoragePoolsByNameResourcesResponseMetadata](docs/GetStoragePoolsByNameResourcesResponseMetadata.md)
 - [GetStoragePoolsByNameResponse](docs/GetStoragePoolsByNameResponse.md)
 - [GetStoragePoolsByNameResponseAllOf](docs/GetStoragePoolsByNameResponseAllOf.md)
 - [GetStoragePoolsByNameResponseMetadata](docs/GetStoragePoolsByNameResponseMetadata.md)
 - [GetStoragePoolsByNameVolumesByTypeNameResponse](docs/GetStoragePoolsByNameVolumesByTypeNameResponse.md)
 - [GetStoragePoolsByNameVolumesByTypeNameResponseAllOf](docs/GetStoragePoolsByNameVolumesByTypeNameResponseAllOf.md)
 - [GetStoragePoolsByNameVolumesByTypeNameResponseMetadata](docs/GetStoragePoolsByNameVolumesByTypeNameResponseMetadata.md)
 - [GetStoragePoolsByNameVolumesByTypeNameSnapshotsNameResponse](docs/GetStoragePoolsByNameVolumesByTypeNameSnapshotsNameResponse.md)
 - [Kvm](docs/Kvm.md)
 - [MemberConfig](docs/MemberConfig.md)
 - [MemberConfig2](docs/MemberConfig2.md)
 - [Memory](docs/Memory.md)
 - [Memory2](docs/Memory2.md)
 - [Metadata](docs/Metadata.md)
 - [Metadata2](docs/Metadata2.md)
 - [Metadata3](docs/Metadata3.md)
 - [MigrateInstancesByNameRequest](docs/MigrateInstancesByNameRequest.md)
 - [Network](docs/Network.md)
 - [Output](docs/Output.md)
 - [PatchImagesFingerprintRequest](docs/PatchImagesFingerprintRequest.md)
 - [PatchInstancesByNameRequest](docs/PatchInstancesByNameRequest.md)
 - [PatchNetworksByNameRequest](docs/PatchNetworksByNameRequest.md)
 - [PatchStoragePoolsByNameRequest](docs/PatchStoragePoolsByNameRequest.md)
 - [Properties](docs/Properties.md)
 - [Properties2](docs/Properties2.md)
 - [Properties3](docs/Properties3.md)
 - [Properties4](docs/Properties4.md)
 - [Properties5](docs/Properties5.md)
 - [RawFile](docs/RawFile.md)
 - [Resources](docs/Resources.md)
 - [Root](docs/Root.md)
 - [Root2](docs/Root2.md)
 - [Root3](docs/Root3.md)
 - [Secrets](docs/Secrets.md)
 - [Sigusr1SignalRequest](docs/Sigusr1SignalRequest.md)
 - [Sockets](docs/Sockets.md)
 - [Source](docs/Source.md)
 - [Source10](docs/Source10.md)
 - [Source13](docs/Source13.md)
 - [SpaceInodes](docs/SpaceInodes.md)
 - [StandardReturnValueResponse](docs/StandardReturnValueResponse.md)
 - [Template](docs/Template.md)
 - [Templates](docs/Templates.md)
 - [UpdateClusterMembersByNameRequest](docs/UpdateClusterMembersByNameRequest.md)
 - [UpdateClusterRequest](docs/UpdateClusterRequest.md)
 - [UpdateFingerprintRequest](docs/UpdateFingerprintRequest.md)
 - [UpdateImagesAliasesByNameRequest](docs/UpdateImagesAliasesByNameRequest.md)
 - [UpdateImagesFingerprintRequest](docs/UpdateImagesFingerprintRequest.md)
 - [UpdateInstancesByNameRequest](docs/UpdateInstancesByNameRequest.md)
 - [UpdateInstancesByNameRequest2](docs/UpdateInstancesByNameRequest2.md)
 - [UpdateInstancesByNameRequestOneOf](docs/UpdateInstancesByNameRequestOneOf.md)
 - [UpdateInstancesByNameSnapshotsInformationRequest](docs/UpdateInstancesByNameSnapshotsInformationRequest.md)
 - [UpdateInstancesByNameStateRequest](docs/UpdateInstancesByNameStateRequest.md)
 - [UpdateNetworksByNameRequest](docs/UpdateNetworksByNameRequest.md)
 - [UpdateProfilesByNameRequest](docs/UpdateProfilesByNameRequest.md)
 - [UpdateProjectsByNameRequest](docs/UpdateProjectsByNameRequest.md)
 - [UpdateSource](docs/UpdateSource.md)
 - [UpdateStoragePoolsByNameRequest](docs/UpdateStoragePoolsByNameRequest.md)
 - [UpdateStoragePoolsByNameVolumesByTypeNameRequest](docs/UpdateStoragePoolsByNameVolumesByTypeNameRequest.md)
 - [UpdateStoragePoolsByNameVolumesByTypeNameRequest2](docs/UpdateStoragePoolsByNameVolumesByTypeNameRequest2.md)
 - [UpdateStoragePoolsByNameVolumesByTypeNameRequestOneOf](docs/UpdateStoragePoolsByNameVolumesByTypeNameRequestOneOf.md)
 - [UpdateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest](docs/UpdateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest.md)
 - [WindowSizeChangeRequest](docs/WindowSizeChangeRequest.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### authentication

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://example.com/oauth/authorize
- **Scopes**: 
  - guest: access.....
  - untrusted: access.....
  - trusted: access.....


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@relxd.org

