package gui.internetherokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InternetHerokuappHomePage {
    private WebDriver driver;
    private String urlForNavigation = "https://the-internet.herokuapp.com/";

    public InternetHerokuappHomePage(WebDriver driver){
        this.driver = driver;
    }

    public void navigateToInternetHerokuapp(){
        driver.navigate().to(urlForNavigation);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
}
