

# CreateInstancesByNameExecRequest

## oneOf schemas
* [CreateInstancesByNameExecRequestOneOf](CreateInstancesByNameExecRequestOneOf.md)
* [Sigusr1SignalRequest](Sigusr1SignalRequest.md)
* [WindowSizeChangeRequest](WindowSizeChangeRequest.md)

## Example
```java
// Import classes:
import org.relxd.lxd.client.model.CreateInstancesByNameExecRequest;
import org.relxd.lxd.client.model.CreateInstancesByNameExecRequestOneOf;
import org.relxd.lxd.client.model.Sigusr1SignalRequest;
import org.relxd.lxd.client.model.WindowSizeChangeRequest;

public class Example {
    public static void main(String[] args) {
        CreateInstancesByNameExecRequest exampleCreateInstancesByNameExecRequest = new CreateInstancesByNameExecRequest();

        // create a new CreateInstancesByNameExecRequestOneOf
        CreateInstancesByNameExecRequestOneOf exampleCreateInstancesByNameExecRequestOneOf = new CreateInstancesByNameExecRequestOneOf();
        // set CreateInstancesByNameExecRequest to CreateInstancesByNameExecRequestOneOf
        exampleCreateInstancesByNameExecRequest.setActualInstance(exampleCreateInstancesByNameExecRequestOneOf);
        // to get back the CreateInstancesByNameExecRequestOneOf set earlier
        CreateInstancesByNameExecRequestOneOf testCreateInstancesByNameExecRequestOneOf = (CreateInstancesByNameExecRequestOneOf) exampleCreateInstancesByNameExecRequest.getActualInstance();

        // create a new Sigusr1SignalRequest
        Sigusr1SignalRequest exampleSigusr1SignalRequest = new Sigusr1SignalRequest();
        // set CreateInstancesByNameExecRequest to Sigusr1SignalRequest
        exampleCreateInstancesByNameExecRequest.setActualInstance(exampleSigusr1SignalRequest);
        // to get back the Sigusr1SignalRequest set earlier
        Sigusr1SignalRequest testSigusr1SignalRequest = (Sigusr1SignalRequest) exampleCreateInstancesByNameExecRequest.getActualInstance();

        // create a new WindowSizeChangeRequest
        WindowSizeChangeRequest exampleWindowSizeChangeRequest = new WindowSizeChangeRequest();
        // set CreateInstancesByNameExecRequest to WindowSizeChangeRequest
        exampleCreateInstancesByNameExecRequest.setActualInstance(exampleWindowSizeChangeRequest);
        // to get back the WindowSizeChangeRequest set earlier
        WindowSizeChangeRequest testWindowSizeChangeRequest = (WindowSizeChangeRequest) exampleCreateInstancesByNameExecRequest.getActualInstance();
    }
}
```


