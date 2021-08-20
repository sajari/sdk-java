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
 * GeneratePipelinesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-20T00:31:03.336071Z[Etc/UTC]")
public class GeneratePipelinesRequest {
  public static final String SERIALIZED_NAME_SEARCHABLE_FIELDS = "searchable_fields";
  @SerializedName(SERIALIZED_NAME_SEARCHABLE_FIELDS)
  private java.util.List<String> searchableFields = new java.util.ArrayList<>();

  public static final String SERIALIZED_NAME_QUERY_TRAINING_FIELDS = "query_training_fields";
  @SerializedName(SERIALIZED_NAME_QUERY_TRAINING_FIELDS)
  private java.util.List<String> queryTrainingFields = null;


  public GeneratePipelinesRequest searchableFields(java.util.List<String> searchableFields) {
    
    this.searchableFields = searchableFields;
    return this;
  }

  public GeneratePipelinesRequest addSearchableFieldsItem(String searchableFieldsItem) {
    this.searchableFields.add(searchableFieldsItem);
    return this;
  }

   /**
   * Prioritized list of fields to search.
   * @return searchableFields
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Prioritized list of fields to search.")

  public java.util.List<String> getSearchableFields() {
    return searchableFields;
  }


  public void setSearchableFields(java.util.List<String> searchableFields) {
    this.searchableFields = searchableFields;
  }


  public GeneratePipelinesRequest queryTrainingFields(java.util.List<String> queryTrainingFields) {
    
    this.queryTrainingFields = queryTrainingFields;
    return this;
  }

  public GeneratePipelinesRequest addQueryTrainingFieldsItem(String queryTrainingFieldsItem) {
    if (this.queryTrainingFields == null) {
      this.queryTrainingFields = new java.util.ArrayList<>();
    }
    this.queryTrainingFields.add(queryTrainingFieldsItem);
    return this;
  }

   /**
   * List of fields to train query suggestions from.
   * @return queryTrainingFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of fields to train query suggestions from.")

  public java.util.List<String> getQueryTrainingFields() {
    return queryTrainingFields;
  }


  public void setQueryTrainingFields(java.util.List<String> queryTrainingFields) {
    this.queryTrainingFields = queryTrainingFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneratePipelinesRequest generatePipelinesRequest = (GeneratePipelinesRequest) o;
    return Objects.equals(this.searchableFields, generatePipelinesRequest.searchableFields) &&
        Objects.equals(this.queryTrainingFields, generatePipelinesRequest.queryTrainingFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchableFields, queryTrainingFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneratePipelinesRequest {\n");
    sb.append("    searchableFields: ").append(toIndentedString(searchableFields)).append("\n");
    sb.append("    queryTrainingFields: ").append(toIndentedString(queryTrainingFields)).append("\n");
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

