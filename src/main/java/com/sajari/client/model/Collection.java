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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Collection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Collection {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AUTHORIZED_QUERY_DOMAINS = "authorized_query_domains";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED_QUERY_DOMAINS)
  private java.util.List<String> authorizedQueryDomains = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private OffsetDateTime createTime;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public Collection() { 
  }

  
  public Collection(
     String accountId, 
     OffsetDateTime createTime, 
     String id
  ) {
    this();
    this.accountId = accountId;
    this.createTime = createTime;
    this.id = id;
  }

   /**
   * Output only. The ID of the account that owns this collection.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Output only. The ID of the account that owns this collection.")

  public String getAccountId() {
    return accountId;
  }




  public Collection authorizedQueryDomains(java.util.List<String> authorizedQueryDomains) {
    
    this.authorizedQueryDomains = authorizedQueryDomains;
    return this;
  }

  public Collection addAuthorizedQueryDomainsItem(String authorizedQueryDomainsItem) {
    if (this.authorizedQueryDomains == null) {
      this.authorizedQueryDomains = new java.util.ArrayList<>();
    }
    this.authorizedQueryDomains.add(authorizedQueryDomainsItem);
    return this;
  }

   /**
   * The list of authorized query domains for the collection.  Client-side / browser requests to the [QueryCollection](/api#operation/QueryCollection) call can be made by any authorized query domain or any of its subdomains. This allows your interface to make search requests without having to provide an API key in the client-side request.
   * @return authorizedQueryDomains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of authorized query domains for the collection.  Client-side / browser requests to the [QueryCollection](/api#operation/QueryCollection) call can be made by any authorized query domain or any of its subdomains. This allows your interface to make search requests without having to provide an API key in the client-side request.")

  public java.util.List<String> getAuthorizedQueryDomains() {
    return authorizedQueryDomains;
  }


  public void setAuthorizedQueryDomains(java.util.List<String> authorizedQueryDomains) {
    this.authorizedQueryDomains = authorizedQueryDomains;
  }


   /**
   * Output only. Time the collection was created.
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Output only. Time the collection was created.")

  public OffsetDateTime getCreateTime() {
    return createTime;
  }




  public Collection displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The collection&#39;s display name. You can change this at any time.
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The collection's display name. You can change this at any time.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


   /**
   * Output only. The collection&#39;s ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Output only. The collection's ID.")

  public String getId() {
    return id;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Collection collection = (Collection) o;
    return Objects.equals(this.accountId, collection.accountId) &&
        Objects.equals(this.authorizedQueryDomains, collection.authorizedQueryDomains) &&
        Objects.equals(this.createTime, collection.createTime) &&
        Objects.equals(this.displayName, collection.displayName) &&
        Objects.equals(this.id, collection.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, authorizedQueryDomains, createTime, displayName, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Collection {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    authorizedQueryDomains: ").append(toIndentedString(authorizedQueryDomains)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

