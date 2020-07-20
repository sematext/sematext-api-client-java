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


import com.sematext.cloud.model.CreateAppInfo;
import com.sematext.cloud.model.GenericApiResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MonitoringAppApi {
    private ApiClient apiClient;

    public MonitoringAppApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MonitoringAppApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createSpmApplication1
     * @param applicationDetails Details of the application to be created (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createSpmApplication1Call(CreateAppInfo applicationDetails, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = applicationDetails;

        // create path and map variables
        String localVarPath = "/spm-reports/api/v3/apps";

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createSpmApplication1ValidateBeforeCall(CreateAppInfo applicationDetails, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'applicationDetails' is set
        if (applicationDetails == null) {
            throw new ApiException("Missing the required parameter 'applicationDetails' when calling createSpmApplication1(Async)");
        }
        

        com.squareup.okhttp.Call call = createSpmApplication1Call(applicationDetails, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Monitoring App
     * 
     * @param applicationDetails Details of the application to be created (required)
     * @return GenericApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenericApiResponse createSpmApplication1(CreateAppInfo applicationDetails) throws ApiException {
        ApiResponse<GenericApiResponse> resp = createSpmApplication1WithHttpInfo(applicationDetails);
        return resp.getData();
    }

    /**
     * Create Monitoring App
     * 
     * @param applicationDetails Details of the application to be created (required)
     * @return ApiResponse&lt;GenericApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenericApiResponse> createSpmApplication1WithHttpInfo(CreateAppInfo applicationDetails) throws ApiException {
        com.squareup.okhttp.Call call = createSpmApplication1ValidateBeforeCall(applicationDetails, null, null);
        Type localVarReturnType = new TypeToken<GenericApiResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Monitoring App (asynchronously)
     * 
     * @param applicationDetails Details of the application to be created (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createSpmApplication1Async(CreateAppInfo applicationDetails, final ApiCallback<GenericApiResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createSpmApplication1ValidateBeforeCall(applicationDetails, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericApiResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}