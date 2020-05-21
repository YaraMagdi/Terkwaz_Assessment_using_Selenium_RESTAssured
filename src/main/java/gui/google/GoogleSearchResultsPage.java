package gui.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchResultsPage {

    // declaring webdriver object and web elements that will be used in this class
    private WebDriver driver;
    private By LinksFromSearchResults;

    // Initializing the constructor for this class
    public GoogleSearchResultsPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Note: the second result Link start from index [3]
     * @param resultIndex the index for the result links
     * @return the LinkText which refer to specified index will be returned from this method
     */
    public String getTextForLinksFromSearchResults(int resultIndex){
        LinksFromSearchResults = By.xpath("//*[@id=\"rso\"]/div[" + resultIndex + "]//a/h3");
        String LinkText = driver.findElement(LinksFromSearchResults).getText();
        return LinkText;
    }
}