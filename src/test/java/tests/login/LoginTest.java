package tests.login;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void checkIsSuccessfulLogin(){

        basePage.open("https://www.saucedemo.com");
        swagLabsHomePage
                .getUsernameAndPassword()
                .clickLogin();

        swagLabsListingPage
                .checkCountCards();
    }
}
