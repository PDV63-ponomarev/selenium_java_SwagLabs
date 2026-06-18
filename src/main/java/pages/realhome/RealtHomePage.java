package pages.realhome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RealtHomePage extends BasePage {

    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    By login = By.xpath("//*[@id='user-name']");
    By password = By.xpath("//*[@id='password']");
    By button = By.xpath("//*[@id='login-button']");


}
