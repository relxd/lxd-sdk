# StoragePoolsApi

All URIs are relative to *https://lxd.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteStoragePoolsByName**](StoragePoolsApi.md#deleteStoragePoolsByName) | **DELETE** /1.0/storage-pools/{pool} | 
[**deleteStoragePoolsByNameVolumesByTypeName**](StoragePoolsApi.md#deleteStoragePoolsByNameVolumesByTypeName) | **DELETE** /1.0/storage-pools/{pool}/volumes/{type}/{name} | 
[**deleteStoragePoolsByNameVolumesByTypeNameSnapshotsName**](StoragePoolsApi.md#deleteStoragePoolsByNameVolumesByTypeNameSnapshotsName) | **DELETE** /1.0/storage-pools/{pool}/volumes/{type}/{name}/snapshots/name | 
[**getStoragePools**](StoragePoolsApi.md#getStoragePools) | **GET** /1.0/storage-pools | 
[**getStoragePoolsByName**](StoragePoolsApi.md#getStoragePoolsByName) | **GET** /1.0/storage-pools/{pool} | 
[**getStoragePoolsByNameResources**](StoragePoolsApi.md#getStoragePoolsByNameResources) | **GET** /1.0/storage-pools/{pool}/resources | 
[**getStoragePoolsByNameVolumes**](StoragePoolsApi.md#getStoragePoolsByNameVolumes) | **GET** /1.0/storage-pools/{pool}/volumes | 
[**getStoragePoolsByNameVolumesByTypeName**](StoragePoolsApi.md#getStoragePoolsByNameVolumesByTypeName) | **GET** /1.0/storage-pools/{pool}/volumes/{type}/{name} | 
[**getStoragePoolsByNameVolumesByTypeNameSnapshots**](StoragePoolsApi.md#getStoragePoolsByNameVolumesByTypeNameSnapshots) | **GET** /1.0/storage-pools/{pool}/volumes/{type}/{name}/snapshots | 
[**getStoragePoolsByNameVolumesByTypeNameSnapshotsName**](StoragePoolsApi.md#getStoragePoolsByNameVolumesByTypeNameSnapshotsName) | **GET** /1.0/storage-pools/{pool}/volumes/{type}/{name}/snapshots/name | 
[**patchStoragePoolsByName**](StoragePoolsApi.md#patchStoragePoolsByName) | **PATCH** /1.0/storage-pools/{pool} | 
[**patchStoragePoolsByNameVolumesByTypeName**](StoragePoolsApi.md#patchStoragePoolsByNameVolumesByTypeName) | **PATCH** /1.0/storage-pools/{pool}/volumes/{type}/{name} | 
[**postStoragePools**](StoragePoolsApi.md#postStoragePools) | **POST** /1.0/storage-pools | 
[**postStoragePoolsByNameVolumes**](StoragePoolsApi.md#postStoragePoolsByNameVolumes) | **POST** /1.0/storage-pools/{pool}/volumes | 
[**postStoragePoolsByNameVolumesByType**](StoragePoolsApi.md#postStoragePoolsByNameVolumesByType) | **POST** /1.0/storage-pools/{pool}/volumes/{type} | 
[**postStoragePoolsByNameVolumesByTypeName**](StoragePoolsApi.md#postStoragePoolsByNameVolumesByTypeName) | **POST** /1.0/storage-pools/{pool}/volumes/{type}/{name} | 
[**postStoragePoolsByNameVolumesByTypeNameSnapshots**](StoragePoolsApi.md#postStoragePoolsByNameVolumesByTypeNameSnapshots) | **POST** /1.0/storage-pools/{pool}/volumes/{type}/{name}/snapshots | 
[**postStoragePoolsByNameVolumesByTypeNameSnapshotsName**](StoragePoolsApi.md#postStoragePoolsByNameVolumesByTypeNameSnapshotsName) | **POST** /1.0/storage-pools/{pool}/volumes/{type}/{name}/snapshots/name | 
[**putStoragePoolsByName**](StoragePoolsApi.md#putStoragePoolsByName) | **PUT** /1.0/storage-pools/{pool} | 
[**putStoragePoolsByNameVolumesByTypeName**](StoragePoolsApi.md#putStoragePoolsByNameVolumesByTypeName) | **PUT** /1.0/storage-pools/{pool}/volumes/{type}/{name} | 
[**putStoragePoolsByNameVolumesByTypeNameSnapshotsName**](StoragePoolsApi.md#putStoragePoolsByNameVolumesByTypeNameSnapshotsName) | **PUT** /1.0/storage-pools/{pool}/volumes/{type}/{name}/snapshots/name | 


<a name="deleteStoragePoolsByName"></a>
# **deleteStoragePoolsByName**
> BasicStandardReturnValueResponse deleteStoragePoolsByName(pool)



Remove a storage pool

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.StoragePoolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    StoragePoolsApi apiInstance = new StoragePoolsApi(defaultClient);
    String pool = "pool_example"; // String | Storage pool name
    try {
      BasicStandardReturnValueResponse result = apiInstance.deleteStoragePoolsByName(pool);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePoolsApi#deleteStoragePoolsByName");
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
 **pool** | **String**| Storage pool name |

### Return type

[**BasicStandardReturnValueResponse**](BasicStandardReturnValueResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | A standard return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |
**403** | A standard error response |  -  |

<a name="deleteStoragePoolsByNameVolumesByTypeName"></a>
# **deleteStoragePoolsByNameVolumesByTypeName**
> BasicStandardReturnValueResponse deleteStoragePoolsByNameVolumesByTypeName(pool, type, name)



Delete a storage volume of a given type on a given storage pool

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.StoragePoolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    StoragePoolsApi apiInstance = new StoragePoolsApi(defaultClient);
    String pool = "pool_example"; // String | Storage pool name
    String type = "type_example"; // String | Type of the volume
    String name = "name_example"; // String | name
    try {
      BasicStandardReturnValueResponse result = apiInstance.deleteStoragePoolsByNameVolumesByTypeName(pool, type, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePoolsApi#deleteStoragePoolsByNameVolumesByTypeName");
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
 **pool** | **String**| Storage pool name |
 **type** | **String**| Type of the volume |
 **name** | **String**| name |

### Return type

[**BasicStandardReturnValueResponse**](BasicStandardReturnValueResponse.md)

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

<a name="deleteStoragePoolsByNameVolumesByTypeNameSnapshotsName"></a>
# **deleteStoragePoolsByNameVolumesByTypeNameSnapshotsName**
> BasicBackgroundOperationResponse deleteStoragePoolsByNameVolumesByTypeNameSnapshotsName(pool, type, name)



Remove the volume snapshot

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.StoragePoolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    StoragePoolsApi apiInstance = new StoragePoolsApi(defaultClient);
    String pool = "pool_example"; // String | Storage pool name
    String type = "type_example"; // String | Type of the volume
    String name = "name_example"; // String | name
    try {
      BasicBackgroundOperationResponse result = apiInstance.deleteStoragePoolsByNameVolumesByTypeNameSnapshotsName(pool, type, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePoolsApi#deleteStoragePoolsByNameVolumesByTypeNameSnapshotsName");
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
 **pool** | **String**| Storage pool name |
 **type** | **String**| Type of the volume |
 **name** | **String**| name |

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

<a name="getStoragePools"></a>
# **getStoragePools**
> List&lt;String&gt; getStoragePools(recursion, filter)



List of storage pools

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.StoragePoolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    StoragePoolsApi apiInstance = new StoragePoolsApi(defaultClient);
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      List<String> result = apiInstance.getStoragePools(recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePoolsApi#getStoragePools");
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
**200** | List of storage pools |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getStoragePoolsByName"></a>
# **getStoragePoolsByName**
> GetStoragePoolsByNameResponse getStoragePoolsByName(pool, recursion, filter)



Information about a storage pool

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.StoragePoolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    StoragePoolsApi apiInstance = new StoragePoolsApi(defaultClient);
    String pool = "pool_example"; // String | Storage pool name
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      GetStoragePoolsByNameResponse result = apiInstance.getStoragePoolsByName(pool, recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePoolsApi#getStoragePoolsByName");
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
 **pool** | **String**| Storage pool name |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]

### Return type

[**GetStoragePoolsByNameResponse**](GetStoragePoolsByNameResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Information about a storage pool |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getStoragePoolsByNameResources"></a>
# **getStoragePoolsByNameResources**
> GetStoragePoolsByNameResourcesResponse getStoragePoolsByNameResources(pool, recursion, filter)



Information about the resources available to the storage pool

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.StoragePoolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    StoragePoolsApi apiInstance = new StoragePoolsApi(defaultClient);
    String pool = "pool_example"; // String | Profiles name
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      GetStoragePoolsByNameResourcesResponse result = apiInstance.getStoragePoolsByNameResources(pool, recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePoolsApi#getStoragePoolsByNameResources");
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
 **pool** | **String**| Profiles name |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]

### Return type

[**GetStoragePoolsByNameResourcesResponse**](GetStoragePoolsByNameResourcesResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Information about the resources available to the storage pool |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getStoragePoolsByNameVolumes"></a>
# **getStoragePoolsByNameVolumes**
> List&lt;String&gt; getStoragePoolsByNameVolumes(pool, recursion, filter)



List of storage volumes

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.StoragePoolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    StoragePoolsApi apiInstance = new StoragePoolsApi(defaultClient);
    String pool = "pool_example"; // String | Storage pool name
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      List<String> result = apiInstance.getStoragePoolsByNameVolumes(pool, recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePoolsApi#getStoragePoolsByNameVolumes");
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
 **pool** | **String**| Storage pool name |
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
**200** | list of storage volumes |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getStoragePoolsByNameVolumesByTypeName"></a>
# **getStoragePoolsByNameVolumesByTypeName**
> GetStoragePoolsByNameVolumesByTypeNameResponse getStoragePoolsByNameVolumesByTypeName(pool, type, name, recursion, filter)



Information about a storage volume of a given type on a storage pool

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.StoragePoolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    StoragePoolsApi apiInstance = new StoragePoolsApi(defaultClient);
    String pool = "pool_example"; // String | Storage pool name
    String type = "type_example"; // String | Type of the volume
    String name = "name_example"; // String | name
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      GetStoragePoolsByNameVolumesByTypeNameResponse result = apiInstance.getStoragePoolsByNameVolumesByTypeName(pool, type, name, recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePoolsApi#getStoragePoolsByNameVolumesByTypeName");
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
 **pool** | **String**| Storage pool name |
 **type** | **String**| Type of the volume |
 **name** | **String**| name |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]

### Return type

[**GetStoragePoolsByNameVolumesByTypeNameResponse**](GetStoragePoolsByNameVolumesByTypeNameResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Information about a storage volume of a given type on a storage pool |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getStoragePoolsByNameVolumesByTypeNameSnapshots"></a>
# **getStoragePoolsByNameVolumesByTypeNameSnapshots**
> List&lt;String&gt; getStoragePoolsByNameVolumesByTypeNameSnapshots(pool, type, name, recursion, filter)



List of volume snapshots

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.StoragePoolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    StoragePoolsApi apiInstance = new StoragePoolsApi(defaultClient);
    String pool = "pool_example"; // String | Storage pool name
    String type = "type_example"; // String | Type of the volume
    String name = "name_example"; // String | name
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      List<String> result = apiInstance.getStoragePoolsByNameVolumesByTypeNameSnapshots(pool, type, name, recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePoolsApi#getStoragePoolsByNameVolumesByTypeNameSnapshots");
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
 **pool** | **String**| Storage pool name |
 **type** | **String**| Type of the volume |
 **name** | **String**| name |
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
**200** | List of volume snapshots |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getStoragePoolsByNameVolumesByTypeNameSnapshotsName"></a>
# **getStoragePoolsByNameVolumesByTypeNameSnapshotsName**
> GetStoragePoolsByNameVolumesByTypeNameSnapshotsNameResponse getStoragePoolsByNameVolumesByTypeNameSnapshotsName(pool, type, name, recursion, filter)



Snapshot information

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.StoragePoolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    StoragePoolsApi apiInstance = new StoragePoolsApi(defaultClient);
    String pool = "pool_example"; // String | Storage pool name
    String type = "type_example"; // String | Type of the volume
    String name = "name_example"; // String | name
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      GetStoragePoolsByNameVolumesByTypeNameSnapshotsNameResponse result = apiInstance.getStoragePoolsByNameVolumesByTypeNameSnapshotsName(pool, type, name, recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePoolsApi#getStoragePoolsByNameVolumesByTypeNameSnapshotsName");
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
 **pool** | **String**| Storage pool name |
 **type** | **String**| Type of the volume |
 **name** | **String**| name |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]

### Return type

[**GetStoragePoolsByNameVolumesByTypeNameSnapshotsNameResponse**](GetStoragePoolsByNameVolumesByTypeNameSnapshotsNameResponse.md)

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

<a name="patchStoragePoolsByName"></a>
# **patchStoragePoolsByName**
> BasicStandardReturnValueResponse patchStoragePoolsByName(pool, body)



Update the storage pool information

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.StoragePoolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    StoragePoolsApi apiInstance = new StoragePoolsApi(defaultClient);
    String pool = "pool_example"; // String | Storage pool name
    PatchStoragePoolsByNameRequest body = new PatchStoragePoolsByNameRequest(); // PatchStoragePoolsByNameRequest | Update the storage pool information
    try {
      BasicStandardReturnValueResponse result = apiInstance.patchStoragePoolsByName(pool, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePoolsApi#patchStoragePoolsByName");
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
 **pool** | **String**| Storage pool name |
 **body** | [**PatchStoragePoolsByNameRequest**](PatchStoragePoolsByNameRequest.md)| Update the storage pool information | [optional]

### Return type

[**BasicStandardReturnValueResponse**](BasicStandardReturnValueResponse.md)

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

<a name="patchStoragePoolsByNameVolumesByTypeName"></a>
# **patchStoragePoolsByNameVolumesByTypeName**
> BasicStandardReturnValueResponse patchStoragePoolsByNameVolumesByTypeName(pool, type, name, body)



Update the storage volume information

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.StoragePoolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    StoragePoolsApi apiInstance = new StoragePoolsApi(defaultClient);
    String pool = "pool_example"; // String | Storage pool name
    String type = "type_example"; // String | Type of the volume
    String name = "name_example"; // String | name
    UpdateStoragePoolsByNameVolumesByTypeNameRequest2 body = new UpdateStoragePoolsByNameVolumesByTypeNameRequest2(); // UpdateStoragePoolsByNameVolumesByTypeNameRequest2 | Update the storage volume information
    try {
      BasicStandardReturnValueResponse result = apiInstance.patchStoragePoolsByNameVolumesByTypeName(pool, type, name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePoolsApi#patchStoragePoolsByNameVolumesByTypeName");
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
 **pool** | **String**| Storage pool name |
 **type** | **String**| Type of the volume |
 **name** | **String**| name |
 **body** | [**UpdateStoragePoolsByNameVolumesByTypeNameRequest2**](UpdateStoragePoolsByNameVolumesByTypeNameRequest2.md)| Update the storage volume information | [optional]

### Return type

[**BasicStandardReturnValueResponse**](BasicStandardReturnValueResponse.md)

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

<a name="postStoragePools"></a>
# **postStoragePools**
> BasicStandardReturnValueResponse postStoragePools(body)



Define a new storage pool

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.StoragePoolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    StoragePoolsApi apiInstance = new StoragePoolsApi(defaultClient);
    CreateStoragePoolsRequest body = new CreateStoragePoolsRequest(); // CreateStoragePoolsRequest | Define a new storage pool
    try {
      BasicStandardReturnValueResponse result = apiInstance.postStoragePools(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePoolsApi#postStoragePools");
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
 **body** | [**CreateStoragePoolsRequest**](CreateStoragePoolsRequest.md)| Define a new storage pool | [optional]

### Return type

[**BasicStandardReturnValueResponse**](BasicStandardReturnValueResponse.md)

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

<a name="postStoragePoolsByNameVolumes"></a>
# **postStoragePoolsByNameVolumes**
> BasicStandardReturnValueResponse postStoragePoolsByNameVolumes(pool, body)



Create a new storage volume on a given storage pool

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.StoragePoolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    StoragePoolsApi apiInstance = new StoragePoolsApi(defaultClient);
    String pool = "pool_example"; // String | Storage pool name
    CreateStoragePoolsByNameVolumesRequest body = new CreateStoragePoolsByNameVolumesRequest(); // CreateStoragePoolsByNameVolumesRequest | Create a new storage volume on a given storage pool
    try {
      BasicStandardReturnValueResponse result = apiInstance.postStoragePoolsByNameVolumes(pool, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePoolsApi#postStoragePoolsByNameVolumes");
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
 **pool** | **String**| Storage pool name |
 **body** | [**CreateStoragePoolsByNameVolumesRequest**](CreateStoragePoolsByNameVolumesRequest.md)| Create a new storage volume on a given storage pool | [optional]

### Return type

[**BasicStandardReturnValueResponse**](BasicStandardReturnValueResponse.md)

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

<a name="postStoragePoolsByNameVolumesByType"></a>
# **postStoragePoolsByNameVolumesByType**
> BasicStandardReturnValueResponse postStoragePoolsByNameVolumesByType(pool, type, body)



Create a new storage volume of a particular type on a given storage pool

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.StoragePoolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    StoragePoolsApi apiInstance = new StoragePoolsApi(defaultClient);
    String pool = "pool_example"; // String | Storage pool name
    String type = "type_example"; // String | Type of the volume
    CreateStoragePoolsByNameVolumesByTypeRequest body = new CreateStoragePoolsByNameVolumesByTypeRequest(); // CreateStoragePoolsByNameVolumesByTypeRequest | Create a new storage volume of a particular type on a given storage pool
    try {
      BasicStandardReturnValueResponse result = apiInstance.postStoragePoolsByNameVolumesByType(pool, type, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePoolsApi#postStoragePoolsByNameVolumesByType");
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
 **pool** | **String**| Storage pool name |
 **type** | **String**| Type of the volume |
 **body** | [**CreateStoragePoolsByNameVolumesByTypeRequest**](CreateStoragePoolsByNameVolumesByTypeRequest.md)| Create a new storage volume of a particular type on a given storage pool | [optional]

### Return type

[**BasicStandardReturnValueResponse**](BasicStandardReturnValueResponse.md)

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

<a name="postStoragePoolsByNameVolumesByTypeName"></a>
# **postStoragePoolsByNameVolumesByTypeName**
> BasicBackgroundOperationResponse postStoragePoolsByNameVolumesByTypeName(pool, type, name, body)



Rename a storage volume on a given storage pool

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.StoragePoolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    StoragePoolsApi apiInstance = new StoragePoolsApi(defaultClient);
    String pool = "pool_example"; // String | Storage pool name
    String type = "type_example"; // String | Type of the volume
    String name = "name_example"; // String | name
    CreateStoragePoolsByNameVolumesByTypeNameRequest body = new CreateStoragePoolsByNameVolumesByTypeNameRequest(); // CreateStoragePoolsByNameVolumesByTypeNameRequest | Rename a storage volume on a given storage pool
    try {
      BasicBackgroundOperationResponse result = apiInstance.postStoragePoolsByNameVolumesByTypeName(pool, type, name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePoolsApi#postStoragePoolsByNameVolumesByTypeName");
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
 **pool** | **String**| Storage pool name |
 **type** | **String**| Type of the volume |
 **name** | **String**| name |
 **body** | [**CreateStoragePoolsByNameVolumesByTypeNameRequest**](CreateStoragePoolsByNameVolumesByTypeNameRequest.md)| Rename a storage volume on a given storage pool | [optional]

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
**200** | Create Instances By Name Exec Response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="postStoragePoolsByNameVolumesByTypeNameSnapshots"></a>
# **postStoragePoolsByNameVolumesByTypeNameSnapshots**
> BasicBackgroundOperationResponse postStoragePoolsByNameVolumesByTypeNameSnapshots(pool, type, name, body)



Create a new volume snapshot

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.StoragePoolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    StoragePoolsApi apiInstance = new StoragePoolsApi(defaultClient);
    String pool = "pool_example"; // String | Storage pool name
    String type = "type_example"; // String | Type of the volume
    String name = "name_example"; // String | name
    CreateStoragePoolsByNameVolumesByTypeNameSnapshotsRequest body = new CreateStoragePoolsByNameVolumesByTypeNameSnapshotsRequest(); // CreateStoragePoolsByNameVolumesByTypeNameSnapshotsRequest | Create a new volume snapshot
    try {
      BasicBackgroundOperationResponse result = apiInstance.postStoragePoolsByNameVolumesByTypeNameSnapshots(pool, type, name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePoolsApi#postStoragePoolsByNameVolumesByTypeNameSnapshots");
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
 **pool** | **String**| Storage pool name |
 **type** | **String**| Type of the volume |
 **name** | **String**| name |
 **body** | [**CreateStoragePoolsByNameVolumesByTypeNameSnapshotsRequest**](CreateStoragePoolsByNameVolumesByTypeNameSnapshotsRequest.md)| Create a new volume snapshot | [optional]

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

<a name="postStoragePoolsByNameVolumesByTypeNameSnapshotsName"></a>
# **postStoragePoolsByNameVolumesByTypeNameSnapshotsName**
> BasicBackgroundOperationResponse postStoragePoolsByNameVolumesByTypeNameSnapshotsName(pool, type, name, body)



Used to rename the volume snapshot

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.StoragePoolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    StoragePoolsApi apiInstance = new StoragePoolsApi(defaultClient);
    String pool = "pool_example"; // String | Storage pool name
    String type = "type_example"; // String | Type of the volume
    String name = "name_example"; // String | name
    CreateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest body = new CreateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest(); // CreateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest | Used to rename the volume snapshot
    try {
      BasicBackgroundOperationResponse result = apiInstance.postStoragePoolsByNameVolumesByTypeNameSnapshotsName(pool, type, name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePoolsApi#postStoragePoolsByNameVolumesByTypeNameSnapshotsName");
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
 **pool** | **String**| Storage pool name |
 **type** | **String**| Type of the volume |
 **name** | **String**| name |
 **body** | [**CreateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest**](CreateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest.md)| Used to rename the volume snapshot | [optional]

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

<a name="putStoragePoolsByName"></a>
# **putStoragePoolsByName**
> BasicStandardReturnValueResponse putStoragePoolsByName(pool, body)



Replace the storage pool information

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.StoragePoolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    StoragePoolsApi apiInstance = new StoragePoolsApi(defaultClient);
    String pool = "pool_example"; // String | Storage pool name
    UpdateStoragePoolsByNameRequest body = new UpdateStoragePoolsByNameRequest(); // UpdateStoragePoolsByNameRequest | Replace the storage pool information
    try {
      BasicStandardReturnValueResponse result = apiInstance.putStoragePoolsByName(pool, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePoolsApi#putStoragePoolsByName");
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
 **pool** | **String**| Storage pool name |
 **body** | [**UpdateStoragePoolsByNameRequest**](UpdateStoragePoolsByNameRequest.md)| Replace the storage pool information | [optional]

### Return type

[**BasicStandardReturnValueResponse**](BasicStandardReturnValueResponse.md)

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

<a name="putStoragePoolsByNameVolumesByTypeName"></a>
# **putStoragePoolsByNameVolumesByTypeName**
> BasicStandardReturnValueResponse putStoragePoolsByNameVolumesByTypeName(pool, type, name, body)



Replace the storage volume information or restore from snapshot

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.StoragePoolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    StoragePoolsApi apiInstance = new StoragePoolsApi(defaultClient);
    String pool = "pool_example"; // String | Storage pool name
    String type = "type_example"; // String | Type of the volume
    String name = "name_example"; // String | name
    UpdateStoragePoolsByNameVolumesByTypeNameRequest body = new UpdateStoragePoolsByNameVolumesByTypeNameRequest(); // UpdateStoragePoolsByNameVolumesByTypeNameRequest | Replace the storage volume information or restore from snapshot
    try {
      BasicStandardReturnValueResponse result = apiInstance.putStoragePoolsByNameVolumesByTypeName(pool, type, name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePoolsApi#putStoragePoolsByNameVolumesByTypeName");
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
 **pool** | **String**| Storage pool name |
 **type** | **String**| Type of the volume |
 **name** | **String**| name |
 **body** | [**UpdateStoragePoolsByNameVolumesByTypeNameRequest**](UpdateStoragePoolsByNameVolumesByTypeNameRequest.md)| Replace the storage volume information or restore from snapshot | [optional]

### Return type

[**BasicStandardReturnValueResponse**](BasicStandardReturnValueResponse.md)

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

<a name="putStoragePoolsByNameVolumesByTypeNameSnapshotsName"></a>
# **putStoragePoolsByNameVolumesByTypeNameSnapshotsName**
> GetStoragePoolsByNameVolumesByTypeNameSnapshotsNameResponse putStoragePoolsByNameVolumesByTypeNameSnapshotsName(pool, type, name, body)



Volume snapshot information

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.StoragePoolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lxd.com");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    StoragePoolsApi apiInstance = new StoragePoolsApi(defaultClient);
    String pool = "pool_example"; // String | Storage pool name
    String type = "type_example"; // String | Type of the volume
    String name = "name_example"; // String | name
    UpdateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest body = new UpdateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest(); // UpdateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest | Volume snapshot information
    try {
      GetStoragePoolsByNameVolumesByTypeNameSnapshotsNameResponse result = apiInstance.putStoragePoolsByNameVolumesByTypeNameSnapshotsName(pool, type, name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragePoolsApi#putStoragePoolsByNameVolumesByTypeNameSnapshotsName");
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
 **pool** | **String**| Storage pool name |
 **type** | **String**| Type of the volume |
 **name** | **String**| name |
 **body** | [**UpdateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest**](UpdateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest.md)| Volume snapshot information | [optional]

### Return type

[**GetStoragePoolsByNameVolumesByTypeNameSnapshotsNameResponse**](GetStoragePoolsByNameVolumesByTypeNameSnapshotsNameResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Snapshot information |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

