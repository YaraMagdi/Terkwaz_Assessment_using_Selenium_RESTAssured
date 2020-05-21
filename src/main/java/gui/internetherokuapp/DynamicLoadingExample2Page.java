package gui.internetherokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample2Page {

    private WebDriver driver;
    private WebDriverWait wait;
    private By startButton = By.xpath("//*[@id='start']//following::button");
    private By displayedText = By.id("finish");

    public DynamicLoadingExample2Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickStart() {
        driver.findElement(startButton).click();

        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(displayedText));
    }

    public boolean isStartButtonDisplayed(){
        return driver.findElement(startButton).isDisplayed();
    }

    public String getDisplayedText(){
        return driver.findElement(displayedText).getText();
    }

}
