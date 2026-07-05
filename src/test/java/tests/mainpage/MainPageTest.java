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
    public void checkGetItemForCardInMain(){
        basePage.openSwagLabs();
        swagLabsLoginPage.login();

        swagLabsMainPage
                .checkCartLink(false)
                .clickForAddToCart(1)
                .checkCartLink(true);
    }

}
