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
 * AlertNotification
 */


public class AlertNotification {
  @SerializedName("appName")
  private String appName = null;

  @SerializedName("appType")
  private String appType = null;

  @SerializedName("backToNormal")
  private Boolean backToNormal = null;

  @SerializedName("createTime")
  private String createTime = null;

  @SerializedName("sent")
  private Boolean sent = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("when")
  private String when = null;

  public AlertNotification appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * Get appName
   * @return appName
  **/
  @Schema(description = "")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public AlertNotification appType(String appType) {
    this.appType = appType;
    return this;
  }

   /**
   * Get appType
   * @return appType
  **/
  @Schema(description = "")
  public String getAppType() {
    return appType;
  }

  public void setAppType(String appType) {
    this.appType = appType;
  }

  public AlertNotification backToNormal(Boolean backToNormal) {
    this.backToNormal = backToNormal;
    return this;
  }

   /**
   * Get backToNormal
   * @return backToNormal
  **/
  @Schema(description = "")
  public Boolean isBackToNormal() {
    return backToNormal;
  }

  public void setBackToNormal(Boolean backToNormal) {
    this.backToNormal = backToNormal;
  }

  public AlertNotification createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public AlertNotification sent(Boolean sent) {
    this.sent = sent;
    return this;
  }

   /**
   * Get sent
   * @return sent
  **/
  @Schema(description = "")
  public Boolean isSent() {
    return sent;
  }

  public void setSent(Boolean sent) {
    this.sent = sent;
  }

  public AlertNotification text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @Schema(description = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public AlertNotification when(String when) {
    this.when = when;
    return this;
  }

   /**
   * Get when
   * @return when
  **/
  @Schema(description = "")
  public String getWhen() {
    return when;
  }

  public void setWhen(String when) {
    this.when = when;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertNotification alertNotification = (AlertNotification) o;
    return Objects.equals(this.appName, alertNotification.appName) &&
        Objects.equals(this.appType, alertNotification.appType) &&
        Objects.equals(this.backToNormal, alertNotification.backToNormal) &&
        Objects.equals(this.createTime, alertNotification.createTime) &&
        Objects.equals(this.sent, alertNotification.sent) &&
        Objects.equals(this.text, alertNotification.text) &&
        Objects.equals(this.when, alertNotification.when);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, appType, backToNormal, createTime, sent, text, when);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertNotification {\n");
    
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    backToNormal: ").append(toIndentedString(backToNormal)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
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