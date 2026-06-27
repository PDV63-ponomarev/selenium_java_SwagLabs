package tests.login;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class LoginTest extends BaseTest {

    String page = "https://www.saucedemo.com";
    String standard_user = "standard_user";
    String password = "secret_sauce";
    String lock_user = "locked_out_user";


    @Test
    public void checkIsSuccessfulLogin(){

        basePage.open(page);
        swagLabsLoginPage
                .getUsernameAndPassword(standard_user, password)
                .clickLogin();

        basePage.checkPage(page + "/inventory.html");
    }

    @Test
    public void checkIsLockedLogin(){

        basePage.open("https://www.saucedemo.com");
        swagLabsLoginPage
                .getUsernameAndPassword(lock_user, password)
                .clickLogin();

        basePage.checkPage(page);
        swagLabsLoginErrorMessage
                .checkLockedUser();

    }

    @Test
    public void checkIsEmptyLogin(){

        basePage.open("https://www.saucedemo.com");
        swagLabsLoginPage
                .getUsernameAndPassword("", password)
                .clickLogin();

        basePage.checkPage(page);
        swagLabsLoginErrorMessage
                .checkEmptyUser();
    }

    @Test
    public void checkIsEmptyPassword(){

        basePage.open("https://www.saucedemo.com");
        swagLabsLoginPage
                .getUsernameAndPassword(lock_user, "")
                .clickLogin();

        basePage.checkPage(page);
        swagLabsLoginErrorMessage
                .checkEmptyPassword();

    }

    @Test
    public void checkIsUnCorrectLogin(){

        basePage.open("https://www.saucedemo.com");
        swagLabsLoginPage
                .getUsernameAndPassword("uncorrect", password)
                .clickLogin();

        basePage.checkPage(page);
        swagLabsLoginErrorMessage
                .checkUncorrectData();

    }

    @Test
    public void checkIsUnCorrectPassword(){

        basePage.open("https://www.saucedemo.com");
        swagLabsLoginPage
                .getUsernameAndPassword(standard_user, "password")
                .clickLogin();

        basePage.checkPage(page);
        swagLabsLoginErrorMessage
                .checkUncorrectData();
    }

}
