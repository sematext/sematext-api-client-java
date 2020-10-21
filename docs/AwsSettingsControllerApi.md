# AwsSettingsControllerApi

All URIs are relative to *https://localhost*

| Method                                                           | HTTP request                               | Description                              |
| ---------------------------------------------------------------- | ------------------------------------------ | ---------------------------------------- |
| [**updateUsingPUT**](AwsSettingsControllerApi.md#updateUsingPUT) | **PUT** /users-web/api/v3/apps/{appId}/aws | Update App&#39;s AWS CloudWatch settings |


<a name="updateUsingPUT"></a>
# **updateUsingPUT**
> GenericApiResponse updateUsingPUT(appId, dto)

Update App&#39;s AWS CloudWatch settings

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
Long appId = 789L; // Long | appId
CloudWatchSettings dto = new CloudWatchSettings(); // CloudWatchSettings | dto
try {
    GenericApiResponse result = apiInstance.updateUsingPUT(appId, dto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AwsSettingsControllerApi#updateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type                                            | Description | Notes |
| --------- | ----------------------------------------------- | ----------- | ----- |
| **appId** | **Long**                                        | appId       |
| **dto**   | [**CloudWatchSettings**](CloudWatchSettings.md) | dto         |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
