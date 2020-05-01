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


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AppMetadata;
import java.io.IOException;

/**
 * CreateAppInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-02T03:09:37.790+12:00")
public class CreateAppInfo {
  @SerializedName("appType")
  private String appType = null;

  @SerializedName("discountCode")
  private String discountCode = null;

  @SerializedName("initialPlanId")
  private Long initialPlanId = null;

  @SerializedName("metaData")
  private AppMetadata metaData = null;

  @SerializedName("name")
  private String name = null;

  public CreateAppInfo appType(String appType) {
    this.appType = appType;
    return this;
  }

   /**
   * Get appType
   * @return appType
  **/
  @ApiModelProperty(example = "aws", value = "")
  public String getAppType() {
    return appType;
  }

  public void setAppType(String appType) {
    this.appType = appType;
  }

  public CreateAppInfo discountCode(String discountCode) {
    this.discountCode = discountCode;
    return this;
  }

   /**
   * Get discountCode
   * @return discountCode
  **/
  @ApiModelProperty(value = "")
  public String getDiscountCode() {
    return discountCode;
  }

  public void setDiscountCode(String discountCode) {
    this.discountCode = discountCode;
  }

  public CreateAppInfo initialPlanId(Long initialPlanId) {
    this.initialPlanId = initialPlanId;
    return this;
  }

   /**
   * Get initialPlanId
   * @return initialPlanId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getInitialPlanId() {
    return initialPlanId;
  }

  public void setInitialPlanId(Long initialPlanId) {
    this.initialPlanId = initialPlanId;
  }

  public CreateAppInfo metaData(AppMetadata metaData) {
    this.metaData = metaData;
    return this;
  }

   /**
   * AWS app meta data. Applicable only for &#x60;aws&#x60; appType
   * @return metaData
  **/
  @ApiModelProperty(value = "AWS app meta data. Applicable only for `aws` appType")
  public AppMetadata getMetaData() {
    return metaData;
  }

  public void setMetaData(AppMetadata metaData) {
    this.metaData = metaData;
  }

  public CreateAppInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "new-aws-app-1", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAppInfo createAppInfo = (CreateAppInfo) o;
    return Objects.equals(this.appType, createAppInfo.appType) &&
        Objects.equals(this.discountCode, createAppInfo.discountCode) &&
        Objects.equals(this.initialPlanId, createAppInfo.initialPlanId) &&
        Objects.equals(this.metaData, createAppInfo.metaData) &&
        Objects.equals(this.name, createAppInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appType, discountCode, initialPlanId, metaData, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAppInfo {\n");
    
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    discountCode: ").append(toIndentedString(discountCode)).append("\n");
    sb.append("    initialPlanId: ").append(toIndentedString(initialPlanId)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

