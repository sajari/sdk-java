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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sajari.client.model.TextPosition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A synthetic search result that renders as an image. It takes a user to a pre-determined location when clicked.
 */
@ApiModel(description = "A synthetic search result that renders as an image. It takes a user to a pre-determined location when clicked.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Banner {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_TARGET_URL = "target_url";
  @SerializedName(SERIALIZED_NAME_TARGET_URL)
  private String targetUrl;

  public static final String SERIALIZED_NAME_TEXT_COLOR = "text_color";
  @SerializedName(SERIALIZED_NAME_TEXT_COLOR)
  private String textColor;

  public static final String SERIALIZED_NAME_TEXT_POSITION = "text_position";
  @SerializedName(SERIALIZED_NAME_TEXT_POSITION)
  private TextPosition textPosition = TextPosition.UNSPECIFIED;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public Banner() { 
  }

  public Banner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the banner, displayed in sub-head font.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the banner, displayed in sub-head font.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Banner height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * The height the banner occupies in grid cells.
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The height the banner occupies in grid cells.")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public Banner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the banner, used to identify clicked banners.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the banner, used to identify clicked banners.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Banner imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * The URL of the image used for the banner.
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the image used for the banner.")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public Banner position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * The 1-based index indicating where the banner appears in search results.
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The 1-based index indicating where the banner appears in search results.")

  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  public Banner targetUrl(String targetUrl) {
    
    this.targetUrl = targetUrl;
    return this;
  }

   /**
   * The URL to redirect the user to when the banner is clicked.
   * @return targetUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL to redirect the user to when the banner is clicked.")

  public String getTargetUrl() {
    return targetUrl;
  }


  public void setTargetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
  }


  public Banner textColor(String textColor) {
    
    this.textColor = textColor;
    return this;
  }

   /**
   * The color of the text as a hex code with a # prefix, e.g. #FFCC00 or #FC0.
   * @return textColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The color of the text as a hex code with a # prefix, e.g. #FFCC00 or #FC0.")

  public String getTextColor() {
    return textColor;
  }


  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }


  public Banner textPosition(TextPosition textPosition) {
    
    this.textPosition = textPosition;
    return this;
  }

   /**
   * Get textPosition
   * @return textPosition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TextPosition getTextPosition() {
    return textPosition;
  }


  public void setTextPosition(TextPosition textPosition) {
    this.textPosition = textPosition;
  }


  public Banner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of the banner, displayed in header font.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the banner, displayed in header font.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Banner width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * The width the banner occupies in grid cells.
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The width the banner occupies in grid cells.")

  public Integer getWidth() {
    return width;
  }


  public void setWidth(Integer width) {
    this.width = width;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Banner banner = (Banner) o;
    return Objects.equals(this.description, banner.description) &&
        Objects.equals(this.height, banner.height) &&
        Objects.equals(this.id, banner.id) &&
        Objects.equals(this.imageUrl, banner.imageUrl) &&
        Objects.equals(this.position, banner.position) &&
        Objects.equals(this.targetUrl, banner.targetUrl) &&
        Objects.equals(this.textColor, banner.textColor) &&
        Objects.equals(this.textPosition, banner.textPosition) &&
        Objects.equals(this.title, banner.title) &&
        Objects.equals(this.width, banner.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, height, id, imageUrl, position, targetUrl, textColor, textPosition, title, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Banner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    textPosition: ").append(toIndentedString(textPosition)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
