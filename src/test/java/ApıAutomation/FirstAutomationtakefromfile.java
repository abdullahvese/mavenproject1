package ApıAutomation;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class FirstAutomationtakefromfile {
    public static void main(String[] args) throws IOException {










        RestAssured.baseURI="http://rahulshettyacademy.com";

     //add request
       String response= given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").body(new String(Files.readAllBytes(Paths.get("C:\\Users\\Monster1\\Desktop\\a.json")))).when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP")).extract().response().asString();//extract.response.asString responsu tek satırda yaszdırır.

        System.out.println(response);
        JsonPath js=new JsonPath(response);//extract place id
        String placeid=js.getString("place_id");

        System.out.println(placeid);

        String newAdress="kayseri 3838";


       // update request
        given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").body("{\"key\":\"qaclick123\",\n" +
                "\"address\":\"kayseri 3838\",\n" +
                "\"place_id\":\""+placeid+"\"}").when().put("maps/api/place/update/json").then().assertThat().log().all().statusCode(200);

//get place
       String y= given().log().all().queryParam("key","qaclick123").queryParam("place_id",placeid).when().get("maps/api/place/get/json").then().assertThat().log().all().statusCode(200).extract().response().asString();

       JsonPath jss=Reusablemethod.rawToJson(y);
        String actual =jss.getString("address");
        System.out.println(actual);
        Assert.assertEquals(actual,"kayseri 3838");



    }
}
