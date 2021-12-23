# AlertsApi

All URIs are relative to */*

| Method                                                                        | HTTP request                                                 | Description                |
| ----------------------------------------------------------------------------- | ------------------------------------------------------------ | -------------------------- |
| [**createAlertUsingPOST**](AlertsApi.md#createAlertUsingPOST)                 | **POST** /users-web/api/v3/alerts                            | Create alert rule          |
| [**deleteAlertRuleUsingDELETE1**](AlertsApi.md#deleteAlertRuleUsingDELETE1)   | **DELETE** /users-web/api/v3/alerts/{updateableAlertId}      | Delete alert rule          |
| [**disableAlertRuleUsingPUT**](AlertsApi.md#disableAlertRuleUsingPUT)         | **PUT** /users-web/api/v3/alerts/{updateableAlertId}/disable | Disable alert rule         |
| [**enableAlertRuleUsingPUT**](AlertsApi.md#enableAlertRuleUsingPUT)           | **PUT** /users-web/api/v3/alerts/{updateableAlertId}/enable  | Enable alert rule          |
| [**getAlertRulesForAppUsingGET1**](AlertsApi.md#getAlertRulesForAppUsingGET1) | **GET** /users-web/api/v3/apps/{appId}/alerts                | Get alert rules for an app |

<a name="createAlertUsingPOST"></a>

# **createAlertUsingPOST**

> AlertRuleResponse createAlertUsingPOST(body)

Create alert rule

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
AlertRule body = new AlertRule(); // AlertRule | dto
try {
    AlertRuleResponse result = apiInstance.createAlertUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#createAlertUsingPOST");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                          | Description | Notes |
| -------- | ----------------------------- | ----------- | ----- |
| **body** | [**AlertRule**](AlertRule.md) | dto         |

### Return type

[**AlertRuleResponse**](AlertRuleResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="deleteAlertRuleUsingDELETE1"></a>

# **deleteAlertRuleUsingDELETE1**

> GenericMapBasedApiResponse deleteAlertRuleUsingDELETE1(updateableAlertId)

Delete alert rule

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
Long updateableAlertId = 789L; // Long | updateableAlertId
try {
    GenericMapBasedApiResponse result = apiInstance.deleteAlertRuleUsingDELETE1(updateableAlertId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#deleteAlertRuleUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

| Name                  | Type     | Description       | Notes |
| --------------------- | -------- | ----------------- | ----- |
| **updateableAlertId** | **Long** | updateableAlertId |

### Return type

[**GenericMapBasedApiResponse**](GenericMapBasedApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="disableAlertRuleUsingPUT"></a>

# **disableAlertRuleUsingPUT**

> GenericMapBasedApiResponse disableAlertRuleUsingPUT(updateableAlertId)

Disable alert rule

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
Long updateableAlertId = 789L; // Long | updateableAlertId
try {
    GenericMapBasedApiResponse result = apiInstance.disableAlertRuleUsingPUT(updateableAlertId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#disableAlertRuleUsingPUT");
    e.printStackTrace();
}
```

### Parameters

| Name                  | Type     | Description       | Notes |
| --------------------- | -------- | ----------------- | ----- |
| **updateableAlertId** | **Long** | updateableAlertId |

### Return type

[**GenericMapBasedApiResponse**](GenericMapBasedApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="enableAlertRuleUsingPUT"></a>

# **enableAlertRuleUsingPUT**

> GenericMapBasedApiResponse enableAlertRuleUsingPUT(updateableAlertId)

Enable alert rule

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
Long updateableAlertId = 789L; // Long | updateableAlertId
try {
    GenericMapBasedApiResponse result = apiInstance.enableAlertRuleUsingPUT(updateableAlertId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#enableAlertRuleUsingPUT");
    e.printStackTrace();
}
```

### Parameters

| Name                  | Type     | Description       | Notes |
| --------------------- | -------- | ----------------- | ----- |
| **updateableAlertId** | **Long** | updateableAlertId |

### Return type

[**GenericMapBasedApiResponse**](GenericMapBasedApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getAlertRulesForAppUsingGET1"></a>

# **getAlertRulesForAppUsingGET1**

> AlertRulesResponse getAlertRulesForAppUsingGET1(appId)

Get alert rules for an app

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
Long appId = 789L; // Long | appId
try {
    AlertRulesResponse result = apiInstance.getAlertRulesForAppUsingGET1(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#getAlertRulesForAppUsingGET1");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type     | Description | Notes |
| --------- | -------- | ----------- | ----- |
| **appId** | **Long** | appId       |

### Return type

[**AlertRulesResponse**](AlertRulesResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json
