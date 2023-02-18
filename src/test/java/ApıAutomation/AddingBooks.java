package ApıAutomation;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class AddingBooks {


    @Test(dataProvider = "BooksData")
    public void addBook(String isbn,String aisle){


        RestAssured.baseURI="http://216.10.245.166";
       String response= given().log().all().header("Content-Type","application/json").body(Body.AddBook(isbn,aisle)).
                when().post("/Library/Addbook.php").then().log().all().assertThat().statusCode(200).extract().response().asString();

        JsonPath js=Reusablemethod.rawToJson(response);
        String id=js.getString("ID");
        System.out.println(id);


        //deletebook
    }












    @DataProvider(name = "BooksData")
    public Object[][] getData(){

        Object [][]arr=new Object[][]{{"asasa","12" },{"rererer","9999"},{"yeyeyey","8888"}};


    return arr;
}



}
