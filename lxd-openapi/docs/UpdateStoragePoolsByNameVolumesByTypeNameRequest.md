

# UpdateStoragePoolsByNameVolumesByTypeNameRequest

## oneOf schemas
* [UpdateStoragePoolsByNameVolumesByTypeNameRequest2](UpdateStoragePoolsByNameVolumesByTypeNameRequest2.md)
* [UpdateStoragePoolsByNameVolumesByTypeNameRequestOneOf](UpdateStoragePoolsByNameVolumesByTypeNameRequestOneOf.md)

## Example
```java
// Import classes:
import org.relxd.lxd.client.model.UpdateStoragePoolsByNameVolumesByTypeNameRequest;
import org.relxd.lxd.client.model.UpdateStoragePoolsByNameVolumesByTypeNameRequest2;
import org.relxd.lxd.client.model.UpdateStoragePoolsByNameVolumesByTypeNameRequestOneOf;

public class Example {
    public static void main(String[] args) {
        UpdateStoragePoolsByNameVolumesByTypeNameRequest exampleUpdateStoragePoolsByNameVolumesByTypeNameRequest = new UpdateStoragePoolsByNameVolumesByTypeNameRequest();

        // create a new UpdateStoragePoolsByNameVolumesByTypeNameRequest2
        UpdateStoragePoolsByNameVolumesByTypeNameRequest2 exampleUpdateStoragePoolsByNameVolumesByTypeNameRequest2 = new UpdateStoragePoolsByNameVolumesByTypeNameRequest2();
        // set UpdateStoragePoolsByNameVolumesByTypeNameRequest to UpdateStoragePoolsByNameVolumesByTypeNameRequest2
        exampleUpdateStoragePoolsByNameVolumesByTypeNameRequest.setActualInstance(exampleUpdateStoragePoolsByNameVolumesByTypeNameRequest2);
        // to get back the UpdateStoragePoolsByNameVolumesByTypeNameRequest2 set earlier
        UpdateStoragePoolsByNameVolumesByTypeNameRequest2 testUpdateStoragePoolsByNameVolumesByTypeNameRequest2 = (UpdateStoragePoolsByNameVolumesByTypeNameRequest2) exampleUpdateStoragePoolsByNameVolumesByTypeNameRequest.getActualInstance();

        // create a new UpdateStoragePoolsByNameVolumesByTypeNameRequestOneOf
        UpdateStoragePoolsByNameVolumesByTypeNameRequestOneOf exampleUpdateStoragePoolsByNameVolumesByTypeNameRequestOneOf = new UpdateStoragePoolsByNameVolumesByTypeNameRequestOneOf();
        // set UpdateStoragePoolsByNameVolumesByTypeNameRequest to UpdateStoragePoolsByNameVolumesByTypeNameRequestOneOf
        exampleUpdateStoragePoolsByNameVolumesByTypeNameRequest.setActualInstance(exampleUpdateStoragePoolsByNameVolumesByTypeNameRequestOneOf);
        // to get back the UpdateStoragePoolsByNameVolumesByTypeNameRequestOneOf set earlier
        UpdateStoragePoolsByNameVolumesByTypeNameRequestOneOf testUpdateStoragePoolsByNameVolumesByTypeNameRequestOneOf = (UpdateStoragePoolsByNameVolumesByTypeNameRequestOneOf) exampleUpdateStoragePoolsByNameVolumesByTypeNameRequest.getActualInstance();
    }
}
```


