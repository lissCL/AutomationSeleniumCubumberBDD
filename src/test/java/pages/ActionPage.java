//package pages;
//
//import base.Base;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import pages.LoginPage;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
//
//public class ActionPage extends Base {
//    WebDriver driver;
//    Actions builder;
//
//    //locators
//    By buzzLocator=By.id("menu_buzz_viewBuzz");
//    By texareaLoacator=By.id("createPost_content");
//    By postButtonLocator=By.id("postSubmitBtn");
//    By imgLocator=By.id("empPic");
//
//
//
//    public ActionPage(WebDriver driver) {
//        super(driver);
//    }
//
//    public void buzz() throws InterruptedException {
//        Thread.sleep(2000);
//        click(buzzLocator);
//    }
//    public void actionComment() throws InterruptedException {
//
//        WebElement txtLocator = findElementos(By.id("createPost_content"));
//        Actions builder = new Actions(driver);
//        Action seriesOfActions = builder
//                .moveToElement(txtLocator)
//                .click()
//                .keyDown(txtLocator, Keys.SHIFT)
//                .sendKeys(txtLocator, "hi1 iam automation sendkeys")
//                .keyUp(txtLocator, Keys.SHIFT)
//                .doubleClick(txtLocator)
//                .contextClick()
//                .build();
//        seriesOfActions.perform() ;
//    }
//
//    public void openSesion() throws InterruptedException {
//        LoginPage login=new LoginPage(driver);
//            type("Admin",login.usernameLocator);
//            type("admin123",login.passwordLocator);
//            Thread.sleep(2000);
//            click(login.loginLocator);
//    }
//
//
//    //Actions builder = new Actions(driver);
//    // seriesOfActions.perform() ;
//
//
//}
