# sdk-java-client

Search.io API

- API version: v4

Search.io offers a search and discovery service with Neuralsearch®, the world's first instant AI search technology. Businesses of all sizes use Search.io to build site search and discovery solutions that maximize e-commerce revenue, optimize on-site customer experience, and scale their online presence.

    For more information, please visit [https://www.search.io/company/contact](https://www.search.io/company/contact)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.sajari</groupId>
    <artifactId>sdk-java-client</artifactId>
    <version>4.3.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sajari:sdk-java-client:4.3.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/sdk-java-client-4.3.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

    import com.sajari.client.*;
    import com.sajari.client.auth.*;
    import com.sajari.client.model.*;
    import com.sajari.client.api.CollectionsApi;

    public class CollectionsApiExample {

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

## Documentation for API Endpoints

All URIs are relative to *https://api.search.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CollectionsApi* | [**createCollection**](docs/CollectionsApi.md#createCollection) | **POST** /v4/collections | Create collection
*CollectionsApi* | [**deleteCollection**](docs/CollectionsApi.md#deleteCollection) | **DELETE** /v4/collections/{collection_id} | Delete collection
*CollectionsApi* | [**getCollection**](docs/CollectionsApi.md#getCollection) | **GET** /v4/collections/{collection_id} | Get collection
*CollectionsApi* | [**listCollections**](docs/CollectionsApi.md#listCollections) | **GET** /v4/collections | List collections
*CollectionsApi* | [**queryCollection**](docs/CollectionsApi.md#queryCollection) | **POST** /v4/collections/{collection_id}:query | Query collection
*CollectionsApi* | [**queryCollection2**](docs/CollectionsApi.md#queryCollection2) | **POST** /v4/collections/{collection_id}:queryCollection | Query collection
*CollectionsApi* | [**updateCollection**](docs/CollectionsApi.md#updateCollection) | **PATCH** /v4/collections/{collection_id} | Update collection
*EventsApi* | [**sendEvent**](docs/EventsApi.md#sendEvent) | **POST** /v4/events:send | Send event
*EventsApi* | [**sendEvent2**](docs/EventsApi.md#sendEvent2) | **POST** /v4/events:sendEvent | Send event
*PipelinesApi* | [**createPipeline**](docs/PipelinesApi.md#createPipeline) | **POST** /v4/collections/{collection_id}/pipelines | Create pipeline
*PipelinesApi* | [**generatePipelines**](docs/PipelinesApi.md#generatePipelines) | **POST** /v4/collections/{collection_id}:generatePipelines | Generate pipelines
*PipelinesApi* | [**getDefaultPipeline**](docs/PipelinesApi.md#getDefaultPipeline) | **GET** /v4/collections/{collection_id}:getDefaultPipeline | Get default pipeline
*PipelinesApi* | [**getDefaultVersion**](docs/PipelinesApi.md#getDefaultVersion) | **GET** /v4/collections/{collection_id}/pipelines/{type}/{name}:getDefaultVersion | Get default pipeline version
*PipelinesApi* | [**getPipeline**](docs/PipelinesApi.md#getPipeline) | **GET** /v4/collections/{collection_id}/pipelines/{type}/{name}/{version} | Get pipeline
*PipelinesApi* | [**listPipelines**](docs/PipelinesApi.md#listPipelines) | **GET** /v4/collections/{collection_id}/pipelines | List pipelines
*PipelinesApi* | [**setDefaultPipeline**](docs/PipelinesApi.md#setDefaultPipeline) | **POST** /v4/collections/{collection_id}:setDefaultPipeline | Set default pipeline
*PipelinesApi* | [**setDefaultVersion**](docs/PipelinesApi.md#setDefaultVersion) | **POST** /v4/collections/{collection_id}/pipelines/{type}/{name}:setDefaultVersion | Set default pipeline version
*PromotionsApi* | [**createPromotion**](docs/PromotionsApi.md#createPromotion) | **POST** /v4/collections/{collection_id}/promotions | Create promotion
*PromotionsApi* | [**deletePromotion**](docs/PromotionsApi.md#deletePromotion) | **DELETE** /v4/collections/{collection_id}/promotions/{promotion_id} | Delete promotion
*PromotionsApi* | [**getPromotion**](docs/PromotionsApi.md#getPromotion) | **GET** /v4/collections/{collection_id}/promotions/{promotion_id} | Get promotion
*PromotionsApi* | [**listPromotions**](docs/PromotionsApi.md#listPromotions) | **GET** /v4/collections/{collection_id}/promotions | List promotions
*PromotionsApi* | [**updatePromotion**](docs/PromotionsApi.md#updatePromotion) | **PATCH** /v4/collections/{collection_id}/promotions/{promotion_id} | Update promotion
*RecordsApi* | [**batchUpdateRecords**](docs/RecordsApi.md#batchUpdateRecords) | **POST** /v4/collections/{collection_id}/records:batchUpdate | Batch update records
*RecordsApi* | [**batchUpsertRecords**](docs/RecordsApi.md#batchUpsertRecords) | **POST** /v4/collections/{collection_id}/records:batchUpsert | Batch upsert records
*RecordsApi* | [**deleteRecord**](docs/RecordsApi.md#deleteRecord) | **POST** /v4/collections/{collection_id}/records:delete | Delete record
*RecordsApi* | [**getRecord**](docs/RecordsApi.md#getRecord) | **POST** /v4/collections/{collection_id}/records:get | Get record
*RecordsApi* | [**updateRecord**](docs/RecordsApi.md#updateRecord) | **POST** /v4/collections/{collection_id}/records:update | Update record
*RecordsApi* | [**upsertRecord**](docs/RecordsApi.md#upsertRecord) | **POST** /v4/collections/{collection_id}/records:upsert | Upsert record
*RedirectsApi* | [**createRedirect**](docs/RedirectsApi.md#createRedirect) | **POST** /v4/collections/{collection_id}/redirects | Create redirect
*RedirectsApi* | [**deleteRedirect**](docs/RedirectsApi.md#deleteRedirect) | **DELETE** /v4/collections/{collection_id}/redirects/{redirect_id} | Delete redirect
*RedirectsApi* | [**getRedirect**](docs/RedirectsApi.md#getRedirect) | **GET** /v4/collections/{collection_id}/redirects/{redirect_id} | Get redirect
*RedirectsApi* | [**listRedirects**](docs/RedirectsApi.md#listRedirects) | **GET** /v4/collections/{collection_id}/redirects | List redirects
*RedirectsApi* | [**updateRedirect**](docs/RedirectsApi.md#updateRedirect) | **PATCH** /v4/collections/{collection_id}/redirects/{redirect_id} | Update redirect
*SchemaApi* | [**batchCreateSchemaFields**](docs/SchemaApi.md#batchCreateSchemaFields) | **POST** /v4/collections/{collection_id}/schemaFields:batchCreate | Batch create schema fields
*SchemaApi* | [**createSchemaField**](docs/SchemaApi.md#createSchemaField) | **POST** /v4/collections/{collection_id}/schemaFields | Create schema field
*SchemaApi* | [**listSchemaFields**](docs/SchemaApi.md#listSchemaFields) | **GET** /v4/collections/{collection_id}/schemaFields | List schema fields


## Documentation for Models

 - [ActivePromotion](docs/ActivePromotion.md)
 - [BatchCreateSchemaFieldsRequest](docs/BatchCreateSchemaFieldsRequest.md)
 - [BatchCreateSchemaFieldsResponse](docs/BatchCreateSchemaFieldsResponse.md)
 - [BatchCreateSchemaFieldsResponseError](docs/BatchCreateSchemaFieldsResponseError.md)
 - [BatchUpdateRecordsRequest](docs/BatchUpdateRecordsRequest.md)
 - [BatchUpdateRecordsResponse](docs/BatchUpdateRecordsResponse.md)
 - [BatchUpdateRecordsResponseError](docs/BatchUpdateRecordsResponseError.md)
 - [BatchUpdateRecordsResponseRecord](docs/BatchUpdateRecordsResponseRecord.md)
 - [BatchUpsertRecordsRequest](docs/BatchUpsertRecordsRequest.md)
 - [BatchUpsertRecordsRequestPipeline](docs/BatchUpsertRecordsRequestPipeline.md)
 - [BatchUpsertRecordsResponse](docs/BatchUpsertRecordsResponse.md)
 - [BatchUpsertRecordsResponseError](docs/BatchUpsertRecordsResponseError.md)
 - [BatchUpsertRecordsResponseKey](docs/BatchUpsertRecordsResponseKey.md)
 - [BatchUpsertRecordsResponseVariables](docs/BatchUpsertRecordsResponseVariables.md)
 - [Collection](docs/Collection.md)
 - [DeleteRecordRequest](docs/DeleteRecordRequest.md)
 - [Error](docs/Error.md)
 - [GeneratePipelinesRequest](docs/GeneratePipelinesRequest.md)
 - [GeneratePipelinesResponse](docs/GeneratePipelinesResponse.md)
 - [GetDefaultPipelineResponse](docs/GetDefaultPipelineResponse.md)
 - [GetDefaultVersionRequestView](docs/GetDefaultVersionRequestView.md)
 - [GetPipelineRequestView](docs/GetPipelineRequestView.md)
 - [GetRecordRequest](docs/GetRecordRequest.md)
 - [ListCollectionsResponse](docs/ListCollectionsResponse.md)
 - [ListPipelinesRequestView](docs/ListPipelinesRequestView.md)
 - [ListPipelinesResponse](docs/ListPipelinesResponse.md)
 - [ListPromotionsResponse](docs/ListPromotionsResponse.md)
 - [ListRedirectsResponse](docs/ListRedirectsResponse.md)
 - [ListSchemaFieldsResponse](docs/ListSchemaFieldsResponse.md)
 - [PercentileDataPoint](docs/PercentileDataPoint.md)
 - [Pipeline](docs/Pipeline.md)
 - [PipelineStep](docs/PipelineStep.md)
 - [PipelineStepParamBinding](docs/PipelineStepParamBinding.md)
 - [PipelineType](docs/PipelineType.md)
 - [Promotion](docs/Promotion.md)
 - [PromotionCategory](docs/PromotionCategory.md)
 - [PromotionExclusion](docs/PromotionExclusion.md)
 - [PromotionFilterBoost](docs/PromotionFilterBoost.md)
 - [PromotionFilterCondition](docs/PromotionFilterCondition.md)
 - [PromotionPin](docs/PromotionPin.md)
 - [PromotionRangeBoost](docs/PromotionRangeBoost.md)
 - [ProtobufAny](docs/ProtobufAny.md)
 - [ProtobufFieldMask](docs/ProtobufFieldMask.md)
 - [ProtobufNullValue](docs/ProtobufNullValue.md)
 - [QueryAggregateResult](docs/QueryAggregateResult.md)
 - [QueryAggregateResultAnalysis](docs/QueryAggregateResultAnalysis.md)
 - [QueryAggregateResultBuckets](docs/QueryAggregateResultBuckets.md)
 - [QueryAggregateResultBucketsBucket](docs/QueryAggregateResultBucketsBucket.md)
 - [QueryAggregateResultCount](docs/QueryAggregateResultCount.md)
 - [QueryAggregateResultDate](docs/QueryAggregateResultDate.md)
 - [QueryAggregateResultMetric](docs/QueryAggregateResultMetric.md)
 - [QueryAggregateResultPercentile](docs/QueryAggregateResultPercentile.md)
 - [QueryCollectionRequest](docs/QueryCollectionRequest.md)
 - [QueryCollectionRequestPipeline](docs/QueryCollectionRequestPipeline.md)
 - [QueryCollectionRequestTracking](docs/QueryCollectionRequestTracking.md)
 - [QueryCollectionRequestTrackingType](docs/QueryCollectionRequestTrackingType.md)
 - [QueryCollectionResponse](docs/QueryCollectionResponse.md)
 - [QueryCollectionResponsePipeline](docs/QueryCollectionResponsePipeline.md)
 - [QueryResult](docs/QueryResult.md)
 - [QueryResultToken](docs/QueryResultToken.md)
 - [QueryResultTokenClick](docs/QueryResultTokenClick.md)
 - [QueryResultTokenPosNeg](docs/QueryResultTokenPosNeg.md)
 - [RecordKey](docs/RecordKey.md)
 - [Redirect](docs/Redirect.md)
 - [RedirectResult](docs/RedirectResult.md)
 - [SchemaField](docs/SchemaField.md)
 - [SchemaFieldMode](docs/SchemaFieldMode.md)
 - [SchemaFieldType](docs/SchemaFieldType.md)
 - [SendEventRequest](docs/SendEventRequest.md)
 - [SetDefaultPipelineRequest](docs/SetDefaultPipelineRequest.md)
 - [SetDefaultVersionRequest](docs/SetDefaultVersionRequest.md)
 - [Status](docs/Status.md)
 - [UpdateRecordRequest](docs/UpdateRecordRequest.md)
 - [UpsertRecordRequest](docs/UpsertRecordRequest.md)
 - [UpsertRecordRequestPipeline](docs/UpsertRecordRequestPipeline.md)
 - [UpsertRecordResponse](docs/UpsertRecordResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### BasicAuth


    - **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@search.io
