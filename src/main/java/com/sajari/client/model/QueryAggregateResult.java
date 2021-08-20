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
import com.sajari.client.model.QueryAggregateResultAnalysis;
import com.sajari.client.model.QueryAggregateResultBuckets;
import com.sajari.client.model.QueryAggregateResultCount;
import com.sajari.client.model.QueryAggregateResultDate;
import com.sajari.client.model.QueryAggregateResultMetric;
import com.sajari.client.model.QueryAggregateResultPercentile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A query aggregate result contains results of aggregations.
 */
@ApiModel(description = "A query aggregate result contains results of aggregations.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-20T00:31:03.336071Z[Etc/UTC]")
public class QueryAggregateResult {
  public static final String SERIALIZED_NAME_METRIC = "metric";
  @SerializedName(SERIALIZED_NAME_METRIC)
  private QueryAggregateResultMetric metric;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private QueryAggregateResultCount count;

  public static final String SERIALIZED_NAME_BUCKETS = "buckets";
  @SerializedName(SERIALIZED_NAME_BUCKETS)
  private QueryAggregateResultBuckets buckets;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private QueryAggregateResultDate date;

  public static final String SERIALIZED_NAME_ANALYSIS = "analysis";
  @SerializedName(SERIALIZED_NAME_ANALYSIS)
  private QueryAggregateResultAnalysis analysis;

  public static final String SERIALIZED_NAME_PERCENTILE = "percentile";
  @SerializedName(SERIALIZED_NAME_PERCENTILE)
  private QueryAggregateResultPercentile percentile;


  public QueryAggregateResult metric(QueryAggregateResultMetric metric) {
    
    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QueryAggregateResultMetric getMetric() {
    return metric;
  }


  public void setMetric(QueryAggregateResultMetric metric) {
    this.metric = metric;
  }


  public QueryAggregateResult count(QueryAggregateResultCount count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QueryAggregateResultCount getCount() {
    return count;
  }


  public void setCount(QueryAggregateResultCount count) {
    this.count = count;
  }


  public QueryAggregateResult buckets(QueryAggregateResultBuckets buckets) {
    
    this.buckets = buckets;
    return this;
  }

   /**
   * Get buckets
   * @return buckets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QueryAggregateResultBuckets getBuckets() {
    return buckets;
  }


  public void setBuckets(QueryAggregateResultBuckets buckets) {
    this.buckets = buckets;
  }


  public QueryAggregateResult date(QueryAggregateResultDate date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QueryAggregateResultDate getDate() {
    return date;
  }


  public void setDate(QueryAggregateResultDate date) {
    this.date = date;
  }


  public QueryAggregateResult analysis(QueryAggregateResultAnalysis analysis) {
    
    this.analysis = analysis;
    return this;
  }

   /**
   * Get analysis
   * @return analysis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QueryAggregateResultAnalysis getAnalysis() {
    return analysis;
  }


  public void setAnalysis(QueryAggregateResultAnalysis analysis) {
    this.analysis = analysis;
  }


  public QueryAggregateResult percentile(QueryAggregateResultPercentile percentile) {
    
    this.percentile = percentile;
    return this;
  }

   /**
   * Get percentile
   * @return percentile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QueryAggregateResultPercentile getPercentile() {
    return percentile;
  }


  public void setPercentile(QueryAggregateResultPercentile percentile) {
    this.percentile = percentile;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryAggregateResult queryAggregateResult = (QueryAggregateResult) o;
    return Objects.equals(this.metric, queryAggregateResult.metric) &&
        Objects.equals(this.count, queryAggregateResult.count) &&
        Objects.equals(this.buckets, queryAggregateResult.buckets) &&
        Objects.equals(this.date, queryAggregateResult.date) &&
        Objects.equals(this.analysis, queryAggregateResult.analysis) &&
        Objects.equals(this.percentile, queryAggregateResult.percentile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, count, buckets, date, analysis, percentile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryAggregateResult {\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    buckets: ").append(toIndentedString(buckets)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    analysis: ").append(toIndentedString(analysis)).append("\n");
    sb.append("    percentile: ").append(toIndentedString(percentile)).append("\n");
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

