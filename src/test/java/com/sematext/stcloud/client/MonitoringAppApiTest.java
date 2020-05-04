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


package com.sematext.stcloud.client;

import com.sematext.stcloud.ApiException;
import com.sematext.stcloud.model.CreateAppInfo;
import com.sematext.stcloud.model.GenericApiResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MonitoringAppApi
 */
@Ignore
public class MonitoringAppApiTest {

    private final MonitoringAppApi api = new MonitoringAppApi();

    
    /**
     * Create Monitoring App
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSpmApplicationTest() throws ApiException {
        CreateAppInfo applicationDetails = null;
        GenericApiResponse response = api.createSpmApplication(applicationDetails);

        // TODO: test validations
    }
    
}
