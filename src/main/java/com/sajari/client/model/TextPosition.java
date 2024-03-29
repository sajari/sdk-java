/*
 * Search.io API
 * Search.io offers a search and discovery service with Neuralsearch®, the world's first instant AI search technology. Businesses of all sizes use Search.io to build site search and discovery solutions that maximize e-commerce revenue, optimize on-site customer experience, and scale their online presence.
 *
 * The version of the OpenAPI document: v4
 * Contact: support@search.io
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
 * TextPosition describes the position of text in a box.   - TEXT_POSITION_UNSPECIFIED: No position specified.  - TEXT_POSITION_CENTER: The text is positioned in the horizontal and vertical center.  - TEXT_POSITION_TOP_LEFT: The text is positioned in the top left corner.  - TEXT_POSITION_TOP_RIGHT: The text is positioned in the top right corner.  - TEXT_POSITION_BOTTOM_LEFT: The text is positioned in the bottom left corner.  - TEXT_POSITION_BOTTOM_RIGHT: The text is positioned in the bottom right corner.
 */
@JsonAdapter(TextPosition.Adapter.class)
public enum TextPosition {
  
  UNSPECIFIED("TEXT_POSITION_UNSPECIFIED"),
  
  CENTER("TEXT_POSITION_CENTER"),
  
  TOP_LEFT("TEXT_POSITION_TOP_LEFT"),
  
  TOP_RIGHT("TEXT_POSITION_TOP_RIGHT"),
  
  BOTTOM_LEFT("TEXT_POSITION_BOTTOM_LEFT"),
  
  BOTTOM_RIGHT("TEXT_POSITION_BOTTOM_RIGHT");

  private String value;

  TextPosition(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TextPosition fromValue(String value) {
    for (TextPosition b : TextPosition.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TextPosition> {
    @Override
    public void write(final JsonWriter jsonWriter, final TextPosition enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TextPosition read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TextPosition.fromValue(value);
    }
  }
}

