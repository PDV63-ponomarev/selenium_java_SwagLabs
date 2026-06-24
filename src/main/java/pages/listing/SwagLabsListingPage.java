package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class SwagLabsListingPage extends BasePage {

    public SwagLabsListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//*[@class='inventory_item']");

    private final By locator_error_message = By.xpath("//*[@data-test='error']");

    public SwagLabsListingPage checkCountCards(){
        waitElementVisible(driver.findElement(card));

        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, 6);
        return this;
    }

    public SwagLabsListingPage checkLockedUser(){
        waitElementVisible(driver.findElement(locator_error_message));

        String error_message = driver.findElement(locator_error_message).getText();

        Assert.assertTrue(error_message.contains("locked out"),
                "Expected error message to contain 'locked out', but got: " + error_message);

        return this;
    }



}
