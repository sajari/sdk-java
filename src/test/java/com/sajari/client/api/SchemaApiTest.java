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


package com.sajari.client.api;

import com.sajari.client.ApiException;
import com.sajari.client.model.BatchCreateSchemaFieldsRequest;
import com.sajari.client.model.BatchCreateSchemaFieldsResponse;
import com.sajari.client.model.ListSchemaFieldsResponse;
import com.sajari.client.model.SchemaField;
import org.junit.Ignore;
import org.junit.Test;


/**
 * API tests for SchemaApi
 */
@Ignore
public class SchemaApiTest {

    private final SchemaApi api = new SchemaApi();


    /**
     * Batch create schema fields
     * <p>
     * The batch version of the [CreateSchemaField](/docs/api-reference#operation/CreateSchemaField) call.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void batchCreateSchemaFieldsTest() throws ApiException {
        String collectionId = null;
        BatchCreateSchemaFieldsRequest batchCreateSchemaFieldsRequest = null;
        BatchCreateSchemaFieldsResponse response = api.batchCreateSchemaFields(collectionId, batchCreateSchemaFieldsRequest);

        // TODO: test validations
    }

    /**
     * Create schema field
     * <p>
     * Create a new field in your collection&#39;s schema.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSchemaFieldTest() throws ApiException {
        String collectionId = null;
        SchemaField schemaField = null;
        SchemaField response = api.createSchemaField(collectionId, schemaField);

        // TODO: test validations
    }

    /**
     * List schema fields
     * <p>
     * Retrieve a list of schema fields in the collection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSchemaFieldsTest() throws ApiException {
        String collectionId = null;
        Integer pageSize = null;
        String pageToken = null;
        ListSchemaFieldsResponse response = api.listSchemaFields(collectionId, pageSize, pageToken);

        // TODO: test validations
    }

}
