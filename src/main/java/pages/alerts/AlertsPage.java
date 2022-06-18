package pages.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultPages.BasePage;

import java.time.Duration;

public class AlertsPage extends BasePage {

    private By alerts = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]");
    private By alertButton = By.id("alertButton");
    private By promtButton = By.id("promtButton");
    private By promtResults = By.id("promptResult");


    public AlertsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getAlertsButton(){
        return getDriver().findElement(alertButton);
    }

    public void clickAlertsButton(){
        getAlertsButton().click();
    }

    public void acceptAlertMessage(){
        getDriver().switchTo().alert().accept();
    }

    public boolean isVisibleAlertMessage() {
        return getDriverWait().until(ExpectedConditions.alertIsPresent()) != null;
    }

    public WebElement getPromtButton(){
        return getDriver().findElement(promtButton);
    }

    public void clickPromtButton(){
        getPromtButton().click();
    }

    public void enterNameInAlert(String name){
        getDriver().switchTo().alert().sendKeys(name);
        getDriver().switchTo().alert().accept();
    }

    public String confirmationPromtResultsMessage() {
        return getDriver().findElement(promtResults).getText();
    }
    public WebElement getAlerts(){
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions scrollDown = new Actions(getDriver());
        scrollDown.sendKeys(Keys.PAGE_DOWN).build().perform();
        return getDriver().findElement(alerts);
    }

    public void clickAlerts(){
        getAlerts().click();
    }
}
