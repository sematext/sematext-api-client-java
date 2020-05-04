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


import com.sematext.stcloud.model.DataSeriesRequest;
import com.sematext.stcloud.model.GenericApiResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetricsApi {
    private ApiClient apiClient;

    public MetricsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MetricsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listDataSeriesUsingPOST1
     * @param appId appId (required)
     * @param requestBody Metric data points request (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listDataSeriesUsingPOST1Call(Long appId, DataSeriesRequest requestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestBody;

        // create path and map variables
        String localVarPath = "/spm-reports/api/v3/apps/{appId}/metrics/data"
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
    private com.squareup.okhttp.Call listDataSeriesUsingPOST1ValidateBeforeCall(Long appId, DataSeriesRequest requestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling listDataSeriesUsingPOST1(Async)");
        }
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new ApiException("Missing the required parameter 'requestBody' when calling listDataSeriesUsingPOST1(Async)");
        }
        

        com.squareup.okhttp.Call call = listDataSeriesUsingPOST1Call(appId, requestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get metrics data points for an app
     * Default value of interval is 5m
     * @param appId appId (required)
     * @param requestBody Metric data points request (required)
     * @return GenericApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenericApiResponse listDataSeriesUsingPOST1(Long appId, DataSeriesRequest requestBody) throws ApiException {
        ApiResponse<GenericApiResponse> resp = listDataSeriesUsingPOST1WithHttpInfo(appId, requestBody);
        return resp.getData();
    }

    /**
     * Get metrics data points for an app
     * Default value of interval is 5m
     * @param appId appId (required)
     * @param requestBody Metric data points request (required)
     * @return ApiResponse&lt;GenericApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenericApiResponse> listDataSeriesUsingPOST1WithHttpInfo(Long appId, DataSeriesRequest requestBody) throws ApiException {
        com.squareup.okhttp.Call call = listDataSeriesUsingPOST1ValidateBeforeCall(appId, requestBody, null, null);
        Type localVarReturnType = new TypeToken<GenericApiResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get metrics data points for an app (asynchronously)
     * Default value of interval is 5m
     * @param appId appId (required)
     * @param requestBody Metric data points request (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listDataSeriesUsingPOST1Async(Long appId, DataSeriesRequest requestBody, final ApiCallback<GenericApiResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listDataSeriesUsingPOST1ValidateBeforeCall(appId, requestBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericApiResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listFiltersUsingPOST
     * @param appId appId (required)
     * @param requestBody Metric filters request (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listFiltersUsingPOSTCall(Long appId, DataSeriesRequest requestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestBody;

        // create path and map variables
        String localVarPath = "/spm-reports/api/v3/apps/{appId}/metrics/filters"
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
    private com.squareup.okhttp.Call listFiltersUsingPOSTValidateBeforeCall(Long appId, DataSeriesRequest requestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling listFiltersUsingPOST(Async)");
        }
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new ApiException("Missing the required parameter 'requestBody' when calling listFiltersUsingPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = listFiltersUsingPOSTCall(appId, requestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get metrics filters and their values for an app
     * Default value of interval is 5m
     * @param appId appId (required)
     * @param requestBody Metric filters request (required)
     * @return GenericApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenericApiResponse listFiltersUsingPOST(Long appId, DataSeriesRequest requestBody) throws ApiException {
        ApiResponse<GenericApiResponse> resp = listFiltersUsingPOSTWithHttpInfo(appId, requestBody);
        return resp.getData();
    }

    /**
     * Get metrics filters and their values for an app
     * Default value of interval is 5m
     * @param appId appId (required)
     * @param requestBody Metric filters request (required)
     * @return ApiResponse&lt;GenericApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenericApiResponse> listFiltersUsingPOSTWithHttpInfo(Long appId, DataSeriesRequest requestBody) throws ApiException {
        com.squareup.okhttp.Call call = listFiltersUsingPOSTValidateBeforeCall(appId, requestBody, null, null);
        Type localVarReturnType = new TypeToken<GenericApiResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get metrics filters and their values for an app (asynchronously)
     * Default value of interval is 5m
     * @param appId appId (required)
     * @param requestBody Metric filters request (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listFiltersUsingPOSTAsync(Long appId, DataSeriesRequest requestBody, final ApiCallback<GenericApiResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listFiltersUsingPOSTValidateBeforeCall(appId, requestBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericApiResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listMetricsKeysUsingGET1
     * @param appId appId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listMetricsKeysUsingGET1Call(Long appId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/spm-reports/api/v3/apps/{appId}/metrics/keys"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listMetricsKeysUsingGET1ValidateBeforeCall(Long appId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling listMetricsKeysUsingGET1(Async)");
        }
        

        com.squareup.okhttp.Call call = listMetricsKeysUsingGET1Call(appId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get metrics keys for an app
     * 
     * @param appId appId (required)
     * @return GenericApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenericApiResponse listMetricsKeysUsingGET1(Long appId) throws ApiException {
        ApiResponse<GenericApiResponse> resp = listMetricsKeysUsingGET1WithHttpInfo(appId);
        return resp.getData();
    }

    /**
     * Get metrics keys for an app
     * 
     * @param appId appId (required)
     * @return ApiResponse&lt;GenericApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenericApiResponse> listMetricsKeysUsingGET1WithHttpInfo(Long appId) throws ApiException {
        com.squareup.okhttp.Call call = listMetricsKeysUsingGET1ValidateBeforeCall(appId, null, null);
        Type localVarReturnType = new TypeToken<GenericApiResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get metrics keys for an app (asynchronously)
     * 
     * @param appId appId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listMetricsKeysUsingGET1Async(Long appId, final ApiCallback<GenericApiResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listMetricsKeysUsingGET1ValidateBeforeCall(appId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericApiResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listMetricsUsingGET1
     * @param appId appId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listMetricsUsingGET1Call(Long appId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/spm-reports/api/v3/apps/{appId}/metrics"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listMetricsUsingGET1ValidateBeforeCall(Long appId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling listMetricsUsingGET1(Async)");
        }
        

        com.squareup.okhttp.Call call = listMetricsUsingGET1Call(appId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get metrics info for an app
     * 
     * @param appId appId (required)
     * @return GenericApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenericApiResponse listMetricsUsingGET1(Long appId) throws ApiException {
        ApiResponse<GenericApiResponse> resp = listMetricsUsingGET1WithHttpInfo(appId);
        return resp.getData();
    }

    /**
     * Get metrics info for an app
     * 
     * @param appId appId (required)
     * @return ApiResponse&lt;GenericApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenericApiResponse> listMetricsUsingGET1WithHttpInfo(Long appId) throws ApiException {
        com.squareup.okhttp.Call call = listMetricsUsingGET1ValidateBeforeCall(appId, null, null);
        Type localVarReturnType = new TypeToken<GenericApiResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get metrics info for an app (asynchronously)
     * 
     * @param appId appId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listMetricsUsingGET1Async(Long appId, final ApiCallback<GenericApiResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listMetricsUsingGET1ValidateBeforeCall(appId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericApiResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
