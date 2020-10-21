# SavedQueriesApi

All URIs are relative to *https://localhost*

| Method                                                                                | HTTP request                                                  | Description                  |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------- | ---------------------------- |
| [**deleteSavedQueryUsingDELETE1**](SavedQueriesApi.md#deleteSavedQueryUsingDELETE1)   | **DELETE** /users-web/api/v3/savedQueries/{updateableQueryId} | Delete saved query           |
| [**getSavedQueriesForAppUsingGET**](SavedQueriesApi.md#getSavedQueriesForAppUsingGET) | **GET** /users-web/api/v3/apps/{appId}/savedQueries           | Get saved queries for an app |
| [**saveQueryUsingPOST1**](SavedQueriesApi.md#saveQueryUsingPOST1)                     | **POST** /users-web/api/v3/savedQueries                       | Create saved query           |
| [**saveQueryUsingPUT1**](SavedQueriesApi.md#saveQueryUsingPUT1)                       | **PUT** /users-web/api/v3/savedQueries/{updateableQueryId}    | Update saved query           |


<a name="deleteSavedQueryUsingDELETE1"></a>
# **deleteSavedQueryUsingDELETE1**
> GenericApiResponse deleteSavedQueryUsingDELETE1(updateableQueryId)

Delete saved query

### Example
```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.SavedQueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SavedQueriesApi apiInstance = new SavedQueriesApi();
Long updateableQueryId = 789L; // Long | updateableQueryId
try {
    GenericApiResponse result = apiInstance.deleteSavedQueryUsingDELETE1(updateableQueryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavedQueriesApi#deleteSavedQueryUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

| Name                  | Type     | Description       | Notes |
| --------------------- | -------- | ----------------- | ----- |
| **updateableQueryId** | **Long** | updateableQueryId |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSavedQueriesForAppUsingGET"></a>
# **getSavedQueriesForAppUsingGET**
> GenericApiResponse getSavedQueriesForAppUsingGET(appId)

Get saved queries for an app

### Example
```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.SavedQueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SavedQueriesApi apiInstance = new SavedQueriesApi();
Long appId = 789L; // Long | appId
try {
    GenericApiResponse result = apiInstance.getSavedQueriesForAppUsingGET(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavedQueriesApi#getSavedQueriesForAppUsingGET");
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

<a name="saveQueryUsingPOST1"></a>
# **saveQueryUsingPOST1**
> GenericApiResponse saveQueryUsingPOST1(savedQueryDto)

Create saved query

### Example
```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.SavedQueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SavedQueriesApi apiInstance = new SavedQueriesApi();
SavedQuery savedQueryDto = new SavedQuery(); // SavedQuery | savedQueryDto
try {
    GenericApiResponse result = apiInstance.saveQueryUsingPOST1(savedQueryDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavedQueriesApi#saveQueryUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type                            | Description   | Notes |
| ----------------- | ------------------------------- | ------------- | ----- |
| **savedQueryDto** | [**SavedQuery**](SavedQuery.md) | savedQueryDto |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveQueryUsingPUT1"></a>
# **saveQueryUsingPUT1**
> GenericApiResponse saveQueryUsingPUT1(savedQueryDto, updateableQueryId)

Update saved query

### Example
```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.SavedQueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SavedQueriesApi apiInstance = new SavedQueriesApi();
SavedQuery savedQueryDto = new SavedQuery(); // SavedQuery | savedQueryDto
Long updateableQueryId = 789L; // Long | updateableQueryId
try {
    GenericApiResponse result = apiInstance.saveQueryUsingPUT1(savedQueryDto, updateableQueryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavedQueriesApi#saveQueryUsingPUT1");
    e.printStackTrace();
}
```

### Parameters

| Name                  | Type                            | Description       | Notes |
| --------------------- | ------------------------------- | ----------------- | ----- |
| **savedQueryDto**     | [**SavedQuery**](SavedQuery.md) | savedQueryDto     |
| **updateableQueryId** | **Long**                        | updateableQueryId |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
