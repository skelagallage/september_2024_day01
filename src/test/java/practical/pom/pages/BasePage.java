package practical.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public EbayHomePage initApp(){
        driver.get("https://www.ebay.com/");
        return PageFactory.initElements(driver, EbayHomePage.class);
    }

    public void scroll(int x, int y){
//        Actions actions = new Actions(driver);
        new Actions(driver).scrollByAmount(x, y).perform();
    }
}
