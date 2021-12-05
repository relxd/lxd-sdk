

# UpdateInstancesByNameRequest

## oneOf schemas
* [UpdateInstancesByNameRequest2](UpdateInstancesByNameRequest2.md)
* [UpdateInstancesByNameRequestOneOf](UpdateInstancesByNameRequestOneOf.md)

## Example
```java
// Import classes:
import org.relxd.lxd.client.model.UpdateInstancesByNameRequest;
import org.relxd.lxd.client.model.UpdateInstancesByNameRequest2;
import org.relxd.lxd.client.model.UpdateInstancesByNameRequestOneOf;

public class Example {
    public static void main(String[] args) {
        UpdateInstancesByNameRequest exampleUpdateInstancesByNameRequest = new UpdateInstancesByNameRequest();

        // create a new UpdateInstancesByNameRequest2
        UpdateInstancesByNameRequest2 exampleUpdateInstancesByNameRequest2 = new UpdateInstancesByNameRequest2();
        // set UpdateInstancesByNameRequest to UpdateInstancesByNameRequest2
        exampleUpdateInstancesByNameRequest.setActualInstance(exampleUpdateInstancesByNameRequest2);
        // to get back the UpdateInstancesByNameRequest2 set earlier
        UpdateInstancesByNameRequest2 testUpdateInstancesByNameRequest2 = (UpdateInstancesByNameRequest2) exampleUpdateInstancesByNameRequest.getActualInstance();

        // create a new UpdateInstancesByNameRequestOneOf
        UpdateInstancesByNameRequestOneOf exampleUpdateInstancesByNameRequestOneOf = new UpdateInstancesByNameRequestOneOf();
        // set UpdateInstancesByNameRequest to UpdateInstancesByNameRequestOneOf
        exampleUpdateInstancesByNameRequest.setActualInstance(exampleUpdateInstancesByNameRequestOneOf);
        // to get back the UpdateInstancesByNameRequestOneOf set earlier
        UpdateInstancesByNameRequestOneOf testUpdateInstancesByNameRequestOneOf = (UpdateInstancesByNameRequestOneOf) exampleUpdateInstancesByNameRequest.getActualInstance();
    }
}
```


