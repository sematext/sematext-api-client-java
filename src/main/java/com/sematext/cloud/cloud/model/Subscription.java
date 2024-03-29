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
import com.sematext.cloud.model.UserPermissions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.OffsetDateTime;
/**
 * Subscription
 */


public class Subscription {
  @SerializedName("additionalParams")
  private String additionalParams = null;

  @SerializedName("addresses")
  private String addresses = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("dashboardId")
  private Long dashboardId = null;

  @SerializedName("dashboardName")
  private String dashboardName = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("filters")
  private String filters = null;

  /**
   * Gets or Sets frequency
   */
  @JsonAdapter(FrequencyEnum.Adapter.class)
  public enum FrequencyEnum {
    EVERY_FIVE_MINUTES("EVERY_FIVE_MINUTES"),
    DAILY("DAILY"),
    WEEKLY("WEEKLY"),
    MONTHLY("MONTHLY"),
    QUARTERLY("QUARTERLY");

    private String value;

    FrequencyEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FrequencyEnum fromValue(String input) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FrequencyEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public FrequencyEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return FrequencyEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("frequency")
  private FrequencyEnum frequency = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("nextSendDate")
  private OffsetDateTime nextSendDate = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("systemId")
  private Long systemId = null;

  @SerializedName("systemName")
  private String systemName = null;

  @SerializedName("text")
  private String text = null;

  /**
   * Gets or Sets timeRange
   */
  @JsonAdapter(TimeRangeEnum.Adapter.class)
  public enum TimeRangeEnum {
    ONE_DAY("ONE_DAY"),
    ONE_WEEK("ONE_WEEK"),
    ONE_MONTH("ONE_MONTH"),
    TWO_MONTH("TWO_MONTH"),
    SIX_MONTH("SIX_MONTH"),
    ONE_YEAR("ONE_YEAR");

    private String value;

    TimeRangeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TimeRangeEnum fromValue(String input) {
      for (TimeRangeEnum b : TimeRangeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TimeRangeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeRangeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TimeRangeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TimeRangeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("timeRange")
  private TimeRangeEnum timeRange = null;

  @SerializedName("userPermissions")
  private UserPermissions userPermissions = null;

  public Subscription additionalParams(String additionalParams) {
    this.additionalParams = additionalParams;
    return this;
  }

   /**
   * Get additionalParams
   * @return additionalParams
  **/
  @Schema(description = "")
  public String getAdditionalParams() {
    return additionalParams;
  }

  public void setAdditionalParams(String additionalParams) {
    this.additionalParams = additionalParams;
  }

  public Subscription addresses(String addresses) {
    this.addresses = addresses;
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @Schema(description = "")
  public String getAddresses() {
    return addresses;
  }

  public void setAddresses(String addresses) {
    this.addresses = addresses;
  }

  public Subscription createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Schema(description = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Subscription dashboardId(Long dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

   /**
   * Get dashboardId
   * @return dashboardId
  **/
  @Schema(description = "")
  public Long getDashboardId() {
    return dashboardId;
  }

  public void setDashboardId(Long dashboardId) {
    this.dashboardId = dashboardId;
  }

  public Subscription dashboardName(String dashboardName) {
    this.dashboardName = dashboardName;
    return this;
  }

   /**
   * Get dashboardName
   * @return dashboardName
  **/
  @Schema(description = "")
  public String getDashboardName() {
    return dashboardName;
  }

  public void setDashboardName(String dashboardName) {
    this.dashboardName = dashboardName;
  }

  public Subscription enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public Subscription filters(String filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @Schema(description = "")
  public String getFilters() {
    return filters;
  }

  public void setFilters(String filters) {
    this.filters = filters;
  }

  public Subscription frequency(FrequencyEnum frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @Schema(description = "")
  public FrequencyEnum getFrequency() {
    return frequency;
  }

  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }

  public Subscription id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Subscription nextSendDate(OffsetDateTime nextSendDate) {
    this.nextSendDate = nextSendDate;
    return this;
  }

   /**
   * Get nextSendDate
   * @return nextSendDate
  **/
  @Schema(description = "")
  public OffsetDateTime getNextSendDate() {
    return nextSendDate;
  }

  public void setNextSendDate(OffsetDateTime nextSendDate) {
    this.nextSendDate = nextSendDate;
  }

  public Subscription subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @Schema(description = "")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Subscription systemId(Long systemId) {
    this.systemId = systemId;
    return this;
  }

   /**
   * Get systemId
   * @return systemId
  **/
  @Schema(description = "")
  public Long getSystemId() {
    return systemId;
  }

  public void setSystemId(Long systemId) {
    this.systemId = systemId;
  }

  public Subscription systemName(String systemName) {
    this.systemName = systemName;
    return this;
  }

   /**
   * Get systemName
   * @return systemName
  **/
  @Schema(description = "")
  public String getSystemName() {
    return systemName;
  }

  public void setSystemName(String systemName) {
    this.systemName = systemName;
  }

  public Subscription text(String text) {
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

  public Subscription timeRange(TimeRangeEnum timeRange) {
    this.timeRange = timeRange;
    return this;
  }

   /**
   * Get timeRange
   * @return timeRange
  **/
  @Schema(description = "")
  public TimeRangeEnum getTimeRange() {
    return timeRange;
  }

  public void setTimeRange(TimeRangeEnum timeRange) {
    this.timeRange = timeRange;
  }

  public Subscription userPermissions(UserPermissions userPermissions) {
    this.userPermissions = userPermissions;
    return this;
  }

   /**
   * Get userPermissions
   * @return userPermissions
  **/
  @Schema(description = "")
  public UserPermissions getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(UserPermissions userPermissions) {
    this.userPermissions = userPermissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.additionalParams, subscription.additionalParams) &&
        Objects.equals(this.addresses, subscription.addresses) &&
        Objects.equals(this.createdBy, subscription.createdBy) &&
        Objects.equals(this.dashboardId, subscription.dashboardId) &&
        Objects.equals(this.dashboardName, subscription.dashboardName) &&
        Objects.equals(this.enabled, subscription.enabled) &&
        Objects.equals(this.filters, subscription.filters) &&
        Objects.equals(this.frequency, subscription.frequency) &&
        Objects.equals(this.id, subscription.id) &&
        Objects.equals(this.nextSendDate, subscription.nextSendDate) &&
        Objects.equals(this.subject, subscription.subject) &&
        Objects.equals(this.systemId, subscription.systemId) &&
        Objects.equals(this.systemName, subscription.systemName) &&
        Objects.equals(this.text, subscription.text) &&
        Objects.equals(this.timeRange, subscription.timeRange) &&
        Objects.equals(this.userPermissions, subscription.userPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalParams, addresses, createdBy, dashboardId, dashboardName, enabled, filters, frequency, id, nextSendDate, subject, systemId, systemName, text, timeRange, userPermissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    
    sb.append("    additionalParams: ").append(toIndentedString(additionalParams)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
    sb.append("    dashboardName: ").append(toIndentedString(dashboardName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nextSendDate: ").append(toIndentedString(nextSendDate)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
    sb.append("    systemName: ").append(toIndentedString(systemName)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
    sb.append("    userPermissions: ").append(toIndentedString(userPermissions)).append("\n");
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
