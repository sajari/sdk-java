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
 * PipelineStepParamBinding
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-27T15:56:05.707098+11:00[Australia/Sydney]")
public class PipelineStepParamBinding {
  public static final String SERIALIZED_NAME_BIND = "bind";
  @SerializedName(SERIALIZED_NAME_BIND)
  private String bind;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "default_value";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private String defaultValue;

  public static final String SERIALIZED_NAME_CONSTANT = "constant";
  @SerializedName(SERIALIZED_NAME_CONSTANT)
  private String constant;


  public PipelineStepParamBinding bind(String bind) {
    
    this.bind = bind;
    return this;
  }

   /**
   * Bind the step parameter to a pipeline variable.
   * @return bind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bind the step parameter to a pipeline variable.")

  public String getBind() {
    return bind;
  }


  public void setBind(String bind) {
    this.bind = bind;
  }


  public PipelineStepParamBinding description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Set the description of the step parameter.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set the description of the step parameter.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PipelineStepParamBinding defaultValue(String defaultValue) {
    
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Set a default value for the step parameter.  This allows you to set a default value for the step parameter when it is not bound to a pipeline variable.
   * @return defaultValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set a default value for the step parameter.  This allows you to set a default value for the step parameter when it is not bound to a pipeline variable.")

  public String getDefaultValue() {
    return defaultValue;
  }


  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }


  public PipelineStepParamBinding constant(String constant) {
    
    this.constant = constant;
    return this;
  }

   /**
   * Bind the step parameter to a constant value.
   * @return constant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bind the step parameter to a constant value.")

  public String getConstant() {
    return constant;
  }


  public void setConstant(String constant) {
    this.constant = constant;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineStepParamBinding pipelineStepParamBinding = (PipelineStepParamBinding) o;
    return Objects.equals(this.bind, pipelineStepParamBinding.bind) &&
        Objects.equals(this.description, pipelineStepParamBinding.description) &&
        Objects.equals(this.defaultValue, pipelineStepParamBinding.defaultValue) &&
        Objects.equals(this.constant, pipelineStepParamBinding.constant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bind, description, defaultValue, constant);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineStepParamBinding {\n");
    sb.append("    bind: ").append(toIndentedString(bind)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    constant: ").append(toIndentedString(constant)).append("\n");
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

