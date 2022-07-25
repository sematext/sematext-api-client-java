# ResetPasswordApi

All URIs are relative to */*

| Method                                                                     | HTTP request                                      | Description    |
| -------------------------------------------------------------------------- | ------------------------------------------------- | -------------- |
| [**resetPasswordUsingPOST1**](ResetPasswordApi.md#resetPasswordUsingPOST1) | **POST** /users-web/api/v3/account/password/reset | Reset Password |

<a name="resetPasswordUsingPOST1"></a>

# **resetPasswordUsingPOST1**

> GenericMapBasedApiResponse resetPasswordUsingPOST1(body)

Reset Password

### Example

```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.ResetPasswordApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResetPasswordApi apiInstance = new ResetPasswordApi();
UserInfo body = new UserInfo(); // UserInfo | dto
try {
    GenericMapBasedApiResponse result = apiInstance.resetPasswordUsingPOST1(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResetPasswordApi#resetPasswordUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                        | Description | Notes |
| -------- | --------------------------- | ----------- | ----- |
| **body** | [**UserInfo**](UserInfo.md) | dto         |

### Return type

[**GenericMapBasedApiResponse**](GenericMapBasedApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json
