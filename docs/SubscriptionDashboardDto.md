# SubscriptionDashboardDto

## Properties

| Name            | Type                                    | Description | Notes      |
| --------------- | --------------------------------------- | ----------- | ---------- |
| **addresses**   | **String**                              |             | [optional] |
| **dashboardId** | **Long**                                |             | [optional] |
| **enable**      | **Boolean**                             |             | [optional] |
| **filters**     | **String**                              |             | [optional] |
| **frequency**   | [**FrequencyEnum**](#FrequencyEnum)     |             | [optional] |
| **id**          | **Long**                                |             | [optional] |
| **reportName**  | **String**                              |             | [optional] |
| **sendTime**    | [**OffsetDateTime**](OffsetDateTime.md) |             | [optional] |
| **subject**     | **String**                              |             | [optional] |
| **text**        | **String**                              |             | [optional] |
| **timeRange**   | [**TimeRangeEnum**](#TimeRangeEnum)     |             | [optional] |

<a name="FrequencyEnum"></a>

## Enum: FrequencyEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| EVERY_FIVE_MINUTES | &quot;EVERY_FIVE_MINUTES&quot; |
| DAILY              | &quot;DAILY&quot;              |
| WEEKLY             | &quot;WEEKLY&quot;             |
| MONTHLY            | &quot;MONTHLY&quot;            |
| QUARTERLY          | &quot;QUARTERLY&quot;          |

<a name="TimeRangeEnum"></a>

## Enum: TimeRangeEnum

| Name      | Value                 |
| --------- | --------------------- |
| ONE_DAY   | &quot;ONE_DAY&quot;   |
| ONE_WEEK  | &quot;ONE_WEEK&quot;  |
| ONE_MONTH | &quot;ONE_MONTH&quot; |
| TWO_MONTH | &quot;TWO_MONTH&quot; |
| SIX_MONTH | &quot;SIX_MONTH&quot; |
| ONE_YEAR  | &quot;ONE_YEAR&quot;  |
