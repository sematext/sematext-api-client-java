# DayUsageData

## Properties
| Name                           | Type                              | Description | Notes      |
| ------------------------------ | --------------------------------- | ----------- | ---------- |
| **countDailyDataPoints**       | **Integer**                       |             | [optional] |
| **day**                        | **String**                        |             | [optional] |
| **discount**                   | [**BigDecimal**](BigDecimal.md)   |             | [optional] |
| **dpmPerContainerHostQuota**   | **Long**                          |             | [optional] |
| **dpmPerHostQuota**            | **Long**                          |             | [optional] |
| **fixedMonthlyPrice**          | [**BigDecimal**](BigDecimal.md)   |             | [optional] |
| **fixedMonthlyPricePerHour**   | [**BigDecimal**](BigDecimal.md)   |             | [optional] |
| **freeContainersPerHost**      | **Integer**                       |             | [optional] |
| **id**                         | **Long**                          |             | [optional] |
| **kiloDpmOveragePricePerHour** | [**BigDecimal**](BigDecimal.md)   |             | [optional] |
| **planType**                   | [**PlanTypeEnum**](#PlanTypeEnum) |             | [optional] |
| **pricePerContainerHostHour**  | [**BigDecimal**](BigDecimal.md)   |             | [optional] |
| **pricePerContainerHour**      | [**BigDecimal**](BigDecimal.md)   |             | [optional] |
| **pricePerServerHour**         | [**BigDecimal**](BigDecimal.md)   |             | [optional] |
| **sumNumberOfContainerHosts**  | **Integer**                       |             | [optional] |
| **sumNumberOfContainers**      | **Integer**                       |             | [optional] |
| **sumNumberOfServers**         | **Integer**                       |             | [optional] |
| **usageAmount**                | [**BigDecimal**](BigDecimal.md)   |             | [optional] |
| **usedPlan**                   | **String**                        |             | [optional] |
| **userDiscount**               | [**BigDecimal**](BigDecimal.md)   |             | [optional] |

<a name="PlanTypeEnum"></a>
## Enum: PlanTypeEnum
| Name        | Value                   |
| ----------- | ----------------------- |
| INFRA       | &quot;INFRA&quot;       |
| PER_AGENT   | &quot;PER_AGENT&quot;   |
| FIXED_PRICE | &quot;FIXED_PRICE&quot; |
| PER_VOLUME  | &quot;PER_VOLUME&quot;  |
