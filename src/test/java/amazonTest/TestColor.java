package amazonTest;

import amazonPage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestColor extends BaseTest {

    @Test
    public void checkBooksPage() {
        openAmazon();
        HomePage homePage = new HomePage(driver);
        homePage.getLinkChairs().click();
        homePage.getListProduct().get(0).click();
        homePage.getColorChairs().click();

        Assert.assertTrue(homePage.getAtributColor().isDisplayed());
    }

    @Test
    public void checkColorBtn() {
        openAmazon();
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getListLinkSee().get(0).getCssValue("Color"),"rgb(0, 113, 133)");
        mouseoverElement(homePage.getListLinkSee().get(0));
        Assert.assertEquals(homePage.getListLinkSee().get(0).getCssValue("Color"),"rgb(199, 81, 31)");
    }
}
