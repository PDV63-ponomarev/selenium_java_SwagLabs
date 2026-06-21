package tests.base;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;
import comman.CommonAction;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.listing.SwagLabsListingPage;
import pages.swaglabshome.SwagLabsHomePage;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected SwagLabsHomePage swagLabsHomePage = new SwagLabsHomePage(driver);
    protected SwagLabsListingPage swagLabsListingPage = new SwagLabsListingPage(driver);
}
