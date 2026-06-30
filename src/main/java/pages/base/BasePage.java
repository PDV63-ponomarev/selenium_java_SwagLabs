package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static comman.Config.EXPLICIT_WAIT;

public class BasePage {
    protected WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String url){
        driver.get(url);
    }

//    ожидание видимости элемента
    public WebElement waitElementVisible(WebElement element){
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

// проверка текущего URL
    public BasePage checkPage(String page){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, page);
        return this;
    }


}

