# NetworksApi

All URIs are relative to *http://localhost:2375*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteNetworksByName**](NetworksApi.md#deleteNetworksByName) | **DELETE** /1.0/networks/{name} | 
[**deleteNetworksByNameWithHttpInfo**](NetworksApi.md#deleteNetworksByNameWithHttpInfo) | **DELETE** /1.0/networks/{name} | 
[**getNetworks**](NetworksApi.md#getNetworks) | **GET** /1.0/networks | 
[**getNetworksWithHttpInfo**](NetworksApi.md#getNetworksWithHttpInfo) | **GET** /1.0/networks | 
[**getNetworksByName**](NetworksApi.md#getNetworksByName) | **GET** /1.0/networks/{name} | 
[**getNetworksByNameWithHttpInfo**](NetworksApi.md#getNetworksByNameWithHttpInfo) | **GET** /1.0/networks/{name} | 
[**getNetworksByNameState**](NetworksApi.md#getNetworksByNameState) | **GET** /1.0/networks/{name}/state | 
[**getNetworksByNameStateWithHttpInfo**](NetworksApi.md#getNetworksByNameStateWithHttpInfo) | **GET** /1.0/networks/{name}/state | 
[**patchNetworksByName**](NetworksApi.md#patchNetworksByName) | **PATCH** /1.0/networks/{name} | 
[**patchNetworksByNameWithHttpInfo**](NetworksApi.md#patchNetworksByNameWithHttpInfo) | **PATCH** /1.0/networks/{name} | 
[**postNetworks**](NetworksApi.md#postNetworks) | **POST** /1.0/networks | 
[**postNetworksWithHttpInfo**](NetworksApi.md#postNetworksWithHttpInfo) | **POST** /1.0/networks | 
[**postNetworksByName**](NetworksApi.md#postNetworksByName) | **POST** /1.0/networks/{name} | 
[**postNetworksByNameWithHttpInfo**](NetworksApi.md#postNetworksByNameWithHttpInfo) | **POST** /1.0/networks/{name} | 
[**putNetworksByName**](NetworksApi.md#putNetworksByName) | **PUT** /1.0/networks/{name} | 
[**putNetworksByNameWithHttpInfo**](NetworksApi.md#putNetworksByNameWithHttpInfo) | **PUT** /1.0/networks/{name} | 



## deleteNetworksByName

> CompletableFuture<BackgroundOperationResponse> deleteNetworksByName(name)



Remove a network

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.NetworksApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        NetworksApi apiInstance = new NetworksApi(defaultClient);
        String name = "name_example"; // String | Name of the network
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.deleteNetworksByName(name);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworksApi#deleteNetworksByName");
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
 **name** | **String**| Name of the network |

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
| **202** | A standard return value response |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## deleteNetworksByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> deleteNetworksByName deleteNetworksByNameWithHttpInfo(name)



Remove a network

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.NetworksApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        NetworksApi apiInstance = new NetworksApi(defaultClient);
        String name = "name_example"; // String | Name of the network
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.deleteNetworksByNameWithHttpInfo(name);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NetworksApi#deleteNetworksByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworksApi#deleteNetworksByName");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the network |

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
| **202** | A standard return value response |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## getNetworks

> CompletableFuture<BackgroundOperationResponse> getNetworks(recursion, filter)



List of networks

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.NetworksApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        NetworksApi apiInstance = new NetworksApi(defaultClient);
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.getNetworks(recursion, filter);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworksApi#getNetworks");
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

CompletableFuture<[**BackgroundOperationResponse**](BackgroundOperationResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of networks |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## getNetworksWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> getNetworks getNetworksWithHttpInfo(recursion, filter)



List of networks

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.NetworksApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        NetworksApi apiInstance = new NetworksApi(defaultClient);
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.getNetworksWithHttpInfo(recursion, filter);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NetworksApi#getNetworks");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworksApi#getNetworks");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
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

CompletableFuture<ApiResponse<[**BackgroundOperationResponse**](BackgroundOperationResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of networks |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## getNetworksByName

> CompletableFuture<BackgroundOperationResponse> getNetworksByName(name, recursion, filter)



Information about a network

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.NetworksApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        NetworksApi apiInstance = new NetworksApi(defaultClient);
        String name = "name_example"; // String | Name of the network
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.getNetworksByName(name, recursion, filter);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworksApi#getNetworksByName");
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
 **name** | **String**| Name of the network |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]

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
| **200** | Information about a network |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## getNetworksByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> getNetworksByName getNetworksByNameWithHttpInfo(name, recursion, filter)



Information about a network

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.NetworksApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        NetworksApi apiInstance = new NetworksApi(defaultClient);
        String name = "name_example"; // String | Name of the network
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.getNetworksByNameWithHttpInfo(name, recursion, filter);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NetworksApi#getNetworksByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworksApi#getNetworksByName");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the network |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]

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
| **200** | Information about a network |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## getNetworksByNameState

> CompletableFuture<BackgroundOperationResponse> getNetworksByNameState(name, recursion, filter)



Network state

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.NetworksApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        NetworksApi apiInstance = new NetworksApi(defaultClient);
        String name = "name_example"; // String | Name of the network
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.getNetworksByNameState(name, recursion, filter);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworksApi#getNetworksByNameState");
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
 **name** | **String**| Name of the network |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]

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
| **200** | Network state |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## getNetworksByNameStateWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> getNetworksByNameState getNetworksByNameStateWithHttpInfo(name, recursion, filter)



Network state

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.NetworksApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        NetworksApi apiInstance = new NetworksApi(defaultClient);
        String name = "name_example"; // String | Name of the network
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.getNetworksByNameStateWithHttpInfo(name, recursion, filter);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NetworksApi#getNetworksByNameState");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworksApi#getNetworksByNameState");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the network |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]

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
| **200** | Network state |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## patchNetworksByName

> CompletableFuture<BackgroundOperationResponse> patchNetworksByName(name, body)



Update the network information

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.NetworksApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        NetworksApi apiInstance = new NetworksApi(defaultClient);
        String name = "name_example"; // String | Name of the network
        PatchNetworksByNameRequest body = new PatchNetworksByNameRequest(); // PatchNetworksByNameRequest | Update the network information
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.patchNetworksByName(name, body);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworksApi#patchNetworksByName");
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
 **name** | **String**| Name of the network |
 **body** | [**PatchNetworksByNameRequest**](PatchNetworksByNameRequest.md)| Update the network information | [optional]

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

## patchNetworksByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> patchNetworksByName patchNetworksByNameWithHttpInfo(name, body)



Update the network information

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.NetworksApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        NetworksApi apiInstance = new NetworksApi(defaultClient);
        String name = "name_example"; // String | Name of the network
        PatchNetworksByNameRequest body = new PatchNetworksByNameRequest(); // PatchNetworksByNameRequest | Update the network information
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.patchNetworksByNameWithHttpInfo(name, body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NetworksApi#patchNetworksByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworksApi#patchNetworksByName");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the network |
 **body** | [**PatchNetworksByNameRequest**](PatchNetworksByNameRequest.md)| Update the network information | [optional]

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


## postNetworks

> CompletableFuture<BackgroundOperationResponse> postNetworks(body)



Define a new network

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.NetworksApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        NetworksApi apiInstance = new NetworksApi(defaultClient);
        CreateNetworksRequest body = new CreateNetworksRequest(); // CreateNetworksRequest | Define a new network
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.postNetworks(body);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworksApi#postNetworks");
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
 **body** | [**CreateNetworksRequest**](CreateNetworksRequest.md)| Define a new network | [optional]

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

## postNetworksWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> postNetworks postNetworksWithHttpInfo(body)



Define a new network

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.NetworksApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        NetworksApi apiInstance = new NetworksApi(defaultClient);
        CreateNetworksRequest body = new CreateNetworksRequest(); // CreateNetworksRequest | Define a new network
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.postNetworksWithHttpInfo(body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NetworksApi#postNetworks");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworksApi#postNetworks");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateNetworksRequest**](CreateNetworksRequest.md)| Define a new network | [optional]

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


## postNetworksByName

> CompletableFuture<BackgroundOperationResponse> postNetworksByName(name, body)



Rename a network

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.NetworksApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        NetworksApi apiInstance = new NetworksApi(defaultClient);
        String name = "name_example"; // String | Name of the network
        CreateNetworksByNameRequest body = new CreateNetworksByNameRequest(); // CreateNetworksByNameRequest | Rename a network
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.postNetworksByName(name, body);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworksApi#postNetworksByName");
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
 **name** | **String**| Name of the network |
 **body** | [**CreateNetworksByNameRequest**](CreateNetworksByNameRequest.md)| Rename a network | [optional]

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
| **204** | A standard value return response |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |
| **409** | A standard error response |  -  |

## postNetworksByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> postNetworksByName postNetworksByNameWithHttpInfo(name, body)



Rename a network

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.NetworksApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        NetworksApi apiInstance = new NetworksApi(defaultClient);
        String name = "name_example"; // String | Name of the network
        CreateNetworksByNameRequest body = new CreateNetworksByNameRequest(); // CreateNetworksByNameRequest | Rename a network
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.postNetworksByNameWithHttpInfo(name, body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NetworksApi#postNetworksByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworksApi#postNetworksByName");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the network |
 **body** | [**CreateNetworksByNameRequest**](CreateNetworksByNameRequest.md)| Rename a network | [optional]

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
| **204** | A standard value return response |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |
| **409** | A standard error response |  -  |


## putNetworksByName

> CompletableFuture<BackgroundOperationResponse> putNetworksByName(name, body)



Replace the network information

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.NetworksApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        NetworksApi apiInstance = new NetworksApi(defaultClient);
        String name = "name_example"; // String | Name of the network
        UpdateNetworksByNameRequest body = new UpdateNetworksByNameRequest(); // UpdateNetworksByNameRequest | Replace the network information
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.putNetworksByName(name, body);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworksApi#putNetworksByName");
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
 **name** | **String**| Name of the network |
 **body** | [**UpdateNetworksByNameRequest**](UpdateNetworksByNameRequest.md)| Replace the network information | [optional]

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

## putNetworksByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> putNetworksByName putNetworksByNameWithHttpInfo(name, body)



Replace the network information

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.NetworksApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        NetworksApi apiInstance = new NetworksApi(defaultClient);
        String name = "name_example"; // String | Name of the network
        UpdateNetworksByNameRequest body = new UpdateNetworksByNameRequest(); // UpdateNetworksByNameRequest | Replace the network information
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.putNetworksByNameWithHttpInfo(name, body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NetworksApi#putNetworksByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworksApi#putNetworksByName");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the network |
 **body** | [**UpdateNetworksByNameRequest**](UpdateNetworksByNameRequest.md)| Replace the network information | [optional]

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

