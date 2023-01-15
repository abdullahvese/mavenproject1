package Exercises;

import Pages.BasePage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.BrowserUtils;

import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Pages;

public class RegistrationTest extends BaseTest {

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
    public void Test_Case_1RegisterUser(){


pages.getHomePage().clickSignUpButton();
pages.getLoginpage().sendNameToNewUserSignUpNameBox("abdullah");
pages.getLoginpage().sendEmailToNewUserSignUpEmailBox("abdullah@gmail.com");
pages.getLoginpage().clickSignUpButton();

BrowserUtils.wait(2);

pages.getSignuppage().selectTitleMen();
pages.getSignuppage().setPassword("1453");







}






}
