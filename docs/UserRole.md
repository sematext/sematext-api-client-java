# UserRole

## Properties
| Name           | Type                                  | Description | Notes      |
| -------------- | ------------------------------------- | ----------- | ---------- |
| **role**       | [**RoleEnum**](#RoleEnum)             |             | [optional] |
| **roleStatus** | [**RoleStatusEnum**](#RoleStatusEnum) |             | [optional] |
| **userEmail**  | **String**                            |             | [optional] |

<a name="RoleEnum"></a>
## Enum: RoleEnum
| Name       | Value                  |
| ---------- | ---------------------- |
| SUPER_USER | &quot;SUPER_USER&quot; |
| OWNER      | &quot;OWNER&quot;      |
| ADMIN      | &quot;ADMIN&quot;      |
| USER       | &quot;USER&quot;       |
| DEMO       | &quot;DEMO&quot;       |
| ANONYMOUS  | &quot;ANONYMOUS&quot;  |

<a name="RoleStatusEnum"></a>
## Enum: RoleStatusEnum
| Name     | Value                |
| -------- | -------------------- |
| INACTIVE | &quot;INACTIVE&quot; |
| ACTIVE   | &quot;ACTIVE&quot;   |
