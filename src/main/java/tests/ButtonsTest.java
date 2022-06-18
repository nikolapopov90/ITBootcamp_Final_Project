package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest{
    @Test(priority = 1)
    public void testElementsButtonsPage () {
        getHomePage().clickElementsCard();
        getElementsPage().clickButtonsPage();
        getButtonsPage().verifyDoubleClickButton();
        getButtonsPage().waitDoubleClick();
        getButtonsPage().doubleClickButtonClick();
        Assert.assertEquals(getButtonsPage().doubleClickButtonMessage(), "You have done a double click");
        getButtonsPage().rightClickButtonClick();
        Assert.assertEquals(getButtonsPage().rightClickButtonMessage(), "You have done a right click");
        getButtonsPage().singleClickPerform();
        Assert.assertEquals(getButtonsPage().singleClickPerformMessage(), "You have done a dynamic click");
    }
}

