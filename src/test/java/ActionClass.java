import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionClass {
    WebDriver driver;

    String baseUrl = "https://demoqa.com/text-box";
    By username=By.id("userName");
    By email=By.id("userEmail");
    By address=By.id("currentAddress");
    By permanent=By.id("permanentAddress");
    By submit=By.id("submit");


@BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
@AfterClass
    public void close() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    public void dragAndDrop(){

    }
    @Test(testName = "keyboard events")
    public void keyboardEvents() throws InterruptedException {
        driver.get(baseUrl);
        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(address);
        WebElement usernameLocator = driver.findElement(username);
        WebElement emailLocator = driver.findElement(email);
        WebElement submitLocator = driver.findElement(submit);

//mouse actions
        builder.moveToElement(usernameLocator)
                .click()
                .keyDown(usernameLocator, Keys.SHIFT)
                .sendKeys(usernameLocator, "liss cabezas WWOOWW")
                .keyUp(usernameLocator, Keys.SHIFT)
                .doubleClick(usernameLocator)
                .build().perform() ;

        builder.moveToElement(emailLocator).click()
                .sendKeys(emailLocator, "Automation@gmail.com").moveToElement(element).click().sendKeys("Automation").build().perform();

        Thread.sleep(1000);
        builder.moveToElement(submitLocator).click().build().perform();

        Thread.sleep(2000);

        builder.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        Thread.sleep(1000);
        builder.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
        Thread.sleep(1000);
    }
    @Test
    public void mouseEvents() throws InterruptedException {
        Actions builder = new Actions(driver);

// actions
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        Thread.sleep(5000);

        Action dragdrop=builder.dragAndDrop(source, target).build();

        dragdrop.perform();

        Thread.sleep(5000);

        builder.release().build().perform();

    }

}
