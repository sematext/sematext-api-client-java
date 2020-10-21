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


package com.sematext.cloud.client;

import com.sematext.cloud.ApiException;
import com.sematext.cloud.model.BillingInfo;
import com.sematext.cloud.model.GenericApiResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BillingApi
 */
@Ignore
public class BillingApiTest {

    private final BillingApi api = new BillingApi();

    
    /**
     * Get invoice details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDetailedInvoiceUsingGET1Test() throws ApiException {
        String service = null;
        Integer year = null;
        Integer month = null;
        GenericApiResponse response = api.getDetailedInvoiceUsingGET1(service, year, month);

        // TODO: test validations
    }
    
    /**
     * Get available plans
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAvailablePlansUsingGET1Test() throws ApiException {
        Long integrationId = null;
        String appType = null;
        GenericApiResponse response = api.listAvailablePlansUsingGET1(integrationId, appType);

        // TODO: test validations
    }
    
    /**
     * Update plan for an app
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePlanUsingPUT1Test() throws ApiException {
        Long appId = null;
        BillingInfo dto = null;
        GenericApiResponse response = api.updatePlanUsingPUT1(appId, dto);

        // TODO: test validations
    }
    
}
