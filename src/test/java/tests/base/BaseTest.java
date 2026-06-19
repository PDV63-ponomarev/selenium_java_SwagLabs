package tests.base;

import comman.CommonAction;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.realhome.RealtHomePage;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected RealtHomePage realtHomePage = new RealtHomePage(driver);
}
