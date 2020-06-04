# MetricsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDataSeriesUsingPOST**](MetricsApi.md#listDataSeriesUsingPOST) | **POST** /spm-reports/api/v3/apps/{appId}/metrics/data | Get metrics data points for an app
[**listFiltersUsingPOST1**](MetricsApi.md#listFiltersUsingPOST1) | **POST** /spm-reports/api/v3/apps/{appId}/metrics/filters | Get metrics filters and their values for an app
[**listMetricsKeysUsingGET**](MetricsApi.md#listMetricsKeysUsingGET) | **GET** /spm-reports/api/v3/apps/{appId}/metrics/keys | Get metrics keys for an app
[**listMetricsUsingGET**](MetricsApi.md#listMetricsUsingGET) | **GET** /spm-reports/api/v3/apps/{appId}/metrics | Get metrics info for an app


<a name="listDataSeriesUsingPOST"></a>
# **listDataSeriesUsingPOST**
> GenericApiResponse listDataSeriesUsingPOST(appId, requestBody)

Get metrics data points for an app

Default value of interval is 5m

### Example
```java
// Import classes:
//import com.sematext.stcloud.ApiClient;
//import com.sematext.stcloud.ApiException;
//import com.sematext.stcloud.Configuration;
//import com.sematext.stcloud.auth.*;
//import com.sematext.stcloud.client.MetricsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MetricsApi apiInstance = new MetricsApi();
Long appId = 789L; // Long | appId
DataSeriesRequest requestBody = new DataSeriesRequest(); // DataSeriesRequest | Metric data points request
try {
    GenericApiResponse result = apiInstance.listDataSeriesUsingPOST(appId, requestBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#listDataSeriesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **Long**| appId |
 **requestBody** | [**DataSeriesRequest**](DataSeriesRequest.md)| Metric data points request |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listFiltersUsingPOST1"></a>
# **listFiltersUsingPOST1**
> GenericApiResponse listFiltersUsingPOST1(appId, requestBody)

Get metrics filters and their values for an app

Default value of interval is 5m

### Example
```java
// Import classes:
//import com.sematext.stcloud.ApiClient;
//import com.sematext.stcloud.ApiException;
//import com.sematext.stcloud.Configuration;
//import com.sematext.stcloud.auth.*;
//import com.sematext.stcloud.client.MetricsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MetricsApi apiInstance = new MetricsApi();
Long appId = 789L; // Long | appId
DataSeriesRequest requestBody = new DataSeriesRequest(); // DataSeriesRequest | Metric filters request
try {
    GenericApiResponse result = apiInstance.listFiltersUsingPOST1(appId, requestBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#listFiltersUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **Long**| appId |
 **requestBody** | [**DataSeriesRequest**](DataSeriesRequest.md)| Metric filters request |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listMetricsKeysUsingGET"></a>
# **listMetricsKeysUsingGET**
> GenericApiResponse listMetricsKeysUsingGET(appId)

Get metrics keys for an app

### Example
```java
// Import classes:
//import com.sematext.stcloud.ApiClient;
//import com.sematext.stcloud.ApiException;
//import com.sematext.stcloud.Configuration;
//import com.sematext.stcloud.auth.*;
//import com.sematext.stcloud.client.MetricsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MetricsApi apiInstance = new MetricsApi();
Long appId = 789L; // Long | appId
try {
    GenericApiResponse result = apiInstance.listMetricsKeysUsingGET(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#listMetricsKeysUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **Long**| appId |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listMetricsUsingGET"></a>
# **listMetricsUsingGET**
> GenericApiResponse listMetricsUsingGET(appId)

Get metrics info for an app

### Example
```java
// Import classes:
//import com.sematext.stcloud.ApiClient;
//import com.sematext.stcloud.ApiException;
//import com.sematext.stcloud.Configuration;
//import com.sematext.stcloud.auth.*;
//import com.sematext.stcloud.client.MetricsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MetricsApi apiInstance = new MetricsApi();
Long appId = 789L; // Long | appId
try {
    GenericApiResponse result = apiInstance.listMetricsUsingGET(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#listMetricsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **Long**| appId |

### Return type

[**GenericApiResponse**](GenericApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

