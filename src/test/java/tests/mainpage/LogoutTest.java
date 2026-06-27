package tests.mainpage;

import comman.CommonAction;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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

        basePage.checkPage("https://www.saucedemo.com/");

    }

}
