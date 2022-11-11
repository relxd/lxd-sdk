

# CreateInstancesByNameBackupsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Unique identifier for the backup |  [optional] |
|**expiry** | **BigDecimal** | When to delete the backup automatically |  [optional] |
|**instanceOnly** | **Boolean** | If True, snapshots aren&#39;t included |  [optional] |
|**optimizedStorage** | **Boolean** | If True, btrfs send or zfs send is used for instance and snapshots |  [optional] |



