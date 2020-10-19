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

import com.sematext.cloud.model.CreateTokenDto;
import com.sematext.cloud.model.GenericApiResponse;
import com.sematext.cloud.model.UpdateTokenDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TokensApiControllerApi {
    private ApiClient apiClient;

    public TokensApiControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TokensApiControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createAppToken
     * 
     * @param appId                   appId (required)
     * @param dto                     dto (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createAppTokenCall(Long appId, CreateTokenDto dto,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = dto;

        // create path and map variables
        String localVarPath = "/users-web/api/v3/apps/{appId}/tokens".replaceAll("\\{" + "appId" + "\\}",
                apiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
                        throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private com.squareup.okhttp.Call createAppTokenValidateBeforeCall(Long appId, CreateTokenDto dto,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling createAppToken(Async)");
        }

        // verify the required parameter 'dto' is set
        if (dto == null) {
            throw new ApiException("Missing the required parameter 'dto' when calling createAppToken(Async)");
        }

        com.squareup.okhttp.Call call = createAppTokenCall(appId, dto, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create new app token
     *
     * @param appId appId (required)
     * @param dto   dto (required)
     * @return GenericApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
     */
    public GenericApiResponse createAppToken(Long appId, CreateTokenDto dto) throws ApiException {
        ApiResponse<GenericApiResponse> resp = createAppTokenWithHttpInfo(appId, dto);
        return resp.getData();
    }

    /**
     * Create new app token
     *
     * @param appId appId (required)
     * @param dto   dto (required)
     * @return ApiResponse&lt;GenericApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
     */
    public ApiResponse<GenericApiResponse> createAppTokenWithHttpInfo(Long appId, CreateTokenDto dto)
            throws ApiException {
        com.squareup.okhttp.Call call = createAppTokenValidateBeforeCall(appId, dto, null, null);
        Type localVarReturnType = new TypeToken<GenericApiResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create new app token (asynchronously)
     *
     * @param appId    appId (required)
     * @param dto      dto (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *                      request body object
     */
    public com.squareup.okhttp.Call createAppTokenAsync(Long appId, CreateTokenDto dto,
            final ApiCallback<GenericApiResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createAppTokenValidateBeforeCall(appId, dto, progressListener,
                progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericApiResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for deleteAppToken1
     * 
     * @param appId                   appId (required)
     * @param tokenId                 tokenId (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteAppToken1Call(Long appId, Long tokenId,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users-web/api/v3/apps/{appId}/tokens/{tokenId}"
                .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
                .replaceAll("\\{" + "tokenId" + "\\}", apiClient.escapeString(tokenId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
                        throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private com.squareup.okhttp.Call deleteAppToken1ValidateBeforeCall(Long appId, Long tokenId,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling deleteAppToken1(Async)");
        }

        // verify the required parameter 'tokenId' is set
        if (tokenId == null) {
            throw new ApiException("Missing the required parameter 'tokenId' when calling deleteAppToken1(Async)");
        }

        com.squareup.okhttp.Call call = deleteAppToken1Call(appId, tokenId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete app token
     *
     * @param appId   appId (required)
     * @param tokenId tokenId (required)
     * @return GenericApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
     */
    public GenericApiResponse deleteAppToken1(Long appId, Long tokenId) throws ApiException {
        ApiResponse<GenericApiResponse> resp = deleteAppToken1WithHttpInfo(appId, tokenId);
        return resp.getData();
    }

    /**
     * Delete app token
     *
     * @param appId   appId (required)
     * @param tokenId tokenId (required)
     * @return ApiResponse&lt;GenericApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
     */
    public ApiResponse<GenericApiResponse> deleteAppToken1WithHttpInfo(Long appId, Long tokenId) throws ApiException {
        com.squareup.okhttp.Call call = deleteAppToken1ValidateBeforeCall(appId, tokenId, null, null);
        Type localVarReturnType = new TypeToken<GenericApiResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete app token (asynchronously)
     *
     * @param appId    appId (required)
     * @param tokenId  tokenId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *                      request body object
     */
    public com.squareup.okhttp.Call deleteAppToken1Async(Long appId, Long tokenId,
            final ApiCallback<GenericApiResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteAppToken1ValidateBeforeCall(appId, tokenId, progressListener,
                progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericApiResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getAppTokens1
     * 
     * @param appId                   appId (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAppTokens1Call(Long appId,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users-web/api/v3/apps/{appId}/tokens".replaceAll("\\{" + "appId" + "\\}",
                apiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
                        throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private com.squareup.okhttp.Call getAppTokens1ValidateBeforeCall(Long appId,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getAppTokens1(Async)");
        }

        com.squareup.okhttp.Call call = getAppTokens1Call(appId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get app available tokens
     *
     * @param appId appId (required)
     * @return GenericApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
     */
    public GenericApiResponse getAppTokens1(Long appId) throws ApiException {
        ApiResponse<GenericApiResponse> resp = getAppTokens1WithHttpInfo(appId);
        return resp.getData();
    }

    /**
     * Get app available tokens
     *
     * @param appId appId (required)
     * @return ApiResponse&lt;GenericApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
     */
    public ApiResponse<GenericApiResponse> getAppTokens1WithHttpInfo(Long appId) throws ApiException {
        com.squareup.okhttp.Call call = getAppTokens1ValidateBeforeCall(appId, null, null);
        Type localVarReturnType = new TypeToken<GenericApiResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get app available tokens (asynchronously)
     *
     * @param appId    appId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *                      request body object
     */
    public com.squareup.okhttp.Call getAppTokens1Async(Long appId, final ApiCallback<GenericApiResponse> callback)
            throws ApiException {

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

        com.squareup.okhttp.Call call = getAppTokens1ValidateBeforeCall(appId, progressListener,
                progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericApiResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for regenerateAppToken
     * 
     * @param appId                   appId (required)
     * @param tokenId                 tokenId (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call regenerateAppTokenCall(Long appId, Long tokenId,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users-web/api/v3/apps/{appId}/tokens/{tokenId}/regenerate"
                .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
                .replaceAll("\\{" + "tokenId" + "\\}", apiClient.escapeString(tokenId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
                        throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private com.squareup.okhttp.Call regenerateAppTokenValidateBeforeCall(Long appId, Long tokenId,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling regenerateAppToken(Async)");
        }

        // verify the required parameter 'tokenId' is set
        if (tokenId == null) {
            throw new ApiException("Missing the required parameter 'tokenId' when calling regenerateAppToken(Async)");
        }

        com.squareup.okhttp.Call call = regenerateAppTokenCall(appId, tokenId, progressListener,
                progressRequestListener);
        return call;

    }

    /**
     * Regenerate app token)
     *
     * @param appId   appId (required)
     * @param tokenId tokenId (required)
     * @return GenericApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
     */
    public GenericApiResponse regenerateAppToken(Long appId, Long tokenId) throws ApiException {
        ApiResponse<GenericApiResponse> resp = regenerateAppTokenWithHttpInfo(appId, tokenId);
        return resp.getData();
    }

    /**
     * Regenerate app token)
     *
     * @param appId   appId (required)
     * @param tokenId tokenId (required)
     * @return ApiResponse&lt;GenericApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
     */
    public ApiResponse<GenericApiResponse> regenerateAppTokenWithHttpInfo(Long appId, Long tokenId)
            throws ApiException {
        com.squareup.okhttp.Call call = regenerateAppTokenValidateBeforeCall(appId, tokenId, null, null);
        Type localVarReturnType = new TypeToken<GenericApiResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Regenerate app token) (asynchronously)
     *
     * @param appId    appId (required)
     * @param tokenId  tokenId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *                      request body object
     */
    public com.squareup.okhttp.Call regenerateAppTokenAsync(Long appId, Long tokenId,
            final ApiCallback<GenericApiResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = regenerateAppTokenValidateBeforeCall(appId, tokenId, progressListener,
                progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericApiResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for updateAppToken1
     * 
     * @param appId                   appId (required)
     * @param tokenId                 tokenId (required)
     * @param dto                     dto (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateAppToken1Call(Long appId, Long tokenId, UpdateTokenDto dto,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = dto;

        // create path and map variables
        String localVarPath = "/users-web/api/v3/apps/{appId}/tokens/{tokenId}"
                .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
                .replaceAll("\\{" + "tokenId" + "\\}", apiClient.escapeString(tokenId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
                        throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private com.squareup.okhttp.Call updateAppToken1ValidateBeforeCall(Long appId, Long tokenId, UpdateTokenDto dto,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling updateAppToken1(Async)");
        }

        // verify the required parameter 'tokenId' is set
        if (tokenId == null) {
            throw new ApiException("Missing the required parameter 'tokenId' when calling updateAppToken1(Async)");
        }

        // verify the required parameter 'dto' is set
        if (dto == null) {
            throw new ApiException("Missing the required parameter 'dto' when calling updateAppToken1(Async)");
        }

        com.squareup.okhttp.Call call = updateAppToken1Call(appId, tokenId, dto, progressListener,
                progressRequestListener);
        return call;

    }

    /**
     * Update app token (enable/disable)
     *
     * @param appId   appId (required)
     * @param tokenId tokenId (required)
     * @param dto     dto (required)
     * @return GenericApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
     */
    public GenericApiResponse updateAppToken1(Long appId, Long tokenId, UpdateTokenDto dto) throws ApiException {
        ApiResponse<GenericApiResponse> resp = updateAppToken1WithHttpInfo(appId, tokenId, dto);
        return resp.getData();
    }

    /**
     * Update app token (enable/disable)
     *
     * @param appId   appId (required)
     * @param tokenId tokenId (required)
     * @param dto     dto (required)
     * @return ApiResponse&lt;GenericApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
     */
    public ApiResponse<GenericApiResponse> updateAppToken1WithHttpInfo(Long appId, Long tokenId, UpdateTokenDto dto)
            throws ApiException {
        com.squareup.okhttp.Call call = updateAppToken1ValidateBeforeCall(appId, tokenId, dto, null, null);
        Type localVarReturnType = new TypeToken<GenericApiResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update app token (enable/disable) (asynchronously)
     *
     * @param appId    appId (required)
     * @param tokenId  tokenId (required)
     * @param dto      dto (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *                      request body object
     */
    public com.squareup.okhttp.Call updateAppToken1Async(Long appId, Long tokenId, UpdateTokenDto dto,
            final ApiCallback<GenericApiResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateAppToken1ValidateBeforeCall(appId, tokenId, dto, progressListener,
                progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericApiResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
