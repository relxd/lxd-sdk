

# Source10

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | 
**mode** | **String** | Only pull is supported for now | 
**server** | **String** | Remote server (pull mode only) | 
**protocol** | **String** | Protocol (one of lxd or simplestreams, defaults to lxd) | 
**secret** | **String** | Secret (pull mode only, private images only) | 
**certificate** | **String** | Optional PEM certificate. If not mentioned, system CA is used. |  [optional]
**fingerprint** | **String** | Fingerprint of the image (must be set if alias isn&#39;t) | 
**alias** | **String** | Name of the alias (must be set if fingerprint isn&#39;t) | 
**name** | **String** |  |  [optional]
**url** | **String** | URL for the image |  [optional]



