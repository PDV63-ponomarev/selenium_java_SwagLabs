package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;

import java.time.Duration;

public class SwagLabsListingPage extends BasePage {

    public SwagLabsListingPage(WebDriver driver) {
        super(driver);
    }


    public SwagLabsListingPage checkMainPage(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));
        return this;
    }


    private final By card = By.xpath("//*[@class='inventory_item']");

    public SwagLabsListingPage checkCountCards(){
        waitElementVisible(driver.findElement(card));

        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, 6);
        return this;
    }






}
