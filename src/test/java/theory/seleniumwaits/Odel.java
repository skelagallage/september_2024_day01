package theory.seleniumwaits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.time.Duration;

public class Odel {

    WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void initBrowser(@Optional("chrome") String browser){
        switch (browser){
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
//                chromeOptions.addArguments("--headless=new");
                driver = WebDriverManager.chromedriver().capabilities(chromeOptions).create();
                break;
            case "firefox":
                driver = WebDriverManager.firefoxdriver().create();
                break;
            case "edge":
                driver = WebDriverManager.edgedriver().create();
                break;
            default:
                throw new RuntimeException("Unidentified browser type!");
        }

        /**
         * Below implementation is for page load timeout.
         */
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        /**
         * Below implementation is for implicitly wait.
         */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void searchHat() throws InterruptedException {
        driver.get("https://odel.lk/home");
        new Actions(driver).moveToElement(driver.findElement
                (By.xpath("//div/a[text()='WOMEN']"))).perform();
//        Thread.sleep(4000);
        new Actions(driver).moveToElement(driver.findElement
                (By.xpath("//a[text()='WOMEN']/parent::div//a[text()='Accessories']/following-sibling::ul//a[text()='Caps & Hats']"))).perform();
//        Thread.sleep(4000);
        driver.findElement
                (By.xpath("//a[text()='WOMEN']/parent::div//a[text()='Accessories']/following-sibling::ul//a[text()='Caps & Hats']")).click();
        driver.findElement(By.xpath("//span[text()='Brands']")).click();
//        Thread.sleep(4000);
        long sTime = System.currentTimeMillis();
        /**
         * Below implementation is for
         * Explicit wait
         */
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
//        wait.until(ExpectedConditions.presenceOfElementLocated(
//                By.xpath("//label[text()='ODEL']/parent::div")));

        /**
         * Below implementation is for
         * fluent wait
         */
//        Wait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(4))
//                .pollingEvery(Duration.ofMillis(500))
//                .ignoring(NoSuchElementException.class);
//        wait.until(ExpectedConditions.presenceOfElementLocated(
//                By.xpath("//label[text()='ODEL']/parent::div")));
        System.out.println("-------- " + (System.currentTimeMillis() - sTime));
        driver.findElement(
                By.xpath("//label[text()='ODEL']/parent::div")).click();
        Thread.sleep(4000);
    }

    @AfterTest
    public void quitBrowser(){
        driver.quit();
    }
}
