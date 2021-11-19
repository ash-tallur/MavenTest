package org.vapasi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseClassTest {

    WebDriver driver;
    @BeforeMethod
    public void openingBrowser(){
        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
        driver = new ChromeDriver();

        //Asking to browser to go for this particular website
        driver.get("https://spree-vapasi-prod.herokuapp.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closingBroswer(){

        driver.findElement(By.cssSelector("input[value=\"Empty Cart\"]")).click();
        //driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}
