# MonitoringAppApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpmApplication1**](MonitoringAppApi.md#createSpmApplication1) | **POST** /spm-reports/api/v3/apps | Create Monitoring App


<a name="createSpmApplication1"></a>
# **createSpmApplication1**
> GenericApiResponse createSpmApplication1(applicationDetails)

Create Monitoring App

### Example
```java
// Import classes:
//import com.sematext.stcloud.ApiClient;
//import com.sematext.stcloud.ApiException;
//import com.sematext.stcloud.Configuration;
//import com.sematext.stcloud.auth.*;
//import com.sematext.stcloud.client.MonitoringAppApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MonitoringAppApi apiInstance = new MonitoringAppApi();
CreateAppInfo applicationDetails = new CreateAppInfo(); // CreateAppInfo | Details of the application to be created
try {
    GenericApiResponse result = apiInstance.createSpmApplication1(applicationDetails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringAppApi#createSpmApplication1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationDetails** | [**CreateAppInfo**](CreateAppInfo.md)| Details of the application to be created |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

