package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    @FindBy(id = "search_product")
    WebElement searchProductBox;

   public void sendNameToSearchProductBox(String name){
       searchProductBox.sendKeys(name);
   }


}
