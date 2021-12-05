

# RawFile

## oneOf schemas
* [Object](Object.md)
* [StandardReturnValueResponse](StandardReturnValueResponse.md)

## Example
```java
// Import classes:
import org.relxd.lxd.client.model.RawFile;
import org.relxd.lxd.client.model.Object;
import org.relxd.lxd.client.model.StandardReturnValueResponse;

public class Example {
    public static void main(String[] args) {
        RawFile exampleRawFile = new RawFile();

        // create a new Object
        Object exampleObject = new Object();
        // set RawFile to Object
        exampleRawFile.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleRawFile.getActualInstance();

        // create a new StandardReturnValueResponse
        StandardReturnValueResponse exampleStandardReturnValueResponse = new StandardReturnValueResponse();
        // set RawFile to StandardReturnValueResponse
        exampleRawFile.setActualInstance(exampleStandardReturnValueResponse);
        // to get back the StandardReturnValueResponse set earlier
        StandardReturnValueResponse testStandardReturnValueResponse = (StandardReturnValueResponse) exampleRawFile.getActualInstance();
    }
}
```


