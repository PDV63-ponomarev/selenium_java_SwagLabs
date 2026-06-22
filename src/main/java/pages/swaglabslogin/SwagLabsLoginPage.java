package pages.swaglabslogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class SwagLabsLoginPage extends BasePage {

    public SwagLabsLoginPage(WebDriver driver) {
        super(driver);
    }

    By str_login = By.xpath("//*[@id='user-name']");
    By str_password = By.xpath("//*[@id='password']");
    By button = By.xpath("//*[@id='login-button']");


    public SwagLabsLoginPage getUsernameAndPassword(String username, String password){
        driver.findElement(str_login).click();
        driver.findElement(str_login).sendKeys(username);

        driver.findElement(str_password).click();
        driver.findElement(str_password).sendKeys(password);

        return this;
    }

    public SwagLabsLoginPage clickLogin(){
        driver.findElement(button).click();
        return this;
    }



}
