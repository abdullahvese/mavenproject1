package SerializationAndDeserialization;

import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.restassured.RestAssured.given;

public class test1 {
    public static void main(String[] args) throws InterruptedException {

       //google artık automation test için izin vermediğinden manuel olarak url yi alıyoruz.


        String url="xxx";
        String partialcode=url.split("code=")[1];
        String code=partialcode.split("&scope")[0];





        String response =
                given()
                        .urlEncodingEnabled(false)
                        .queryParams("code",code)

                        .queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
                        .queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
                        .queryParams("grant_type", "authorization_code")
                        .queryParams("state", "verifyfjdss")
                        .queryParams("session_state", "ff4a89d1f7011eb34eef8cf02ce4353316d9744b..7eb8")
                        // .queryParam("scope", "email+openid+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email")

                        .queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
                        .when().log().all()
                        .post("https://www.googleapis.com/oauth2/v4/token").asString();
        //	System.out.println(response);
        JsonPath jsonPath = new JsonPath(response);
        String accessToken = jsonPath.getString("access_token");





        Getcourse gc=    given().contentType("application/json").
                queryParams("access_token", accessToken).expect().defaultParser(Parser.JSON)
                .when()
                .get("https://rahulshettyacademy.com/getCourse.php")
                .as(Getcourse.class);
        System.out.println(gc.getLinkedId());
        System.out.println(gc.getInstructor());
        System.out.println(gc.getCourses().getApi().get(0).getCourseTitle());



    }
}
