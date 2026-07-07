package tests.cart;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class CartTest extends BaseTest {

    @Test
    public void checkCartEmpty() {
        basePage.openSwagLabs();
        swagLabsLoginPage.login();
        swagLabsCart.openCart();
        basePage.checkPage("https://www.saucedemo.com/cart.html");
        swagLabsCart.checkEmptyCard();
    }

    @Test
    public void checkCartNotEmpty() {
        basePage.openSwagLabs();
        swagLabsLoginPage.login();
        swagLabsMainPage.clickForAddToCart(1);
        swagLabsCart.openCart();
        basePage.checkPage("https://www.saucedemo.com/cart.html");
        swagLabsCart.checkNotEmptyCart();
    }
}
