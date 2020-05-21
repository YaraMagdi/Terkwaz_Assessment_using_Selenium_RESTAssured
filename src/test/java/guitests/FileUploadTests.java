package guitests;

import base.BaseTests;
import gui.internetherokuapp.FileUploadPage;
import gui.internetherokuapp.InternetHerokuappHomePage;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    private InternetHerokuappHomePage internetHerokuappHomePage;
    private FileUploadPage fileUploadPage;

    @Test
    public void testFileUpload(){

        internetHerokuappHomePage = new InternetHerokuappHomePage(driver);
        internetHerokuappHomePage.navigateToInternetHerokuapp();

        fileUploadPage = internetHerokuappHomePage.clickFileUpload();
        fileUploadPage.uploadImage("D:\\My_Workspaces\\My_TestAutomation_Workspace\\Terkwaz_Assessment\\Terkwaz_Assessment_using_Selenium_RESTAssured\\src\\test\\resources\\unnamed.jpg");

        assertEquals(fileUploadPage.getUploadedFiles(), "unnamed.jpg", "Uploaded image isn't correct");
    }
}
