package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;

@CucumberOptions(
        features="src/test/resources/features",
        glue= {"stepsdefinitions"},
        monochrome= true,
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber-login.html",
                "json:target/cucumber-reports/Cucumber-login.json"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests{

}
