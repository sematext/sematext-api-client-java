# AlertsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAlertUsingPOST**](AlertsApi.md#createAlertUsingPOST) | **POST** /users-web/api/v3/alerts | Create alert rule
[**deleteAlertRuleUsingDELETE**](AlertsApi.md#deleteAlertRuleUsingDELETE) | **DELETE** /users-web/api/v3/alerts/{updateableAlertId} | Delete alert rule
[**disableAlertRuleUsingPUT**](AlertsApi.md#disableAlertRuleUsingPUT) | **PUT** /users-web/api/v3/alerts/{updateableAlertId}/disable | Disable alert rule
[**enableAlertRuleUsingPUT**](AlertsApi.md#enableAlertRuleUsingPUT) | **PUT** /users-web/api/v3/alerts/{updateableAlertId}/enable | Enable alert rule
[**getAlertRulesForAppUsingGET**](AlertsApi.md#getAlertRulesForAppUsingGET) | **GET** /users-web/api/v3/apps/{appId}/alerts | Get alert rules for an app


<a name="createAlertUsingPOST"></a>
# **createAlertUsingPOST**
> GenericApiResponse createAlertUsingPOST(dto)

Create alert rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
AlertRule dto = new AlertRule(); // AlertRule | dto
try {
    GenericApiResponse result = apiInstance.createAlertUsingPOST(dto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#createAlertUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dto** | [**AlertRule**](AlertRule.md)| dto |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAlertRuleUsingDELETE"></a>
# **deleteAlertRuleUsingDELETE**
> GenericApiResponse deleteAlertRuleUsingDELETE(updateableAlertId)

Delete alert rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
Long updateableAlertId = 789L; // Long | updateableAlertId
try {
    GenericApiResponse result = apiInstance.deleteAlertRuleUsingDELETE(updateableAlertId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#deleteAlertRuleUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateableAlertId** | **Long**| updateableAlertId |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="disableAlertRuleUsingPUT"></a>
# **disableAlertRuleUsingPUT**
> GenericApiResponse disableAlertRuleUsingPUT(updateableAlertId)

Disable alert rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
Long updateableAlertId = 789L; // Long | updateableAlertId
try {
    GenericApiResponse result = apiInstance.disableAlertRuleUsingPUT(updateableAlertId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#disableAlertRuleUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateableAlertId** | **Long**| updateableAlertId |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enableAlertRuleUsingPUT"></a>
# **enableAlertRuleUsingPUT**
> GenericApiResponse enableAlertRuleUsingPUT(updateableAlertId)

Enable alert rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
Long updateableAlertId = 789L; // Long | updateableAlertId
try {
    GenericApiResponse result = apiInstance.enableAlertRuleUsingPUT(updateableAlertId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#enableAlertRuleUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateableAlertId** | **Long**| updateableAlertId |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAlertRulesForAppUsingGET"></a>
# **getAlertRulesForAppUsingGET**
> GenericApiResponse getAlertRulesForAppUsingGET(appId)

Get alert rules for an app

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
Long appId = 789L; // Long | appId
try {
    GenericApiResponse result = apiInstance.getAlertRulesForAppUsingGET(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#getAlertRulesForAppUsingGET");
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

