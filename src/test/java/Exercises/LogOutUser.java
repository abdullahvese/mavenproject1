package Exercises;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LogOutUser  extends BaseTest{
    SoftAssert softAssert=new SoftAssert();

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
public void logout(){
        String correctPage=pages.getHomePage().getCorrectPageWithWomanTitle();
        softAssert.assertEquals(correctPage,"WOMAN");
        pages.getHomePage().clickSignUpButton();
        String verifyLoginAccount =pages.getLoginpage().verifyloginToYourAccountVisible();
        softAssert.assertEquals(verifyLoginAccount,"Login to your account");
        pages.getLoginpage().sendNameToLogInAccountNameBox("vesek@vesek");
        pages.getLoginpage().sendNameToLogInAccountPasswordBox("1995");
        pages.getLoginpage().clickLogInButton();
        String logedas=pages.getCorrectEnterPage().logedAsUserNameGetText();
        softAssert.assertEquals(logedas,"abdullah vesek");
        pages.getCorrectEnterPage().clicklogout();







}








    @AfterSuite
    public void afterTest() {
        // Perform cleanup tasks or generate test reports here
        Driver.getDriver().quit();
    }

}
