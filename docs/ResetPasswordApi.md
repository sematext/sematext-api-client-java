# ResetPasswordApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resetPasswordUsingPOST**](ResetPasswordApi.md#resetPasswordUsingPOST) | **POST** /users-web/api/v3/account/password/reset | Reset Password


<a name="resetPasswordUsingPOST"></a>
# **resetPasswordUsingPOST**
> GenericApiResponse resetPasswordUsingPOST(dto)

Reset Password

### Example
```java
// Import classes:
//import com.sematext.stcloud.ApiClient;
//import com.sematext.stcloud.ApiException;
//import com.sematext.stcloud.Configuration;
//import com.sematext.stcloud.auth.*;
//import com.sematext.stcloud.client.ResetPasswordApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResetPasswordApi apiInstance = new ResetPasswordApi();
UserInfo dto = new UserInfo(); // UserInfo | dto
try {
    GenericApiResponse result = apiInstance.resetPasswordUsingPOST(dto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResetPasswordApi#resetPasswordUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dto** | [**UserInfo**](UserInfo.md)| dto |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

