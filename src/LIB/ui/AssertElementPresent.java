package LIB.ui;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AssertElementPresent extends MainPageObject {

    public AssertElementPresent(AppiumDriver driver)
    {
        super(driver);
    }

    private static final String
            SEARCH_INIT_ELEMENT = "//*[contains(@text,'Search Wikipedia')]",
            SEARCH_INPUT = "//*[contains(@text,'Search…')]",
            PAGE_LIST_TITLE = "//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='Sovereign state in Eastern Europe and Northern Asia since 1991']",
            SEARCH_RESULT_LOCATOR = "//*[@resource-id='org.wikipedia:id/view_page_title_text']";

    public void initSearchInput()
        {
            this.waitForElementAndClick(By.xpath(SEARCH_INIT_ELEMENT),  "Cannot find 'Search Wikipedia' input", 5);
        }

        public void typeSearchLine(String word_search)
        {
            this.waitForElementAndSendKeys(By.xpath(SEARCH_INPUT), word_search, "Cannot find search input", 5);
        }

        public void pageListTitle()
        {
            this.waitForElementAndClick(By.xpath(PAGE_LIST_TITLE), "Cannot find Search Wikipedia input", 5);
        }

        public void resultSearchLocator()
        {
            waitForElementPresent(By.xpath(SEARCH_RESULT_LOCATOR), "Not find result > 0", 5);
        }

        public void assertElement()
        {
            int amount_of_search_results = assertElementPresent(
                    By.xpath(SEARCH_RESULT_LOCATOR)
            );

            Assert.assertTrue(
                    "We found to few results",
                    amount_of_search_results >= 1
            );
        }


}
