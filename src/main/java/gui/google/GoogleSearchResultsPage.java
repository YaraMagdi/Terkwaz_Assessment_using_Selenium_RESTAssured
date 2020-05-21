package gui.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchResultsPage {

    private WebDriver driver;
    private By LinksFromSearchResults;

    public GoogleSearchResultsPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Note: the second result Link start from index 3
     * @param resultIndex the index for the result links
     */
    public String getTextForLinksFromSearchResults(int resultIndex){
        LinksFromSearchResults = By.xpath("//*[@id=\"rso\"]/div[" + resultIndex + "]//a/h3");
        String LinkText = driver.findElement(LinksFromSearchResults).getText();
        return LinkText;
    }
}
