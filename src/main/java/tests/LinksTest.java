package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LinksTest extends BaseTest{
    @Test(priority = 1)
    public void testElementsLinks () {
        getHomePage().clickElementsCard();
        getElementsPage().clickLinks();
                /*
                getLinksPage().clickHomePageLink();
                getLinksPage().clickHomeSecondLink(); //
                 */
        getLinksPage().clickCreatedApiCall();
        Assert.assertTrue(getLinksPage().createdApiCallMessage());
        getLinksPage().clickNoContentApiCall();
        Assert.assertTrue(getLinksPage().noContentApiCallMessageCheck());
        getLinksPage().clickMovedApiCall();
        Assert.assertTrue(getLinksPage().movedApiCallMessageCheck());
        getLinksPage().clickBadRequestApiCall();
        Assert.assertTrue(getLinksPage().badRequestApiCallMessageCheck());
        getLinksPage().clickUnauthorizedApiCall();
        Assert.assertTrue(getLinksPage().unauthorizedApiCallMessageCheck());
        getLinksPage().clickForbidenApiCall();
        Assert.assertTrue(getLinksPage().forbidenApiCallMessageCheck());
        getLinksPage().clickNotFoundApiCall();
        Assert.assertTrue(getLinksPage().notFoundApiCallMessageCheck());
    }
}
