package gui.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {

    // declaring webdriver object and web elements that will be used in this class
    private WebDriver driver;
    private String urlForNavigation = "https://www.google.com/ncr";
    private By searchBox = By.name("q");

    // Initializing the constructor for this class
    public GoogleHomePage(WebDriver driver){
        this.driver = driver;
    }

    // A method to open google URL
    public void navigateToGoogle(){
        driver.navigate().to(urlForNavigation);
    }

    /**
     * A method to search for data in google
     * @param searchData , a string parameter that refer to data we need to search for
     * @return after submitting GoogleSearchResultsPage should be returned
     */
    public GoogleSearchResultsPage searchFor(String searchData){
        driver.findElement(searchBox).sendKeys(searchData);
        driver.findElement(searchBox).submit();
        return new GoogleSearchResultsPage(driver);
    }

}