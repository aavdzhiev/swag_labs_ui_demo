package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends Base {
    @FindBy(id="user-name")
    WebElement username;
    @FindBy(id="password")
    WebElement password;
    @FindBy(id="login-button")
    WebElement loginBtn;

    public LogInPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateLoginPageTitle() {
    	return driver.getTitle();
    }

   public HomePage loginValidUser(String un, String pw) {
        username.sendKeys(un);
        password.sendKeys(pw);
        loginBtn.click();

        return new HomePage();
    }
}
