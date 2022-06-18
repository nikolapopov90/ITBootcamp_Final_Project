package pages.defaultPages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultPages.BasePage;

import java.time.Duration;

public class HomePage extends BasePage {
    private By elementsCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    private By alertsCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]");
    private static final String LOGIN_URL = "https://demoqa.com/login";


    public HomePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public void clickElementsCard () {
        getDriver().findElement(elementsCard).click();
    }
    public void clickAlertsCard () {
        getDriver().findElement(alertsCard).click();
    }
    public void openLoginPage () {
        getDriver().navigate().to(LOGIN_URL);
    }
    }

