# EventsApi

All URIs are relative to *https://api-gateway.sajari.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendEvent**](EventsApi.md#sendEvent) | **POST** /v4/events:send | Send event
[**sendEvent2**](EventsApi.md#sendEvent2) | **POST** /v4/events:sendEvent | Send event


<a name="sendEvent"></a>
# **sendEvent**
> Object sendEvent(sendEventRequest)

Send event

Send an event to the ranking system after a user interacts with a search result.  When querying a collection, you can set the tracking type of the query request. When it is &#x60;CLICK&#x60; or &#x60;POS_NEG&#x60;, a token is generated for each result in the query response. You can use this token to provide feedback to the ranking system. Each time you want to record an event on a particular search result, use the send event call and provide:  - The &#x60;name&#x60; of the event, e.g. &#x60;click&#x60;, &#x60;purchase&#x60;. - The &#x60;token&#x60; from the search result. - The &#x60;weight&#x60; to assign to the event, e.g. &#x60;1&#x60;. - An object containing any additional &#x60;metadata&#x60;.  For example, to send an event where a customer purchased a product, use the following call:  &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;purchase\&quot;,   \&quot;token\&quot;: \&quot;eyJ...\&quot;,   \&quot;weight\&quot;: 1,   \&quot;metadata\&quot;: {     \&quot;discount\&quot;: 0.2,     \&quot;margin\&quot;: 30.0,     \&quot;customer_id\&quot;: \&quot;12345\&quot;,     \&quot;ui_test_segment\&quot;: \&quot;A\&quot;   } } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-gateway.sajari.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    EventsApi apiInstance = new EventsApi(defaultClient);
    SendEventRequest sendEventRequest = new SendEventRequest(); // SendEventRequest | 
    try {
      Object result = apiInstance.sendEvent(sendEventRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#sendEvent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendEventRequest** | [**SendEventRequest**](SendEventRequest.md)|  |

### Return type

**Object**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**400** | Returned when the request contains violations for one or more fields. |  -  |
**401** | Returned when the request does not have valid authentication credentials. |  -  |
**403** | Returned when the user does not have permission to access the resource. |  -  |
**404** | Returned when the resource does not exist. |  -  |
**500** | Returned when the API encounters an internal error. |  -  |
**0** | An unexpected error response. |  -  |

<a name="sendEvent2"></a>
# **sendEvent2**
> Object sendEvent2(sendEventRequest)

Send event

Send an event to the ranking system after a user interacts with a search result.  When querying a collection, you can set the tracking type of the query request. When it is &#x60;CLICK&#x60; or &#x60;POS_NEG&#x60;, a token is generated for each result in the query response. You can use this token to provide feedback to the ranking system. Each time you want to record an event on a particular search result, use the send event call and provide:  - The &#x60;name&#x60; of the event, e.g. &#x60;click&#x60;, &#x60;purchase&#x60;. - The &#x60;token&#x60; from the search result. - The &#x60;weight&#x60; to assign to the event, e.g. &#x60;1&#x60;. - An object containing any additional &#x60;metadata&#x60;.  For example, to send an event where a customer purchased a product, use the following call:  &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;purchase\&quot;,   \&quot;token\&quot;: \&quot;eyJ...\&quot;,   \&quot;weight\&quot;: 1,   \&quot;metadata\&quot;: {     \&quot;discount\&quot;: 0.2,     \&quot;margin\&quot;: 30.0,     \&quot;customer_id\&quot;: \&quot;12345\&quot;,     \&quot;ui_test_segment\&quot;: \&quot;A\&quot;   } } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-gateway.sajari.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    EventsApi apiInstance = new EventsApi(defaultClient);
    SendEventRequest sendEventRequest = new SendEventRequest(); // SendEventRequest | 
    try {
      Object result = apiInstance.sendEvent2(sendEventRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#sendEvent2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendEventRequest** | [**SendEventRequest**](SendEventRequest.md)|  |

### Return type

**Object**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**400** | Returned when the request contains violations for one or more fields. |  -  |
**401** | Returned when the request does not have valid authentication credentials. |  -  |
**403** | Returned when the user does not have permission to access the resource. |  -  |
**404** | Returned when the resource does not exist. |  -  |
**500** | Returned when the API encounters an internal error. |  -  |
**0** | An unexpected error response. |  -  |

