# SavedQueriesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteSavedQueryUsingDELETE**](SavedQueriesApi.md#deleteSavedQueryUsingDELETE) | **DELETE** /users-web/api/v3/savedQueries/{updateableQueryId} | Delete saved query
[**getSavedQueriesForAppUsingGET**](SavedQueriesApi.md#getSavedQueriesForAppUsingGET) | **GET** /users-web/api/v3/apps/{appId}/savedQueries | Get saved queries for an app
[**saveQueryUsingPOST**](SavedQueriesApi.md#saveQueryUsingPOST) | **POST** /users-web/api/v3/savedQueries | Create saved query
[**saveQueryUsingPUT**](SavedQueriesApi.md#saveQueryUsingPUT) | **PUT** /users-web/api/v3/savedQueries/{updateableQueryId} | Update saved query


<a name="deleteSavedQueryUsingDELETE"></a>
# **deleteSavedQueryUsingDELETE**
> GenericApiResponse deleteSavedQueryUsingDELETE(updateableQueryId)

Delete saved query

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SavedQueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SavedQueriesApi apiInstance = new SavedQueriesApi();
Long updateableQueryId = 789L; // Long | updateableQueryId
try {
    GenericApiResponse result = apiInstance.deleteSavedQueryUsingDELETE(updateableQueryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavedQueriesApi#deleteSavedQueryUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateableQueryId** | **Long**| updateableQueryId |

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
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SavedQueriesApi;

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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **Long**| appId |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveQueryUsingPOST"></a>
# **saveQueryUsingPOST**
> GenericApiResponse saveQueryUsingPOST(savedQueryDto)

Create saved query

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SavedQueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SavedQueriesApi apiInstance = new SavedQueriesApi();
SavedQuery savedQueryDto = new SavedQuery(); // SavedQuery | savedQueryDto
try {
    GenericApiResponse result = apiInstance.saveQueryUsingPOST(savedQueryDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavedQueriesApi#saveQueryUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **savedQueryDto** | [**SavedQuery**](SavedQuery.md)| savedQueryDto |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveQueryUsingPUT"></a>
# **saveQueryUsingPUT**
> GenericApiResponse saveQueryUsingPUT(savedQueryDto, updateableQueryId)

Update saved query

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SavedQueriesApi;

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
    GenericApiResponse result = apiInstance.saveQueryUsingPUT(savedQueryDto, updateableQueryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavedQueriesApi#saveQueryUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **savedQueryDto** | [**SavedQuery**](SavedQuery.md)| savedQueryDto |
 **updateableQueryId** | **Long**| updateableQueryId |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

