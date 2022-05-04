# PromotionsApi

All URIs are relative to *https://api.search.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPromotion**](PromotionsApi.md#createPromotion) | **POST** /v4/collections/{collection_id}/promotions | Create promotion
[**deletePromotion**](PromotionsApi.md#deletePromotion) | **DELETE** /v4/collections/{collection_id}/promotions/{promotion_id} | Delete promotion
[**getPromotion**](PromotionsApi.md#getPromotion) | **GET** /v4/collections/{collection_id}/promotions/{promotion_id} | Get promotion
[**listPromotions**](PromotionsApi.md#listPromotions) | **GET** /v4/collections/{collection_id}/promotions | List promotions
[**updatePromotion**](PromotionsApi.md#updatePromotion) | **PATCH** /v4/collections/{collection_id}/promotions/{promotion_id} | Update promotion


<a name="createPromotion"></a>
# **createPromotion**
> Promotion createPromotion(collectionId, promotion, accountId)

Create promotion

Create a new promotion in a collection.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.PromotionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    PromotionsApi apiInstance = new PromotionsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection to create a promotion in, e.g. `my-collection`.
    Promotion promotion = new Promotion(); // Promotion | The promotion to create.
    String accountId = "accountId_example"; // String | The account that owns the collection, e.g. `1618535966441231024`.
    try {
      Promotion result = apiInstance.createPromotion(collectionId, promotion, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromotionsApi#createPromotion");
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
 **collectionId** | **String**| The collection to create a promotion in, e.g. &#x60;my-collection&#x60;. |
 **promotion** | [**Promotion**](Promotion.md)| The promotion to create. |
 **accountId** | **String**| The account that owns the collection, e.g. &#x60;1618535966441231024&#x60;. | [optional]

### Return type

[**Promotion**](Promotion.md)

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

<a name="deletePromotion"></a>
# **deletePromotion**
> Object deletePromotion(collectionId, promotionId, accountId)

Delete promotion

Delete a promotion and all of its associated data.  &gt; Note: This operation cannot be reversed.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.PromotionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    PromotionsApi apiInstance = new PromotionsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection the promotion belongs to, e.g. `my-collection`.
    String promotionId = "promotionId_example"; // String | The promotion to delete, e.g. `1234`.
    String accountId = "accountId_example"; // String | The account that owns the collection, e.g. `1618535966441231024`.
    try {
      Object result = apiInstance.deletePromotion(collectionId, promotionId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromotionsApi#deletePromotion");
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
 **collectionId** | **String**| The collection the promotion belongs to, e.g. &#x60;my-collection&#x60;. |
 **promotionId** | **String**| The promotion to delete, e.g. &#x60;1234&#x60;. |
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
**404** | Returned when the promotion was not found. |  -  |
**500** | Returned when the API encounters an internal error. |  -  |
**0** | An unexpected error response. |  -  |

<a name="getPromotion"></a>
# **getPromotion**
> Promotion getPromotion(collectionId, promotionId, accountId)

Get promotion

Retrieve the details of a promotion.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.PromotionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    PromotionsApi apiInstance = new PromotionsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection that owns the promotion, e.g. `my-collection`.
    String promotionId = "promotionId_example"; // String | The promotion to retrieve, e.g. `1234`.
    String accountId = "accountId_example"; // String | The account that owns the collection, e.g. `1618535966441231024`.
    try {
      Promotion result = apiInstance.getPromotion(collectionId, promotionId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromotionsApi#getPromotion");
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
 **collectionId** | **String**| The collection that owns the promotion, e.g. &#x60;my-collection&#x60;. |
 **promotionId** | **String**| The promotion to retrieve, e.g. &#x60;1234&#x60;. |
 **accountId** | **String**| The account that owns the collection, e.g. &#x60;1618535966441231024&#x60;. | [optional]

### Return type

[**Promotion**](Promotion.md)

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

<a name="listPromotions"></a>
# **listPromotions**
> ListPromotionsResponse listPromotions(collectionId, accountId, pageSize, pageToken, view)

List promotions

Retrieve a list of promotions in a collection.  Promotion pins, exclusions and filter boosts are not returned in this call.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.PromotionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    PromotionsApi apiInstance = new PromotionsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection that owns this set of promotions, e.g. `my-collection`.
    String accountId = "accountId_example"; // String | The account that owns the collection, e.g. `1618535966441231024`.
    Integer pageSize = 56; // Integer | The maximum number of promotions to return. The service may return fewer than this value.  If unspecified, at most 50 promotions are returned.  The maximum value is 1000; values above 1000 are coerced to 1000.
    String pageToken = "pageToken_example"; // String | A page token, received from a previous [ListPromotions](/docs/api#operation/ListPromotions) call.  Provide this to retrieve the subsequent page.  When paginating, all other parameters provided to [ListPromotions](/docs/api#operation/ListPromotions) must match the call that provided the page token.
    String view = "PROMOTION_VIEW_UNSPECIFIED"; // String | The amount of information to include in each retrieved promotion.   - PROMOTION_VIEW_UNSPECIFIED: The default / unset value. The API defaults to the `FULL` view.  - BASIC: Include basic information including name, start time and end time, but not detailed information about the promotion effects.  - FULL: Returns all information about a promotion. This is the default value.
    try {
      ListPromotionsResponse result = apiInstance.listPromotions(collectionId, accountId, pageSize, pageToken, view);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromotionsApi#listPromotions");
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
 **collectionId** | **String**| The collection that owns this set of promotions, e.g. &#x60;my-collection&#x60;. |
 **accountId** | **String**| The account that owns the collection, e.g. &#x60;1618535966441231024&#x60;. | [optional]
 **pageSize** | **Integer**| The maximum number of promotions to return. The service may return fewer than this value.  If unspecified, at most 50 promotions are returned.  The maximum value is 1000; values above 1000 are coerced to 1000. | [optional]
 **pageToken** | **String**| A page token, received from a previous [ListPromotions](/docs/api#operation/ListPromotions) call.  Provide this to retrieve the subsequent page.  When paginating, all other parameters provided to [ListPromotions](/docs/api#operation/ListPromotions) must match the call that provided the page token. | [optional]
 **view** | **String**| The amount of information to include in each retrieved promotion.   - PROMOTION_VIEW_UNSPECIFIED: The default / unset value. The API defaults to the &#x60;FULL&#x60; view.  - BASIC: Include basic information including name, start time and end time, but not detailed information about the promotion effects.  - FULL: Returns all information about a promotion. This is the default value. | [optional] [default to PROMOTION_VIEW_UNSPECIFIED] [enum: PROMOTION_VIEW_UNSPECIFIED, BASIC, FULL]

### Return type

[**ListPromotionsResponse**](ListPromotionsResponse.md)

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

<a name="updatePromotion"></a>
# **updatePromotion**
> Promotion updatePromotion(collectionId, promotionId, updateMask, promotion, accountId)

Update promotion

Update the details of a promotion.  Pass each field that you want to update in the request body. Also specify the name of each field that you want to update in the &#x60;update_mask&#x60; in the request URL query string. Separate multiple fields with a comma. Fields included in the request body, but not included in the field mask are not updated.  For example, to update the &#x60;display_name&#x60; and &#x60;start_time&#x60; fields, make a &#x60;PATCH&#x60; request to the URL:  &#x60;&#x60;&#x60; /v4/collections/{collection_id}/promotions/{promotion_id}?update_mask&#x3D;display_name,start_time &#x60;&#x60;&#x60;  With the JSON body:  &#x60;&#x60;&#x60; {   \&quot;display_name\&quot;: \&quot;new value\&quot;,   \&quot;start_time\&quot;: \&quot;2006-01-02T15:04:05Z07:00\&quot;,   \&quot;end_time\&quot;: \&quot;2006-01-02T15:04:05Z07:00\&quot; } &#x60;&#x60;&#x60;  &gt; Note: In this example &#x60;end_time&#x60; is not updated because it is not specified in the &#x60;update_mask&#x60;.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.PromotionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    PromotionsApi apiInstance = new PromotionsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection the promotion belongs to, e.g. `my-collection`.
    String promotionId = "promotionId_example"; // String | The promotion to update, e.g. `1234`.
    String updateMask = "updateMask_example"; // String | The list of fields to be updated, separated by a comma, e.g. `field1,field2`.  Each field should be in snake case, e.g. `display_name`, `filter_boosts`.  For each field that you want to update, provide a corresponding value in the promotion object containing the new value.
    Promotion promotion = new Promotion(); // Promotion | Details of the promotion to update.
    String accountId = "accountId_example"; // String | The account that owns the collection, e.g. `1618535966441231024`.
    try {
      Promotion result = apiInstance.updatePromotion(collectionId, promotionId, updateMask, promotion, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromotionsApi#updatePromotion");
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
 **collectionId** | **String**| The collection the promotion belongs to, e.g. &#x60;my-collection&#x60;. |
 **promotionId** | **String**| The promotion to update, e.g. &#x60;1234&#x60;. |
 **updateMask** | **String**| The list of fields to be updated, separated by a comma, e.g. &#x60;field1,field2&#x60;.  Each field should be in snake case, e.g. &#x60;display_name&#x60;, &#x60;filter_boosts&#x60;.  For each field that you want to update, provide a corresponding value in the promotion object containing the new value. |
 **promotion** | [**Promotion**](Promotion.md)| Details of the promotion to update. |
 **accountId** | **String**| The account that owns the collection, e.g. &#x60;1618535966441231024&#x60;. | [optional]

### Return type

[**Promotion**](Promotion.md)

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
**404** | Returned when the promotion was not found. |  -  |
**500** | Returned when the API encounters an internal error. |  -  |
**0** | An unexpected error response. |  -  |

