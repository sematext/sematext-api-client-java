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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdateAppInfo
 */

public class UpdateAppInfo {
  @SerializedName("description")
  private String description = null;

  @SerializedName("ignorePercentage")
  private Double ignorePercentage = null;

  @SerializedName("maxEvents")
  private Long maxEvents = null;

  @SerializedName("maxLimitMB")
  private Long maxLimitMB = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("sampling")
  private Boolean sampling = null;

  @SerializedName("samplingPercentage")
  private Integer samplingPercentage = null;

  @SerializedName("staggering")
  private Boolean staggering = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    DISABLED("DISABLED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  public UpdateAppInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "New Description of App", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateAppInfo ignorePercentage(Double ignorePercentage) {
    this.ignorePercentage = ignorePercentage;
    return this;
  }

   /**
   * Get ignorePercentage
   * @return ignorePercentage
  **/
  @ApiModelProperty(example = "1.0", value = "")
  public Double getIgnorePercentage() {
    return ignorePercentage;
  }

  public void setIgnorePercentage(Double ignorePercentage) {
    this.ignorePercentage = ignorePercentage;
  }

  public UpdateAppInfo maxEvents(Long maxEvents) {
    this.maxEvents = maxEvents;
    return this;
  }

   /**
   * Get maxEvents
   * @return maxEvents
  **/
  @ApiModelProperty(example = "1000", value = "")
  public Long getMaxEvents() {
    return maxEvents;
  }

  public void setMaxEvents(Long maxEvents) {
    this.maxEvents = maxEvents;
  }

  public UpdateAppInfo maxLimitMB(Long maxLimitMB) {
    this.maxLimitMB = maxLimitMB;
    return this;
  }

   /**
   * Get maxLimitMB
   * @return maxLimitMB
  **/
  @ApiModelProperty(example = "10", value = "")
  public Long getMaxLimitMB() {
    return maxLimitMB;
  }

  public void setMaxLimitMB(Long maxLimitMB) {
    this.maxLimitMB = maxLimitMB;
  }

  public UpdateAppInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "New Name", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateAppInfo sampling(Boolean sampling) {
    this.sampling = sampling;
    return this;
  }

   /**
   * Get sampling
   * @return sampling
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isSampling() {
    return sampling;
  }

  public void setSampling(Boolean sampling) {
    this.sampling = sampling;
  }

  public UpdateAppInfo samplingPercentage(Integer samplingPercentage) {
    this.samplingPercentage = samplingPercentage;
    return this;
  }

   /**
   * Get samplingPercentage
   * @return samplingPercentage
  **/
  @ApiModelProperty(example = "10", value = "")
  public Integer getSamplingPercentage() {
    return samplingPercentage;
  }

  public void setSamplingPercentage(Integer samplingPercentage) {
    this.samplingPercentage = samplingPercentage;
  }

  public UpdateAppInfo staggering(Boolean staggering) {
    this.staggering = staggering;
    return this;
  }

   /**
   * Get staggering
   * @return staggering
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isStaggering() {
    return staggering;
  }

  public void setStaggering(Boolean staggering) {
    this.staggering = staggering;
  }

  public UpdateAppInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "ACTIVE", value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAppInfo updateAppInfo = (UpdateAppInfo) o;
    return Objects.equals(this.description, updateAppInfo.description) &&
        Objects.equals(this.ignorePercentage, updateAppInfo.ignorePercentage) &&
        Objects.equals(this.maxEvents, updateAppInfo.maxEvents) &&
        Objects.equals(this.maxLimitMB, updateAppInfo.maxLimitMB) &&
        Objects.equals(this.name, updateAppInfo.name) &&
        Objects.equals(this.sampling, updateAppInfo.sampling) &&
        Objects.equals(this.samplingPercentage, updateAppInfo.samplingPercentage) &&
        Objects.equals(this.staggering, updateAppInfo.staggering) &&
        Objects.equals(this.status, updateAppInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, ignorePercentage, maxEvents, maxLimitMB, name, sampling, samplingPercentage, staggering, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAppInfo {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ignorePercentage: ").append(toIndentedString(ignorePercentage)).append("\n");
    sb.append("    maxEvents: ").append(toIndentedString(maxEvents)).append("\n");
    sb.append("    maxLimitMB: ").append(toIndentedString(maxLimitMB)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sampling: ").append(toIndentedString(sampling)).append("\n");
    sb.append("    samplingPercentage: ").append(toIndentedString(samplingPercentage)).append("\n");
    sb.append("    staggering: ").append(toIndentedString(staggering)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

