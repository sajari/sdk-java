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
 * The &#x60;Status&#x60; type defines a logical error model that is suitable for different programming environments, including REST APIs and RPC APIs. It is used by [gRPC](https://github.com/grpc). Each &#x60;Status&#x60; message contains three pieces of data: error code, error message, and error details.  You can find out more about this error model and how to work with it in the [API Design Guide](https://cloud.google.com/apis/design/errors).
 */
@ApiModel(description = "The `Status` type defines a logical error model that is suitable for different programming environments, including REST APIs and RPC APIs. It is used by [gRPC](https://github.com/grpc). Each `Status` message contains three pieces of data: error code, error message, and error details.  You can find out more about this error model and how to work with it in the [API Design Guide](https://cloud.google.com/apis/design/errors).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Status {
    public static final String SERIALIZED_NAME_CODE = "code";
    @SerializedName(SERIALIZED_NAME_CODE)
    private Integer code;

    public static final String SERIALIZED_NAME_DETAILS = "details";
    @SerializedName(SERIALIZED_NAME_DETAILS)
    private java.util.List<ProtobufAny> details = null;

    public static final String SERIALIZED_NAME_MESSAGE = "message";
    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private String message;


    public Status code(Integer code) {

        this.code = code;
        return this;
    }

    /**
     * The status code, which should be an enum value of [google.rpc.Code][google.rpc.Code].
     *
     * @return code
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The status code, which should be an enum value of [google.rpc.Code][google.rpc.Code].")

    public Integer getCode() {
        return code;
    }


    public void setCode(Integer code) {
        this.code = code;
    }


    public Status details(java.util.List<ProtobufAny> details) {

        this.details = details;
        return this;
    }

    public Status addDetailsItem(ProtobufAny detailsItem) {
        if (this.details == null) {
            this.details = new java.util.ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    /**
     * A list of messages that carry the error details.  There is a common set of message types for APIs to use.
     *
     * @return details
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A list of messages that carry the error details.  There is a common set of message types for APIs to use.")

    public java.util.List<ProtobufAny> getDetails() {
        return details;
    }


    public void setDetails(java.util.List<ProtobufAny> details) {
        this.details = details;
    }


    public Status message(String message) {

        this.message = message;
        return this;
    }

    /**
     * A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the [google.rpc.Status.details][google.rpc.Status.details] field, or localized by the client.
     *
     * @return message
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the [google.rpc.Status.details][google.rpc.Status.details] field, or localized by the client.")

    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Status status = (Status) o;
        return Objects.equals(this.code, status.code) &&
                Objects.equals(this.details, status.details) &&
                Objects.equals(this.message, status.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, details, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Status {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

