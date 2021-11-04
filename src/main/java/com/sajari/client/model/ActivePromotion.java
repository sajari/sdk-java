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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * ActivePromotion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ActivePromotion {
    public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
    @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
    private String promotionId;

    public static final String SERIALIZED_NAME_ACTIVE_PINS = "active_pins";
    @SerializedName(SERIALIZED_NAME_ACTIVE_PINS)
    private java.util.List<PromotionPin> activePins = null;

    public static final String SERIALIZED_NAME_ACTIVE_EXCLUSIONS = "active_exclusions";
    @SerializedName(SERIALIZED_NAME_ACTIVE_EXCLUSIONS)
    private java.util.List<PromotionExclusion> activeExclusions = null;


    public ActivePromotion promotionId(String promotionId) {

        this.promotionId = promotionId;
        return this;
    }

    /**
     * Get promotionId
     *
     * @return promotionId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getPromotionId() {
        return promotionId;
    }


    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
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
     * Get activePins
     *
     * @return activePins
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public java.util.List<PromotionPin> getActivePins() {
        return activePins;
    }


    public void setActivePins(java.util.List<PromotionPin> activePins) {
        this.activePins = activePins;
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
     * Get activeExclusions
     *
     * @return activeExclusions
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public java.util.List<PromotionExclusion> getActiveExclusions() {
        return activeExclusions;
    }


    public void setActiveExclusions(java.util.List<PromotionExclusion> activeExclusions) {
        this.activeExclusions = activeExclusions;
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
        return Objects.equals(this.promotionId, activePromotion.promotionId) &&
                Objects.equals(this.activePins, activePromotion.activePins) &&
                Objects.equals(this.activeExclusions, activePromotion.activeExclusions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promotionId, activePins, activeExclusions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActivePromotion {\n");
        sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
        sb.append("    activePins: ").append(toIndentedString(activePins)).append("\n");
        sb.append("    activeExclusions: ").append(toIndentedString(activeExclusions)).append("\n");
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

