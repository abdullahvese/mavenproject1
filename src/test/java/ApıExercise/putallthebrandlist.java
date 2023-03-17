package ApıExercise;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
public class putallthebrandlist {
    public static void main(String[] args) {
        RestAssured.baseURI="https://automationexercise.com/api/brandsList";
     String response=   given().log().all().when().put().then().extract().response().asString();
        System.out.println(response);


    }
}
