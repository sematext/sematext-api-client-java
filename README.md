
# <img src="https://sematext.com/wp-content/uploads/2020/09/just-octi-blue.png" valign="bottom" width="60px"/>**&nbsp;&nbsp;sematext-api-client-java**

<br>

>*A [Sematext Cloud](https://sematext.com/cloud/) API client, for interaction with Sematext Cloud solution monitoring, alerting and log shipping.*

<br>

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

<br>
One of a family of clients in following flavours:
<br>
<br>

* [sematext-api-client-javascript](https://github.com/sematext/sematext-api-client-javascript "Javascript")
* [sematext-api-client-rust](https://github.com/sematext/sematext-api-client-rust "Rust")
* [sematext-api-client-ruby](https://github.com/sematext/sematext-api-client-ruby "Ruby")
* [sematext-api-client-python](https://github.com/sematext/sematext-api-client-python "Python")
* [sematext-api-client-php](https://github.com/sematext/sematext-api-client-php "PHP")
* [sematext-api-client-java](https://github.com/sematext/sematext-api-client-java "Java")
* [sematext-api-client-go](https://github.com/sematext/sematext-api-client-go "Go/Golang")

<br>
Refer to below link for deeper information on the API itself.
<br>
<br>

* [Sematext Cloud API Reference](https://sematext.com/docs/api/ "API Reference")

<br>

## Contents

- [<img src="https://sematext.com/wp-content/uploads/2020/09/just-octi-blue.png" valign="bottom" width="60px"/>**&nbsp;&nbsp;sematext-api-client-java**](#sematext-api-client-java)
  - [Contents](#contents)
  - [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installing](#installing)
    - [Maven users](#maven-users)
    - [Gradle users](#gradle-users)
    - [Others](#others)
    - [Authentication](#authentication)
  - [Versioning](#versioning)
  - [License](#license)
  - [Acknowledgements](#acknowledgements)
  - [Getting Started](#getting-started-1)
  - [Reference](#reference)
  - [Documentation for Models](#documentation-for-models)
  - [Documentation for Authorization](#documentation-for-authorization)
    - [api_key](#api_key)
  - [Recommendation](#recommendation)
  - [Author](#author)

<br>


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle



### Installing

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

To run tests:

```shell
mvn test
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.


### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.sematext</groupId>
  <artifactId>SematextCloudClient</artifactId>
  <version>0.1.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sematext:sematext-api-client-java:0.1.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.1.jar`
* `target/lib/*.jar`


### Authentication

This client code requires a Sematext API Access token to function. You can find this by logging into your [Sematext Cloud Account](https://apps.sematext.com/ui/account/api)


## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags).


## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](./LICENSE) file for details


## Acknowledgements

This API client was initially generated by the [swagger-codegen](https://github.com/swagger-api/swagger-codegen) project.

- API version: v3
- Package version: 1.0.0


## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.sematext.cloud.client.*;
import com.sematext.cloud.client.auth.*;
import com.sematext.cloud.client.model.*;
import com.sematext.cloud.client.api.AlertNotificationsApi;

import java.io.File;
import java.util.*;

public class AlertNotificationsApiExample {

    public static void main(String[] args) {
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
            GenericApiResponse result = apiInstance.getAlertNotificationsForAppUsingPOST(appId, timeInterval);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertNotificationsApi#getAlertNotificationsForAppUsingPOST");
            e.printStackTrace();
        }
    }
}

```

## Reference

All URIs are relative to *https://localhost*

| Class                      | Method                                                                                                           | HTTP request                                                        | Description                                                                                             |
| -------------------------- | ---------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| *AlertNotificationsApi*    | [**getAlertNotificationsForAppUsingPOST**](docs/AlertNotificationsApi.md#getAlertNotificationsForAppUsingPOST)   | **POST** /users-web/api/v3/apps/{appId}/notifications/alerts        | Get alert notifications for an app                                                                      |
| *AlertNotificationsApi*    | [**getAlertNotificationsForUserUsingPOST**](docs/AlertNotificationsApi.md#getAlertNotificationsForUserUsingPOST) | **POST** /users-web/api/v3/notifications/alerts                     | Get alert notifications for a user                                                                      |
| *AlertsApi*                | [**createAlertUsingPOST**](docs/AlertsApi.md#createAlertUsingPOST)                                               | **POST** /users-web/api/v3/alerts                                   | Create alert rule                                                                                       |
| *AlertsApi*                | [**deleteAlertRuleUsingDELETE**](docs/AlertsApi.md#deleteAlertRuleUsingDELETE)                                   | **DELETE** /users-web/api/v3/alerts/{updateableAlertId}             | Delete alert rule                                                                                       |
| *AlertsApi*                | [**disableAlertRuleUsingPUT**](docs/AlertsApi.md#disableAlertRuleUsingPUT)                                       | **PUT** /users-web/api/v3/alerts/{updateableAlertId}/disable        | Disable alert rule                                                                                      |
| *AlertsApi*                | [**enableAlertRuleUsingPUT**](docs/AlertsApi.md#enableAlertRuleUsingPUT)                                         | **PUT** /users-web/api/v3/alerts/{updateableAlertId}/enable         | Enable alert rule                                                                                       |
| *AlertsApi*                | [**getAlertRulesForAppUsingGET**](docs/AlertsApi.md#getAlertRulesForAppUsingGET)                                 | **GET** /users-web/api/v3/apps/{appId}/alerts                       | Get alert rules for an app                                                                              |
| *AppsApi*                  | [**getAppTypesUsingGET**](docs/AppsApi.md#getAppTypesUsingGET)                                                   | **GET** /users-web/api/v3/apps/types                                | Get all App types supported for the account identified with apiKey                                      |
| *AppsApi*                  | [**getUsingGET**](docs/AppsApi.md#getUsingGET)                                                                   | **GET** /users-web/api/v3/apps/{anyStateAppId}                      | Gets defails for one particular App                                                                     |
| *AppsApi*                  | [**inviteAppGuestsUsingPOST**](docs/AppsApi.md#inviteAppGuestsUsingPOST)                                         | **POST** /users-web/api/v3/apps/guests                              | Invite guests to an app                                                                                 |
| *AppsApi*                  | [**listAppsUsersUsingGET**](docs/AppsApi.md#listAppsUsersUsingGET)                                               | **GET** /users-web/api/v3/apps/users                                | Get all users of apps accessible to this account                                                        |
| *AppsApi*                  | [**listUsingGET**](docs/AppsApi.md#listUsingGET)                                                                 | **GET** /users-web/api/v3/apps                                      | Get all apps accessible by account identified with apiKey                                               |
| *AppsApi*                  | [**updateDescriptionUsingPUT**](docs/AppsApi.md#updateDescriptionUsingPUT)                                       | **PUT** /users-web/api/v3/apps/{anyStateAppId}/description          | Update description of the app                                                                           |
| *AppsApi*                  | [**updateUsingPUT1**](docs/AppsApi.md#updateUsingPUT1)                                                           | **PUT** /users-web/api/v3/apps/{anyStateAppId}                      | Update app                                                                                              |
| *AwsSettingsControllerApi* | [**updateUsingPUT**](docs/AwsSettingsControllerApi.md#updateUsingPUT)                                            | **PUT** /users-web/api/v3/apps/{appId}/aws                          | Update App&#39;s AWS CloudWatch settings                                                                |
| *BillingApi*               | [**getDetailedInvoiceUsingGET**](docs/BillingApi.md#getDetailedInvoiceUsingGET)                                  | **GET** /users-web/api/v3/billing/invoice/{service}/{year}/{month}  | Get invoice details                                                                                     |
| *BillingApi*               | [**listAvailablePlansUsingGET**](docs/BillingApi.md#listAvailablePlansUsingGET)                                  | **GET** /users-web/api/v3/billing/availablePlans                    | Get available plans                                                                                     |
| *BillingApi*               | [**updatePlanUsingPUT**](docs/BillingApi.md#updatePlanUsingPUT)                                                  | **PUT** /users-web/api/v3/billing/info/{appId}                      | Update plan for an app                                                                                  |
| *LogsAppApi*               | [**createLogseneApplication**](docs/LogsAppApi.md#createLogseneApplication)                                      | **POST** /logsene-reports/api/v3/apps                               | Create Logs App                                                                                         |
| *MetricsApi*               | [**listDataSeriesUsingPOST1**](docs/MetricsApi.md#listDataSeriesUsingPOST1)                                      | **POST** /spm-reports/api/v3/apps/{appId}/metrics/data              | Get metrics data points for an app                                                                      |
| *MetricsApi*               | [**listFiltersUsingPOST**](docs/MetricsApi.md#listFiltersUsingPOST)                                              | **POST** /spm-reports/api/v3/apps/{appId}/metrics/filters           | Get metrics filters and their values for an app                                                         |
| *MetricsApi*               | [**listMetricsKeysUsingGET1**](docs/MetricsApi.md#listMetricsKeysUsingGET1)                                      | **GET** /spm-reports/api/v3/apps/{appId}/metrics/keys               | Get metrics keys for an app                                                                             |
| *MetricsApi*               | [**listMetricsUsingGET1**](docs/MetricsApi.md#listMetricsUsingGET1)                                              | **GET** /spm-reports/api/v3/apps/{appId}/metrics                    | Get metrics info for an app                                                                             |
| *MonitoringAppApi*         | [**createSpmApplication**](docs/MonitoringAppApi.md#createSpmApplication)                                        | **POST** /spm-reports/api/v3/apps                                   | Create Monitoring App                                                                                   |
| *ResetPasswordApi*         | [**resetPasswordUsingPOST**](docs/ResetPasswordApi.md#resetPasswordUsingPOST)                                    | **POST** /users-web/api/v3/account/password/reset                   | Reset Password                                                                                          |
| *SavedQueriesApi*          | [**deleteSavedQueryUsingDELETE**](docs/SavedQueriesApi.md#deleteSavedQueryUsingDELETE)                           | **DELETE** /users-web/api/v3/savedQueries/{updateableQueryId}       | Delete saved query                                                                                      |
| *SavedQueriesApi*          | [**getSavedQueriesForAppUsingGET**](docs/SavedQueriesApi.md#getSavedQueriesForAppUsingGET)                       | **GET** /users-web/api/v3/apps/{appId}/savedQueries                 | Get saved queries for an app                                                                            |
| *SavedQueriesApi*          | [**saveQueryUsingPOST**](docs/SavedQueriesApi.md#saveQueryUsingPOST)                                             | **POST** /users-web/api/v3/savedQueries                             | Create saved query                                                                                      |
| *SavedQueriesApi*          | [**saveQueryUsingPUT**](docs/SavedQueriesApi.md#saveQueryUsingPUT)                                               | **PUT** /users-web/api/v3/savedQueries/{updateableQueryId}          | Update saved query                                                                                      |
| *SubscriptionsApi*         | [**listUsingGET1**](docs/SubscriptionsApi.md#listUsingGET1)                                                      | **GET** /users-web/api/v3/apps/{appId}/subscriptions                | Get subscriptions for an app                                                                            |
| *SubscriptionsApi*         | [**sendReportUsingPOST**](docs/SubscriptionsApi.md#sendReportUsingPOST)                                          | **POST** /users-web/api/v3/apps/{appId}/report/send                 | Trigger emailing of report for an app                                                                   |
| *TagApiControllerApi*      | [**getTagNamesUsingGET**](docs/TagApiControllerApi.md#getTagNamesUsingGET)                                       | **GET** /spm-reports/api/v3/apps/{appIds}/tagNames                  | Gets tag names for the given application identifiers appearing in the given time frame.                 |
| *TagApiControllerApi*      | [**getUsingGET2**](docs/TagApiControllerApi.md#getUsingGET2)                                                     | **GET** /spm-reports/api/v3/apps/{appIds}/metrics/filters           | Gets values for specified tags for the given application identifiers appearing in the given time frame. |
| *TagApiControllerAPI       | [**getUsingGET3**](docs/TagApiControllerApi.md#getUsingGET3)                                                     | **GET** /spm-reports/api/v3/apps/{appIds}/tags                      | Gets values for specified tags for the given application identifiers appearing in the given time frame. |
| *TokensApiControllerApi*   | [**createAppToken**](docs/TokensApiControllerApi.md#createAppToken)                                              | **POST** /users-web/api/v3/apps/{appId}/tokens                      | Create new app token                                                                                    |
| *TokensApiControllerApi*   | [**deleteAppToken1**](docs/TokensApiControllerApi.md#deleteAppToken1)                                            | **DELETE** /users-web/api/v3/apps/{appId}/tokens/{tokenId}          | Delete app token                                                                                        |
| *TokensApiControllerApi*   | [**getAppTokens1**](docs/TokensApiControllerApi.md#getAppTokens1)                                                | **GET** /users-web/api/v3/apps/{appId}/tokens                       | Get app available tokens                                                                                |
| *TokensApiControllerApi*   | [**regenerateAppToken**](docs/TokensApiControllerApi.md#regenerateAppToken)                                      | **POST** /users-web/api/v3/apps/{appId}/tokens/{tokenId}/regenerate | Regenerate app token)                                                                                   |
| *TokensApiControllerApi*   | [**updateAppToken1**](docs/TokensApiControllerApi.md#updateAppToken1)                                            | **PUT** /users-web/api/v3/apps/{appId}/tokens/{tokenId}             | Update app token (enable/disable)                                                                       |


## Documentation for Models

 - [AlertNotificationRequest](docs/AlertNotificationRequest.md)
 - [AlertRule](docs/AlertRule.md)
 - [AlertRuleScheduleTimeRangeDto](docs/AlertRuleScheduleTimeRangeDto.md)
 - [AlertRuleScheduleWeekdayDto](docs/AlertRuleScheduleWeekdayDto.md)
 - [App](docs/App.md)
 - [AppDescription](docs/AppDescription.md)
 - [AppMetadata](docs/AppMetadata.md)
 - [BasicAuthMethodDto](docs/BasicAuthMethodDto.md)
 - [BasicOrganizationDto](docs/BasicOrganizationDto.md)
 - [BillingInfo](docs/BillingInfo.md)
 - [CloudWatchSettings](docs/CloudWatchSettings.md)
 - [CreateAppInfo](docs/CreateAppInfo.md)
 - [CreateTokenDto](docs/CreateTokenDto.md)
 - [DataSeriesFilter](docs/DataSeriesFilter.md)
 - [DataSeriesRequest](docs/DataSeriesRequest.md)
 - [Error](docs/Error.md)
 - [FilterValue](docs/FilterValue.md)
 - [GenericAPIResponse](docs/GenericApiResponse.md)
 - [Invitation](docs/Invitation.md)
 - [NotificationIntegration](docs/NotificationIntegration.md)
 - [Plan](docs/Plan.md)
 - [ReportInfo](docs/ReportInfo.md)
 - [SavedQuery](docs/SavedQuery.md)
 - [ServiceIntegration](docs/ServiceIntegration.md)
 - [SubscriptionDashboardDto](docs/SubscriptionDashboardDto.md)
 - [SubscriptionDto](docs/SubscriptionDto.md)
 - [UpdateAppInfo](docs/UpdateAppInfo.md)
 - [UpdateSubscriptionDto](docs/UpdateSubscriptionDto.md)
 - [UpdateTokenDto](docs/UpdateTokenDto.md)
 - [UserInfo](docs/UserInfo.md)
 - [UserPermissions](docs/UserPermissions.md)
 - [UserRole](docs/UserRole.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author
