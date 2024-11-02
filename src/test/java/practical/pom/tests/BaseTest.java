package practical.pom.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import practical.pom.utils.BrowserFactory;

public class BaseTest {

//    protected WebDriver driver;

    protected BrowserFactory browserFactory = BrowserFactory.getBrowserFactory();

//    @BeforeTest
//    public void setUp(){
//        driver = WebDriverManager.chromedriver().create();
//        driver.manage().window().maximize();
//
//    }

    @BeforeMethod
    public void setUp(){

//        driver = WebDriverManager.chromedriver().create();
//        driver.manage().window().maximize();

    }

//    @AfterTest
//    public void quitBrowser(){
//        driver.quit();
//    }

    @AfterMethod
    public void quitBrowser(){
//        driver.quit();
        browserFactory.quitDriver();
    }
}
