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
import com.sajari.client.model.PromotionExclusion;
import com.sajari.client.model.PromotionPin;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A promotion that is active for a given search.
 */
@ApiModel(description = "A promotion that is active for a given search.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ActivePromotion {
  public static final String SERIALIZED_NAME_ACTIVE_EXCLUSIONS = "active_exclusions";
  @SerializedName(SERIALIZED_NAME_ACTIVE_EXCLUSIONS)
  private java.util.List<PromotionExclusion> activeExclusions = null;

  public static final String SERIALIZED_NAME_ACTIVE_PINS = "active_pins";
  @SerializedName(SERIALIZED_NAME_ACTIVE_PINS)
  private java.util.List<PromotionPin> activePins = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private String promotionId;

  public ActivePromotion() { 
  }

  public ActivePromotion activeExclusions(java.util.List<PromotionExclusion> activeExclusions) {
    
    this.activeExclusions = activeExclusions;
    return this;
  }

  public ActivePromotion addActiveExclusionsItem(PromotionExclusion activeExclusionsItem) {
    if (this.activeExclusions == null) {
      this.activeExclusions = new java.util.ArrayList<>();
    }
    this.activeExclusions.add(activeExclusionsItem);
    return this;
  }

   /**
   * The records that are excluded from the result set by the active promotion.
   * @return activeExclusions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The records that are excluded from the result set by the active promotion.")

  public java.util.List<PromotionExclusion> getActiveExclusions() {
    return activeExclusions;
  }


  public void setActiveExclusions(java.util.List<PromotionExclusion> activeExclusions) {
    this.activeExclusions = activeExclusions;
  }


  public ActivePromotion activePins(java.util.List<PromotionPin> activePins) {
    
    this.activePins = activePins;
    return this;
  }

  public ActivePromotion addActivePinsItem(PromotionPin activePinsItem) {
    if (this.activePins == null) {
      this.activePins = new java.util.ArrayList<>();
    }
    this.activePins.add(activePinsItem);
    return this;
  }

   /**
   * The pins that belong to the active promotion. Note that the positions in these pins are the positions specified at pin creation time, which is not necessarily the position that a pin ends up in. For example, if a pin is created at position 2, but the query that the pin is active in has zero results, the pinned result actually appears in position 1.
   * @return activePins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pins that belong to the active promotion. Note that the positions in these pins are the positions specified at pin creation time, which is not necessarily the position that a pin ends up in. For example, if a pin is created at position 2, but the query that the pin is active in has zero results, the pinned result actually appears in position 1.")

  public java.util.List<PromotionPin> getActivePins() {
    return activePins;
  }


  public void setActivePins(java.util.List<PromotionPin> activePins) {
    this.activePins = activePins;
  }


  public ActivePromotion promotionId(String promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * The ID of the active promotion.
   * @return promotionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the active promotion.")

  public String getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivePromotion activePromotion = (ActivePromotion) o;
    return Objects.equals(this.activeExclusions, activePromotion.activeExclusions) &&
        Objects.equals(this.activePins, activePromotion.activePins) &&
        Objects.equals(this.promotionId, activePromotion.promotionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeExclusions, activePins, promotionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivePromotion {\n");
    sb.append("    activeExclusions: ").append(toIndentedString(activeExclusions)).append("\n");
    sb.append("    activePins: ").append(toIndentedString(activePins)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
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

