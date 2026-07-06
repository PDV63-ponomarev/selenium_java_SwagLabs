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

    private final By item = By.xpath("//*[@class='cart_item']");
    private final By cart = By.xpath("//*[@class='shopping_cart_link']");


    public SwagLabsCart openCart(){

        waitElementVisible(driver.findElement(cart));
        driver.findElement(cart).click();

        return this;
    };

    public SwagLabsCart checkEmptyCard(){
        int count = driver.findElements(item).size();
        Assert.assertEquals(count, 0, "Корзина не пустая");
        return this;
    };

    public SwagLabsCart checkNotEmptyCard(){

        return this;
    };
}
