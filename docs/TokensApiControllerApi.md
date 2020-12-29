# TokensApiControllerApi

All URIs are relative to *https://localhost*

| Method                                                                   | HTTP request                                                        | Description                               |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------- | ----------------------------------------- |
| [**createAppToken1**](TokensApiControllerApi.md#createAppToken1)         | **POST** /users-web/api/v3/apps/{appId}/tokens                      | Create new app token                      |
| [**deleteAppToken1**](TokensApiControllerApi.md#deleteAppToken1)         | **DELETE** /users-web/api/v3/apps/{appId}/tokens/{tokenId}          | Delete app token                          |
| [**getAppTokens**](TokensApiControllerApi.md#getAppTokens)               | **GET** /users-web/api/v3/apps/{appId}/tokens                       | Get app available tokens                  |
| [**regenerateAppToken1**](TokensApiControllerApi.md#regenerateAppToken1) | **POST** /users-web/api/v3/apps/{appId}/tokens/{tokenId}/regenerate | Regenerate app token)                     |
| [**updateAppToken**](TokensApiControllerApi.md#updateAppToken)           | **PUT** /users-web/api/v3/apps/{appId}/tokens/{tokenId}             | Update app token (enable/disable or name) |


<a name="createAppToken1"></a>
# **createAppToken1**
> GenericApiResponse createAppToken1(appId, dto)

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
Long appId = 789L; // Long | appId
CreateTokenDto dto = new CreateTokenDto(); // CreateTokenDto | dto
try {
    GenericApiResponse result = apiInstance.createAppToken1(appId, dto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApiControllerApi#createAppToken1");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type                                    | Description | Notes |
| --------- | --------------------------------------- | ----------- | ----- |
| **appId** | **Long**                                | appId       |
| **dto**   | [**CreateTokenDto**](CreateTokenDto.md) | dto         |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAppToken1"></a>
# **deleteAppToken1**
> GenericApiResponse deleteAppToken1(appId, tokenId)

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
    GenericApiResponse result = apiInstance.deleteAppToken1(appId, tokenId);
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

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAppTokens"></a>
# **getAppTokens**
> GenericApiResponse getAppTokens(appId)

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
    GenericApiResponse result = apiInstance.getAppTokens(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApiControllerApi#getAppTokens");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type     | Description | Notes |
| --------- | -------- | ----------- | ----- |
| **appId** | **Long** | appId       |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="regenerateAppToken1"></a>
# **regenerateAppToken1**
> GenericApiResponse regenerateAppToken1(appId, tokenId)

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
    GenericApiResponse result = apiInstance.regenerateAppToken1(appId, tokenId);
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

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAppToken"></a>
# **updateAppToken**
> GenericApiResponse updateAppToken(appId, tokenId, dto)

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
Long appId = 789L; // Long | appId
Long tokenId = 789L; // Long | tokenId
UpdateTokenDto dto = new UpdateTokenDto(); // UpdateTokenDto | dto
try {
    GenericApiResponse result = apiInstance.updateAppToken(appId, tokenId, dto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApiControllerApi#updateAppToken");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                    | Description | Notes |
| ----------- | --------------------------------------- | ----------- | ----- |
| **appId**   | **Long**                                | appId       |
| **tokenId** | **Long**                                | tokenId     |
| **dto**     | [**UpdateTokenDto**](UpdateTokenDto.md) | dto         |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
