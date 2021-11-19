package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategorySelectPage {
    WebDriver driver;
    public CategorySelectPage(WebDriver driver){
        this.driver = driver;
    }
    public void selectCategory(){
        driver.findElement(By.linkText("Bags")).click();
    }

    public void selectProduct(){
        driver.findElement(By.cssSelector("img[alt='Spree Tote']")).click();
    }
}
