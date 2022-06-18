package pages.elementsPage;

import pages.defaultPages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ButtonsPage extends BasePage {
    private By doubleClickButton = By.id("doubleClickBtn");
    private By doubleClickMessage = By.id("doubleClickMessage");
    private By rightClickButton = By.id("rightClickBtn");
    private By rightClickMessage = By.id("rightClickMessage");
    private By singleClick = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button");
    private By singleClickMessage = By.id("dynamicClickMessage");

    public ButtonsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public void doubleClickButtonClick() {
        Actions actions = new Actions(getDriver());
        WebElement doubleClick = getDriver().findElement(doubleClickButton);
        actions.doubleClick(doubleClick).perform();
    }
    public void waitDoubleClick () {
        getDriverWait().until(ExpectedConditions.presenceOfElementLocated(doubleClickButton));
    }
    public void verifyDoubleClickButton () {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(40));
    }

    public String doubleClickButtonMessage() {
        return getDriver().findElement(doubleClickMessage).getText();
    }

    public void rightClickButtonClick() {
        Actions actions = new Actions(getDriver());
        WebElement rightClick = getDriver().findElement(rightClickButton);
        actions.contextClick(rightClick).perform();
    }

    public String rightClickButtonMessage() {
        return getDriver().findElement(rightClickMessage).getText();
    }
    public void singleClickPerform () {
        getDriver().findElement(singleClick).click();
    }
    public String singleClickPerformMessage () {
        return getDriver().findElement(singleClickMessage).getText();

    }


}

