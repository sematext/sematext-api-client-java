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
 * CloudWatchSettings
 */


public class CloudWatchSettings {
  @SerializedName("accessKey")
  private String accessKey = null;

  /**
   * Gets or Sets fetchFrequency
   */
  @JsonAdapter(FetchFrequencyEnum.Adapter.class)
  public enum FetchFrequencyEnum {
    MINUTE("MINUTE"),
    FIVE_MINUTES("FIVE_MINUTES"),
    FIFTEEN_MINUTES("FIFTEEN_MINUTES");

    private String value;

    FetchFrequencyEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FetchFrequencyEnum fromValue(String input) {
      for (FetchFrequencyEnum b : FetchFrequencyEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FetchFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FetchFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public FetchFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return FetchFrequencyEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("fetchFrequency")
  private FetchFrequencyEnum fetchFrequency = null;

  /**
   * Gets or Sets region
   */
  @JsonAdapter(RegionEnum.Adapter.class)
  public enum RegionEnum {
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

    RegionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RegionEnum fromValue(String input) {
      for (RegionEnum b : RegionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RegionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RegionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RegionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RegionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("region")
  private RegionEnum region = null;

  @SerializedName("secretKey")
  private String secretKey = null;

  public CloudWatchSettings accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Get accessKey
   * @return accessKey
  **/
  @Schema(description = "")
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public CloudWatchSettings fetchFrequency(FetchFrequencyEnum fetchFrequency) {
    this.fetchFrequency = fetchFrequency;
    return this;
  }

   /**
   * Get fetchFrequency
   * @return fetchFrequency
  **/
  @Schema(description = "")
  public FetchFrequencyEnum getFetchFrequency() {
    return fetchFrequency;
  }

  public void setFetchFrequency(FetchFrequencyEnum fetchFrequency) {
    this.fetchFrequency = fetchFrequency;
  }

  public CloudWatchSettings region(RegionEnum region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(description = "")
  public RegionEnum getRegion() {
    return region;
  }

  public void setRegion(RegionEnum region) {
    this.region = region;
  }

  public CloudWatchSettings secretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Get secretKey
   * @return secretKey
  **/
  @Schema(description = "")
  public String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWatchSettings cloudWatchSettings = (CloudWatchSettings) o;
    return Objects.equals(this.accessKey, cloudWatchSettings.accessKey) &&
        Objects.equals(this.fetchFrequency, cloudWatchSettings.fetchFrequency) &&
        Objects.equals(this.region, cloudWatchSettings.region) &&
        Objects.equals(this.secretKey, cloudWatchSettings.secretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, fetchFrequency, region, secretKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWatchSettings {\n");
    
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    fetchFrequency: ").append(toIndentedString(fetchFrequency)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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
