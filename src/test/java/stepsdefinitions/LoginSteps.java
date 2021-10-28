package stepsdefinitions;

import base.BaseTest;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class LoginSteps extends BaseTest {

    @After
    public void teardown() throws InterruptedException {
        loginPage.closeWeb();
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        loginPage.chromeDriverConnection();
        loginPage.visit(URL);
    }
    @When("user enters valid credentials")
    public void user_enters_valid_credentials() throws InterruptedException {
        loginPage.loginCredentials("Admin","admin123");
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        Assert.assertTrue(loginPage.homePageDisplayed());
    }
}
