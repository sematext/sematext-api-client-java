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

import com.sematext.cloud.model.CloudWatchSettings;
import com.sematext.cloud.model.CloudWatchSettingsResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AwsSettingsControllerApi
 */
@Ignore
public class AwsSettingsControllerApiTest {

    private final AwsSettingsControllerApi api = new AwsSettingsControllerApi();

    /**
     * Update App&#x27;s AWS CloudWatch settings
     *
     * Applicable only for AWS Apps
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateUsingPUTTest() throws Exception {
        CloudWatchSettings body = null;
        Long appId = null;
        CloudWatchSettingsResponse response = api.updateUsingPUT(body, appId);

        // TODO: test validations
    }
}
