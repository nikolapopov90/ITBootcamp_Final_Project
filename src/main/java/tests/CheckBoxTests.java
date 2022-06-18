package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTests extends BaseTest{
    @Test(priority = 1)
    public void testElementsCheckBoxPage () {
        getHomePage().clickElementsCard();
        getElementsPage().clickCheckBox();
        getCheckBoxPage().clickExpandHome();
        getCheckBoxPage().clickExpandDocuments();
        getCheckBoxPage().clickDocumentsCheckBox();
        Assert.assertTrue(getCheckBoxPage().checkBoxMessageDisplay());
    }

}
