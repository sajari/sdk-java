# CollectionsApi

All URIs are relative to *https://api.search.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCollection**](CollectionsApi.md#createCollection) | **POST** /v4/collections | Create collection
[**deleteCollection**](CollectionsApi.md#deleteCollection) | **DELETE** /v4/collections/{collection_id} | Delete collection
[**experiment**](CollectionsApi.md#experiment) | **POST** /v4/collections/{collection_id}:experiment | Experiment
[**getCollection**](CollectionsApi.md#getCollection) | **GET** /v4/collections/{collection_id} | Get collection
[**listCollections**](CollectionsApi.md#listCollections) | **GET** /v4/collections | List collections
[**queryCollection**](CollectionsApi.md#queryCollection) | **POST** /v4/collections/{collection_id}:query | Query collection
[**queryCollection2**](CollectionsApi.md#queryCollection2) | **POST** /v4/collections/{collection_id}:queryCollection | Query collection
[**trackEvent**](CollectionsApi.md#trackEvent) | **POST** /v4/collections/{collection_id}:trackEvent | Track event
[**updateCollection**](CollectionsApi.md#updateCollection) | **PATCH** /v4/collections/{collection_id} | Update collection


<a name="createCollection"></a>
# **createCollection**
> Collection createCollection(collectionId, collection)

Create collection

Create an empty collection.  Before records can be added to a collection, the schema and pipelines for the collection have to be set up. Consider setting up new collections via the Search.io Console, which handles the creation of the schema and pipelines for you.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The ID to use for the collection.  This must start with an alphanumeric character followed by one or more alphanumeric or `-` characters. Strictly speaking, it must match the regular expression: `^[A-Za-z][A-Za-z0-9\\-]*$`.
    Collection collection = new Collection(); // Collection | Details of the collection to create.
    try {
      Collection result = apiInstance.createCollection(collectionId, collection);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#createCollection");
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
 **collectionId** | **String**| The ID to use for the collection.  This must start with an alphanumeric character followed by one or more alphanumeric or &#x60;-&#x60; characters. Strictly speaking, it must match the regular expression: &#x60;^[A-Za-z][A-Za-z0-9\\-]*$&#x60;. |
 **collection** | [**Collection**](Collection.md)| Details of the collection to create. |

### Return type

[**Collection**](Collection.md)

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
**409** | Returned when the collection already exists. |  -  |
**500** | Returned when the API encounters an internal error. |  -  |
**0** | An unexpected error response. |  -  |

<a name="deleteCollection"></a>
# **deleteCollection**
> Object deleteCollection(collectionId)

Delete collection

Delete a collection and all of its associated data.  &gt; Note: This operation cannot be reversed.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection to delete, e.g. `my-collection`.
    try {
      Object result = apiInstance.deleteCollection(collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#deleteCollection");
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
 **collectionId** | **String**| The collection to delete, e.g. &#x60;my-collection&#x60;. |

### Return type

**Object**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**401** | Returned when the request does not have valid authentication credentials. |  -  |
**403** | Returned when the user does not have permission to access the resource. |  -  |
**404** | Returned when the collection was not found. |  -  |
**500** | Returned when the API encounters an internal error. |  -  |
**0** | An unexpected error response. |  -  |

<a name="experiment"></a>
# **experiment**
> ExperimentResponse experiment(collectionId, experimentRequest)

Experiment

Run a query on a collection with a hypothetical configuration to see what kinds of results it produces.  Saved promotions with a start date in the future are enabled during the experiment, unless they are explicitly disabled.  The following example demonstrates how to run a simple experiment for a string, against a pipeline and with a proposed promotion:  &#x60;&#x60;&#x60;json {   \&quot;pipeline\&quot;: { \&quot;name\&quot;: \&quot;my-pipeline\&quot; },   \&quot;variables\&quot;: { \&quot;q\&quot;: \&quot;search terms\&quot; },   \&quot;promotions\&quot;: [{     \&quot;id\&quot;: \&quot;1234\&quot;,     \&quot;condition\&quot;: \&quot;q &#x3D; &#39;search terms&#39;\&quot;,     \&quot;pins\&quot;: [{       \&quot;key\&quot;: { \&quot;field\&quot;: \&quot;id\&quot;, \&quot;value\&quot;: \&quot;54hdc7h2334h\&quot; },       \&quot;position\&quot;: 1     }]   }] } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection to query, e.g. `my-collection`.
    ExperimentRequest experimentRequest = new ExperimentRequest(); // ExperimentRequest | 
    try {
      ExperimentResponse result = apiInstance.experiment(collectionId, experimentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#experiment");
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
 **collectionId** | **String**| The collection to query, e.g. &#x60;my-collection&#x60;. |
 **experimentRequest** | [**ExperimentRequest**](ExperimentRequest.md)|  |

### Return type

[**ExperimentResponse**](ExperimentResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**401** | Returned when the request does not have valid authentication credentials. |  -  |
**403** | Returned when the user does not have permission to access the resource. |  -  |
**404** | Returned when the resource does not exist. |  -  |
**500** | Returned when the API encounters an internal error. |  -  |
**0** | An unexpected error response. |  -  |

<a name="getCollection"></a>
# **getCollection**
> Collection getCollection(collectionId)

Get collection

Retrieve the details of a collection.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection to retrieve, e.g. `my-collection`.
    try {
      Collection result = apiInstance.getCollection(collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#getCollection");
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
 **collectionId** | **String**| The collection to retrieve, e.g. &#x60;my-collection&#x60;. |

### Return type

[**Collection**](Collection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**401** | Returned when the request does not have valid authentication credentials. |  -  |
**403** | Returned when the user does not have permission to access the resource. |  -  |
**404** | Returned when the resource does not exist. |  -  |
**500** | Returned when the API encounters an internal error. |  -  |
**0** | An unexpected error response. |  -  |

<a name="listCollections"></a>
# **listCollections**
> ListCollectionsResponse listCollections(pageSize, pageToken)

List collections

Retrieve a list of collections in an account.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    Integer pageSize = 56; // Integer | The maximum number of collections to return. The service may return fewer than this value.  If unspecified, at most 50 collections are returned.  The maximum value is 100; values above 100 are coerced to 100.
    String pageToken = "pageToken_example"; // String | A page token, received from a previous [ListCollections](/docs/api#operation/ListCollections) call.  Provide this to retrieve the subsequent page.  When paginating, all other parameters provided to [ListCollections](/docs/api#operation/ListCollections) must match the call that provided the page token.
    try {
      ListCollectionsResponse result = apiInstance.listCollections(pageSize, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#listCollections");
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
 **pageSize** | **Integer**| The maximum number of collections to return. The service may return fewer than this value.  If unspecified, at most 50 collections are returned.  The maximum value is 100; values above 100 are coerced to 100. | [optional]
 **pageToken** | **String**| A page token, received from a previous [ListCollections](/docs/api#operation/ListCollections) call.  Provide this to retrieve the subsequent page.  When paginating, all other parameters provided to [ListCollections](/docs/api#operation/ListCollections) must match the call that provided the page token. | [optional]

### Return type

[**ListCollectionsResponse**](ListCollectionsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**401** | Returned when the request does not have valid authentication credentials. |  -  |
**403** | Returned when the user does not have permission to access the resource. |  -  |
**404** | Returned when the resource does not exist. |  -  |
**500** | Returned when the API encounters an internal error. |  -  |
**0** | An unexpected error response. |  -  |

<a name="queryCollection"></a>
# **queryCollection**
> QueryCollectionResponse queryCollection(collectionId, queryCollectionRequest, accountId)

Query collection

Query the collection to search for records.  The following example demonstrates how to run a simple search for a particular string:  &#x60;&#x60;&#x60;json {   \&quot;variables\&quot;: { \&quot;q\&quot;: \&quot;search terms\&quot; } } &#x60;&#x60;&#x60;  For more information:  - See [filtering content](https://docs.search.io/documentation/fundamentals/integrating-search/filters-and-sort-options) - See [tracking in the Go SDK](https://github.com/sajari/sdk-go/blob/v2/session.go) - See [tracking in the JS SDK](https://github.com/sajari/sdk-js/blob/554e182e77d3ba99a9c100b208ebf3be414d2067/src/index.ts#L881)  Note: Unlike other API calls, the &#x60;QueryCollection&#x60; call can be called from a browser. When called from a browser, the &#x60;Account-Id&#x60; header must be set to your account ID.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection to query, e.g. `my-collection`.
    QueryCollectionRequest queryCollectionRequest = new QueryCollectionRequest(); // QueryCollectionRequest | 
    String accountId = "accountId_example"; // String | The account that owns the collection, e.g. `1618535966441231024`.  Unlike other API calls, the `QueryCollection` call can be called from a browser. When called from a browser, the `Account-Id` header must be set to your account ID.
    try {
      QueryCollectionResponse result = apiInstance.queryCollection(collectionId, queryCollectionRequest, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#queryCollection");
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
 **collectionId** | **String**| The collection to query, e.g. &#x60;my-collection&#x60;. |
 **queryCollectionRequest** | [**QueryCollectionRequest**](QueryCollectionRequest.md)|  |
 **accountId** | **String**| The account that owns the collection, e.g. &#x60;1618535966441231024&#x60;.  Unlike other API calls, the &#x60;QueryCollection&#x60; call can be called from a browser. When called from a browser, the &#x60;Account-Id&#x60; header must be set to your account ID. | [optional]

### Return type

[**QueryCollectionResponse**](QueryCollectionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**401** | Returned when the request does not have valid authentication credentials. |  -  |
**403** | Returned when the user does not have permission to access the resource. |  -  |
**404** | Returned when the resource does not exist. |  -  |
**500** | Returned when the API encounters an internal error. |  -  |
**0** | An unexpected error response. |  -  |

<a name="queryCollection2"></a>
# **queryCollection2**
> QueryCollectionResponse queryCollection2(collectionId, queryCollectionRequest)

Query collection

Query the collection to search for records.  The following example demonstrates how to run a simple search for a particular string:  &#x60;&#x60;&#x60;json {   \&quot;variables\&quot;: { \&quot;q\&quot;: \&quot;search terms\&quot; } } &#x60;&#x60;&#x60;  For more information:  - See [filtering content](https://docs.search.io/documentation/fundamentals/integrating-search/filters-and-sort-options) - See [tracking in the Go SDK](https://github.com/sajari/sdk-go/blob/v2/session.go) - See [tracking in the JS SDK](https://github.com/sajari/sdk-js/blob/554e182e77d3ba99a9c100b208ebf3be414d2067/src/index.ts#L881)  Note: Unlike other API calls, the &#x60;QueryCollection&#x60; call can be called from a browser. When called from a browser, the &#x60;Account-Id&#x60; header must be set to your account ID.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection to query, e.g. `my-collection`.
    QueryCollectionRequest queryCollectionRequest = new QueryCollectionRequest(); // QueryCollectionRequest | 
    try {
      QueryCollectionResponse result = apiInstance.queryCollection2(collectionId, queryCollectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#queryCollection2");
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
 **collectionId** | **String**| The collection to query, e.g. &#x60;my-collection&#x60;. |
 **queryCollectionRequest** | [**QueryCollectionRequest**](QueryCollectionRequest.md)|  |

### Return type

[**QueryCollectionResponse**](QueryCollectionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**401** | Returned when the request does not have valid authentication credentials. |  -  |
**403** | Returned when the user does not have permission to access the resource. |  -  |
**404** | Returned when the resource does not exist. |  -  |
**500** | Returned when the API encounters an internal error. |  -  |
**0** | An unexpected error response. |  -  |

<a name="trackEvent"></a>
# **trackEvent**
> Object trackEvent(accountId, collectionId, event)

Track event

Track an analytics event when a user interacts with an object returned by a [QueryCollection](/docs/api/#operation/QueryCollection) request.  An analytics event can be tracked for the following objects:  - Results - Promotion banners - Redirects  Note: You must pass an &#x60;Account-Id&#x60; header.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String accountId = "accountId_example"; // String | The account that owns the collection, e.g. `1618535966441231024`.
    String collectionId = "collectionId_example"; // String | The collection to track the event against, e.g. `my-collection`.
    Event event = new Event(); // Event | The details of the event to track.
    try {
      Object result = apiInstance.trackEvent(accountId, collectionId, event);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#trackEvent");
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
 **accountId** | **String**| The account that owns the collection, e.g. &#x60;1618535966441231024&#x60;. |
 **collectionId** | **String**| The collection to track the event against, e.g. &#x60;my-collection&#x60;. |
 **event** | [**Event**](Event.md)| The details of the event to track. |

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
**401** | Returned when the request does not have valid authentication credentials. |  -  |
**403** | Returned when the user does not have permission to access the resource. |  -  |
**404** | Returned when the resource does not exist. |  -  |
**500** | Returned when the API encounters an internal error. |  -  |
**0** | An unexpected error response. |  -  |

<a name="updateCollection"></a>
# **updateCollection**
> Collection updateCollection(collectionId, collection, updateMask)

Update collection

Update the details of a collection.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection to update, e.g. `my-collection`.
    Collection collection = new Collection(); // Collection | The details of the collection to update.
    String updateMask = "updateMask_example"; // String | The list of fields to update, separated by a comma, e.g. `authorized_query_domains,display_name`.  Each field should be in snake case.  For each field that you want to update, provide a corresponding value in the collection object containing the new value.
    try {
      Collection result = apiInstance.updateCollection(collectionId, collection, updateMask);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#updateCollection");
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
 **collectionId** | **String**| The collection to update, e.g. &#x60;my-collection&#x60;. |
 **collection** | [**Collection**](Collection.md)| The details of the collection to update. |
 **updateMask** | **String**| The list of fields to update, separated by a comma, e.g. &#x60;authorized_query_domains,display_name&#x60;.  Each field should be in snake case.  For each field that you want to update, provide a corresponding value in the collection object containing the new value. | [optional]

### Return type

[**Collection**](Collection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**401** | Returned when the request does not have valid authentication credentials. |  -  |
**403** | Returned when the user does not have permission to access the resource. |  -  |
**404** | Returned when the collection was not found. |  -  |
**500** | Returned when the API encounters an internal error. |  -  |
**0** | An unexpected error response. |  -  |

