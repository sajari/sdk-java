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
 * The resolved query pipeline that was used to run the query.
 */
@ApiModel(description = "The resolved query pipeline that was used to run the query.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-20T00:31:03.336071Z[Etc/UTC]")
public class QueryCollectionResponsePipeline {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public QueryCollectionResponsePipeline name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The pipeline&#39;s name, e.g. &#x60;my-pipeline&#x60;.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pipeline's name, e.g. `my-pipeline`.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public QueryCollectionResponsePipeline version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The pipeline&#39;s version, e.g. &#x60;42&#x60;.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pipeline's version, e.g. `42`.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryCollectionResponsePipeline queryCollectionResponsePipeline = (QueryCollectionResponsePipeline) o;
    return Objects.equals(this.name, queryCollectionResponsePipeline.name) &&
        Objects.equals(this.version, queryCollectionResponsePipeline.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryCollectionResponsePipeline {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

