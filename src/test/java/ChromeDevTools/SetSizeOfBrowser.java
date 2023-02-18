package ChromeDevTools;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v108.emulation.Emulation;

import java.util.Optional;

public class SetSizeOfBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/grid/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
         DevTools devTools=driver.getDevTools();
         devTools.createSession();
         devTools.send(Emulation.setDeviceMetricsOverride(600,1000,50,true, Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty()));
         /*with this method we can decide the size of page */


         driver.get("https://rahulshettyacademy.com/");
         driver.findElement(By.cssSelector("button[class*='navbar-toggle']")).click();

         Thread.sleep(2000);
         driver.findElement(By.cssSelector(" a[href='practice-project']")).click();












    }
}
