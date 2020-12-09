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
import com.sajari.client.model.SchemaFieldMode;
import com.sajari.client.model.SchemaFieldType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SchemaField defines the properties of a field in the schema.
 */
@ApiModel(description = "SchemaField defines the properties of a field in the schema.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-09T17:00:28.474223+11:00[Australia/Sydney]")
public class SchemaField {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private SchemaFieldType type = SchemaFieldType.TYPE_UNSPECIFIED;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private SchemaFieldMode mode = SchemaFieldMode.MODE_UNSPECIFIED;

  public static final String SERIALIZED_NAME_ARRAY = "array";
  @SerializedName(SERIALIZED_NAME_ARRAY)
  private Boolean array;

  public static final String SERIALIZED_NAME_ARRAY_LENGTH = "array_length";
  @SerializedName(SERIALIZED_NAME_ARRAY_LENGTH)
  private Integer arrayLength;


  public SchemaField name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the field.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the field.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SchemaField description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the field.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the field.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SchemaField type(SchemaFieldType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public SchemaFieldType getType() {
    return type;
  }


  public void setType(SchemaFieldType type) {
    this.type = type;
  }


  public SchemaField mode(SchemaFieldMode mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @ApiModelProperty(required = true, value = "")

  public SchemaFieldMode getMode() {
    return mode;
  }


  public void setMode(SchemaFieldMode mode) {
    this.mode = mode;
  }


  public SchemaField array(Boolean array) {
    
    this.array = array;
    return this;
  }

   /**
   * Array indicates if the field is an array of values.  For example, if &#x60;type&#x60; is string and &#x60;array&#x60; is &#x60;true&#x60;, then the field is an array of strings.
   * @return array
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array indicates if the field is an array of values.  For example, if `type` is string and `array` is `true`, then the field is an array of strings.")

  public Boolean getArray() {
    return array;
  }


  public void setArray(Boolean array) {
    this.array = array;
  }


  public SchemaField arrayLength(Integer arrayLength) {
    
    this.arrayLength = arrayLength;
    return this;
  }

   /**
   * The required length of the array, if &#x60;array&#x60; is &#x60;true&#x60;.  This allows you to enforce that an array contains an exact number of items.  For example, to store a 2x2 vector, you could set &#x60;type&#x60; to float, &#x60;array&#x60; to &#x60;true&#x60; and &#x60;array_length&#x60; to &#x60;4&#x60;.
   * @return arrayLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The required length of the array, if `array` is `true`.  This allows you to enforce that an array contains an exact number of items.  For example, to store a 2x2 vector, you could set `type` to float, `array` to `true` and `array_length` to `4`.")

  public Integer getArrayLength() {
    return arrayLength;
  }


  public void setArrayLength(Integer arrayLength) {
    this.arrayLength = arrayLength;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaField schemaField = (SchemaField) o;
    return Objects.equals(this.name, schemaField.name) &&
        Objects.equals(this.description, schemaField.description) &&
        Objects.equals(this.type, schemaField.type) &&
        Objects.equals(this.mode, schemaField.mode) &&
        Objects.equals(this.array, schemaField.array) &&
        Objects.equals(this.arrayLength, schemaField.arrayLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type, mode, array, arrayLength);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaField {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    array: ").append(toIndentedString(array)).append("\n");
    sb.append("    arrayLength: ").append(toIndentedString(arrayLength)).append("\n");
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

