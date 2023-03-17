package ApıExercise;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;
public class getallbraandlist {
    public static void main(String[] args) {

        RestAssured.baseURI = "https://automationexercise.com/api/brandsList";
        String response = given().log().all().when().get().then().assertThat().statusCode(200).extract().response().asString();
        System.out.println(response);


    }
}