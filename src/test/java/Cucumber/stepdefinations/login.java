package Cucumber.stepdefinations;

import Exercises.BaseTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class login extends BaseTest {
    @Given("^ı landed on page$")
    public void _landed_on_page() throws Throwable
    {
        String URL = ConfigurationReader.getProperty("url");
        String browser = ConfigurationReader.getProperty("browser");
        String environment = ConfigurationReader.getProperty("environment");
        Driver.getDriver().get(URL);
        System.out.println("::::::Test Information ::::::\n\tURL :" + URL + "\n\tBrowser :" + browser + "\n\tEnvironment :" + environment);
        BrowserUtils.wait(3);




    }


    @Given("^enter log in page$")
    public void enter_log_in_page() throws Throwable {

    pages.getHomePage().clickSignUpButton();


    }

    @Then("^user should be loged in$")
    public void user_should_be_loged_in() throws Throwable {

        String s=pages.getCorrectEnterPage().logedAsUserNameGetText();
        Assert.assertEquals(s,"vesek");




    }

    @Then("^user must see his or her name$")
    public void user_must_see_his_or_her_name() throws Throwable {

       String s=pages.getCorrectEnterPage().logedAsUserNameGetText();
        Assert.assertEquals(s,"vesek");

    }

    @And("^enter \"([^\"]*)\" as a email$")
    public void enter_something_as_a_email(String strArg1) throws Throwable {

       pages.getLoginpage().sendNameToLogInAccountNameBox(strArg1);



    }

    @And("^enter \"([^\"]*)\" as a password$")
    public void enter_something_as_a_password(String strArg1) throws Throwable {

       pages.getLoginpage().sendNameToLogInAccountPasswordBox(strArg1);


    }

    @And("^enter login button$")
    public void enter_login_button() throws Throwable {

       pages.getLoginpage().clickLogInButton();


    }

}

