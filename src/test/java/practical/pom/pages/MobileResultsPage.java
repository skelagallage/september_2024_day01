package practical.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MobileResultsPage extends BasePage{

    @FindBy(xpath = "//span[text()='Apple' and @class]")
    private WebElement appleCheckBox;

    public MobileResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAppleCheckBox(){
        appleCheckBox.click();
    }

    public void scroll(int x, int y){
//        Actions actions = new Actions(driver);
        new Actions(driver).scrollByAmount(x, y).perform();
    }
}
