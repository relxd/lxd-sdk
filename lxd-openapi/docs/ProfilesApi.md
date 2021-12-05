# ProfilesApi

All URIs are relative to *http://localhost:2375*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProfilesByName**](ProfilesApi.md#deleteProfilesByName) | **DELETE** /1.0/profiles/{name} | 
[**deleteProfilesByNameWithHttpInfo**](ProfilesApi.md#deleteProfilesByNameWithHttpInfo) | **DELETE** /1.0/profiles/{name} | 
[**getProfiles**](ProfilesApi.md#getProfiles) | **GET** /1.0/profiles | 
[**getProfilesWithHttpInfo**](ProfilesApi.md#getProfilesWithHttpInfo) | **GET** /1.0/profiles | 
[**getProfilesByName**](ProfilesApi.md#getProfilesByName) | **GET** /1.0/profiles/{name} | 
[**getProfilesByNameWithHttpInfo**](ProfilesApi.md#getProfilesByNameWithHttpInfo) | **GET** /1.0/profiles/{name} | 
[**patchProfilesByName**](ProfilesApi.md#patchProfilesByName) | **PATCH** /1.0/profiles/{name} | 
[**patchProfilesByNameWithHttpInfo**](ProfilesApi.md#patchProfilesByNameWithHttpInfo) | **PATCH** /1.0/profiles/{name} | 
[**postProfiles**](ProfilesApi.md#postProfiles) | **POST** /1.0/profiles | 
[**postProfilesWithHttpInfo**](ProfilesApi.md#postProfilesWithHttpInfo) | **POST** /1.0/profiles | 
[**postProfilesByName**](ProfilesApi.md#postProfilesByName) | **POST** /1.0/profiles/{name} | 
[**postProfilesByNameWithHttpInfo**](ProfilesApi.md#postProfilesByNameWithHttpInfo) | **POST** /1.0/profiles/{name} | 
[**putProfilesByName**](ProfilesApi.md#putProfilesByName) | **PUT** /1.0/profiles/{name} | 
[**putProfilesByNameWithHttpInfo**](ProfilesApi.md#putProfilesByNameWithHttpInfo) | **PUT** /1.0/profiles/{name} | 



## deleteProfilesByName

> CompletableFuture<BackgroundOperationResponse> deleteProfilesByName(name)



Remove a profile

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        String name = "name_example"; // String | Profiles name
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.deleteProfilesByName(name);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#deleteProfilesByName");
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
 **name** | **String**| Profiles name |

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

## deleteProfilesByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> deleteProfilesByName deleteProfilesByNameWithHttpInfo(name)



Remove a profile

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        String name = "name_example"; // String | Profiles name
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.deleteProfilesByNameWithHttpInfo(name);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ProfilesApi#deleteProfilesByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#deleteProfilesByName");
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
 **name** | **String**| Profiles name |

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


## getProfiles

> CompletableFuture<BackgroundOperationResponse> getProfiles(recursion, filter)



List of configuration profiles

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.getProfiles(recursion, filter);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#getProfiles");
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
| **200** | List of configuration profiles |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## getProfilesWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> getProfiles getProfilesWithHttpInfo(recursion, filter)



List of configuration profiles

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.getProfilesWithHttpInfo(recursion, filter);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ProfilesApi#getProfiles");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#getProfiles");
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
| **200** | List of configuration profiles |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## getProfilesByName

> CompletableFuture<BackgroundOperationResponse> getProfilesByName(name, recursion, filter)



Profile configuration

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        String name = "name_example"; // String | Profiles name
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.getProfilesByName(name, recursion, filter);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#getProfilesByName");
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
 **name** | **String**| Profiles name |
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
| **200** | Profile configuration |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## getProfilesByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> getProfilesByName getProfilesByNameWithHttpInfo(name, recursion, filter)



Profile configuration

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        String name = "name_example"; // String | Profiles name
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.getProfilesByNameWithHttpInfo(name, recursion, filter);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ProfilesApi#getProfilesByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#getProfilesByName");
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
 **name** | **String**| Profiles name |
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
| **200** | Profile configuration |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## patchProfilesByName

> CompletableFuture<BackgroundOperationResponse> patchProfilesByName(name, body)



Update the profile information

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        String name = "name_example"; // String | Profiles name
        UpdateProfilesByNameRequest body = new UpdateProfilesByNameRequest(); // UpdateProfilesByNameRequest | Update the profile information
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.patchProfilesByName(name, body);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#patchProfilesByName");
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
 **name** | **String**| Profiles name |
 **body** | [**UpdateProfilesByNameRequest**](UpdateProfilesByNameRequest.md)| Update the profile information | [optional]

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

## patchProfilesByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> patchProfilesByName patchProfilesByNameWithHttpInfo(name, body)



Update the profile information

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        String name = "name_example"; // String | Profiles name
        UpdateProfilesByNameRequest body = new UpdateProfilesByNameRequest(); // UpdateProfilesByNameRequest | Update the profile information
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.patchProfilesByNameWithHttpInfo(name, body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ProfilesApi#patchProfilesByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#patchProfilesByName");
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
 **name** | **String**| Profiles name |
 **body** | [**UpdateProfilesByNameRequest**](UpdateProfilesByNameRequest.md)| Update the profile information | [optional]

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


## postProfiles

> CompletableFuture<BackgroundOperationResponse> postProfiles(body)



Define a new profile

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        CreateProfilesRequest body = new CreateProfilesRequest(); // CreateProfilesRequest | Define a new profile
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.postProfiles(body);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#postProfiles");
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
 **body** | [**CreateProfilesRequest**](CreateProfilesRequest.md)| Define a new profile | [optional]

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

## postProfilesWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> postProfiles postProfilesWithHttpInfo(body)



Define a new profile

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        CreateProfilesRequest body = new CreateProfilesRequest(); // CreateProfilesRequest | Define a new profile
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.postProfilesWithHttpInfo(body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ProfilesApi#postProfiles");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#postProfiles");
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
 **body** | [**CreateProfilesRequest**](CreateProfilesRequest.md)| Define a new profile | [optional]

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


## postProfilesByName

> CompletableFuture<BackgroundOperationResponse> postProfilesByName(name, body)



Rename a profile

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        String name = "name_example"; // String | Profiles name
        CreateProfilesByNameRequest body = new CreateProfilesByNameRequest(); // CreateProfilesByNameRequest | Rename a profile
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.postProfilesByName(name, body);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#postProfilesByName");
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
 **name** | **String**| Profiles name |
 **body** | [**CreateProfilesByNameRequest**](CreateProfilesByNameRequest.md)| Rename a profile | [optional]

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
| **204** | A standard return value response |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |
| **409** | A standard error response |  -  |

## postProfilesByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> postProfilesByName postProfilesByNameWithHttpInfo(name, body)



Rename a profile

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        String name = "name_example"; // String | Profiles name
        CreateProfilesByNameRequest body = new CreateProfilesByNameRequest(); // CreateProfilesByNameRequest | Rename a profile
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.postProfilesByNameWithHttpInfo(name, body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ProfilesApi#postProfilesByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#postProfilesByName");
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
 **name** | **String**| Profiles name |
 **body** | [**CreateProfilesByNameRequest**](CreateProfilesByNameRequest.md)| Rename a profile | [optional]

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
| **204** | A standard return value response |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |
| **409** | A standard error response |  -  |


## putProfilesByName

> CompletableFuture<BackgroundOperationResponse> putProfilesByName(name, body)



Replace the profile information

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        String name = "name_example"; // String | Profiles name
        UpdateProfilesByNameRequest body = new UpdateProfilesByNameRequest(); // UpdateProfilesByNameRequest | Replace the profile information
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.putProfilesByName(name, body);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#putProfilesByName");
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
 **name** | **String**| Profiles name |
 **body** | [**UpdateProfilesByNameRequest**](UpdateProfilesByNameRequest.md)| Replace the profile information | [optional]

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

## putProfilesByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> putProfilesByName putProfilesByNameWithHttpInfo(name, body)



Replace the profile information

### Example

```java
// Import classes:
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.ApiResponse;
import org.relxd.lxd.client.Configuration;
import org.relxd.lxd.client.models.*;
import org.relxd.lxd.client.api.ProfilesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        String name = "name_example"; // String | Profiles name
        UpdateProfilesByNameRequest body = new UpdateProfilesByNameRequest(); // UpdateProfilesByNameRequest | Replace the profile information
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.putProfilesByNameWithHttpInfo(name, body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ProfilesApi#putProfilesByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#putProfilesByName");
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
 **name** | **String**| Profiles name |
 **body** | [**UpdateProfilesByNameRequest**](UpdateProfilesByNameRequest.md)| Replace the profile information | [optional]

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

