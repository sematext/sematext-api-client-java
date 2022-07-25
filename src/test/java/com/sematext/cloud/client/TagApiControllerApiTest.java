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

import com.sematext.cloud.model.Dimension;
import com.sematext.cloud.model.TagNamesResponse;
import com.sematext.cloud.model.TagsGroupedResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for TagApiControllerApi
 */
@Ignore
public class TagApiControllerApiTest {

    private final TagApiControllerApi api = new TagApiControllerApi();

    /**
     * Gets tag names for the given application identifiers appearing in the given time frame.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTagNamesUsingGETTest() throws Exception {
        String appIds = null;
        Long from = null;
        Long to = null;
        Boolean metrics = null;
        Boolean logs = null;
        Boolean events = null;
        Boolean rum = null;
        TagNamesResponse response = api.getTagNamesUsingGET(appIds, from, to, metrics, logs, events, rum);

        // TODO: test validations
    }
    /**
     * Gets tag names grouped by application id.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTagsGroupedByIdUsingGET1Test() throws Exception {
        String appIds = null;
        List<String> tag = null;
        Long from = null;
        Long to = null;
        Boolean metrics = null;
        Boolean logs = null;
        Boolean events = null;
        Boolean rum = null;
        TagsGroupedResponse response = api.getTagsGroupedByIdUsingGET1(appIds, tag, from, to, metrics, logs, events, rum);

        // TODO: test validations
    }
    /**
     * Gets values for specified tags for the given application identifiers appearing in the given time frame.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsingGETTest() throws Exception {
        String appIds = null;
        List<String> tag = null;
        Long from = null;
        Long to = null;
        Boolean metrics = null;
        Boolean logs = null;
        Boolean events = null;
        Boolean rum = null;
        Map<String, Dimension> response = api.getUsingGET(appIds, tag, from, to, metrics, logs, events, rum);

        // TODO: test validations
    }
    /**
     * Gets values for specified tags for the given application identifiers appearing in the given time frame.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsingGET1Test() throws Exception {
        String appIds = null;
        List<String> tag = null;
        Long from = null;
        Long to = null;
        Boolean metrics = null;
        Boolean logs = null;
        Boolean events = null;
        Boolean rum = null;
        Map<String, Dimension> response = api.getUsingGET1(appIds, tag, from, to, metrics, logs, events, rum);

        // TODO: test validations
    }
}
