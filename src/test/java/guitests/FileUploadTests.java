package guitests;

import base.BaseTests;
import gui.internetherokuapp.FileUploadPage;
import gui.internetherokuapp.InternetHerokuappHomePage;
import io.qameta.allure.Description;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    // Declaring The Page Objects that will be used throughout the test class
    private InternetHerokuappHomePage internetHerokuappHomePage;
    private FileUploadPage fileUploadPage;

    @Test(description = "TC003 - Upload Image successfully")
    @Description("Given I am on File Upload page, When I click upload and select an image, Then the image will be uploaded successfully")
    public void testFileUpload(){
        internetHerokuappHomePage = new InternetHerokuappHomePage(driver);
        internetHerokuappHomePage.navigateToInternetHerokuapp();

        fileUploadPage = internetHerokuappHomePage.clickFileUpload();
        fileUploadPage.uploadImage("D:\\My_Workspaces\\My_TestAutomation_Workspace\\Terkwaz_Assessment\\Terkwaz_Assessment_using_Selenium_RESTAssured\\src\\test\\resources\\unnamed.jpg");

        assertEquals(fileUploadPage.getUploadedFiles(), "unnamed.jpg", "Uploaded image isn't correct");
    }
}