# MetricsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDataSeriesUsingPOST1**](MetricsApi.md#listDataSeriesUsingPOST1) | **POST** /spm-reports/api/v3/apps/{appId}/metrics/data | Get metrics data points for an app
[**listFiltersUsingPOST**](MetricsApi.md#listFiltersUsingPOST) | **POST** /spm-reports/api/v3/apps/{appId}/metrics/filters | Get metrics filters and their values for an app
[**listMetricsKeysUsingGET1**](MetricsApi.md#listMetricsKeysUsingGET1) | **GET** /spm-reports/api/v3/apps/{appId}/metrics/keys | Get metrics keys for an app
[**listMetricsUsingGET1**](MetricsApi.md#listMetricsUsingGET1) | **GET** /spm-reports/api/v3/apps/{appId}/metrics | Get metrics info for an app


<a name="listDataSeriesUsingPOST1"></a>
# **listDataSeriesUsingPOST1**
> GenericApiResponse listDataSeriesUsingPOST1(appId, requestBody)

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
    GenericApiResponse result = apiInstance.listDataSeriesUsingPOST1(appId, requestBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#listDataSeriesUsingPOST1");
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

<a name="listFiltersUsingPOST"></a>
# **listFiltersUsingPOST**
> GenericApiResponse listFiltersUsingPOST(appId, requestBody)

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
    GenericApiResponse result = apiInstance.listFiltersUsingPOST(appId, requestBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#listFiltersUsingPOST");
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

<a name="listMetricsKeysUsingGET1"></a>
# **listMetricsKeysUsingGET1**
> GenericApiResponse listMetricsKeysUsingGET1(appId)

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
    GenericApiResponse result = apiInstance.listMetricsKeysUsingGET1(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#listMetricsKeysUsingGET1");
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

<a name="listMetricsUsingGET1"></a>
# **listMetricsUsingGET1**
> GenericApiResponse listMetricsUsingGET1(appId)

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
    GenericApiResponse result = apiInstance.listMetricsUsingGET1(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#listMetricsUsingGET1");
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

