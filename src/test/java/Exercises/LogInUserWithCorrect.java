package Exercises;

import Pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LogInUserWithCorrect extends BaseTest{
    SoftAssert softAssert = new SoftAssert(); // We should use soft assertion because in this test case we have multiple cases to test

    @BeforeSuite
    public void setUpSuite() {

        // code that is executed before the entire test suite
        String URL = ConfigurationReader.getProperty("url");
        String browser = ConfigurationReader.getProperty("browser");
        String environment = ConfigurationReader.getProperty("environment");
        Driver.getDriver().get(URL);
        System.out.println("::::::Test Information ::::::\n\tURL :" + URL + "\n\tBrowser :" + browser + "\n\tEnvironment :" + environment);
        BrowserUtils.wait(3);
    }

@Test
    public void LogİnCorrectUser(){

        String verifyCorrectPage=pages.getHomePage().getCorrectPageWithWomanTitle();
        softAssert.assertEquals(verifyCorrectPage,"WOMEN","verify that");
        pages.getHomePage().clickSignUpButton();

        String verifyLogınAccountVisible=pages.getLoginpage().verifyloginToYourAccountVisible();
        softAssert.assertEquals(verifyLogınAccountVisible,"Login to your account","verify login page please");
        pages.getLoginpage().sendNameToLogInAccountNameBox("vesek@vesek");
        pages.getLoginpage().sendNameToLogInAccountPasswordBox("1234");
        pages.getLoginpage().clickLogInButton();
          String verifyLogedIn =pages.getCorrectEnterPage().logedAsUserNameGetText();
          softAssert.assertEquals(verifyLogedIn, "abdullah vesek","verify logedpage");
       pages.getCorrectEnterPage().clickdeleteAccount();
    BrowserUtils.wait(6);

    softAssert.assertAll(); // NOTE: don't import to execute 'assertAll' at the end.

}


    @AfterSuite
    public void afterTest() {
        // Perform cleanup tasks or generate test reports here
        Driver.getDriver().quit();
    }



}




