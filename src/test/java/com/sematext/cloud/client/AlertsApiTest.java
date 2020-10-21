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
import com.sematext.cloud.model.AlertRule;
import com.sematext.cloud.model.GenericApiResponse;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for AlertsApi
 */
@Ignore
public class AlertsApiTest {

    private final AlertsApi api = new AlertsApi();

    /**
     * Create alert rule
     *
     *
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAlertUsingPOSTTest() throws ApiException {
        AlertRule dto = null;

        @SuppressWarnings("unused")
        GenericApiResponse response = api.createAlertUsingPOST(dto);

        // TODO: test validations
    }

    /**
     * Delete alert rule
     *
     *
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAlertRuleUsingDELETETest() throws ApiException {
        Long updateableAlertId = null;

        @SuppressWarnings("unused")
        GenericApiResponse response = api.deleteAlertRuleUsingDELETE(updateableAlertId);

        // TODO: test validations
    }

    /**
     * Disable alert rule
     *
     *
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void disableAlertRuleUsingPUT1Test() throws ApiException {
        Long updateableAlertId = null;
        GenericApiResponse response = api.disableAlertRuleUsingPUT1(updateableAlertId);

        @SuppressWarnings("unused")
        // TODO: test validations
    }

    /**
     * Enable alert rule
     *
     *
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enableAlertRuleUsingPUTTest() throws ApiException {
        Long updateableAlertId = null;

        @SuppressWarnings("unused")
        GenericApiResponse response = api.enableAlertRuleUsingPUT(updateableAlertId);

        // TODO: test validations
    }

    /**
     * Get alert rules for an app
     *
     *
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAlertRulesForAppUsingGET1Test() throws ApiException {
        Long appId = null;

        @SuppressWarnings("unused")
        GenericApiResponse response = api.getAlertRulesForAppUsingGET1(appId);

        // TODO: test validations
    }

}
