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


import com.sematext.cloud.model.AlertNotificationRequest;
import com.sematext.cloud.model.GenericApiResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlertNotificationsApi {
    private ApiClient apiClient;

    public AlertNotificationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlertNotificationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAlertNotificationsForAppUsingPOST1
     * @param appId appId (required)
     * @param timeInterval Time Interval (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAlertNotificationsForAppUsingPOST1Call(Long appId, AlertNotificationRequest timeInterval, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = timeInterval;

        // create path and map variables
        String localVarPath = "/users-web/api/v3/apps/{appId}/notifications/alerts"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAlertNotificationsForAppUsingPOST1ValidateBeforeCall(Long appId, AlertNotificationRequest timeInterval, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getAlertNotificationsForAppUsingPOST1(Async)");
        }
        
        // verify the required parameter 'timeInterval' is set
        if (timeInterval == null) {
            throw new ApiException("Missing the required parameter 'timeInterval' when calling getAlertNotificationsForAppUsingPOST1(Async)");
        }
        

        com.squareup.okhttp.Call call = getAlertNotificationsForAppUsingPOST1Call(appId, timeInterval, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get alert notifications for an app
     * Default value of interval is 1d
     * @param appId appId (required)
     * @param timeInterval Time Interval (required)
     * @return GenericApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenericApiResponse getAlertNotificationsForAppUsingPOST1(Long appId, AlertNotificationRequest timeInterval) throws ApiException {
        ApiResponse<GenericApiResponse> resp = getAlertNotificationsForAppUsingPOST1WithHttpInfo(appId, timeInterval);
        return resp.getData();
    }

    /**
     * Get alert notifications for an app
     * Default value of interval is 1d
     * @param appId appId (required)
     * @param timeInterval Time Interval (required)
     * @return ApiResponse&lt;GenericApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenericApiResponse> getAlertNotificationsForAppUsingPOST1WithHttpInfo(Long appId, AlertNotificationRequest timeInterval) throws ApiException {
        com.squareup.okhttp.Call call = getAlertNotificationsForAppUsingPOST1ValidateBeforeCall(appId, timeInterval, null, null);
        Type localVarReturnType = new TypeToken<GenericApiResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get alert notifications for an app (asynchronously)
     * Default value of interval is 1d
     * @param appId appId (required)
     * @param timeInterval Time Interval (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAlertNotificationsForAppUsingPOST1Async(Long appId, AlertNotificationRequest timeInterval, final ApiCallback<GenericApiResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAlertNotificationsForAppUsingPOST1ValidateBeforeCall(appId, timeInterval, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericApiResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAlertNotificationsForUserUsingPOST
     * @param timeInterval Time Interval (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAlertNotificationsForUserUsingPOSTCall(AlertNotificationRequest timeInterval, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = timeInterval;

        // create path and map variables
        String localVarPath = "/users-web/api/v3/notifications/alerts";

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
    private com.squareup.okhttp.Call getAlertNotificationsForUserUsingPOSTValidateBeforeCall(AlertNotificationRequest timeInterval, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'timeInterval' is set
        if (timeInterval == null) {
            throw new ApiException("Missing the required parameter 'timeInterval' when calling getAlertNotificationsForUserUsingPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = getAlertNotificationsForUserUsingPOSTCall(timeInterval, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get alert notifications for a user
     * Default value of interval is 1d
     * @param timeInterval Time Interval (required)
     * @return GenericApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenericApiResponse getAlertNotificationsForUserUsingPOST(AlertNotificationRequest timeInterval) throws ApiException {
        ApiResponse<GenericApiResponse> resp = getAlertNotificationsForUserUsingPOSTWithHttpInfo(timeInterval);
        return resp.getData();
    }

    /**
     * Get alert notifications for a user
     * Default value of interval is 1d
     * @param timeInterval Time Interval (required)
     * @return ApiResponse&lt;GenericApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenericApiResponse> getAlertNotificationsForUserUsingPOSTWithHttpInfo(AlertNotificationRequest timeInterval) throws ApiException {
        com.squareup.okhttp.Call call = getAlertNotificationsForUserUsingPOSTValidateBeforeCall(timeInterval, null, null);
        Type localVarReturnType = new TypeToken<GenericApiResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get alert notifications for a user (asynchronously)
     * Default value of interval is 1d
     * @param timeInterval Time Interval (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAlertNotificationsForUserUsingPOSTAsync(AlertNotificationRequest timeInterval, final ApiCallback<GenericApiResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAlertNotificationsForUserUsingPOSTValidateBeforeCall(timeInterval, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericApiResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}