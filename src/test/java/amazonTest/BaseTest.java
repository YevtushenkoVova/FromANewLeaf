package amazonTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaDriverInfo;
import org.openqa.selenium.opera.OperaDriverService;
import org.testng.annotations.*;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void initialization(String browser) {
        if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        } else if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }
    }

    //@BeforeMethod
    public void setUp() {
       initialization("chrome");
    }

    @AfterMethod
    public void exit() {
        driver.quit();
    }

    public void openAmazon() {
        driver.get("https://www.amazon.com");
    }

    public void mouseoverElement(WebElement loc) {
        Actions actions = new Actions(driver);
        actions.moveToElement(loc).perform();
    }
}
