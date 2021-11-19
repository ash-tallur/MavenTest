package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    //parameterised constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void login(String userEmail, String password){

        driver.findElement(By.id("spree_user_email")).sendKeys(userEmail);
        driver.findElement(By.id("spree_user_password")).sendKeys(password);
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        driver.findElement(By.cssSelector("input[value='Login']")).click();

    }



}
