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
 * BatchCreateSchemaFieldsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BatchCreateSchemaFieldsResponse {
    public static final String SERIALIZED_NAME_FIELDS = "fields";
    @SerializedName(SERIALIZED_NAME_FIELDS)
    private java.util.List<SchemaField> fields = null;

    public static final String SERIALIZED_NAME_ERRORS = "errors";
    @SerializedName(SERIALIZED_NAME_ERRORS)
    private java.util.List<BatchCreateSchemaFieldsResponseError> errors = null;


    public BatchCreateSchemaFieldsResponse fields(java.util.List<SchemaField> fields) {

        this.fields = fields;
        return this;
    }

    public BatchCreateSchemaFieldsResponse addFieldsItem(SchemaField fieldsItem) {
        if (this.fields == null) {
            this.fields = new java.util.ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    /**
     * Schema fields created.
     *
     * @return fields
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Schema fields created.")

    public java.util.List<SchemaField> getFields() {
        return fields;
    }


    public void setFields(java.util.List<SchemaField> fields) {
        this.fields = fields;
    }


    public BatchCreateSchemaFieldsResponse errors(java.util.List<BatchCreateSchemaFieldsResponseError> errors) {

        this.errors = errors;
        return this;
    }

    public BatchCreateSchemaFieldsResponse addErrorsItem(BatchCreateSchemaFieldsResponseError errorsItem) {
        if (this.errors == null) {
            this.errors = new java.util.ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * Errors that occurred.
     *
     * @return errors
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Errors that occurred.")

    public java.util.List<BatchCreateSchemaFieldsResponseError> getErrors() {
        return errors;
    }


    public void setErrors(java.util.List<BatchCreateSchemaFieldsResponseError> errors) {
        this.errors = errors;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchCreateSchemaFieldsResponse batchCreateSchemaFieldsResponse = (BatchCreateSchemaFieldsResponse) o;
        return Objects.equals(this.fields, batchCreateSchemaFieldsResponse.fields) &&
                Objects.equals(this.errors, batchCreateSchemaFieldsResponse.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateSchemaFieldsResponse {\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

