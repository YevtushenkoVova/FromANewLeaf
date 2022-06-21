package amazonTest;

import amazonPage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckPages extends BaseTest {

    @Test
    public void checkBooksPage() {
        openAmazon();
        HomePage homePage = new HomePage(driver);
        homePage.getBtnAllInHeader().click();
        homePage.getBooksBtn().click();
        homePage.getBtnSearch().click();

        Assert.assertTrue(homePage.getTitleBooks().isDisplayed());
    }

    @Test
    public void checkCompPage(){
        openAmazon();
        HomePage homePage = new HomePage(driver);
        homePage.getBtnAllInHeader().click();
        homePage.getComputersBtn().click();
        homePage.getBtnSearch().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("computers"));
    }
}
