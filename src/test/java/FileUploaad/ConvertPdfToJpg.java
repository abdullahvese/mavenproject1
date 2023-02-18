package FileUploaad;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Objects;

public class ConvertPdfToJpg {
    public static void main(String[] args) throws InterruptedException, IOException {
   //CHANGE THE DOWNLOAD FİLE the same package of your code
       String downloadpath =System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", "C:/grid/chromedriver_win32/chromedriver.exe");
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

        chromePrefs.put("profile.default_content_settings.popups", 0);

        chromePrefs.put("download.default_directory", downloadpath);
        ChromeOptions options=new ChromeOptions();
        options.setExperimentalOption("prefs",chromePrefs);
        ChromeDriver driver = new ChromeDriver(options);
      driver.get("https://convertio.co/tr/pdf-jpg/");
      driver.findElement(By.cssSelector("label span")).click();
      Thread.sleep(3000);
      Runtime.getRuntime().exec("C:\\Users\\Monster1\\Documents\\upload.exe");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until((ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("css yaz"))));

      //everything is ready download jpg

       driver.findElement(By.cssSelector("download now selector write")).click();

        Thread.sleep(3000);

       File file=new File(downloadpath+"/converted.zip");
        //downloaded file name is always be convert.zip
      if (file.exists()){
          System.out.println("file found");
          //file.delete();--->for delete file
      }









    }
}