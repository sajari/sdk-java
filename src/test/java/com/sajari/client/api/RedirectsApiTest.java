/*
 * Search.io API
 * Search.io offers a search and discovery service with Neuralsearch®, the world's first instant AI search technology. Businesses of all sizes use Search.io to build site search and discovery solutions that maximize e-commerce revenue, optimize on-site customer experience, and scale their online presence.
 *
 * The version of the OpenAPI document: v4
 * Contact: support@search.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.sajari.client.api;

import com.sajari.client.ApiException;
import com.sajari.client.model.Error;
import com.sajari.client.model.ListRedirectsResponse;
import com.sajari.client.model.Redirect;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for RedirectsApi
 */
@Ignore
public class RedirectsApiTest {

    private final RedirectsApi api = new RedirectsApi();

    
    /**
     * Create redirect
     *
     * Create a new redirect in a collection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRedirectTest() throws ApiException {
        String collectionId = null;
        Redirect redirect = null;
                Redirect response = api.createRedirect(collectionId, redirect);
        // TODO: test validations
    }
    
    /**
     * Delete redirect
     *
     * Delete a redirect and all of its associated data.  &gt; Note: This operation cannot be reversed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRedirectTest() throws ApiException {
        String collectionId = null;
        String redirectId = null;
                Object response = api.deleteRedirect(collectionId, redirectId);
        // TODO: test validations
    }
    
    /**
     * Get redirect
     *
     * Retrieve the details of a redirect.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRedirectTest() throws ApiException {
        String collectionId = null;
        String redirectId = null;
                Redirect response = api.getRedirect(collectionId, redirectId);
        // TODO: test validations
    }
    
    /**
     * List redirects
     *
     * Retrieve a list of redirects in a collection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRedirectsTest() throws ApiException {
        String collectionId = null;
        Integer pageSize = null;
        String pageToken = null;
                ListRedirectsResponse response = api.listRedirects(collectionId, pageSize, pageToken);
        // TODO: test validations
    }
    
    /**
     * Update redirect
     *
     * Update the details of a redirect.  Pass each field that you want to update in the request body. Also specify the name of each field that you want to update in the &#x60;update_mask&#x60; in the request URL query string. Separate multiple fields with a comma. Fields included in the request body, but not included in the field mask are not updated.  For example, to update the &#x60;condition&#x60; field, make a &#x60;PATCH&#x60; request to the URL:  &#x60;&#x60;&#x60; /v4/collections/{collection_id}/redirects/{redirect_id}?update_mask&#x3D;condition &#x60;&#x60;&#x60;  With the JSON body:  &#x60;&#x60;&#x60; {   \&quot;condition\&quot;: \&quot;new value\&quot;,   \&quot;target\&quot;: \&quot;...\&quot; } &#x60;&#x60;&#x60;  &gt; Note: In this example &#x60;target&#x60; is not updated because it is not specified in the &#x60;update_mask&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRedirectTest() throws ApiException {
        String collectionId = null;
        String redirectId = null;
        String updateMask = null;
        Redirect redirect = null;
                Redirect response = api.updateRedirect(collectionId, redirectId, updateMask, redirect);
        // TODO: test validations
    }
    
}
