# TokensApiControllerApi

All URIs are relative to *https://localhost*

| Method                                                                 | HTTP request                                                        | Description                       |
| ---------------------------------------------------------------------- | ------------------------------------------------------------------- | --------------------------------- |
| [**createAppToken**](TokensApiControllerApi.md#createAppToken)         | **POST** /users-web/api/v3/apps/{appId}/tokens                      | Create new app token              |
| [**deleteAppToken1**](TokensApiControllerApi.md#deleteAppToken1)       | **DELETE** /users-web/api/v3/apps/{appId}/tokens/{tokenId}          | Delete app token                  |
| [**getAppTokens1**](TokensApiControllerApi.md#getAppTokens1)           | **GET** /users-web/api/v3/apps/{appId}/tokens                       | Get app available tokens          |
| [**regenerateAppToken**](TokensApiControllerApi.md#regenerateAppToken) | **POST** /users-web/api/v3/apps/{appId}/tokens/{tokenId}/regenerate | Regenerate app token)             |
| [**updateAppToken1**](TokensApiControllerApi.md#updateAppToken1)       | **PUT** /users-web/api/v3/apps/{appId}/tokens/{tokenId}             | Update app token (enable/disable) |


<a name="createAppToken"></a>
# **createAppToken**
> GenericApiResponse createAppToken(appId, dto)

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
    GenericApiResponse result = apiInstance.createAppToken(appId, dto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApiControllerApi#createAppToken");
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

<a name="getAppTokens1"></a>
# **getAppTokens1**
> GenericApiResponse getAppTokens1(appId)

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
    GenericApiResponse result = apiInstance.getAppTokens1(appId);
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

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="regenerateAppToken"></a>
# **regenerateAppToken**
> GenericApiResponse regenerateAppToken(appId, tokenId)

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
    GenericApiResponse result = apiInstance.regenerateAppToken(appId, tokenId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApiControllerApi#regenerateAppToken");
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

<a name="updateAppToken1"></a>
# **updateAppToken1**
> GenericApiResponse updateAppToken1(appId, tokenId, dto)

Update app token (enable/disable)

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
    GenericApiResponse result = apiInstance.updateAppToken1(appId, tokenId, dto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApiControllerApi#updateAppToken1");
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
