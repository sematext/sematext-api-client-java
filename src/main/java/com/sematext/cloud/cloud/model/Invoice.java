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
import com.sematext.cloud.model.ChargesDetailsResponseDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * Invoice
 */


public class Invoice {
  @SerializedName("allCharges")
  private List<ChargesDetailsResponseDto> allCharges = null;

  @SerializedName("invoiceDate")
  private String invoiceDate = null;

  @SerializedName("invoiceId")
  private String invoiceId = null;

  @SerializedName("period")
  private String period = null;

  @SerializedName("service")
  private String service = null;

  @SerializedName("totalAmount")
  private BigDecimal totalAmount = null;

  public Invoice allCharges(List<ChargesDetailsResponseDto> allCharges) {
    this.allCharges = allCharges;
    return this;
  }

  public Invoice addAllChargesItem(ChargesDetailsResponseDto allChargesItem) {
    if (this.allCharges == null) {
      this.allCharges = new ArrayList<>();
    }
    this.allCharges.add(allChargesItem);
    return this;
  }

   /**
   * Get allCharges
   * @return allCharges
  **/
  @Schema(description = "")
  public List<ChargesDetailsResponseDto> getAllCharges() {
    return allCharges;
  }

  public void setAllCharges(List<ChargesDetailsResponseDto> allCharges) {
    this.allCharges = allCharges;
  }

  public Invoice invoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * Get invoiceDate
   * @return invoiceDate
  **/
  @Schema(description = "")
  public String getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public Invoice invoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * Get invoiceId
   * @return invoiceId
  **/
  @Schema(description = "")
  public String getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  public Invoice period(String period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Schema(description = "")
  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public Invoice service(String service) {
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @Schema(description = "")
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public Invoice totalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @Schema(description = "")
  public BigDecimal getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.allCharges, invoice.allCharges) &&
        Objects.equals(this.invoiceDate, invoice.invoiceDate) &&
        Objects.equals(this.invoiceId, invoice.invoiceId) &&
        Objects.equals(this.period, invoice.period) &&
        Objects.equals(this.service, invoice.service) &&
        Objects.equals(this.totalAmount, invoice.totalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allCharges, invoiceDate, invoiceId, period, service, totalAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    
    sb.append("    allCharges: ").append(toIndentedString(allCharges)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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