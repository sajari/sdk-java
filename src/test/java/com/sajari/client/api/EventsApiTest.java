/*
 * Sajari API
 * Sajari is a smart, highly-configurable, real-time search service that enables thousands of businesses worldwide to provide amazing search experiences on their websites, stores, and applications.
 *
 * The version of the OpenAPI document: v4
 * Contact: support@sajari.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.sajari.client.api;

import com.sajari.client.ApiException;
import com.sajari.client.model.SendEventRequest;
import org.junit.Ignore;
import org.junit.Test;


/**
 * API tests for EventsApi
 */
@Ignore
public class EventsApiTest {

    private final EventsApi api = new EventsApi();


    /**
     * Send event
     * <p>
     * Send an event to the ranking system after a user interacts with a search result.  When querying a collection, you can set the tracking type of the query request. When it is &#x60;CLICK&#x60; or &#x60;POS_NEG&#x60;, a token is generated for each result in the query response. You can use this token to provide feedback to the ranking system. Each time you want to record an event on a particular search result, use the send event call and provide:  - The &#x60;name&#x60; of the event, e.g. &#x60;click&#x60;, &#x60;purchase&#x60;. - The &#x60;token&#x60; from the search result. - The &#x60;weight&#x60; to assign to the event, e.g. &#x60;1.0&#x60;. - An object containing any additional &#x60;metadata&#x60;.  For example, to send an event where a customer purchased a product, use the following call:  &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;purchase\&quot;,   \&quot;token\&quot;: \&quot;eyJ...\&quot;,   \&quot;weight\&quot;: 1.0,   \&quot;metadata\&quot;: {     \&quot;discount\&quot;: 0.2,     \&quot;margin\&quot;: 30.0,     \&quot;customer_id\&quot;: \&quot;12345\&quot;,     \&quot;ui_test_segment\&quot;: \&quot;A\&quot;   } } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendEventTest() throws ApiException {
        String accountId = null;
        SendEventRequest sendEventRequest = null;
        Object response = api.sendEvent(accountId, sendEventRequest);

        // TODO: test validations
    }

}
