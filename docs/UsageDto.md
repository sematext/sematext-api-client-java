# UsageDto

## Properties
| Name                   | Type                                                          | Description | Notes      |
| ---------------------- | ------------------------------------------------------------- | ----------- | ---------- |
| **count**              | **Long**                                                      |             | [optional] |
| **dailyUsage**         | [**List&lt;DailyDto&gt;**](DailyDto.md)                       |             | [optional] |
| **dailyVolumeMB**      | **Long**                                                      |             | [optional] |
| **end**                | [**OffsetDateTime**](OffsetDateTime.md)                       |             | [optional] |
| **failedCount**        | **Long**                                                      |             | [optional] |
| **limitChangeEvents**  | [**List&lt;LimitChangeEventDTO&gt;**](LimitChangeEventDTO.md) |             | [optional] |
| **maxAllowedMB**       | **Long**                                                      |             | [optional] |
| **maxLimitMB**         | **Long**                                                      |             | [optional] |
| **start**              | [**OffsetDateTime**](OffsetDateTime.md)                       |             | [optional] |
| **volume**             | **Long**                                                      |             | [optional] |
| **volumeChangeEvents** | [**List&lt;LimitChangeEventDTO&gt;**](LimitChangeEventDTO.md) |             | [optional] |
