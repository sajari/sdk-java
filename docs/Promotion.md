

# Promotion

Promotion contains a trigger, determining which searches it should be active for, and a list of alterations that should be made to search results when it is active.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**banners** | [**java.util.List&lt;Banner&gt;**](Banner.md) | The banners that are injected into the result set when the promotion is triggered. |  [optional]
**collectionId** | **String** | Output only. The ID of the collection that owns this promotion. |  [optional] [readonly]
**condition** | **String** | A condition expression applied to a search request that determines which searches the promotion is active for.  For example, to apply the promotion&#39;s pins and boosts whenever a user searches for &#39;shoes&#39; set condition to &#x60;q &#x3D; &#39;shoes&#39;&#x60;. | 
**createTime** | **OffsetDateTime** | Output only. Time the promotion was created. |  [optional] [readonly]
**disabled** | **Boolean** | If disabled, the promotion is never triggered. |  [optional]
**displayName** | **String** | The promotion&#39;s display name. | 
**endTime** | **OffsetDateTime** | If specified, the promotion is considered disabled after this time. |  [optional]
**exclusions** | [**java.util.List&lt;PromotionExclusion&gt;**](PromotionExclusion.md) | The records to exclude from search results, if the promotion is enabled. |  [optional]
**filterBoosts** | [**java.util.List&lt;PromotionFilterBoost&gt;**](PromotionFilterBoost.md) | The filter boosts to apply to searches, if the promotion is enabled. |  [optional]
**filterConditions** | [**java.util.List&lt;PromotionFilterCondition&gt;**](PromotionFilterCondition.md) | The conditions applied to the filters passed from the user. A query must match at least one of these in order to trigger the promotion. A filter condition is comprised of a set of filters of the form &#x60;field &#x3D; value&#x60; and matches a query if all of those filters are present in the query.  For example, a query with the filter &#x60;productType &#x3D; &#39;shirt&#39; AND size &#x3D; &#39;medium&#39;&#x60; triggers a promotion with the filter condition &#x60;productType &#x3D; &#39;shirt&#39;&#x60;, but not one with both &#x60;productType &#x3D; &#39;shirt&#39;, and &#x60;size &#x3D; &#39;small&#39;&#x60;. |  [optional]
**id** | **String** | The promotion&#39;s ID. |  [optional]
**pins** | [**java.util.List&lt;PromotionPin&gt;**](PromotionPin.md) | The items to fix to specific positions in the search results. |  [optional]
**rangeBoosts** | [**java.util.List&lt;PromotionRangeBoost&gt;**](PromotionRangeBoost.md) | The range boosts to apply to searches, if the promotion is enabled. |  [optional]
**startTime** | **OffsetDateTime** | If specified, the promotion is considered disabled before this time. |  [optional]
**updateTime** | **OffsetDateTime** | Output only. Time the promotion was last updated. |  [optional] [readonly]



