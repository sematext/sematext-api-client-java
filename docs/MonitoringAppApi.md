# MonitoringAppApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpmApplication**](MonitoringAppApi.md#createSpmApplication) | **POST** /spm-reports/api/v3/apps | Create Monitoring App


<a name="createSpmApplication"></a>
# **createSpmApplication**
> GenericApiResponse createSpmApplication(applicationDetails)

Create Monitoring App

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MonitoringAppApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MonitoringAppApi apiInstance = new MonitoringAppApi();
CreateAppInfo applicationDetails = new CreateAppInfo(); // CreateAppInfo | Details of the application to be created
try {
    GenericApiResponse result = apiInstance.createSpmApplication(applicationDetails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringAppApi#createSpmApplication");
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

