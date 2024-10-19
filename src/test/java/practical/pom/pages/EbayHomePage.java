package practical.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EbayHomePage extends BasePage{

    @FindBy(xpath = "//input[@id='gh-ac']")
    private WebElement searchField;

    @FindBy(id = "gh-cat")
    private WebElement selectCategoryBox;

    @FindBy(id = "gh-btn")
    private WebElement searchButton;

    public EbayHomePage(WebDriver driver) {
        super(driver);
    }

    public void typeOnSearchField(String value){
        searchField.clear();
        searchField.sendKeys(value);
    }

    public void selectOptionOnCategoryBox(String visibleText){
        new Select(selectCategoryBox).selectByVisibleText(visibleText);
    }

    public MobileResultsPage clickOnSearchButton(){
        searchButton.click();
        return PageFactory.initElements(driver, MobileResultsPage.class);
    }
}
