package ChromeDevTools;

import com.google.common.collect.ImmutableList;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v108.network.Network;

import java.util.Optional;

public class BlockImagesForFastTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/grid/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
//block images and make test faster faster faster...

        devTools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
        devTools.send(Network.setBlockedURLs(ImmutableList.of("*jpg","*.css")));

        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        driver.findElement(By.linkText("Browse Products")).click();
        driver.findElement(By.linkText("Selenium")).click();
        driver.findElement(By.cssSelector(".add-to-cart")).click();
        System.out.println(driver.findElement(By.cssSelector("p")).getText());

    }
}
