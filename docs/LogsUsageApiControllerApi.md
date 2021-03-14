# LogsUsageApiControllerApi

All URIs are relative to */*

| Method                                                                      | HTTP request                                                   | Description |
| --------------------------------------------------------------------------- | -------------------------------------------------------------- | ----------- |
| [**getForRangeUsingGET**](LogsUsageApiControllerApi.md#getForRangeUsingGET) | **GET** /logsene-reports/api/v3/apps/{appId}/usage/{from}/{to} | getForRange |

<a name="getForRangeUsingGET"></a>
# **getForRangeUsingGET**
> UsageResponse getForRangeUsingGET(appId, from, to)

getForRange

### Example
```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.LogsUsageApiControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LogsUsageApiControllerApi apiInstance = new LogsUsageApiControllerApi();
Long appId = 789L; // Long | appId
Long from = 789L; // Long | from
Long to = 789L; // Long | to
try {
    UsageResponse result = apiInstance.getForRangeUsingGET(appId, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsUsageApiControllerApi#getForRangeUsingGET");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type     | Description | Notes |
| --------- | -------- | ----------- | ----- |
| **appId** | **Long** | appId       |
| **from**  | **Long** | from        |
| **to**    | **Long** | to          |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json
