package pages.card;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class SwagLabsCardsItem extends BasePage {
    public SwagLabsCardsItem(WebDriver driver) {
        super(driver);
    }

    private final By item = By.xpath("//*[@class='inventory_details']");
    private final By name_item = By.xpath("//*[contains(@class, 'inventory_details_name')]");
    private final By image_item = By.xpath("//*[@class='inventory_details_img']");
    private final By desc_item = By.xpath("//*[contains(@class, 'inventory_details_desc')]");
    private final By price_item = By.xpath("//*[@class='inventory_details_price']");
    private final By add_button = By.xpath("//*[@id='add-to-cart']");

    // проверка видимости содержимого карточки товара
    public SwagLabsCardsItem checkVisibleItems(){

        waitElementVisible(driver.findElement(item));
        waitElementVisible(driver.findElement(name_item));
        waitElementVisible(driver.findElement(image_item));
        waitElementVisible(driver.findElement(desc_item));
        waitElementVisible(driver.findElement(price_item));
        waitElementVisible(driver.findElement(add_button));

        return this;
    }

    //нажатие на кнопку добавить в корзину
    public SwagLabsCardsItem clickAddCart(){
        driver.findElement(add_button).click();
        return this;
    }
}
