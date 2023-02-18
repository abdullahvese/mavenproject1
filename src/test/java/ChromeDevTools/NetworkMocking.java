package ChromeDevTools;

import io.cucumber.core.internal.com.fasterxml.jackson.datatype.jdk8.OptionalIntDeserializer;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v108.fetch.Fetch;

import java.util.Optional;

public class NetworkMocking {

    public static void main(String[] args) throws InterruptedException {

//you can stop request and reformat how you want
        System.setProperty("webdriver.chrome.driver", "C:/grid/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

    devTools.send(Fetch.enable(Optional.empty(),Optional.empty()));
    devTools.addListener(Fetch.requestPaused(),request->
            {
              if (request.getRequest().getUrl().contains("shetty")){
                 String newUrl= request.getRequest().getUrl().replace("=shetty","=BadGuy");
                  System.out.println(newUrl);
                  devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(newUrl),Optional.of(request.getRequest().getMethod()),Optional.empty(),Optional.empty(),Optional.empty()));

              }
             else {
                  devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(request.getRequest().getUrl()),Optional.of(request.getRequest().getMethod()),Optional.empty(),Optional.empty(),Optional.empty()));


              }


            });


        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        driver.findElement(By.cssSelector("button[routerlink*='library']")).click();
        Thread.sleep(3000);

       String s= driver.findElement(By.cssSelector("p")).getText();
        System.out.println(s);



    }
}