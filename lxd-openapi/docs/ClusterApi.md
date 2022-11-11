# ClusterApi

All URIs are relative to *http://localhost:2375*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteClusterMembersByName**](ClusterApi.md#deleteClusterMembersByName) | **DELETE** /1.0/cluster/members/{name} |  |
| [**deleteClusterMembersByNameWithHttpInfo**](ClusterApi.md#deleteClusterMembersByNameWithHttpInfo) | **DELETE** /1.0/cluster/members/{name} |  |
| [**getCluster**](ClusterApi.md#getCluster) | **GET** /1.0/cluster |  |
| [**getClusterWithHttpInfo**](ClusterApi.md#getClusterWithHttpInfo) | **GET** /1.0/cluster |  |
| [**getClusterMembers**](ClusterApi.md#getClusterMembers) | **GET** /1.0/cluster/members |  |
| [**getClusterMembersWithHttpInfo**](ClusterApi.md#getClusterMembersWithHttpInfo) | **GET** /1.0/cluster/members |  |
| [**getClusterMembersByName**](ClusterApi.md#getClusterMembersByName) | **GET** /1.0/cluster/members/{name} |  |
| [**getClusterMembersByNameWithHttpInfo**](ClusterApi.md#getClusterMembersByNameWithHttpInfo) | **GET** /1.0/cluster/members/{name} |  |
| [**postClusterMembersByName**](ClusterApi.md#postClusterMembersByName) | **POST** /1.0/cluster/members/{name} |  |
| [**postClusterMembersByNameWithHttpInfo**](ClusterApi.md#postClusterMembersByNameWithHttpInfo) | **POST** /1.0/cluster/members/{name} |  |
| [**putCluster**](ClusterApi.md#putCluster) | **PUT** /1.0/cluster |  |
| [**putClusterWithHttpInfo**](ClusterApi.md#putClusterWithHttpInfo) | **PUT** /1.0/cluster |  |



## deleteClusterMembersByName

> CompletableFuture<BackgroundOperationResponse> deleteClusterMembersByName(name, force)



Remove a member of the cluster

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClusterApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ClusterApi apiInstance = new ClusterApi(defaultClient);
        String name = "name_example"; // String | Members name
        BigDecimal force = new BigDecimal(78); // BigDecimal | force
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.deleteClusterMembersByName(name, force);
            System.out.println(result.get());
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Members name | |
| **force** | **BigDecimal**| force | [optional] |

### Return type

CompletableFuture<[**BackgroundOperationResponse**](BackgroundOperationResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | A basic background return value response |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## deleteClusterMembersByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> deleteClusterMembersByName deleteClusterMembersByNameWithHttpInfo(name, force)



Remove a member of the cluster

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClusterApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ClusterApi apiInstance = new ClusterApi(defaultClient);
        String name = "name_example"; // String | Members name
        BigDecimal force = new BigDecimal(78); // BigDecimal | force
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.deleteClusterMembersByNameWithHttpInfo(name, force);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ClusterApi#deleteClusterMembersByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ClusterApi#deleteClusterMembersByName");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Members name | |
| **force** | **BigDecimal**| force | [optional] |

### Return type

CompletableFuture<ApiResponse<[**BackgroundOperationResponse**](BackgroundOperationResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | A basic background return value response |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## getCluster

> CompletableFuture<BackgroundOperationResponse> getCluster(recursion, filter)



Information about a cluster (such as networks and storage pools)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClusterApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ClusterApi apiInstance = new ClusterApi(defaultClient);
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.getCluster(recursion, filter);
            System.out.println(result.get());
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional] |
| **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional] |

### Return type

CompletableFuture<[**BackgroundOperationResponse**](BackgroundOperationResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Information about a cluster (such as networks and storage pools) |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## getClusterWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> getCluster getClusterWithHttpInfo(recursion, filter)



Information about a cluster (such as networks and storage pools)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClusterApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ClusterApi apiInstance = new ClusterApi(defaultClient);
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.getClusterWithHttpInfo(recursion, filter);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ClusterApi#getCluster");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ClusterApi#getCluster");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional] |
| **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**BackgroundOperationResponse**](BackgroundOperationResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Information about a cluster (such as networks and storage pools) |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## getClusterMembers

> CompletableFuture<BackgroundOperationResponse> getClusterMembers(recursion, filter)



List of LXD members in the cluster

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClusterApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ClusterApi apiInstance = new ClusterApi(defaultClient);
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.getClusterMembers(recursion, filter);
            System.out.println(result.get());
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional] |
| **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional] |

### Return type

CompletableFuture<[**BackgroundOperationResponse**](BackgroundOperationResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of LXD members in the cluster |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## getClusterMembersWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> getClusterMembers getClusterMembersWithHttpInfo(recursion, filter)



List of LXD members in the cluster

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClusterApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ClusterApi apiInstance = new ClusterApi(defaultClient);
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.getClusterMembersWithHttpInfo(recursion, filter);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ClusterApi#getClusterMembers");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ClusterApi#getClusterMembers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional] |
| **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**BackgroundOperationResponse**](BackgroundOperationResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of LXD members in the cluster |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## getClusterMembersByName

> CompletableFuture<BackgroundOperationResponse> getClusterMembersByName(name, recursion, filter)



Retrieve the member&#39;s information and status

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClusterApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ClusterApi apiInstance = new ClusterApi(defaultClient);
        String name = "name_example"; // String | Members name
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.getClusterMembersByName(name, recursion, filter);
            System.out.println(result.get());
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Members name | |
| **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional] |
| **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional] |

### Return type

CompletableFuture<[**BackgroundOperationResponse**](BackgroundOperationResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieve the member&#39;s information and status |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## getClusterMembersByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> getClusterMembersByName getClusterMembersByNameWithHttpInfo(name, recursion, filter)



Retrieve the member&#39;s information and status

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClusterApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ClusterApi apiInstance = new ClusterApi(defaultClient);
        String name = "name_example"; // String | Members name
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.getClusterMembersByNameWithHttpInfo(name, recursion, filter);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ClusterApi#getClusterMembersByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ClusterApi#getClusterMembersByName");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Members name | |
| **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional] |
| **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**BackgroundOperationResponse**](BackgroundOperationResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieve the member&#39;s information and status |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## postClusterMembersByName

> CompletableFuture<BackgroundOperationResponse> postClusterMembersByName(name, body)



Rename a cluster member

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClusterApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ClusterApi apiInstance = new ClusterApi(defaultClient);
        String name = "name_example"; // String | Members name
        UpdateClusterMembersByNameRequest body = new UpdateClusterMembersByNameRequest(); // UpdateClusterMembersByNameRequest | Rename a cluster member
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.postClusterMembersByName(name, body);
            System.out.println(result.get());
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Members name | |
| **body** | [**UpdateClusterMembersByNameRequest**](UpdateClusterMembersByNameRequest.md)| Rename a cluster member | [optional] |

### Return type

CompletableFuture<[**BackgroundOperationResponse**](BackgroundOperationResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A standard return value response |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## postClusterMembersByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> postClusterMembersByName postClusterMembersByNameWithHttpInfo(name, body)



Rename a cluster member

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClusterApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ClusterApi apiInstance = new ClusterApi(defaultClient);
        String name = "name_example"; // String | Members name
        UpdateClusterMembersByNameRequest body = new UpdateClusterMembersByNameRequest(); // UpdateClusterMembersByNameRequest | Rename a cluster member
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.postClusterMembersByNameWithHttpInfo(name, body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ClusterApi#postClusterMembersByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ClusterApi#postClusterMembersByName");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Members name | |
| **body** | [**UpdateClusterMembersByNameRequest**](UpdateClusterMembersByNameRequest.md)| Rename a cluster member | [optional] |

### Return type

CompletableFuture<ApiResponse<[**BackgroundOperationResponse**](BackgroundOperationResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A standard return value response |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## putCluster

> CompletableFuture<BackgroundOperationResponse> putCluster(body)



Bootstrap or join a cluster, or disable clustering on this node

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClusterApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ClusterApi apiInstance = new ClusterApi(defaultClient);
        UpdateClusterRequest body = new UpdateClusterRequest(); // UpdateClusterRequest | Bootstrap or join a cluster, or disable clustering on this node
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.putCluster(body);
            System.out.println(result.get());
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**UpdateClusterRequest**](UpdateClusterRequest.md)| Bootstrap or join a cluster, or disable clustering on this node | [optional] |

### Return type

CompletableFuture<[**BackgroundOperationResponse**](BackgroundOperationResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | A basic background return value response |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## putClusterWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> putCluster putClusterWithHttpInfo(body)



Bootstrap or join a cluster, or disable clustering on this node

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClusterApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ClusterApi apiInstance = new ClusterApi(defaultClient);
        UpdateClusterRequest body = new UpdateClusterRequest(); // UpdateClusterRequest | Bootstrap or join a cluster, or disable clustering on this node
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.putClusterWithHttpInfo(body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ClusterApi#putCluster");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ClusterApi#putCluster");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**UpdateClusterRequest**](UpdateClusterRequest.md)| Bootstrap or join a cluster, or disable clustering on this node | [optional] |

### Return type

CompletableFuture<ApiResponse<[**BackgroundOperationResponse**](BackgroundOperationResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | A basic background return value response |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

