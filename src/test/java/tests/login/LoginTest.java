package tests.login;

import tests.base.BaseTest;

public class LoginTest extends BaseTest {

    public void checkIsSuccessfulLogin(){

        basePage.open("https://www.saucedemo.com");

        realtHomePage
                .getUsernameAndPassword()
                .clickLogin();
    }
}
