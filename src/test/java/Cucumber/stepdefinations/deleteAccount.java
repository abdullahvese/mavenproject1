package Cucumber.stepdefinations;

import Exercises.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class deleteAccount extends BaseTest {


    @Given("^click on sigup/login button$")
    public void click_on_siguplogin_button() throws Throwable {
        pages.getHomePage().clickSignUpButton();


    }

    @When("^enter \"([^\"]*)\" as a email for scenario$")
    public void enter_something_as_a_email(String email) throws Throwable {
      pages.getLoginpage().sendNameToLogInAccountNameBox(email);
    }

    @Then("^click on delete button$")
    public void click_on_delete_button() throws Throwable {
    pages.getCorrectEnterPage().clickdeleteAccount();
    }

    @And("^enter \"([^\"]*)\" as a password for scenario$")
    public void enter_something_as_a_password( String strArg1) throws Throwable {
        pages.getLoginpage().sendNameToLogInAccountPasswordBox(strArg1);
    }

    @And("^click login button$")
    public void click_login_button() throws Throwable {
        pages.getLoginpage().clickLogInButton();
    }
}
