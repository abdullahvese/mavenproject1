package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CorrectEnterPage extends BasePage{

    @FindBy(tagName = "b")
    WebElement logedAsUserName;

    @FindBy(css = "a[href*='/delete_account']")
    WebElement deleteAccount;

     @FindBy (xpath = "//a[normalize-space()='Logout']")
     WebElement logout;



public String logedAsUserNameGetText(){
    return logedAsUserName.getText();
}

public void clickdeleteAccount(){
    deleteAccount.click();
}

public void clicklogout(){
    logout.click();
}

}
