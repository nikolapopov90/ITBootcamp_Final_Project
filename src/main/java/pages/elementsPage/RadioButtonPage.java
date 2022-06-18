package pages.elementsPage;

import pages.defaultPages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage extends BasePage {
        private By radioButtonYes = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label");
        private By radioButtonYesMessage = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p");
        private By radioButtonImpressive = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label");
        private By radioButtonImpressiveMessage = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p");
        private By radioButtonNo = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[4]");

    public RadioButtonPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public void clickRadioButtonYes () {
        getDriver().findElement(radioButtonYes).click();
    }
    public boolean checkRadioButtonYesMessage () {return getDriver().findElement(radioButtonYesMessage).isEnabled();
    }
    public void clickRadioButtonImpressive () {
        getDriver().findElement(radioButtonImpressive).click();
    }
    public boolean checkRadioButtonImpressiveMessage () {
        return getDriver().findElement(radioButtonImpressiveMessage).isEnabled();
    }
    public boolean clickRadioButtonNo () {
        return
                getDriver().findElement(radioButtonNo).isEnabled();

    }
}
