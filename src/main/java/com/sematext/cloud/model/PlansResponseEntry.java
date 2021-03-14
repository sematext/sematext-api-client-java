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
import com.sematext.cloud.model.Plan;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PlansResponseEntry
 */


public class PlansResponseEntry {
  @SerializedName("availablePlans")
  private List<Plan> availablePlans = null;

  public PlansResponseEntry availablePlans(List<Plan> availablePlans) {
    this.availablePlans = availablePlans;
    return this;
  }

  public PlansResponseEntry addAvailablePlansItem(Plan availablePlansItem) {
    if (this.availablePlans == null) {
      this.availablePlans = new ArrayList<>();
    }
    this.availablePlans.add(availablePlansItem);
    return this;
  }

   /**
   * Get availablePlans
   * @return availablePlans
  **/
  @Schema(description = "")
  public List<Plan> getAvailablePlans() {
    return availablePlans;
  }

  public void setAvailablePlans(List<Plan> availablePlans) {
    this.availablePlans = availablePlans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlansResponseEntry plansResponseEntry = (PlansResponseEntry) o;
    return Objects.equals(this.availablePlans, plansResponseEntry.availablePlans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availablePlans);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlansResponseEntry {\n");

    sb.append("    availablePlans: ").append(toIndentedString(availablePlans)).append("\n");
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
