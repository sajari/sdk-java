# SchemaApi

All URIs are relative to *https://api-gateway.sajari.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchCreateSchemaFields**](SchemaApi.md#batchCreateSchemaFields) | **POST** /v4/collections/{collection_id}/schemaFields:batchCreate | Batch create schema fields
[**createSchemaField**](SchemaApi.md#createSchemaField) | **POST** /v4/collections/{collection_id}/schemaFields | Create schema field
[**listSchemaFields**](SchemaApi.md#listSchemaFields) | **GET** /v4/collections/{collection_id}/schemaFields | List schema fields


<a name="batchCreateSchemaFields"></a>
# **batchCreateSchemaFields**
> BatchCreateSchemaFieldsResponse batchCreateSchemaFields(collectionId, batchCreateSchemaFieldsRequest)

Batch create schema fields

The batch version of the [CreateSchemaField](/docs/api-reference#operation/CreateSchemaField) call.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.SchemaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-gateway.sajari.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    SchemaApi apiInstance = new SchemaApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection to create the schema fields in, e.g. `my-collection`.
    BatchCreateSchemaFieldsRequest batchCreateSchemaFieldsRequest = new BatchCreateSchemaFieldsRequest(); // BatchCreateSchemaFieldsRequest | 
    try {
      BatchCreateSchemaFieldsResponse result = apiInstance.batchCreateSchemaFields(collectionId, batchCreateSchemaFieldsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemaApi#batchCreateSchemaFields");
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
 **collectionId** | **String**| The collection to create the schema fields in, e.g. &#x60;my-collection&#x60;. |
 **batchCreateSchemaFieldsRequest** | [**BatchCreateSchemaFieldsRequest**](BatchCreateSchemaFieldsRequest.md)|  |

### Return type

[**BatchCreateSchemaFieldsResponse**](BatchCreateSchemaFieldsResponse.md)

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
**0** | An unexpected error response |  -  |

<a name="createSchemaField"></a>
# **createSchemaField**
> SchemaField createSchemaField(collectionId, schemaField)

Create schema field

Create a new field in your collection&#39;s schema.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.SchemaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-gateway.sajari.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    SchemaApi apiInstance = new SchemaApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection to create a schema field in, e.g. `my-collection`.
    SchemaField schemaField = new SchemaField(); // SchemaField | The schema field to create.
    try {
      SchemaField result = apiInstance.createSchemaField(collectionId, schemaField);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemaApi#createSchemaField");
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
 **collectionId** | **String**| The collection to create a schema field in, e.g. &#x60;my-collection&#x60;. |
 **schemaField** | [**SchemaField**](SchemaField.md)| The schema field to create. |

### Return type

[**SchemaField**](SchemaField.md)

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
**0** | An unexpected error response |  -  |

<a name="listSchemaFields"></a>
# **listSchemaFields**
> ListSchemaFieldsResponse listSchemaFields(collectionId, pageSize, pageToken)

List schema fields

Retrieve a list of schema fields in the collection.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.SchemaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-gateway.sajari.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    SchemaApi apiInstance = new SchemaApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection that owns this set of schema fields, e.g. `my-collection`.
    Integer pageSize = 56; // Integer | The maximum number of schema fields to return. The service may return fewer than this value.  If unspecified, at most 50 schema fields are returned.  The maximum value is 1000; values above 1000 are coerced to 1000.
    String pageToken = "pageToken_example"; // String | A page token, received from a previous [ListSchemaFields](/docs/api-reference#operation/ListSchemaFields) call.  Provide this to retrieve the subsequent page.  When paginating, all other parameters provided to [ListSchemaFields](/docs/api-reference#operation/ListSchemaFields) must match the call that provided the page token.
    try {
      ListSchemaFieldsResponse result = apiInstance.listSchemaFields(collectionId, pageSize, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemaApi#listSchemaFields");
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
 **collectionId** | **String**| The collection that owns this set of schema fields, e.g. &#x60;my-collection&#x60;. |
 **pageSize** | **Integer**| The maximum number of schema fields to return. The service may return fewer than this value.  If unspecified, at most 50 schema fields are returned.  The maximum value is 1000; values above 1000 are coerced to 1000. | [optional]
 **pageToken** | **String**| A page token, received from a previous [ListSchemaFields](/docs/api-reference#operation/ListSchemaFields) call.  Provide this to retrieve the subsequent page.  When paginating, all other parameters provided to [ListSchemaFields](/docs/api-reference#operation/ListSchemaFields) must match the call that provided the page token. | [optional]

### Return type

[**ListSchemaFieldsResponse**](ListSchemaFieldsResponse.md)

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
**0** | An unexpected error response |  -  |

