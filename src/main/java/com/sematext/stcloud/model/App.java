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
import com.sematext.stcloud.model.BasicOrganizationDto;
import com.sematext.stcloud.model.Plan;
import com.sematext.stcloud.model.ServiceIntegration;
import com.sematext.stcloud.model.UserRole;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * App
 */

public class App {
  @SerializedName("ajaxThreshold")
  private Long ajaxThreshold = null;

  @SerializedName("appType")
  private String appType = null;

  @SerializedName("appTypeId")
  private Long appTypeId = null;

  @SerializedName("creatorEmail")
  private String creatorEmail = null;

  @SerializedName("creditCardExpiry")
  private String creditCardExpiry = null;

  @SerializedName("creditCardNumber")
  private String creditCardNumber = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("displayStatus")
  private String displayStatus = null;

  @SerializedName("firstDataSavedDate")
  private Long firstDataSavedDate = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("integration")
  private ServiceIntegration integration = null;

  @SerializedName("lastDataReceivedDate")
  private Long lastDataReceivedDate = null;

  @SerializedName("lastDataSavedDate")
  private Long lastDataSavedDate = null;

  @SerializedName("loggedInUserAppRole")
  private String loggedInUserAppRole = null;

  @SerializedName("monthlyInvoiceAccount")
  private Boolean monthlyInvoiceAccount = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ownerEmail")
  private String ownerEmail = null;

  @SerializedName("owningOrganization")
  private BasicOrganizationDto owningOrganization = null;

  @SerializedName("pageLoadThreshold")
  private Long pageLoadThreshold = null;

  @SerializedName("paymentMethodId")
  private Long paymentMethodId = null;

  @SerializedName("plan")
  private Plan plan = null;

  @SerializedName("prepaidAccount")
  private Boolean prepaidAccount = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("trialEndDate")
  private Long trialEndDate = null;

  @SerializedName("urlGroupLimit")
  private Integer urlGroupLimit = null;

  @SerializedName("userRoles")
  private List<UserRole> userRoles = null;

  public App ajaxThreshold(Long ajaxThreshold) {
    this.ajaxThreshold = ajaxThreshold;
    return this;
  }

   /**
   * Get ajaxThreshold
   * @return ajaxThreshold
  **/
  @ApiModelProperty(value = "")
  public Long getAjaxThreshold() {
    return ajaxThreshold;
  }

  public void setAjaxThreshold(Long ajaxThreshold) {
    this.ajaxThreshold = ajaxThreshold;
  }

  public App appType(String appType) {
    this.appType = appType;
    return this;
  }

   /**
   * Get appType
   * @return appType
  **/
  @ApiModelProperty(value = "")
  public String getAppType() {
    return appType;
  }

  public void setAppType(String appType) {
    this.appType = appType;
  }

  public App appTypeId(Long appTypeId) {
    this.appTypeId = appTypeId;
    return this;
  }

   /**
   * Get appTypeId
   * @return appTypeId
  **/
  @ApiModelProperty(value = "")
  public Long getAppTypeId() {
    return appTypeId;
  }

  public void setAppTypeId(Long appTypeId) {
    this.appTypeId = appTypeId;
  }

  public App creatorEmail(String creatorEmail) {
    this.creatorEmail = creatorEmail;
    return this;
  }

   /**
   * Get creatorEmail
   * @return creatorEmail
  **/
  @ApiModelProperty(value = "")
  public String getCreatorEmail() {
    return creatorEmail;
  }

  public void setCreatorEmail(String creatorEmail) {
    this.creatorEmail = creatorEmail;
  }

  public App creditCardExpiry(String creditCardExpiry) {
    this.creditCardExpiry = creditCardExpiry;
    return this;
  }

   /**
   * Get creditCardExpiry
   * @return creditCardExpiry
  **/
  @ApiModelProperty(value = "")
  public String getCreditCardExpiry() {
    return creditCardExpiry;
  }

  public void setCreditCardExpiry(String creditCardExpiry) {
    this.creditCardExpiry = creditCardExpiry;
  }

  public App creditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
    return this;
  }

   /**
   * Get creditCardNumber
   * @return creditCardNumber
  **/
  @ApiModelProperty(value = "")
  public String getCreditCardNumber() {
    return creditCardNumber;
  }

  public void setCreditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
  }

  public App description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public App displayStatus(String displayStatus) {
    this.displayStatus = displayStatus;
    return this;
  }

   /**
   * Get displayStatus
   * @return displayStatus
  **/
  @ApiModelProperty(value = "")
  public String getDisplayStatus() {
    return displayStatus;
  }

  public void setDisplayStatus(String displayStatus) {
    this.displayStatus = displayStatus;
  }

  public App firstDataSavedDate(Long firstDataSavedDate) {
    this.firstDataSavedDate = firstDataSavedDate;
    return this;
  }

   /**
   * Get firstDataSavedDate
   * @return firstDataSavedDate
  **/
  @ApiModelProperty(value = "")
  public Long getFirstDataSavedDate() {
    return firstDataSavedDate;
  }

  public void setFirstDataSavedDate(Long firstDataSavedDate) {
    this.firstDataSavedDate = firstDataSavedDate;
  }

  public App id(Long id) {
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

  public App integration(ServiceIntegration integration) {
    this.integration = integration;
    return this;
  }

   /**
   * Get integration
   * @return integration
  **/
  @ApiModelProperty(value = "")
  public ServiceIntegration getIntegration() {
    return integration;
  }

  public void setIntegration(ServiceIntegration integration) {
    this.integration = integration;
  }

  public App lastDataReceivedDate(Long lastDataReceivedDate) {
    this.lastDataReceivedDate = lastDataReceivedDate;
    return this;
  }

   /**
   * Get lastDataReceivedDate
   * @return lastDataReceivedDate
  **/
  @ApiModelProperty(value = "")
  public Long getLastDataReceivedDate() {
    return lastDataReceivedDate;
  }

  public void setLastDataReceivedDate(Long lastDataReceivedDate) {
    this.lastDataReceivedDate = lastDataReceivedDate;
  }

  public App lastDataSavedDate(Long lastDataSavedDate) {
    this.lastDataSavedDate = lastDataSavedDate;
    return this;
  }

   /**
   * Get lastDataSavedDate
   * @return lastDataSavedDate
  **/
  @ApiModelProperty(value = "")
  public Long getLastDataSavedDate() {
    return lastDataSavedDate;
  }

  public void setLastDataSavedDate(Long lastDataSavedDate) {
    this.lastDataSavedDate = lastDataSavedDate;
  }

  public App loggedInUserAppRole(String loggedInUserAppRole) {
    this.loggedInUserAppRole = loggedInUserAppRole;
    return this;
  }

   /**
   * Get loggedInUserAppRole
   * @return loggedInUserAppRole
  **/
  @ApiModelProperty(value = "")
  public String getLoggedInUserAppRole() {
    return loggedInUserAppRole;
  }

  public void setLoggedInUserAppRole(String loggedInUserAppRole) {
    this.loggedInUserAppRole = loggedInUserAppRole;
  }

  public App monthlyInvoiceAccount(Boolean monthlyInvoiceAccount) {
    this.monthlyInvoiceAccount = monthlyInvoiceAccount;
    return this;
  }

   /**
   * Get monthlyInvoiceAccount
   * @return monthlyInvoiceAccount
  **/
  @ApiModelProperty(value = "")
  public Boolean isMonthlyInvoiceAccount() {
    return monthlyInvoiceAccount;
  }

  public void setMonthlyInvoiceAccount(Boolean monthlyInvoiceAccount) {
    this.monthlyInvoiceAccount = monthlyInvoiceAccount;
  }

  public App name(String name) {
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

  public App ownerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
    return this;
  }

   /**
   * Get ownerEmail
   * @return ownerEmail
  **/
  @ApiModelProperty(value = "")
  public String getOwnerEmail() {
    return ownerEmail;
  }

  public void setOwnerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
  }

  public App owningOrganization(BasicOrganizationDto owningOrganization) {
    this.owningOrganization = owningOrganization;
    return this;
  }

   /**
   * Get owningOrganization
   * @return owningOrganization
  **/
  @ApiModelProperty(value = "")
  public BasicOrganizationDto getOwningOrganization() {
    return owningOrganization;
  }

  public void setOwningOrganization(BasicOrganizationDto owningOrganization) {
    this.owningOrganization = owningOrganization;
  }

  public App pageLoadThreshold(Long pageLoadThreshold) {
    this.pageLoadThreshold = pageLoadThreshold;
    return this;
  }

   /**
   * Get pageLoadThreshold
   * @return pageLoadThreshold
  **/
  @ApiModelProperty(value = "")
  public Long getPageLoadThreshold() {
    return pageLoadThreshold;
  }

  public void setPageLoadThreshold(Long pageLoadThreshold) {
    this.pageLoadThreshold = pageLoadThreshold;
  }

  public App paymentMethodId(Long paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
    return this;
  }

   /**
   * Get paymentMethodId
   * @return paymentMethodId
  **/
  @ApiModelProperty(value = "")
  public Long getPaymentMethodId() {
    return paymentMethodId;
  }

  public void setPaymentMethodId(Long paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  public App plan(Plan plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @ApiModelProperty(value = "")
  public Plan getPlan() {
    return plan;
  }

  public void setPlan(Plan plan) {
    this.plan = plan;
  }

  public App prepaidAccount(Boolean prepaidAccount) {
    this.prepaidAccount = prepaidAccount;
    return this;
  }

   /**
   * Get prepaidAccount
   * @return prepaidAccount
  **/
  @ApiModelProperty(value = "")
  public Boolean isPrepaidAccount() {
    return prepaidAccount;
  }

  public void setPrepaidAccount(Boolean prepaidAccount) {
    this.prepaidAccount = prepaidAccount;
  }

  public App status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public App token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public App trialEndDate(Long trialEndDate) {
    this.trialEndDate = trialEndDate;
    return this;
  }

   /**
   * Get trialEndDate
   * @return trialEndDate
  **/
  @ApiModelProperty(value = "")
  public Long getTrialEndDate() {
    return trialEndDate;
  }

  public void setTrialEndDate(Long trialEndDate) {
    this.trialEndDate = trialEndDate;
  }

  public App urlGroupLimit(Integer urlGroupLimit) {
    this.urlGroupLimit = urlGroupLimit;
    return this;
  }

   /**
   * Get urlGroupLimit
   * @return urlGroupLimit
  **/
  @ApiModelProperty(value = "")
  public Integer getUrlGroupLimit() {
    return urlGroupLimit;
  }

  public void setUrlGroupLimit(Integer urlGroupLimit) {
    this.urlGroupLimit = urlGroupLimit;
  }

  public App userRoles(List<UserRole> userRoles) {
    this.userRoles = userRoles;
    return this;
  }

  public App addUserRolesItem(UserRole userRolesItem) {
    if (this.userRoles == null) {
      this.userRoles = new ArrayList<>();
    }
    this.userRoles.add(userRolesItem);
    return this;
  }

   /**
   * Get userRoles
   * @return userRoles
  **/
  @ApiModelProperty(value = "")
  public List<UserRole> getUserRoles() {
    return userRoles;
  }

  public void setUserRoles(List<UserRole> userRoles) {
    this.userRoles = userRoles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    App app = (App) o;
    return Objects.equals(this.ajaxThreshold, app.ajaxThreshold) &&
        Objects.equals(this.appType, app.appType) &&
        Objects.equals(this.appTypeId, app.appTypeId) &&
        Objects.equals(this.creatorEmail, app.creatorEmail) &&
        Objects.equals(this.creditCardExpiry, app.creditCardExpiry) &&
        Objects.equals(this.creditCardNumber, app.creditCardNumber) &&
        Objects.equals(this.description, app.description) &&
        Objects.equals(this.displayStatus, app.displayStatus) &&
        Objects.equals(this.firstDataSavedDate, app.firstDataSavedDate) &&
        Objects.equals(this.id, app.id) &&
        Objects.equals(this.integration, app.integration) &&
        Objects.equals(this.lastDataReceivedDate, app.lastDataReceivedDate) &&
        Objects.equals(this.lastDataSavedDate, app.lastDataSavedDate) &&
        Objects.equals(this.loggedInUserAppRole, app.loggedInUserAppRole) &&
        Objects.equals(this.monthlyInvoiceAccount, app.monthlyInvoiceAccount) &&
        Objects.equals(this.name, app.name) &&
        Objects.equals(this.ownerEmail, app.ownerEmail) &&
        Objects.equals(this.owningOrganization, app.owningOrganization) &&
        Objects.equals(this.pageLoadThreshold, app.pageLoadThreshold) &&
        Objects.equals(this.paymentMethodId, app.paymentMethodId) &&
        Objects.equals(this.plan, app.plan) &&
        Objects.equals(this.prepaidAccount, app.prepaidAccount) &&
        Objects.equals(this.status, app.status) &&
        Objects.equals(this.token, app.token) &&
        Objects.equals(this.trialEndDate, app.trialEndDate) &&
        Objects.equals(this.urlGroupLimit, app.urlGroupLimit) &&
        Objects.equals(this.userRoles, app.userRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ajaxThreshold, appType, appTypeId, creatorEmail, creditCardExpiry, creditCardNumber, description, displayStatus, firstDataSavedDate, id, integration, lastDataReceivedDate, lastDataSavedDate, loggedInUserAppRole, monthlyInvoiceAccount, name, ownerEmail, owningOrganization, pageLoadThreshold, paymentMethodId, plan, prepaidAccount, status, token, trialEndDate, urlGroupLimit, userRoles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class App {\n");
    
    sb.append("    ajaxThreshold: ").append(toIndentedString(ajaxThreshold)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    appTypeId: ").append(toIndentedString(appTypeId)).append("\n");
    sb.append("    creatorEmail: ").append(toIndentedString(creatorEmail)).append("\n");
    sb.append("    creditCardExpiry: ").append(toIndentedString(creditCardExpiry)).append("\n");
    sb.append("    creditCardNumber: ").append(toIndentedString(creditCardNumber)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayStatus: ").append(toIndentedString(displayStatus)).append("\n");
    sb.append("    firstDataSavedDate: ").append(toIndentedString(firstDataSavedDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    lastDataReceivedDate: ").append(toIndentedString(lastDataReceivedDate)).append("\n");
    sb.append("    lastDataSavedDate: ").append(toIndentedString(lastDataSavedDate)).append("\n");
    sb.append("    loggedInUserAppRole: ").append(toIndentedString(loggedInUserAppRole)).append("\n");
    sb.append("    monthlyInvoiceAccount: ").append(toIndentedString(monthlyInvoiceAccount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerEmail: ").append(toIndentedString(ownerEmail)).append("\n");
    sb.append("    owningOrganization: ").append(toIndentedString(owningOrganization)).append("\n");
    sb.append("    pageLoadThreshold: ").append(toIndentedString(pageLoadThreshold)).append("\n");
    sb.append("    paymentMethodId: ").append(toIndentedString(paymentMethodId)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    prepaidAccount: ").append(toIndentedString(prepaidAccount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    trialEndDate: ").append(toIndentedString(trialEndDate)).append("\n");
    sb.append("    urlGroupLimit: ").append(toIndentedString(urlGroupLimit)).append("\n");
    sb.append("    userRoles: ").append(toIndentedString(userRoles)).append("\n");
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

