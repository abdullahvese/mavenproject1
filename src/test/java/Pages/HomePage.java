package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    @FindBy(css = "a[href*='#Women']")
    WebElement womanTitle;

    @FindBy(css = "a[href='/login']")
    WebElement signUpLoginButton;

    @FindBy(css = "a[href='/products']")
    WebElement productsButton;

    @FindBy(css = "li a[href='/test_cases']")
    WebElement testCases;

    @FindBy(css = "li a[href='/contact_us']")
    WebElement contactUs;


    public void clickSignUpButton() {
        signUpLoginButton.click();
    }

public void clickProductsButton(){
        productsButton.click();
}
public void clickTestCaseButton(){
        testCases.click();
}

public void clickContactUsButton(){
        contactUs.click();
}
public String getCorrectPageWithWomanTitle(){
return womanTitle.getText().split(" ")[0];
}


}
