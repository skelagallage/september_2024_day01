package practical.pom.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import practical.pom.pages.BasePage;
import practical.pom.pages.EbayHomePage;
import practical.pom.pages.MobileResultsPage;

public class EbayTest extends BaseTest {

    @Test
    public void searchMobilePhoneTC() throws InterruptedException {
        BasePage basePage = PageFactory.initElements(driver, BasePage.class);
        EbayHomePage ebayHomePage = basePage.initApp();
        ebayHomePage.typeOnSearchField("mobile phone");
        ebayHomePage.selectOptionOnCategoryBox("Cell Phones & Accessories");
        MobileResultsPage mobileResultsPage = ebayHomePage.clickOnSearchButton();
        mobileResultsPage.scroll(0, 200);
        Thread.sleep(3000);
        mobileResultsPage.clickOnAppleCheckBox();
        Thread.sleep(5000);
    }
}
