package comman;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static comman.Config.INPLICIT_WAIT;
import static comman.Config.PLATRFORM_AND_BRWOSER;

public class CommonAction {
    private  static WebDriver driver = null;

    private  CommonAction() {
    }

    public  static  WebDriver createDriver(){
        if (driver == null) {
            switch (PLATRFORM_AND_BRWOSER) {
                case "win_chrome":
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                    driver = new ChromeDriver(getChromeOptions());

//                    WebDriverManager.chromedriver().setup();
//                    ChromeOptions options = new ChromeOptions();
//                    driver = new ChromeDriver(getChromeOptions());
                    break;
                default:
                    Assert.fail("Incorrect platform or browser: " + PLATRFORM_AND_BRWOSER);
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(INPLICIT_WAIT));
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
            // Обнуление, чтобы при следующем вызове createDriver() создался новый

        }
    }

    private static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        // Отключаем менеджер паролей Chrome
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.password_manager_leak_detection", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.default_content_setting_values.notifications", 2); // 2 = block
        prefs.put("credentials_enable_service", false);

        options.setExperimentalOption("prefs", prefs);

        // Для работы с современными сайтами
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-dev-shm-usage");

        // Отключаем уведомления
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");

        // Отключаем безопасность (для тестов)
        options.addArguments("--disable-web-security");
        options.addArguments("--disable-features=IsolateOrigins,site-per-process");



        return options;
    }

}