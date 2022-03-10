

# QueryCollectionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activePromotions** | [**java.util.List&lt;ActivePromotion&gt;**](ActivePromotion.md) | A list of the promotions activated when running the query. |  [optional]
**aggregateFilters** | [**Map&lt;String, QueryAggregateResult&gt;**](QueryAggregateResult.md) | The aggregates run with filters. |  [optional]
**aggregates** | [**Map&lt;String, QueryAggregateResult&gt;**](QueryAggregateResult.md) | The aggregates returned by the query. |  [optional]
**banners** | [**java.util.List&lt;Banner&gt;**](Banner.md) | Banners associated with this query. |  [optional]
**featureScoreWeight** | **Double** | The weight applied to the features in the query, used for analyzing the index, neural and feature components for results.  For each result:  &#x60;&#x60;&#x60; score &#x3D; max(index_score, neural_score) * (1 - feature_score_weight) +         feature_score * feature_score_weight &#x60;&#x60;&#x60; |  [optional]
**pipeline** | [**QueryCollectionResponsePipeline**](QueryCollectionResponsePipeline.md) |  |  [optional]
**processingDuration** | **String** | The total time taken to perform the query. |  [optional]
**queryId** | **String** | The query identifier.  This uniqely identifies the specific query it was returned on. This is used to link user interactions with a query. |  [optional]
**redirects** | [**Map&lt;String, RedirectResult&gt;**](RedirectResult.md) | A mapping of redirects triggered for all possible variations of the query. |  [optional]
**results** | [**java.util.List&lt;QueryResult&gt;**](QueryResult.md) | The results returned by the query. |  [optional]
**totalSize** | **String** | The total number of results that match the query. |  [optional]
**variables** | **Map&lt;String, Object&gt;** | The modified variables returned by the pipeline after it has finished processing. |  [optional]



