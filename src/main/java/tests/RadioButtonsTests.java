package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonsTests extends BaseTest{
    @Test(priority=1)
    public void testRadioButtonYes () {
        getHomePage().clickElementsCard();
        getElementsPage().clickRadioButton();
        getRadioButtonPage().clickRadioButtonYes();
        Assert.assertTrue(getRadioButtonPage().checkRadioButtonYesMessage());
    }
    @Test (priority = 2)
    public void testRadioButtonImpressive () {
        getHomePage().clickElementsCard();
        getElementsPage().clickRadioButton();
        getRadioButtonPage().clickRadioButtonImpressive();
        Assert.assertTrue(getRadioButtonPage().checkRadioButtonImpressiveMessage());
    }
    @Test (priority = 3)
    public void testRadioButtonNo () {
        getHomePage().clickElementsCard();
        getElementsPage().clickRadioButton();
        Assert.assertTrue(getRadioButtonPage().clickRadioButtonNo());
    }
}
