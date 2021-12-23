/*
 * Sematext Cloud API
 * API Explorer provides access and documentation for Sematext REST API. The REST API requires the API Key to be sent as part of `Authorization` header. E.g.: `Authorization : apiKey e5f18450-205a-48eb-8589-7d49edaea813`.
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.sematext.cloud.client;

import com.sematext.cloud.ApiCallback;
import com.sematext.cloud.ApiClient;
import com.sematext.cloud.ApiException;
import com.sematext.cloud.ApiResponse;
import com.sematext.cloud.Configuration;
import com.sematext.cloud.Pair;
import com.sematext.cloud.ProgressRequestBody;
import com.sematext.cloud.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.sematext.cloud.model.BillingInfo;
import com.sematext.cloud.model.InvoiceResponse;
import com.sematext.cloud.model.PlansResponse;
import com.sematext.cloud.model.UpdatePlanResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BillingApi {
    private ApiClient apiClient;

    public BillingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BillingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getDetailedInvoiceUsingGET
     * @param service service (required)
     * @param year year (required)
     * @param month month (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDetailedInvoiceUsingGETCall(String service, Integer year, Integer month, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/users-web/api/v3/billing/invoice/{service}/{year}/{month}"
            .replaceAll("\\{" + "service" + "\\}", apiClient.escapeString(service.toString()))
            .replaceAll("\\{" + "year" + "\\}", apiClient.escapeString(year.toString()))
            .replaceAll("\\{" + "month" + "\\}", apiClient.escapeString(month.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDetailedInvoiceUsingGETValidateBeforeCall(String service, Integer year, Integer month, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'service' is set
        if (service == null) {
            throw new ApiException("Missing the required parameter 'service' when calling getDetailedInvoiceUsingGET(Async)");
        }
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new ApiException("Missing the required parameter 'year' when calling getDetailedInvoiceUsingGET(Async)");
        }
        // verify the required parameter 'month' is set
        if (month == null) {
            throw new ApiException("Missing the required parameter 'month' when calling getDetailedInvoiceUsingGET(Async)");
        }
        
        com.squareup.okhttp.Call call = getDetailedInvoiceUsingGETCall(service, year, month, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get invoice details
     * 
     * @param service service (required)
     * @param year year (required)
     * @param month month (required)
     * @return InvoiceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InvoiceResponse getDetailedInvoiceUsingGET(String service, Integer year, Integer month) throws ApiException {
        ApiResponse<InvoiceResponse> resp = getDetailedInvoiceUsingGETWithHttpInfo(service, year, month);
        return resp.getData();
    }

    /**
     * Get invoice details
     * 
     * @param service service (required)
     * @param year year (required)
     * @param month month (required)
     * @return ApiResponse&lt;InvoiceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InvoiceResponse> getDetailedInvoiceUsingGETWithHttpInfo(String service, Integer year, Integer month) throws ApiException {
        com.squareup.okhttp.Call call = getDetailedInvoiceUsingGETValidateBeforeCall(service, year, month, null, null);
        Type localVarReturnType = new TypeToken<InvoiceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get invoice details (asynchronously)
     * 
     * @param service service (required)
     * @param year year (required)
     * @param month month (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDetailedInvoiceUsingGETAsync(String service, Integer year, Integer month, final ApiCallback<InvoiceResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDetailedInvoiceUsingGETValidateBeforeCall(service, year, month, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InvoiceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listAvailablePlansUsingGET1
     * @param integrationId integrationId (optional)
     * @param appType appType (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listAvailablePlansUsingGET1Call(Long integrationId, String appType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/users-web/api/v3/billing/availablePlans";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (integrationId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("integrationId", integrationId));
        if (appType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("appType", appType));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listAvailablePlansUsingGET1ValidateBeforeCall(Long integrationId, String appType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listAvailablePlansUsingGET1Call(integrationId, appType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get available plans
     * 
     * @param integrationId integrationId (optional)
     * @param appType appType (optional)
     * @return PlansResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PlansResponse listAvailablePlansUsingGET1(Long integrationId, String appType) throws ApiException {
        ApiResponse<PlansResponse> resp = listAvailablePlansUsingGET1WithHttpInfo(integrationId, appType);
        return resp.getData();
    }

    /**
     * Get available plans
     * 
     * @param integrationId integrationId (optional)
     * @param appType appType (optional)
     * @return ApiResponse&lt;PlansResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PlansResponse> listAvailablePlansUsingGET1WithHttpInfo(Long integrationId, String appType) throws ApiException {
        com.squareup.okhttp.Call call = listAvailablePlansUsingGET1ValidateBeforeCall(integrationId, appType, null, null);
        Type localVarReturnType = new TypeToken<PlansResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get available plans (asynchronously)
     * 
     * @param integrationId integrationId (optional)
     * @param appType appType (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAvailablePlansUsingGET1Async(Long integrationId, String appType, final ApiCallback<PlansResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listAvailablePlansUsingGET1ValidateBeforeCall(integrationId, appType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PlansResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updatePlanUsingPUT
     * @param body dto (required)
     * @param appId appId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updatePlanUsingPUTCall(BillingInfo body, Long appId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/users-web/api/v3/billing/info/{appId}"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updatePlanUsingPUTValidateBeforeCall(BillingInfo body, Long appId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updatePlanUsingPUT(Async)");
        }
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling updatePlanUsingPUT(Async)");
        }
        
        com.squareup.okhttp.Call call = updatePlanUsingPUTCall(body, appId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update plan for an app
     * 
     * @param body dto (required)
     * @param appId appId (required)
     * @return UpdatePlanResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UpdatePlanResponse updatePlanUsingPUT(BillingInfo body, Long appId) throws ApiException {
        ApiResponse<UpdatePlanResponse> resp = updatePlanUsingPUTWithHttpInfo(body, appId);
        return resp.getData();
    }

    /**
     * Update plan for an app
     * 
     * @param body dto (required)
     * @param appId appId (required)
     * @return ApiResponse&lt;UpdatePlanResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UpdatePlanResponse> updatePlanUsingPUTWithHttpInfo(BillingInfo body, Long appId) throws ApiException {
        com.squareup.okhttp.Call call = updatePlanUsingPUTValidateBeforeCall(body, appId, null, null);
        Type localVarReturnType = new TypeToken<UpdatePlanResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update plan for an app (asynchronously)
     * 
     * @param body dto (required)
     * @param appId appId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updatePlanUsingPUTAsync(BillingInfo body, Long appId, final ApiCallback<UpdatePlanResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updatePlanUsingPUTValidateBeforeCall(body, appId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UpdatePlanResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
