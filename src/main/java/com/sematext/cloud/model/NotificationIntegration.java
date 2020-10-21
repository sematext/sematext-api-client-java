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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * NotificationIntegration
 */

public class NotificationIntegration {
  /**
   * Gets or Sets applicability
   */
  @JsonAdapter(ApplicabilityEnum.Adapter.class)
  public enum ApplicabilityEnum {
    NONE("NONE"),
    
    USE_ALWAYS("USE_ALWAYS");

    private String value;

    ApplicabilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApplicabilityEnum fromValue(String text) {
      for (ApplicabilityEnum b : ApplicabilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ApplicabilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApplicabilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApplicabilityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ApplicabilityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("applicability")
  private ApplicabilityEnum applicability = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("createdByOwner")
  private Boolean createdByOwner = null;

  @SerializedName("creatorId")
  private Long creatorId = null;

  @SerializedName("id")
  private Long id = null;

  /**
   * Gets or Sets integrationType
   */
  @JsonAdapter(IntegrationTypeEnum.Adapter.class)
  public enum IntegrationTypeEnum {
    PAGER_DUTY("PAGER_DUTY"),
    
    NAGIOS("NAGIOS"),
    
    WEB_HOOKS("WEB_HOOKS"),
    
    WEB_HOOKS_TEMPLATE("WEB_HOOKS_TEMPLATE"),
    
    HIP_CHAT("HIP_CHAT"),
    
    EMAIL_LIST("EMAIL_LIST"),
    
    TEMPORARY_EMAIL_LIST("TEMPORARY_EMAIL_LIST");

    private String value;

    IntegrationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IntegrationTypeEnum fromValue(String text) {
      for (IntegrationTypeEnum b : IntegrationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IntegrationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IntegrationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IntegrationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IntegrationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("integrationType")
  private IntegrationTypeEnum integrationType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("params")
  private Map<String, String> params = null;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ACTIVE("ACTIVE"),
    
    DISABLED("DISABLED"),
    
    DELETED("DELETED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("userId")
  private Long userId = null;

  public NotificationIntegration applicability(ApplicabilityEnum applicability) {
    this.applicability = applicability;
    return this;
  }

   /**
   * Get applicability
   * @return applicability
  **/
  @ApiModelProperty(value = "")
  public ApplicabilityEnum getApplicability() {
    return applicability;
  }

  public void setApplicability(ApplicabilityEnum applicability) {
    this.applicability = applicability;
  }

  public NotificationIntegration createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public NotificationIntegration createdByOwner(Boolean createdByOwner) {
    this.createdByOwner = createdByOwner;
    return this;
  }

   /**
   * Get createdByOwner
   * @return createdByOwner
  **/
  @ApiModelProperty(value = "")
  public Boolean isCreatedByOwner() {
    return createdByOwner;
  }

  public void setCreatedByOwner(Boolean createdByOwner) {
    this.createdByOwner = createdByOwner;
  }

  public NotificationIntegration creatorId(Long creatorId) {
    this.creatorId = creatorId;
    return this;
  }

   /**
   * Get creatorId
   * @return creatorId
  **/
  @ApiModelProperty(value = "")
  public Long getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(Long creatorId) {
    this.creatorId = creatorId;
  }

  public NotificationIntegration id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public NotificationIntegration integrationType(IntegrationTypeEnum integrationType) {
    this.integrationType = integrationType;
    return this;
  }

   /**
   * Get integrationType
   * @return integrationType
  **/
  @ApiModelProperty(value = "")
  public IntegrationTypeEnum getIntegrationType() {
    return integrationType;
  }

  public void setIntegrationType(IntegrationTypeEnum integrationType) {
    this.integrationType = integrationType;
  }

  public NotificationIntegration name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NotificationIntegration params(Map<String, String> params) {
    this.params = params;
    return this;
  }

  public NotificationIntegration putParamsItem(String key, String paramsItem) {
    if (this.params == null) {
      this.params = new HashMap<>();
    }
    this.params.put(key, paramsItem);
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getParams() {
    return params;
  }

  public void setParams(Map<String, String> params) {
    this.params = params;
  }

  public NotificationIntegration state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public NotificationIntegration userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationIntegration notificationIntegration = (NotificationIntegration) o;
    return Objects.equals(this.applicability, notificationIntegration.applicability) &&
        Objects.equals(this.createDate, notificationIntegration.createDate) &&
        Objects.equals(this.createdByOwner, notificationIntegration.createdByOwner) &&
        Objects.equals(this.creatorId, notificationIntegration.creatorId) &&
        Objects.equals(this.id, notificationIntegration.id) &&
        Objects.equals(this.integrationType, notificationIntegration.integrationType) &&
        Objects.equals(this.name, notificationIntegration.name) &&
        Objects.equals(this.params, notificationIntegration.params) &&
        Objects.equals(this.state, notificationIntegration.state) &&
        Objects.equals(this.userId, notificationIntegration.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicability, createDate, createdByOwner, creatorId, id, integrationType, name, params, state, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationIntegration {\n");
    
    sb.append("    applicability: ").append(toIndentedString(applicability)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    createdByOwner: ").append(toIndentedString(createdByOwner)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

