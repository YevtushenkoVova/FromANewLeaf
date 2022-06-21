package amazonPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String Email = "vv1808@ukr.net";
    public String Password = "qwerty123";

    public WebElement getSignInPage(){
        return getElementByXpath("//a[@id='nav-link-accountList']");
    }

    public WebElement getInputEmail(){
        return getElementByXpath("//input[@id='ap_email']");
    }

    public WebElement getContinueBtn(){
        return getElementByXpath("//span[@id='continue']");
    }

    public WebElement getInputPassword(){
        return getElementByXpath("//input[@id='ap_password']");
    }

    public WebElement getSignInBtn(){
        return getElementByXpath("//input[@id='signInSubmit']");
    }

    public WebElement importantMessage(){
        return getElementByXpath("//h4[text()='Important Message!']");
    }

    public WebElement getBtnAllInHeader() {
        return getElementByXpath("//div[@id='nav-search-dropdown-card']");
    }

    public WebElement getErrorMessage(){
        return getElementByXpath("//h4[@class='a-alert-heading']");
    }

    public WebElement getBooksBtn(){
        return getElementByXpath("//option[@value='search-alias=stripbooks-intl-ship']");
    }

    public WebElement getBtnSearch() {
        return getElementByXpath("//input[@id='nav-search-submit-button']");
    }

    public WebElement getTitleBooks(){
        return getElementByXpath("//img[@alt='Books%20at%20Amazon']");
    }

    public WebElement getComputersBtn(){
        return getElementByXpath("//option[@value='search-alias=computers-intl-ship']");
    }

    public WebElement getFiltreHp(){
        return getElementByXpath("//span[text()='Roku']");
    }

    public WebElement getFiltreGermani(){
        return getElementByXpath("//span[text()='German']");
    }

    public List<WebElement> getListProduct(){
        return getElementsByXpath("//span[@class='a-size-base-plus a-color-base a-text-normal']");
    }

    public List<WebElement> getListFiltreGermani(){
        return getElementsByXpath("//span[contains(text(),'German Edition')]");
    }
}
