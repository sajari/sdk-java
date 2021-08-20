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
import com.sajari.client.model.PercentileDataPoint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Percentile contains the data points returned in a percentile aggregate step.
 */
@ApiModel(description = "Percentile contains the data points returned in a percentile aggregate step.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-20T00:31:03.336071Z[Etc/UTC]")
public class QueryAggregateResultPercentile {
  public static final String SERIALIZED_NAME_PERCENTILES = "percentiles";
  @SerializedName(SERIALIZED_NAME_PERCENTILES)
  private java.util.List<PercentileDataPoint> percentiles = null;

  public static final String SERIALIZED_NAME_CDF = "cdf";
  @SerializedName(SERIALIZED_NAME_CDF)
  private java.util.List<PercentileDataPoint> cdf = null;


  public QueryAggregateResultPercentile percentiles(java.util.List<PercentileDataPoint> percentiles) {
    
    this.percentiles = percentiles;
    return this;
  }

  public QueryAggregateResultPercentile addPercentilesItem(PercentileDataPoint percentilesItem) {
    if (this.percentiles == null) {
      this.percentiles = new java.util.ArrayList<>();
    }
    this.percentiles.add(percentilesItem);
    return this;
  }

   /**
   * The percentile data points.
   * @return percentiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The percentile data points.")

  public java.util.List<PercentileDataPoint> getPercentiles() {
    return percentiles;
  }


  public void setPercentiles(java.util.List<PercentileDataPoint> percentiles) {
    this.percentiles = percentiles;
  }


  public QueryAggregateResultPercentile cdf(java.util.List<PercentileDataPoint> cdf) {
    
    this.cdf = cdf;
    return this;
  }

  public QueryAggregateResultPercentile addCdfItem(PercentileDataPoint cdfItem) {
    if (this.cdf == null) {
      this.cdf = new java.util.ArrayList<>();
    }
    this.cdf.add(cdfItem);
    return this;
  }

   /**
   * The cumulative distribution function (CDF) data points.
   * @return cdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cumulative distribution function (CDF) data points.")

  public java.util.List<PercentileDataPoint> getCdf() {
    return cdf;
  }


  public void setCdf(java.util.List<PercentileDataPoint> cdf) {
    this.cdf = cdf;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryAggregateResultPercentile queryAggregateResultPercentile = (QueryAggregateResultPercentile) o;
    return Objects.equals(this.percentiles, queryAggregateResultPercentile.percentiles) &&
        Objects.equals(this.cdf, queryAggregateResultPercentile.cdf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentiles, cdf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryAggregateResultPercentile {\n");
    sb.append("    percentiles: ").append(toIndentedString(percentiles)).append("\n");
    sb.append("    cdf: ").append(toIndentedString(cdf)).append("\n");
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

