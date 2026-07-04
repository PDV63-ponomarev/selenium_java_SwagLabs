package tests.card;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class CardTest extends BaseTest {

    @Test
    public void checkItemsForCard() {
        basePage.openSwagLabs();
        swagLabsLoginPage.login();
        swagLabsMainPage.clickForCard(1);
        basePage.checkPagePartly("https://www.saucedemo.com/inventory-item.html");
        swagLabsCardsItem.checkVisibleItems();

    }


}
