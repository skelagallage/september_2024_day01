package practical.pom.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import practical.pom.utils.BrowserFactory;

public class BaseTest {

    protected WebDriver driver;

    protected BrowserFactory browserFactory = BrowserFactory.getBrowserFactory();

    protected ExtentReports extent = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter("reports/Spark.html");

//    @BeforeTest
//    public void setUp(){
//        driver = WebDriverManager.chromedriver().create();
//        driver.manage().window().maximize();
//
//    }

    @BeforeTest
    public void initReport(){
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("Ebay Search");
    }

    @AfterTest
    public void flushReport(){
        extent.flush();
    }

    @BeforeMethod
    public void setUp(){

//        driver = WebDriverManager.chromedriver().create();
//        driver.manage().window().maximize();
        driver = browserFactory.getDriver();
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
