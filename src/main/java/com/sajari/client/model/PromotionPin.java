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
import com.sajari.client.model.PromotionPinMode;
import com.sajari.client.model.RecordKey;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PromotionPin
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PromotionPin {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private RecordKey key;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private PromotionPinMode mode = PromotionPinMode.PIN;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public PromotionPin() { 
  }

  public PromotionPin key(RecordKey key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecordKey getKey() {
    return key;
  }


  public void setKey(RecordKey key) {
    this.key = key;
  }


  public PromotionPin mode(PromotionPinMode mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PromotionPinMode getMode() {
    return mode;
  }


  public void setMode(PromotionPinMode mode) {
    this.mode = mode;
  }


  public PromotionPin position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * Position the record should occupy in search results. The top position is position 1.  Doesn&#39;t need to be contiguous with other pins, i.e. there can be gaps in the pinned set that are filled with organic results.  In the case where there are insufficient search results pinned items are collapsed.
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Position the record should occupy in search results. The top position is position 1.  Doesn't need to be contiguous with other pins, i.e. there can be gaps in the pinned set that are filled with organic results.  In the case where there are insufficient search results pinned items are collapsed.")

  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionPin promotionPin = (PromotionPin) o;
    return Objects.equals(this.key, promotionPin.key) &&
        Objects.equals(this.mode, promotionPin.mode) &&
        Objects.equals(this.position, promotionPin.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, mode, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionPin {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

