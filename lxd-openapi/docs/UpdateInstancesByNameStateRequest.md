

# UpdateInstancesByNameStateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | **String** | State change action (stop, start, restart, freeze or unfreeze) |  [optional] |
|**timeout** | **BigDecimal** | A timeout after which the state change is considered as failed |  [optional] |
|**force** | **Boolean** | Force the state change (currently only valid for stop and restart where it means killing the instance) |  [optional] |
|**stateful** | **Boolean** | Whether to store or restore runtime state before stopping or startiong (only valid for stop and start, defaults to false) |  [optional] |



