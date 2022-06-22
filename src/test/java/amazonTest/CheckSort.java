package amazonTest;

import amazonPage.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckSort extends BaseTest {

    @Test
    public void checkBooksPage() {
        openAmazon();
        HomePage homePage = new HomePage(driver);
        homePage.getBtnAllInHeader().click();
        homePage.getBooksBtn().click();
        homePage.getBtnSearch().click();
        homePage.getFiltreGermani().click();

        Assert.assertTrue(homePage.checkListContains(homePage.getListFiltreGermani(), "French Edition"));
    }

    @Test
    public void checkCompPage() {
        openAmazon();
        HomePage homePage = new HomePage(driver);
        homePage.getBtnAllInHeader().click();
        homePage.getComputersBtn().click();
        homePage.getBtnSearch().click();
        homePage.getFiltreHp().click();

        Assert.assertTrue(homePage.checkListContains(homePage.getListProduct(), "Roku"));
    }

    @Test
    public void checkBabyPage() {
        openAmazon();
        HomePage homePage = new HomePage(driver);
        homePage.getBtnAllInHeader().click();
        homePage.getBabyBtn().click();
        homePage.getBtnSearch().click();
        homePage.getFiltrePampers().click();

        Assert.assertTrue(homePage.checkListContains(homePage.getListProduct(),"Pampers"));
    }
}
