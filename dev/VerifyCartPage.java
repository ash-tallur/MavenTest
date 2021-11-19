package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class VerifyCartPage {
    WebDriver driver;
    public VerifyCartPage(WebDriver driver){
        this.driver = driver;
    }
    public String verifyTotal(WebDriver driver){

        //getting the text of the total and putting in actual
        String actual = driver.findElement(By.cssSelector("td[class='lead']")).getText();
        return actual;


    }
}
