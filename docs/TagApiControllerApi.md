# TagApiControllerApi

All URIs are relative to *https://localhost*

| Method                                                                | HTTP request                                              | Description                                                                                             |
| --------------------------------------------------------------------- | --------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| [**getTagNamesUsingGET**](TagApiControllerApi.md#getTagNamesUsingGET) | **GET** /spm-reports/api/v3/apps/{appIds}/tagNames        | Gets tag names for the given application identifiers appearing in the given time frame.                 |
| [**getUsingGET1**](TagApiControllerApi.md#getUsingGET1)               | **GET** /spm-reports/api/v3/apps/{appIds}/tags            | Gets values for specified tags for the given application identifiers appearing in the given time frame. |
| [**getUsingGET2**](TagApiControllerApi.md#getUsingGET2)               | **GET** /spm-reports/api/v3/apps/{appIds}/metrics/filters | Gets values for specified tags for the given application identifiers appearing in the given time frame. |


<a name="getTagNamesUsingGET"></a>
# **getTagNamesUsingGET**
> Object getTagNamesUsingGET(appIds, from, to, metrics, logs, events, rum)

Gets tag names for the given application identifiers appearing in the given time frame.

### Example
```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.TagApiControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TagApiControllerApi apiInstance = new TagApiControllerApi();
String appIds = "appIds_example"; // String | appIds
Long from = 789L; // Long | from
Long to = 789L; // Long | to
Boolean metrics = true; // Boolean | metrics
Boolean logs = true; // Boolean | logs
Boolean events = false; // Boolean | events
Boolean rum = true; // Boolean | rum
try {
    Object result = apiInstance.getTagNamesUsingGET(appIds, from, to, metrics, logs, events, rum);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApiControllerApi#getTagNamesUsingGET");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type        | Description | Notes                         |
| ----------- | ----------- | ----------- | ----------------------------- |
| **appIds**  | **String**  | appIds      |
| **from**    | **Long**    | from        | [optional]                    |
| **to**      | **Long**    | to          | [optional]                    |
| **metrics** | **Boolean** | metrics     | [optional] [default to true]  |
| **logs**    | **Boolean** | logs        | [optional] [default to true]  |
| **events**  | **Boolean** | events      | [optional] [default to false] |
| **rum**     | **Boolean** | rum         | [optional] [default to true]  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsingGET1"></a>
# **getUsingGET1**
> Object getUsingGET1(appIds, tag, from, to, metrics, logs, events, rum)

Gets values for specified tags for the given application identifiers appearing in the given time frame.

### Example
```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.TagApiControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TagApiControllerApi apiInstance = new TagApiControllerApi();
String appIds = "appIds_example"; // String | appIds
List<String> tag = Arrays.asList("tag_example"); // List<String> | tag
Long from = 789L; // Long | from
Long to = 789L; // Long | to
Boolean metrics = true; // Boolean | metrics
Boolean logs = true; // Boolean | logs
Boolean events = false; // Boolean | events
Boolean rum = true; // Boolean | rum
try {
    Object result = apiInstance.getUsingGET1(appIds, tag, from, to, metrics, logs, events, rum);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApiControllerApi#getUsingGET1");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                | Description | Notes                         |
| ----------- | ----------------------------------- | ----------- | ----------------------------- |
| **appIds**  | **String**                          | appIds      |
| **tag**     | [**List&lt;String&gt;**](String.md) | tag         |
| **from**    | **Long**                            | from        | [optional]                    |
| **to**      | **Long**                            | to          | [optional]                    |
| **metrics** | **Boolean**                         | metrics     | [optional] [default to true]  |
| **logs**    | **Boolean**                         | logs        | [optional] [default to true]  |
| **events**  | **Boolean**                         | events      | [optional] [default to false] |
| **rum**     | **Boolean**                         | rum         | [optional] [default to true]  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsingGET2"></a>
# **getUsingGET2**
> Object getUsingGET2(appIds, tag, from, to, metrics, logs, events, rum)

Gets values for specified tags for the given application identifiers appearing in the given time frame.

### Example
```java
// Import classes:
//import com.sematext.cloud.ApiClient;
//import com.sematext.cloud.ApiException;
//import com.sematext.cloud.Configuration;
//import com.sematext.cloud.auth.*;
//import com.sematext.cloud.client.TagApiControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TagApiControllerApi apiInstance = new TagApiControllerApi();
String appIds = "appIds_example"; // String | appIds
List<String> tag = Arrays.asList("tag_example"); // List<String> | tag
Long from = 789L; // Long | from
Long to = 789L; // Long | to
Boolean metrics = true; // Boolean | metrics
Boolean logs = true; // Boolean | logs
Boolean events = false; // Boolean | events
Boolean rum = true; // Boolean | rum
try {
    Object result = apiInstance.getUsingGET2(appIds, tag, from, to, metrics, logs, events, rum);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApiControllerApi#getUsingGET2");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                | Description | Notes                         |
| ----------- | ----------------------------------- | ----------- | ----------------------------- |
| **appIds**  | **String**                          | appIds      |
| **tag**     | [**List&lt;String&gt;**](String.md) | tag         |
| **from**    | **Long**                            | from        | [optional]                    |
| **to**      | **Long**                            | to          | [optional]                    |
| **metrics** | **Boolean**                         | metrics     | [optional] [default to true]  |
| **logs**    | **Boolean**                         | logs        | [optional] [default to true]  |
| **events**  | **Boolean**                         | events      | [optional] [default to false] |
| **rum**     | **Boolean**                         | rum         | [optional] [default to true]  |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
