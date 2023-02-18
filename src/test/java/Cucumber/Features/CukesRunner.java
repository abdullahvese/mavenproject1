package Cucumber.Features;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/java/Cucumber/Features",
        glue = "Cucumber.stepdefinations",
        tags = "@API",
        dryRun = false

)
public class CukesRunner {


}
