package practical.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressResultsPage extends BasePage{

    @FindBy(xpath = "//span[text()='Knee Length' and @class]")
    private WebElement kneeLengthCheckBox;

    public DressResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnKneeLengthCheckBox(){
        kneeLengthCheckBox.click();
    }
}
