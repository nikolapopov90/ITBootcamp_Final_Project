package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablesTest extends BaseTest{
    @Test(priority = 1)
    public void testElementsWebTables () {
        getHomePage().clickElementsCard();
        getElementsPage().clickWebTables();
        getWebTablesPage().setAddNewUserButton();
        getWebTablesPage().enterFirstName("Nikola");
        getWebTablesPage().enterLastName("Popov");
        getWebTablesPage().enterEmail("KsenijaPajcinFan@google.com");
        getWebTablesPage().enterAge("32");
        getWebTablesPage().enterSalary("1312");
        getWebTablesPage().enterDepartment("QA");
        getWebTablesPage().clickSubmitButton();
        Assert.assertTrue(getWebTablesPage().newUserAddedToList());
    }
}
