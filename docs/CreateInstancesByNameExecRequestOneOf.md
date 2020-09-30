

# CreateInstancesByNameExecRequestOneOf

Input (run bash)
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**command** | **List&lt;String&gt;** | Command and arguments | 
**environment** | [**Object**](.md) | Optional extra environment variables to set |  [optional]
**waitForWebsocket** | **Boolean** | Whether to wait for a connection before starting the process | 
**recordOutput** | **Boolean** | Whether to store stdout and stderr (only valid with wait-for-websocket&#x3D;false) (requires API extension container_exec_recording) | 
**interactive** | **Boolean** | Whether to allocate a pty device instead of PIPEs | 
**width** | **Integer** | Initial width of the terminal (optional) |  [optional]
**height** | **Integer** | Initial height of the terminal (optional) |  [optional]
**user** | **Integer** | User to run the command as (optional) |  [optional]
**group** | **Integer** | Group to run the command as (optional) |  [optional]
**cwd** | **String** | Current working directory (optional) |  [optional]



