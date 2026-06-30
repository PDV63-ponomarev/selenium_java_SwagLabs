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
    public void checkSortAtoZ(){
        basePage.open(page);
        swagLabsLoginPage.login();

        swagLabsMainPage
                .sortButton()
                .checkSortCardsAtoZ();
    }

    @Test
    public void checkSortZtoA(){
        basePage.open(page);
        swagLabsLoginPage.login();

        swagLabsMainPage
                .sortButton()
                .checkSortCardsZtoA();
    }

    @Test
    public void checkSortPriceLowToHigh(){
        basePage.open(page);
        swagLabsLoginPage.login();

        swagLabsMainPage
                .sortButton()
                .checkSortCardsPriceLowToHigh();
    }

    @Test
    public void checkSortPriceHighToLow(){
        basePage.open(page);
        swagLabsLoginPage.login();

        swagLabsMainPage
                .sortButton()
                .checkSortCardsPriceHighToLow();
    }

}
