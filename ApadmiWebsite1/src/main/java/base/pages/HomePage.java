package base.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public HomePage goToHome() throws InterruptedException {

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .withMessage("User defined Timed out after 30 seconds")
                .ignoring(NoSuchElementException.class);

        //Locator for the cookies
         By C1 = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");

        //Method to click on the cookies
        driver.findElement(C1).click();

        System.out.println(driver.findElement(By.xpath("//*[@id=__next]/nav/div[1]/a/div/img")));

        System.out.println(driver.getPageSource());

        return null;
    }
}
