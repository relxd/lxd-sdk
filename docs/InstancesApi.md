# InstancesApi

All URIs are relative to *http://localhost:2375*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteInstancesByName**](InstancesApi.md#deleteInstancesByName) | **DELETE** /1.0/instances/{name} | 
[**deleteInstancesByNameBackupsByName**](InstancesApi.md#deleteInstancesByNameBackupsByName) | **DELETE** /1.0/instances/{name}/backups/{backupsName} | 
[**deleteInstancesByNameConsole**](InstancesApi.md#deleteInstancesByNameConsole) | **DELETE** /1.0/instances/{name}/console | 
[**deleteInstancesByNameFiles**](InstancesApi.md#deleteInstancesByNameFiles) | **DELETE** /1.0/instances/{name}/files | 
[**deleteInstancesByNameLogsFile**](InstancesApi.md#deleteInstancesByNameLogsFile) | **DELETE** /1.0/instances/{name}/logs/{logFile} | 
[**deleteInstancesByNameMetadataTemplates**](InstancesApi.md#deleteInstancesByNameMetadataTemplates) | **DELETE** /1.0/instances/{name}/metadata/templates | 
[**deleteInstancesByNameSnapshotsInformation**](InstancesApi.md#deleteInstancesByNameSnapshotsInformation) | **DELETE** /1.0/instances/{name}/snapshots/{snapshotName} | 
[**getInstances**](InstancesApi.md#getInstances) | **GET** /1.0/instances | 
[**getInstancesByName**](InstancesApi.md#getInstancesByName) | **GET** /1.0/instances/{name} | 
[**getInstancesByNameBackups**](InstancesApi.md#getInstancesByNameBackups) | **GET** /1.0/instances/{name}/backups | 
[**getInstancesByNameBackupsByName**](InstancesApi.md#getInstancesByNameBackupsByName) | **GET** /1.0/instances/{name}/backups/{backupsName} | 
[**getInstancesByNameBackupsByNameExport**](InstancesApi.md#getInstancesByNameBackupsByNameExport) | **GET** /1.0/instances/{name}/backups/{backupsName}/export | 
[**getInstancesByNameConsole**](InstancesApi.md#getInstancesByNameConsole) | **GET** /1.0/instances/{name}/console | 
[**getInstancesByNameFiles**](InstancesApi.md#getInstancesByNameFiles) | **GET** /1.0/instances/{name}/files | 
[**getInstancesByNameLogs**](InstancesApi.md#getInstancesByNameLogs) | **GET** /1.0/instances/{name}/logs | 
[**getInstancesByNameLogsFile**](InstancesApi.md#getInstancesByNameLogsFile) | **GET** /1.0/instances/{name}/logs/{logFile} | 
[**getInstancesByNameMetadata**](InstancesApi.md#getInstancesByNameMetadata) | **GET** /1.0/instances/{name}/metadata | 
[**getInstancesByNameMetadataTemplates**](InstancesApi.md#getInstancesByNameMetadataTemplates) | **GET** /1.0/instances/{name}/metadata/templates | 
[**getInstancesByNameSnapshots**](InstancesApi.md#getInstancesByNameSnapshots) | **GET** /1.0/instances/{name}/snapshots | 
[**getInstancesByNameSnapshotsInformation**](InstancesApi.md#getInstancesByNameSnapshotsInformation) | **GET** /1.0/instances/{name}/snapshots/{snapshotName} | 
[**getInstancesByNameState**](InstancesApi.md#getInstancesByNameState) | **GET** /1.0/instances/{name}/state | 
[**patchInstancesByName**](InstancesApi.md#patchInstancesByName) | **PATCH** /1.0/instances/{name} | 
[**postInstances**](InstancesApi.md#postInstances) | **POST** /1.0/instances | 
[**postInstancesByName**](InstancesApi.md#postInstancesByName) | **POST** /1.0/instances/{name} | 
[**postInstancesByNameBackups**](InstancesApi.md#postInstancesByNameBackups) | **POST** /1.0/instances/{name}/backups | 
[**postInstancesByNameBackupsByName**](InstancesApi.md#postInstancesByNameBackupsByName) | **POST** /1.0/instances/{name}/backups/{backupsName} | 
[**postInstancesByNameConsole**](InstancesApi.md#postInstancesByNameConsole) | **POST** /1.0/instances/{name}/console | 
[**postInstancesByNameExec**](InstancesApi.md#postInstancesByNameExec) | **POST** /1.0/instances/{name}/exec | 
[**postInstancesByNameFiles**](InstancesApi.md#postInstancesByNameFiles) | **POST** /1.0/instances/{name}/files | 
[**postInstancesByNameMetadataTemplates**](InstancesApi.md#postInstancesByNameMetadataTemplates) | **POST** /1.0/instances/{name}/metadata/templates | 
[**postInstancesByNameSnapshot**](InstancesApi.md#postInstancesByNameSnapshot) | **POST** /1.0/instances/{name}/snapshots | 
[**postInstancesByNameSnapshotsInformation**](InstancesApi.md#postInstancesByNameSnapshotsInformation) | **POST** /1.0/instances/{name}/snapshots/{snapshotName} | 
[**putInstancesByName**](InstancesApi.md#putInstancesByName) | **PUT** /1.0/instances/{name} | 
[**putInstancesByNameMetadata**](InstancesApi.md#putInstancesByNameMetadata) | **PUT** /1.0/instances/{name}/metadata | 
[**putInstancesByNameMetadataTemplates**](InstancesApi.md#putInstancesByNameMetadataTemplates) | **PUT** /1.0/instances/{name}/metadata/templates | 
[**putInstancesByNameSnapshotsInformation**](InstancesApi.md#putInstancesByNameSnapshotsInformation) | **PUT** /1.0/instances/{name}/snapshots/{snapshotName} | 
[**putInstancesByNameState**](InstancesApi.md#putInstancesByNameState) | **PUT** /1.0/instances/{name}/state | 


<a name="deleteInstancesByName"></a>
# **deleteInstancesByName**
> BasicBackgroundOperationResponse deleteInstancesByName(name)



Remove the instance

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    try {
      BasicBackgroundOperationResponse result = apiInstance.deleteInstancesByName(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#deleteInstancesByName");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |

### Return type

[**BasicBackgroundOperationResponse**](BasicBackgroundOperationResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | A basic background return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="deleteInstancesByNameBackupsByName"></a>
# **deleteInstancesByNameBackupsByName**
> BasicBackgroundOperationResponse deleteInstancesByNameBackupsByName(name, backupsName)



Remove the backup

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    String backupsName = "backupsName_example"; // String | Backups name
    try {
      BasicBackgroundOperationResponse result = apiInstance.deleteInstancesByNameBackupsByName(name, backupsName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#deleteInstancesByNameBackupsByName");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **backupsName** | **String**| Backups name |

### Return type

[**BasicBackgroundOperationResponse**](BasicBackgroundOperationResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | A basic background return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="deleteInstancesByNameConsole"></a>
# **deleteInstancesByNameConsole**
> deleteInstancesByNameConsole(name)



Empty the instance&#39;s console log

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    try {
      apiInstance.deleteInstancesByNameConsole(name);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#deleteInstancesByNameConsole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |

### Return type

null (empty response body)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | empty response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="deleteInstancesByNameFiles"></a>
# **deleteInstancesByNameFiles**
> StandardServerResponse deleteInstancesByNameFiles(name, path)



Delete a file in the instance

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    String path = /path/inside/the/instance; // String | directory listing from the instance
    try {
      StandardServerResponse result = apiInstance.deleteInstancesByNameFiles(name, path);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#deleteInstancesByNameFiles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **path** | **String**| directory listing from the instance | [optional]

### Return type

[**StandardServerResponse**](StandardServerResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A standard return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="deleteInstancesByNameLogsFile"></a>
# **deleteInstancesByNameLogsFile**
> StandardServerResponse deleteInstancesByNameLogsFile(name, logFile)



Delete a particular log file.

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    String logFile = "logFile_example"; // String | Instance log file
    try {
      StandardServerResponse result = apiInstance.deleteInstancesByNameLogsFile(name, logFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#deleteInstancesByNameLogsFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **logFile** | **String**| Instance log file |

### Return type

[**StandardServerResponse**](StandardServerResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A standard return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="deleteInstancesByNameMetadataTemplates"></a>
# **deleteInstancesByNameMetadataTemplates**
> StandardServerResponse deleteInstancesByNameMetadataTemplates(name, path)



Delete an instance template

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    String path = "path_example"; // String | Template
    try {
      StandardServerResponse result = apiInstance.deleteInstancesByNameMetadataTemplates(name, path);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#deleteInstancesByNameMetadataTemplates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **path** | **String**| Template |

### Return type

[**StandardServerResponse**](StandardServerResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A standard return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="deleteInstancesByNameSnapshotsInformation"></a>
# **deleteInstancesByNameSnapshotsInformation**
> BasicBackgroundOperationResponse deleteInstancesByNameSnapshotsInformation(name, snapshotName)



Remove the snapshot

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    String snapshotName = "snapshotName_example"; // String | Snapshot name
    try {
      BasicBackgroundOperationResponse result = apiInstance.deleteInstancesByNameSnapshotsInformation(name, snapshotName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#deleteInstancesByNameSnapshotsInformation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **snapshotName** | **String**| Snapshot name |

### Return type

[**BasicBackgroundOperationResponse**](BasicBackgroundOperationResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | A basic background return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getInstances"></a>
# **getInstances**
> List&lt;String&gt; getInstances(recursion, filter)



Return a list of URLs for instances this server hosts

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      List<String> result = apiInstance.getInstances(recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#getInstances");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of instances |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getInstancesByName"></a>
# **getInstancesByName**
> GetInstancesByNameResponse getInstancesByName(name, recursion, filter)



Get Instance information

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      GetInstancesByNameResponse result = apiInstance.getInstancesByName(name, recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#getInstancesByName");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]

### Return type

[**GetInstancesByNameResponse**](GetInstancesByNameResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Instance information |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getInstancesByNameBackups"></a>
# **getInstancesByNameBackups**
> List&lt;String&gt; getInstancesByNameBackups(name, recursion, filter)



List of backups for the instance

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      List<String> result = apiInstance.getInstancesByNameBackups(name, recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#getInstancesByNameBackups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of backups for the instance |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getInstancesByNameBackupsByName"></a>
# **getInstancesByNameBackupsByName**
> GetInstancesByNameBackupsByNameResponse getInstancesByNameBackupsByName(name, backupsName, recursion, filter)



Backup information

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    String backupsName = "backupsName_example"; // String | Backups name
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      GetInstancesByNameBackupsByNameResponse result = apiInstance.getInstancesByNameBackupsByName(name, backupsName, recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#getInstancesByNameBackupsByName");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **backupsName** | **String**| Backups name |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]

### Return type

[**GetInstancesByNameBackupsByNameResponse**](GetInstancesByNameBackupsByNameResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Backup information |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getInstancesByNameBackupsByNameExport"></a>
# **getInstancesByNameBackupsByNameExport**
> GetInstancesByNameBackupsByNameExportResponse getInstancesByNameBackupsByNameExport(name, backupsName, recursion, filter)



Fetch the backup tarball

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    String backupsName = "backupsName_example"; // String | Backups name
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      GetInstancesByNameBackupsByNameExportResponse result = apiInstance.getInstancesByNameBackupsByNameExport(name, backupsName, recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#getInstancesByNameBackupsByNameExport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **backupsName** | **String**| Backups name |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]

### Return type

[**GetInstancesByNameBackupsByNameExportResponse**](GetInstancesByNameBackupsByNameExportResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetch the backup tarball |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getInstancesByNameConsole"></a>
# **getInstancesByNameConsole**
> GetInstancesByNameResponse getInstancesByNameConsole(name, recursion, filter)



Returns the contents of the instance&#39;s console log

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      GetInstancesByNameResponse result = apiInstance.getInstancesByNameConsole(name, recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#getInstancesByNameConsole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]

### Return type

[**GetInstancesByNameResponse**](GetInstancesByNameResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Instance information |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getInstancesByNameFiles"></a>
# **getInstancesByNameFiles**
> RawFile getInstancesByNameFiles(name, recursion, filter, path, xLXDUid, xLXDGid, xLXDMode, xLXDType)



Download a file or directory listing from the instance

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    String path = /path/inside/the/instance; // String | directory listing from the instance
    Integer xLXDUid = 0; // Integer | 
    Integer xLXDGid = 0; // Integer | 
    Integer xLXDMode = 700; // Integer | 
    UUID xLXDType = new UUID(); // UUID | one of directory or file
    try {
      RawFile result = apiInstance.getInstancesByNameFiles(name, recursion, filter, path, xLXDUid, xLXDGid, xLXDMode, xLXDType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#getInstancesByNameFiles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]
 **path** | **String**| directory listing from the instance | [optional]
 **xLXDUid** | **Integer**|  | [optional]
 **xLXDGid** | **Integer**|  | [optional]
 **xLXDMode** | **Integer**|  | [optional]
 **xLXDType** | [**UUID**](.md)| one of directory or file | [optional]

### Return type

[**RawFile**](RawFile.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Download a file or directory listing from the instance |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getInstancesByNameLogs"></a>
# **getInstancesByNameLogs**
> List&lt;String&gt; getInstancesByNameLogs(name, recursion, filter)



Returns a list of the log files available for this instance. Note that this works on instances that have been deleted (or were never created) to enable people to get logs for failed creations.

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      List<String> result = apiInstance.getInstancesByNameLogs(name, recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#getInstancesByNameLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Instances logs response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getInstancesByNameLogsFile"></a>
# **getInstancesByNameLogsFile**
> List&lt;String&gt; getInstancesByNameLogsFile(name, logFile, recursion, filter)



Returns the contents of a particular log file.

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    String logFile = "logFile_example"; // String | Instance log file
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      List<String> result = apiInstance.getInstancesByNameLogsFile(name, logFile, recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#getInstancesByNameLogsFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **logFile** | **String**| Instance log file |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Instances logs response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getInstancesByNameMetadata"></a>
# **getInstancesByNameMetadata**
> GetInstancesByNameMetadataResponse getInstancesByNameMetadata(name, recursion, filter)



Instance metadata

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      GetInstancesByNameMetadataResponse result = apiInstance.getInstancesByNameMetadata(name, recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#getInstancesByNameMetadata");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]

### Return type

[**GetInstancesByNameMetadataResponse**](GetInstancesByNameMetadataResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Instance metadata |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getInstancesByNameMetadataTemplates"></a>
# **getInstancesByNameMetadataTemplates**
> List&lt;String&gt; getInstancesByNameMetadataTemplates(name, recursion, filter, path)



List instance templates

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    String path = "path_example"; // String | Template
    try {
      List<String> result = apiInstance.getInstancesByNameMetadataTemplates(name, recursion, filter, path);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#getInstancesByNameMetadataTemplates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]
 **path** | **String**| Template | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Instances metadata templates response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getInstancesByNameSnapshots"></a>
# **getInstancesByNameSnapshots**
> List&lt;String&gt; getInstancesByNameSnapshots(name, recursion, filter)



List of snapshots

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      List<String> result = apiInstance.getInstancesByNameSnapshots(name, recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#getInstancesByNameSnapshots");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | snapshots response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getInstancesByNameSnapshotsInformation"></a>
# **getInstancesByNameSnapshotsInformation**
> GetSnapshotInformationResponse getInstancesByNameSnapshotsInformation(name, snapshotName, recursion, filter)



Snapshot information

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    String snapshotName = "snapshotName_example"; // String | Snapshot name
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      GetSnapshotInformationResponse result = apiInstance.getInstancesByNameSnapshotsInformation(name, snapshotName, recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#getInstancesByNameSnapshotsInformation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **snapshotName** | **String**| Snapshot name |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]

### Return type

[**GetSnapshotInformationResponse**](GetSnapshotInformationResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Snapshot information |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getInstancesByNameState"></a>
# **getInstancesByNameState**
> GetInstancesByNameStateResponse getInstancesByNameState(name, recursion, filter)



Current state

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      GetInstancesByNameStateResponse result = apiInstance.getInstancesByNameState(name, recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#getInstancesByNameState");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]

### Return type

[**GetInstancesByNameStateResponse**](GetInstancesByNameStateResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Current state |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="patchInstancesByName"></a>
# **patchInstancesByName**
> StandardServerResponse patchInstancesByName(name, body)



Update instance configuration

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    PatchInstancesByNameRequest body = new PatchInstancesByNameRequest(); // PatchInstancesByNameRequest | Update instance configuration
    try {
      StandardServerResponse result = apiInstance.patchInstancesByName(name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#patchInstancesByName");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **body** | [**PatchInstancesByNameRequest**](PatchInstancesByNameRequest.md)| Update instance configuration | [optional]

### Return type

[**StandardServerResponse**](StandardServerResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A standard return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="postInstances"></a>
# **postInstances**
> BasicBackgroundOperationResponse postInstances(target, body)



Create a new instance

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String target = "target_example"; // String | ?target=<member>
    CreateInstancesRequest body = new CreateInstancesRequest(); // CreateInstancesRequest | Create a new instance
    try {
      BasicBackgroundOperationResponse result = apiInstance.postInstances(target, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#postInstances");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **target** | **String**| ?target&#x3D;&lt;member&gt; | [optional]
 **body** | [**CreateInstancesRequest**](CreateInstancesRequest.md)| Create a new instance | [optional]

### Return type

[**BasicBackgroundOperationResponse**](BasicBackgroundOperationResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json, file
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | A basic background return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="postInstancesByName"></a>
# **postInstancesByName**
> BasicBackgroundOperationResponse postInstancesByName(name, target, body)



Used to rename/migrate the instance

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    String target = "target_example"; // String | ?target=<member>
    CreateInstancesByNameRequest body = new CreateInstancesByNameRequest(); // CreateInstancesByNameRequest | Used to rename/migrate the instance
    try {
      BasicBackgroundOperationResponse result = apiInstance.postInstancesByName(name, target, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#postInstancesByName");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **target** | **String**| ?target&#x3D;&lt;member&gt; | [optional]
 **body** | [**CreateInstancesByNameRequest**](CreateInstancesByNameRequest.md)| Used to rename/migrate the instance | [optional]

### Return type

[**BasicBackgroundOperationResponse**](BasicBackgroundOperationResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Background return value responses |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |
**409** | A standard error response |  -  |

<a name="postInstancesByNameBackups"></a>
# **postInstancesByNameBackups**
> BasicBackgroundOperationResponse postInstancesByNameBackups(name, body)



Create a new backup

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    CreateInstancesByNameBackupsRequest body = new CreateInstancesByNameBackupsRequest(); // CreateInstancesByNameBackupsRequest | Create a new backup
    try {
      BasicBackgroundOperationResponse result = apiInstance.postInstancesByNameBackups(name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#postInstancesByNameBackups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **body** | [**CreateInstancesByNameBackupsRequest**](CreateInstancesByNameBackupsRequest.md)| Create a new backup | [optional]

### Return type

[**BasicBackgroundOperationResponse**](BasicBackgroundOperationResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | A basic background return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="postInstancesByNameBackupsByName"></a>
# **postInstancesByNameBackupsByName**
> BasicBackgroundOperationResponse postInstancesByNameBackupsByName(name, backupsName, body)



Used to rename the backup

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    String backupsName = "backupsName_example"; // String | Backups name
    CreateInstancesByNameBackupsByNameRequest body = new CreateInstancesByNameBackupsByNameRequest(); // CreateInstancesByNameBackupsByNameRequest | Used to rename the backup
    try {
      BasicBackgroundOperationResponse result = apiInstance.postInstancesByNameBackupsByName(name, backupsName, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#postInstancesByNameBackupsByName");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **backupsName** | **String**| Backups name |
 **body** | [**CreateInstancesByNameBackupsByNameRequest**](CreateInstancesByNameBackupsByNameRequest.md)| Used to rename the backup | [optional]

### Return type

[**BasicBackgroundOperationResponse**](BasicBackgroundOperationResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | A basic background return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="postInstancesByNameConsole"></a>
# **postInstancesByNameConsole**
> BasicBackgroundOperationResponse postInstancesByNameConsole(name, body)



Attach to an instance&#39;s console devices

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    CreateInstancesByNameConsoleRequest body = new CreateInstancesByNameConsoleRequest(); // CreateInstancesByNameConsoleRequest | Attach to an instance's console devices
    try {
      BasicBackgroundOperationResponse result = apiInstance.postInstancesByNameConsole(name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#postInstancesByNameConsole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **body** | [**CreateInstancesByNameConsoleRequest**](CreateInstancesByNameConsoleRequest.md)| Attach to an instance&#39;s console devices | [optional]

### Return type

[**BasicBackgroundOperationResponse**](BasicBackgroundOperationResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | A basic background return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="postInstancesByNameExec"></a>
# **postInstancesByNameExec**
> BasicBackgroundOperationResponse postInstancesByNameExec(name, body)



Run a remote command

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    CreateInstancesByNameExecRequest body = new CreateInstancesByNameExecRequest(); // CreateInstancesByNameExecRequest | Run a remote command
    try {
      BasicBackgroundOperationResponse result = apiInstance.postInstancesByNameExec(name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#postInstancesByNameExec");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **body** | [**CreateInstancesByNameExecRequest**](CreateInstancesByNameExecRequest.md)| Run a remote command | [optional]

### Return type

[**BasicBackgroundOperationResponse**](BasicBackgroundOperationResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Background operation + optional websocket information |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="postInstancesByNameFiles"></a>
# **postInstancesByNameFiles**
> StandardServerResponse postInstancesByNameFiles(name, path, xLXDUid, xLXDGid, xLXDMode, xLXDWrite, xLXDType, body)



Upload a file to the instance

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    String path = /path/inside/the/instance; // String | directory listing from the instance
    Integer xLXDUid = 0; // Integer | 
    Integer xLXDGid = 0; // Integer | 
    Integer xLXDMode = 700; // Integer | 
    UUID xLXDWrite = new UUID(); // UUID | overwrite (or append)
    String xLXDType = "xLXDType_example"; // String | one of directory or file or symlink
    File body = new File("/path/to/file"); // File | Upload a file to the instance
    try {
      StandardServerResponse result = apiInstance.postInstancesByNameFiles(name, path, xLXDUid, xLXDGid, xLXDMode, xLXDWrite, xLXDType, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#postInstancesByNameFiles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **path** | **String**| directory listing from the instance | [optional]
 **xLXDUid** | **Integer**|  | [optional]
 **xLXDGid** | **Integer**|  | [optional]
 **xLXDMode** | **Integer**|  | [optional]
 **xLXDWrite** | [**UUID**](.md)| overwrite (or append) | [optional]
 **xLXDType** | **String**| one of directory or file or symlink | [optional]
 **body** | **File**| Upload a file to the instance | [optional]

### Return type

[**StandardServerResponse**](StandardServerResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: image/_*
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A standard return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="postInstancesByNameMetadataTemplates"></a>
# **postInstancesByNameMetadataTemplates**
> StandardServerResponse postInstancesByNameMetadataTemplates(name, path, body)



Add a container template

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    String path = "path_example"; // String | Template
    File body = new File("/path/to/file"); // File | Add a container template
    try {
      StandardServerResponse result = apiInstance.postInstancesByNameMetadataTemplates(name, path, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#postInstancesByNameMetadataTemplates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **path** | **String**| Template |
 **body** | **File**| Add a container template | [optional]

### Return type

[**StandardServerResponse**](StandardServerResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: file
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A standard return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="postInstancesByNameSnapshot"></a>
# **postInstancesByNameSnapshot**
> BasicBackgroundOperationResponse postInstancesByNameSnapshot(name, body)



Create a new snapshot

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    CreateInstancesByNameSnapshotRequest body = new CreateInstancesByNameSnapshotRequest(); // CreateInstancesByNameSnapshotRequest | Create a new snapshot
    try {
      BasicBackgroundOperationResponse result = apiInstance.postInstancesByNameSnapshot(name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#postInstancesByNameSnapshot");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **body** | [**CreateInstancesByNameSnapshotRequest**](CreateInstancesByNameSnapshotRequest.md)| Create a new snapshot | [optional]

### Return type

[**BasicBackgroundOperationResponse**](BasicBackgroundOperationResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | A basic background return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="postInstancesByNameSnapshotsInformation"></a>
# **postInstancesByNameSnapshotsInformation**
> BasicBackgroundOperationResponse postInstancesByNameSnapshotsInformation(name, snapshotName, body)



Used to rename/migrate the snapshot

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    String snapshotName = "snapshotName_example"; // String | Snapshot name
    CreateInstancesByNameSnapshotsInformationRequest body = new CreateInstancesByNameSnapshotsInformationRequest(); // CreateInstancesByNameSnapshotsInformationRequest | Used to rename/migrate the snapshot
    try {
      BasicBackgroundOperationResponse result = apiInstance.postInstancesByNameSnapshotsInformation(name, snapshotName, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#postInstancesByNameSnapshotsInformation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **snapshotName** | **String**| Snapshot name |
 **body** | [**CreateInstancesByNameSnapshotsInformationRequest**](CreateInstancesByNameSnapshotsInformationRequest.md)| Used to rename/migrate the snapshot | [optional]

### Return type

[**BasicBackgroundOperationResponse**](BasicBackgroundOperationResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Create Instances By Name Snapshots Information Response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |
**409** | A standard error response |  -  |

<a name="putInstancesByName"></a>
# **putInstancesByName**
> BasicBackgroundOperationResponse putInstancesByName(name, body)



Replaces instance configuration or restore snapshot

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    UpdateInstancesByNameRequest body = new UpdateInstancesByNameRequest(); // UpdateInstancesByNameRequest | 
    try {
      BasicBackgroundOperationResponse result = apiInstance.putInstancesByName(name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#putInstancesByName");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **body** | [**UpdateInstancesByNameRequest**](UpdateInstancesByNameRequest.md)|  | [optional]

### Return type

[**BasicBackgroundOperationResponse**](BasicBackgroundOperationResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | A basic background return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="putInstancesByNameMetadata"></a>
# **putInstancesByNameMetadata**
> StandardServerResponse putInstancesByNameMetadata(name, body)



Replaces instance metadata

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    GetInstancesByNameMetadataResponse body = new GetInstancesByNameMetadataResponse(); // GetInstancesByNameMetadataResponse | Replaces instance metadata
    try {
      StandardServerResponse result = apiInstance.putInstancesByNameMetadata(name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#putInstancesByNameMetadata");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **body** | [**GetInstancesByNameMetadataResponse**](GetInstancesByNameMetadataResponse.md)| Replaces instance metadata | [optional]

### Return type

[**StandardServerResponse**](StandardServerResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A standard return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="putInstancesByNameMetadataTemplates"></a>
# **putInstancesByNameMetadataTemplates**
> StandardServerResponse putInstancesByNameMetadataTemplates(name, path, body)



Replace content of a template

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    String path = "path_example"; // String | Template
    File body = new File("/path/to/file"); // File | Replace content of a template
    try {
      StandardServerResponse result = apiInstance.putInstancesByNameMetadataTemplates(name, path, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#putInstancesByNameMetadataTemplates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **path** | **String**| Template |
 **body** | **File**| Replace content of a template | [optional]

### Return type

[**StandardServerResponse**](StandardServerResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: file
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A standard return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="putInstancesByNameSnapshotsInformation"></a>
# **putInstancesByNameSnapshotsInformation**
> BasicBackgroundOperationResponse putInstancesByNameSnapshotsInformation(name, snapshotName, body)



Update the snapshot

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    String snapshotName = "snapshotName_example"; // String | Snapshot name
    UpdateInstancesByNameSnapshotsInformationRequest body = new UpdateInstancesByNameSnapshotsInformationRequest(); // UpdateInstancesByNameSnapshotsInformationRequest | Update the snapshot
    try {
      BasicBackgroundOperationResponse result = apiInstance.putInstancesByNameSnapshotsInformation(name, snapshotName, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#putInstancesByNameSnapshotsInformation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **snapshotName** | **String**| Snapshot name |
 **body** | [**UpdateInstancesByNameSnapshotsInformationRequest**](UpdateInstancesByNameSnapshotsInformationRequest.md)| Update the snapshot | [optional]

### Return type

[**BasicBackgroundOperationResponse**](BasicBackgroundOperationResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | A basic background return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="putInstancesByNameState"></a>
# **putInstancesByNameState**
> BasicBackgroundOperationResponse putInstancesByNameState(name, body)



Change the instance state

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name
    UpdateInstancesByNameStateRequest body = new UpdateInstancesByNameStateRequest(); // UpdateInstancesByNameStateRequest | Change the instance state
    try {
      BasicBackgroundOperationResponse result = apiInstance.putInstancesByNameState(name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#putInstancesByNameState");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Instance name |
 **body** | [**UpdateInstancesByNameStateRequest**](UpdateInstancesByNameStateRequest.md)| Change the instance state | [optional]

### Return type

[**BasicBackgroundOperationResponse**](BasicBackgroundOperationResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | A basic background return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

