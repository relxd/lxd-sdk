

# CreateInstancesByNameConsoleRequest

## oneOf schemas
* [CreateInstancesByNameConsoleRequestOneOf](CreateInstancesByNameConsoleRequestOneOf.md)
* [WindowSizeChangeRequest](WindowSizeChangeRequest.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.CreateInstancesByNameConsoleRequest;
import org.openapitools.client.model.CreateInstancesByNameConsoleRequestOneOf;
import org.openapitools.client.model.WindowSizeChangeRequest;

public class Example {
    public static void main(String[] args) {
        CreateInstancesByNameConsoleRequest exampleCreateInstancesByNameConsoleRequest = new CreateInstancesByNameConsoleRequest();

        // create a new CreateInstancesByNameConsoleRequestOneOf
        CreateInstancesByNameConsoleRequestOneOf exampleCreateInstancesByNameConsoleRequestOneOf = new CreateInstancesByNameConsoleRequestOneOf();
        // set CreateInstancesByNameConsoleRequest to CreateInstancesByNameConsoleRequestOneOf
        exampleCreateInstancesByNameConsoleRequest.setActualInstance(exampleCreateInstancesByNameConsoleRequestOneOf);
        // to get back the CreateInstancesByNameConsoleRequestOneOf set earlier
        CreateInstancesByNameConsoleRequestOneOf testCreateInstancesByNameConsoleRequestOneOf = (CreateInstancesByNameConsoleRequestOneOf) exampleCreateInstancesByNameConsoleRequest.getActualInstance();

        // create a new WindowSizeChangeRequest
        WindowSizeChangeRequest exampleWindowSizeChangeRequest = new WindowSizeChangeRequest();
        // set CreateInstancesByNameConsoleRequest to WindowSizeChangeRequest
        exampleCreateInstancesByNameConsoleRequest.setActualInstance(exampleWindowSizeChangeRequest);
        // to get back the WindowSizeChangeRequest set earlier
        WindowSizeChangeRequest testWindowSizeChangeRequest = (WindowSizeChangeRequest) exampleCreateInstancesByNameConsoleRequest.getActualInstance();
    }
}
```


