package gui.internetherokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample2Page {

    // declaring webdriver, webdriverwait objects and web elements that will be used in this class
    private WebDriver driver;
    private WebDriverWait wait;
    private By startButton = By.xpath("//*[@id='start']//following::button");
    private By displayedText = By.id("finish");

    // Initializing the constructor for this class
    public DynamicLoadingExample2Page(WebDriver driver){
        this.driver = driver;
    }

    /*
      A method to click on start button
      Using Explicit wait to wait until specified element is exist
     */
    public void clickStart() {
        driver.findElement(startButton).click();

        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(displayedText));
    }

    // A method to verify if element is displayed or not
    public boolean isStartButtonDisplayed(){
        return driver.findElement(startButton).isDisplayed();
    }

    // A method to get displayed text for specified web element
    public String getDisplayedText(){
        return driver.findElement(displayedText).getText();
    }
}