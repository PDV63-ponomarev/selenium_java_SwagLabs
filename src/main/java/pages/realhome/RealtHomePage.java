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


    public RealtHomePage getUsernameAndPassword(){
        driver.findElement(login).click();
        driver.findElement(login).sendKeys("standard_user");

        driver.findElement(password).click();
        driver.findElement(password).sendKeys("secret_sauce");

        driver.findElement(button).click();

        return this;
    }

    public RealtHomePage clickLogin(){
        driver.findElement(button).click();
        return this;
    }
}
