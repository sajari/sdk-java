# Status

The `Status` type defines a logical error model that is suitable for different programming environments, including REST APIs and RPC APIs. It is used
by [gRPC](https://github.com/grpc). Each `Status` message contains three pieces of data: error code, error message, and error details. You can find out more about this error model
and how to work with it in the [API Design Guide](https://cloud.google.com/apis/design/errors).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **Integer** | The status code, which should be an enum value of [google.rpc.Code][google.rpc.Code]. |  [optional]
**message** | **
String** | A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the [google.rpc.Status.details][google.rpc.Status.details] field, or localized by the client. |  [optional]
**details** | [**
java.util.List&lt;ProtobufAny&gt;**](ProtobufAny.md) | A list of messages that carry the error details. There is a common set of message types for APIs to use. |  [optional]



