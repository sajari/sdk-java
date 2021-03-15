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
import com.sajari.client.model.QueryCollectionRequestPipeline;
import com.sajari.client.model.QueryCollectionRequestTracking;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A request to perform a search using a pipeline.
 */
@ApiModel(description = "A request to perform a search using a pipeline.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T11:55:52.592Z[GMT]")
public class QueryCollectionRequest {
  public static final String SERIALIZED_NAME_PIPELINE = "pipeline";
  @SerializedName(SERIALIZED_NAME_PIPELINE)
  private QueryCollectionRequestPipeline pipeline;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private Object variables;

  public static final String SERIALIZED_NAME_TRACKING = "tracking";
  @SerializedName(SERIALIZED_NAME_TRACKING)
  private QueryCollectionRequestTracking tracking;


  public QueryCollectionRequest pipeline(QueryCollectionRequestPipeline pipeline) {
    
    this.pipeline = pipeline;
    return this;
  }

   /**
   * Get pipeline
   * @return pipeline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QueryCollectionRequestPipeline getPipeline() {
    return pipeline;
  }


  public void setPipeline(QueryCollectionRequestPipeline pipeline) {
    this.pipeline = pipeline;
  }


  public QueryCollectionRequest variables(Object variables) {
    
    this.variables = variables;
    return this;
  }

   /**
   * The initial values for the variables the pipeline operates on and transforms throughout its steps.  A typical variable is &#x60;q&#x60; which is the query the user entered, for example:  &#x60;&#x60;&#x60;json { \&quot;q\&quot;: \&quot;search terms\&quot; } &#x60;&#x60;&#x60;
   * @return variables
  **/
  @ApiModelProperty(required = true, value = "The initial values for the variables the pipeline operates on and transforms throughout its steps.  A typical variable is `q` which is the query the user entered, for example:  ```json { \"q\": \"search terms\" } ```")

  public Object getVariables() {
    return variables;
  }


  public void setVariables(Object variables) {
    this.variables = variables;
  }


  public QueryCollectionRequest tracking(QueryCollectionRequestTracking tracking) {
    
    this.tracking = tracking;
    return this;
  }

   /**
   * Get tracking
   * @return tracking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QueryCollectionRequestTracking getTracking() {
    return tracking;
  }


  public void setTracking(QueryCollectionRequestTracking tracking) {
    this.tracking = tracking;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryCollectionRequest queryCollectionRequest = (QueryCollectionRequest) o;
    return Objects.equals(this.pipeline, queryCollectionRequest.pipeline) &&
        Objects.equals(this.variables, queryCollectionRequest.variables) &&
        Objects.equals(this.tracking, queryCollectionRequest.tracking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipeline, variables, tracking);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryCollectionRequest {\n");
    sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
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

