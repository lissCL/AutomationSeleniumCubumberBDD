package stepsdefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("hello");
    }
    @When("user enters Admin and admin123")
    public void user_enters_admin_and_admin123() {
        System.out.println("hello2");
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("hello3");
    }
}
