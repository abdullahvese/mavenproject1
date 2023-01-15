package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BasePage {

    @FindBy(css = "h2[class*='title text-center']:first-child")
    WebElement enterAcoountInformationTitle;

    @FindBy(id="id_gender1")
    WebElement genderMan;

    @FindBy(id="id_gender2")
    WebElement genderWoman;

    @FindBy(id="name")
    WebElement nameBox;

    @FindBy(id = "email")
    WebElement emailBox;

    @FindBy(id = "password")
    WebElement passwordBox;

    @FindBy(id="days")
    WebElement dayBox;

    @FindBy(id = "months")
    WebElement monthBox;

    @FindBy(id = "years")
    WebElement yearBox;

    public String getEnterAccountInformationTitle() {
        return enterAcoountInformationTitle.getText();

    }

    public void selectTitleMen() {
        genderMan.click();
    }

    public void selectTitleWomen() {
        genderWoman.click();
    }

    public void setPassword(String password) {
        passwordBox.sendKeys(password);
    }

    public void setDateOfBirt(String day, String month, String year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }



    private void setDay(String day) {
        Select select = new Select(dayBox);
        select.selectByVisibleText(day);
    }

    private void setMonth(String month) {
        Select select = new Select(monthBox);
        select.selectByVisibleText(month);
    }

    private void setYear(String year) {
        Select select = new Select(yearBox);
        select.selectByVisibleText(year);

    }


}
