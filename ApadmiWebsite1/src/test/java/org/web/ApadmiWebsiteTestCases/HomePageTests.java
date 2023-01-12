package org.web.ApadmiWebsiteTestCases;

import base.ApadmiWebsitePlus;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends ApadmiWebsitePlus {

        @Test(priority = 1)

                public void verifyPageTitleTest() {

            String title = driver.getTitle();
            System.out.println("the page title is: "+ title);

            Assert.assertEquals(title, "APADMI");
        }

        @Test(priority = 2)

        public void verifyApadmiLogo() {

            boolean image = driver.findElement(By.xpath("//*[@id=\"__next\"]/nav/div[1]/a/div/img")).isDisplayed();
            Assert.assertTrue(image);
        }

        @Test(priority = 3)

        public void verifyServicesTitle() {

            boolean Service = driver.findElement(By.xpath("//*[@id=\"__next\"]/nav/div[1]/ul/li[1]/span/a")).isDisplayed();
            Assert.assertTrue(Service);
        }

    }
