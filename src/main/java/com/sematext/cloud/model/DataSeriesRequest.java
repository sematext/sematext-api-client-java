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
import com.sematext.cloud.model.DataSeriesFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DataSeriesRequest
 */

public class DataSeriesRequest {
  @SerializedName("defaultInterval")
  private Long defaultInterval = null;

  @SerializedName("end")
  private String end = null;

  @SerializedName("filters")
  private Map<String, DataSeriesFilter> filters = null;

  /**
   * Data points interval granularity between two data points.Default value is \&quot;AUTO\&quot; - calculated based on selected time span. Not required while getting filters.
   */
  @JsonAdapter(GranularityEnum.Adapter.class)
  public enum GranularityEnum {
    AUTO("AUTO"),
    
    ONE_MINUTE("ONE_MINUTE"),
    
    FIVE_MINUTES("FIVE_MINUTES"),
    
    HOUR("HOUR"),
    
    DAY("DAY"),
    
    WEEK("WEEK"),
    
    MONTH("MONTH");

    private String value;

    GranularityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GranularityEnum fromValue(String text) {
      for (GranularityEnum b : GranularityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GranularityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GranularityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GranularityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GranularityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("granularity")
  private GranularityEnum granularity = null;

  @SerializedName("interval")
  private String interval = null;

  @SerializedName("metric")
  private String metric = null;

  @SerializedName("start")
  private String start = null;

  public DataSeriesRequest defaultInterval(Long defaultInterval) {
    this.defaultInterval = defaultInterval;
    return this;
  }

   /**
   * Get defaultInterval
   * @return defaultInterval
  **/
  @ApiModelProperty(value = "")
  public Long getDefaultInterval() {
    return defaultInterval;
  }

  public void setDefaultInterval(Long defaultInterval) {
    this.defaultInterval = defaultInterval;
  }

  public DataSeriesRequest end(String end) {
    this.end = end;
    return this;
  }

   /**
   * End time of interval. Can be expressed as timestamp in milliseconds or UTC date in yyyy-MM-dd HH:mm:ss format
   * @return end
  **/
  @ApiModelProperty(value = "End time of interval. Can be expressed as timestamp in milliseconds or UTC date in yyyy-MM-dd HH:mm:ss format")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public DataSeriesRequest filters(Map<String, DataSeriesFilter> filters) {
    this.filters = filters;
    return this;
  }

  public DataSeriesRequest putFiltersItem(String key, DataSeriesFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new HashMap<>();
    }
    this.filters.put(key, filtersItem);
    return this;
  }

   /**
   * Map of allowed filter values and aggregation strategy. List of available filter values can be fetched using metric filters endpoint and default aggregation strategy depends on metric
   * @return filters
  **/
  @ApiModelProperty(value = "Map of allowed filter values and aggregation strategy. List of available filter values can be fetched using metric filters endpoint and default aggregation strategy depends on metric")
  public Map<String, DataSeriesFilter> getFilters() {
    return filters;
  }

  public void setFilters(Map<String, DataSeriesFilter> filters) {
    this.filters = filters;
  }

  public DataSeriesRequest granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }

   /**
   * Data points interval granularity between two data points.Default value is \&quot;AUTO\&quot; - calculated based on selected time span. Not required while getting filters.
   * @return granularity
  **/
  @ApiModelProperty(value = "Data points interval granularity between two data points.Default value is \"AUTO\" - calculated based on selected time span. Not required while getting filters.")
  public GranularityEnum getGranularity() {
    return granularity;
  }

  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }

  public DataSeriesRequest interval(String interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @ApiModelProperty(value = "")
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public DataSeriesRequest metric(String metric) {
    this.metric = metric;
    return this;
  }

   /**
   * Metric name or metric group prefix
   * @return metric
  **/
  @ApiModelProperty(required = true, value = "Metric name or metric group prefix")
  public String getMetric() {
    return metric;
  }

  public void setMetric(String metric) {
    this.metric = metric;
  }

  public DataSeriesRequest start(String start) {
    this.start = start;
    return this;
  }

   /**
   * Start time of interval. Can be expressed as timestamp in milliseconds or UTC date in yyyy-MM-dd HH:mm:ss format
   * @return start
  **/
  @ApiModelProperty(value = "Start time of interval. Can be expressed as timestamp in milliseconds or UTC date in yyyy-MM-dd HH:mm:ss format")
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSeriesRequest dataSeriesRequest = (DataSeriesRequest) o;
    return Objects.equals(this.defaultInterval, dataSeriesRequest.defaultInterval) &&
        Objects.equals(this.end, dataSeriesRequest.end) &&
        Objects.equals(this.filters, dataSeriesRequest.filters) &&
        Objects.equals(this.granularity, dataSeriesRequest.granularity) &&
        Objects.equals(this.interval, dataSeriesRequest.interval) &&
        Objects.equals(this.metric, dataSeriesRequest.metric) &&
        Objects.equals(this.start, dataSeriesRequest.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultInterval, end, filters, granularity, interval, metric, start);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSeriesRequest {\n");
    
    sb.append("    defaultInterval: ").append(toIndentedString(defaultInterval)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
