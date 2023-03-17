package ApıExercise;
import io.restassured.RestAssured;

import  static io.restassured.RestAssured.given;
public class posttoverifyloginwithoutemail {
    public static void main(String[] args) {

        RestAssured.baseURI="https://automationexercise.com/api/verifyLogin";

        String response=given().log().all().queryParam("password","1995").queryParam("email","vesek@vesek").when().post().then().extract().response().asString();
        System.out.println(response);
    }
}
