package tests.mainpage;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class MainPageSortTest extends BaseTest{
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
