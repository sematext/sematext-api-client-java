# BasicOrganizationDto

## Properties

| Name            | Type                                                        | Description | Notes      |
| --------------- | ----------------------------------------------------------- | ----------- | ---------- |
| **authMethods** | [**List&lt;BasicAuthMethodDto&gt;**](BasicAuthMethodDto.md) |             | [optional] |
| **name**        | **String**                                                  |             | [optional] |
| **status**      | [**StatusEnum**](#StatusEnum)                               |             | [optional] |
| **uuid**        | **String**                                                  |             | [optional] |

<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name            | Value                       |
| --------------- | --------------------------- |
| ACTIVE          | &quot;ACTIVE&quot;          |
| IN_REGISTRATION | &quot;IN_REGISTRATION&quot; |
| DISABLED        | &quot;DISABLED&quot;        |
| EXPIRED         | &quot;EXPIRED&quot;         |
| INVITED         | &quot;INVITED&quot;         |
| DEMO            | &quot;DEMO&quot;            |
