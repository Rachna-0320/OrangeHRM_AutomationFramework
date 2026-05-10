package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOrangeHRM {

    @Test
    public void verifyOrangeHRMTitle() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://orangehrm.com/");
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        Assert.assertTrue(actualTitle.contains("OrangeHRM"));
        driver.quit();

    }
}



