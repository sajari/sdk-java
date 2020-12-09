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
 * GetDefaultPipelineResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-09T17:00:28.474223+11:00[Australia/Sydney]")
public class GetDefaultPipelineResponse {
  public static final String SERIALIZED_NAME_PIPELINE = "pipeline";
  @SerializedName(SERIALIZED_NAME_PIPELINE)
  private String pipeline;


  public GetDefaultPipelineResponse pipeline(String pipeline) {
    
    this.pipeline = pipeline;
    return this;
  }

   /**
   * The name of the pipeline to use when not otherwise specified.
   * @return pipeline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the pipeline to use when not otherwise specified.")

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
    GetDefaultPipelineResponse getDefaultPipelineResponse = (GetDefaultPipelineResponse) o;
    return Objects.equals(this.pipeline, getDefaultPipelineResponse.pipeline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipeline);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDefaultPipelineResponse {\n");
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

