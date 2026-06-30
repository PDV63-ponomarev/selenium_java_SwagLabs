package tests.mainpage;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class CartsTest extends BaseTest {

    String page = "https://www.saucedemo.com";

    @Test
    public void checkListingPage() {
        basePage.open(page);
        swagLabsLoginPage.login();

        swagLabsMainPage.checkCountCards();
    }

    @Test
    public void checkItemInCards() {
        basePage.open(page);
        swagLabsLoginPage.login();

        swagLabsMainPage.checkItemInCards();

    }

    @Test
    public void checkSortCardsAtoZ(){
        basePage.open(page);
        swagLabsLoginPage.login();

        swagLabsMainPage
                .sortButton()
                .checkSortCardsAtoZ();
    }
}
