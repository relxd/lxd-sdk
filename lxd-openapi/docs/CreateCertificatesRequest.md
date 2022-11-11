

# CreateCertificatesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Certificate type (keyring), currently only client |  [optional] |
|**certificate** | **String** | If provided, a valid x509 certificate. If not, the client certificate of the connection will be used |  [optional] |
|**name** | **String** | An optional name for the certificate. If nothing is provided, the host in the TLS header for the request is used. |  [optional] |
|**password** | **String** | The trust password for that server (only required if untrusted) |  [optional] |



