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
 * The pipeline to use when upserting the record.  If not provided the default record pipeline is used.
 */
@ApiModel(description = "The pipeline to use when upserting the record.  If not provided the default record pipeline is used.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-19T12:37:05.253753Z[Etc/UTC]")
public class UpsertRecordRequestPipeline {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public UpsertRecordRequestPipeline name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The record pipeline&#39;s name, e.g. &#x60;my-pipeline&#x60;.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The record pipeline's name, e.g. `my-pipeline`.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpsertRecordRequestPipeline version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The record pipeline&#39;s version, e.g. &#x60;42&#x60;.  If not provided the default version is used.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The record pipeline's version, e.g. `42`.  If not provided the default version is used.")

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
    UpsertRecordRequestPipeline upsertRecordRequestPipeline = (UpsertRecordRequestPipeline) o;
    return Objects.equals(this.name, upsertRecordRequestPipeline.name) &&
        Objects.equals(this.version, upsertRecordRequestPipeline.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertRecordRequestPipeline {\n");
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

