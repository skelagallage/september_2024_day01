package practical.pom.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();

    }

    @AfterTest
    public void quitBrowser(){
        driver.quit();
    }
}
