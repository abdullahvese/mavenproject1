package Pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css = "input[data-qa='login-email']")
    WebElement loginAccountNameBox;

    @FindBy(css = "input[data-qa='login-password']")
    WebElement loginAccountPasswordBox;

    @FindBy(css="button[data-qa='login-button']")
    WebElement logInButton;


    @FindBy(css = ".login-form h2")
    WebElement loginToYourAccount;


    @FindBy(css = "input[data-qa='signup-name']")
    WebElement newUserSignUpNameBox;

    @FindBy(css = "input[data-qa='signup-email']")
    WebElement newUserSignUpEmailBox;

    @FindBy(css = "button[data-qa='signup-button']")
    WebElement signUpButton;


    public void sendNameToLogInAccountNameBox(String name){
        loginAccountNameBox.sendKeys(name);

    }

    public void sendNameToLogInAccountPasswordBox(String password){
        loginAccountPasswordBox.sendKeys(password);
    }

public void clickLogInButton(){
        logInButton.click();
}

public void sendNameToNewUserSignUpNameBox(String name){
        newUserSignUpNameBox.sendKeys(name);
}
    public void sendEmailToNewUserSignUpEmailBox(String email){
        newUserSignUpEmailBox.sendKeys(email);
    }


public void clickSignUpButton(){
        signUpButton.click();
}

public String verifyloginToYourAccountVisible(){
   return loginToYourAccount.getText();
}


}
