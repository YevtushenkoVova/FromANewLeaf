package amazonTest;

import amazonPage.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckSort extends BaseTest{

    @Test
    public void checkBooksPage() {
        openAmazon();
        HomePage homePage = new HomePage(driver);
        homePage.getBtnAllInHeader().click();
        homePage.getBooksBtn().click();
        homePage.getBtnSearch().click();
        homePage.getFiltreGermani().click();
        for(WebElement element: homePage.getListFiltreGermani()){
            Assert.assertTrue(element.getText().contains("German Edition"));
        }
    }

    @Test
    public void checkCompPage(){
        openAmazon();
        HomePage homePage = new HomePage(driver);
        homePage.getBtnAllInHeader().click();
        homePage.getComputersBtn().click();
        homePage.getBtnSearch().click();
        homePage.getFiltreHp().click();
        for(WebElement element: homePage.getListProduct()){
            Assert.assertTrue(element.getText().contains("Roku"));
        }
    }
}
