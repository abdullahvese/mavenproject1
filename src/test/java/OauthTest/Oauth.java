package OauthTest;
import io.restassured.path.json.JsonPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.restassured.RestAssured.*;
public class Oauth {
    public static void main(String[] args) throws InterruptedException {


 //  System.setProperty("xxx","xxx");
       // WebDriver driver=new ChromeDriver();
     //   driver.get("all code below");

        //açılan pencerede e mail bölümü bulma
     //   driver.findElement(By.xpath("xxx")).sendKeys("xxx");
       // Thread.sleep(4000);
      //  String url=driver.getCurrentUrl();
        String url="xxx manually get this url ";

        String partialCode=url.split("code=")[1];
     String code=partialCode.split("&scope")[0];









        //must give params


        String accessTokenResponse=     given().urlEncodingEnabled(false).queryParam("code",code).queryParam("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
                .queryParam("client_secret","xxx")
                .queryParam("grant_type","xxx")
                .when().log().all().post("xxx").asString();
        JsonPath js=new JsonPath(accessTokenResponse);
       String accessToken= js.getString("access_token");






                String response=  given().queryParam("access_token",accessToken)
            .when().get("https://rahulshettyacademy.com/getCourse.php")
            .asString();


        System.out.println(response);





    }
}
