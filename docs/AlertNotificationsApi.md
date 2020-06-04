# AlertNotificationsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAlertNotificationsForAppUsingPOST1**](AlertNotificationsApi.md#getAlertNotificationsForAppUsingPOST1) | **POST** /users-web/api/v3/apps/{appId}/notifications/alerts | Get alert notifications for an app
[**getAlertNotificationsForUserUsingPOST**](AlertNotificationsApi.md#getAlertNotificationsForUserUsingPOST) | **POST** /users-web/api/v3/notifications/alerts | Get alert notifications for a user


<a name="getAlertNotificationsForAppUsingPOST1"></a>
# **getAlertNotificationsForAppUsingPOST1**
> GenericApiResponse getAlertNotificationsForAppUsingPOST1(appId, timeInterval)

Get alert notifications for an app

Default value of interval is 1d

### Example
```java
// Import classes:
//import com.sematext.stcloud.ApiClient;
//import com.sematext.stcloud.ApiException;
//import com.sematext.stcloud.Configuration;
//import com.sematext.stcloud.auth.*;
//import com.sematext.stcloud.client.AlertNotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertNotificationsApi apiInstance = new AlertNotificationsApi();
Long appId = 789L; // Long | appId
AlertNotificationRequest timeInterval = new AlertNotificationRequest(); // AlertNotificationRequest | Time Interval
try {
    GenericApiResponse result = apiInstance.getAlertNotificationsForAppUsingPOST1(appId, timeInterval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertNotificationsApi#getAlertNotificationsForAppUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **Long**| appId |
 **timeInterval** | [**AlertNotificationRequest**](AlertNotificationRequest.md)| Time Interval |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAlertNotificationsForUserUsingPOST"></a>
# **getAlertNotificationsForUserUsingPOST**
> GenericApiResponse getAlertNotificationsForUserUsingPOST(timeInterval)

Get alert notifications for a user

Default value of interval is 1d

### Example
```java
// Import classes:
//import com.sematext.stcloud.ApiClient;
//import com.sematext.stcloud.ApiException;
//import com.sematext.stcloud.Configuration;
//import com.sematext.stcloud.auth.*;
//import com.sematext.stcloud.client.AlertNotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertNotificationsApi apiInstance = new AlertNotificationsApi();
AlertNotificationRequest timeInterval = new AlertNotificationRequest(); // AlertNotificationRequest | Time Interval
try {
    GenericApiResponse result = apiInstance.getAlertNotificationsForUserUsingPOST(timeInterval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertNotificationsApi#getAlertNotificationsForUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timeInterval** | [**AlertNotificationRequest**](AlertNotificationRequest.md)| Time Interval |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

