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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 *  - VIEW_UNSPECIFIED: The default / unset value. The API defaults to the &#x60;BASIC&#x60; view.  - BASIC: Include basic information including type, name, version and description but not the full step configuration. This is the default value (for both [ListPipelines](/docs/api-reference#operation/ListPipelines) and [GetPipeline](/docs/api-reference#operation/GetPipeline)).  - FULL: Include the information from &#x60;BASIC&#x60;, plus full step configuration.
 */
@JsonAdapter(GetDefaultVersionRequestView.Adapter.class)
public enum GetDefaultVersionRequestView {
  
  VIEW_UNSPECIFIED("VIEW_UNSPECIFIED"),
  
  BASIC("BASIC"),
  
  FULL("FULL");

  private String value;

  GetDefaultVersionRequestView(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GetDefaultVersionRequestView fromValue(String value) {
    for (GetDefaultVersionRequestView b : GetDefaultVersionRequestView.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<GetDefaultVersionRequestView> {
    @Override
    public void write(final JsonWriter jsonWriter, final GetDefaultVersionRequestView enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public GetDefaultVersionRequestView read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return GetDefaultVersionRequestView.fromValue(value);
    }
  }
}

