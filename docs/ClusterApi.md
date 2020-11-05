# ClusterApi

All URIs are relative to *http://localhost:2375*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteClusterMembersByName**](ClusterApi.md#deleteClusterMembersByName) | **DELETE** /1.0/cluster/members/{name} | 
[**getCluster**](ClusterApi.md#getCluster) | **GET** /1.0/cluster | 
[**getClusterMembers**](ClusterApi.md#getClusterMembers) | **GET** /1.0/cluster/members | 
[**getClusterMembersByName**](ClusterApi.md#getClusterMembersByName) | **GET** /1.0/cluster/members/{name} | 
[**postClusterMembersByName**](ClusterApi.md#postClusterMembersByName) | **POST** /1.0/cluster/members/{name} | 
[**putCluster**](ClusterApi.md#putCluster) | **PUT** /1.0/cluster | 


<a name="deleteClusterMembersByName"></a>
# **deleteClusterMembersByName**
> BackgroundOperationResponse deleteClusterMembersByName(name, force)



Remove a member of the cluster

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ClusterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");

    ClusterApi apiInstance = new ClusterApi(defaultClient);
    String name = "name_example"; // String | Members name
    BigDecimal force = new BigDecimal(); // BigDecimal | force
    try {
      BackgroundOperationResponse result = apiInstance.deleteClusterMembersByName(name, force);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterApi#deleteClusterMembersByName");
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
 **name** | **String**| Members name |
 **force** | **BigDecimal**| force | [optional]

### Return type

[**BackgroundOperationResponse**](BackgroundOperationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | A basic background return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getCluster"></a>
# **getCluster**
> BackgroundOperationResponse getCluster(recursion, filter)



Information about a cluster (such as networks and storage pools)

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ClusterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");

    ClusterApi apiInstance = new ClusterApi(defaultClient);
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      BackgroundOperationResponse result = apiInstance.getCluster(recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterApi#getCluster");
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

[**BackgroundOperationResponse**](BackgroundOperationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Information about a cluster (such as networks and storage pools) |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getClusterMembers"></a>
# **getClusterMembers**
> BackgroundOperationResponse getClusterMembers(recursion, filter)



List of LXD members in the cluster

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ClusterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");

    ClusterApi apiInstance = new ClusterApi(defaultClient);
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      BackgroundOperationResponse result = apiInstance.getClusterMembers(recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterApi#getClusterMembers");
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

[**BackgroundOperationResponse**](BackgroundOperationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of LXD members in the cluster |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getClusterMembersByName"></a>
# **getClusterMembersByName**
> BackgroundOperationResponse getClusterMembersByName(name, recursion, filter)



Retrieve the member&#39;s information and status

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ClusterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");

    ClusterApi apiInstance = new ClusterApi(defaultClient);
    String name = "name_example"; // String | Members name
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      BackgroundOperationResponse result = apiInstance.getClusterMembersByName(name, recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterApi#getClusterMembersByName");
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
 **name** | **String**| Members name |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]

### Return type

[**BackgroundOperationResponse**](BackgroundOperationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieve the member&#39;s information and status |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="postClusterMembersByName"></a>
# **postClusterMembersByName**
> BackgroundOperationResponse postClusterMembersByName(name, body)



Rename a cluster member

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ClusterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");

    ClusterApi apiInstance = new ClusterApi(defaultClient);
    String name = "name_example"; // String | Members name
    UpdateClusterMembersByNameRequest body = new UpdateClusterMembersByNameRequest(); // UpdateClusterMembersByNameRequest | Rename a cluster member
    try {
      BackgroundOperationResponse result = apiInstance.postClusterMembersByName(name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterApi#postClusterMembersByName");
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
 **name** | **String**| Members name |
 **body** | [**UpdateClusterMembersByNameRequest**](UpdateClusterMembersByNameRequest.md)| Rename a cluster member | [optional]

### Return type

[**BackgroundOperationResponse**](BackgroundOperationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A standard return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="putCluster"></a>
# **putCluster**
> BackgroundOperationResponse putCluster(body)



Bootstrap or join a cluster, or disable clustering on this node

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ClusterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");

    ClusterApi apiInstance = new ClusterApi(defaultClient);
    UpdateClusterRequest body = new UpdateClusterRequest(); // UpdateClusterRequest | Bootstrap or join a cluster, or disable clustering on this node
    try {
      BackgroundOperationResponse result = apiInstance.putCluster(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterApi#putCluster");
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
 **body** | [**UpdateClusterRequest**](UpdateClusterRequest.md)| Bootstrap or join a cluster, or disable clustering on this node | [optional]

### Return type

[**BackgroundOperationResponse**](BackgroundOperationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | A basic background return value response |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

