# CertificatesApi

All URIs are relative to *http://localhost:2375*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteFingerprint**](CertificatesApi.md#deleteFingerprint) | **DELETE** /1.0/certificates/{fingerprint} |  |
| [**deleteFingerprintWithHttpInfo**](CertificatesApi.md#deleteFingerprintWithHttpInfo) | **DELETE** /1.0/certificates/{fingerprint} |  |
| [**getCertificates**](CertificatesApi.md#getCertificates) | **GET** /1.0/certificates |  |
| [**getCertificatesWithHttpInfo**](CertificatesApi.md#getCertificatesWithHttpInfo) | **GET** /1.0/certificates |  |
| [**getCertificatesByFingerPrint**](CertificatesApi.md#getCertificatesByFingerPrint) | **GET** /1.0/certificates/{fingerprint} |  |
| [**getCertificatesByFingerPrintWithHttpInfo**](CertificatesApi.md#getCertificatesByFingerPrintWithHttpInfo) | **GET** /1.0/certificates/{fingerprint} |  |
| [**patchFingerprint**](CertificatesApi.md#patchFingerprint) | **PATCH** /1.0/certificates/{fingerprint} |  |
| [**patchFingerprintWithHttpInfo**](CertificatesApi.md#patchFingerprintWithHttpInfo) | **PATCH** /1.0/certificates/{fingerprint} |  |
| [**postCertificates**](CertificatesApi.md#postCertificates) | **POST** /1.0/certificates |  |
| [**postCertificatesWithHttpInfo**](CertificatesApi.md#postCertificatesWithHttpInfo) | **POST** /1.0/certificates |  |
| [**putFingerprint**](CertificatesApi.md#putFingerprint) | **PUT** /1.0/certificates/{fingerprint} |  |
| [**putFingerprintWithHttpInfo**](CertificatesApi.md#putFingerprintWithHttpInfo) | **PUT** /1.0/certificates/{fingerprint} |  |



## deleteFingerprint

> CompletableFuture<BackgroundOperationResponse> deleteFingerprint(fingerprint)



Remove a trusted certificate

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CertificatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        CertificatesApi apiInstance = new CertificatesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.deleteFingerprint(fingerprint);
            System.out.println(result.get());
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fingerprint** | **String**| Unique fingerprint | |

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

## deleteFingerprintWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> deleteFingerprint deleteFingerprintWithHttpInfo(fingerprint)



Remove a trusted certificate

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CertificatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        CertificatesApi apiInstance = new CertificatesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.deleteFingerprintWithHttpInfo(fingerprint);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CertificatesApi#deleteFingerprint");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CertificatesApi#deleteFingerprint");
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
| **fingerprint** | **String**| Unique fingerprint | |

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


## getCertificates

> CompletableFuture<BackgroundOperationResponse> getCertificates(recursion, filter)



Return a list of trusted certificates

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CertificatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        CertificatesApi apiInstance = new CertificatesApi(defaultClient);
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.getCertificates(recursion, filter);
            System.out.println(result.get());
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
| **200** | List of trusted certificates |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## getCertificatesWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> getCertificates getCertificatesWithHttpInfo(recursion, filter)



Return a list of trusted certificates

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CertificatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        CertificatesApi apiInstance = new CertificatesApi(defaultClient);
        Integer recursion = 56; // Integer | To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict).
        String filter = "filter_example"; // String | There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported.
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.getCertificatesWithHttpInfo(recursion, filter);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CertificatesApi#getCertificates");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CertificatesApi#getCertificates");
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
| **200** | List of trusted certificates |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## getCertificatesByFingerPrint

> CompletableFuture<BackgroundOperationResponse> getCertificatesByFingerPrint(fingerprint)



Return a trusted certificate information

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CertificatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        CertificatesApi apiInstance = new CertificatesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.getCertificatesByFingerPrint(fingerprint);
            System.out.println(result.get());
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fingerprint** | **String**| Unique fingerprint | |

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
| **200** | Trusted certificate information |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |

## getCertificatesByFingerPrintWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> getCertificatesByFingerPrint getCertificatesByFingerPrintWithHttpInfo(fingerprint)



Return a trusted certificate information

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CertificatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        CertificatesApi apiInstance = new CertificatesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.getCertificatesByFingerPrintWithHttpInfo(fingerprint);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CertificatesApi#getCertificatesByFingerPrint");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CertificatesApi#getCertificatesByFingerPrint");
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
| **fingerprint** | **String**| Unique fingerprint | |

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
| **200** | Trusted certificate information |  -  |
| **400** | A standard error response |  -  |
| **401** | A standard error response |  -  |


## patchFingerprint

> CompletableFuture<BackgroundOperationResponse> patchFingerprint(fingerprint, body)



Updates the certificate properties

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CertificatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        CertificatesApi apiInstance = new CertificatesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        UpdateFingerprintRequest body = new UpdateFingerprintRequest(); // UpdateFingerprintRequest | Updates the certificate properties
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.patchFingerprint(fingerprint, body);
            System.out.println(result.get());
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fingerprint** | **String**| Unique fingerprint | |
| **body** | [**UpdateFingerprintRequest**](UpdateFingerprintRequest.md)| Updates the certificate properties | [optional] |

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

## patchFingerprintWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> patchFingerprint patchFingerprintWithHttpInfo(fingerprint, body)



Updates the certificate properties

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CertificatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        CertificatesApi apiInstance = new CertificatesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        UpdateFingerprintRequest body = new UpdateFingerprintRequest(); // UpdateFingerprintRequest | Updates the certificate properties
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.patchFingerprintWithHttpInfo(fingerprint, body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CertificatesApi#patchFingerprint");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CertificatesApi#patchFingerprint");
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
| **fingerprint** | **String**| Unique fingerprint | |
| **body** | [**UpdateFingerprintRequest**](UpdateFingerprintRequest.md)| Updates the certificate properties | [optional] |

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


## postCertificates

> CompletableFuture<BackgroundOperationResponse> postCertificates(body)



Add a new trusted certificate

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CertificatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        CertificatesApi apiInstance = new CertificatesApi(defaultClient);
        CreateCertificatesRequest body = new CreateCertificatesRequest(); // CreateCertificatesRequest | Add a new trusted certificate
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.postCertificates(body);
            System.out.println(result.get());
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**CreateCertificatesRequest**](CreateCertificatesRequest.md)| Add a new trusted certificate | [optional] |

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

## postCertificatesWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> postCertificates postCertificatesWithHttpInfo(body)



Add a new trusted certificate

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CertificatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        CertificatesApi apiInstance = new CertificatesApi(defaultClient);
        CreateCertificatesRequest body = new CreateCertificatesRequest(); // CreateCertificatesRequest | Add a new trusted certificate
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.postCertificatesWithHttpInfo(body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CertificatesApi#postCertificates");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CertificatesApi#postCertificates");
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
| **body** | [**CreateCertificatesRequest**](CreateCertificatesRequest.md)| Add a new trusted certificate | [optional] |

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


## putFingerprint

> CompletableFuture<BackgroundOperationResponse> putFingerprint(fingerprint, body)



Replaces the certificate properties

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CertificatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        CertificatesApi apiInstance = new CertificatesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        UpdateFingerprintRequest body = new UpdateFingerprintRequest(); // UpdateFingerprintRequest | Replaces the certificate properties
        try {
            CompletableFuture<BackgroundOperationResponse> result = apiInstance.putFingerprint(fingerprint, body);
            System.out.println(result.get());
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fingerprint** | **String**| Unique fingerprint | |
| **body** | [**UpdateFingerprintRequest**](UpdateFingerprintRequest.md)| Replaces the certificate properties | [optional] |

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

## putFingerprintWithHttpInfo

> CompletableFuture<ApiResponse<BackgroundOperationResponse>> putFingerprint putFingerprintWithHttpInfo(fingerprint, body)



Replaces the certificate properties

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CertificatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:2375");

        CertificatesApi apiInstance = new CertificatesApi(defaultClient);
        String fingerprint = "fingerprint_example"; // String | Unique fingerprint
        UpdateFingerprintRequest body = new UpdateFingerprintRequest(); // UpdateFingerprintRequest | Replaces the certificate properties
        try {
            CompletableFuture<ApiResponse<BackgroundOperationResponse>> response = apiInstance.putFingerprintWithHttpInfo(fingerprint, body);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CertificatesApi#putFingerprint");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CertificatesApi#putFingerprint");
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
| **fingerprint** | **String**| Unique fingerprint | |
| **body** | [**UpdateFingerprintRequest**](UpdateFingerprintRequest.md)| Replaces the certificate properties | [optional] |

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

