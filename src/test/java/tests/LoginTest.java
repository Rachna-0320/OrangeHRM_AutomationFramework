package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

    public class LoginTest extends BaseTest {
        LoginPage loginPage;

        @BeforeMethod
        public void startSetup() {
            setup();
            loginPage = new LoginPage(driver);
        }

        @Test
        public void verifyValidLogin() {
            By username = By.xpath("//input[@placeholder='Username']");
            By password = By.xpath("//input[@placeholder='Password']");
            By loginButton = By.xpath("//button[@type='submit']");
        }

        @AfterMethod
        public void closeSetup() {
            tearDown();
        }
    }

