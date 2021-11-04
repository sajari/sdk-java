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

import java.util.Objects;

/**
 * RedirectResult indicates that a redirect has been triggered for a given query.
 */
@ApiModel(description = "RedirectResult indicates that a redirect has been triggered for a given query.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RedirectResult {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_TARGET = "target";
    @SerializedName(SERIALIZED_NAME_TARGET)
    private String target;

    public static final String SERIALIZED_NAME_TOKEN = "token";
    @SerializedName(SERIALIZED_NAME_TOKEN)
    private String token;


    public RedirectResult id(String id) {

        this.id = id;
        return this;
    }

    /**
     * The redirect&#39;s ID.
     *
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The redirect's ID.")

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public RedirectResult target(String target) {

        this.target = target;
        return this;
    }

    /**
     * Target to redirect the user to.
     *
     * @return target
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Target to redirect the user to.")

    public String getTarget() {
        return target;
    }


    public void setTarget(String target) {
        this.target = target;
    }


    public RedirectResult token(String token) {

        this.token = token;
        return this;
    }

    /**
     * A redirect token.  Call SendEvent with this token to indicate that a redirect has been performed.
     *
     * @return token
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A redirect token.  Call SendEvent with this token to indicate that a redirect has been performed.")

    public String getToken() {
        return token;
    }


    public void setToken(String token) {
        this.token = token;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RedirectResult redirectResult = (RedirectResult) o;
        return Objects.equals(this.id, redirectResult.id) &&
                Objects.equals(this.target, redirectResult.target) &&
                Objects.equals(this.token, redirectResult.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, target, token);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedirectResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
