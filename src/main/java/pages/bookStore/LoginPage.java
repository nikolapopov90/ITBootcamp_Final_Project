package pages.bookStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultPages.BasePage;

public class LoginPage extends BasePage {

    private By loginButton = By.id("login");
    private By loginUsernameInput = By.id("userName");
    private By loginPasswordInput = By.id("password");


    public LoginPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public void clickLoginButton () {
        getDriver().findElement(loginButton).click();
    }
    public void enterLoginUsername (String username) {
        getDriver().findElement(this.loginUsernameInput).sendKeys(username);
    }
    public void enterLoginPassword (String password) {
        getDriver().findElement(this.loginPasswordInput).sendKeys(password);
    }
}
