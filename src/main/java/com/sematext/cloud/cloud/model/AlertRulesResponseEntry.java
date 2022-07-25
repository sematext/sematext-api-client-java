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
import java.util.ArrayList;
import java.util.List;
/**
 * AlertRulesResponseEntry
 */


public class AlertRulesResponseEntry {
  @SerializedName("alertRules")
  private List<AlertRule> alertRules = null;

  public AlertRulesResponseEntry alertRules(List<AlertRule> alertRules) {
    this.alertRules = alertRules;
    return this;
  }

  public AlertRulesResponseEntry addAlertRulesItem(AlertRule alertRulesItem) {
    if (this.alertRules == null) {
      this.alertRules = new ArrayList<>();
    }
    this.alertRules.add(alertRulesItem);
    return this;
  }

   /**
   * Get alertRules
   * @return alertRules
  **/
  @Schema(description = "")
  public List<AlertRule> getAlertRules() {
    return alertRules;
  }

  public void setAlertRules(List<AlertRule> alertRules) {
    this.alertRules = alertRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertRulesResponseEntry alertRulesResponseEntry = (AlertRulesResponseEntry) o;
    return Objects.equals(this.alertRules, alertRulesResponseEntry.alertRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertRulesResponseEntry {\n");
    
    sb.append("    alertRules: ").append(toIndentedString(alertRules)).append("\n");
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