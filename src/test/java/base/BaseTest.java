package base;

import org.openqa.selenium.WebDriver;
import pages.AddEmployedPage;
import pages.EmployedListPage;
import pages.EmployedReportsPage;
import pages.LoginPage;

public class BaseTest {
    protected WebDriver driver;
    protected String URL= "https://opensource-demo.orangehrmlive.com/";
    protected LoginPage loginPage = new LoginPage(driver);

    protected EmployedListPage listPage= new EmployedListPage();
    protected AddEmployedPage addPage= new AddEmployedPage();
    protected EmployedReportsPage reportsPage= new EmployedReportsPage();


}
