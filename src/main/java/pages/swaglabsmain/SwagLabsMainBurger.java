package pages.swaglabsmain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class SwagLabsMainBurger extends BasePage {
    public SwagLabsMainBurger(WebDriver driver) {
        super(driver);
    }

    By burger = By.xpath("//*[@id='react-burger-menu-btn']");
    By burger_logout = By.xpath("//*[@id='logout_sidebar_link']");

    public SwagLabsMainBurger openburger(){
        waitElementVisible(driver.findElement(burger));
        driver.findElement(burger).click();
        return this;
    }

    public SwagLabsMainBurger clicklogut() {
        waitElementVisible(driver.findElement(burger_logout));
        driver.findElement(burger_logout).click();
        return this;

    }

}
