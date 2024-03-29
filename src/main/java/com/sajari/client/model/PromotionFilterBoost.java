/*
 * Search.io API
 * Search.io offers a search and discovery service with Neuralsearch®, the world's first instant AI search technology. Businesses of all sizes use Search.io to build site search and discovery solutions that maximize e-commerce revenue, optimize on-site customer experience, and scale their online presence.
 *
 * The version of the OpenAPI document: v4
 * Contact: support@search.io
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
 * PromotionFilterBoost
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PromotionFilterBoost {
  public static final String SERIALIZED_NAME_BOOST = "boost";
  @SerializedName(SERIALIZED_NAME_BOOST)
  private Float boost;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public PromotionFilterBoost() { 
  }

  public PromotionFilterBoost boost(Float boost) {
    
    this.boost = boost;
    return this;
  }

   /**
   * Number that determines the size of the boost that is applied to matching records.  Must be greater than or equal to 0 and less than or equal to 1.
   * @return boost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number that determines the size of the boost that is applied to matching records.  Must be greater than or equal to 0 and less than or equal to 1.")

  public Float getBoost() {
    return boost;
  }


  public void setBoost(Float boost) {
    this.boost = boost;
  }


  public PromotionFilterBoost filter(String filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Filter expression that applies a relevance boost to records matching this filter.  This is a filter expression much like the query filter expression.
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter expression that applies a relevance boost to records matching this filter.  This is a filter expression much like the query filter expression.")

  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    this.filter = filter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionFilterBoost promotionFilterBoost = (PromotionFilterBoost) o;
    return Objects.equals(this.boost, promotionFilterBoost.boost) &&
        Objects.equals(this.filter, promotionFilterBoost.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boost, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionFilterBoost {\n");
    sb.append("    boost: ").append(toIndentedString(boost)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

