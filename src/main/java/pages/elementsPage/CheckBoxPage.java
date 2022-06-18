package pages.elementsPage;

import pages.defaultPages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage extends BasePage {
    private By expandedDocumentsCheckBox = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[1]");
    private By expandHome = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/span/button");
    private By expandDocuments = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li[2]/span/button");
    private By checkBoxMessage = By.xpath("//*[@id=\"result\"]");

    public CheckBoxPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickExpandHome () {
        getDriver().findElement(expandHome).click();
    }
    public void clickExpandDocuments () {
        getDriver().findElement(expandDocuments).click();
    }

    public void clickDocumentsCheckBox () {
        getDriver().findElement(expandedDocumentsCheckBox).click();
    }
    public boolean checkBoxMessageDisplay () {
        return getDriver().findElement(checkBoxMessage).isDisplayed();
    }

}
