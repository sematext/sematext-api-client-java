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
import com.sematext.stcloud.model.GenericApiResponse;
import com.sematext.stcloud.model.UserInfo;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResetPasswordApi
 */
@Ignore
public class ResetPasswordApiTest {

    private final ResetPasswordApi api = new ResetPasswordApi();

    
    /**
     * Reset Password
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetPasswordUsingPOSTTest() throws ApiException {
        UserInfo dto = null;
        GenericApiResponse response = api.resetPasswordUsingPOST(dto);

        // TODO: test validations
    }
    
}
