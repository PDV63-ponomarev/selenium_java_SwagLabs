package pages.swaglabsmain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;

import java.time.Duration;
import java.util.List;

public class SwagLabsMainPage extends BasePage {

    public SwagLabsMainPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//*[@class='inventory_item']");

    public SwagLabsMainPage checkCountCards(){
        waitElementVisible(driver.findElement(card));

        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, 6);
        return this;
    }

    private final By name_item = By.xpath("//*[@class='inventory_item_name ']");
    private final By image_item = By.xpath("//*[@class='inventory_item_img']");
    private final By desc_item = By.xpath("//*[@class='inventory_item_desc']");
    private final By price_item = By.xpath("//*[@class='inventory_item_price']");
    private final By add_item = By.xpath("//*[@class='pricebar']/button");


    public SwagLabsMainPage checkItemInCards () {
        // Находим все карточки товаров
        List<WebElement> cards = driver.findElements(card);

        // Цикл проверки содержания всех карточек
        for (WebElement cardElement : cards) {
            cardElement.findElement(name_item);
            cardElement.findElement(image_item);
            cardElement.findElement(desc_item);
            cardElement.findElement(price_item);
            cardElement.findElement(add_item);
        }
        return this;
    }
}
