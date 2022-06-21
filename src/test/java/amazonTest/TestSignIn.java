package amazonTest;

import amazonPage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSignIn extends BaseTest {

    @Test
    public void signInImportantMessage() {
        openAmazon();
        HomePage homePage = new HomePage(driver);
        homePage.getSignInPage().click();
        homePage.getInputEmail().sendKeys(homePage.Email);
        homePage.getContinueBtn().click();
        homePage.getInputPassword().sendKeys(homePage.Password);
        homePage.getSignInBtn().click();

        Assert.assertTrue(homePage.importantMessage().isDisplayed());
    }

    @Test
    public void signInMessageError() {
        openAmazon();
        HomePage homePage = new HomePage(driver);
        homePage.getSignInPage().click();
        homePage.getInputEmail().sendKeys("qwe123@gmail.co");
        homePage.getContinueBtn().click();
        homePage.getInputPassword().sendKeys("54484weg");
        homePage.getSignInBtn().click();
        Assert.assertTrue(homePage.getErrorMessage().isDisplayed());
    }
}