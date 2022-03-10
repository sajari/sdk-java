# RecordsApi

All URIs are relative to *https://api.search.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchUpdateRecords**](RecordsApi.md#batchUpdateRecords) | **POST** /v4/collections/{collection_id}/records:batchUpdate | Batch update records
[**batchUpsertRecords**](RecordsApi.md#batchUpsertRecords) | **POST** /v4/collections/{collection_id}/records:batchUpsert | Batch upsert records
[**deleteRecord**](RecordsApi.md#deleteRecord) | **POST** /v4/collections/{collection_id}/records:delete | Delete record
[**getRecord**](RecordsApi.md#getRecord) | **POST** /v4/collections/{collection_id}/records:get | Get record
[**updateRecord**](RecordsApi.md#updateRecord) | **POST** /v4/collections/{collection_id}/records:update | Update record
[**upsertRecord**](RecordsApi.md#upsertRecord) | **POST** /v4/collections/{collection_id}/records:upsert | Upsert record


<a name="batchUpdateRecords"></a>
# **batchUpdateRecords**
> BatchUpdateRecordsResponse batchUpdateRecords(collectionId, batchUpdateRecordsRequest)

Batch update records

The batch version of the [UpdateRecord](/docs/api#operation/UpdateRecord) call.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.RecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection that contains the records to update, e.g. `my-collection`.
    BatchUpdateRecordsRequest batchUpdateRecordsRequest = new BatchUpdateRecordsRequest(); // BatchUpdateRecordsRequest | 
    try {
      BatchUpdateRecordsResponse result = apiInstance.batchUpdateRecords(collectionId, batchUpdateRecordsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#batchUpdateRecords");
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
 **collectionId** | **String**| The collection that contains the records to update, e.g. &#x60;my-collection&#x60;. |
 **batchUpdateRecordsRequest** | [**BatchUpdateRecordsRequest**](BatchUpdateRecordsRequest.md)|  |

### Return type

[**BatchUpdateRecordsResponse**](BatchUpdateRecordsResponse.md)

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

<a name="batchUpsertRecords"></a>
# **batchUpsertRecords**
> BatchUpsertRecordsResponse batchUpsertRecords(collectionId, batchUpsertRecordsRequest)

Batch upsert records

The batch version of the [UpsertRecord](/docs/api#operation/UpsertRecord) call.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.RecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection to upsert the records in, e.g. `my-collection`.
    BatchUpsertRecordsRequest batchUpsertRecordsRequest = new BatchUpsertRecordsRequest(); // BatchUpsertRecordsRequest | 
    try {
      BatchUpsertRecordsResponse result = apiInstance.batchUpsertRecords(collectionId, batchUpsertRecordsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#batchUpsertRecords");
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
 **collectionId** | **String**| The collection to upsert the records in, e.g. &#x60;my-collection&#x60;. |
 **batchUpsertRecordsRequest** | [**BatchUpsertRecordsRequest**](BatchUpsertRecordsRequest.md)|  |

### Return type

[**BatchUpsertRecordsResponse**](BatchUpsertRecordsResponse.md)

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

<a name="deleteRecord"></a>
# **deleteRecord**
> Object deleteRecord(collectionId, deleteRecordRequest)

Delete record

Delete a record with the given key.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.RecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection that contains the record to delete, e.g. `my-collection`.
    DeleteRecordRequest deleteRecordRequest = new DeleteRecordRequest(); // DeleteRecordRequest | 
    try {
      Object result = apiInstance.deleteRecord(collectionId, deleteRecordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#deleteRecord");
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
 **collectionId** | **String**| The collection that contains the record to delete, e.g. &#x60;my-collection&#x60;. |
 **deleteRecordRequest** | [**DeleteRecordRequest**](DeleteRecordRequest.md)|  |

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

<a name="getRecord"></a>
# **getRecord**
> Object getRecord(collectionId, getRecordRequest)

Get record

Retrieve a record with the given key.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.RecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection that contains the record to retrieve, e.g. `my-collection`.
    GetRecordRequest getRecordRequest = new GetRecordRequest(); // GetRecordRequest | 
    try {
      Object result = apiInstance.getRecord(collectionId, getRecordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#getRecord");
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
 **collectionId** | **String**| The collection that contains the record to retrieve, e.g. &#x60;my-collection&#x60;. |
 **getRecordRequest** | [**GetRecordRequest**](GetRecordRequest.md)|  |

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

<a name="updateRecord"></a>
# **updateRecord**
> Object updateRecord(collectionId, updateRecordRequest)

Update record

Add or update specific fields within a record with the given values. The updated record is returned in the response.  To replace all fields in a record, you should use the [UpsertRecord](/docs/api#operation/UpsertRecord) call.  Note that the update record call cannot be used to add or update indexed or unique fields. For this case use the [UpsertRecord](/docs/api#operation/UpsertRecord) call.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.RecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection that contains the record to update, e.g. `my-collection`.
    UpdateRecordRequest updateRecordRequest = new UpdateRecordRequest(); // UpdateRecordRequest | 
    try {
      Object result = apiInstance.updateRecord(collectionId, updateRecordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#updateRecord");
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
 **collectionId** | **String**| The collection that contains the record to update, e.g. &#x60;my-collection&#x60;. |
 **updateRecordRequest** | [**UpdateRecordRequest**](UpdateRecordRequest.md)|  |

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

<a name="upsertRecord"></a>
# **upsertRecord**
> UpsertRecordResponse upsertRecord(collectionId, upsertRecordRequest)

Upsert record

If the record does not exist in the collection it is inserted. If it does exist it is updated.  If no pipeline is specified, the default record pipeline is used to process the record.  If the record is inserted, the response contains the key of the inserted record. You can use this if you need to retrieve or delete the record. If the record is updated, the response does not contain a key. Callers can use this as a signal to determine if the record is inserted/created or updated.  For example, to add a single product from your ecommerce store to a collection, use the following call:  &#x60;&#x60;&#x60;json {   \&quot;pipeline\&quot;: {     \&quot;name\&quot;: \&quot;my-pipeline\&quot;,     \&quot;version\&quot;: \&quot;1\&quot;   },   \&quot;record\&quot;: {     \&quot;id\&quot;: \&quot;54hdc7h2334h\&quot;,     \&quot;name\&quot;: \&quot;Smart TV\&quot;,     \&quot;price\&quot;: 1999,     \&quot;brand\&quot;: \&quot;Acme\&quot;,     \&quot;description\&quot;: \&quot;...\&quot;,     \&quot;in_stock\&quot;: true   } } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.RecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.search.io");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection to upsert the record in, e.g. `my-collection`.
    UpsertRecordRequest upsertRecordRequest = new UpsertRecordRequest(); // UpsertRecordRequest | 
    try {
      UpsertRecordResponse result = apiInstance.upsertRecord(collectionId, upsertRecordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#upsertRecord");
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
 **collectionId** | **String**| The collection to upsert the record in, e.g. &#x60;my-collection&#x60;. |
 **upsertRecordRequest** | [**UpsertRecordRequest**](UpsertRecordRequest.md)|  |

### Return type

[**UpsertRecordResponse**](UpsertRecordResponse.md)

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

