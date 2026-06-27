package tests.base;

import comman.CommonAction;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.base.BasePage;
import pages.listing.SwagLabsListingPage;
import pages.swaglabslogin.SwagLabsLoginErrorMessage;
import pages.swaglabslogin.SwagLabsLoginPage;
import pages.swaglabsmain.SwagLabsMainBurger;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected SwagLabsLoginPage swagLabsLoginPage;
    protected SwagLabsListingPage swagLabsListingPage;
    protected SwagLabsLoginErrorMessage swagLabsLoginErrorMessage;
    protected SwagLabsMainBurger swagLabsMainBurger;

    @BeforeMethod
    public void setUp() {
        driver = CommonAction.createDriver();
        basePage = new BasePage(driver);
        swagLabsLoginPage = new SwagLabsLoginPage(driver);
        swagLabsListingPage = new SwagLabsListingPage(driver);
        swagLabsLoginErrorMessage = new SwagLabsLoginErrorMessage(driver);
        swagLabsMainBurger = new SwagLabsMainBurger(driver);
    }

    @AfterMethod
    public void tearDown() {
        CommonAction.quitDriver();
    }
}