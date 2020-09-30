/*
 * LXD
 * The services listed below are referred as .....
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@relxd.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.relxd.lxd.api;

import org.relxd.lxd.ApiCallback;
import org.relxd.lxd.ApiClient;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.ApiResponse;
import org.relxd.lxd.Configuration;
import org.relxd.lxd.Pair;
import org.relxd.lxd.ProgressRequestBody;
import org.relxd.lxd.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.relxd.lxd.model.BasicStandardReturnValueResponse;
import org.relxd.lxd.model.Config1;
import org.relxd.lxd.model.ErrorResponse;
import org.relxd.lxd.model.GetServerStateResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LxdApi {
    private ApiClient localVarApiClient;

    public LxdApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LxdApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getApiList
     * @param recursion To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). (optional)
     * @param filter There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of supported APIs </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> A standard error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> A standard error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApiListCall(Integer recursion, String filter, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (recursion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recursion", recursion));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "authentication" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getApiListValidateBeforeCall(Integer recursion, String filter, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getApiListCall(recursion, filter, _callback);
        return localVarCall;

    }

    /**
     * 
     * List of supported APIs
     * @param recursion To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). (optional)
     * @param filter There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. (optional)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of supported APIs </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> A standard error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> A standard error response </td><td>  -  </td></tr>
     </table>
     */
    public List<String> getApiList(Integer recursion, String filter) throws ApiException {
        ApiResponse<List<String>> localVarResp = getApiListWithHttpInfo(recursion, filter);
        return localVarResp.getData();
    }

    /**
     * 
     * List of supported APIs
     * @param recursion To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). (optional)
     * @param filter There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. (optional)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of supported APIs </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> A standard error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> A standard error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<String>> getApiListWithHttpInfo(Integer recursion, String filter) throws ApiException {
        okhttp3.Call localVarCall = getApiListValidateBeforeCall(recursion, filter, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List of supported APIs
     * @param recursion To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). (optional)
     * @param filter There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of supported APIs </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> A standard error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> A standard error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApiListAsync(Integer recursion, String filter, final ApiCallback<List<String>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getApiListValidateBeforeCall(recursion, filter, _callback);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getServerState
     * @param recursion To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). (optional)
     * @param filter There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Server configuration and environment information </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> A standard error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> A standard error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getServerStateCall(Integer recursion, String filter, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1.0/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (recursion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recursion", recursion));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "authentication" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getServerStateValidateBeforeCall(Integer recursion, String filter, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getServerStateCall(recursion, filter, _callback);
        return localVarCall;

    }

    /**
     * 
     * Server configuration and environment information
     * @param recursion To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). (optional)
     * @param filter There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. (optional)
     * @return GetServerStateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Server configuration and environment information </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> A standard error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> A standard error response </td><td>  -  </td></tr>
     </table>
     */
    public GetServerStateResponse getServerState(Integer recursion, String filter) throws ApiException {
        ApiResponse<GetServerStateResponse> localVarResp = getServerStateWithHttpInfo(recursion, filter);
        return localVarResp.getData();
    }

    /**
     * 
     * Server configuration and environment information
     * @param recursion To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). (optional)
     * @param filter There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. (optional)
     * @return ApiResponse&lt;GetServerStateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Server configuration and environment information </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> A standard error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> A standard error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetServerStateResponse> getServerStateWithHttpInfo(Integer recursion, String filter) throws ApiException {
        okhttp3.Call localVarCall = getServerStateValidateBeforeCall(recursion, filter, null);
        Type localVarReturnType = new TypeToken<GetServerStateResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Server configuration and environment information
     * @param recursion To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). (optional)
     * @param filter There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Server configuration and environment information </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> A standard error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> A standard error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getServerStateAsync(Integer recursion, String filter, final ApiCallback<GetServerStateResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getServerStateValidateBeforeCall(recursion, filter, _callback);
        Type localVarReturnType = new TypeToken<GetServerStateResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchServerState
     * @param body Updates only the listed keys, rest remains intact (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A standard return value response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> A standard error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> A standard error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchServerStateCall(Config1 body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/1.0/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "authentication" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchServerStateValidateBeforeCall(Config1 body, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = patchServerStateCall(body, _callback);
        return localVarCall;

    }

    /**
     * 
     * Updates the server configuration or other properties
     * @param body Updates only the listed keys, rest remains intact (optional)
     * @return BasicStandardReturnValueResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A standard return value response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> A standard error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> A standard error response </td><td>  -  </td></tr>
     </table>
     */
    public BasicStandardReturnValueResponse patchServerState(Config1 body) throws ApiException {
        ApiResponse<BasicStandardReturnValueResponse> localVarResp = patchServerStateWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * 
     * Updates the server configuration or other properties
     * @param body Updates only the listed keys, rest remains intact (optional)
     * @return ApiResponse&lt;BasicStandardReturnValueResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A standard return value response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> A standard error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> A standard error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BasicStandardReturnValueResponse> patchServerStateWithHttpInfo(Config1 body) throws ApiException {
        okhttp3.Call localVarCall = patchServerStateValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<BasicStandardReturnValueResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Updates the server configuration or other properties
     * @param body Updates only the listed keys, rest remains intact (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A standard return value response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> A standard error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> A standard error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchServerStateAsync(Config1 body, final ApiCallback<BasicStandardReturnValueResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchServerStateValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<BasicStandardReturnValueResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for putServerState
     * @param body Replaces any existing config with the provided one (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A standard return value response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> A standard error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> A standard error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call putServerStateCall(Config1 body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/1.0/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "authentication" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call putServerStateValidateBeforeCall(Config1 body, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = putServerStateCall(body, _callback);
        return localVarCall;

    }

    /**
     * 
     * Replaces the server configuration or other properties
     * @param body Replaces any existing config with the provided one (optional)
     * @return BasicStandardReturnValueResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A standard return value response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> A standard error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> A standard error response </td><td>  -  </td></tr>
     </table>
     */
    public BasicStandardReturnValueResponse putServerState(Config1 body) throws ApiException {
        ApiResponse<BasicStandardReturnValueResponse> localVarResp = putServerStateWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * 
     * Replaces the server configuration or other properties
     * @param body Replaces any existing config with the provided one (optional)
     * @return ApiResponse&lt;BasicStandardReturnValueResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A standard return value response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> A standard error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> A standard error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BasicStandardReturnValueResponse> putServerStateWithHttpInfo(Config1 body) throws ApiException {
        okhttp3.Call localVarCall = putServerStateValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<BasicStandardReturnValueResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Replaces the server configuration or other properties
     * @param body Replaces any existing config with the provided one (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A standard return value response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> A standard error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> A standard error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call putServerStateAsync(Config1 body, final ApiCallback<BasicStandardReturnValueResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = putServerStateValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<BasicStandardReturnValueResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
