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
 * Error
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Error {
    public static final String SERIALIZED_NAME_CODE = "code";
    @SerializedName(SERIALIZED_NAME_CODE)
    private Integer code;

    public static final String SERIALIZED_NAME_MESSAGE = "message";
    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private String message;

    public static final String SERIALIZED_NAME_DETAILS = "details";
    @SerializedName(SERIALIZED_NAME_DETAILS)
    private java.util.List<ProtobufAny> details = null;


    public Error code(Integer code) {

        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getCode() {
        return code;
    }


    public void setCode(Integer code) {
        this.code = code;
    }


    public Error message(String message) {

        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    public Error details(java.util.List<ProtobufAny> details) {

        this.details = details;
        return this;
    }

    public Error addDetailsItem(ProtobufAny detailsItem) {
        if (this.details == null) {
            this.details = new java.util.ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    /**
     * Get details
     *
     * @return details
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public java.util.List<ProtobufAny> getDetails() {
        return details;
    }


    public void setDetails(java.util.List<ProtobufAny> details) {
        this.details = details;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Error error = (Error) o;
        return Objects.equals(this.code, error.code) &&
                Objects.equals(this.message, error.message) &&
                Objects.equals(this.details, error.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, details);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Error {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

