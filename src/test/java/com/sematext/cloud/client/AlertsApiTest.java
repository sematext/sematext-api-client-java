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

import com.sematext.cloud.model.AlertRule;
import com.sematext.cloud.model.AlertRuleResponse;
import com.sematext.cloud.model.AlertRulesResponse;
import com.sematext.cloud.model.GenericMapBasedApiResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createAlertUsingPOSTTest() throws Exception {
        AlertRule body = null;
        AlertRuleResponse response = api.createAlertUsingPOST(body);

        // TODO: test validations
    }
    /**
     * Delete alert rule
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAlertRuleUsingDELETETest() throws Exception {
        Long updateableAlertId = null;
        GenericMapBasedApiResponse response = api.deleteAlertRuleUsingDELETE(updateableAlertId);

        // TODO: test validations
    }
    /**
     * Disable alert rule
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void disableAlertRuleUsingPUT1Test() throws Exception {
        Long updateableAlertId = null;
        GenericMapBasedApiResponse response = api.disableAlertRuleUsingPUT1(updateableAlertId);

        // TODO: test validations
    }
    /**
     * Enable alert rule
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void enableAlertRuleUsingPUTTest() throws Exception {
        Long updateableAlertId = null;
        GenericMapBasedApiResponse response = api.enableAlertRuleUsingPUT(updateableAlertId);

        // TODO: test validations
    }
    /**
     * Get alert rules for an app
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAlertRulesForAppUsingGETTest() throws Exception {
        Long appId = null;
        AlertRulesResponse response = api.getAlertRulesForAppUsingGET(appId);

        // TODO: test validations
    }
}
