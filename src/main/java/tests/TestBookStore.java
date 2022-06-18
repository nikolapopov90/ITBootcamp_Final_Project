package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBookStore extends BaseTest{
    @Test (priority = 1)
    public void testBookStoreLogin () {
        getHomePage().openLoginPage();
        getLoginPage().enterLoginUsername("Sijak");
        getLoginPage().enterLoginPassword("Asd1312!");
        getLoginPage().clickLoginButton();
    }
    @Test (priority = 2)
    public void testSearchBooksByAuthor () {
        getBooksPage().openBooksPage();
        getBooksPage().enterSearchBooks("Rauschmayer");
        Assert.assertTrue(getBooksPage().checkSearchByAuthor("Rauschmayer"));
    }
}
