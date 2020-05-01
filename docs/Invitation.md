
# Invitation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app** | [**App**](App.md) | For invite request, only app.id needs to be set. |  [optional]
**apps** | [**List&lt;App&gt;**](App.md) | For invite request, only apps.id needs to be set. |  [optional]
**id** | **Long** |  |  [optional]
**inviteDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**inviteStatus** | [**InviteStatusEnum**](#InviteStatusEnum) |  |  [optional]
**inviteeEmail** | **String** |  |  [optional]
**inviteeRole** | [**InviteeRoleEnum**](#InviteeRoleEnum) |  |  [optional]
**inviteeStatus** | [**InviteeStatusEnum**](#InviteeStatusEnum) |  |  [optional]
**inviterEmail** | **String** |  |  [optional]
**uuid** | **String** |  |  [optional]


<a name="InviteStatusEnum"></a>
## Enum: InviteStatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
ACCEPTED | &quot;ACCEPTED&quot;
CANCELLED | &quot;CANCELLED&quot;
DECLINED | &quot;DECLINED&quot;


<a name="InviteeRoleEnum"></a>
## Enum: InviteeRoleEnum
Name | Value
---- | -----
SUPER_USER | &quot;SUPER_USER&quot;
OWNER | &quot;OWNER&quot;
ADMIN | &quot;ADMIN&quot;
USER | &quot;USER&quot;
DEMO | &quot;DEMO&quot;
ANONYMOUS | &quot;ANONYMOUS&quot;


<a name="InviteeStatusEnum"></a>
## Enum: InviteeStatusEnum
Name | Value
---- | -----
INACTIVE | &quot;INACTIVE&quot;
ACTIVE | &quot;ACTIVE&quot;



