package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;
import pages.swaglabshome.SwagLabsHomePage;

public class SwagLabsListingPage extends BasePage {

    public SwagLabsListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//*[@class='inventory_item']");

    public SwagLabsListingPage checkCountCards(){
        waitElementVisible(driver.findElement(card));

        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, 6);
        return this;
    }

}
