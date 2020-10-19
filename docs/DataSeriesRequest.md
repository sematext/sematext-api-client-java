
# DataSeriesRequest

## Properties
| Name                | Type                                                           | Description                                                                                                                                                                            | Notes      |
| ------------------- | -------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **defaultInterval** | **Long**                                                       |                                                                                                                                                                                        | [optional] |
| **end**             | **String**                                                     | End time of interval. Can be expressed as timestamp in milliseconds or UTC date in yyyy-MM-dd HH:mm:ss format                                                                          | [optional] |
| **filters**         | [**Map&lt;String, DataSeriesFilter&gt;**](DataSeriesFilter.md) | Map of allowed filter values and aggregation strategy. List of available filter values can be fetched using metric filters endpoint and default aggregation strategy depends on metric | [optional] |
| **granularity**     | [**GranularityEnum**](#GranularityEnum)                        | Data points interval granularity between two data points.Default value is \&quot;AUTO\&quot; - calculated based on selected time span. Not required while getting filters.             | [optional] |
| **interval**        | **String**                                                     |                                                                                                                                                                                        | [optional] |
| **metric**          | **String**                                                     | Metric name or metric group prefix                                                                                                                                                     |
| **start**           | **String**                                                     | Start time of interval. Can be expressed as timestamp in milliseconds or UTC date in yyyy-MM-dd HH:mm:ss format                                                                        | [optional] |


<a name="GranularityEnum"></a>
## Enum: GranularityEnum
| Name         | Value                    |
| ------------ | ------------------------ |
| AUTO         | &quot;AUTO&quot;         |
| ONE_MINUTE   | &quot;ONE_MINUTE&quot;   |
| FIVE_MINUTES | &quot;FIVE_MINUTES&quot; |
| HOUR         | &quot;HOUR&quot;         |
| DAY          | &quot;DAY&quot;          |
| WEEK         | &quot;WEEK&quot;         |
| MONTH        | &quot;MONTH&quot;        |
