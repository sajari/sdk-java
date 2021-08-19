

# QueryCollectionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pipeline** | [**QueryCollectionResponsePipeline**](QueryCollectionResponsePipeline.md) |  |  [optional]
**variables** | **Object** | The modified variables returned by the pipeline after it has finished processing. |  [optional]
**results** | [**java.util.List&lt;QueryResult&gt;**](QueryResult.md) | The results returned by the query. |  [optional]
**totalSize** | **String** | The total number of results that match the query. |  [optional]
**processingDuration** | **String** | The total time taken to perform the query. |  [optional]
**aggregates** | [**Map&lt;String, QueryAggregateResult&gt;**](QueryAggregateResult.md) | The aggregates returned by the query. |  [optional]
**aggregateFilters** | [**Map&lt;String, QueryAggregateResult&gt;**](QueryAggregateResult.md) | The aggregates run with filters. |  [optional]



