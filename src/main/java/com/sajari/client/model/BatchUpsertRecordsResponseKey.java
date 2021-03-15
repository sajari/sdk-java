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
import com.sajari.client.model.RecordKey;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BatchUpsertRecordsResponseKey
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T11:55:52.592Z[GMT]")
public class BatchUpsertRecordsResponseKey {
  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private RecordKey key;


  public BatchUpsertRecordsResponseKey index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Index of the record in &#x60;records&#x60; that this key corresponds to.
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Index of the record in `records` that this key corresponds to.")

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public BatchUpsertRecordsResponseKey key(RecordKey key) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchUpsertRecordsResponseKey batchUpsertRecordsResponseKey = (BatchUpsertRecordsResponseKey) o;
    return Objects.equals(this.index, batchUpsertRecordsResponseKey.index) &&
        Objects.equals(this.key, batchUpsertRecordsResponseKey.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchUpsertRecordsResponseKey {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

