

# CreateInstancesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | 64 chars max, ASCII, no slash, no colon and no comma | 
**architecture** | **String** |  | 
**profiles** | **List&lt;String&gt;** | List of profiles | 
**ephemeral** | **Boolean** | Whether to destroy the instance on shutdown | 
**config** | [**CreateInstancesRequestConfig**](CreateInstancesRequestConfig.md) |  | 
**type** | **String** | Optional. Can be \&quot;virtual-machine\&quot;, \&quot;container\&quot; - by default it set to \&quot;container\&quot; |  [optional]
**devices** | [**DevicesKvm**](DevicesKvm.md) |  |  [optional]
**instanceType** | **String** | An optional instance type to use as basis for limits |  [optional]
**source** | [**Source**](Source.md) |  | 



