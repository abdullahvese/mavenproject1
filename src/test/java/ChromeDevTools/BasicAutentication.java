package ChromeDevTools;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.function.Predicate;

public class BasicAutentication {
    public static void main(String[] args) throws URISyntaxException {
        System.setProperty("webdriver.chrome.driver","C:/grid/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();

//pop up is not web based so you cannot overcome it with selenium and use it
      Predicate<URI>uripredicate=uri-> uri.getHost().contains("httpbin.org");

//this method send name and password automatically
        ((HasAuthentication)driver).register(uripredicate, UsernameAndPassword.of("foo","bar"));
   driver.get("http://httpbin.org/basic-auth/foo/bar");

    }
}
