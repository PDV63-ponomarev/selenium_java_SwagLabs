package pages.swaglabsmain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;

import java.util.ArrayList;
import java.util.List;

public class SwagLabsMainPage extends BasePage {

    public SwagLabsMainPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//*[@class='inventory_item']");

    private final By item = By.xpath("//*[@class='inventory_item']");
    private final By name_item = By.xpath("//*[@class='inventory_item_name ']");
    private final By image_item = By.xpath("//*[@class='inventory_item_img']");
    private final By desc_item = By.xpath("//*[@class='inventory_item_desc']");
    private final By price_item = By.xpath("//*[@class='inventory_item_price']");
    private final By add_item = By.xpath("//*[@class='pricebar']/button");

//    Подсчет кол-во карточек на странице
    public SwagLabsMainPage checkCountCards(){
        waitElementVisible(driver.findElement(card));

        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, 6);
        return this;
    }

// Проверка содержимого карточек
    public SwagLabsMainPage checkItemInCards() {
        waitElementVisible(driver.findElement(card));

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

    private final By sort = By.xpath("//*[@class='product_sort_container']");


    public SwagLabsMainPage sortButton(){
        waitElementVisible(driver.findElement(sort));
        driver.findElement(sort).click();
        return this;
    }

    public SwagLabsMainPage checkSortCardsAtoZ() {

        driver.findElement(By.xpath("//*[@value='az']")).click();

        // Сбор названий товаров в список
        List<String> nameAZ = new ArrayList<>();
        List<WebElement> inventoryItems = driver.findElements(item);

        // сбор наименований карточек и перенос их в массив
        for (WebElement item : inventoryItems) {
            WebElement titleElement = item.findElement(name_item);
            String title = titleElement.getText().trim();
            nameAZ.add(title);
        }

        // сравнение правильной сортировки
        boolean isAscending = true;
        for (int i = 0; i < nameAZ.size() - 1; i++) {
            if (nameAZ.get(i).compareTo(nameAZ.get(i + 1)) > 0) {
                isAscending = false;
                break;
            }
        }

        assert isAscending : "Список не отсортирован по возрастанию (A-Z)";

        return this;
    }

    public SwagLabsMainPage checkSortCardsZtoA() {

        driver.findElement(By.xpath("//*[@value='za']")).click();

        // Сбор названий товаров в список
        List<String> nameZA = new ArrayList<>();
        List<WebElement> inventoryItems = driver.findElements(item);

        // сбор наименований карточек и перенос их в массив
        for (WebElement item : inventoryItems) {
            WebElement titleElement = item.findElement(name_item);
            String title = titleElement.getText().trim();
            nameZA.add(title);
        }

        // сравнение правильной сортировки
        boolean isAscending = true;
        for (int i = 0; i < nameZA.size() - 1; i++) {
            if (nameZA.get(i).compareTo(nameZA.get(i + 1)) < 0) {
                isAscending = false;
                break;
            }
        }

        assert isAscending : "Список не отсортирован по возрастанию (A-Z)";

        return this;
    }


    public SwagLabsMainPage checkSortCardsPriceLowToHigh() {

        driver.findElement(By.xpath("//*[@value='lohi']")).click();

        // Сбор названий товаров в список
        List<String> priceLowtoHigh = new ArrayList<>();
        List<WebElement> inventoryItems = driver.findElements(item);

        // сбор наименований карточек и перенос их в массив
        for (WebElement item : inventoryItems) {
            WebElement titleElement = item.findElement(price_item);
            String title = titleElement.getText().trim();
            priceLowtoHigh.add(title);
        }

        // сравнение правильной сортировки
        boolean isAscending = true;
        for (int i = 0; i < priceLowtoHigh.size() - 1; i++) {
            if (priceLowtoHigh.get(i).compareTo(priceLowtoHigh.get(i + 1)) < 0) {
                isAscending = false;
                break;
            }
        }

        assert isAscending : "Список не отсортирован по возрастанию (A-Z)";

        return this;
    }

    public SwagLabsMainPage checkSortCardsPriceHighToLow() {

        driver.findElement(By.xpath("//*[@value='hilo']")).click();

        // Сбор названий товаров в список
        List<String> priceHightoLow = new ArrayList<>();
        List<WebElement> inventoryItems = driver.findElements(item);

        // сбор наименований карточек и перенос их в массив
        for (WebElement item : inventoryItems) {
            WebElement titleElement = item.findElement(price_item);
            String title = titleElement.getText().trim();
            priceHightoLow.add(title);
        }

        // сравнение правильной сортировки
        boolean isAscending = true;
        for (int i = 0; i < priceHightoLow.size() - 1; i++) {
            if (priceHightoLow.get(i).compareTo(priceHightoLow.get(i + 1)) > 0) {
                isAscending = false;
                break;
            }
        }

        assert isAscending : "Список не отсортирован по возрастанию (A-Z)";

        return this;
    }
}
