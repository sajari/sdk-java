

# PipelineStep

Step creates a pipeline step.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotations** | **java.util.List&lt;String&gt;** | Annotations added to the request when the step is run. |  [optional]
**condition** | **String** | A condition expression to determine if the step should be run.  This is a filter expression much like the query filter expression, but it acts upon the pipeline variables.  For example, to only run the step if the pipeline &#x60;q&#x60; variable is not empty, set this to &#x60;q !&#x3D; &#39;&#39;&#x60;. |  [optional]
**description** | **String** | Description for the step. Overrides the default description. |  [optional]
**id** | **String** | ID of the step template. | 
**params** | [**Map&lt;String, PipelineStepParamBinding&gt;**](PipelineStepParamBinding.md) | Bindings for the step parameters. |  [optional]
**title** | **String** | Title for the step. Overrides the default title. |  [optional]



