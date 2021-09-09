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
 * PercentileDataPoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PercentileDataPoint {
    public static final String SERIALIZED_NAME_POINT = "point";
    @SerializedName(SERIALIZED_NAME_POINT)
    private Double point;

    public static final String SERIALIZED_NAME_VALUE = "value";
    @SerializedName(SERIALIZED_NAME_VALUE)
    private Double value;


    public PercentileDataPoint point(Double point) {

        this.point = point;
        return this;
    }

    /**
     * The input point.
     *
     * @return point
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The input point.")

    public Double getPoint() {
        return point;
    }


    public void setPoint(Double point) {
        this.point = point;
    }


    public PercentileDataPoint value(Double value) {

        this.value = value;
        return this;
    }

    /**
     * The corresponding value for the given point.
     *
     * @return value
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The corresponding value for the given point.")

    public Double getValue() {
        return value;
    }


    public void setValue(Double value) {
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PercentileDataPoint percentileDataPoint = (PercentileDataPoint) o;
        return Objects.equals(this.point, percentileDataPoint.point) &&
                Objects.equals(this.value, percentileDataPoint.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PercentileDataPoint {\n");
        sb.append("    point: ").append(toIndentedString(point)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

