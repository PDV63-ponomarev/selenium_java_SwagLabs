package pages.swaglabsmain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import java.util.ArrayList;
import java.util.List;

public class SwagLabsMainSorts extends BasePage {

    public SwagLabsMainSorts(WebDriver driver) {
        super(driver);
    }

    private final By item = By.xpath("//*[@class='inventory_item']");
    private final By sort = By.xpath("//*[@class='product_sort_container']");
    private final By name_item = By.xpath("//*[@class='inventory_item_name ']");
    private final By price_item = By.xpath("//*[@class='inventory_item_price']");

    public SwagLabsMainSorts sortButton(){
        waitElementVisible(driver.findElement(sort));
        driver.findElement(sort).click();
        return this;
    }

    public SwagLabsMainSorts checkSortCardsAtoZ() {

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

    public SwagLabsMainSorts checkSortCardsZtoA() {

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


    public SwagLabsMainSorts checkSortCardsPriceLowToHigh() {

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

    public SwagLabsMainSorts checkSortCardsPriceHighToLow() {

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


