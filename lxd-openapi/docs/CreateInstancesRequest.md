

# CreateInstancesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | 64 chars max, ASCII, no slash, no colon and no comma | 
**architecture** | **String** |  | 
**profiles** | **List&lt;String&gt;** | List of profiles | 
**ephemeral** | **Boolean** | Whether to destroy the instance on shutdown | 
**config** | **Map&lt;String, Object&gt;** | This is a map of config parameters to be used during instance creation. The keys for this map are the keys from instance.md file (https://github.com/lxc/lxd/blob/master/doc/instances.md#keyvalue-configuration) and values are the fields to set. | 
**type** | **String** | Optional. Can be \&quot;virtual-machine\&quot;, \&quot;container\&quot; - by default it set to \&quot;container\&quot; |  [optional]
**devices** | [**DevicesKvm**](DevicesKvm.md) |  |  [optional]
**instanceType** | **String** | An optional instance type to use as basis for limits |  [optional]
**source** | **Map&lt;String, Object&gt;** | Source to be used to create this container. Can be: \&quot;image\&quot;, \&quot;migration\&quot;, \&quot;copy\&quot; or \&quot;none\&quot; | 



