package tests.cart;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class CartTest extends BaseTest {

    @Test
    public void checkCartEmpty() {
        basePage.openSwagLabs();
        swagLabsLoginPage.login();
        swagLabsCart.openCart();
        basePage.checkPage("https://www.saucedemo.com/inventory.html");
        swagLabsCart.checkEmptyCard();
    }
}
