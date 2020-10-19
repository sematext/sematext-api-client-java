# SubscriptionsApi

All URIs are relative to *https://localhost*

| Method                                                               | HTTP request                                         | Description                           |
| -------------------------------------------------------------------- | ---------------------------------------------------- | ------------------------------------- |
| [**listUsingGET2**](SubscriptionsApi.md#listUsingGET2)               | **GET** /users-web/api/v3/apps/{appId}/subscriptions | Get subscriptions for an app          |
| [**sendReportUsingPOST1**](SubscriptionsApi.md#sendReportUsingPOST1) | **POST** /users-web/api/v3/apps/{appId}/report/send  | Trigger emailing of report for an app |


<a name="listUsingGET2"></a>
# **listUsingGET2**
> GenericApiResponse listUsingGET2(appId)

Get subscriptions for an app

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
    GenericApiResponse result = apiInstance.listUsingGET2(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#listUsingGET2");
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

<a name="sendReportUsingPOST1"></a>
# **sendReportUsingPOST1**
> GenericApiResponse sendReportUsingPOST1(appId, emailDto)

Trigger emailing of report for an app

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
ReportInfo emailDto = new ReportInfo(); // ReportInfo | emailDto
try {
    GenericApiResponse result = apiInstance.sendReportUsingPOST1(appId, emailDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#sendReportUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                            | Description | Notes |
| ------------ | ------------------------------- | ----------- | ----- |
| **appId**    | **Long**                        | appId       |
| **emailDto** | [**ReportInfo**](ReportInfo.md) | emailDto    |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
