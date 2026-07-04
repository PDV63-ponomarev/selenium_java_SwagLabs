package tests.mainpage;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class MainPageTest extends BaseTest {

    @Test
    public void checkListingPage() {
        basePage.openSwagLabs();
        swagLabsLoginPage.login();

        swagLabsMainPage.checkCountCards();
    }

    @Test
    public void checkItemInCards() {
        basePage.openSwagLabs();
        swagLabsLoginPage.login();

        swagLabsMainPage.checkItemInCards();
    }

    @Test
    public void checkSortAtoZ(){
        basePage.openSwagLabs();
        swagLabsLoginPage.login();

        swagLabsMainSorts
                .sortButton()
                .checkSortCardsAtoZ();
    }

    @Test
    public void checkSortZtoA(){
        basePage.openSwagLabs();
        swagLabsLoginPage.login();

        swagLabsMainSorts
                .sortButton()
                .checkSortCardsZtoA();
    }

    @Test
    public void checkSortPriceLowToHigh(){
        basePage.openSwagLabs();
        swagLabsLoginPage.login();

        swagLabsMainSorts
                .sortButton()
                .checkSortCardsPriceLowToHigh();
    }

    @Test
    public void checkSortPriceHighToLow(){
        basePage.openSwagLabs();
        swagLabsLoginPage.login();

        swagLabsMainSorts
                .sortButton()
                .checkSortCardsPriceHighToLow();
    }

}
