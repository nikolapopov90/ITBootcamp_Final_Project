package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest{
    @Test(priority = 1)
    public void testTextBox () {
        getHomePage().clickElementsCard();
        getElementsPage().clickTextBox();
        getTextBoxPage().enterUsername("Nikola");
        getTextBoxPage().enterEmail("1312@google.com");
        getTextBoxPage().enterCurrentAddress("Current address");
        getTextBoxPage().enterPermanentAddress("Permanent address");
        getTextBoxPage().clickSubmitButton();
        Assert.assertTrue(getTextBoxPage().verifyTextBoxMessage());
    }
}
