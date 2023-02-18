package WindowPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/grid/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://admin:admin@the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Basic Auth")).click();
//"http://username:password@url"


    }
}
