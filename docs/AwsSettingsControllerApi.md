# AwsSettingsControllerApi

All URIs are relative to */*

| Method                                                             | HTTP request                               | Description                               |
| ------------------------------------------------------------------ | ------------------------------------------ | ----------------------------------------- |
| [**updateUsingPUT1**](AwsSettingsControllerApi.md#updateUsingPUT1) | **PUT** /users-web/api/v3/apps/{appId}/aws | Update App&#x27;s AWS CloudWatch settings |

<a name="updateUsingPUT1"></a>

# **updateUsingPUT1**

> CloudWatchSettingsResponse updateUsingPUT1(body, appId)

Update App&#x27;s AWS CloudWatch settings

Applicable only for AWS Apps

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.AwsSettingsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AwsSettingsControllerApi apiInstance = new AwsSettingsControllerApi();
CloudWatchSettings body = new CloudWatchSettings(); // CloudWatchSettings | dto
Long appId = 789L; // Long | appId
try {
    CloudWatchSettingsResponse result = apiInstance.updateUsingPUT1(body, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AwsSettingsControllerApi#updateUsingPUT1");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type                                            | Description | Notes |
| --------- | ----------------------------------------------- | ----------- | ----- |
| **body**  | [**CloudWatchSettings**](CloudWatchSettings.md) | dto         |
| **appId** | **Long**                                        | appId       |

### Return type

[**CloudWatchSettingsResponse**](CloudWatchSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json
