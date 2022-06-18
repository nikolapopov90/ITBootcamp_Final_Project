package pages.elementsPage;

import pages.defaultPages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage extends BasePage {
    private By textBox = By.xpath("//*[@id=\"item-0\"]/span");
    private By checkBox = By.id("item-1");
    private By radioButton = By.id("item-2");
    private By buttons = By.id("item-4");
    private By webTables = By.id("item-3");
    private By links = By.id("item-5");


    public ElementsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickTextBox() {
        getDriver().findElement(textBox).click();
    }

    public void clickCheckBox() {
        getDriver().findElement(checkBox).click();

    }

    public void clickRadioButton() {
        getDriver().findElement(radioButton).click();
    }

    public void clickButtonsPage() {
        getDriver().findElement(buttons).click();
    }

    public void clickWebTables() {
        getDriver().findElement(webTables).click();
    }

    public void clickLinks() {
        getDriver().findElement(links).click();
    }
}

