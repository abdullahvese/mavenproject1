package Cucumber;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinations {
    @Given("^I landed on ecommerce page$")
    public void i_landed_on_ecommerce_page() throws Throwable {
        throw new PendingException();
    }

    @Given("^logged in with username (.+) and (.+)$")
    public void logged_in_with_username_and(String name, String password) throws Throwable {
        throw new PendingException();
    }

    @When("^I added product (.+)$")
    public void i_added_product(String productname) throws Throwable {
        throw new PendingException();
    }

    @Then("^\"([^\"]*)\" message is displayed on$")
    public void something_message_is_displayed_on(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^checkout (.+) and submit order$")
    public void checkout_and_submit_order(String productname) throws Throwable {
        throw new PendingException();
    }

}


