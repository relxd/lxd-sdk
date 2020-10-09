# ImagesApi

All URIs are relative to *http://localhost:2375*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteImagesAliasesByName**](ImagesApi.md#deleteImagesAliasesByName) | **DELETE** /1.0/images/aliases/{name} | 
[**deleteImagesFingerprint**](ImagesApi.md#deleteImagesFingerprint) | **DELETE** /1.0/images/{fingerprint} | 
[**getImages**](ImagesApi.md#getImages) | **GET** /1.0/images | 
[**getImagesAliases**](ImagesApi.md#getImagesAliases) | **GET** /1.0/images/aliases | 
[**getImagesAliasesByName**](ImagesApi.md#getImagesAliasesByName) | **GET** /1.0/images/aliases/{name} | 
[**getImagesByFingerprintExport**](ImagesApi.md#getImagesByFingerprintExport) | **GET** /1.0/images/{fingerprint}/export | 
[**getImagesFingerprint**](ImagesApi.md#getImagesFingerprint) | **GET** /1.0/images/{fingerprint} | 
[**getImagesFingerprintRefresh**](ImagesApi.md#getImagesFingerprintRefresh) | **GET** /1.0/images/{fingerprint}/refresh | 
[**patchImagesAliasesByName**](ImagesApi.md#patchImagesAliasesByName) | **PATCH** /1.0/images/aliases/{name} | 
[**patchImagesFingerprint**](ImagesApi.md#patchImagesFingerprint) | **PATCH** /1.0/images/{fingerprint} | 
[**postImages**](ImagesApi.md#postImages) | **POST** /1.0/images | 
[**postImagesAliases**](ImagesApi.md#postImagesAliases) | **POST** /1.0/images/aliases | 
[**postImagesAliasesByName**](ImagesApi.md#postImagesAliasesByName) | **POST** /1.0/images/aliases/{name} | 
[**postImagesFingerprintExport**](ImagesApi.md#postImagesFingerprintExport) | **POST** /1.0/images/{fingerprint}/export | 
[**postImagesFingerprintSecret**](ImagesApi.md#postImagesFingerprintSecret) | **POST** /1.0/images/{fingerprint}/secret | 
[**putImagesAliasesByName**](ImagesApi.md#putImagesAliasesByName) | **PUT** /1.0/images/aliases/{name} | 
[**putImagesFingerprint**](ImagesApi.md#putImagesFingerprint) | **PUT** /1.0/images/{fingerprint} | 


<a name="deleteImagesAliasesByName"></a>
# **deleteImagesAliasesByName**
> StandardServerResponse deleteImagesAliasesByName(name)



Remove an alias

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String name = "name_example"; // String | Name of the alias
    try {
      StandardServerResponse result = apiInstance.deleteImagesAliasesByName(name);
      System.out.println(result);
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

<a name="deleteImagesFingerprint"></a>
# **deleteImagesFingerprint**
> BasicBackgroundOperationResponse deleteImagesFingerprint(fingerprint)



Remove an image

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String fingerprint = "fingerprint_example"; // String | Unique fingerprint
    try {
      BasicBackgroundOperationResponse result = apiInstance.deleteImagesFingerprint(fingerprint);
      System.out.println(result);
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

<a name="getImages"></a>
# **getImages**
> StandardServerResponse getImages(recursion, filter)



List of images (public or private)

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      StandardServerResponse result = apiInstance.getImages(recursion, filter);
      System.out.println(result);
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

[**StandardServerResponse**](StandardServerResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of images (public or private) |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getImagesAliases"></a>
# **getImagesAliases**
> StandardServerResponse getImagesAliases(recursion, filter)



List of aliases (public or private based on image visibility)

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      StandardServerResponse result = apiInstance.getImagesAliases(recursion, filter);
      System.out.println(result);
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

[**StandardServerResponse**](StandardServerResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of aliases (public or private based on image visibility) |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getImagesAliasesByName"></a>
# **getImagesAliasesByName**
> GetImagesAliasesByNameResponse getImagesAliasesByName(name, recursion, filter)



Alias description and target

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String name = "name_example"; // String | Name of the alias
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      GetImagesAliasesByNameResponse result = apiInstance.getImagesAliasesByName(name, recursion, filter);
      System.out.println(result);
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

[**GetImagesAliasesByNameResponse**](GetImagesAliasesByNameResponse.md)

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

<a name="getImagesByFingerprintExport"></a>
# **getImagesByFingerprintExport**
> GetImagesFingerprintResponse getImagesByFingerprintExport(fingerprint, recursion, filter, secret)



Download the image tarball

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String fingerprint = "fingerprint_example"; // String | Unique fingerprint
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    String secret = SECRET; // String | secret
    try {
      GetImagesFingerprintResponse result = apiInstance.getImagesByFingerprintExport(fingerprint, recursion, filter, secret);
      System.out.println(result);
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

[**GetImagesFingerprintResponse**](GetImagesFingerprintResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Download the image tarball |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getImagesFingerprint"></a>
# **getImagesFingerprint**
> StandardServerResponse getImagesFingerprint(fingerprint, recursion, filter, secret)



Image description and metadata

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String fingerprint = "fingerprint_example"; // String | Unique fingerprint
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    String secret = SECRET; // String | secret
    try {
      StandardServerResponse result = apiInstance.getImagesFingerprint(fingerprint, recursion, filter, secret);
      System.out.println(result);
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

[**StandardServerResponse**](StandardServerResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Download the image tarball |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getImagesFingerprintRefresh"></a>
# **getImagesFingerprintRefresh**
> BasicBackgroundOperationResponse getImagesFingerprintRefresh(fingerprint, recursion, filter)



Refresh an image from its origin

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String fingerprint = "fingerprint_example"; // String | Unique fingerprint
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      BasicBackgroundOperationResponse result = apiInstance.getImagesFingerprintRefresh(fingerprint, recursion, filter);
      System.out.println(result);
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

<a name="patchImagesAliasesByName"></a>
# **patchImagesAliasesByName**
> StandardServerResponse patchImagesAliasesByName(name, body)



Updates the alias target or description

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String name = "name_example"; // String | Name of the alias
    UpdateImagesAliasesByNameRequest body = new UpdateImagesAliasesByNameRequest(); // UpdateImagesAliasesByNameRequest | Updates the alias target or description
    try {
      StandardServerResponse result = apiInstance.patchImagesAliasesByName(name, body);
      System.out.println(result);
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

<a name="patchImagesFingerprint"></a>
# **patchImagesFingerprint**
> StandardServerResponse patchImagesFingerprint(fingerprint, body)



Updates the image properties, update information and visibility

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String fingerprint = "fingerprint_example"; // String | Unique fingerprint
    PatchImagesFingerprintRequest body = new PatchImagesFingerprintRequest(); // PatchImagesFingerprintRequest | Updates the image properties, update information and visibility
    try {
      StandardServerResponse result = apiInstance.patchImagesFingerprint(fingerprint, body);
      System.out.println(result);
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

<a name="postImages"></a>
# **postImages**
> BasicBackgroundOperationResponse postImages(xLXDFingerprint, xLXDFilename, xLXDPublic, xLXDProperties, body)



Create and publish a new image

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String xLXDFingerprint = SHA-256; // String | if set, uploaded file must match
    String xLXDFilename = FILENAME; // String | used for export
    Boolean xLXDPublic = true; // Boolean | defaults to false
    String xLXDProperties = URL-encoded key value pairs without duplicate keys; // String | 
    CreateImagesRequest body = new CreateImagesRequest(); // CreateImagesRequest | Create and publish a new image
    try {
      BasicBackgroundOperationResponse result = apiInstance.postImages(xLXDFingerprint, xLXDFilename, xLXDPublic, xLXDProperties, body);
      System.out.println(result);
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

<a name="postImagesAliases"></a>
# **postImagesAliases**
> StandardServerResponse postImagesAliases(body)



Create a new alias

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    CreateImagesAliasesRequest body = new CreateImagesAliasesRequest(); // CreateImagesAliasesRequest | Create a new alias
    try {
      StandardServerResponse result = apiInstance.postImagesAliases(body);
      System.out.println(result);
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

<a name="postImagesAliasesByName"></a>
# **postImagesAliasesByName**
> StandardServerResponse postImagesAliasesByName(name, body)



Rename an alias

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String name = "name_example"; // String | Name of the alias
    CreateImagesAliasesByNameRequest body = new CreateImagesAliasesByNameRequest(); // CreateImagesAliasesByNameRequest | Rename an alias
    try {
      StandardServerResponse result = apiInstance.postImagesAliasesByName(name, body);
      System.out.println(result);
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
**409** | A standard error response |  -  |

<a name="postImagesFingerprintExport"></a>
# **postImagesFingerprintExport**
> BasicBackgroundOperationResponse postImagesFingerprintExport(fingerprint, body)



Upload the image tarball

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String fingerprint = "fingerprint_example"; // String | Unique fingerprint
    CreateImagesFingerprintExportRequest body = new CreateImagesFingerprintExportRequest(); // CreateImagesFingerprintExportRequest | Upload the image tarball
    try {
      BasicBackgroundOperationResponse result = apiInstance.postImagesFingerprintExport(fingerprint, body);
      System.out.println(result);
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

<a name="postImagesFingerprintSecret"></a>
# **postImagesFingerprintSecret**
> CreateImagesFingerprintSecretResponse postImagesFingerprintSecret(fingerprint, body)



Generate a random token and tell LXD to expect it be used by a guest

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String fingerprint = "fingerprint_example"; // String | Unique fingerprint
    Object body = null; // Object | Generate a random token and tell LXD to expect it be used by a guest
    try {
      CreateImagesFingerprintSecretResponse result = apiInstance.postImagesFingerprintSecret(fingerprint, body);
      System.out.println(result);
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

[**CreateImagesFingerprintSecretResponse**](CreateImagesFingerprintSecretResponse.md)

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

<a name="putImagesAliasesByName"></a>
# **putImagesAliasesByName**
> StandardServerResponse putImagesAliasesByName(name, body)



Replaces the alias target or description

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String name = "name_example"; // String | Name of the alias
    UpdateImagesAliasesByNameRequest body = new UpdateImagesAliasesByNameRequest(); // UpdateImagesAliasesByNameRequest | Replaces the alias target or description
    try {
      StandardServerResponse result = apiInstance.putImagesAliasesByName(name, body);
      System.out.println(result);
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

<a name="putImagesFingerprint"></a>
# **putImagesFingerprint**
> StandardServerResponse putImagesFingerprint(fingerprint, body)



Replaces the image properties, update information and visibility

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String fingerprint = "fingerprint_example"; // String | Unique fingerprint
    UpdateImagesFingerprintRequest body = new UpdateImagesFingerprintRequest(); // UpdateImagesFingerprintRequest | Replaces the image properties, update information and visibility
    try {
      StandardServerResponse result = apiInstance.putImagesFingerprint(fingerprint, body);
      System.out.println(result);
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

