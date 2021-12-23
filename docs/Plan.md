# Plan

## Properties

| Name                   | Type                                            | Description | Notes      |
| ---------------------- | ----------------------------------------------- | ----------- | ---------- |
| **appType**            | **String**                                      |             | [optional] |
| **custom**             | **Boolean**                                     |             | [optional] |
| **dataRetentionHours** | [**BigDecimal**](BigDecimal.md)                 |             | [optional] |
| **defaultTrialPlan**   | **Boolean**                                     |             | [optional] |
| **free**               | **Boolean**                                     |             | [optional] |
| **freeTrialDays**      | **Long**                                        |             | [optional] |
| **id**                 | **Long**                                        |             | [optional] |
| **maxAlerts**          | **Long**                                        |             | [optional] |
| **maxDailyEvents**     | **Long**                                        |             | [optional] |
| **name**               | **String**                                      |             | [optional] |
| **planScheme**         | [**PlanSchemeEnum**](#PlanSchemeEnum)           |             | [optional] |
| **sematextService**    | [**SematextServiceEnum**](#SematextServiceEnum) |             | [optional] |
| **trialPlan**          | **Boolean**                                     |             | [optional] |

<a name="PlanSchemeEnum"></a>

## Enum: PlanSchemeEnum

| Name           | Value                      |
| -------------- | -------------------------- |
| SPM_1_0        | &quot;SPM_1_0&quot;        |
| SPM_2_0        | &quot;SPM_2_0&quot;        |
| SEARCHENE_1_0  | &quot;SEARCHENE_1_0&quot;  |
| LOGSENE_1_0    | &quot;LOGSENE_1_0&quot;    |
| LOGSENE_2_0    | &quot;LOGSENE_2_0&quot;    |
| RUM_1_0        | &quot;RUM_1_0&quot;        |
| RUM_1_1        | &quot;RUM_1_1&quot;        |
| RUM_EA         | &quot;RUM_EA&quot;         |
| SYNTHETICS_EA  | &quot;SYNTHETICS_EA&quot;  |
| SYNTHETICS_1_0 | &quot;SYNTHETICS_1_0&quot; |
| BUGZ_EA        | &quot;BUGZ_EA&quot;        |

<a name="SematextServiceEnum"></a>

## Enum: SematextServiceEnum

| Name       | Value                  |
| ---------- | ---------------------- |
| LOGSENE    | &quot;LOGSENE&quot;    |
| SPM        | &quot;SPM&quot;        |
| RUM        | &quot;RUM&quot;        |
| SYNTHETICS | &quot;SYNTHETICS&quot; |
