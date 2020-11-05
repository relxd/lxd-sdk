# ServerConfigApi

All URIs are relative to *http://localhost:2375*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getServerState**](ServerConfigApi.md#getServerState) | **GET** /1.0 | 
[**patchServerState**](ServerConfigApi.md#patchServerState) | **PATCH** /1.0 | 
[**putServerState**](ServerConfigApi.md#putServerState) | **PUT** /1.0 | 


<a name="getServerState"></a>
# **getServerState**
> BackgroundOperationResponse getServerState(recursion, filter)



Server configuration and environment information

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ServerConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");

    ServerConfigApi apiInstance = new ServerConfigApi(defaultClient);
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      BackgroundOperationResponse result = apiInstance.getServerState(recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerConfigApi#getServerState");
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
**200** | Server configuration and environment information |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="patchServerState"></a>
# **patchServerState**
> BackgroundOperationResponse patchServerState(body)



Updates the server configuration or other properties

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ServerConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");

    ServerConfigApi apiInstance = new ServerConfigApi(defaultClient);
    ServerConfig body = new ServerConfig(); // ServerConfig | Updates only the listed keys, rest remains intact
    try {
      BackgroundOperationResponse result = apiInstance.patchServerState(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerConfigApi#patchServerState");
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
 **body** | **ServerConfig**| Updates only the listed keys, rest remains intact | [optional]

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

<a name="putServerState"></a>
# **putServerState**
> BackgroundOperationResponse putServerState(body)



Replaces the server configuration or other properties

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ServerConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");

    ServerConfigApi apiInstance = new ServerConfigApi(defaultClient);
    ServerConfig body = new ServerConfig(); // ServerConfig | Replaces any existing config with the provided one
    try {
      BackgroundOperationResponse result = apiInstance.putServerState(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerConfigApi#putServerState");
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
 **body** | **ServerConfig**| Replaces any existing config with the provided one | [optional]

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

