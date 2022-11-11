

# Source


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Can be \&quot;image\&quot;, \&quot;migration\&quot;, \&quot;copy\&quot; or \&quot;none\&quot;. |  |
|**alias** | **String** | Name of the alias. |  [optional] |
|**fingerprint** | **String** | Fingerprint |  [optional] |
|**properties** | [**Properties**](Properties.md) |  |  [optional] |
|**mode** | **String** | One of \&quot;local\&quot; (default) or \&quot;pull\&quot; |  [optional] |
|**server** | **String** | Remote server (pull mode only) |  [optional] |
|**protocol** | **String** | Protocol (one of lxd or simplestreams, defaults to lxd) |  [optional] |
|**certificate** | **String** | Optional PEM certificate. If not mentioned, system CA is used. |  [optional] |
|**secret** | **String** | Secret to use to retrieve the image (pull mode only). |  [optional] |
|**operation** | **String** | Full URL to the remote operation (pull mode only). |  [optional] |
|**baseImage** | **String** | Optional, the base image the instance was created from |  [optional] |
|**instanceOnly** | **Boolean** | Whether to migrate only the instance without snapshots. Can be \&quot;true\&quot; or \&quot;false\&quot;. |  [optional] |
|**secrets** | [**Secrets**](Secrets.md) |  |  [optional] |
|**source** | **String** | Name of the source instance |  [optional] |
|**live** | **Boolean** | Whether migration is performed live |  [optional] |



