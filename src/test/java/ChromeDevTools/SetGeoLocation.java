package ChromeDevTools;

import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v108.emulation.Emulation;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SetGeoLocation {
    public static void main(String[] args) {

       //change country of browser

        System.setProperty("webdriver.chrome.driver","C:/grid/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
       DevTools devTools=driver.getDevTools();
        devTools.createSession();

       Map<String,Object>geo=new HashMap<>();
       geo.put("latitude",40);
       geo.put("longitude",3);
       geo.put("accuracy",1);





      driver.executeCdpCommand("Emulation.setGeolocationOverride",geo);









       driver.get("http://google.com");
       driver.findElement(By.name("q")).sendKeys("netflix", Keys.ENTER);
       List<WebElement>list=driver.findElements(By.cssSelector(".LC20lb"));
       list.get(0).click();
       String s=driver.findElement(By.cssSelector(".our-story-card-title")).getText();
        System.out.println(s);

    }
}
