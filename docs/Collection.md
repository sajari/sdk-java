

# Collection


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | Output only. The ID of the account that owns this collection. |  [optional] [readonly]
**authorizedQueryDomains** | **java.util.List&lt;String&gt;** | The list of authorized query domains for the collection.  Client-side / browser requests to the [QueryCollection](/docs/api#operation/QueryCollection) call can be made by any authorized query domain or any of its subdomains. This allows your interface to make search requests without having to provide an API key in the client-side request. |  [optional]
**createTime** | **OffsetDateTime** | Output only. Time the collection was created. |  [optional] [readonly]
**displayName** | **String** | The collection&#39;s display name. You can change this at any time. | 
**id** | **String** | Output only. The collection&#39;s ID. |  [optional] [readonly]



