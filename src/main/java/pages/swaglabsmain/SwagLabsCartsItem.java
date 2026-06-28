package pages.swaglabsmain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class SwagLabsCartsItem extends BasePage {
    public SwagLabsCartsItem(WebDriver driver) {
        super(driver);
    }

    private final By name_item = By.xpath("//*[@class='inventory_details_name']");
    private final By image_item = By.xpath("//*[@class='inventory_details_img']");
    private final By desc_item = By.xpath("//*[@class='inventory_details_desc']");
    private final By price_item = By.xpath("//*[@class='inventory_details_price']");

    private final By add_button = By.xpath("//*[@id='add-to-cart']");



}
