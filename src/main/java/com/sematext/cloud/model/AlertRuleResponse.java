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
import com.sematext.cloud.model.AlertRuleResponseEntry;
import com.sematext.cloud.model.Error;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AlertRuleResponse
 */


public class AlertRuleResponse {
  @SerializedName("data")
  private AlertRuleResponseEntry data = null;

  @SerializedName("errors")
  private List<Error> errors = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("success")
  private Boolean success = null;

  public AlertRuleResponse data(AlertRuleResponseEntry data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public AlertRuleResponseEntry getData() {
    return data;
  }

  public void setData(AlertRuleResponseEntry data) {
    this.data = data;
  }

  public AlertRuleResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public AlertRuleResponse addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @Schema(description = "")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public AlertRuleResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AlertRuleResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @Schema(description = "")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertRuleResponse alertRuleResponse = (AlertRuleResponse) o;
    return Objects.equals(this.data, alertRuleResponse.data) &&
        Objects.equals(this.errors, alertRuleResponse.errors) &&
        Objects.equals(this.message, alertRuleResponse.message) &&
        Objects.equals(this.success, alertRuleResponse.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors, message, success);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertRuleResponse {\n");

    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
