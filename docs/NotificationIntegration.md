
# NotificationIntegration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicability** | [**ApplicabilityEnum**](#ApplicabilityEnum) |  |  [optional]
**createDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdByOwner** | **Boolean** |  |  [optional]
**creatorId** | **Long** |  |  [optional]
**id** | **Long** |  |  [optional]
**integrationType** | [**IntegrationTypeEnum**](#IntegrationTypeEnum) |  |  [optional]
**name** | **String** |  |  [optional]
**params** | **Map&lt;String, String&gt;** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**userId** | **Long** |  |  [optional]


<a name="ApplicabilityEnum"></a>
## Enum: ApplicabilityEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
USE_ALWAYS | &quot;USE_ALWAYS&quot;


<a name="IntegrationTypeEnum"></a>
## Enum: IntegrationTypeEnum
Name | Value
---- | -----
PAGER_DUTY | &quot;PAGER_DUTY&quot;
NAGIOS | &quot;NAGIOS&quot;
WEB_HOOKS | &quot;WEB_HOOKS&quot;
WEB_HOOKS_TEMPLATE | &quot;WEB_HOOKS_TEMPLATE&quot;
HIP_CHAT | &quot;HIP_CHAT&quot;
EMAIL_LIST | &quot;EMAIL_LIST&quot;
TEMPORARY_EMAIL_LIST | &quot;TEMPORARY_EMAIL_LIST&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
DISABLED | &quot;DISABLED&quot;
DELETED | &quot;DELETED&quot;



