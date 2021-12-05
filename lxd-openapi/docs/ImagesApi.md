# ImagesApi

All URIs are relative to *http://localhost:2375*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteImagesAliasesByName**](ImagesApi.md#deleteImagesAliasesByName) | **DELETE** /1.0/images/aliases/{name} | 
[**deleteImagesAliasesByNameWithHttpInfo**](ImagesApi.md#deleteImagesAliasesByNameWithHttpInfo) | **DELETE** /1.0/images/aliases/{name} | 
[**deleteImagesFingerprint**](ImagesApi.md#deleteImagesFingerprint) | **DELETE** /1.0/images/{fingerprint} | 
[**deleteImagesFingerprintWithHttpInfo**](ImagesApi.md#deleteImagesFingerprintWithHttpInfo) | **DELETE** /1.0/images/{fingerprint} | 
[**getImages**](ImagesApi.md#getImages) | **GET** /1.0/images | 
[**getImagesWithHttpInfo**](ImagesApi.md#getImagesWithHttpInfo) | **GET** /1.0/images | 
[**getImagesAliases**](ImagesApi.md#getImagesAliases) | **GET** /1.0/images/aliases | 
[**getImagesAliasesWithHttpInfo**](ImagesApi.md#getImagesAliasesWithHttpInfo) | **GET** /1.0/images/aliases | 
[**getImagesAliasesByName**](ImagesApi.md#getImagesAliasesByName) | **GET** /1.0/images/aliases/{name} | 
[**getImagesAliasesByNameWithHttpInfo**](ImagesApi.md#getImagesAliasesByNameWithHttpInfo) | **GET** /1.0/images/aliases/{name} | 
[**getImagesByFingerprintExport**](ImagesApi.md#getImagesByFingerprintExport) | **GET** /1.0/images/{fingerprint}/export | 
[**getImagesByFingerprintExportWithHttpInfo**](ImagesApi.md#getImagesByFingerprintExportWithHttpInfo) | **GET** /1.0/images/{fingerprint}/export | 
[**getImagesFingerprint**](ImagesApi.md#getImagesFingerprint) | **GET** /1.0/images/{fingerprint} | 
[**getImagesFingerprintWithHttpInfo**](ImagesApi.md#getImagesFingerprintWithHttpInfo) | **GET** /1.0/images/{fingerprint} | 
[**getImagesFingerprintRefresh**](ImagesApi.md#getImagesFingerprintRefresh) | **GET** /1.0/images/{fingerprint}/refresh | 
[**getImagesFingerprintRefreshWithHttpInfo**](ImagesApi.md#getImagesFingerprintRefreshWithHttpInfo) | **GET** /1.0/images/{fingerprint}/refresh | 
[**patchImagesAliasesByName**](ImagesApi.md#patchImagesAliasesByName) | **PATCH** /1.0/images/aliases/{name} | 
[**patchImagesAliasesByNameWithHttpInfo**](ImagesApi.md#patchImagesAliasesByNameWithHttpInfo) | **PATCH** /1.0/images/aliases/{name} | 
[**patchImagesFingerprint**](ImagesApi.md#patchImagesFingerprint) | **PATCH** /1.0/images/{fingerprint} | 
[**patchImagesFingerprintWithHttpInfo**](ImagesApi.md#patchImagesFingerprintWithHttpInfo) | **PATCH** /1.0/images/{fingerprint} | 
[**postImages**](ImagesApi.md#postImages) | **POST** /1.0/images | 
[**postImagesWithHttpInfo**](ImagesApi.md#postImagesWithHttpInfo) | **POST** /1.0/images | 
[**postImagesAliases**](ImagesApi.md#postImagesAliases) | **POST** /1.0/images/aliases | 
[**postImagesAliasesWithHttpInfo**](ImagesApi.md#postImagesAliasesWithHttpInfo) | **POST** /1.0/images/aliases | 
[**postImagesAliasesByName**](ImagesApi.md#postImagesAliasesByName) | **POST** /1.0/images/aliases/{name} | 
[**postImagesAliasesByNameWithHttpInfo**](ImagesApi.md#postImagesAliasesByNameWithHttpInfo) | **POST** /1.0/images/aliases/{name} | 
[**postImagesFingerprintExport**](ImagesApi.md#postImagesFingerprintExport) | **POST** /1.0/images/{fingerprint}/export | 
[**postImagesFingerprintExportWithHttpInfo**](ImagesApi.md#postImagesFingerprintExportWithHttpInfo) | **POST** /1.0/images/{fingerprint}/export | 
[**postImagesFingerprintSecret**](ImagesApi.md#postImagesFingerprintSecret) | **POST** /1.0/images/{fingerprint}/secret | 
[**postImagesFingerprintSecretWithHttpInfo**](ImagesApi.md#postImagesFingerprintSecretWithHttpInfo) | **POST** /1.0/images/{fingerprint}/secret | 
[**putImagesAliasesByName**](ImagesApi.md#putImagesAliasesByName) | **PUT** /1.0/images/aliases/{name} | 
[**putImagesAliasesByNameWithHttpInfo**](ImagesApi.md#putImagesAliasesByNameWithHttpInfo) | **PUT** /1.0/images/aliases/{name} | 
[**putImagesFingerprint**](ImagesApi.md#putImagesFingerprint) | **PUT** /1.0/images/{fingerprint} | 
[**putImagesFingerprintWithHttpInfo**](ImagesApi.md#putImagesFingerprintWithHttpInfo) | **PUT** /1.0/images/{fingerprint} | 



## deleteImagesAliasesByName

> CompletableFuture<BackgroundOperationResponse> deleteImagesAliasesByName(name)



Remove an alias

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String name = "name_example"; // String | Name of the alias
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.deleteImagesAliasesByName(name);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#deleteImagesAliasesByName");
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
 **name** | **String**| Name of the alias |

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
| **200** | A standard return value response |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## deleteImagesAliasesByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> deleteImagesAliasesByName deleteImagesAliasesByNameWithHttpInfo(name)



Remove an alias

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String name = "name_example"; // String | Name of the alias
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.deleteImagesAliasesByNameWithHttpInfo(name);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ImagesApi#deleteImagesAliasesByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#deleteImagesAliasesByName");
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
 **name** | **String**| Name of the alias |

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
| **200** | A standard return value response |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## deleteImagesFingerprint

> CompletableFuture<BackgroundOperationResponse> deleteImagesFingerprint(fingerprint)



Remove an image

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.deleteImagesFingerprint(fingerprint);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#deleteImagesFingerprint");
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
 **fingerprint** | **String**| Unique fingerprint |

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

## deleteImagesFingerprintWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> deleteImagesFingerprint deleteImagesFingerprintWithHttpInfo(fingerprint)



Remove an image

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.deleteImagesFingerprintWithHttpInfo(fingerprint);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ImagesApi#deleteImagesFingerprint");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#deleteImagesFingerprint");
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
 **fingerprint** | **String**| Unique fingerprint |

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


## getImages

> CompletableFuture<BackgroundOperationResponse> getImages(recursion, filter)



List of images (public or private)

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.getImages(recursion, filter);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#getImages");
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
| **200** | List of images (public or private) |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## getImagesWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> getImages getImagesWithHttpInfo(recursion, filter)



List of images (public or private)

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.getImagesWithHttpInfo(recursion, filter);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ImagesApi#getImages");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#getImages");
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
| **200** | List of images (public or private) |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## getImagesAliases

> CompletableFuture<BackgroundOperationResponse> getImagesAliases(recursion, filter)



List of aliases (public or private based on image visibility)

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.getImagesAliases(recursion, filter);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#getImagesAliases");
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
| **200** | List of aliases (public or private based on image visibility) |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## getImagesAliasesWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> getImagesAliases getImagesAliasesWithHttpInfo(recursion, filter)



List of aliases (public or private based on image visibility)

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.getImagesAliasesWithHttpInfo(recursion, filter);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ImagesApi#getImagesAliases");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#getImagesAliases");
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
| **200** | List of aliases (public or private based on image visibility) |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## getImagesAliasesByName

> CompletableFuture<BackgroundOperationResponse> getImagesAliasesByName(name, recursion, filter)



Alias description and target

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String name = "name_example"; // String | Name of the alias
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.getImagesAliasesByName(name, recursion, filter);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#getImagesAliasesByName");
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
 **name** | **String**| Name of the alias |
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
| **200** | Snapshot information |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## getImagesAliasesByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> getImagesAliasesByName getImagesAliasesByNameWithHttpInfo(name, recursion, filter)



Alias description and target

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String name = "name_example"; // String | Name of the alias
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.getImagesAliasesByNameWithHttpInfo(name, recursion, filter);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ImagesApi#getImagesAliasesByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#getImagesAliasesByName");
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
 **name** | **String**| Name of the alias |
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
| **200** | Snapshot information |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## getImagesByFingerprintExport

> CompletableFuture<BackgroundOperationResponse> getImagesByFingerprintExport(fingerprint, recursion, filter, secret)



Download the image tarball

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        String secret = "SECRET"; // String | secret
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.getImagesByFingerprintExport(fingerprint, recursion, filter, secret);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#getImagesByFingerprintExport");
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
 **fingerprint** | **String**| Unique fingerprint |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]
 **secret** | **String**| secret | [optional]

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
| **200** | Download the image tarball |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## getImagesByFingerprintExportWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> getImagesByFingerprintExport getImagesByFingerprintExportWithHttpInfo(fingerprint, recursion, filter, secret)



Download the image tarball

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        String secret = "SECRET"; // String | secret
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.getImagesByFingerprintExportWithHttpInfo(fingerprint, recursion, filter, secret);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ImagesApi#getImagesByFingerprintExport");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#getImagesByFingerprintExport");
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
 **fingerprint** | **String**| Unique fingerprint |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]
 **secret** | **String**| secret | [optional]

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
| **200** | Download the image tarball |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## getImagesFingerprint

> CompletableFuture<BackgroundOperationResponse> getImagesFingerprint(fingerprint, recursion, filter, secret)



Image description and metadata

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        String secret = "SECRET"; // String | secret
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.getImagesFingerprint(fingerprint, recursion, filter, secret);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#getImagesFingerprint");
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
 **fingerprint** | **String**| Unique fingerprint |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]
 **secret** | **String**| secret | [optional]

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
| **200** | Download the image tarball |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## getImagesFingerprintWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> getImagesFingerprint getImagesFingerprintWithHttpInfo(fingerprint, recursion, filter, secret)



Image description and metadata

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        String secret = "SECRET"; // String | secret
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.getImagesFingerprintWithHttpInfo(fingerprint, recursion, filter, secret);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ImagesApi#getImagesFingerprint");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#getImagesFingerprint");
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
 **fingerprint** | **String**| Unique fingerprint |
 **recursion** | **Integer**| To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). | [optional]
 **filter** | **String**| There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. | [optional]
 **secret** | **String**| secret | [optional]

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
| **200** | Download the image tarball |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## getImagesFingerprintRefresh

> CompletableFuture<BackgroundOperationResponse> getImagesFingerprintRefresh(fingerprint, recursion, filter)



Refresh an image from its origin

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.getImagesFingerprintRefresh(fingerprint, recursion, filter);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#getImagesFingerprintRefresh");
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
 **fingerprint** | **String**| Unique fingerprint |
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
| **202** | A basic background return value response |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## getImagesFingerprintRefreshWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> getImagesFingerprintRefresh getImagesFingerprintRefreshWithHttpInfo(fingerprint, recursion, filter)



Refresh an image from its origin

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.getImagesFingerprintRefreshWithHttpInfo(fingerprint, recursion, filter);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ImagesApi#getImagesFingerprintRefresh");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#getImagesFingerprintRefresh");
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
 **fingerprint** | **String**| Unique fingerprint |
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
| **202** | A basic background return value response |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## patchImagesAliasesByName

> CompletableFuture<BackgroundOperationResponse> patchImagesAliasesByName(name, body)



Updates the alias target or description

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String name = "name_example"; // String | Name of the alias
        UpdateImagesAliasesByNameRequest body = new UpdateImagesAliasesByNameRequest(); // UpdateImagesAliasesByNameRequest | Updates the alias target or description
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.patchImagesAliasesByName(name, body);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#patchImagesAliasesByName");
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
 **name** | **String**| Name of the alias |
 **body** | [**UpdateImagesAliasesByNameRequest**](UpdateImagesAliasesByNameRequest.md)| Updates the alias target or description | [optional]

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

## patchImagesAliasesByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> patchImagesAliasesByName patchImagesAliasesByNameWithHttpInfo(name, body)



Updates the alias target or description

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String name = "name_example"; // String | Name of the alias
        UpdateImagesAliasesByNameRequest body = new UpdateImagesAliasesByNameRequest(); // UpdateImagesAliasesByNameRequest | Updates the alias target or description
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.patchImagesAliasesByNameWithHttpInfo(name, body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ImagesApi#patchImagesAliasesByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#patchImagesAliasesByName");
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
 **name** | **String**| Name of the alias |
 **body** | [**UpdateImagesAliasesByNameRequest**](UpdateImagesAliasesByNameRequest.md)| Updates the alias target or description | [optional]

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


## patchImagesFingerprint

> CompletableFuture<BackgroundOperationResponse> patchImagesFingerprint(fingerprint, body)



Updates the image properties, update information and visibility

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        PatchImagesFingerprintRequest body = new PatchImagesFingerprintRequest(); // PatchImagesFingerprintRequest | Updates the image properties, update information and visibility
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.patchImagesFingerprint(fingerprint, body);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#patchImagesFingerprint");
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
 **fingerprint** | **String**| Unique fingerprint |
 **body** | [**PatchImagesFingerprintRequest**](PatchImagesFingerprintRequest.md)| Updates the image properties, update information and visibility | [optional]

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

## patchImagesFingerprintWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> patchImagesFingerprint patchImagesFingerprintWithHttpInfo(fingerprint, body)



Updates the image properties, update information and visibility

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        PatchImagesFingerprintRequest body = new PatchImagesFingerprintRequest(); // PatchImagesFingerprintRequest | Updates the image properties, update information and visibility
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.patchImagesFingerprintWithHttpInfo(fingerprint, body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ImagesApi#patchImagesFingerprint");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#patchImagesFingerprint");
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
 **fingerprint** | **String**| Unique fingerprint |
 **body** | [**PatchImagesFingerprintRequest**](PatchImagesFingerprintRequest.md)| Updates the image properties, update information and visibility | [optional]

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


## postImages

> CompletableFuture<BackgroundOperationResponse> postImages(xLXDFingerprint, xLXDFilename, xLXDPublic, xLXDProperties, body)



Create and publish a new image

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String xLXDFingerprint = "SHA-256"; // String | if set, uploaded file must match
        String xLXDFilename = "FILENAME"; // String | used for export
        Boolean xLXDPublic = true; // Boolean | defaults to false
        String xLXDProperties = "URL-encoded key value pairs without duplicate keys"; // String | 
        CreateImagesRequest body = new CreateImagesRequest(); // CreateImagesRequest | Create and publish a new image
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.postImages(xLXDFingerprint, xLXDFilename, xLXDPublic, xLXDProperties, body);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#postImages");
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
 **xLXDFingerprint** | **String**| if set, uploaded file must match | [optional]
 **xLXDFilename** | **String**| used for export | [optional]
 **xLXDPublic** | **Boolean**| defaults to false | [optional]
 **xLXDProperties** | **String**|  | [optional]
 **body** | [**CreateImagesRequest**](CreateImagesRequest.md)| Create and publish a new image | [optional]

### Return type

CompletableFuture<[**BackgroundOperationResponse**](BackgroundOperationResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, file
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | A basic background return value response |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## postImagesWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> postImages postImagesWithHttpInfo(xLXDFingerprint, xLXDFilename, xLXDPublic, xLXDProperties, body)



Create and publish a new image

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String xLXDFingerprint = "SHA-256"; // String | if set, uploaded file must match
        String xLXDFilename = "FILENAME"; // String | used for export
        Boolean xLXDPublic = true; // Boolean | defaults to false
        String xLXDProperties = "URL-encoded key value pairs without duplicate keys"; // String | 
        CreateImagesRequest body = new CreateImagesRequest(); // CreateImagesRequest | Create and publish a new image
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.postImagesWithHttpInfo(xLXDFingerprint, xLXDFilename, xLXDPublic, xLXDProperties, body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ImagesApi#postImages");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#postImages");
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
 **xLXDFingerprint** | **String**| if set, uploaded file must match | [optional]
 **xLXDFilename** | **String**| used for export | [optional]
 **xLXDPublic** | **Boolean**| defaults to false | [optional]
 **xLXDProperties** | **String**|  | [optional]
 **body** | [**CreateImagesRequest**](CreateImagesRequest.md)| Create and publish a new image | [optional]

### Return type

CompletableFuture<ApiResponse<[**BackgroundOperationResponse**](BackgroundOperationResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, file
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | A basic background return value response |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## postImagesAliases

> CompletableFuture<BackgroundOperationResponse> postImagesAliases(body)



Create a new alias

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        CreateImagesAliasesRequest body = new CreateImagesAliasesRequest(); // CreateImagesAliasesRequest | Create a new alias
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.postImagesAliases(body);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#postImagesAliases");
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
 **body** | [**CreateImagesAliasesRequest**](CreateImagesAliasesRequest.md)| Create a new alias | [optional]

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

## postImagesAliasesWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> postImagesAliases postImagesAliasesWithHttpInfo(body)



Create a new alias

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        CreateImagesAliasesRequest body = new CreateImagesAliasesRequest(); // CreateImagesAliasesRequest | Create a new alias
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.postImagesAliasesWithHttpInfo(body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ImagesApi#postImagesAliases");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#postImagesAliases");
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
 **body** | [**CreateImagesAliasesRequest**](CreateImagesAliasesRequest.md)| Create a new alias | [optional]

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


## postImagesAliasesByName

> CompletableFuture<BackgroundOperationResponse> postImagesAliasesByName(name, body)



Rename an alias

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String name = "name_example"; // String | Name of the alias
        CreateImagesAliasesByNameRequest body = new CreateImagesAliasesByNameRequest(); // CreateImagesAliasesByNameRequest | Rename an alias
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.postImagesAliasesByName(name, body);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#postImagesAliasesByName");
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
 **name** | **String**| Name of the alias |
 **body** | [**CreateImagesAliasesByNameRequest**](CreateImagesAliasesByNameRequest.md)| Rename an alias | [optional]

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
| **409** | A standard error response |  -  |

## postImagesAliasesByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> postImagesAliasesByName postImagesAliasesByNameWithHttpInfo(name, body)



Rename an alias

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String name = "name_example"; // String | Name of the alias
        CreateImagesAliasesByNameRequest body = new CreateImagesAliasesByNameRequest(); // CreateImagesAliasesByNameRequest | Rename an alias
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.postImagesAliasesByNameWithHttpInfo(name, body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ImagesApi#postImagesAliasesByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#postImagesAliasesByName");
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
 **name** | **String**| Name of the alias |
 **body** | [**CreateImagesAliasesByNameRequest**](CreateImagesAliasesByNameRequest.md)| Rename an alias | [optional]

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
| **409** | A standard error response |  -  |


## postImagesFingerprintExport

> CompletableFuture<BackgroundOperationResponse> postImagesFingerprintExport(fingerprint, body)



Upload the image tarball

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        CreateImagesFingerprintExportRequest body = new CreateImagesFingerprintExportRequest(); // CreateImagesFingerprintExportRequest | Upload the image tarball
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.postImagesFingerprintExport(fingerprint, body);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#postImagesFingerprintExport");
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
 **fingerprint** | **String**| Unique fingerprint |
 **body** | [**CreateImagesFingerprintExportRequest**](CreateImagesFingerprintExportRequest.md)| Upload the image tarball | [optional]

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

## postImagesFingerprintExportWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> postImagesFingerprintExport postImagesFingerprintExportWithHttpInfo(fingerprint, body)



Upload the image tarball

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        CreateImagesFingerprintExportRequest body = new CreateImagesFingerprintExportRequest(); // CreateImagesFingerprintExportRequest | Upload the image tarball
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.postImagesFingerprintExportWithHttpInfo(fingerprint, body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ImagesApi#postImagesFingerprintExport");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#postImagesFingerprintExport");
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
 **fingerprint** | **String**| Unique fingerprint |
 **body** | [**CreateImagesFingerprintExportRequest**](CreateImagesFingerprintExportRequest.md)| Upload the image tarball | [optional]

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


## postImagesFingerprintSecret

> CompletableFuture<BackgroundOperationResponse> postImagesFingerprintSecret(fingerprint, body)



Generate a random token and tell LXD to expect it be used by a guest

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        Object body = null; // Object | Generate a random token and tell LXD to expect it be used by a guest
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.postImagesFingerprintSecret(fingerprint, body);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#postImagesFingerprintSecret");
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
 **fingerprint** | **String**| Unique fingerprint |
 **body** | **Object**| Generate a random token and tell LXD to expect it be used by a guest | [optional]

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

## postImagesFingerprintSecretWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> postImagesFingerprintSecret postImagesFingerprintSecretWithHttpInfo(fingerprint, body)



Generate a random token and tell LXD to expect it be used by a guest

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        Object body = null; // Object | Generate a random token and tell LXD to expect it be used by a guest
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.postImagesFingerprintSecretWithHttpInfo(fingerprint, body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ImagesApi#postImagesFingerprintSecret");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#postImagesFingerprintSecret");
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
 **fingerprint** | **String**| Unique fingerprint |
 **body** | **Object**| Generate a random token and tell LXD to expect it be used by a guest | [optional]

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


## putImagesAliasesByName

> CompletableFuture<BackgroundOperationResponse> putImagesAliasesByName(name, body)



Replaces the alias target or description

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String name = "name_example"; // String | Name of the alias
        UpdateImagesAliasesByNameRequest body = new UpdateImagesAliasesByNameRequest(); // UpdateImagesAliasesByNameRequest | Replaces the alias target or description
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.putImagesAliasesByName(name, body);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#putImagesAliasesByName");
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
 **name** | **String**| Name of the alias |
 **body** | [**UpdateImagesAliasesByNameRequest**](UpdateImagesAliasesByNameRequest.md)| Replaces the alias target or description | [optional]

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

## putImagesAliasesByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> putImagesAliasesByName putImagesAliasesByNameWithHttpInfo(name, body)



Replaces the alias target or description

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String name = "name_example"; // String | Name of the alias
        UpdateImagesAliasesByNameRequest body = new UpdateImagesAliasesByNameRequest(); // UpdateImagesAliasesByNameRequest | Replaces the alias target or description
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.putImagesAliasesByNameWithHttpInfo(name, body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ImagesApi#putImagesAliasesByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#putImagesAliasesByName");
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
 **name** | **String**| Name of the alias |
 **body** | [**UpdateImagesAliasesByNameRequest**](UpdateImagesAliasesByNameRequest.md)| Replaces the alias target or description | [optional]

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


## putImagesFingerprint

> CompletableFuture<BackgroundOperationResponse> putImagesFingerprint(fingerprint, body)



Replaces the image properties, update information and visibility

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        UpdateImagesFingerprintRequest body = new UpdateImagesFingerprintRequest(); // UpdateImagesFingerprintRequest | Replaces the image properties, update information and visibility
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.putImagesFingerprint(fingerprint, body);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#putImagesFingerprint");
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
 **fingerprint** | **String**| Unique fingerprint |
 **body** | [**UpdateImagesFingerprintRequest**](UpdateImagesFingerprintRequest.md)| Replaces the image properties, update information and visibility | [optional]

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

## putImagesFingerprintWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> putImagesFingerprint putImagesFingerprintWithHttpInfo(fingerprint, body)



Replaces the image properties, update information and visibility

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ImagesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        UpdateImagesFingerprintRequest body = new UpdateImagesFingerprintRequest(); // UpdateImagesFingerprintRequest | Replaces the image properties, update information and visibility
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.putImagesFingerprintWithHttpInfo(fingerprint, body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ImagesApi#putImagesFingerprint");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#putImagesFingerprint");
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
 **fingerprint** | **String**| Unique fingerprint |
 **body** | [**UpdateImagesFingerprintRequest**](UpdateImagesFingerprintRequest.md)| Replaces the image properties, update information and visibility | [optional]

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

