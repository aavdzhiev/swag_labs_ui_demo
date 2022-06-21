package logins;//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Base;
import pages.HomePage;
import pages.LogInPage;

public class TestLogin extends Base {
    LogInPage loginPage;
    HomePage homePage;

    public TestLogin() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LogInPage();
    }

    @Test(suiteName = "Logins")
    public void loginPageTitleTest() {
        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals(title, "Swag Labs");
    }

    @Test(suiteName = "Logins", testName = "Valid Login")
    public void testStandardLogin() {
        LogInPage logInPage = new LogInPage();
        String uname = prop.getProperty("username");
        String pwd = prop.getProperty("password");

        logInPage.loginValidUser(uname, pwd);

    }

    @Test(suiteName = "Select items")
    public void loginTest() {
        homePage = loginPage.loginValidUser(prop.getProperty("username"), prop.getProperty("password"));
        homePage.selectFirstItem();
        homePage.selectLastItem();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
