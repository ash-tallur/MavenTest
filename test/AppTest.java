package org.vapasi;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddingProduct;
import pages.CategorySelectPage;
import pages.LoginPage;
import pages.VerifyCartPage;

import java.util.concurrent.TimeUnit;

public class AppTest extends BaseClassTest{

    @Test
    public void assertCart(){

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("helloash@hello.com","123456");

        CategorySelectPage selectCategory = new CategorySelectPage(driver);

        selectCategory.selectCategory();
        selectCategory.selectProduct();

        AddingProduct addProduct = new AddingProduct(driver);
        addProduct.addProductToCart("5");

        VerifyCartPage checkCart = new VerifyCartPage(driver);

        //then checking the actual and expected
        Assert.assertEquals(checkCart.verifyTotal(driver),"$79.95","The total of the products are not matching");

    }

}
