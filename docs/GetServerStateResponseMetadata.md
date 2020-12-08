

# GetServerStateResponseMetadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiExtensions** | **List&lt;String&gt;** | List of API extensions added after the API was marked stable |  [optional]
**apiStatus** | **String** | API implementation status (one of, development, stable or deprecated) |  [optional]
**apiVersion** | **String** | The API version as a string |  [optional]
**auth** | **String** | Authentication state. |  [optional]
**config** | [**ServerConfig**](ServerConfig.md) |  |  [optional]
**environment** | [**Environment**](Environment.md) |  |  [optional]
**_public** | **Boolean** | Whether the server should be treated as a public (read-only) remote by the client |  [optional]



