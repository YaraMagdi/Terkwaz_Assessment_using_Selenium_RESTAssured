package gui.internetherokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    /**
     * Provides path of image to the form then clicks Upload button
     * @param absolutePathOfImage The complete path of the image to upload
     */
        public void uploadImage(String absolutePathOfImage){
            driver.findElement(inputField).sendKeys(absolutePathOfImage);
            clickUploadButton();
      }

    public String getUploadedFiles(){
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(uploadedFiles)));
        return driver.findElement(uploadedFiles).getText();
    }
}
