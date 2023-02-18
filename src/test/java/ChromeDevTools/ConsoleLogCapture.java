package ChromeDevTools;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.List;

public class ConsoleLogCapture {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/grid/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();

//you can knoe why automation test fail with selenium
        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
       driver.manage().window().maximize();

        driver.findElement(By.linkText("Browse Products")).click();
        driver.findElement(By.linkText("Selenium")).click();
        driver.findElement(By.cssSelector(".add-to-cart")).click();
        driver.findElement(By.cssSelector("a[href='/angularAppdemo/cart']")).click();
        driver.findElement(By.id("exampleInputEmail1")).clear();
        driver.findElement(By.id("exampleInputEmail1")).sendKeys("2");

       LogEntries entry= driver.manage().logs().get(LogType.BROWSER);
       List<LogEntry> list=entry.getAll();

       for (LogEntry e:list){
           System.out.println(e.getMessage());
       }

    }
}
