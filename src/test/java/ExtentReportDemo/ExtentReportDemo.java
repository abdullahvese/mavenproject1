package ExtentReportDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentReportDemo {

        ExtentReports extent;

        @BeforeTest
        public void config(){

            String path = System.getProperty("user.dir") + "\\reports\\index1.html";
            ExtentSparkReporter reporter = new ExtentSparkReporter(path);
            reporter.config().setReportName("Web Automation Results");
            reporter.config().setDocumentTitle("Test Results");

            extent = new ExtentReports();//this is main class
            extent.attachReporter(reporter);
            extent.setSystemInfo("Tester","Mesut Said");

        }

        @Test
        public void initialDemo(){

            ExtentTest test = extent.createTest("Initial Demo");
            System.setProperty("webDriver.chrome.driver","C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("http://rahulshettyacademy.com");
            System.out.println(driver.getTitle());
            driver.close();
            test.fail("Result do not match");
            extent.flush();//complete execution

        }
}
