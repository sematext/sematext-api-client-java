# BillingApi

All URIs are relative to */*

| Method                                                                     | HTTP request                                                       | Description            |
| -------------------------------------------------------------------------- | ------------------------------------------------------------------ | ---------------------- |
| [**getDetailedInvoiceUsingGET**](BillingApi.md#getDetailedInvoiceUsingGET) | **GET** /users-web/api/v3/billing/invoice/{service}/{year}/{month} | Get invoice details    |
| [**listAvailablePlansUsingGET**](BillingApi.md#listAvailablePlansUsingGET) | **GET** /users-web/api/v3/billing/availablePlans                   | Get available plans    |
| [**updatePlanUsingPUT**](BillingApi.md#updatePlanUsingPUT)                 | **PUT** /users-web/api/v3/billing/info/{appId}                     | Update plan for an app |

<a name="getDetailedInvoiceUsingGET"></a>
# **getDetailedInvoiceUsingGET**
> InvoiceResponse getDetailedInvoiceUsingGET(service, year, month)

Get invoice details

### Example
```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.BillingApi;

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
    InvoiceResponse result = apiInstance.getDetailedInvoiceUsingGET(service, year, month);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#getDetailedInvoiceUsingGET");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type        | Description | Notes |
| ----------- | ----------- | ----------- | ----- |
| **service** | **String**  | service     |
| **year**    | **Integer** | year        |
| **month**   | **Integer** | month       |

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAvailablePlansUsingGET"></a>
# **listAvailablePlansUsingGET**
> PlansResponse listAvailablePlansUsingGET(integrationId, appType)

Get available plans

### Example
```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.BillingApi;

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
    PlansResponse result = apiInstance.listAvailablePlansUsingGET(integrationId, appType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#listAvailablePlansUsingGET");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description   | Notes      |
| ----------------- | ---------- | ------------- | ---------- |
| **integrationId** | **Long**   | integrationId | [optional] |
| **appType**       | **String** | appType       | [optional] |

### Return type

[**PlansResponse**](PlansResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePlanUsingPUT"></a>
# **updatePlanUsingPUT**
> UpdatePlanResponse updatePlanUsingPUT(body, appId)

Update plan for an app

### Example
```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.BillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BillingApi apiInstance = new BillingApi();
BillingInfo body = new BillingInfo(); // BillingInfo | dto
Long appId = 789L; // Long | appId
try {
    UpdatePlanResponse result = apiInstance.updatePlanUsingPUT(body, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#updatePlanUsingPUT");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type                              | Description | Notes |
| --------- | --------------------------------- | ----------- | ----- |
| **body**  | [**BillingInfo**](BillingInfo.md) | dto         |
| **appId** | **Long**                          | appId       |

### Return type

[**UpdatePlanResponse**](UpdatePlanResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
