package ApıAutomation;

import io.restassured.path.json.JsonPath;

public class Reusablemethod {

    public static JsonPath rawToJson(String response){
        JsonPath js=new JsonPath(response);
        return js;
    }
}
