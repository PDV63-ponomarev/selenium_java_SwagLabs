package tests.login;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class LoginTest extends BaseTest {

    String standard_user = "standard_user";
    String password = "secret_sauce";
    String lock_user = "locked_out_user";


    @Test
    public void checkIsSuccessfulLogin(){

        basePage.open("https://www.saucedemo.com");
        swagLabsLoginPage
                .getUsernameAndPassword(standard_user, password)
                .clickLogin();

        swagLabsListingPage.checkMainPage();
    }

    @Test
    public void checkIsLockedLogin(){

        basePage.open("https://www.saucedemo.com");
        swagLabsLoginPage
                .getUsernameAndPassword(lock_user, password)
                .clickLogin();

        swagLabsLoginErrorMessage
                .checkLockedUser();
    }

    @Test
    public void checkIsEmptyLogin(){

        basePage.open("https://www.saucedemo.com");
        swagLabsLoginPage
                .getUsernameAndPassword("", password)
                .clickLogin();

        swagLabsLoginErrorMessage
                .checkEmptyUser();
    }

    @Test
    public void checkIsEmptyPassword(){

        basePage.open("https://www.saucedemo.com");
        swagLabsLoginPage
                .getUsernameAndPassword(lock_user, "")
                .clickLogin();

        swagLabsLoginErrorMessage
                .checkEmptyPassword();
    }

    @Test
    public void checkIsUnCorrectLogin(){

        basePage.open("https://www.saucedemo.com");
        swagLabsLoginPage
                .getUsernameAndPassword("uncorrect", password)
                .clickLogin();

        swagLabsLoginErrorMessage
                .checkUncorrectData();
    }

    @Test
    public void checkIsUnCorrectPassword(){

        basePage.open("https://www.saucedemo.com");
        swagLabsLoginPage
                .getUsernameAndPassword(standard_user, "password")
                .clickLogin();

        swagLabsLoginErrorMessage
                .checkUncorrectData();
    }

}
