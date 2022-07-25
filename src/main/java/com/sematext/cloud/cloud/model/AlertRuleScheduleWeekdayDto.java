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
import com.sematext.cloud.model.AlertRuleScheduleTimeRangeDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AlertRuleScheduleWeekdayDto
 */


public class AlertRuleScheduleWeekdayDto {
  @SerializedName("day")
  private String day = null;

  @SerializedName("index")
  private Integer index = null;

  @SerializedName("intervals")
  private List<AlertRuleScheduleTimeRangeDto> intervals = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("type")
  private String type = null;

  public AlertRuleScheduleWeekdayDto day(String day) {
    this.day = day;
    return this;
  }

   /**
   * Get day
   * @return day
  **/
  @Schema(description = "")
  public String getDay() {
    return day;
  }

  public void setDay(String day) {
    this.day = day;
  }

  public AlertRuleScheduleWeekdayDto index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @Schema(description = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public AlertRuleScheduleWeekdayDto intervals(List<AlertRuleScheduleTimeRangeDto> intervals) {
    this.intervals = intervals;
    return this;
  }

  public AlertRuleScheduleWeekdayDto addIntervalsItem(AlertRuleScheduleTimeRangeDto intervalsItem) {
    if (this.intervals == null) {
      this.intervals = new ArrayList<>();
    }
    this.intervals.add(intervalsItem);
    return this;
  }

   /**
   * Get intervals
   * @return intervals
  **/
  @Schema(description = "")
  public List<AlertRuleScheduleTimeRangeDto> getIntervals() {
    return intervals;
  }

  public void setIntervals(List<AlertRuleScheduleTimeRangeDto> intervals) {
    this.intervals = intervals;
  }

  public AlertRuleScheduleWeekdayDto label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @Schema(description = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public AlertRuleScheduleWeekdayDto type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertRuleScheduleWeekdayDto alertRuleScheduleWeekdayDto = (AlertRuleScheduleWeekdayDto) o;
    return Objects.equals(this.day, alertRuleScheduleWeekdayDto.day) &&
        Objects.equals(this.index, alertRuleScheduleWeekdayDto.index) &&
        Objects.equals(this.intervals, alertRuleScheduleWeekdayDto.intervals) &&
        Objects.equals(this.label, alertRuleScheduleWeekdayDto.label) &&
        Objects.equals(this.type, alertRuleScheduleWeekdayDto.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, index, intervals, label, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertRuleScheduleWeekdayDto {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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