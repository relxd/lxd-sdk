

# CreateInstancesByNameRequest

## oneOf schemas
* [CreateInstancesByNameRequestOneOf](CreateInstancesByNameRequestOneOf.md)
* [MigrateInstancesByNameRequest](MigrateInstancesByNameRequest.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.CreateInstancesByNameRequest;
import org.openapitools.client.model.CreateInstancesByNameRequestOneOf;
import org.openapitools.client.model.MigrateInstancesByNameRequest;

public class Example {
    public static void main(String[] args) {
        CreateInstancesByNameRequest exampleCreateInstancesByNameRequest = new CreateInstancesByNameRequest();

        // create a new CreateInstancesByNameRequestOneOf
        CreateInstancesByNameRequestOneOf exampleCreateInstancesByNameRequestOneOf = new CreateInstancesByNameRequestOneOf();
        // set CreateInstancesByNameRequest to CreateInstancesByNameRequestOneOf
        exampleCreateInstancesByNameRequest.setActualInstance(exampleCreateInstancesByNameRequestOneOf);
        // to get back the CreateInstancesByNameRequestOneOf set earlier
        CreateInstancesByNameRequestOneOf testCreateInstancesByNameRequestOneOf = (CreateInstancesByNameRequestOneOf) exampleCreateInstancesByNameRequest.getActualInstance();

        // create a new MigrateInstancesByNameRequest
        MigrateInstancesByNameRequest exampleMigrateInstancesByNameRequest = new MigrateInstancesByNameRequest();
        // set CreateInstancesByNameRequest to MigrateInstancesByNameRequest
        exampleCreateInstancesByNameRequest.setActualInstance(exampleMigrateInstancesByNameRequest);
        // to get back the MigrateInstancesByNameRequest set earlier
        MigrateInstancesByNameRequest testMigrateInstancesByNameRequest = (MigrateInstancesByNameRequest) exampleCreateInstancesByNameRequest.getActualInstance();
    }
}
```


