package ApıExercise;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
public class RealTımeScenario {
    public static void main(String[] args) {
        RequestSpecification req= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com/")
                .setContentType(ContentType.JSON).build();


       LoginReq l=new LoginReq();
       l.setUserEmail("vesek@gmail.com");
       l.setUserPassword("Muhube.123");
      RequestSpecification reqLogin=  given().log().all().spec(req).body(l);
     String res= reqLogin.when().post("api/ecom/auth/login").then().log().all().extract().response().asString();

        JsonPath js=new JsonPath(res);
        String auth=js.get("token");
        System.out.println(auth);
        String userid=js.get("userId");
        System.out.println(userid);


        //ADD PRODUCT

        RequestSpecification addProductBaseReq= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com/")
                .addHeader("Authorization",auth) .build();



    }




}
