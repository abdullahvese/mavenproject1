package utilities;
import Pages.HomePage;
import Pages.LoginPage;

import Pages.CorrectEnterPage;
import Pages.ProductsPage;
import Pages.SignUpPage;


public class Pages {
private CorrectEnterPage correctEnterPage;
private HomePage homePage;
private LoginPage loginpage;
private ProductsPage productspage;
private  SignUpPage signuppage;


public Pages() {
    this.homePage = new HomePage();
    this.loginpage = new LoginPage();
    this.signuppage = new SignUpPage();
    this.productspage = new ProductsPage();
    this.correctEnterPage=new CorrectEnterPage();
}

    public HomePage getHomePage() {
        return homePage;
    }

    public LoginPage getLoginpage() {
        return loginpage;
    }

    public ProductsPage getProductspage() {
        return productspage;
    }


    public SignUpPage getSignuppage() {
        return signuppage;
    }


    public CorrectEnterPage getCorrectEnterPage() {
        return correctEnterPage;
    }
}


