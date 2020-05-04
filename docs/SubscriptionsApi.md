# SubscriptionsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listUsingGET1**](SubscriptionsApi.md#listUsingGET1) | **GET** /users-web/api/v3/apps/{appId}/subscriptions | Get subscriptions for an app
[**sendReportUsingPOST**](SubscriptionsApi.md#sendReportUsingPOST) | **POST** /users-web/api/v3/apps/{appId}/report/send | Trigger emailing of report for an app


<a name="listUsingGET1"></a>
# **listUsingGET1**
> GenericApiResponse listUsingGET1(appId)

Get subscriptions for an app

### Example
```java
// Import classes:
//import com.sematext.stcloud.ApiClient;
//import com.sematext.stcloud.ApiException;
//import com.sematext.stcloud.Configuration;
//import com.sematext.stcloud.auth.*;
//import com.sematext.stcloud.client.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
Long appId = 789L; // Long | appId
try {
    GenericApiResponse result = apiInstance.listUsingGET1(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#listUsingGET1");
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

<a name="sendReportUsingPOST"></a>
# **sendReportUsingPOST**
> GenericApiResponse sendReportUsingPOST(appId, emailDto)

Trigger emailing of report for an app

### Example
```java
// Import classes:
//import com.sematext.stcloud.ApiClient;
//import com.sematext.stcloud.ApiException;
//import com.sematext.stcloud.Configuration;
//import com.sematext.stcloud.auth.*;
//import com.sematext.stcloud.client.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
Long appId = 789L; // Long | appId
ReportInfo emailDto = new ReportInfo(); // ReportInfo | emailDto
try {
    GenericApiResponse result = apiInstance.sendReportUsingPOST(appId, emailDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#sendReportUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **Long**| appId |
 **emailDto** | [**ReportInfo**](ReportInfo.md)| emailDto |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

