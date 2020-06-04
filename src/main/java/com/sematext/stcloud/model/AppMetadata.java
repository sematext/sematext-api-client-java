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


package com.sematext.stcloud.model;

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
import java.util.ArrayList;
import java.util.List;

/**
 * AppMetadata
 */

public class AppMetadata {
  @SerializedName("awsCloudWatchAccessKey")
  private String awsCloudWatchAccessKey = null;

  @SerializedName("awsCloudWatchSecretKey")
  private String awsCloudWatchSecretKey = null;

  /**
   * Gets or Sets awsFetchFrequency
   */
  @JsonAdapter(AwsFetchFrequencyEnum.Adapter.class)
  public enum AwsFetchFrequencyEnum {
    MINUTE("MINUTE"),
    
    FIVE_MINUTES("FIVE_MINUTES"),
    
    FIFTEEN_MINUTES("FIFTEEN_MINUTES");

    private String value;

    AwsFetchFrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AwsFetchFrequencyEnum fromValue(String text) {
      for (AwsFetchFrequencyEnum b : AwsFetchFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AwsFetchFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AwsFetchFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AwsFetchFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AwsFetchFrequencyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("awsFetchFrequency")
  private AwsFetchFrequencyEnum awsFetchFrequency = null;

  /**
   * Gets or Sets awsRegion
   */
  @JsonAdapter(AwsRegionEnum.Adapter.class)
  public enum AwsRegionEnum {
    US_EAST_1("US_EAST_1"),
    
    US_WEST_1("US_WEST_1"),
    
    EU_WEST_1("EU_WEST_1"),
    
    US_WEST_2("US_WEST_2"),
    
    AP_SOUTHEAST_1("AP_SOUTHEAST_1"),
    
    AP_SOUTHEAST_2("AP_SOUTHEAST_2"),
    
    AP_NORTHEAST_1("AP_NORTHEAST_1"),
    
    SA_EAST_1("SA_EAST_1"),
    
    GOVCLOUD("GovCloud"),
    
    CN_NORTH_1("CN_NORTH_1"),
    
    US_EAST_2("US_EAST_2"),
    
    AP_SOUTH_1("AP_SOUTH_1"),
    
    AP_NORTHEAST_2("AP_NORTHEAST_2"),
    
    CA_CENTRAL_1("CA_CENTRAL_1"),
    
    EU_CENTRAL_1("EU_CENTRAL_1"),
    
    EU_WEST_2("EU_WEST_2");

    private String value;

    AwsRegionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AwsRegionEnum fromValue(String text) {
      for (AwsRegionEnum b : AwsRegionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AwsRegionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AwsRegionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AwsRegionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AwsRegionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("awsRegion")
  private AwsRegionEnum awsRegion = null;

  /**
   * Gets or Sets subTypes
   */
  @JsonAdapter(SubTypesEnum.Adapter.class)
  public enum SubTypesEnum {
    EC2("aws_ec2"),
    
    ELB("aws_elb"),
    
    EBS("aws_ebs");

    private String value;

    SubTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubTypesEnum fromValue(String text) {
      for (SubTypesEnum b : SubTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SubTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SubTypesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("subTypes")
  private List<SubTypesEnum> subTypes = null;

  public AppMetadata awsCloudWatchAccessKey(String awsCloudWatchAccessKey) {
    this.awsCloudWatchAccessKey = awsCloudWatchAccessKey;
    return this;
  }

   /**
   * Get awsCloudWatchAccessKey
   * @return awsCloudWatchAccessKey
  **/
  @ApiModelProperty(example = "zzzzz", value = "")
  public String getAwsCloudWatchAccessKey() {
    return awsCloudWatchAccessKey;
  }

  public void setAwsCloudWatchAccessKey(String awsCloudWatchAccessKey) {
    this.awsCloudWatchAccessKey = awsCloudWatchAccessKey;
  }

  public AppMetadata awsCloudWatchSecretKey(String awsCloudWatchSecretKey) {
    this.awsCloudWatchSecretKey = awsCloudWatchSecretKey;
    return this;
  }

   /**
   * Get awsCloudWatchSecretKey
   * @return awsCloudWatchSecretKey
  **/
  @ApiModelProperty(example = "xxxxx", value = "")
  public String getAwsCloudWatchSecretKey() {
    return awsCloudWatchSecretKey;
  }

  public void setAwsCloudWatchSecretKey(String awsCloudWatchSecretKey) {
    this.awsCloudWatchSecretKey = awsCloudWatchSecretKey;
  }

  public AppMetadata awsFetchFrequency(AwsFetchFrequencyEnum awsFetchFrequency) {
    this.awsFetchFrequency = awsFetchFrequency;
    return this;
  }

   /**
   * Get awsFetchFrequency
   * @return awsFetchFrequency
  **/
  @ApiModelProperty(example = "FIVE_MINUTES", value = "")
  public AwsFetchFrequencyEnum getAwsFetchFrequency() {
    return awsFetchFrequency;
  }

  public void setAwsFetchFrequency(AwsFetchFrequencyEnum awsFetchFrequency) {
    this.awsFetchFrequency = awsFetchFrequency;
  }

  public AppMetadata awsRegion(AwsRegionEnum awsRegion) {
    this.awsRegion = awsRegion;
    return this;
  }

   /**
   * Get awsRegion
   * @return awsRegion
  **/
  @ApiModelProperty(example = "US_EAST_1", value = "")
  public AwsRegionEnum getAwsRegion() {
    return awsRegion;
  }

  public void setAwsRegion(AwsRegionEnum awsRegion) {
    this.awsRegion = awsRegion;
  }

  public AppMetadata subTypes(List<SubTypesEnum> subTypes) {
    this.subTypes = subTypes;
    return this;
  }

  public AppMetadata addSubTypesItem(SubTypesEnum subTypesItem) {
    if (this.subTypes == null) {
      this.subTypes = new ArrayList<>();
    }
    this.subTypes.add(subTypesItem);
    return this;
  }

   /**
   * Comma separated list of AWS types monitored by created app
   * @return subTypes
  **/
  @ApiModelProperty(example = "\"aws_ec2,aws_elb\"", value = "Comma separated list of AWS types monitored by created app")
  public List<SubTypesEnum> getSubTypes() {
    return subTypes;
  }

  public void setSubTypes(List<SubTypesEnum> subTypes) {
    this.subTypes = subTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppMetadata appMetadata = (AppMetadata) o;
    return Objects.equals(this.awsCloudWatchAccessKey, appMetadata.awsCloudWatchAccessKey) &&
        Objects.equals(this.awsCloudWatchSecretKey, appMetadata.awsCloudWatchSecretKey) &&
        Objects.equals(this.awsFetchFrequency, appMetadata.awsFetchFrequency) &&
        Objects.equals(this.awsRegion, appMetadata.awsRegion) &&
        Objects.equals(this.subTypes, appMetadata.subTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsCloudWatchAccessKey, awsCloudWatchSecretKey, awsFetchFrequency, awsRegion, subTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppMetadata {\n");
    
    sb.append("    awsCloudWatchAccessKey: ").append(toIndentedString(awsCloudWatchAccessKey)).append("\n");
    sb.append("    awsCloudWatchSecretKey: ").append(toIndentedString(awsCloudWatchSecretKey)).append("\n");
    sb.append("    awsFetchFrequency: ").append(toIndentedString(awsFetchFrequency)).append("\n");
    sb.append("    awsRegion: ").append(toIndentedString(awsRegion)).append("\n");
    sb.append("    subTypes: ").append(toIndentedString(subTypes)).append("\n");
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

