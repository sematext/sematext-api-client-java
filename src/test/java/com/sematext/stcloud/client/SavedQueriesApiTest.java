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
import com.sematext.stcloud.model.SavedQuery;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SavedQueriesApi
 */
@Ignore
public class SavedQueriesApiTest {

    private final SavedQueriesApi api = new SavedQueriesApi();

    
    /**
     * Delete saved query
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSavedQueryUsingDELETE1Test() throws ApiException {
        Long updateableQueryId = null;
        GenericApiResponse response = api.deleteSavedQueryUsingDELETE1(updateableQueryId);

        // TODO: test validations
    }
    
    /**
     * Get saved queries for an app
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSavedQueriesForAppUsingGETTest() throws ApiException {
        Long appId = null;
        GenericApiResponse response = api.getSavedQueriesForAppUsingGET(appId);

        // TODO: test validations
    }
    
    /**
     * Create saved query
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveQueryUsingPOST1Test() throws ApiException {
        SavedQuery savedQueryDto = null;
        GenericApiResponse response = api.saveQueryUsingPOST1(savedQueryDto);

        // TODO: test validations
    }
    
    /**
     * Update saved query
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveQueryUsingPUT1Test() throws ApiException {
        SavedQuery savedQueryDto = null;
        Long updateableQueryId = null;
        GenericApiResponse response = api.saveQueryUsingPUT1(savedQueryDto, updateableQueryId);

        // TODO: test validations
    }
    
}
