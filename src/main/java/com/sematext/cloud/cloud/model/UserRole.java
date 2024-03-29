/*
 * Sematext Cloud API
 * API Explorer provides access and documentation for Sematext REST API. The REST API requires the API Key to be sent as part of `Authorization` header. E.g.: `Authorization : apiKey e5f18450-205a-48eb-8589-7d49edaea813`.
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.sematext.cloud.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UserRole
 */


public class UserRole {
  /**
   * Gets or Sets role
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    SUPER_USER("SUPER_USER"),
    OWNER("OWNER"),
    ADMIN("ADMIN"),
    USER("USER"),
    DEMO("DEMO"),
    ANONYMOUS("ANONYMOUS");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RoleEnum fromValue(String input) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RoleEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("role")
  private RoleEnum role = null;

  /**
   * Gets or Sets roleStatus
   */
  @JsonAdapter(RoleStatusEnum.Adapter.class)
  public enum RoleStatusEnum {
    INACTIVE("INACTIVE"),
    ACTIVE("ACTIVE");

    private String value;

    RoleStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RoleStatusEnum fromValue(String input) {
      for (RoleStatusEnum b : RoleStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RoleStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleStatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RoleStatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RoleStatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("roleStatus")
  private RoleStatusEnum roleStatus = null;

  @SerializedName("userEmail")
  private String userEmail = null;

  public UserRole role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @Schema(description = "")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public UserRole roleStatus(RoleStatusEnum roleStatus) {
    this.roleStatus = roleStatus;
    return this;
  }

   /**
   * Get roleStatus
   * @return roleStatus
  **/
  @Schema(description = "")
  public RoleStatusEnum getRoleStatus() {
    return roleStatus;
  }

  public void setRoleStatus(RoleStatusEnum roleStatus) {
    this.roleStatus = roleStatus;
  }

  public UserRole userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

   /**
   * Get userEmail
   * @return userEmail
  **/
  @Schema(description = "")
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRole userRole = (UserRole) o;
    return Objects.equals(this.role, userRole.role) &&
        Objects.equals(this.roleStatus, userRole.roleStatus) &&
        Objects.equals(this.userEmail, userRole.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, roleStatus, userEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRole {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    roleStatus: ").append(toIndentedString(roleStatus)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
