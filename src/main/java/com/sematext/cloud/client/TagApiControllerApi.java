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


import com.sematext.cloud.model.Dimension;
import com.sematext.cloud.model.TagNamesResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TagApiControllerApi {
    private ApiClient apiClient;

    public TagApiControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TagApiControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getTagNamesUsingGET
     * @param appIds appIds (required)
     * @param from from (optional)
     * @param to to (optional)
     * @param metrics metrics (optional, default to true)
     * @param logs logs (optional, default to true)
     * @param events events (optional, default to false)
     * @param rum rum (optional, default to true)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTagNamesUsingGETCall(String appIds, Long from, Long to, Boolean metrics, Boolean logs, Boolean events, Boolean rum, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/spm-reports/api/v3/apps/{appIds}/tagNames"
            .replaceAll("\\{" + "appIds" + "\\}", apiClient.escapeString(appIds.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (from != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("from", from));
        if (to != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("to", to));
        if (metrics != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("metrics", metrics));
        if (logs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("logs", logs));
        if (events != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("events", events));
        if (rum != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("rum", rum));

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
    private com.squareup.okhttp.Call getTagNamesUsingGETValidateBeforeCall(String appIds, Long from, Long to, Boolean metrics, Boolean logs, Boolean events, Boolean rum, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'appIds' is set
        if (appIds == null) {
            throw new ApiException("Missing the required parameter 'appIds' when calling getTagNamesUsingGET(Async)");
        }
        
        com.squareup.okhttp.Call call = getTagNamesUsingGETCall(appIds, from, to, metrics, logs, events, rum, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets tag names for the given application identifiers appearing in the given time frame.
     * 
     * @param appIds appIds (required)
     * @param from from (optional)
     * @param to to (optional)
     * @param metrics metrics (optional, default to true)
     * @param logs logs (optional, default to true)
     * @param events events (optional, default to false)
     * @param rum rum (optional, default to true)
     * @return TagNamesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TagNamesResponse getTagNamesUsingGET(String appIds, Long from, Long to, Boolean metrics, Boolean logs, Boolean events, Boolean rum) throws ApiException {
        ApiResponse<TagNamesResponse> resp = getTagNamesUsingGETWithHttpInfo(appIds, from, to, metrics, logs, events, rum);
        return resp.getData();
    }

    /**
     * Gets tag names for the given application identifiers appearing in the given time frame.
     * 
     * @param appIds appIds (required)
     * @param from from (optional)
     * @param to to (optional)
     * @param metrics metrics (optional, default to true)
     * @param logs logs (optional, default to true)
     * @param events events (optional, default to false)
     * @param rum rum (optional, default to true)
     * @return ApiResponse&lt;TagNamesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TagNamesResponse> getTagNamesUsingGETWithHttpInfo(String appIds, Long from, Long to, Boolean metrics, Boolean logs, Boolean events, Boolean rum) throws ApiException {
        com.squareup.okhttp.Call call = getTagNamesUsingGETValidateBeforeCall(appIds, from, to, metrics, logs, events, rum, null, null);
        Type localVarReturnType = new TypeToken<TagNamesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets tag names for the given application identifiers appearing in the given time frame. (asynchronously)
     * 
     * @param appIds appIds (required)
     * @param from from (optional)
     * @param to to (optional)
     * @param metrics metrics (optional, default to true)
     * @param logs logs (optional, default to true)
     * @param events events (optional, default to false)
     * @param rum rum (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTagNamesUsingGETAsync(String appIds, Long from, Long to, Boolean metrics, Boolean logs, Boolean events, Boolean rum, final ApiCallback<TagNamesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTagNamesUsingGETValidateBeforeCall(appIds, from, to, metrics, logs, events, rum, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TagNamesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUsingGET2
     * @param appIds appIds (required)
     * @param tag tag (required)
     * @param from from (optional)
     * @param to to (optional)
     * @param metrics metrics (optional, default to true)
     * @param logs logs (optional, default to true)
     * @param events events (optional, default to false)
     * @param rum rum (optional, default to true)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUsingGET2Call(String appIds, List<String> tag, Long from, Long to, Boolean metrics, Boolean logs, Boolean events, Boolean rum, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/spm-reports/api/v3/apps/{appIds}/metrics/filters"
            .replaceAll("\\{" + "appIds" + "\\}", apiClient.escapeString(appIds.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (from != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("from", from));
        if (to != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("to", to));
        if (tag != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "tag", tag));
        if (metrics != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("metrics", metrics));
        if (logs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("logs", logs));
        if (events != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("events", events));
        if (rum != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("rum", rum));

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
    private com.squareup.okhttp.Call getUsingGET2ValidateBeforeCall(String appIds, List<String> tag, Long from, Long to, Boolean metrics, Boolean logs, Boolean events, Boolean rum, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'appIds' is set
        if (appIds == null) {
            throw new ApiException("Missing the required parameter 'appIds' when calling getUsingGET2(Async)");
        }
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getUsingGET2(Async)");
        }
        
        com.squareup.okhttp.Call call = getUsingGET2Call(appIds, tag, from, to, metrics, logs, events, rum, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets values for specified tags for the given application identifiers appearing in the given time frame.
     * 
     * @param appIds appIds (required)
     * @param tag tag (required)
     * @param from from (optional)
     * @param to to (optional)
     * @param metrics metrics (optional, default to true)
     * @param logs logs (optional, default to true)
     * @param events events (optional, default to false)
     * @param rum rum (optional, default to true)
     * @return Map&lt;String, Dimension&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Map<String, Dimension> getUsingGET2(String appIds, List<String> tag, Long from, Long to, Boolean metrics, Boolean logs, Boolean events, Boolean rum) throws ApiException {
        ApiResponse<Map<String, Dimension>> resp = getUsingGET2WithHttpInfo(appIds, tag, from, to, metrics, logs, events, rum);
        return resp.getData();
    }

    /**
     * Gets values for specified tags for the given application identifiers appearing in the given time frame.
     * 
     * @param appIds appIds (required)
     * @param tag tag (required)
     * @param from from (optional)
     * @param to to (optional)
     * @param metrics metrics (optional, default to true)
     * @param logs logs (optional, default to true)
     * @param events events (optional, default to false)
     * @param rum rum (optional, default to true)
     * @return ApiResponse&lt;Map&lt;String, Dimension&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Map<String, Dimension>> getUsingGET2WithHttpInfo(String appIds, List<String> tag, Long from, Long to, Boolean metrics, Boolean logs, Boolean events, Boolean rum) throws ApiException {
        com.squareup.okhttp.Call call = getUsingGET2ValidateBeforeCall(appIds, tag, from, to, metrics, logs, events, rum, null, null);
        Type localVarReturnType = new TypeToken<Map<String, Dimension>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets values for specified tags for the given application identifiers appearing in the given time frame. (asynchronously)
     * 
     * @param appIds appIds (required)
     * @param tag tag (required)
     * @param from from (optional)
     * @param to to (optional)
     * @param metrics metrics (optional, default to true)
     * @param logs logs (optional, default to true)
     * @param events events (optional, default to false)
     * @param rum rum (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUsingGET2Async(String appIds, List<String> tag, Long from, Long to, Boolean metrics, Boolean logs, Boolean events, Boolean rum, final ApiCallback<Map<String, Dimension>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUsingGET2ValidateBeforeCall(appIds, tag, from, to, metrics, logs, events, rum, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Map<String, Dimension>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUsingGET3
     * @param appIds appIds (required)
     * @param tag tag (required)
     * @param from from (optional)
     * @param to to (optional)
     * @param metrics metrics (optional, default to true)
     * @param logs logs (optional, default to true)
     * @param events events (optional, default to false)
     * @param rum rum (optional, default to true)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUsingGET3Call(String appIds, List<String> tag, Long from, Long to, Boolean metrics, Boolean logs, Boolean events, Boolean rum, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/spm-reports/api/v3/apps/{appIds}/tags"
            .replaceAll("\\{" + "appIds" + "\\}", apiClient.escapeString(appIds.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (from != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("from", from));
        if (to != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("to", to));
        if (tag != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "tag", tag));
        if (metrics != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("metrics", metrics));
        if (logs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("logs", logs));
        if (events != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("events", events));
        if (rum != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("rum", rum));

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
    private com.squareup.okhttp.Call getUsingGET3ValidateBeforeCall(String appIds, List<String> tag, Long from, Long to, Boolean metrics, Boolean logs, Boolean events, Boolean rum, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'appIds' is set
        if (appIds == null) {
            throw new ApiException("Missing the required parameter 'appIds' when calling getUsingGET3(Async)");
        }
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getUsingGET3(Async)");
        }
        
        com.squareup.okhttp.Call call = getUsingGET3Call(appIds, tag, from, to, metrics, logs, events, rum, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets values for specified tags for the given application identifiers appearing in the given time frame.
     * 
     * @param appIds appIds (required)
     * @param tag tag (required)
     * @param from from (optional)
     * @param to to (optional)
     * @param metrics metrics (optional, default to true)
     * @param logs logs (optional, default to true)
     * @param events events (optional, default to false)
     * @param rum rum (optional, default to true)
     * @return Map&lt;String, Dimension&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Map<String, Dimension> getUsingGET3(String appIds, List<String> tag, Long from, Long to, Boolean metrics, Boolean logs, Boolean events, Boolean rum) throws ApiException {
        ApiResponse<Map<String, Dimension>> resp = getUsingGET3WithHttpInfo(appIds, tag, from, to, metrics, logs, events, rum);
        return resp.getData();
    }

    /**
     * Gets values for specified tags for the given application identifiers appearing in the given time frame.
     * 
     * @param appIds appIds (required)
     * @param tag tag (required)
     * @param from from (optional)
     * @param to to (optional)
     * @param metrics metrics (optional, default to true)
     * @param logs logs (optional, default to true)
     * @param events events (optional, default to false)
     * @param rum rum (optional, default to true)
     * @return ApiResponse&lt;Map&lt;String, Dimension&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Map<String, Dimension>> getUsingGET3WithHttpInfo(String appIds, List<String> tag, Long from, Long to, Boolean metrics, Boolean logs, Boolean events, Boolean rum) throws ApiException {
        com.squareup.okhttp.Call call = getUsingGET3ValidateBeforeCall(appIds, tag, from, to, metrics, logs, events, rum, null, null);
        Type localVarReturnType = new TypeToken<Map<String, Dimension>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets values for specified tags for the given application identifiers appearing in the given time frame. (asynchronously)
     * 
     * @param appIds appIds (required)
     * @param tag tag (required)
     * @param from from (optional)
     * @param to to (optional)
     * @param metrics metrics (optional, default to true)
     * @param logs logs (optional, default to true)
     * @param events events (optional, default to false)
     * @param rum rum (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUsingGET3Async(String appIds, List<String> tag, Long from, Long to, Boolean metrics, Boolean logs, Boolean events, Boolean rum, final ApiCallback<Map<String, Dimension>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUsingGET3ValidateBeforeCall(appIds, tag, from, to, metrics, logs, events, rum, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Map<String, Dimension>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
