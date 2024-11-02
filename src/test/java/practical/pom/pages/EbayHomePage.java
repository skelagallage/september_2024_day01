package practical.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EbayHomePage extends BasePage{

    private String searchType;

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
        searchType = visibleText;
        new Select(selectCategoryBox).selectByVisibleText(visibleText);
    }

    public <T> T clickOnSearchButton(){
        searchButton.click();
        if(searchType.equals("Cell Phones & Accessories")){
            return PageFactory.initElements(driver,
                    (Class<T>) MobileResultsPage.class);
        } else if (searchType.equals("Clothing, Shoes & Accessories")) {
            return PageFactory.initElements(driver,
                    (Class<T>) DressResultsPage.class);
        }
        return null;
    }
}
