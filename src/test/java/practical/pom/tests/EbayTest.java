package practical.pom.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import practical.pom.pages.BasePage;
import practical.pom.pages.DressResultsPage;
import practical.pom.pages.EbayHomePage;
import practical.pom.pages.MobileResultsPage;

public class EbayTest extends BaseTest {

    @Test
    public void searchMobilePhoneTC() throws InterruptedException {
        BasePage basePage = PageFactory.initElements(browserFactory.getDriver(), BasePage.class);
        EbayHomePage ebayHomePage = basePage.initApp();
        ebayHomePage.typeOnSearchField("mobile phone");
        ebayHomePage.selectOptionOnCategoryBox("Cell Phones & Accessories");
        MobileResultsPage mobileResultsPage = ebayHomePage.clickOnSearchButton();
        mobileResultsPage.scroll(0, 200);
        Thread.sleep(3000);
        mobileResultsPage.clickOnAppleCheckBox();
        Thread.sleep(5000);
    }

    @Test
    public void searchDressesTC() throws InterruptedException {
        BasePage basePage = PageFactory.initElements(browserFactory.getDriver(), BasePage.class);
        EbayHomePage ebayHomePage = basePage.initApp();
        ebayHomePage.typeOnSearchField("dress");
        ebayHomePage.selectOptionOnCategoryBox("Clothing, Shoes & Accessories");
        DressResultsPage dressResultsPage = ebayHomePage.clickOnSearchButton();
        dressResultsPage.scroll(0, 200);
        Thread.sleep(3000);
        dressResultsPage.clickOnKneeLengthCheckBox();
        Thread.sleep(5000);
    }
}
