package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src/test/resources/features",
        glue= {"stepsdefinitions"},
        monochrome= true,
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber-login.html",
                "json:target/cucumber-reports/Cucumber-login.json"
        }
)
public class Runner  extends AbstractTestNGCucumberTests{
}
