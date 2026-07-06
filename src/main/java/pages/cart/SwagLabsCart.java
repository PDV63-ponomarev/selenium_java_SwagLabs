package pages.cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;

public class SwagLabsCart extends BasePage {
    public SwagLabsCart(WebDriver driver) {
        super(driver);
    }

//    private final By item = driver.findElement(By.xpath("//*[@class='cart_item']"));
    private final By cart = By.xpath("//*[@class='shopping_cart_link']");



    public SwagLabsCart openCart(){

        waitElementVisible(driver.findElement(cart));
        driver.findElement(cart).click();

        return this;
    };

//    public SwagLabsCart checkEmptyCard(){
//        Assert.assertFalse(item.isDisplayed());
//        return this;
//    };

    public SwagLabsCart checkNotEmptyCard(){

        return this;
    };
}
