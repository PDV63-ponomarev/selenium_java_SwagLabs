package pages.swaglabslogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;


public class SwagLabsLoginErrorMessage extends BasePage {
    public SwagLabsLoginErrorMessage(WebDriver driver) {
        super(driver);
    }

    private final By locator_error_message = By.xpath("//*[@data-test='error']");

    public SwagLabsLoginErrorMessage checkLockedUser(){
        waitElementVisible(driver.findElement(locator_error_message));

        String error_message = driver.findElement(locator_error_message).getText();

        Assert.assertTrue(error_message.contains("locked out"),
                "Expected error message to contain 'locked out', but got: " + error_message);

        return this;
    }

    public SwagLabsLoginErrorMessage checkEmptyUser(){
        waitElementVisible(driver.findElement(locator_error_message));

        String error_message = driver.findElement(locator_error_message).getText();

        Assert.assertTrue(error_message.contains("Username is required"),
                "Expected error message to contain 'required', but got: " + error_message);

        return this;
    }
    
    public SwagLabsLoginErrorMessage checkEmptyPassword(){
        waitElementVisible(driver.findElement(locator_error_message));

        String error_message = driver.findElement(locator_error_message).getText();

        Assert.assertTrue(error_message.contains("Password is required"),
                "Expected error message to contain 'Password is required', but got: " + error_message);

        return this;
    }

    public SwagLabsLoginErrorMessage checkUncorrectData(){
        waitElementVisible(driver.findElement(locator_error_message));

        String error_message = driver.findElement(locator_error_message).getText();

        Assert.assertTrue(error_message.contains("Username and password do not match any user in this service"),
                "Expected error message to contain 'Username and password do not match any user in this service', but got: " + error_message);

        return this;
    }

}
