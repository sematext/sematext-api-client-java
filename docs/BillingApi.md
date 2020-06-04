# BillingApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDetailedInvoiceUsingGET1**](BillingApi.md#getDetailedInvoiceUsingGET1) | **GET** /users-web/api/v3/billing/invoice/{service}/{year}/{month} | Get invoice details
[**listAvailablePlansUsingGET1**](BillingApi.md#listAvailablePlansUsingGET1) | **GET** /users-web/api/v3/billing/availablePlans | Get available plans
[**updatePlanUsingPUT1**](BillingApi.md#updatePlanUsingPUT1) | **PUT** /users-web/api/v3/billing/info/{appId} | Update plan for an app


<a name="getDetailedInvoiceUsingGET1"></a>
# **getDetailedInvoiceUsingGET1**
> GenericApiResponse getDetailedInvoiceUsingGET1(service, year, month)

Get invoice details

### Example
```java
// Import classes:
//import com.sematext.stcloud.ApiClient;
//import com.sematext.stcloud.ApiException;
//import com.sematext.stcloud.Configuration;
//import com.sematext.stcloud.auth.*;
//import com.sematext.stcloud.client.BillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingApi apiInstance = new BillingApi();
String service = "service_example"; // String | service
Integer year = 56; // Integer | year
Integer month = 56; // Integer | month
try {
    GenericApiResponse result = apiInstance.getDetailedInvoiceUsingGET1(service, year, month);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#getDetailedInvoiceUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **service** | **String**| service |
 **year** | **Integer**| year |
 **month** | **Integer**| month |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAvailablePlansUsingGET1"></a>
# **listAvailablePlansUsingGET1**
> GenericApiResponse listAvailablePlansUsingGET1(integrationId, appType)

Get available plans

### Example
```java
// Import classes:
//import com.sematext.stcloud.ApiClient;
//import com.sematext.stcloud.ApiException;
//import com.sematext.stcloud.Configuration;
//import com.sematext.stcloud.auth.*;
//import com.sematext.stcloud.client.BillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingApi apiInstance = new BillingApi();
Long integrationId = 789L; // Long | integrationId
String appType = "appType_example"; // String | appType
try {
    GenericApiResponse result = apiInstance.listAvailablePlansUsingGET1(integrationId, appType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#listAvailablePlansUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **Long**| integrationId | [optional]
 **appType** | **String**| appType | [optional]

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePlanUsingPUT1"></a>
# **updatePlanUsingPUT1**
> GenericApiResponse updatePlanUsingPUT1(appId, dto)

Update plan for an app

### Example
```java
// Import classes:
//import com.sematext.stcloud.ApiClient;
//import com.sematext.stcloud.ApiException;
//import com.sematext.stcloud.Configuration;
//import com.sematext.stcloud.auth.*;
//import com.sematext.stcloud.client.BillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingApi apiInstance = new BillingApi();
Long appId = 789L; // Long | appId
BillingInfo dto = new BillingInfo(); // BillingInfo | dto
try {
    GenericApiResponse result = apiInstance.updatePlanUsingPUT1(appId, dto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#updatePlanUsingPUT1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **Long**| appId |
 **dto** | [**BillingInfo**](BillingInfo.md)| dto |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

