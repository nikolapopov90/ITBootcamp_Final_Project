package pages.elementsPage;

import pages.defaultPages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage extends BasePage {
    private By username = By.id("userName");
    private By email = By.id("userEmail");
    private By currentAddress = By.id("currentAddress");
    private By permanentAdress = By.id("permanentAddress");
    private By submitButton = By.id("submit");
    private By textBoxMessage = By.xpath("//*[@id=\"output\"]/div");

    public TextBoxPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void enterUsername(String username) {
        getDriver().findElement(this.username).sendKeys(username);
    }

    public void enterEmail(String email) {
        getDriver().findElement(this.email).sendKeys(email);
    }

    public void enterCurrentAddress(String currentAddress) {
        getDriver().findElement(this.currentAddress).sendKeys(currentAddress);
    }

    public void enterPermanentAddress(String permanentAddress) {
        getDriver().findElement(this.permanentAdress).sendKeys(permanentAddress);
    }

    public void clickSubmitButton() {
        getDriver().findElement(submitButton).click();
    }

    public boolean verifyTextBoxMessage() {
        return getDriver().findElement(this.textBoxMessage).isDisplayed();
    }
}