package gui.internetherokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    // declaring webdriver object and web elements that will be used in this class
    private WebDriver driver;
    private By DynamicLoadingExample2 = By.cssSelector("a[href='/dynamic_loading/2']");

    // Initializing the constructor for this class
    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * A method to click on specified web element
     * @return DynamicLoadingExample2Page will be returned after taking click action
     */
    public DynamicLoadingExample2Page clickExample2(){
        driver.findElement(DynamicLoadingExample2).click();
        return new DynamicLoadingExample2Page(driver);
    }
}