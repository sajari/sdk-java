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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Redirect contains a target that you can redirect users to if their search query matches a certain condition.
 */
@ApiModel(description = "Redirect contains a target that you can redirect users to if their search query matches a certain condition.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Redirect {
    public static final String SERIALIZED_NAME_ID = "id";
    public static final String SERIALIZED_NAME_COLLECTION_ID = "collection_id";
    public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
    public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
    public static final String SERIALIZED_NAME_CONDITION = "condition";
    public static final String SERIALIZED_NAME_TARGET = "target";
    public static final String SERIALIZED_NAME_DISABLED = "disabled";
    @SerializedName(SERIALIZED_NAME_ID)
    private String id;
    @SerializedName(SERIALIZED_NAME_COLLECTION_ID)
    private String collectionId;
    @SerializedName(SERIALIZED_NAME_CREATE_TIME)
    private OffsetDateTime createTime;
    @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
    private OffsetDateTime updateTime;
    @SerializedName(SERIALIZED_NAME_CONDITION)
    private String condition;
    @SerializedName(SERIALIZED_NAME_TARGET)
    private String target;
    @SerializedName(SERIALIZED_NAME_DISABLED)
    private Boolean disabled;


    /**
     * Output only. The redirect&#39;s ID.
     *
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Output only. The redirect's ID.")

    public String getId() {
        return id;
    }


    /**
     * Output only. The ID of the collection that owns this redirect.
     *
     * @return collectionId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Output only. The ID of the collection that owns this redirect.")

    public String getCollectionId() {
        return collectionId;
    }


    /**
     * Output only. Time the redirect was created.
     *
     * @return createTime
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Output only. Time the redirect was created.")

    public OffsetDateTime getCreateTime() {
        return createTime;
    }


    /**
     * Output only. Time the redirect was last updated.
     *
     * @return updateTime
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Output only. Time the redirect was last updated.")

    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }


    public Redirect condition(String condition) {

        this.condition = condition;
        return this;
    }

    /**
     * Condition expression applied to a search request that determines whether a search is redirected.  For example, to redirect if the user&#39;s query is &#x60;apples&#x60;, set condition to &#x60;q &#x3D; &#39;apples&#39;&#x60;.
     *
     * @return condition
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Condition expression applied to a search request that determines whether a search is redirected.  For example, to redirect if the user's query is `apples`, set condition to `q = 'apples'`.")

    public String getCondition() {
        return condition;
    }


    public void setCondition(String condition) {
        this.condition = condition;
    }


    public Redirect target(String target) {

        this.target = target;
        return this;
    }

    /**
     * Target to redirect the user to if their query matches &#x60;condition&#x60;.  For searches performed in a browser, target is usually a URL but it can be any value that your integration can interpret as a redirect.  For example, for URLs that you need to resolve at runtime, target might be a URL template string. For apps, target might be a unique identifier used to send the user to the correct view.
     *
     * @return target
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Target to redirect the user to if their query matches `condition`.  For searches performed in a browser, target is usually a URL but it can be any value that your integration can interpret as a redirect.  For example, for URLs that you need to resolve at runtime, target might be a URL template string. For apps, target might be a unique identifier used to send the user to the correct view.")

    public String getTarget() {
        return target;
    }


    public void setTarget(String target) {
        this.target = target;
    }


    public Redirect disabled(Boolean disabled) {

        this.disabled = disabled;
        return this;
    }

    /**
     * If disabled, the redirect will never be triggered.
     *
     * @return disabled
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "If disabled, the redirect will never be triggered.")

    public Boolean getDisabled() {
        return disabled;
    }


    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Redirect redirect = (Redirect) o;
        return Objects.equals(this.id, redirect.id) &&
                Objects.equals(this.collectionId, redirect.collectionId) &&
                Objects.equals(this.createTime, redirect.createTime) &&
                Objects.equals(this.updateTime, redirect.updateTime) &&
                Objects.equals(this.condition, redirect.condition) &&
                Objects.equals(this.target, redirect.target) &&
                Objects.equals(this.disabled, redirect.disabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, collectionId, createTime, updateTime, condition, target, disabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Redirect {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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
