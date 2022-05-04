/*
 * Search.io API
 * Search.io offers a search and discovery service with Neuralsearch®, the world's first instant AI search technology. Businesses of all sizes use Search.io to build site search and discovery solutions that maximize e-commerce revenue, optimize on-site customer experience, and scale their online presence.
 *
 * The version of the OpenAPI document: v4
 * Contact: support@search.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.sajari.client.api;

import com.sajari.client.ApiCallback;
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.ApiResponse;
import com.sajari.client.Configuration;
import com.sajari.client.Pair;
import com.sajari.client.ProgressRequestBody;
import com.sajari.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.sajari.client.model.Error;
import com.sajari.client.model.SendEventRequest;

import java.lang.reflect.Type;

public class EventsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EventsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EventsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for sendEvent
     * @param accountId The account that owns the collection, e.g. &#x60;1618535966441231024&#x60;. (required)
     * @param sendEventRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned when the request contains violations for one or more fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned when the request does not have valid authentication credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned when the user does not have permission to access the resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Returned when the API encounters an internal error. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendEventCall(String accountId, SendEventRequest sendEventRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = sendEventRequest;

        // create path and map variables
        String localVarPath = "/v4/events:send";

        java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
        java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
        java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
        java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
        java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

        if (accountId != null) {
            localVarHeaderParams.put("Account-Id", localVarApiClient.parameterToString(accountId));
        }

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendEventValidateBeforeCall(String accountId, SendEventRequest sendEventRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling sendEvent(Async)");
        }
        
        // verify the required parameter 'sendEventRequest' is set
        if (sendEventRequest == null) {
            throw new ApiException("Missing the required parameter 'sendEventRequest' when calling sendEvent(Async)");
        }
        

        okhttp3.Call localVarCall = sendEventCall(accountId, sendEventRequest, _callback);
        return localVarCall;

    }

    /**
     * Send event
     * Send an event to the ranking system after a user interacts with a search result.  When querying a collection, you can set the tracking type of the query request. When it is &#x60;CLICK&#x60; or &#x60;POS_NEG&#x60;, a token is generated for each result in the query response. You can use this token to provide feedback to the ranking system. Each time you want to record an event on a particular search result, use the send event call and provide:  - The &#x60;name&#x60; of the event, e.g. &#x60;click&#x60;, &#x60;redirect&#x60;, &#x60;purchase&#x60;. - The &#x60;token&#x60; from the search result. - The &#x60;weight&#x60; to assign to the event, e.g. &#x60;1&#x60;. - An object containing any additional &#x60;metadata&#x60;.  For example, to send an event where a customer purchased a product, use the following call:  &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;purchase\&quot;,   \&quot;token\&quot;: \&quot;eyJ...\&quot;,   \&quot;weight\&quot;: 1,   \&quot;metadata\&quot;: {     \&quot;discount\&quot;: 0.2,     \&quot;margin\&quot;: 30.0,     \&quot;customer_id\&quot;: \&quot;12345\&quot;,     \&quot;ui_test_segment\&quot;: \&quot;A\&quot;   } } &#x60;&#x60;&#x60;  When sending event tokens returned from redirects, set &#x60;name&#x60; to &#x60;redirect&#x60;.  Note: You must pass an &#x60;Account-Id&#x60; header.
     * @param accountId The account that owns the collection, e.g. &#x60;1618535966441231024&#x60;. (required)
     * @param sendEventRequest  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned when the request contains violations for one or more fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned when the request does not have valid authentication credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned when the user does not have permission to access the resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Returned when the API encounters an internal error. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public Object sendEvent(String accountId, SendEventRequest sendEventRequest) throws ApiException {
        ApiResponse<Object> localVarResp = sendEventWithHttpInfo(accountId, sendEventRequest);
        return localVarResp.getData();
    }

    /**
     * Send event
     * Send an event to the ranking system after a user interacts with a search result.  When querying a collection, you can set the tracking type of the query request. When it is &#x60;CLICK&#x60; or &#x60;POS_NEG&#x60;, a token is generated for each result in the query response. You can use this token to provide feedback to the ranking system. Each time you want to record an event on a particular search result, use the send event call and provide:  - The &#x60;name&#x60; of the event, e.g. &#x60;click&#x60;, &#x60;redirect&#x60;, &#x60;purchase&#x60;. - The &#x60;token&#x60; from the search result. - The &#x60;weight&#x60; to assign to the event, e.g. &#x60;1&#x60;. - An object containing any additional &#x60;metadata&#x60;.  For example, to send an event where a customer purchased a product, use the following call:  &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;purchase\&quot;,   \&quot;token\&quot;: \&quot;eyJ...\&quot;,   \&quot;weight\&quot;: 1,   \&quot;metadata\&quot;: {     \&quot;discount\&quot;: 0.2,     \&quot;margin\&quot;: 30.0,     \&quot;customer_id\&quot;: \&quot;12345\&quot;,     \&quot;ui_test_segment\&quot;: \&quot;A\&quot;   } } &#x60;&#x60;&#x60;  When sending event tokens returned from redirects, set &#x60;name&#x60; to &#x60;redirect&#x60;.  Note: You must pass an &#x60;Account-Id&#x60; header.
     * @param accountId The account that owns the collection, e.g. &#x60;1618535966441231024&#x60;. (required)
     * @param sendEventRequest  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned when the request contains violations for one or more fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned when the request does not have valid authentication credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned when the user does not have permission to access the resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Returned when the API encounters an internal error. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> sendEventWithHttpInfo(String accountId, SendEventRequest sendEventRequest) throws ApiException {
        okhttp3.Call localVarCall = sendEventValidateBeforeCall(accountId, sendEventRequest, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Send event (asynchronously)
     * Send an event to the ranking system after a user interacts with a search result.  When querying a collection, you can set the tracking type of the query request. When it is &#x60;CLICK&#x60; or &#x60;POS_NEG&#x60;, a token is generated for each result in the query response. You can use this token to provide feedback to the ranking system. Each time you want to record an event on a particular search result, use the send event call and provide:  - The &#x60;name&#x60; of the event, e.g. &#x60;click&#x60;, &#x60;redirect&#x60;, &#x60;purchase&#x60;. - The &#x60;token&#x60; from the search result. - The &#x60;weight&#x60; to assign to the event, e.g. &#x60;1&#x60;. - An object containing any additional &#x60;metadata&#x60;.  For example, to send an event where a customer purchased a product, use the following call:  &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;purchase\&quot;,   \&quot;token\&quot;: \&quot;eyJ...\&quot;,   \&quot;weight\&quot;: 1,   \&quot;metadata\&quot;: {     \&quot;discount\&quot;: 0.2,     \&quot;margin\&quot;: 30.0,     \&quot;customer_id\&quot;: \&quot;12345\&quot;,     \&quot;ui_test_segment\&quot;: \&quot;A\&quot;   } } &#x60;&#x60;&#x60;  When sending event tokens returned from redirects, set &#x60;name&#x60; to &#x60;redirect&#x60;.  Note: You must pass an &#x60;Account-Id&#x60; header.
     * @param accountId The account that owns the collection, e.g. &#x60;1618535966441231024&#x60;. (required)
     * @param sendEventRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned when the request contains violations for one or more fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned when the request does not have valid authentication credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned when the user does not have permission to access the resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Returned when the API encounters an internal error. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendEventAsync(String accountId, SendEventRequest sendEventRequest, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendEventValidateBeforeCall(accountId, sendEventRequest, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for sendEvent2
     * @param sendEventRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned when the request contains violations for one or more fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned when the request does not have valid authentication credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned when the user does not have permission to access the resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Returned when the API encounters an internal error. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call sendEvent2Call(SendEventRequest sendEventRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = sendEventRequest;

        // create path and map variables
        String localVarPath = "/v4/events:sendEvent";

        java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
        java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
        java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
        java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
        java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendEvent2ValidateBeforeCall(SendEventRequest sendEventRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'sendEventRequest' is set
        if (sendEventRequest == null) {
            throw new ApiException("Missing the required parameter 'sendEventRequest' when calling sendEvent2(Async)");
        }
        

        okhttp3.Call localVarCall = sendEvent2Call(sendEventRequest, _callback);
        return localVarCall;

    }

    /**
     * Send event
     * Send an event to the ranking system after a user interacts with a search result.  When querying a collection, you can set the tracking type of the query request. When it is &#x60;CLICK&#x60; or &#x60;POS_NEG&#x60;, a token is generated for each result in the query response. You can use this token to provide feedback to the ranking system. Each time you want to record an event on a particular search result, use the send event call and provide:  - The &#x60;name&#x60; of the event, e.g. &#x60;click&#x60;, &#x60;redirect&#x60;, &#x60;purchase&#x60;. - The &#x60;token&#x60; from the search result. - The &#x60;weight&#x60; to assign to the event, e.g. &#x60;1&#x60;. - An object containing any additional &#x60;metadata&#x60;.  For example, to send an event where a customer purchased a product, use the following call:  &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;purchase\&quot;,   \&quot;token\&quot;: \&quot;eyJ...\&quot;,   \&quot;weight\&quot;: 1,   \&quot;metadata\&quot;: {     \&quot;discount\&quot;: 0.2,     \&quot;margin\&quot;: 30.0,     \&quot;customer_id\&quot;: \&quot;12345\&quot;,     \&quot;ui_test_segment\&quot;: \&quot;A\&quot;   } } &#x60;&#x60;&#x60;  When sending event tokens returned from redirects, set &#x60;name&#x60; to &#x60;redirect&#x60;.  Note: You must pass an &#x60;Account-Id&#x60; header.
     * @param sendEventRequest  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned when the request contains violations for one or more fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned when the request does not have valid authentication credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned when the user does not have permission to access the resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Returned when the API encounters an internal error. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public Object sendEvent2(SendEventRequest sendEventRequest) throws ApiException {
        ApiResponse<Object> localVarResp = sendEvent2WithHttpInfo(sendEventRequest);
        return localVarResp.getData();
    }

    /**
     * Send event
     * Send an event to the ranking system after a user interacts with a search result.  When querying a collection, you can set the tracking type of the query request. When it is &#x60;CLICK&#x60; or &#x60;POS_NEG&#x60;, a token is generated for each result in the query response. You can use this token to provide feedback to the ranking system. Each time you want to record an event on a particular search result, use the send event call and provide:  - The &#x60;name&#x60; of the event, e.g. &#x60;click&#x60;, &#x60;redirect&#x60;, &#x60;purchase&#x60;. - The &#x60;token&#x60; from the search result. - The &#x60;weight&#x60; to assign to the event, e.g. &#x60;1&#x60;. - An object containing any additional &#x60;metadata&#x60;.  For example, to send an event where a customer purchased a product, use the following call:  &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;purchase\&quot;,   \&quot;token\&quot;: \&quot;eyJ...\&quot;,   \&quot;weight\&quot;: 1,   \&quot;metadata\&quot;: {     \&quot;discount\&quot;: 0.2,     \&quot;margin\&quot;: 30.0,     \&quot;customer_id\&quot;: \&quot;12345\&quot;,     \&quot;ui_test_segment\&quot;: \&quot;A\&quot;   } } &#x60;&#x60;&#x60;  When sending event tokens returned from redirects, set &#x60;name&#x60; to &#x60;redirect&#x60;.  Note: You must pass an &#x60;Account-Id&#x60; header.
     * @param sendEventRequest  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned when the request contains violations for one or more fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned when the request does not have valid authentication credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned when the user does not have permission to access the resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Returned when the API encounters an internal error. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<Object> sendEvent2WithHttpInfo(SendEventRequest sendEventRequest) throws ApiException {
        okhttp3.Call localVarCall = sendEvent2ValidateBeforeCall(sendEventRequest, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Send event (asynchronously)
     * Send an event to the ranking system after a user interacts with a search result.  When querying a collection, you can set the tracking type of the query request. When it is &#x60;CLICK&#x60; or &#x60;POS_NEG&#x60;, a token is generated for each result in the query response. You can use this token to provide feedback to the ranking system. Each time you want to record an event on a particular search result, use the send event call and provide:  - The &#x60;name&#x60; of the event, e.g. &#x60;click&#x60;, &#x60;redirect&#x60;, &#x60;purchase&#x60;. - The &#x60;token&#x60; from the search result. - The &#x60;weight&#x60; to assign to the event, e.g. &#x60;1&#x60;. - An object containing any additional &#x60;metadata&#x60;.  For example, to send an event where a customer purchased a product, use the following call:  &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;purchase\&quot;,   \&quot;token\&quot;: \&quot;eyJ...\&quot;,   \&quot;weight\&quot;: 1,   \&quot;metadata\&quot;: {     \&quot;discount\&quot;: 0.2,     \&quot;margin\&quot;: 30.0,     \&quot;customer_id\&quot;: \&quot;12345\&quot;,     \&quot;ui_test_segment\&quot;: \&quot;A\&quot;   } } &#x60;&#x60;&#x60;  When sending event tokens returned from redirects, set &#x60;name&#x60; to &#x60;redirect&#x60;.  Note: You must pass an &#x60;Account-Id&#x60; header.
     * @param sendEventRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned when the request contains violations for one or more fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned when the request does not have valid authentication credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned when the user does not have permission to access the resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Returned when the API encounters an internal error. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call sendEvent2Async(SendEventRequest sendEventRequest, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendEvent2ValidateBeforeCall(sendEventRequest, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
