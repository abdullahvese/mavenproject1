package SerializationAndDeserialization;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.runner.Request;

import static io.restassured.RestAssured.given;

public class PracticeForShortCut {

    public static void main(String[] args) {

        //first write java code for json file serialization
        //the object is b


       //requestbuilder
        RequestSpecification req= new RequestSpecBuilder().setBaseUri("xxx").addQueryParam("xxx","xxx")
                .setContentType(ContentType.JSON).build();


        ResponseSpecification respec= new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();




        RequestSpecification res=given().spec(req).body("b");


       Response response = res.when().post("xxx").then().spec(respec).extract().response();





       String responseString=response.asString();
        System.out.println(responseString);


    }
}
