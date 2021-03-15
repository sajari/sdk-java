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
import com.sajari.client.model.PipelineType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SetDefaultPipelineRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T11:55:52.592Z[GMT]")
public class SetDefaultPipelineRequest {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private PipelineType type = PipelineType.TYPE_UNSPECIFIED;

  public static final String SERIALIZED_NAME_PIPELINE = "pipeline";
  @SerializedName(SERIALIZED_NAME_PIPELINE)
  private String pipeline;


  public SetDefaultPipelineRequest type(PipelineType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public PipelineType getType() {
    return type;
  }


  public void setType(PipelineType type) {
    this.type = type;
  }


  public SetDefaultPipelineRequest pipeline(String pipeline) {
    
    this.pipeline = pipeline;
    return this;
  }

   /**
   * The name of the pipeline to use when not otherwise specified.
   * @return pipeline
  **/
  @ApiModelProperty(required = true, value = "The name of the pipeline to use when not otherwise specified.")

  public String getPipeline() {
    return pipeline;
  }


  public void setPipeline(String pipeline) {
    this.pipeline = pipeline;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDefaultPipelineRequest setDefaultPipelineRequest = (SetDefaultPipelineRequest) o;
    return Objects.equals(this.type, setDefaultPipelineRequest.type) &&
        Objects.equals(this.pipeline, setDefaultPipelineRequest.pipeline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, pipeline);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDefaultPipelineRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
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

