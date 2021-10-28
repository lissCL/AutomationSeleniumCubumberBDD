package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src/test/resources/features",
        glue= {"stepsdefinitions"},
        monochrome= true,
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber-report.html",
                "json:target/cucumber-reports/Cucumber-report.json"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests{

}
