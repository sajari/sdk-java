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
import com.sajari.client.model.PromotionFilterBoost;
import com.sajari.client.model.PromotionFilterCondition;
import com.sajari.client.model.PromotionPin;
import com.sajari.client.model.PromotionRangeBoost;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Promotion contains a trigger, determining which searches it should be active for, and a list of alterations that should be made to search results when it is active.
 */
@ApiModel(description = "Promotion contains a trigger, determining which searches it should be active for, and a list of alterations that should be made to search results when it is active.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Promotion {
  public static final String SERIALIZED_NAME_COLLECTION_ID = "collection_id";
  @SerializedName(SERIALIZED_NAME_COLLECTION_ID)
  private String collectionId;

  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private String condition;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private OffsetDateTime createTime;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_EXCLUSIONS = "exclusions";
  @SerializedName(SERIALIZED_NAME_EXCLUSIONS)
  private java.util.List<PromotionExclusion> exclusions = null;

  public static final String SERIALIZED_NAME_FILTER_BOOSTS = "filter_boosts";
  @SerializedName(SERIALIZED_NAME_FILTER_BOOSTS)
  private java.util.List<PromotionFilterBoost> filterBoosts = null;

  public static final String SERIALIZED_NAME_FILTER_CONDITIONS = "filter_conditions";
  @SerializedName(SERIALIZED_NAME_FILTER_CONDITIONS)
  private java.util.List<PromotionFilterCondition> filterConditions = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PINS = "pins";
  @SerializedName(SERIALIZED_NAME_PINS)
  private java.util.List<PromotionPin> pins = null;

  public static final String SERIALIZED_NAME_RANGE_BOOSTS = "range_boosts";
  @SerializedName(SERIALIZED_NAME_RANGE_BOOSTS)
  private java.util.List<PromotionRangeBoost> rangeBoosts = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private OffsetDateTime updateTime;

  public Promotion() { 
  }

  
  public Promotion(
     String collectionId, 
     OffsetDateTime createTime, 
     OffsetDateTime updateTime
  ) {
    this();
    this.collectionId = collectionId;
    this.createTime = createTime;
    this.updateTime = updateTime;
  }

   /**
   * Output only. The ID of the collection that owns this promotion.
   * @return collectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Output only. The ID of the collection that owns this promotion.")

  public String getCollectionId() {
    return collectionId;
  }




  public Promotion condition(String condition) {
    
    this.condition = condition;
    return this;
  }

   /**
   * A condition expression applied to a search request that determines which searches the promotion is active for.  For example, to apply the promotion&#39;s pins and boosts whenever a user searches for &#39;shoes&#39; set condition to &#x60;q &#x3D; &#39;shoes&#39;&#x60;.
   * @return condition
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A condition expression applied to a search request that determines which searches the promotion is active for.  For example, to apply the promotion's pins and boosts whenever a user searches for 'shoes' set condition to `q = 'shoes'`.")

  public String getCondition() {
    return condition;
  }


  public void setCondition(String condition) {
    this.condition = condition;
  }


   /**
   * Output only. Time the promotion was created.
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Output only. Time the promotion was created.")

  public OffsetDateTime getCreateTime() {
    return createTime;
  }




  public Promotion disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * If disabled, the promotion is never triggered.
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If disabled, the promotion is never triggered.")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public Promotion displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The promotion&#39;s display name.
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The promotion's display name.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Promotion endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * If specified, the promotion is considered disabled after this time.
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, the promotion is considered disabled after this time.")

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public Promotion exclusions(java.util.List<PromotionExclusion> exclusions) {
    
    this.exclusions = exclusions;
    return this;
  }

  public Promotion addExclusionsItem(PromotionExclusion exclusionsItem) {
    if (this.exclusions == null) {
      this.exclusions = new java.util.ArrayList<>();
    }
    this.exclusions.add(exclusionsItem);
    return this;
  }

   /**
   * The records to exclude from search results, if the promotion is enabled.
   * @return exclusions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The records to exclude from search results, if the promotion is enabled.")

  public java.util.List<PromotionExclusion> getExclusions() {
    return exclusions;
  }


  public void setExclusions(java.util.List<PromotionExclusion> exclusions) {
    this.exclusions = exclusions;
  }


  public Promotion filterBoosts(java.util.List<PromotionFilterBoost> filterBoosts) {
    
    this.filterBoosts = filterBoosts;
    return this;
  }

  public Promotion addFilterBoostsItem(PromotionFilterBoost filterBoostsItem) {
    if (this.filterBoosts == null) {
      this.filterBoosts = new java.util.ArrayList<>();
    }
    this.filterBoosts.add(filterBoostsItem);
    return this;
  }

   /**
   * The filter boosts to apply to searches, if the promotion is enabled.
   * @return filterBoosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The filter boosts to apply to searches, if the promotion is enabled.")

  public java.util.List<PromotionFilterBoost> getFilterBoosts() {
    return filterBoosts;
  }


  public void setFilterBoosts(java.util.List<PromotionFilterBoost> filterBoosts) {
    this.filterBoosts = filterBoosts;
  }


  public Promotion filterConditions(java.util.List<PromotionFilterCondition> filterConditions) {
    
    this.filterConditions = filterConditions;
    return this;
  }

  public Promotion addFilterConditionsItem(PromotionFilterCondition filterConditionsItem) {
    if (this.filterConditions == null) {
      this.filterConditions = new java.util.ArrayList<>();
    }
    this.filterConditions.add(filterConditionsItem);
    return this;
  }

   /**
   * The conditions applied to the filters passed from the user. A query must match at least one of these in order to trigger the promotion.
   * @return filterConditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The conditions applied to the filters passed from the user. A query must match at least one of these in order to trigger the promotion.")

  public java.util.List<PromotionFilterCondition> getFilterConditions() {
    return filterConditions;
  }


  public void setFilterConditions(java.util.List<PromotionFilterCondition> filterConditions) {
    this.filterConditions = filterConditions;
  }


  public Promotion id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The promotion&#39;s ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The promotion's ID.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Promotion pins(java.util.List<PromotionPin> pins) {
    
    this.pins = pins;
    return this;
  }

  public Promotion addPinsItem(PromotionPin pinsItem) {
    if (this.pins == null) {
      this.pins = new java.util.ArrayList<>();
    }
    this.pins.add(pinsItem);
    return this;
  }

   /**
   * The items to fix to specific positions in the search results.
   * @return pins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The items to fix to specific positions in the search results.")

  public java.util.List<PromotionPin> getPins() {
    return pins;
  }


  public void setPins(java.util.List<PromotionPin> pins) {
    this.pins = pins;
  }


  public Promotion rangeBoosts(java.util.List<PromotionRangeBoost> rangeBoosts) {
    
    this.rangeBoosts = rangeBoosts;
    return this;
  }

  public Promotion addRangeBoostsItem(PromotionRangeBoost rangeBoostsItem) {
    if (this.rangeBoosts == null) {
      this.rangeBoosts = new java.util.ArrayList<>();
    }
    this.rangeBoosts.add(rangeBoostsItem);
    return this;
  }

   /**
   * The range boosts to apply to searches, if the promotion is enabled.
   * @return rangeBoosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The range boosts to apply to searches, if the promotion is enabled.")

  public java.util.List<PromotionRangeBoost> getRangeBoosts() {
    return rangeBoosts;
  }


  public void setRangeBoosts(java.util.List<PromotionRangeBoost> rangeBoosts) {
    this.rangeBoosts = rangeBoosts;
  }


  public Promotion startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * If specified, the promotion is considered disabled before this time.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, the promotion is considered disabled before this time.")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


   /**
   * Output only. Time the promotion was last updated.
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Output only. Time the promotion was last updated.")

  public OffsetDateTime getUpdateTime() {
    return updateTime;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Promotion promotion = (Promotion) o;
    return Objects.equals(this.collectionId, promotion.collectionId) &&
        Objects.equals(this.condition, promotion.condition) &&
        Objects.equals(this.createTime, promotion.createTime) &&
        Objects.equals(this.disabled, promotion.disabled) &&
        Objects.equals(this.displayName, promotion.displayName) &&
        Objects.equals(this.endTime, promotion.endTime) &&
        Objects.equals(this.exclusions, promotion.exclusions) &&
        Objects.equals(this.filterBoosts, promotion.filterBoosts) &&
        Objects.equals(this.filterConditions, promotion.filterConditions) &&
        Objects.equals(this.id, promotion.id) &&
        Objects.equals(this.pins, promotion.pins) &&
        Objects.equals(this.rangeBoosts, promotion.rangeBoosts) &&
        Objects.equals(this.startTime, promotion.startTime) &&
        Objects.equals(this.updateTime, promotion.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectionId, condition, createTime, disabled, displayName, endTime, exclusions, filterBoosts, filterConditions, id, pins, rangeBoosts, startTime, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Promotion {\n");
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    exclusions: ").append(toIndentedString(exclusions)).append("\n");
    sb.append("    filterBoosts: ").append(toIndentedString(filterBoosts)).append("\n");
    sb.append("    filterConditions: ").append(toIndentedString(filterConditions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
    sb.append("    rangeBoosts: ").append(toIndentedString(rangeBoosts)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

