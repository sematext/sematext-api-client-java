# SubscriptionsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createForAppUsingPOST**](SubscriptionsApi.md#createForAppUsingPOST) | **POST** /users-web/api/v3/apps/{appId}/subscription | Create App subscription
[**createForDashUsingPOST1**](SubscriptionsApi.md#createForDashUsingPOST1) | **POST** /users-web/api/v3/dashboards/{dashId}/subscription | Create dashboard subscription
[**deleteUsingDELETE2**](SubscriptionsApi.md#deleteUsingDELETE2) | **DELETE** /users-web/api/v3/subscriptions/{updateableSubscriptionId} | Delete subscription
[**listUsingGET3**](SubscriptionsApi.md#listUsingGET3) | **GET** /users-web/api/v3/apps/{appId}/subscriptions | Get subscriptions for an App
[**listUsingGET5**](SubscriptionsApi.md#listUsingGET5) | **GET** /users-web/api/v3/subscriptions | Get current account&#x27;s subscriptions
[**sendAppReportUsingPOST**](SubscriptionsApi.md#sendAppReportUsingPOST) | **POST** /users-web/api/v3/apps/{appId}/report/send | Email an App report
[**sendDashReportUsingPOST**](SubscriptionsApi.md#sendDashReportUsingPOST) | **POST** /users-web/api/v3/dashboards/{dashId}/report/send | Email a dashboard report
[**toggleEnabledUsingPUT1**](SubscriptionsApi.md#toggleEnabledUsingPUT1) | **PUT** /users-web/api/v3/subscriptions/{updateableSubscriptionId} | Toggle subscription status
[**updateForAppUsingPUT**](SubscriptionsApi.md#updateForAppUsingPUT) | **PUT** /users-web/api/v3/apps/{appId}/subscription | Update App subscription
[**updateForDashUsingPUT1**](SubscriptionsApi.md#updateForDashUsingPUT1) | **PUT** /users-web/api/v3/dashboards/{dashId}/subscription | Update dashboard subscription

<a name="createForAppUsingPOST"></a>

# **createForAppUsingPOST**

> SubscriptionResponse createForAppUsingPOST(body, appId)

Create App subscription

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
SubscriptionDto body = new SubscriptionDto(); // SubscriptionDto | subscription
Long appId = 789L; // Long | appId
try {
    SubscriptionResponse result = apiInstance.createForAppUsingPOST(body, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#createForAppUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubscriptionDto**](SubscriptionDto.md)| subscription |
 **appId** | **Long**| appId |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="createForDashUsingPOST1"></a>

# **createForDashUsingPOST1**

> SubscriptionResponse createForDashUsingPOST1(body, dashId)

Create dashboard subscription

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
SubscriptionDashboardDto body = new SubscriptionDashboardDto(); // SubscriptionDashboardDto | subscription
Long dashId = 789L; // Long | dashId
try {
    SubscriptionResponse result = apiInstance.createForDashUsingPOST1(body, dashId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#createForDashUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubscriptionDashboardDto**](SubscriptionDashboardDto.md)| subscription |
 **dashId** | **Long**| dashId |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="deleteUsingDELETE2"></a>

# **deleteUsingDELETE2**

> GenericMapBasedApiResponse deleteUsingDELETE2(updateableSubscriptionId)

Delete subscription

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
Long updateableSubscriptionId = 789L; // Long | updateableSubscriptionId
try {
    GenericMapBasedApiResponse result = apiInstance.deleteUsingDELETE2(updateableSubscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#deleteUsingDELETE2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateableSubscriptionId** | **Long**| updateableSubscriptionId |

### Return type

[**GenericMapBasedApiResponse**](GenericMapBasedApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listUsingGET3"></a>

# **listUsingGET3**

> SubscriptionsResponse listUsingGET3(appId)

Get subscriptions for an App

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
Long appId = 789L; // Long | appId
try {
    SubscriptionsResponse result = apiInstance.listUsingGET3(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#listUsingGET3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **Long**| appId |

### Return type

[**SubscriptionsResponse**](SubscriptionsResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listUsingGET5"></a>

# **listUsingGET5**

> SubscriptionsResponse listUsingGET5()

Get current account&#x27;s subscriptions

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
try {
    SubscriptionsResponse result = apiInstance.listUsingGET5();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#listUsingGET5");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**SubscriptionsResponse**](SubscriptionsResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="sendAppReportUsingPOST"></a>

# **sendAppReportUsingPOST**

> MailReportResponse sendAppReportUsingPOST(body, appId)

Email an App report

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
ReportInfo body = new ReportInfo(); // ReportInfo | emailDto
Long appId = 789L; // Long | appId
try {
    MailReportResponse result = apiInstance.sendAppReportUsingPOST(body, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#sendAppReportUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReportInfo**](ReportInfo.md)| emailDto |
 **appId** | **Long**| appId |

### Return type

[**MailReportResponse**](MailReportResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="sendDashReportUsingPOST"></a>

# **sendDashReportUsingPOST**

> MailReportResponse sendDashReportUsingPOST(body, dashId)

Email a dashboard report

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
ReportInfo body = new ReportInfo(); // ReportInfo | emailDto
Long dashId = 789L; // Long | dashId
try {
    MailReportResponse result = apiInstance.sendDashReportUsingPOST(body, dashId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#sendDashReportUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReportInfo**](ReportInfo.md)| emailDto |
 **dashId** | **Long**| dashId |

### Return type

[**MailReportResponse**](MailReportResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="toggleEnabledUsingPUT1"></a>

# **toggleEnabledUsingPUT1**

> SubscriptionResponse toggleEnabledUsingPUT1(body, updateableSubscriptionId)

Toggle subscription status

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
UpdateSubscriptionDto body = new UpdateSubscriptionDto(); // UpdateSubscriptionDto | dto
Long updateableSubscriptionId = 789L; // Long | updateableSubscriptionId
try {
    SubscriptionResponse result = apiInstance.toggleEnabledUsingPUT1(body, updateableSubscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#toggleEnabledUsingPUT1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateSubscriptionDto**](UpdateSubscriptionDto.md)| dto |
 **updateableSubscriptionId** | **Long**| updateableSubscriptionId |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="updateForAppUsingPUT"></a>

# **updateForAppUsingPUT**

> SubscriptionResponse updateForAppUsingPUT(body, appId)

Update App subscription

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
SubscriptionDto body = new SubscriptionDto(); // SubscriptionDto | subscription
Long appId = 789L; // Long | appId
try {
    SubscriptionResponse result = apiInstance.updateForAppUsingPUT(body, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#updateForAppUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubscriptionDto**](SubscriptionDto.md)| subscription |
 **appId** | **Long**| appId |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="updateForDashUsingPUT1"></a>

# **updateForDashUsingPUT1**

> SubscriptionResponse updateForDashUsingPUT1(body, dashId)

Update dashboard subscription

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
SubscriptionDashboardDto body = new SubscriptionDashboardDto(); // SubscriptionDashboardDto | subscription
Long dashId = 789L; // Long | dashId
try {
    SubscriptionResponse result = apiInstance.updateForDashUsingPUT1(body, dashId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#updateForDashUsingPUT1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubscriptionDashboardDto**](SubscriptionDashboardDto.md)| subscription |
 **dashId** | **Long**| dashId |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json
