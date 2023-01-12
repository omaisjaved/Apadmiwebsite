package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.*;

import java.time.Duration;

public class ApadmiWebsitePlus {

    public static WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .withMessage("User defined Timed out after 30 seconds")
                .ignoring(NoSuchElementException.class);
        String page_url = "https://www.apadmi.com/";
        driver.get(page_url);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    /*@BeforeSuite
    public void launchBrowser() {
        WebDriverManager.chromedriver().setup();

    }*/

    /*@BeforeTest
    public void launchApplication() {
        String page_url = "https://www.apadmi.com/";
        driver.get(page_url);
        driver.manage().window().maximize();
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .withMessage("User defined Timed out after 30 seconds")
                .ignoring(NoSuchElementException.class);
    }*/

        //@AfterTest

    /*@AfterSuite
    public void tearDown() {
        driver.quit();
    }*/
    }
}
