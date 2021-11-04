# PipelinesApi

All URIs are relative to *https://api-gateway.sajari.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPipeline**](PipelinesApi.md#createPipeline) | **POST** /v4/collections/{collection_id}/pipelines | Create pipeline
[**generatePipelines**](PipelinesApi.md#generatePipelines) | **POST** /v4/collections/{collection_id}:generatePipelines | Generate pipelines
[**getDefaultPipeline**](PipelinesApi.md#getDefaultPipeline) | **GET** /v4/collections/{collection_id}:getDefaultPipeline | Get default pipeline
[**getDefaultVersion**](PipelinesApi.md#getDefaultVersion) | **GET** /v4/collections/{collection_id}/pipelines/{type}/{name}:getDefaultVersion | Get default pipeline version
[**getPipeline**](PipelinesApi.md#getPipeline) | **GET** /v4/collections/{collection_id}/pipelines/{type}/{name}/{version} | Get pipeline
[**listPipelines**](PipelinesApi.md#listPipelines) | **GET** /v4/collections/{collection_id}/pipelines | List pipelines
[**setDefaultPipeline**](PipelinesApi.md#setDefaultPipeline) | **POST** /v4/collections/{collection_id}:setDefaultPipeline | Set default pipeline
[**setDefaultVersion**](PipelinesApi.md#setDefaultVersion) | **POST** /v4/collections/{collection_id}/pipelines/{type}/{name}:setDefaultVersion | Set default pipeline version


<a name="createPipeline"></a>
# **createPipeline**
> Pipeline createPipeline(collectionId, pipeline)

Create pipeline

Create a new pipeline.  Pipelines are immutable once created. If you want to change a pipeline e.g. to add or change some steps, you need to create a new version of that pipeline.  To start using a new pipeline you need to update your record ingestion calls and/or your query calls to specify the new pipeline.  To create the pipeline from YAML, set the request&#39;s &#x60;Content-Type&#x60; header to &#x60;application/yaml&#x60; and submit the pipeline&#39;s YAML in the request body.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.PipelinesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-gateway.sajari.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    PipelinesApi apiInstance = new PipelinesApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection to create the pipeline in, e.g. `my-collection`.
    Pipeline pipeline = new Pipeline(); // Pipeline | The pipeline to create.
    try {
      Pipeline result = apiInstance.createPipeline(collectionId, pipeline);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelinesApi#createPipeline");
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
 **collectionId** | **String**| The collection to create the pipeline in, e.g. &#x60;my-collection&#x60;. |
 **pipeline** | [**Pipeline**](Pipeline.md)| The pipeline to create. |

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**401** | Returned when the request does not have valid authentication credentials. |  -  |
**403** | Returned when the user does not have permission to access the resource. |  -  |
**404** | Returned when the resource does not exist. |  -  |
**500** | Returned when the API encounters an internal error. |  -  |
**0** | An unexpected error response. |  -  |

<a name="generatePipelines"></a>
# **generatePipelines**
> GeneratePipelinesResponse generatePipelines(collectionId, generatePipelinesRequest)

Generate pipelines

Generate basic record, query and autocomplete pipeline templates. Use these templates as a starting point for your collection&#39;s pipelines.  This call returns a set of pipelines that you can pass directly to the create pipeline call.  The generated templates can be returned in JSON, the default, or YAML. To return the generated pipelines in YAML, set the request&#39;s &#x60;Accept&#x60; header to &#x60;application/yaml&#x60;. The three pipelines in the YAML response are separated by three dashes (&#x60;---&#x60;).

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.PipelinesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-gateway.sajari.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    PipelinesApi apiInstance = new PipelinesApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection, e.g. `my-collection`.
    GeneratePipelinesRequest generatePipelinesRequest = new GeneratePipelinesRequest(); // GeneratePipelinesRequest | 
    try {
      GeneratePipelinesResponse result = apiInstance.generatePipelines(collectionId, generatePipelinesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelinesApi#generatePipelines");
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
 **collectionId** | **String**| The collection, e.g. &#x60;my-collection&#x60;. |
 **generatePipelinesRequest** | [**GeneratePipelinesRequest**](GeneratePipelinesRequest.md)|  |

### Return type

[**GeneratePipelinesResponse**](GeneratePipelinesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**401** | Returned when the request does not have valid authentication credentials. |  -  |
**403** | Returned when the user does not have permission to access the resource. |  -  |
**404** | Returned when the resource does not exist. |  -  |
**500** | Returned when the API encounters an internal error. |  -  |
**0** | An unexpected error response. |  -  |

<a name="getDefaultPipeline"></a>
# **getDefaultPipeline**
> GetDefaultPipelineResponse getDefaultPipeline(collectionId, type)

Get default pipeline

Get the default pipeline for a collection.  Every collection has a default record pipeline and a default query pipeline.  When a pipeline is required to complete an operation, it can be omitted from the request if a default pipeline has been set. When adding a record to a collection, the default record pipeline is used if none is provided. When querying a collection, the default query pipeline is used if none is provided.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.PipelinesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-gateway.sajari.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    PipelinesApi apiInstance = new PipelinesApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection to get the default query pipeline of, e.g. `my-collection`.
    String type = "TYPE_UNSPECIFIED"; // String | The type of the pipeline to get.   - TYPE_UNSPECIFIED: Pipeline type not specified.  - RECORD: Record pipeline.  - QUERY: Query pipeline.
    try {
      GetDefaultPipelineResponse result = apiInstance.getDefaultPipeline(collectionId, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelinesApi#getDefaultPipeline");
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
 **collectionId** | **String**| The collection to get the default query pipeline of, e.g. &#x60;my-collection&#x60;. |
 **type** | **String**| The type of the pipeline to get.   - TYPE_UNSPECIFIED: Pipeline type not specified.  - RECORD: Record pipeline.  - QUERY: Query pipeline. | [default to TYPE_UNSPECIFIED] [enum: TYPE_UNSPECIFIED, RECORD, QUERY]

### Return type

[**GetDefaultPipelineResponse**](GetDefaultPipelineResponse.md)

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

<a name="getDefaultVersion"></a>
# **getDefaultVersion**
> Pipeline getDefaultVersion(collectionId, type, name, view)

Get default pipeline version

Get the default version for a given pipeline.  The default version of a pipeline is used when a pipeline is referred to without specifying a version.  This allows you to change the pipeline version used for requests without having to change your code.  To retrieve the pipeline in YAML, set the request&#39;s &#x60;Accept&#x60; header to &#x60;application/yaml&#x60;.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.PipelinesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-gateway.sajari.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    PipelinesApi apiInstance = new PipelinesApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection that owns the pipeline to get the default version of, e.g. `my-collection`.
    String type = "TYPE_UNSPECIFIED"; // String | The type of the pipeline to get the default version of.
    String name = "name_example"; // String | The name of the pipeline to get the default version of, e.g. `my-pipeline`.
    String view = "VIEW_UNSPECIFIED"; // String | The amount of information to include in the retrieved pipeline.   - VIEW_UNSPECIFIED: The default / unset value. The API defaults to the `BASIC` view.  - BASIC: Include basic information including type, name, version and description but not the full step configuration. This is the default value (for both [ListPipelines](/api#operation/ListPipelines) and [GetPipeline](/api#operation/GetPipeline)).  - FULL: Include the information from `BASIC`, plus full step configuration.
    try {
      Pipeline result = apiInstance.getDefaultVersion(collectionId, type, name, view);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelinesApi#getDefaultVersion");
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
 **collectionId** | **String**| The collection that owns the pipeline to get the default version of, e.g. &#x60;my-collection&#x60;. |
 **type** | **String**| The type of the pipeline to get the default version of. | [enum: TYPE_UNSPECIFIED, RECORD, QUERY]
 **name** | **String**| The name of the pipeline to get the default version of, e.g. &#x60;my-pipeline&#x60;. |
 **view** | **String**| The amount of information to include in the retrieved pipeline.   - VIEW_UNSPECIFIED: The default / unset value. The API defaults to the &#x60;BASIC&#x60; view.  - BASIC: Include basic information including type, name, version and description but not the full step configuration. This is the default value (for both [ListPipelines](/api#operation/ListPipelines) and [GetPipeline](/api#operation/GetPipeline)).  - FULL: Include the information from &#x60;BASIC&#x60;, plus full step configuration. | [optional] [default to VIEW_UNSPECIFIED] [enum: VIEW_UNSPECIFIED, BASIC, FULL]

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**401** | Returned when the request does not have valid authentication credentials. |  -  |
**403** | Returned when the user does not have permission to access the resource. |  -  |
**404** | Returned when the pipeline does not have a default version. |  -  |
**500** | Returned when the API encounters an internal error. |  -  |
**0** | An unexpected error response. |  -  |

<a name="getPipeline"></a>
# **getPipeline**
> Pipeline getPipeline(collectionId, type, name, version, view)

Get pipeline

Retrieve the details of a pipeline. Supply the type, name and version.  To retrieve the pipeline in YAML, set the request&#39;s &#x60;Accept&#x60; header to &#x60;application/yaml&#x60;.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.PipelinesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-gateway.sajari.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    PipelinesApi apiInstance = new PipelinesApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection that owns the pipeline, e.g. `my-collection`.
    String type = "TYPE_UNSPECIFIED"; // String | The type of the pipeline to retrieve.
    String name = "name_example"; // String | The name of the pipeline to retrieve, e.g. `my-pipeline`.
    String version = "version_example"; // String | The version of the pipeline to retrieve, e.g. `42`.
    String view = "VIEW_UNSPECIFIED"; // String | The amount of information to include in the retrieved pipeline.   - VIEW_UNSPECIFIED: The default / unset value. The API defaults to the `BASIC` view.  - BASIC: Include basic information including type, name, version and description but not the full step configuration. This is the default value (for both [ListPipelines](/api#operation/ListPipelines) and [GetPipeline](/api#operation/GetPipeline)).  - FULL: Include the information from `BASIC`, plus full step configuration.
    try {
      Pipeline result = apiInstance.getPipeline(collectionId, type, name, version, view);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelinesApi#getPipeline");
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
 **collectionId** | **String**| The collection that owns the pipeline, e.g. &#x60;my-collection&#x60;. |
 **type** | **String**| The type of the pipeline to retrieve. | [enum: TYPE_UNSPECIFIED, RECORD, QUERY]
 **name** | **String**| The name of the pipeline to retrieve, e.g. &#x60;my-pipeline&#x60;. |
 **version** | **String**| The version of the pipeline to retrieve, e.g. &#x60;42&#x60;. |
 **view** | **String**| The amount of information to include in the retrieved pipeline.   - VIEW_UNSPECIFIED: The default / unset value. The API defaults to the &#x60;BASIC&#x60; view.  - BASIC: Include basic information including type, name, version and description but not the full step configuration. This is the default value (for both [ListPipelines](/api#operation/ListPipelines) and [GetPipeline](/api#operation/GetPipeline)).  - FULL: Include the information from &#x60;BASIC&#x60;, plus full step configuration. | [optional] [default to VIEW_UNSPECIFIED] [enum: VIEW_UNSPECIFIED, BASIC, FULL]

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**401** | Returned when the request does not have valid authentication credentials. |  -  |
**403** | Returned when the user does not have permission to access the resource. |  -  |
**404** | Returned when the resource does not exist. |  -  |
**500** | Returned when the API encounters an internal error. |  -  |
**0** | An unexpected error response. |  -  |

<a name="listPipelines"></a>
# **listPipelines**
> ListPipelinesResponse listPipelines(collectionId, pageSize, pageToken, view)

List pipelines

Retrieve a list of pipelines in a collection.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.PipelinesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-gateway.sajari.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    PipelinesApi apiInstance = new PipelinesApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection that owns this set of pipelines, e.g. `my-collection`.
    Integer pageSize = 56; // Integer | The maximum number of pipelines to return. The service may return fewer than this value.  If unspecified, at most 50 pipelines are returned.  The maximum value is 1000; values above 1000 are coerced to 1000.
    String pageToken = "pageToken_example"; // String | A page token, received from a previous [ListPipelines](/api#operation/ListPipelines) call.  Provide this to retrieve the subsequent page.  When paginating, all other parameters provided to [ListPipelines](/api#operation/ListPipelines) must match the call that provided the page token.
    String view = "VIEW_UNSPECIFIED"; // String | The amount of information to include in each retrieved pipeline.   - VIEW_UNSPECIFIED: The default / unset value. The API defaults to the `BASIC` view.  - BASIC: Include basic information including type, name, version and description but not the full step configuration. This is the default value (for both [ListPipelines](/api#operation/ListPipelines) and [GetPipeline](/api#operation/GetPipeline)).  - FULL: Include the information from `BASIC`, plus full step configuration.
    try {
      ListPipelinesResponse result = apiInstance.listPipelines(collectionId, pageSize, pageToken, view);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelinesApi#listPipelines");
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
 **collectionId** | **String**| The collection that owns this set of pipelines, e.g. &#x60;my-collection&#x60;. |
 **pageSize** | **Integer**| The maximum number of pipelines to return. The service may return fewer than this value.  If unspecified, at most 50 pipelines are returned.  The maximum value is 1000; values above 1000 are coerced to 1000. | [optional]
 **pageToken** | **String**| A page token, received from a previous [ListPipelines](/api#operation/ListPipelines) call.  Provide this to retrieve the subsequent page.  When paginating, all other parameters provided to [ListPipelines](/api#operation/ListPipelines) must match the call that provided the page token. | [optional]
 **view** | **String**| The amount of information to include in each retrieved pipeline.   - VIEW_UNSPECIFIED: The default / unset value. The API defaults to the &#x60;BASIC&#x60; view.  - BASIC: Include basic information including type, name, version and description but not the full step configuration. This is the default value (for both [ListPipelines](/api#operation/ListPipelines) and [GetPipeline](/api#operation/GetPipeline)).  - FULL: Include the information from &#x60;BASIC&#x60;, plus full step configuration. | [optional] [default to VIEW_UNSPECIFIED] [enum: VIEW_UNSPECIFIED, BASIC, FULL]

### Return type

[**ListPipelinesResponse**](ListPipelinesResponse.md)

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

<a name="setDefaultPipeline"></a>
# **setDefaultPipeline**
> Object setDefaultPipeline(collectionId, setDefaultPipelineRequest)

Set default pipeline

Set the default pipeline for a collection.  Every collection has a default record pipeline and a default query pipeline.  When a pipeline is required to complete an operation, it can be omitted from the request if a default pipeline has been set. When adding a record to a collection, the default record pipeline is used if none is provided. When querying a collection, the default query pipeline is used if none is provided.  Once a default pipeline has been set it cannot be cleared, only set to another pipeline.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.PipelinesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-gateway.sajari.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    PipelinesApi apiInstance = new PipelinesApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection to set the default query pipeline of, e.g. `my-collection`.
    SetDefaultPipelineRequest setDefaultPipelineRequest = new SetDefaultPipelineRequest(); // SetDefaultPipelineRequest | 
    try {
      Object result = apiInstance.setDefaultPipeline(collectionId, setDefaultPipelineRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelinesApi#setDefaultPipeline");
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
 **collectionId** | **String**| The collection to set the default query pipeline of, e.g. &#x60;my-collection&#x60;. |
 **setDefaultPipelineRequest** | [**SetDefaultPipelineRequest**](SetDefaultPipelineRequest.md)|  |

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

<a name="setDefaultVersion"></a>
# **setDefaultVersion**
> Object setDefaultVersion(collectionId, type, name, setDefaultVersionRequest)

Set default pipeline version

Set the default version for a given pipeline.  The default version of a pipeline is used when a pipeline is referred to without specifying a version.  This allows you to change the pipeline version used for requests without having to change your code.

### Example
```java
// Import classes:
import com.sajari.client.ApiClient;
import com.sajari.client.ApiException;
import com.sajari.client.Configuration;
import com.sajari.client.auth.*;
import com.sajari.client.models.*;
import com.sajari.client.api.PipelinesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-gateway.sajari.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    PipelinesApi apiInstance = new PipelinesApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection that owns the pipeline to set the default version of, e.g. `my-collection`.
    String type = "TYPE_UNSPECIFIED"; // String | The type of the pipeline to set the default version of.
    String name = "name_example"; // String | The name of the pipeline to set the default version of, e.g. `my-pipeline`.
    SetDefaultVersionRequest setDefaultVersionRequest = new SetDefaultVersionRequest(); // SetDefaultVersionRequest | 
    try {
      Object result = apiInstance.setDefaultVersion(collectionId, type, name, setDefaultVersionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelinesApi#setDefaultVersion");
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
 **collectionId** | **String**| The collection that owns the pipeline to set the default version of, e.g. &#x60;my-collection&#x60;. |
 **type** | **String**| The type of the pipeline to set the default version of. | [enum: TYPE_UNSPECIFIED, RECORD, QUERY]
 **name** | **String**| The name of the pipeline to set the default version of, e.g. &#x60;my-pipeline&#x60;. |
 **setDefaultVersionRequest** | [**SetDefaultVersionRequest**](SetDefaultVersionRequest.md)|  |

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

