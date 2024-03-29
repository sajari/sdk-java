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
 * PosNeg is a pair of tokens which are used to mark a record as a good/bad result for a request.
 */
@ApiModel(description = "PosNeg is a pair of tokens which are used to mark a record as a good/bad result for a request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QueryResultTokenPosNeg {
  public static final String SERIALIZED_NAME_NEG = "neg";
  @SerializedName(SERIALIZED_NAME_NEG)
  private String neg;

  public static final String SERIALIZED_NAME_POS = "pos";
  @SerializedName(SERIALIZED_NAME_POS)
  private String pos;

  public QueryResultTokenPosNeg() { 
  }

  public QueryResultTokenPosNeg neg(String neg) {
    
    this.neg = neg;
    return this;
  }

   /**
   * Get neg
   * @return neg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNeg() {
    return neg;
  }


  public void setNeg(String neg) {
    this.neg = neg;
  }


  public QueryResultTokenPosNeg pos(String pos) {
    
    this.pos = pos;
    return this;
  }

   /**
   * Get pos
   * @return pos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPos() {
    return pos;
  }


  public void setPos(String pos) {
    this.pos = pos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryResultTokenPosNeg queryResultTokenPosNeg = (QueryResultTokenPosNeg) o;
    return Objects.equals(this.neg, queryResultTokenPosNeg.neg) &&
        Objects.equals(this.pos, queryResultTokenPosNeg.pos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(neg, pos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResultTokenPosNeg {\n");
    sb.append("    neg: ").append(toIndentedString(neg)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
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

