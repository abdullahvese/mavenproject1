package Cucumber.stepdefinations;

import ApıAutomation.Body;
import Cucumber.pojoClass.AddPlace;
import Cucumber.pojoClass.Location;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.*;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.*;

import java.io.*;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static Cucumber.pojoClass.Utils.getGlobalValue;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class placeValidation {
    ResponseSpecification resspec;
    RequestSpecification res;
    Response response;
    @Given("Add place Payload name {string} language {string} adress {string}")
    public void add_place_payload_name_language_adress(String name, String language, String adress) throws IOException {
        // Write code here that turns the phrase above into concrete actions


        AddPlace p=new AddPlace();
        p.setAccuracy("50");
        p.setName(name);
        p.setPhoneNumber("(+91) 983 893 3937");
        p.setAdress(adress);
        p.setWebsite("http://google.com");
        p.setLanguage(language);

        Location l=new Location();
        l.setLat(-38.383494);
       l.setLng(33.427362);
       p.setLocation(l);

        List<String>my=new ArrayList<>();
        my.add("shoe park");
        my.add("shop");
        p.setTypes(my);

        PrintStream log=new PrintStream(new FileOutputStream("logging.txt"));

        RequestSpecification req=new RequestSpecBuilder().setBaseUri(getGlobalValue("baseUrl")).addQueryParam("key","qaclick123")
                .addFilter(RequestLoggingFilter.logRequestTo(log))
                .addFilter(ResponseLoggingFilter.logResponseTo(log))

                .setContentType(ContentType.JSON).build();
         resspec=new ResponseSpecBuilder().expectStatusCode(200).build();
         res=given().log().all().spec(req).body(p);






    }
    @When("user calls {string} with Post Http")
    public void user_calls_with_post_http(String s) {

         response=res.when().post("/maps/api/place/add/json").then().spec(resspec).extract().response();


    }


    @Then("the API call is success with status code {int}")
    public void the_apı_call_is_success_with_status_code(Integer int1) {

       assertEquals(response.getStatusCode(),200);



    }
    @Then("{string} in response body is {string}")
    public void in_response_body_is(String key, String value) {
        String re=response.asString();
        JsonPath js=new JsonPath(re);
       assertEquals( js.get(key).toString(),value);





}
}