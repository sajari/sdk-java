

# Pipeline


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**collectionDefault** | **Boolean** | Output only. Indicates if the pipeline is the collection default pipeline. |  [optional] [readonly]
**createTime** | **OffsetDateTime** | Output only. Time the pipeline was created. |  [optional] [readonly]
**defaultVersion** | **Boolean** | Output only. Indicates if the pipeline is the default version. |  [optional] [readonly]
**description** | **String** | Description of the pipeline. |  [optional]
**name** | **String** | The pipeline&#39;s name.  Must start with an alphanumeric character followed by one or more alphanumeric, &#x60;_&#x60;, &#x60;-&#x60; or &#x60;.&#x60; characters. Strictly speaking, it must match the regular expression: &#x60;^[a-zA-Z0-9][a-zA-Z0-9_\\-\\.]+$&#x60;. | 
**postSteps** | [**java.util.List&lt;PipelineStep&gt;**](PipelineStep.md) | The post-steps that are run after an indexing operation or query request has been sent to the search index.  For indexing operations, the post-steps only run when creating new records. They do not run when updating records.  For querying, the post-steps have access to the result-set. This makes it possible to act on the results before sending them back to the caller. |  [optional]
**preSteps** | [**java.util.List&lt;PipelineStep&gt;**](PipelineStep.md) | The pre-steps that are run before an indexing operation or query request is sent to the search index. |  [optional]
**type** | **PipelineType** |  | 
**version** | **String** | The pipeline&#39;s version.  Must start with an alphanumeric character followed by one or more alphanumeric, &#x60;_&#x60;, &#x60;-&#x60; or &#x60;.&#x60; characters. Strictly speaking, it must match the regular expression: &#x60;^[a-zA-Z0-9][a-zA-Z0-9_\\-\\.]+$&#x60;. | 



