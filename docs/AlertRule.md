# AlertRule

## Properties
| Name                                      | Type                                                                          | Description | Notes      |
| ----------------------------------------- | ----------------------------------------------------------------------------- | ----------- | ---------- |
| **accountEmail**                          | **String**                                                                    |             | [optional] |
| **allowedAppTypes**                       | **List&lt;Long&gt;**                                                          |             | [optional] |
| **analyzingTime**                         | **String**                                                                    |             | [optional] |
| **appDisplayState**                       | **String**                                                                    |             | [optional] |
| **appId**                                 | **Long**                                                                      |             | [optional] |
| **appName**                               | **String**                                                                    |             | [optional] |
| **appState**                              | **String**                                                                    |             | [optional] |
| **appToken**                              | **String**                                                                    |             | [optional] |
| **appType**                               | **String**                                                                    |             | [optional] |
| **backToNormalNeeded**                    | **Boolean**                                                                   |             | [optional] |
| **chartKey**                              | **String**                                                                    |             | [optional] |
| **color**                                 | **String**                                                                    |             | [optional] |
| **creatorEmail**                          | **String**                                                                    |             | [optional] |
| **defaultAggType**                        | **String**                                                                    |             | [optional] |
| **description**                           | **String**                                                                    |             | [optional] |
| **disallowedAppTypes**                    | **List&lt;Long&gt;**                                                          |             | [optional] |
| **enabled**                               | **Boolean**                                                                   |             | [optional] |
| **estimateOperation**                     | [**EstimateOperationEnum**](#EstimateOperationEnum)                           |             | [optional] |
| **estimateValue**                         | **Double**                                                                    |             | [optional] |
| **filterValues**                          | **String**                                                                    |             | [optional] |
| **filterValuesObj**                       | [**List&lt;FilterValue&gt;**](FilterValue.md)                                 |             | [optional] |
| **ignoreRegularEventsEnabled**            | **Boolean**                                                                   |             | [optional] |
| **integrations**                          | **String**                                                                    |             | [optional] |
| **lastDataReceivedDate**                  | **Long**                                                                      |             | [optional] |
| **lastSent**                              | **Long**                                                                      |             | [optional] |
| **lastTriggered**                         | **Long**                                                                      |             | [optional] |
| **metadata**                              | **Object**                                                                    |             | [optional] |
| **metricKey**                             | **String**                                                                    |             | [optional] |
| **metricLabel**                           | **String**                                                                    |             | [optional] |
| **minDelayBetweenNotificationsInMinutes** | **String**                                                                    |             | [optional] |
| **name**                                  | **String**                                                                    |             | [optional] |
| **notificationEmails**                    | **List&lt;String&gt;**                                                        |             | [optional] |
| **notificationIntegrations**              | [**List&lt;NotificationIntegration&gt;**](NotificationIntegration.md)         |             | [optional] |
| **notificationsEnabled**                  | **Boolean**                                                                   |             | [optional] |
| **query**                                 | **String**                                                                    |             | [optional] |
| **reportName**                            | **String**                                                                    |             | [optional] |
| **ruleKey**                               | **Long**                                                                      |             | [optional] |
| **ruleType**                              | **String**                                                                    |             | [optional] |
| **runbook**                               | **String**                                                                    |             | [optional] |
| **savedQueryId**                          | **Long**                                                                      |             | [optional] |
| **schedule**                              | [**List&lt;AlertRuleScheduleWeekdayDto&gt;**](AlertRuleScheduleWeekdayDto.md) |             | [optional] |
| **sematextService**                       | **String**                                                                    |             | [optional] |
| **sendToEmail**                           | **String**                                                                    |             | [optional] |
| **timezone**                              | **String**                                                                    |             | [optional] |
| **useOnlyAlertRuleIntegrations**          | **Boolean**                                                                   |             | [optional] |
| **userPermissions**                       | [**UserPermissions**](UserPermissions.md)                                     |             | [optional] |
| **valueColumnName**                       | **String**                                                                    |             | [optional] |
| **valueName**                             | **String**                                                                    |             | [optional] |

<a name="EstimateOperationEnum"></a>
## Enum: EstimateOperationEnum
| Name          | Value                     |
| ------------- | ------------------------- |
| LESS          | &quot;LESS&quot;          |
| MORE          | &quot;MORE&quot;          |
| EQUAL         | &quot;EQUAL&quot;         |
| UN_EQUAL      | &quot;UN_EQUAL&quot;      |
| LESS_OR_EQUAL | &quot;LESS_OR_EQUAL&quot; |
| MORE_OR_EQUAL | &quot;MORE_OR_EQUAL&quot; |
