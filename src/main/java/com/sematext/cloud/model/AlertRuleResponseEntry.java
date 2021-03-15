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
import com.sematext.cloud.model.AlertRule;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AlertRuleResponseEntry
 */


public class AlertRuleResponseEntry {
  @SerializedName("alertRule")
  private AlertRule alertRule = null;

  public AlertRuleResponseEntry alertRule(AlertRule alertRule) {
    this.alertRule = alertRule;
    return this;
  }

   /**
   * Get alertRule
   * @return alertRule
  **/
  @Schema(description = "")
  public AlertRule getAlertRule() {
    return alertRule;
  }

  public void setAlertRule(AlertRule alertRule) {
    this.alertRule = alertRule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertRuleResponseEntry alertRuleResponseEntry = (AlertRuleResponseEntry) o;
    return Objects.equals(this.alertRule, alertRuleResponseEntry.alertRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertRule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertRuleResponseEntry {\n");
    
    sb.append("    alertRule: ").append(toIndentedString(alertRule)).append("\n");
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
