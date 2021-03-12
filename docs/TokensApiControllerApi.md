# TokensApiControllerApi

All URIs are relative to */*

| Method                                                                   | HTTP request                                                        | Description                               |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------- | ----------------------------------------- |
| [**createAppToken**](TokensApiControllerApi.md#createAppToken)           | **POST** /users-web/api/v3/apps/{appId}/tokens                      | Create new app token                      |
| [**deleteAppToken1**](TokensApiControllerApi.md#deleteAppToken1)         | **DELETE** /users-web/api/v3/apps/{appId}/tokens/{tokenId}          | Delete app token                          |
| [**getAppTokens1**](TokensApiControllerApi.md#getAppTokens1)             | **GET** /users-web/api/v3/apps/{appId}/tokens                       | Get app available tokens                  |
| [**regenerateAppToken1**](TokensApiControllerApi.md#regenerateAppToken1) | **POST** /users-web/api/v3/apps/{appId}/tokens/{tokenId}/regenerate | Regenerate app token)                     |
| [**updateAppToken**](TokensApiControllerApi.md#updateAppToken)           | **PUT** /users-web/api/v3/apps/{appId}/tokens/{tokenId}             | Update app token (enable/disable or name) |

<a name="createAppToken"></a>
# **createAppToken**
> TokenResponse createAppToken(body, appId)

Create new app token

### Example
```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.TokensApiControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TokensApiControllerApi apiInstance = new TokensApiControllerApi();
CreateTokenDto body = new CreateTokenDto(); // CreateTokenDto | dto
Long appId = 789L; // Long | appId
try {
    TokenResponse result = apiInstance.createAppToken(body, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApiControllerApi#createAppToken");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type                                    | Description | Notes |
| --------- | --------------------------------------- | ----------- | ----- |
| **body**  | [**CreateTokenDto**](CreateTokenDto.md) | dto         |
| **appId** | **Long**                                | appId       |

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAppToken1"></a>
# **deleteAppToken1**
> GenericMapBasedApiResponse deleteAppToken1(appId, tokenId)

Delete app token

### Example
```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.TokensApiControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TokensApiControllerApi apiInstance = new TokensApiControllerApi();
Long appId = 789L; // Long | appId
Long tokenId = 789L; // Long | tokenId
try {
    GenericMapBasedApiResponse result = apiInstance.deleteAppToken1(appId, tokenId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApiControllerApi#deleteAppToken1");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type     | Description | Notes |
| ----------- | -------- | ----------- | ----- |
| **appId**   | **Long** | appId       |
| **tokenId** | **Long** | tokenId     |

### Return type

[**GenericMapBasedApiResponse**](GenericMapBasedApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAppTokens1"></a>
# **getAppTokens1**
> TokensResponse getAppTokens1(appId)

Get app available tokens

### Example
```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.TokensApiControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TokensApiControllerApi apiInstance = new TokensApiControllerApi();
Long appId = 789L; // Long | appId
try {
    TokensResponse result = apiInstance.getAppTokens1(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApiControllerApi#getAppTokens1");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type     | Description | Notes |
| --------- | -------- | ----------- | ----- |
| **appId** | **Long** | appId       |

### Return type

[**TokensResponse**](TokensResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="regenerateAppToken1"></a>
# **regenerateAppToken1**
> TokenResponse regenerateAppToken1(appId, tokenId)

Regenerate app token)

### Example
```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.TokensApiControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TokensApiControllerApi apiInstance = new TokensApiControllerApi();
Long appId = 789L; // Long | appId
Long tokenId = 789L; // Long | tokenId
try {
    TokenResponse result = apiInstance.regenerateAppToken1(appId, tokenId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApiControllerApi#regenerateAppToken1");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type     | Description | Notes |
| ----------- | -------- | ----------- | ----- |
| **appId**   | **Long** | appId       |
| **tokenId** | **Long** | tokenId     |

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAppToken"></a>
# **updateAppToken**
> TokenResponse updateAppToken(body, appId, tokenId)

Update app token (enable/disable or name)

### Example
```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.TokensApiControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TokensApiControllerApi apiInstance = new TokensApiControllerApi();
UpdateTokenDto body = new UpdateTokenDto(); // UpdateTokenDto | dto
Long appId = 789L; // Long | appId
Long tokenId = 789L; // Long | tokenId
try {
    TokenResponse result = apiInstance.updateAppToken(body, appId, tokenId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApiControllerApi#updateAppToken");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                    | Description | Notes |
| ----------- | --------------------------------------- | ----------- | ----- |
| **body**    | [**UpdateTokenDto**](UpdateTokenDto.md) | dto         |
| **appId**   | **Long**                                | appId       |
| **tokenId** | **Long**                                | tokenId     |

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
