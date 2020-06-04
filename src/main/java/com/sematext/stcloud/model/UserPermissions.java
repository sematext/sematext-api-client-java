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


package com.sematext.stcloud.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UserPermissions
 */

public class UserPermissions {
  @SerializedName("canDelete")
  private Boolean canDelete = null;

  @SerializedName("canEdit")
  private Boolean canEdit = null;

  @SerializedName("canView")
  private Boolean canView = null;

  public UserPermissions canDelete(Boolean canDelete) {
    this.canDelete = canDelete;
    return this;
  }

   /**
   * Get canDelete
   * @return canDelete
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanDelete() {
    return canDelete;
  }

  public void setCanDelete(Boolean canDelete) {
    this.canDelete = canDelete;
  }

  public UserPermissions canEdit(Boolean canEdit) {
    this.canEdit = canEdit;
    return this;
  }

   /**
   * Get canEdit
   * @return canEdit
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanEdit() {
    return canEdit;
  }

  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

  public UserPermissions canView(Boolean canView) {
    this.canView = canView;
    return this;
  }

   /**
   * Get canView
   * @return canView
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanView() {
    return canView;
  }

  public void setCanView(Boolean canView) {
    this.canView = canView;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPermissions userPermissions = (UserPermissions) o;
    return Objects.equals(this.canDelete, userPermissions.canDelete) &&
        Objects.equals(this.canEdit, userPermissions.canEdit) &&
        Objects.equals(this.canView, userPermissions.canView);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canDelete, canEdit, canView);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPermissions {\n");
    
    sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
    sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
    sb.append("    canView: ").append(toIndentedString(canView)).append("\n");
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

