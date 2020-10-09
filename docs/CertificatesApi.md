# CertificatesApi

All URIs are relative to *http://localhost:2375*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteFingerprint**](CertificatesApi.md#deleteFingerprint) | **DELETE** /1.0/certificates/{fingerprint} | 
[**getCertificates**](CertificatesApi.md#getCertificates) | **GET** /1.0/certificates | 
[**getCertificatesByFingerPrint**](CertificatesApi.md#getCertificatesByFingerPrint) | **GET** /1.0/certificates/{fingerprint} | 
[**patchFingerprint**](CertificatesApi.md#patchFingerprint) | **PATCH** /1.0/certificates/{fingerprint} | 
[**postCertificates**](CertificatesApi.md#postCertificates) | **POST** /1.0/certificates | 
[**putFingerprint**](CertificatesApi.md#putFingerprint) | **PUT** /1.0/certificates/{fingerprint} | 


<a name="deleteFingerprint"></a>
# **deleteFingerprint**
> StandardServerResponse deleteFingerprint(fingerprint)



Remove a trusted certificate

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.CertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    CertificatesApi apiInstance = new CertificatesApi(defaultClient);
    String fingerprint = "fingerprint_example"; // String | Unique fingerprint
    try {
      StandardServerResponse result = apiInstance.deleteFingerprint(fingerprint);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatesApi#deleteFingerprint");
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

[**StandardServerResponse**](StandardServerResponse.md)

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

<a name="getCertificates"></a>
# **getCertificates**
> StandardServerResponse getCertificates(recursion, filter)



Return a list of trusted certificates

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.CertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    CertificatesApi apiInstance = new CertificatesApi(defaultClient);
    Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
    String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
    try {
      StandardServerResponse result = apiInstance.getCertificates(recursion, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatesApi#getCertificates");
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
**200** | List of trusted certificates |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="getCertificatesByFingerPrint"></a>
# **getCertificatesByFingerPrint**
> StandardServerResponse getCertificatesByFingerPrint(fingerprint)



Return a trusted certificate information

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.CertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    CertificatesApi apiInstance = new CertificatesApi(defaultClient);
    String fingerprint = "fingerprint_example"; // String | Unique fingerprint
    try {
      StandardServerResponse result = apiInstance.getCertificatesByFingerPrint(fingerprint);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatesApi#getCertificatesByFingerPrint");
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

[**StandardServerResponse**](StandardServerResponse.md)

### Authorization

[authentication](../README.md#authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Trusted certificate information |  -  |
**400** | A standard error response |  -  |
**401** | A standard error response |  -  |

<a name="patchFingerprint"></a>
# **patchFingerprint**
> StandardServerResponse patchFingerprint(fingerprint, body)



Updates the certificate properties

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.CertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    CertificatesApi apiInstance = new CertificatesApi(defaultClient);
    String fingerprint = "fingerprint_example"; // String | Unique fingerprint
    UpdateFingerprintRequest body = new UpdateFingerprintRequest(); // UpdateFingerprintRequest | Updates the certificate properties
    try {
      StandardServerResponse result = apiInstance.patchFingerprint(fingerprint, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatesApi#patchFingerprint");
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
 **body** | [**UpdateFingerprintRequest**](UpdateFingerprintRequest.md)| Updates the certificate properties | [optional]

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

<a name="postCertificates"></a>
# **postCertificates**
> StandardServerResponse postCertificates(body)



Add a new trusted certificate

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.CertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    CertificatesApi apiInstance = new CertificatesApi(defaultClient);
    CreateCertificatesRequest body = new CreateCertificatesRequest(); // CreateCertificatesRequest | Add a new trusted certificate
    try {
      StandardServerResponse result = apiInstance.postCertificates(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatesApi#postCertificates");
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
 **body** | [**CreateCertificatesRequest**](CreateCertificatesRequest.md)| Add a new trusted certificate | [optional]

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

<a name="putFingerprint"></a>
# **putFingerprint**
> StandardServerResponse putFingerprint(fingerprint, body)



Replaces the certificate properties

### Example
```java
// Import classes:
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.auth.*;
import org.relxd.lxd.models.*;
import org.relxd.lxd.api.CertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2375");
    
    // Configure OAuth2 access token for authorization: authentication
    OAuth authentication = (OAuth) defaultClient.getAuthentication("authentication");
    authentication.setAccessToken("YOUR ACCESS TOKEN");

    CertificatesApi apiInstance = new CertificatesApi(defaultClient);
    String fingerprint = "fingerprint_example"; // String | Unique fingerprint
    UpdateFingerprintRequest body = new UpdateFingerprintRequest(); // UpdateFingerprintRequest | Replaces the certificate properties
    try {
      StandardServerResponse result = apiInstance.putFingerprint(fingerprint, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatesApi#putFingerprint");
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
 **body** | [**UpdateFingerprintRequest**](UpdateFingerprintRequest.md)| Replaces the certificate properties | [optional]

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

