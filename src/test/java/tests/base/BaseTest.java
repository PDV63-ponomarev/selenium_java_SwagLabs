package tests.base;

import comman.CommonAction;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.listing.SwagLabsListingPage;
import pages.swaglabslogin.SwagLabsLoginErrorMessage;
import pages.swaglabslogin.SwagLabsLoginPage;
import pages.swaglabsmain.SwagLabsMainBurger;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected SwagLabsLoginPage swagLabsLoginPage = new SwagLabsLoginPage(driver);
    protected SwagLabsListingPage swagLabsListingPage = new SwagLabsListingPage(driver);
    protected SwagLabsLoginErrorMessage swagLabsLoginErrorMessage = new SwagLabsLoginErrorMessage(driver);
    protected SwagLabsMainBurger swagLabsMainBurger = new SwagLabsMainBurger(driver);

}
