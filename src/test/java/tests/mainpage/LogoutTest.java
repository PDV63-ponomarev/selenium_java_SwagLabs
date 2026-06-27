package tests.mainpage;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class LogoutTest extends BaseTest {

    String page = "https://www.saucedemo.com";
    String standard_user = "standard_user";
    String password = "secret_sauce";

    @Test
    public void checkLogout() {

        basePage.open(page);
        swagLabsLoginPage
                .getUsernameAndPassword(standard_user, password)
                .clickLogin();

        swagLabsMainBurger
                .openburger()
                .clicklogut();

        basePage.checkPage(page);

    }


}
