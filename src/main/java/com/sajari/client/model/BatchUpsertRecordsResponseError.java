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
 * BatchUpsertRecordsResponseError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BatchUpsertRecordsResponseError {
    public static final String SERIALIZED_NAME_INDEX = "index";
    @SerializedName(SERIALIZED_NAME_INDEX)
    private Integer index;

    public static final String SERIALIZED_NAME_STATUS = "status";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private Status status;


    public BatchUpsertRecordsResponseError index(Integer index) {

        this.index = index;
        return this;
    }

    /**
     * Index of the record in &#x60;records&#x60; that this error corresponds to.
     *
     * @return index
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Index of the record in `records` that this error corresponds to.")

    public Integer getIndex() {
        return index;
    }


    public void setIndex(Integer index) {
        this.index = index;
    }


    public BatchUpsertRecordsResponseError status(Status status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Status getStatus() {
        return status;
    }


    public void setStatus(Status status) {
        this.status = status;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchUpsertRecordsResponseError batchUpsertRecordsResponseError = (BatchUpsertRecordsResponseError) o;
        return Objects.equals(this.index, batchUpsertRecordsResponseError.index) &&
                Objects.equals(this.status, batchUpsertRecordsResponseError.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpsertRecordsResponseError {\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

