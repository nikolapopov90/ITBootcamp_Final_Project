package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.defaultPages.BasePage;

public class AlertsTests extends BaseTest {

    @Test(priority = 1)
    public void testAlerts() {
        getHomePage().clickAlertsCard();
        getAlertsBasePage().clickAlerts();
        getAlertsPage().clickAlertsButton();
        Assert.assertTrue(getAlertsPage().isVisibleAlertMessage());
        getAlertsPage().acceptAlertMessage();
    }

    @Test(priority = 2)
    public void testPromtButton() {
        getDriver().navigate().to("https://demoqa.com/");
        getHomePage().clickAlertsCard();
        getAlertsBasePage().clickAlerts();
        getAlertsPage().clickPromtButton();
        getDriverWait().until(ExpectedConditions.alertIsPresent());
        getAlertsPage().enterNameInAlert("KsenijaPajcin");
        Assert.assertEquals(getAlertsPage().confirmationPromtResultsMessage(), "You entered KsenijaPajcin");
    }

}
