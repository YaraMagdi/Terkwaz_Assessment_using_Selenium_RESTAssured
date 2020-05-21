package guitests;

import base.BaseTests;
import gui.google.GoogleHomePage;
import gui.google.GoogleSearchResultsPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class GoogleSearchTests extends BaseTests {

    // Declaring The Page Objects that will be used throughout the test class
    private GoogleHomePage googleHomePage;
    private GoogleSearchResultsPage googleSearchResultsPage;

    @Test(description = "TC001 - Search for Query and Assert that the link of the first result matches the expected text")
    public void searchForDataAndAssertTextOfTheThirdResult(){
        googleHomePage = new GoogleHomePage(driver);
        googleHomePage.navigateToGoogle();

        googleSearchResultsPage = googleHomePage.searchFor("selenium webdriver");
        assertTrue(googleSearchResultsPage.getTextForLinksFromSearchResults(4).contains("What is Selenium WebDriver?"), "Contained text within link isn't correct");
    }
}