# AlertNotificationsApi

All URIs are relative to */*

| Method                                                                                                      | HTTP request                                                 | Description                        |
| ----------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------ | ---------------------------------- |
| [**getAlertNotificationsForAppUsingPOST**](AlertNotificationsApi.md#getAlertNotificationsForAppUsingPOST)   | **POST** /users-web/api/v3/apps/{appId}/notifications/alerts | Get alert notifications for an app |
| [**getAlertNotificationsForUserUsingPOST**](AlertNotificationsApi.md#getAlertNotificationsForUserUsingPOST) | **POST** /users-web/api/v3/notifications/alerts              | Get alert notifications for a user |

<a name="getAlertNotificationsForAppUsingPOST"></a>
# **getAlertNotificationsForAppUsingPOST**
> NotificationsResponse getAlertNotificationsForAppUsingPOST(body, appId)

Get alert notifications for an app

Default value of interval is 1d

### Example
```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.AlertNotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertNotificationsApi apiInstance = new AlertNotificationsApi();
AlertNotificationRequest body = new AlertNotificationRequest(); // AlertNotificationRequest | Time Interval
Long appId = 789L; // Long | appId
try {
    NotificationsResponse result = apiInstance.getAlertNotificationsForAppUsingPOST(body, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertNotificationsApi#getAlertNotificationsForAppUsingPOST");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type                                                        | Description   | Notes |
| --------- | ----------------------------------------------------------- | ------------- | ----- |
| **body**  | [**AlertNotificationRequest**](AlertNotificationRequest.md) | Time Interval |
| **appId** | **Long**                                                    | appId         |

### Return type

[**NotificationsResponse**](NotificationsResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAlertNotificationsForUserUsingPOST"></a>
# **getAlertNotificationsForUserUsingPOST**
> NotificationsResponse getAlertNotificationsForUserUsingPOST(body)

Get alert notifications for a user

Default value of interval is 1d

### Example
```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.AlertNotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertNotificationsApi apiInstance = new AlertNotificationsApi();
AlertNotificationRequest body = new AlertNotificationRequest(); // AlertNotificationRequest | Time Interval
try {
    NotificationsResponse result = apiInstance.getAlertNotificationsForUserUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertNotificationsApi#getAlertNotificationsForUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                        | Description   | Notes |
| -------- | ----------------------------------------------------------- | ------------- | ----- |
| **body** | [**AlertNotificationRequest**](AlertNotificationRequest.md) | Time Interval |

### Return type

[**NotificationsResponse**](NotificationsResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
