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


import org.relxd.lxd.model.ErrorResponse;
import org.relxd.lxd.model.GetOperationsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperationsApi {
    private ApiClient localVarApiClient;

    public OperationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OperationsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getOperations
     * @param recursion To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). (optional)
     * @param filter There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of operations </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> A standard error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> A standard error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getOperationsCall(Integer recursion, String filter, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1.0/operations";

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
    private okhttp3.Call getOperationsValidateBeforeCall(Integer recursion, String filter, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getOperationsCall(recursion, filter, _callback);
        return localVarCall;

    }

    /**
     * 
     * List of operations
     * @param recursion To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). (optional)
     * @param filter There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. (optional)
     * @return GetOperationsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of operations </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> A standard error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> A standard error response </td><td>  -  </td></tr>
     </table>
     */
    public GetOperationsResponse getOperations(Integer recursion, String filter) throws ApiException {
        ApiResponse<GetOperationsResponse> localVarResp = getOperationsWithHttpInfo(recursion, filter);
        return localVarResp.getData();
    }

    /**
     * 
     * List of operations
     * @param recursion To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). (optional)
     * @param filter There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. (optional)
     * @return ApiResponse&lt;GetOperationsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of operations </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> A standard error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> A standard error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetOperationsResponse> getOperationsWithHttpInfo(Integer recursion, String filter) throws ApiException {
        okhttp3.Call localVarCall = getOperationsValidateBeforeCall(recursion, filter, null);
        Type localVarReturnType = new TypeToken<GetOperationsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List of operations
     * @param recursion To optimize queries of large lists, recursion is implemented for collections. The default value is 0 which means that collection member URLs are returned. Setting it to 1 will have those URLs be replaced by the object they point to (typically a dict). (optional)
     * @param filter There is no default value for filter which means that all results found will be returned. The language follows the OData conventions for structuring REST API filtering logic. Logical operators are also supported for filtering: not(not), equals(eq), not equals(ne), and(and), or(or). Filters are evaluated with left associativity. Values with spaces can be surrounded with quotes. Nesting filtering is also supported. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of operations </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> A standard error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> A standard error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getOperationsAsync(Integer recursion, String filter, final ApiCallback<GetOperationsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getOperationsValidateBeforeCall(recursion, filter, _callback);
        Type localVarReturnType = new TypeToken<GetOperationsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
