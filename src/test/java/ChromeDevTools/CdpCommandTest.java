package ChromeDevTools;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import java.util.HashMap;
import java.util.Map;

public class CdpCommandTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/grid/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        DevTools devTools=driver.getDevTools();
        devTools.createSession();

        Map deviceMatrix=new HashMap();
        deviceMatrix.put("width",600);
        deviceMatrix.put("height",1000);
        deviceMatrix.put("deviceScaleFactor",50);
        deviceMatrix.put("mobile",true);

//use cdpcommand but this is a little bit confusing use send()method


        driver.executeCdpCommand("Emulation.setDeviceMetricsOverride",deviceMatrix);
        driver.get("https://rahulshettyacademy.com/");
        driver.findElement(By.cssSelector("button[class*='navbar-toggle']")).click();

        Thread.sleep(2000);
        driver.findElement(By.cssSelector(" a[href='practice-project']")).click();
    }
}
