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
import com.sajari.client.model.BatchUpsertRecordsResponseError;
import com.sajari.client.model.BatchUpsertRecordsResponseKey;
import com.sajari.client.model.BatchUpsertRecordsResponseVariables;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BatchUpsertRecordsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-27T15:56:05.707098+11:00[Australia/Sydney]")
public class BatchUpsertRecordsResponse {
  public static final String SERIALIZED_NAME_KEYS = "keys";
  @SerializedName(SERIALIZED_NAME_KEYS)
  private java.util.List<BatchUpsertRecordsResponseKey> keys = null;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private java.util.List<BatchUpsertRecordsResponseVariables> variables = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private java.util.List<BatchUpsertRecordsResponseError> errors = null;


  public BatchUpsertRecordsResponse keys(java.util.List<BatchUpsertRecordsResponseKey> keys) {
    
    this.keys = keys;
    return this;
  }

  public BatchUpsertRecordsResponse addKeysItem(BatchUpsertRecordsResponseKey keysItem) {
    if (this.keys == null) {
      this.keys = new java.util.ArrayList<>();
    }
    this.keys.add(keysItem);
    return this;
  }

   /**
   * A list of keys of the records that were inserted.  If a record was inserted, keys contains an entry containing the index of the inserted record from &#x60;records&#x60; and the key. You can use the key if you need to retrieve or delete the record.  If a record was updated, keys contains no such entry for the updated record.
   * @return keys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of keys of the records that were inserted.  If a record was inserted, keys contains an entry containing the index of the inserted record from `records` and the key. You can use the key if you need to retrieve or delete the record.  If a record was updated, keys contains no such entry for the updated record.")

  public java.util.List<BatchUpsertRecordsResponseKey> getKeys() {
    return keys;
  }


  public void setKeys(java.util.List<BatchUpsertRecordsResponseKey> keys) {
    this.keys = keys;
  }


  public BatchUpsertRecordsResponse variables(java.util.List<BatchUpsertRecordsResponseVariables> variables) {
    
    this.variables = variables;
    return this;
  }

  public BatchUpsertRecordsResponse addVariablesItem(BatchUpsertRecordsResponseVariables variablesItem) {
    if (this.variables == null) {
      this.variables = new java.util.ArrayList<>();
    }
    this.variables.add(variablesItem);
    return this;
  }

   /**
   * A list of modified variables returned by the pipeline after it has finished processing each record.
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of modified variables returned by the pipeline after it has finished processing each record.")

  public java.util.List<BatchUpsertRecordsResponseVariables> getVariables() {
    return variables;
  }


  public void setVariables(java.util.List<BatchUpsertRecordsResponseVariables> variables) {
    this.variables = variables;
  }


  public BatchUpsertRecordsResponse errors(java.util.List<BatchUpsertRecordsResponseError> errors) {
    
    this.errors = errors;
    return this;
  }

  public BatchUpsertRecordsResponse addErrorsItem(BatchUpsertRecordsResponseError errorsItem) {
    if (this.errors == null) {
      this.errors = new java.util.ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Errors that occurred.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Errors that occurred.")

  public java.util.List<BatchUpsertRecordsResponseError> getErrors() {
    return errors;
  }


  public void setErrors(java.util.List<BatchUpsertRecordsResponseError> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchUpsertRecordsResponse batchUpsertRecordsResponse = (BatchUpsertRecordsResponse) o;
    return Objects.equals(this.keys, batchUpsertRecordsResponse.keys) &&
        Objects.equals(this.variables, batchUpsertRecordsResponse.variables) &&
        Objects.equals(this.errors, batchUpsertRecordsResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys, variables, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchUpsertRecordsResponse {\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

