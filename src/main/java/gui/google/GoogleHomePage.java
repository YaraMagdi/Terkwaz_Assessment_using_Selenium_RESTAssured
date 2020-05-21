package gui.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {

    private WebDriver driver;
    private String urlForNavigation = "https://www.google.com/ncr";
    private By searchBox = By.name("q");

    public GoogleHomePage(WebDriver driver){
        this.driver = driver;
    }

    public void navigateToGoogle(){
        driver.navigate().to(urlForNavigation);
    }

    public GoogleSearchResultsPage searchFor(String searchData){
        driver.findElement(searchBox).sendKeys(searchData);
        driver.findElement(searchBox).submit();
        return new GoogleSearchResultsPage(driver);
    }

}
