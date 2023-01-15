package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/Cucumber",glue = "Cucumber.StepDefination",monochrome = true,tags = "@regression",plugin = {"html:target/cucumber.html"})
//eğer birçok features file varsa tags kullanarak sadece onu run edbilirisn
//

public class TestNgRunner extends AbstractTestNGCucumberTests {

}
