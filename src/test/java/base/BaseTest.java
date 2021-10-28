package base;

import org.openqa.selenium.WebDriver;
import pages.*;
//import stepsdefinitions.ActionsClass;

public class BaseTest {
    protected WebDriver driver;
    protected String URL= "https://opensource-demo.orangehrmlive.com/";
    protected LoginPage loginPage = new LoginPage(driver);
    //protected ActionPage action=new ActionPage(driver);


}
