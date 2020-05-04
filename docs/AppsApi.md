# AppsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppTypesUsingGET**](AppsApi.md#getAppTypesUsingGET) | **GET** /users-web/api/v3/apps/types | Get all App types supported for the account identified with apiKey
[**getUsingGET**](AppsApi.md#getUsingGET) | **GET** /users-web/api/v3/apps/{anyStateAppId} | Gets defails for one particular App
[**inviteAppGuestsUsingPOST**](AppsApi.md#inviteAppGuestsUsingPOST) | **POST** /users-web/api/v3/apps/guests | Invite guests to an app
[**listAppsUsersUsingGET**](AppsApi.md#listAppsUsersUsingGET) | **GET** /users-web/api/v3/apps/users | Get all users of apps accessible to this account
[**listUsingGET**](AppsApi.md#listUsingGET) | **GET** /users-web/api/v3/apps | Get all apps accessible by account identified with apiKey
[**updateDescriptionUsingPUT**](AppsApi.md#updateDescriptionUsingPUT) | **PUT** /users-web/api/v3/apps/{anyStateAppId}/description | Update description of the app
[**updateUsingPUT1**](AppsApi.md#updateUsingPUT1) | **PUT** /users-web/api/v3/apps/{anyStateAppId} | Update app


<a name="getAppTypesUsingGET"></a>
# **getAppTypesUsingGET**
> GenericApiResponse getAppTypesUsingGET()

Get all App types supported for the account identified with apiKey

### Example
```java
// Import classes:
//import com.sematext.stcloud.ApiClient;
//import com.sematext.stcloud.ApiException;
//import com.sematext.stcloud.Configuration;
//import com.sematext.stcloud.auth.*;
//import com.sematext.stcloud.client.AppsApi;

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
//import com.sematext.stcloud.ApiClient;
//import com.sematext.stcloud.ApiException;
//import com.sematext.stcloud.Configuration;
//import com.sematext.stcloud.auth.*;
//import com.sematext.stcloud.client.AppsApi;

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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **anyStateAppId** | **Long**| anyStateAppId |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="inviteAppGuestsUsingPOST"></a>
# **inviteAppGuestsUsingPOST**
> GenericApiResponse inviteAppGuestsUsingPOST(invitation)

Invite guests to an app

### Example
```java
// Import classes:
//import com.sematext.stcloud.ApiClient;
//import com.sematext.stcloud.ApiException;
//import com.sematext.stcloud.Configuration;
//import com.sematext.stcloud.auth.*;
//import com.sematext.stcloud.client.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AppsApi apiInstance = new AppsApi();
Invitation invitation = new Invitation(); // Invitation | For `app` and `apps` fields only `id` needs to be populated.Other fields can be left empty or with default values
try {
    GenericApiResponse result = apiInstance.inviteAppGuestsUsingPOST(invitation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#inviteAppGuestsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invitation** | [**Invitation**](Invitation.md)| For &#x60;app&#x60; and &#x60;apps&#x60; fields only &#x60;id&#x60; needs to be populated.Other fields can be left empty or with default values |

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
//import com.sematext.stcloud.ApiClient;
//import com.sematext.stcloud.ApiException;
//import com.sematext.stcloud.Configuration;
//import com.sematext.stcloud.auth.*;
//import com.sematext.stcloud.client.AppsApi;

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

<a name="listUsingGET"></a>
# **listUsingGET**
> GenericApiResponse listUsingGET()

Get all apps accessible by account identified with apiKey

### Example
```java
// Import classes:
//import com.sematext.stcloud.ApiClient;
//import com.sematext.stcloud.ApiException;
//import com.sematext.stcloud.Configuration;
//import com.sematext.stcloud.auth.*;
//import com.sematext.stcloud.client.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AppsApi apiInstance = new AppsApi();
try {
    GenericApiResponse result = apiInstance.listUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#listUsingGET");
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

<a name="updateDescriptionUsingPUT"></a>
# **updateDescriptionUsingPUT**
> GenericApiResponse updateDescriptionUsingPUT(anyStateAppId, updateDetails)

Update description of the app

App can be in any state

### Example
```java
// Import classes:
//import com.sematext.stcloud.ApiClient;
//import com.sematext.stcloud.ApiException;
//import com.sematext.stcloud.Configuration;
//import com.sematext.stcloud.auth.*;
//import com.sematext.stcloud.client.AppsApi;

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
    GenericApiResponse result = apiInstance.updateDescriptionUsingPUT(anyStateAppId, updateDetails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#updateDescriptionUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **anyStateAppId** | **Long**| App Id |
 **updateDetails** | [**AppDescription**](AppDescription.md)| Update Details | [optional]

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUsingPUT1"></a>
# **updateUsingPUT1**
> GenericApiResponse updateUsingPUT1(dto, anyStateAppId)

Update app

App can be in any state

### Example
```java
// Import classes:
//import com.sematext.stcloud.ApiClient;
//import com.sematext.stcloud.ApiException;
//import com.sematext.stcloud.Configuration;
//import com.sematext.stcloud.auth.*;
//import com.sematext.stcloud.client.AppsApi;

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
    GenericApiResponse result = apiInstance.updateUsingPUT1(dto, anyStateAppId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#updateUsingPUT1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dto** | [**UpdateAppInfo**](UpdateAppInfo.md)| dto |
 **anyStateAppId** | **Long**| App Id |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

