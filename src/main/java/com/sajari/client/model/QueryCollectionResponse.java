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
import com.sajari.client.model.QueryAggregateResult;
import com.sajari.client.model.QueryCollectionResponsePipeline;
import com.sajari.client.model.QueryResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * QueryCollectionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T11:55:52.592Z[GMT]")
public class QueryCollectionResponse {
  public static final String SERIALIZED_NAME_PIPELINE = "pipeline";
  @SerializedName(SERIALIZED_NAME_PIPELINE)
  private QueryCollectionResponsePipeline pipeline;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private Object variables;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private java.util.List<QueryResult> results = null;

  public static final String SERIALIZED_NAME_TOTAL_SIZE = "total_size";
  @SerializedName(SERIALIZED_NAME_TOTAL_SIZE)
  private String totalSize;

  public static final String SERIALIZED_NAME_PROCESSING_DURATION = "processing_duration";
  @SerializedName(SERIALIZED_NAME_PROCESSING_DURATION)
  private String processingDuration;

  public static final String SERIALIZED_NAME_AGGREGATES = "aggregates";
  @SerializedName(SERIALIZED_NAME_AGGREGATES)
  private java.util.Map<String, QueryAggregateResult> aggregates = null;

  public static final String SERIALIZED_NAME_AGGREGATE_FILTERS = "aggregate_filters";
  @SerializedName(SERIALIZED_NAME_AGGREGATE_FILTERS)
  private java.util.Map<String, QueryAggregateResult> aggregateFilters = null;


  public QueryCollectionResponse pipeline(QueryCollectionResponsePipeline pipeline) {
    
    this.pipeline = pipeline;
    return this;
  }

   /**
   * Get pipeline
   * @return pipeline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QueryCollectionResponsePipeline getPipeline() {
    return pipeline;
  }


  public void setPipeline(QueryCollectionResponsePipeline pipeline) {
    this.pipeline = pipeline;
  }


  public QueryCollectionResponse variables(Object variables) {
    
    this.variables = variables;
    return this;
  }

   /**
   * The modified variables returned by the pipeline after it has finished processing.
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The modified variables returned by the pipeline after it has finished processing.")

  public Object getVariables() {
    return variables;
  }


  public void setVariables(Object variables) {
    this.variables = variables;
  }


  public QueryCollectionResponse results(java.util.List<QueryResult> results) {
    
    this.results = results;
    return this;
  }

  public QueryCollectionResponse addResultsItem(QueryResult resultsItem) {
    if (this.results == null) {
      this.results = new java.util.ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * The results returned by the query.
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The results returned by the query.")

  public java.util.List<QueryResult> getResults() {
    return results;
  }


  public void setResults(java.util.List<QueryResult> results) {
    this.results = results;
  }


  public QueryCollectionResponse totalSize(String totalSize) {
    
    this.totalSize = totalSize;
    return this;
  }

   /**
   * The total number of results that match the query.
   * @return totalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of results that match the query.")

  public String getTotalSize() {
    return totalSize;
  }


  public void setTotalSize(String totalSize) {
    this.totalSize = totalSize;
  }


  public QueryCollectionResponse processingDuration(String processingDuration) {
    
    this.processingDuration = processingDuration;
    return this;
  }

   /**
   * The total time taken to perform the query.
   * @return processingDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total time taken to perform the query.")

  public String getProcessingDuration() {
    return processingDuration;
  }


  public void setProcessingDuration(String processingDuration) {
    this.processingDuration = processingDuration;
  }


  public QueryCollectionResponse aggregates(java.util.Map<String, QueryAggregateResult> aggregates) {
    
    this.aggregates = aggregates;
    return this;
  }

  public QueryCollectionResponse putAggregatesItem(String key, QueryAggregateResult aggregatesItem) {
    if (this.aggregates == null) {
      this.aggregates = new java.util.HashMap<>();
    }
    this.aggregates.put(key, aggregatesItem);
    return this;
  }

   /**
   * The aggregates returned by the query.
   * @return aggregates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The aggregates returned by the query.")

  public java.util.Map<String, QueryAggregateResult> getAggregates() {
    return aggregates;
  }


  public void setAggregates(java.util.Map<String, QueryAggregateResult> aggregates) {
    this.aggregates = aggregates;
  }


  public QueryCollectionResponse aggregateFilters(java.util.Map<String, QueryAggregateResult> aggregateFilters) {
    
    this.aggregateFilters = aggregateFilters;
    return this;
  }

  public QueryCollectionResponse putAggregateFiltersItem(String key, QueryAggregateResult aggregateFiltersItem) {
    if (this.aggregateFilters == null) {
      this.aggregateFilters = new java.util.HashMap<>();
    }
    this.aggregateFilters.put(key, aggregateFiltersItem);
    return this;
  }

   /**
   * The aggregates run with filters.
   * @return aggregateFilters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The aggregates run with filters.")

  public java.util.Map<String, QueryAggregateResult> getAggregateFilters() {
    return aggregateFilters;
  }


  public void setAggregateFilters(java.util.Map<String, QueryAggregateResult> aggregateFilters) {
    this.aggregateFilters = aggregateFilters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryCollectionResponse queryCollectionResponse = (QueryCollectionResponse) o;
    return Objects.equals(this.pipeline, queryCollectionResponse.pipeline) &&
        Objects.equals(this.variables, queryCollectionResponse.variables) &&
        Objects.equals(this.results, queryCollectionResponse.results) &&
        Objects.equals(this.totalSize, queryCollectionResponse.totalSize) &&
        Objects.equals(this.processingDuration, queryCollectionResponse.processingDuration) &&
        Objects.equals(this.aggregates, queryCollectionResponse.aggregates) &&
        Objects.equals(this.aggregateFilters, queryCollectionResponse.aggregateFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipeline, variables, results, totalSize, processingDuration, aggregates, aggregateFilters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryCollectionResponse {\n");
    sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
    sb.append("    processingDuration: ").append(toIndentedString(processingDuration)).append("\n");
    sb.append("    aggregates: ").append(toIndentedString(aggregates)).append("\n");
    sb.append("    aggregateFilters: ").append(toIndentedString(aggregateFilters)).append("\n");
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

