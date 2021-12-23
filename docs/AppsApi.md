# AppsApi

All URIs are relative to */*

| Method                                                                  | HTTP request                                               | Description                                                        |
| ----------------------------------------------------------------------- | ---------------------------------------------------------- | ------------------------------------------------------------------ |
| [**deleteUsingDELETE**](AppsApi.md#deleteUsingDELETE)                   | **DELETE** /users-web/api/v3/apps/{anyStateAppId}          | delete                                                             |
| [**getAppTypesUsingGET**](AppsApi.md#getAppTypesUsingGET)               | **GET** /users-web/api/v3/apps/types                       | Get all App types supported for the account identified with apiKey |
| [**getUsingGET**](AppsApi.md#getUsingGET)                               | **GET** /users-web/api/v3/apps/{anyStateAppId}             | Gets defails for one particular App                                |
| [**inviteAppGuestsUsingPOST**](AppsApi.md#inviteAppGuestsUsingPOST)     | **POST** /users-web/api/v3/apps/guests                     | Invite guests to an app                                            |
| [**listAppsUsersUsingGET**](AppsApi.md#listAppsUsersUsingGET)           | **GET** /users-web/api/v3/apps/users                       | Get all users of apps accessible to this account                   |
| [**listUsingGET**](AppsApi.md#listUsingGET)                             | **GET** /users-web/api/v3/apps                             | Get all apps accessible by account identified with apiKey          |
| [**updateDescriptionUsingPUT1**](AppsApi.md#updateDescriptionUsingPUT1) | **PUT** /users-web/api/v3/apps/{anyStateAppId}/description | Update description of the app                                      |
| [**updateUsingPUT2**](AppsApi.md#updateUsingPUT2)                       | **PUT** /users-web/api/v3/apps/{anyStateAppId}             | Update app                                                         |

<a name="deleteUsingDELETE"></a>

# **deleteUsingDELETE**

> GenericMapBasedApiResponse deleteUsingDELETE(anyStateAppId)

delete

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AppsApi apiInstance = new AppsApi();
Long anyStateAppId = 789L; // Long | anyStateAppId
try {
    GenericMapBasedApiResponse result = apiInstance.deleteUsingDELETE(anyStateAppId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type     | Description   | Notes |
| ----------------- | -------- | ------------- | ----- |
| **anyStateAppId** | **Long** | anyStateAppId |

### Return type

[**GenericMapBasedApiResponse**](GenericMapBasedApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getAppTypesUsingGET"></a>

# **getAppTypesUsingGET**

> AppTypesResponse getAppTypesUsingGET()

Get all App types supported for the account identified with apiKey

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AppsApi apiInstance = new AppsApi();
try {
    AppTypesResponse result = apiInstance.getAppTypesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#getAppTypesUsingGET");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AppTypesResponse**](AppTypesResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getUsingGET"></a>

# **getUsingGET**

> AppResponse getUsingGET(anyStateAppId)

Gets defails for one particular App

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AppsApi apiInstance = new AppsApi();
Long anyStateAppId = 789L; // Long | anyStateAppId
try {
    AppResponse result = apiInstance.getUsingGET(anyStateAppId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#getUsingGET");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type     | Description   | Notes |
| ----------------- | -------- | ------------- | ----- |
| **anyStateAppId** | **Long** | anyStateAppId |

### Return type

[**AppResponse**](AppResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="inviteAppGuestsUsingPOST"></a>

# **inviteAppGuestsUsingPOST**

> GenericMapBasedApiResponse inviteAppGuestsUsingPOST(body)

Invite guests to an app

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AppsApi apiInstance = new AppsApi();
Invitation body = new Invitation(); // Invitation | For `app` and `apps` fields only `id` needs to be populated.Other fields can be left empty or with default values
try {
    GenericMapBasedApiResponse result = apiInstance.inviteAppGuestsUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#inviteAppGuestsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                            | Description                                                                                                                                     | Notes |
| -------- | ------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----- |
| **body** | [**Invitation**](Invitation.md) | For &#x60;app&#x60; and &#x60;apps&#x60; fields only &#x60;id&#x60; needs to be populated.Other fields can be left empty or with default values |

### Return type

[**GenericMapBasedApiResponse**](GenericMapBasedApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="listAppsUsersUsingGET"></a>

# **listAppsUsersUsingGET**

> AppsResponse listAppsUsersUsingGET()

Get all users of apps accessible to this account

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AppsApi apiInstance = new AppsApi();
try {
    AppsResponse result = apiInstance.listAppsUsersUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#listAppsUsersUsingGET");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AppsResponse**](AppsResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listUsingGET"></a>

# **listUsingGET**

> AppsResponse listUsingGET()

Get all apps accessible by account identified with apiKey

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AppsApi apiInstance = new AppsApi();
try {
    AppsResponse result = apiInstance.listUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#listUsingGET");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AppsResponse**](AppsResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateDescriptionUsingPUT1"></a>

# **updateDescriptionUsingPUT1**

> AppResponse updateDescriptionUsingPUT1(anyStateAppId, body)

Update description of the app

App can be in any state

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AppsApi apiInstance = new AppsApi();
Long anyStateAppId = 789L; // Long | App Id
AppDescription body = new AppDescription(); // AppDescription | Update Details
try {
    AppResponse result = apiInstance.updateDescriptionUsingPUT1(anyStateAppId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#updateDescriptionUsingPUT1");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type                                    | Description    | Notes      |
| ----------------- | --------------------------------------- | -------------- | ---------- |
| **anyStateAppId** | **Long**                                | App Id         |
| **body**          | [**AppDescription**](AppDescription.md) | Update Details | [optional] |

### Return type

[**AppResponse**](AppResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="updateUsingPUT2"></a>

# **updateUsingPUT2**

> AppResponse updateUsingPUT2(body, anyStateAppId)

Update app

App can be in any state

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AppsApi apiInstance = new AppsApi();
UpdateAppInfo body = new UpdateAppInfo(); // UpdateAppInfo | dto
Long anyStateAppId = 789L; // Long | App Id
try {
    AppResponse result = apiInstance.updateUsingPUT2(body, anyStateAppId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#updateUsingPUT2");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type                                  | Description | Notes |
| ----------------- | ------------------------------------- | ----------- | ----- |
| **body**          | [**UpdateAppInfo**](UpdateAppInfo.md) | dto         |
| **anyStateAppId** | **Long**                              | App Id      |

### Return type

[**AppResponse**](AppResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json
