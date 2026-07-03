package tests.login;

import comman.CommonAction;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class LoginTest extends BaseTest {

    String page = "https://www.saucedemo.com/";
    String standard_user = "standard_user";
    String password = "secret_sauce";
    String lock_user = "locked_out_user";


    @Test
    public void checkIsSuccessfulLogin() {

        basePage.openSwagLabs();
        swagLabsLoginPage
                .login();

        basePage.checkPage(page + "/inventory.html");
    }

    @Test
    public void checkIsLockedLogin() {

        basePage.openSwagLabs();
        swagLabsLoginPage
                .getUsernameAndPassword(lock_user, password)
                .clickLogin();

        basePage.checkPage(page);
        swagLabsLoginErrorMessage
                .checkLockedUser();

    }

    @Test
    public void checkIsEmptyLogin() {

        basePage.openSwagLabs();
        swagLabsLoginPage
                .getUsernameAndPassword("", password)
                .clickLogin();

        basePage.checkPage("https://www.saucedemo.com/");
        swagLabsLoginErrorMessage
                .checkEmptyUser();
    }

    @Test
    public void checkIsEmptyPassword() {

        basePage.openSwagLabs();
        swagLabsLoginPage
                .getUsernameAndPassword(lock_user, "")
                .clickLogin();

        basePage.checkPage("https://www.saucedemo.com/");
        swagLabsLoginErrorMessage
                .checkEmptyPassword();

    }

    @Test
    public void checkIsUnCorrectLogin() {

        basePage.openSwagLabs();
        swagLabsLoginPage
                .getUsernameAndPassword("uncorrect", password)
                .clickLogin();

        basePage.checkPage(page);
        swagLabsLoginErrorMessage
                .checkUncorrectData();

    }

    @Test
    public void checkIsUnCorrectPassword() {

        basePage.openSwagLabs();
        swagLabsLoginPage
                .getUsernameAndPassword(standard_user, "password")
                .clickLogin();

        basePage.checkPage("https://www.saucedemo.com/");
        swagLabsLoginErrorMessage
                .checkUncorrectData();
    }
}
