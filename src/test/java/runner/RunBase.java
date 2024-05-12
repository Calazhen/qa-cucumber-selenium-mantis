package runner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class RunBase {

    static WebDriver driver;

    public enum Browser {CHROME, FIREFOX}

    public static WebDriver getDriver() {
        if (driver == null) {
            return getDriver(Browser.FIREFOX);
        } else {
            return driver;
        }
    }

    public static WebDriver getDriver(Browser browser) {
        if (driver != null) {
            driver.quit();
        }

        switch (browser) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
//               chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--remote-allow-origins");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(chromeOptions);
                driver.manage().window().maximize();
                break;

            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/resources/drivers/geckodriver.exe");
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
//                firefoxOptions.addArguments("--headless");
                driver = new FirefoxDriver(firefoxOptions);
                driver.manage().window().maximize();

                break;

            default:
                throw new IllegalArgumentException("Passe um  navegador válido");
        }
        return driver;
    }


}