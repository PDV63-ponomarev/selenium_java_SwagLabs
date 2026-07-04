package tests.base;

import comman.CommonAction;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.base.BasePage;
import pages.card.SwagLabsCardsItem;
import pages.swaglabsmain.SwagLabsMainPage;
import pages.swaglabslogin.SwagLabsLoginErrorMessage;
import pages.swaglabslogin.SwagLabsLoginPage;
import pages.swaglabsmain.SwagLabsMainBurger;
import pages.swaglabsmain.SwagLabsMainSorts;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected SwagLabsLoginPage swagLabsLoginPage;
    protected SwagLabsMainPage swagLabsMainPage;
    protected SwagLabsLoginErrorMessage swagLabsLoginErrorMessage;
    protected SwagLabsMainBurger swagLabsMainBurger;
    protected SwagLabsMainSorts swagLabsMainSorts;
    protected SwagLabsCardsItem swagLabsCardsItem;

    @BeforeMethod
    public void setUp() {
        driver = CommonAction.createDriver();
        basePage = new BasePage(driver);
        swagLabsLoginPage = new SwagLabsLoginPage(driver);
        swagLabsMainPage = new SwagLabsMainPage(driver);
        swagLabsLoginErrorMessage = new SwagLabsLoginErrorMessage(driver);
        swagLabsMainBurger = new SwagLabsMainBurger(driver);
        swagLabsMainSorts = new SwagLabsMainSorts(driver);
        swagLabsCardsItem = new SwagLabsCardsItem(driver);
    }

    @AfterMethod
    public void tearDown() {
        CommonAction.quitDriver();
    }
}