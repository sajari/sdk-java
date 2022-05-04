# RedirectsApi

All URIs are relative to *https://api.search.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRedirect**](RedirectsApi.md#createRedirect) | **POST** /v4/collections/{collection_id}/redirects | Create redirect
[**deleteRedirect**](RedirectsApi.md#deleteRedirect) | **DELETE** /v4/collections/{collection_id}/redirects/{redirect_id} | Delete redirect
[**getRedirect**](RedirectsApi.md#getRedirect) | **GET** /v4/collections/{collection_id}/redirects/{redirect_id} | Get redirect
[**listRedirects**](RedirectsApi.md#listRedirects) | **GET** /v4/collections/{collection_id}/redirects | List redirects
[**updateRedirect**](RedirectsApi.md#updateRedirect) | **PATCH** /v4/collections/{collection_id}/redirects/{redirect_id} | Update redirect


<a name="createRedirect"></a>
# **createRedirect**
> Redirect createRedirect(collectionId, redirect, accountId)

Create redirect

Create a new redirect in a collection.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.RedirectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    RedirectsApi apiInstance = new RedirectsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection to create a redirect in, e.g. `my-collection`.
    Redirect redirect = new Redirect(); // Redirect | The redirect to create.
    String accountId = "accountId_example"; // String | The account that owns the collection, e.g. `1618535966441231024`.
    try {
      Redirect result = apiInstance.createRedirect(collectionId, redirect, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#createRedirect");
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
 **collectionId** | **String**| The collection to create a redirect in, e.g. &#x60;my-collection&#x60;. |
 **redirect** | [**Redirect**](Redirect.md)| The redirect to create. |
 **accountId** | **String**| The account that owns the collection, e.g. &#x60;1618535966441231024&#x60;. | [optional]

### Return type

[**Redirect**](Redirect.md)

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

<a name="deleteRedirect"></a>
# **deleteRedirect**
> Object deleteRedirect(collectionId, redirectId, accountId)

Delete redirect

Delete a redirect and all of its associated data.  &gt; Note: This operation cannot be reversed.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.RedirectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    RedirectsApi apiInstance = new RedirectsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection the redirect belongs to, e.g. `my-collection`.
    String redirectId = "redirectId_example"; // String | The redirect to delete, e.g. `1234`.
    String accountId = "accountId_example"; // String | The account that owns the collection, e.g. `1618535966441231024`.
    try {
      Object result = apiInstance.deleteRedirect(collectionId, redirectId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#deleteRedirect");
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
 **collectionId** | **String**| The collection the redirect belongs to, e.g. &#x60;my-collection&#x60;. |
 **redirectId** | **String**| The redirect to delete, e.g. &#x60;1234&#x60;. |
 **accountId** | **String**| The account that owns the collection, e.g. &#x60;1618535966441231024&#x60;. | [optional]

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
**404** | Returned when the redirect was not found. |  -  |
**500** | Returned when the API encounters an internal error. |  -  |
**0** | An unexpected error response. |  -  |

<a name="getRedirect"></a>
# **getRedirect**
> Redirect getRedirect(collectionId, redirectId, accountId)

Get redirect

Retrieve the details of a redirect.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.RedirectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    RedirectsApi apiInstance = new RedirectsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection that owns the redirect, e.g. `my-collection`.
    String redirectId = "redirectId_example"; // String | The redirect to retrieve, e.g. `1234`.
    String accountId = "accountId_example"; // String | The account that owns the collection, e.g. `1618535966441231024`.
    try {
      Redirect result = apiInstance.getRedirect(collectionId, redirectId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#getRedirect");
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
 **collectionId** | **String**| The collection that owns the redirect, e.g. &#x60;my-collection&#x60;. |
 **redirectId** | **String**| The redirect to retrieve, e.g. &#x60;1234&#x60;. |
 **accountId** | **String**| The account that owns the collection, e.g. &#x60;1618535966441231024&#x60;. | [optional]

### Return type

[**Redirect**](Redirect.md)

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

<a name="listRedirects"></a>
# **listRedirects**
> ListRedirectsResponse listRedirects(collectionId, accountId, pageSize, pageToken)

List redirects

Retrieve a list of redirects in a collection.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.RedirectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    RedirectsApi apiInstance = new RedirectsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection that owns this set of redirects, e.g. `my-collection`.
    String accountId = "accountId_example"; // String | The account that owns the collection, e.g. `1618535966441231024`.
    Integer pageSize = 56; // Integer | The maximum number of redirects to return. The service may return fewer than this value.  If unspecified, at most 50 redirects are returned.  The maximum value is 1000; values above 1000 are coerced to 1000.
    String pageToken = "pageToken_example"; // String | A page token, received from a previous [ListRedirects](/docs/api#operation/ListRedirects) call.  Provide this to retrieve the subsequent page.  When paginating, all other parameters provided to [ListRedirects](/docs/api#operation/ListRedirects) must match the call that provided the page token.
    try {
      ListRedirectsResponse result = apiInstance.listRedirects(collectionId, accountId, pageSize, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#listRedirects");
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
 **collectionId** | **String**| The collection that owns this set of redirects, e.g. &#x60;my-collection&#x60;. |
 **accountId** | **String**| The account that owns the collection, e.g. &#x60;1618535966441231024&#x60;. | [optional]
 **pageSize** | **Integer**| The maximum number of redirects to return. The service may return fewer than this value.  If unspecified, at most 50 redirects are returned.  The maximum value is 1000; values above 1000 are coerced to 1000. | [optional]
 **pageToken** | **String**| A page token, received from a previous [ListRedirects](/docs/api#operation/ListRedirects) call.  Provide this to retrieve the subsequent page.  When paginating, all other parameters provided to [ListRedirects](/docs/api#operation/ListRedirects) must match the call that provided the page token. | [optional]

### Return type

[**ListRedirectsResponse**](ListRedirectsResponse.md)

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

<a name="updateRedirect"></a>
# **updateRedirect**
> Redirect updateRedirect(collectionId, redirectId, updateMask, redirect, accountId)

Update redirect

Update the details of a redirect.  Pass each field that you want to update in the request body. Also specify the name of each field that you want to update in the &#x60;update_mask&#x60; in the request URL query string. Separate multiple fields with a comma. Fields included in the request body, but not included in the field mask are not updated.  For example, to update the &#x60;condition&#x60; field, make a &#x60;PATCH&#x60; request to the URL:  &#x60;&#x60;&#x60; /v4/collections/{collection_id}/redirects/{redirect_id}?update_mask&#x3D;condition &#x60;&#x60;&#x60;  With the JSON body:  &#x60;&#x60;&#x60; {   \&quot;condition\&quot;: \&quot;new value\&quot;,   \&quot;target\&quot;: \&quot;...\&quot; } &#x60;&#x60;&#x60;  &gt; Note: In this example &#x60;target&#x60; is not updated because it is not specified in the &#x60;update_mask&#x60;.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.RedirectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    RedirectsApi apiInstance = new RedirectsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection the redirect belongs to, e.g. `my-collection`.
    String redirectId = "redirectId_example"; // String | The redirect to update, e.g. `1234`.
    String updateMask = "updateMask_example"; // String | The list of fields to be updated, separated by a comma, e.g. `field1,field2`.  Each field should be in snake case, e.g. `condition`, `target`.  For each field that you want to update, provide a corresponding value in the redirect object containing the new value.
    Redirect redirect = new Redirect(); // Redirect | Details of the redirect to update.
    String accountId = "accountId_example"; // String | The account that owns the collection, e.g. `1618535966441231024`.
    try {
      Redirect result = apiInstance.updateRedirect(collectionId, redirectId, updateMask, redirect, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#updateRedirect");
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
 **collectionId** | **String**| The collection the redirect belongs to, e.g. &#x60;my-collection&#x60;. |
 **redirectId** | **String**| The redirect to update, e.g. &#x60;1234&#x60;. |
 **updateMask** | **String**| The list of fields to be updated, separated by a comma, e.g. &#x60;field1,field2&#x60;.  Each field should be in snake case, e.g. &#x60;condition&#x60;, &#x60;target&#x60;.  For each field that you want to update, provide a corresponding value in the redirect object containing the new value. |
 **redirect** | [**Redirect**](Redirect.md)| Details of the redirect to update. |
 **accountId** | **String**| The account that owns the collection, e.g. &#x60;1618535966441231024&#x60;. | [optional]

### Return type

[**Redirect**](Redirect.md)

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
**404** | Returned when the redirect was not found. |  -  |
**500** | Returned when the API encounters an internal error. |  -  |
**0** | An unexpected error response. |  -  |

