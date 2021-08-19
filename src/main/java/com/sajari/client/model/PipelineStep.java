/*
 * Sajari API
 * Sajari is a smart, highly-configurable, real-time search service that enables thousands of businesses worldwide to provide amazing search experiences on their websites, stores, and applications.
 *
 * The version of the OpenAPI document: v4
 * Contact: support@sajari.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.sajari.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sajari.client.model.PipelineStepParamBinding;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Step creates a pipeline step.
 */
@ApiModel(description = "Step creates a pipeline step.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-19T12:37:05.253753Z[Etc/UTC]")
public class PipelineStep {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private java.util.Map<String, PipelineStepParamBinding> params = null;

  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private String condition;

  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private java.util.List<String> annotations = null;


  public PipelineStep id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the step template.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID of the step template.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PipelineStep title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title for the step. Overrides the default title.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title for the step. Overrides the default title.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public PipelineStep description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description for the step. Overrides the default description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description for the step. Overrides the default description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PipelineStep params(java.util.Map<String, PipelineStepParamBinding> params) {
    
    this.params = params;
    return this;
  }

  public PipelineStep putParamsItem(String key, PipelineStepParamBinding paramsItem) {
    if (this.params == null) {
      this.params = new java.util.HashMap<>();
    }
    this.params.put(key, paramsItem);
    return this;
  }

   /**
   * Bindings for the step parameters.
   * @return params
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bindings for the step parameters.")

  public java.util.Map<String, PipelineStepParamBinding> getParams() {
    return params;
  }


  public void setParams(java.util.Map<String, PipelineStepParamBinding> params) {
    this.params = params;
  }


  public PipelineStep condition(String condition) {
    
    this.condition = condition;
    return this;
  }

   /**
   * Condition expression to determine if the step should be run.  This is a filter expression much like the query filter expression, but it acts upon the pipeline variables.  For example, to only run the step if the pipeline &#x60;q&#x60; variable is not empty, set this to &#x60;q !&#x3D; &#39;&#39;&#x60;.
   * @return condition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Condition expression to determine if the step should be run.  This is a filter expression much like the query filter expression, but it acts upon the pipeline variables.  For example, to only run the step if the pipeline `q` variable is not empty, set this to `q != ''`.")

  public String getCondition() {
    return condition;
  }


  public void setCondition(String condition) {
    this.condition = condition;
  }


  public PipelineStep annotations(java.util.List<String> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public PipelineStep addAnnotationsItem(String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new java.util.ArrayList<>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * Annotations added to the request when the step is run.
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Annotations added to the request when the step is run.")

  public java.util.List<String> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(java.util.List<String> annotations) {
    this.annotations = annotations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineStep pipelineStep = (PipelineStep) o;
    return Objects.equals(this.id, pipelineStep.id) &&
        Objects.equals(this.title, pipelineStep.title) &&
        Objects.equals(this.description, pipelineStep.description) &&
        Objects.equals(this.params, pipelineStep.params) &&
        Objects.equals(this.condition, pipelineStep.condition) &&
        Objects.equals(this.annotations, pipelineStep.annotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, params, condition, annotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineStep {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

