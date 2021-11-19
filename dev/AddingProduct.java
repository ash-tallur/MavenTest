package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddingProduct {
    WebDriver driver;
    public AddingProduct(WebDriver driver){
        this.driver = driver;
    }
    public void addProductToCart(String quantity){

        driver.findElement(By.id("quantity")).clear();
        driver.findElement(By.id("quantity")).sendKeys(quantity);

        //here we are clicking on add to cart after sending the quantity value
        driver.findElement(By.id("add-to-cart-button")).click();
    }
}
