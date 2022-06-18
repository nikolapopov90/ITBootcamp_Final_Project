package pages.elementsPage;

import pages.defaultPages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinksPage extends BasePage {
    private By homePageLink = By.id("simpleLink");
    private By homePageSecondLink = By.id("dynamicLink");
    private By createdApiCall = By.id("created");
    private By createdApiCallMessage = By.xpath("//*[@id=\"created\"]");
    private By noContentApiCall = By.id("no-content");
    private By noContentApiCallMessage = By.xpath("//*[@id=\"linkResponse\"]");
    private By movedApiCall = By.id("moved");
    private By movedApiCallMessage = By.xpath("//*[@id=\"linkResponse\"]");
    private By badRequestApiCall = By.id("bad-request");
    private By badRequestApiCallMessage = By.xpath("//*[@id=\"linkResponse\"]");
    private By unauthorizedApiCall = By.id("unauthorized");
    private By unauthorizedApiCallMessage = By.xpath("//*[@id=\"linkResponse\"]");
    private By forbidenApiCall = By.id("forbidden");
    private By forbidenApiCallMessage = By.xpath("//*[@id=\"linkResponse\"]");
    private By notFoundApiCall = By.id("invalid-url");
    private By notFoundApiCallMessage = By.xpath("//*[@id=\"linkResponse\"]");

    public LinksPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public void clickCreatedApiCall () {
        getDriver().findElement(createdApiCall).click();
    }
    public boolean createdApiCallMessage () {
        return getDriver().findElement(createdApiCallMessage).isEnabled();
    }
    public void clickNoContentApiCall () {
        getDriver().findElement(noContentApiCall).click();
    }
    public boolean noContentApiCallMessageCheck () {
        return getDriver().findElement(noContentApiCallMessage).isEnabled();
    }
    public void clickMovedApiCall () {
        getDriver().findElement(movedApiCall).click();
    }
    public boolean movedApiCallMessageCheck () {
        return getDriver().findElement(movedApiCallMessage).isEnabled();
    }
    public void clickBadRequestApiCall () {
        getDriver().findElement(badRequestApiCall).click();
    }
    public boolean badRequestApiCallMessageCheck () {
        return getDriver().findElement(badRequestApiCallMessage).isEnabled();
    }
    public void clickUnauthorizedApiCall () {
        getDriver().findElement(unauthorizedApiCall).click();
    }
    public boolean unauthorizedApiCallMessageCheck () {
        return getDriver().findElement(unauthorizedApiCallMessage).isEnabled();
    }
    public void clickForbidenApiCall () {
        getDriver().findElement(forbidenApiCall).click();
    }
    public boolean forbidenApiCallMessageCheck () {
        return getDriver().findElement(forbidenApiCallMessage).isEnabled();
    }
    public void clickNotFoundApiCall () {
        getDriver().findElement(notFoundApiCall).click();
    }
    public boolean notFoundApiCallMessageCheck () {
        return getDriver().findElement(notFoundApiCallMessage).isEnabled();
    }
}

