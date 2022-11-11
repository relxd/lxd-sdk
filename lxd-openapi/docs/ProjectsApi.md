# ProjectsApi

All URIs are relative to *http://localhost:2375*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteProjectsByName**](ProjectsApi.md#deleteProjectsByName) | **DELETE** /1.0/projects/{name} |  |
| [**deleteProjectsByNameWithHttpInfo**](ProjectsApi.md#deleteProjectsByNameWithHttpInfo) | **DELETE** /1.0/projects/{name} |  |
| [**getProjects**](ProjectsApi.md#getProjects) | **GET** /1.0/projects |  |
| [**getProjectsWithHttpInfo**](ProjectsApi.md#getProjectsWithHttpInfo) | **GET** /1.0/projects |  |
| [**getProjectsByName**](ProjectsApi.md#getProjectsByName) | **GET** /1.0/projects/{name} |  |
| [**getProjectsByNameWithHttpInfo**](ProjectsApi.md#getProjectsByNameWithHttpInfo) | **GET** /1.0/projects/{name} |  |
| [**patchProjectsByName**](ProjectsApi.md#patchProjectsByName) | **PATCH** /1.0/projects/{name} |  |
| [**patchProjectsByNameWithHttpInfo**](ProjectsApi.md#patchProjectsByNameWithHttpInfo) | **PATCH** /1.0/projects/{name} |  |
| [**postProjects**](ProjectsApi.md#postProjects) | **POST** /1.0/projects |  |
| [**postProjectsWithHttpInfo**](ProjectsApi.md#postProjectsWithHttpInfo) | **POST** /1.0/projects |  |
| [**postProjectsByName**](ProjectsApi.md#postProjectsByName) | **POST** /1.0/projects/{name} |  |
| [**postProjectsByNameWithHttpInfo**](ProjectsApi.md#postProjectsByNameWithHttpInfo) | **POST** /1.0/projects/{name} |  |
| [**putProjectsByName**](ProjectsApi.md#putProjectsByName) | **PUT** /1.0/projects/{name} |  |
| [**putProjectsByNameWithHttpInfo**](ProjectsApi.md#putProjectsByNameWithHttpInfo) | **PUT** /1.0/projects/{name} |  |



## deleteProjectsByName

> CompletableFuture<BackgroundOperationResponse> deleteProjectsByName(name)



Remove a project

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProjectsApi apiInstance = new ProjectsApi(defaultClient);
        String name = "name_example"; // String | Projects name
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.deleteProjectsByName(name);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#deleteProjectsByName");
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
| **name** | **String**| Projects name | |

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
| **403** | A standard error response |  -  |

## deleteProjectsByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> deleteProjectsByName deleteProjectsByNameWithHttpInfo(name)



Remove a project

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProjectsApi apiInstance = new ProjectsApi(defaultClient);
        String name = "name_example"; // String | Projects name
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.deleteProjectsByNameWithHttpInfo(name);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ProjectsApi#deleteProjectsByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#deleteProjectsByName");
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
| **name** | **String**| Projects name | |

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
| **403** | A standard error response |  -  |


## getProjects

> CompletableFuture<BackgroundOperationResponse> getProjects(recursion, filter)



List of projects

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProjectsApi apiInstance = new ProjectsApi(defaultClient);
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.getProjects(recursion, filter);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#getProjects");
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
| **200** | List of projects |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## getProjectsWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> getProjects getProjectsWithHttpInfo(recursion, filter)



List of projects

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProjectsApi apiInstance = new ProjectsApi(defaultClient);
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.getProjectsWithHttpInfo(recursion, filter);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ProjectsApi#getProjects");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#getProjects");
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
| **200** | List of projects |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## getProjectsByName

> CompletableFuture<BackgroundOperationResponse> getProjectsByName(name, recursion, filter)



Project configuration

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProjectsApi apiInstance = new ProjectsApi(defaultClient);
        String name = "name_example"; // String | Projects name
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.getProjectsByName(name, recursion, filter);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#getProjectsByName");
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
| **name** | **String**| Projects name | |
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
| **200** | Project configuration |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## getProjectsByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> getProjectsByName getProjectsByNameWithHttpInfo(name, recursion, filter)



Project configuration

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProjectsApi apiInstance = new ProjectsApi(defaultClient);
        String name = "name_example"; // String | Projects name
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.getProjectsByNameWithHttpInfo(name, recursion, filter);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ProjectsApi#getProjectsByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#getProjectsByName");
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
| **name** | **String**| Projects name | |
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
| **200** | Project configuration |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## patchProjectsByName

> CompletableFuture<BackgroundOperationResponse> patchProjectsByName(name, body)



Update the project information

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProjectsApi apiInstance = new ProjectsApi(defaultClient);
        String name = "name_example"; // String | Projects name
        UpdateProjectsByNameRequest body = new UpdateProjectsByNameRequest(); // UpdateProjectsByNameRequest | Update the project information
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.patchProjectsByName(name, body);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#patchProjectsByName");
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
| **name** | **String**| Projects name | |
| **body** | [**UpdateProjectsByNameRequest**](UpdateProjectsByNameRequest.md)| Update the project information | [optional] |

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

## patchProjectsByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> patchProjectsByName patchProjectsByNameWithHttpInfo(name, body)



Update the project information

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProjectsApi apiInstance = new ProjectsApi(defaultClient);
        String name = "name_example"; // String | Projects name
        UpdateProjectsByNameRequest body = new UpdateProjectsByNameRequest(); // UpdateProjectsByNameRequest | Update the project information
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.patchProjectsByNameWithHttpInfo(name, body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ProjectsApi#patchProjectsByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#patchProjectsByName");
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
| **name** | **String**| Projects name | |
| **body** | [**UpdateProjectsByNameRequest**](UpdateProjectsByNameRequest.md)| Update the project information | [optional] |

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


## postProjects

> CompletableFuture<BackgroundOperationResponse> postProjects(body)



Define a new project

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProjectsApi apiInstance = new ProjectsApi(defaultClient);
        CreateProjectsRequest body = new CreateProjectsRequest(); // CreateProjectsRequest | Define a new project
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.postProjects(body);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#postProjects");
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
| **body** | [**CreateProjectsRequest**](CreateProjectsRequest.md)| Define a new project | [optional] |

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

## postProjectsWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> postProjects postProjectsWithHttpInfo(body)



Define a new project

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProjectsApi apiInstance = new ProjectsApi(defaultClient);
        CreateProjectsRequest body = new CreateProjectsRequest(); // CreateProjectsRequest | Define a new project
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.postProjectsWithHttpInfo(body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ProjectsApi#postProjects");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#postProjects");
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
| **body** | [**CreateProjectsRequest**](CreateProjectsRequest.md)| Define a new project | [optional] |

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


## postProjectsByName

> CompletableFuture<BackgroundOperationResponse> postProjectsByName(name, body)



Rename a project

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProjectsApi apiInstance = new ProjectsApi(defaultClient);
        String name = "name_example"; // String | Projects name
        CreateProjectsByNameRequest body = new CreateProjectsByNameRequest(); // CreateProjectsByNameRequest | Rename a project
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.postProjectsByName(name, body);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#postProjectsByName");
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
| **name** | **String**| Projects name | |
| **body** | [**CreateProjectsByNameRequest**](CreateProjectsByNameRequest.md)| Rename a project | [optional] |

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
| **403** | A standard error response |  -  |
| **409** | A standard error response |  -  |

## postProjectsByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> postProjectsByName postProjectsByNameWithHttpInfo(name, body)



Rename a project

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProjectsApi apiInstance = new ProjectsApi(defaultClient);
        String name = "name_example"; // String | Projects name
        CreateProjectsByNameRequest body = new CreateProjectsByNameRequest(); // CreateProjectsByNameRequest | Rename a project
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.postProjectsByNameWithHttpInfo(name, body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ProjectsApi#postProjectsByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#postProjectsByName");
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
| **name** | **String**| Projects name | |
| **body** | [**CreateProjectsByNameRequest**](CreateProjectsByNameRequest.md)| Rename a project | [optional] |

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
| **403** | A standard error response |  -  |
| **409** | A standard error response |  -  |


## putProjectsByName

> CompletableFuture<BackgroundOperationResponse> putProjectsByName(name, body)



Replace the project information

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProjectsApi apiInstance = new ProjectsApi(defaultClient);
        String name = "name_example"; // String | Projects name
        UpdateProjectsByNameRequest body = new UpdateProjectsByNameRequest(); // UpdateProjectsByNameRequest | Replace the project information
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.putProjectsByName(name, body);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#putProjectsByName");
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
| **name** | **String**| Projects name | |
| **body** | [**UpdateProjectsByNameRequest**](UpdateProjectsByNameRequest.md)| Replace the project information | [optional] |

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

## putProjectsByNameWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> putProjectsByName putProjectsByNameWithHttpInfo(name, body)



Replace the project information

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProjectsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        ProjectsApi apiInstance = new ProjectsApi(defaultClient);
        String name = "name_example"; // String | Projects name
        UpdateProjectsByNameRequest body = new UpdateProjectsByNameRequest(); // UpdateProjectsByNameRequest | Replace the project information
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.putProjectsByNameWithHttpInfo(name, body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ProjectsApi#putProjectsByName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#putProjectsByName");
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
| **name** | **String**| Projects name | |
| **body** | [**UpdateProjectsByNameRequest**](UpdateProjectsByNameRequest.md)| Replace the project information | [optional] |

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

