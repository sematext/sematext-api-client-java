
# AppMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**awsCloudWatchAccessKey** | **String** |  |  [optional]
**awsCloudWatchSecretKey** | **String** |  |  [optional]
**awsFetchFrequency** | [**AwsFetchFrequencyEnum**](#AwsFetchFrequencyEnum) |  |  [optional]
**awsRegion** | [**AwsRegionEnum**](#AwsRegionEnum) |  |  [optional]
**subTypes** | [**List&lt;SubTypesEnum&gt;**](#List&lt;SubTypesEnum&gt;) | Comma separated list of AWS types monitored by created app |  [optional]


<a name="AwsFetchFrequencyEnum"></a>
## Enum: AwsFetchFrequencyEnum
Name | Value
---- | -----
MINUTE | &quot;MINUTE&quot;
FIVE_MINUTES | &quot;FIVE_MINUTES&quot;
FIFTEEN_MINUTES | &quot;FIFTEEN_MINUTES&quot;


<a name="AwsRegionEnum"></a>
## Enum: AwsRegionEnum
Name | Value
---- | -----
US_EAST_1 | &quot;US_EAST_1&quot;
US_WEST_1 | &quot;US_WEST_1&quot;
EU_WEST_1 | &quot;EU_WEST_1&quot;
US_WEST_2 | &quot;US_WEST_2&quot;
AP_SOUTHEAST_1 | &quot;AP_SOUTHEAST_1&quot;
AP_SOUTHEAST_2 | &quot;AP_SOUTHEAST_2&quot;
AP_NORTHEAST_1 | &quot;AP_NORTHEAST_1&quot;
SA_EAST_1 | &quot;SA_EAST_1&quot;
GOVCLOUD | &quot;GovCloud&quot;
CN_NORTH_1 | &quot;CN_NORTH_1&quot;
US_EAST_2 | &quot;US_EAST_2&quot;
AP_SOUTH_1 | &quot;AP_SOUTH_1&quot;
AP_NORTHEAST_2 | &quot;AP_NORTHEAST_2&quot;
CA_CENTRAL_1 | &quot;CA_CENTRAL_1&quot;
EU_CENTRAL_1 | &quot;EU_CENTRAL_1&quot;
EU_WEST_2 | &quot;EU_WEST_2&quot;


<a name="List<SubTypesEnum>"></a>
## Enum: List&lt;SubTypesEnum&gt;
Name | Value
---- | -----
EC2 | &quot;aws_ec2&quot;
ELB | &quot;aws_elb&quot;
EBS | &quot;aws_ebs&quot;



