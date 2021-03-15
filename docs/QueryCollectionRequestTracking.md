

# QueryCollectionRequestTracking

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**QueryCollectionRequestTrackingType**](QueryCollectionRequestTrackingType.md) |  |  [optional]
**queryId** | **String** | Query ID of the query. If this is empty, then one is generated. |  [optional]
**sequence** | **Integer** | Sequence number of query. |  [optional]
**field** | **String** | Tracking field used to identify records in the collection.  Must be unique schema field. |  [optional]
**data** | **java.util.Map&lt;String, String&gt;** | Custom values to be included in tracking data. |  [optional]



