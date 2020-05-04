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


package com.sematext.stcloud.client;

import com.sematext.stcloud.ApiCallback;
import com.sematext.stcloud.ApiClient;
import com.sematext.stcloud.ApiException;
import com.sematext.stcloud.ApiResponse;
import com.sematext.stcloud.Configuration;
import com.sematext.stcloud.Pair;
import com.sematext.stcloud.ProgressRequestBody;
import com.sematext.stcloud.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.sematext.stcloud.model.BillingInfo;
import com.sematext.stcloud.model.GenericApiResponse;

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
     * @return GenericApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenericApiResponse getDetailedInvoiceUsingGET(String service, Integer year, Integer month) throws ApiException {
        ApiResponse<GenericApiResponse> resp = getDetailedInvoiceUsingGETWithHttpInfo(service, year, month);
        return resp.getData();
    }

    /**
     * Get invoice details
     * 
     * @param service service (required)
     * @param year year (required)
     * @param month month (required)
     * @return ApiResponse&lt;GenericApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenericApiResponse> getDetailedInvoiceUsingGETWithHttpInfo(String service, Integer year, Integer month) throws ApiException {
        com.squareup.okhttp.Call call = getDetailedInvoiceUsingGETValidateBeforeCall(service, year, month, null, null);
        Type localVarReturnType = new TypeToken<GenericApiResponse>(){}.getType();
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
    public com.squareup.okhttp.Call getDetailedInvoiceUsingGETAsync(String service, Integer year, Integer month, final ApiCallback<GenericApiResponse> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<GenericApiResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listAvailablePlansUsingGET
     * @param integrationId integrationId (optional)
     * @param appType appType (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listAvailablePlansUsingGETCall(Long integrationId, String appType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listAvailablePlansUsingGETValidateBeforeCall(Long integrationId, String appType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listAvailablePlansUsingGETCall(integrationId, appType, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get available plans
     * 
     * @param integrationId integrationId (optional)
     * @param appType appType (optional)
     * @return GenericApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenericApiResponse listAvailablePlansUsingGET(Long integrationId, String appType) throws ApiException {
        ApiResponse<GenericApiResponse> resp = listAvailablePlansUsingGETWithHttpInfo(integrationId, appType);
        return resp.getData();
    }

    /**
     * Get available plans
     * 
     * @param integrationId integrationId (optional)
     * @param appType appType (optional)
     * @return ApiResponse&lt;GenericApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenericApiResponse> listAvailablePlansUsingGETWithHttpInfo(Long integrationId, String appType) throws ApiException {
        com.squareup.okhttp.Call call = listAvailablePlansUsingGETValidateBeforeCall(integrationId, appType, null, null);
        Type localVarReturnType = new TypeToken<GenericApiResponse>(){}.getType();
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
    public com.squareup.okhttp.Call listAvailablePlansUsingGETAsync(Long integrationId, String appType, final ApiCallback<GenericApiResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listAvailablePlansUsingGETValidateBeforeCall(integrationId, appType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericApiResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updatePlanUsingPUT
     * @param appId appId (required)
     * @param dto dto (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updatePlanUsingPUTCall(Long appId, BillingInfo dto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = dto;

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
    private com.squareup.okhttp.Call updatePlanUsingPUTValidateBeforeCall(Long appId, BillingInfo dto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling updatePlanUsingPUT(Async)");
        }
        
        // verify the required parameter 'dto' is set
        if (dto == null) {
            throw new ApiException("Missing the required parameter 'dto' when calling updatePlanUsingPUT(Async)");
        }
        

        com.squareup.okhttp.Call call = updatePlanUsingPUTCall(appId, dto, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update plan for an app
     * 
     * @param appId appId (required)
     * @param dto dto (required)
     * @return GenericApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenericApiResponse updatePlanUsingPUT(Long appId, BillingInfo dto) throws ApiException {
        ApiResponse<GenericApiResponse> resp = updatePlanUsingPUTWithHttpInfo(appId, dto);
        return resp.getData();
    }

    /**
     * Update plan for an app
     * 
     * @param appId appId (required)
     * @param dto dto (required)
     * @return ApiResponse&lt;GenericApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenericApiResponse> updatePlanUsingPUTWithHttpInfo(Long appId, BillingInfo dto) throws ApiException {
        com.squareup.okhttp.Call call = updatePlanUsingPUTValidateBeforeCall(appId, dto, null, null);
        Type localVarReturnType = new TypeToken<GenericApiResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update plan for an app (asynchronously)
     * 
     * @param appId appId (required)
     * @param dto dto (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updatePlanUsingPUTAsync(Long appId, BillingInfo dto, final ApiCallback<GenericApiResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updatePlanUsingPUTValidateBeforeCall(appId, dto, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericApiResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
