package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base {
    //locators by id of loginPage
    By usernameLocator=By.id("txtUsername");
    By passwordLocator=By.id("txtPassword");
    By loginLocator=By.id("btnLogin");
    By homePageLocator= By.id("welcome");

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    //methods

    public void fillUserName(String user){
        type(user,usernameLocator);
    }
    public void fillPassword(String pass){
        type(pass,passwordLocator);
    }
    public void clickLogin(){
        click(loginLocator);
    }

    public void loginCredentials(String user, String pass) throws InterruptedException {
        if(isDisplayed(usernameLocator)){
            type(user,usernameLocator);
            type(pass,passwordLocator);
            Thread.sleep(2000);
            click(loginLocator);
        }else {
            System.out.println("username textbox was not found");
        }

    }
    public Boolean homePageDisplayed(){
        return isDisplayed(homePageLocator);

    }


}
