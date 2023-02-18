package SerializationAndDeserialization;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

import java.io.File;

import static io.restassured.RestAssured.given;

public class EcommerceApiTest {
    public static void main(String[] args) {

      RequestSpecification req=  new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").setContentType(ContentType.JSON).build();

      LoginRequest loginRequest=new LoginRequest();
   loginRequest.setUserEmail("vesekabdullah@gmail.com");
   loginRequest.setUser("19951905");

     RequestSpecification reqLogin= given().relaxedHTTPSValidation().log().all().spec(req).body(loginRequest);

    LoginResponse loginResponse= reqLogin.when().post("/api/ecom/auth/login").then().extract().response().as(LoginResponse.class);
     String token= loginResponse.getToken();
     String userId=loginResponse.getUserİd();

     //add product
        RequestSpecification addProductBaseReq=  new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addHeader("authoration",token).build();

      RequestSpecification addingProduct=  given().log().all().spec(addProductBaseReq).param("xxx","xxx").param("productAddedId",userId).multiPart("productimage",new File("give the path of image "));
String addProductResponse=addingProduct.when().post("/aasasa/asas/asas/").then().log().all().extract().response().asString();
        JsonPath js=new JsonPath(addProductResponse);
        String productId=js.get("productId");


        //create order

        RequestSpecification createOrderBaseReq=  new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addHeader("authoration",token).setContentType(ContentType.JSON).build();

         //Orders orders=new Orders();  crerate this class
        //orders.setOrders(dsfdf);
        RequestSpecification createOrderReq=  given().log().all().spec(createOrderBaseReq).body("class");
        String resonseOrder=createOrderReq.when().post("xxx").then().log().all().extract().asString();

        //delete product


        RequestSpecification deleteProdBaseReq=  new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addHeader("authoration",token).setContentType(ContentType.JSON).build();
       RequestSpecification deleteProdReq= given().log().all().spec(deleteProdBaseReq).pathParam("productId",productId);
       String deleteResponse=deleteProdReq.when().delete("xxx/{productId}").then().log().all().extract().response().asString();
        JsonPath jss=new JsonPath(deleteResponse);
        String message=js.get("message");


    }
}
