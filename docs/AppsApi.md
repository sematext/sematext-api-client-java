# AppsApi

All URIs are relative to *https://localhost*

| Method                                                                  | HTTP request                                               | Description                                                        |
| ----------------------------------------------------------------------- | ---------------------------------------------------------- | ------------------------------------------------------------------ |
| [**getAppTypesUsingGET**](AppsApi.md#getAppTypesUsingGET)               | **GET** /users-web/api/v3/apps/types                       | Get all App types supported for the account identified with apiKey |
| [**getUsingGET**](AppsApi.md#getUsingGET)                               | **GET** /users-web/api/v3/apps/{anyStateAppId}             | Gets defails for one particular App                                |
| [**inviteAppGuestsUsingPOST1**](AppsApi.md#inviteAppGuestsUsingPOST1)   | **POST** /users-web/api/v3/apps/guests                     | Invite guests to an app                                            |
| [**listAppsUsersUsingGET**](AppsApi.md#listAppsUsersUsingGET)           | **GET** /users-web/api/v3/apps/users                       | Get all users of apps accessible to this account                   |
| [**listUsingGET1**](AppsApi.md#listUsingGET1)                           | **GET** /users-web/api/v3/apps                             | Get all apps accessible by account identified with apiKey          |
| [**updateDescriptionUsingPUT1**](AppsApi.md#updateDescriptionUsingPUT1) | **PUT** /users-web/api/v3/apps/{anyStateAppId}/description | Update description of the app                                      |
| [**updateUsingPUT2**](AppsApi.md#updateUsingPUT2)                       | **PUT** /users-web/api/v3/apps/{anyStateAppId}             | Update app                                                         |


<a name="getAppTypesUsingGET"></a>
# **getAppTypesUsingGET**
> GenericApiResponse getAppTypesUsingGET()

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
    GenericApiResponse result = apiInstance.getAppTypesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#getAppTypesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsingGET"></a>
# **getUsingGET**
> GenericApiResponse getUsingGET(anyStateAppId)

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
    GenericApiResponse result = apiInstance.getUsingGET(anyStateAppId);
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

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="inviteAppGuestsUsingPOST1"></a>
# **inviteAppGuestsUsingPOST1**
> GenericApiResponse inviteAppGuestsUsingPOST1(invitation)

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
Invitation invitation = new Invitation(); // Invitation | For `app` and `apps` fields only `id` needs to be populated.Other fields can be left empty or with default values
try {
    GenericApiResponse result = apiInstance.inviteAppGuestsUsingPOST1(invitation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#inviteAppGuestsUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                            | Description                                                                                                                                     | Notes |
| -------------- | ------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----- |
| **invitation** | [**Invitation**](Invitation.md) | For &#x60;app&#x60; and &#x60;apps&#x60; fields only &#x60;id&#x60; needs to be populated.Other fields can be left empty or with default values |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAppsUsersUsingGET"></a>
# **listAppsUsersUsingGET**
> GenericApiResponse listAppsUsersUsingGET()

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
    GenericApiResponse result = apiInstance.listAppsUsersUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#listAppsUsersUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listUsingGET1"></a>
# **listUsingGET1**
> GenericApiResponse listUsingGET1()

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
    GenericApiResponse result = apiInstance.listUsingGET1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#listUsingGET1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDescriptionUsingPUT1"></a>
# **updateDescriptionUsingPUT1**
> GenericApiResponse updateDescriptionUsingPUT1(anyStateAppId, updateDetails)

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
AppDescription updateDetails = new AppDescription(); // AppDescription | Update Details
try {
    GenericApiResponse result = apiInstance.updateDescriptionUsingPUT1(anyStateAppId, updateDetails);
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
| **updateDetails** | [**AppDescription**](AppDescription.md) | Update Details | [optional] |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUsingPUT2"></a>
# **updateUsingPUT2**
> GenericApiResponse updateUsingPUT2(dto, anyStateAppId)

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
UpdateAppInfo dto = new UpdateAppInfo(); // UpdateAppInfo | dto
Long anyStateAppId = 789L; // Long | App Id
try {
    GenericApiResponse result = apiInstance.updateUsingPUT2(dto, anyStateAppId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#updateUsingPUT2");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type                                  | Description | Notes |
| ----------------- | ------------------------------------- | ----------- | ----- |
| **dto**           | [**UpdateAppInfo**](UpdateAppInfo.md) | dto         |
| **anyStateAppId** | **Long**                              | App Id      |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
