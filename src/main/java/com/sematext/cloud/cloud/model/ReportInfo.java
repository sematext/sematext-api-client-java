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
import java.time.OffsetDateTime;
/**
 * ReportInfo
 */


public class ReportInfo {
  @SerializedName("additionalParams")
  private String additionalParams = null;

  @SerializedName("addresses")
  private String addresses = null;

  @SerializedName("appId")
  private Long appId = null;

  @SerializedName("endDate")
  private OffsetDateTime endDate = null;

  @SerializedName("filters")
  private String filters = null;

  @SerializedName("reportName")
  private String reportName = null;

  @SerializedName("startDate")
  private OffsetDateTime startDate = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("text")
  private String text = null;

  public ReportInfo additionalParams(String additionalParams) {
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

  public ReportInfo addresses(String addresses) {
    this.addresses = addresses;
    return this;
  }

   /**
   * Comma separated list of email addresses
   * @return addresses
  **/
  @Schema(description = "Comma separated list of email addresses")
  public String getAddresses() {
    return addresses;
  }

  public void setAddresses(String addresses) {
    this.addresses = addresses;
  }

  public ReportInfo appId(Long appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @Schema(description = "")
  public Long getAppId() {
    return appId;
  }

  public void setAppId(Long appId) {
    this.appId = appId;
  }

  public ReportInfo endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @Schema(description = "")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public ReportInfo filters(String filters) {
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

  public ReportInfo reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

   /**
   * Get reportName
   * @return reportName
  **/
  @Schema(description = "")
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public ReportInfo startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @Schema(description = "")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public ReportInfo subject(String subject) {
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

  public ReportInfo text(String text) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportInfo reportInfo = (ReportInfo) o;
    return Objects.equals(this.additionalParams, reportInfo.additionalParams) &&
        Objects.equals(this.addresses, reportInfo.addresses) &&
        Objects.equals(this.appId, reportInfo.appId) &&
        Objects.equals(this.endDate, reportInfo.endDate) &&
        Objects.equals(this.filters, reportInfo.filters) &&
        Objects.equals(this.reportName, reportInfo.reportName) &&
        Objects.equals(this.startDate, reportInfo.startDate) &&
        Objects.equals(this.subject, reportInfo.subject) &&
        Objects.equals(this.text, reportInfo.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalParams, addresses, appId, endDate, filters, reportName, startDate, subject, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInfo {\n");
    
    sb.append("    additionalParams: ").append(toIndentedString(additionalParams)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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