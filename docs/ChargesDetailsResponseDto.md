# ChargesDetailsResponseDto

## Properties

| Name                 | Type                                                        | Description | Notes      |
| -------------------- | ----------------------------------------------------------- | ----------- | ---------- |
| **app**              | [**App**](App.md)                                           |             | [optional] |
| **chargeBase**       | [**ChargeBaseEnum**](#ChargeBaseEnum)                       |             | [optional] |
| **dayUsageData**     | [**List&lt;DayUsageData&gt;**](DayUsageData.md)             |             | [optional] |
| **monthlyFeeAmount** | [**BigDecimal**](BigDecimal.md)                             |             | [optional] |
| **periodFeePeriods** | [**List&lt;MinPeriodFeePeriod&gt;**](MinPeriodFeePeriod.md) |             | [optional] |
| **totalAmount**      | [**BigDecimal**](BigDecimal.md)                             |             | [optional] |
| **usageAmount**      | [**BigDecimal**](BigDecimal.md)                             |             | [optional] |

<a name="ChargeBaseEnum"></a>

## Enum: ChargeBaseEnum

| Name              | Value                         |
| ----------------- | ----------------------------- |
| SUMMARIZED_USAGE  | &quot;SUMMARIZED_USAGE&quot;  |
| MIN_MONTHLY_FEE   | &quot;MIN_MONTHLY_FEE&quot;   |
| SUM_OF_DAILY_FEES | &quot;SUM_OF_DAILY_FEES&quot; |
| TOTAL_MONTHLY_FEE | &quot;TOTAL_MONTHLY_FEE&quot; |
