# LogsAppApi

All URIs are relative to */*

| Method                                                                 | HTTP request                          | Description     |
| ---------------------------------------------------------------------- | ------------------------------------- | --------------- |
| [**createLogseneApplication**](LogsAppApi.md#createLogseneApplication) | **POST** /logsene-reports/api/v3/apps | Create Logs App |

<a name="createLogseneApplication"></a>

# **createLogseneApplication**

> AppsResponse createLogseneApplication(body)

Create Logs App

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.LogsAppApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LogsAppApi apiInstance = new LogsAppApi();
CreateAppInfo body = new CreateAppInfo(); // CreateAppInfo | Details of the application to be created
try {
    AppsResponse result = apiInstance.createLogseneApplication(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsAppApi#createLogseneApplication");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                  | Description                              | Notes |
| -------- | ------------------------------------- | ---------------------------------------- | ----- |
| **body** | [**CreateAppInfo**](CreateAppInfo.md) | Details of the application to be created |

### Return type

[**AppsResponse**](AppsResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json
