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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * QueryAggregateResultAnalysis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-09T17:00:28.474223+11:00[Australia/Sydney]")
public class QueryAggregateResultAnalysis {
  public static final String SERIALIZED_NAME_COVERAGE = "coverage";
  @SerializedName(SERIALIZED_NAME_COVERAGE)
  private Integer coverage;

  public static final String SERIALIZED_NAME_CARDINALITY = "cardinality";
  @SerializedName(SERIALIZED_NAME_CARDINALITY)
  private Integer cardinality;

  public static final String SERIALIZED_NAME_MIN_LENGTH = "min_length";
  @SerializedName(SERIALIZED_NAME_MIN_LENGTH)
  private Integer minLength;

  public static final String SERIALIZED_NAME_MAX_LENGTH = "max_length";
  @SerializedName(SERIALIZED_NAME_MAX_LENGTH)
  private Integer maxLength;

  public static final String SERIALIZED_NAME_AVG_LENGTH = "avg_length";
  @SerializedName(SERIALIZED_NAME_AVG_LENGTH)
  private Float avgLength;


  public QueryAggregateResultAnalysis coverage(Integer coverage) {
    
    this.coverage = coverage;
    return this;
  }

   /**
   * Coverage is the number of records which have a value set.
   * @return coverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Coverage is the number of records which have a value set.")

  public Integer getCoverage() {
    return coverage;
  }


  public void setCoverage(Integer coverage) {
    this.coverage = coverage;
  }


  public QueryAggregateResultAnalysis cardinality(Integer cardinality) {
    
    this.cardinality = cardinality;
    return this;
  }

   /**
   * Cardinality is the number of different values in a field.
   * @return cardinality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cardinality is the number of different values in a field.")

  public Integer getCardinality() {
    return cardinality;
  }


  public void setCardinality(Integer cardinality) {
    this.cardinality = cardinality;
  }


  public QueryAggregateResultAnalysis minLength(Integer minLength) {
    
    this.minLength = minLength;
    return this;
  }

   /**
   * Minimum length of an array field.
   * @return minLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum length of an array field.")

  public Integer getMinLength() {
    return minLength;
  }


  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }


  public QueryAggregateResultAnalysis maxLength(Integer maxLength) {
    
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Maximum number of values in an array field.
   * @return maxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of values in an array field.")

  public Integer getMaxLength() {
    return maxLength;
  }


  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }


  public QueryAggregateResultAnalysis avgLength(Float avgLength) {
    
    this.avgLength = avgLength;
    return this;
  }

   /**
   * Average number of items in an array field.
   * @return avgLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Average number of items in an array field.")

  public Float getAvgLength() {
    return avgLength;
  }


  public void setAvgLength(Float avgLength) {
    this.avgLength = avgLength;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryAggregateResultAnalysis queryAggregateResultAnalysis = (QueryAggregateResultAnalysis) o;
    return Objects.equals(this.coverage, queryAggregateResultAnalysis.coverage) &&
        Objects.equals(this.cardinality, queryAggregateResultAnalysis.cardinality) &&
        Objects.equals(this.minLength, queryAggregateResultAnalysis.minLength) &&
        Objects.equals(this.maxLength, queryAggregateResultAnalysis.maxLength) &&
        Objects.equals(this.avgLength, queryAggregateResultAnalysis.avgLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverage, cardinality, minLength, maxLength, avgLength);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryAggregateResultAnalysis {\n");
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
    sb.append("    cardinality: ").append(toIndentedString(cardinality)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    avgLength: ").append(toIndentedString(avgLength)).append("\n");
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

