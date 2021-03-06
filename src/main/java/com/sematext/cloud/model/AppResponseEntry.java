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
import com.sematext.cloud.model.App;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AppResponseEntry
 */


public class AppResponseEntry {
  @SerializedName("app")
  private App app = null;

  public AppResponseEntry app(App app) {
    this.app = app;
    return this;
  }

   /**
   * Get app
   * @return app
  **/
  @Schema(description = "")
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppResponseEntry appResponseEntry = (AppResponseEntry) o;
    return Objects.equals(this.app, appResponseEntry.app);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppResponseEntry {\n");
    
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
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
