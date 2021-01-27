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
import com.sajari.client.model.UpsertRecordRequestPipeline;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpsertRecordRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-27T15:56:05.707098+11:00[Australia/Sydney]")
public class UpsertRecordRequest {
  public static final String SERIALIZED_NAME_PIPELINE = "pipeline";
  @SerializedName(SERIALIZED_NAME_PIPELINE)
  private UpsertRecordRequestPipeline pipeline;

  public static final String SERIALIZED_NAME_RECORD = "record";
  @SerializedName(SERIALIZED_NAME_RECORD)
  private Object record;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private Object variables;


  public UpsertRecordRequest pipeline(UpsertRecordRequestPipeline pipeline) {
    
    this.pipeline = pipeline;
    return this;
  }

   /**
   * Get pipeline
   * @return pipeline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UpsertRecordRequestPipeline getPipeline() {
    return pipeline;
  }


  public void setPipeline(UpsertRecordRequestPipeline pipeline) {
    this.pipeline = pipeline;
  }


  public UpsertRecordRequest record(Object record) {
    
    this.record = record;
    return this;
  }

   /**
   * An object made up of field-value pairs that contains the record data.
   * @return record
  **/
  @ApiModelProperty(required = true, value = "An object made up of field-value pairs that contains the record data.")

  public Object getRecord() {
    return record;
  }


  public void setRecord(Object record) {
    this.record = record;
  }


  public UpsertRecordRequest variables(Object variables) {
    
    this.variables = variables;
    return this;
  }

   /**
   * The initial values for the variables the pipeline operates on and transforms throughout its steps.
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The initial values for the variables the pipeline operates on and transforms throughout its steps.")

  public Object getVariables() {
    return variables;
  }


  public void setVariables(Object variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertRecordRequest upsertRecordRequest = (UpsertRecordRequest) o;
    return Objects.equals(this.pipeline, upsertRecordRequest.pipeline) &&
        Objects.equals(this.record, upsertRecordRequest.record) &&
        Objects.equals(this.variables, upsertRecordRequest.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipeline, record, variables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertRecordRequest {\n");
    sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

