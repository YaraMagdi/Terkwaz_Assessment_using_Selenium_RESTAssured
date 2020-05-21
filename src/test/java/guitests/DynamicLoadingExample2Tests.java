package guitests;

import base.BaseTests;
import gui.internetherokuapp.DynamicLoadingExample2Page;
import gui.internetherokuapp.DynamicLoadingPage;
import gui.internetherokuapp.InternetHerokuappHomePage;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingExample2Tests extends BaseTests {

    // Declaring The Page Objects that will be used throughout the test class
    private InternetHerokuappHomePage internetHerokuappHomePage;
    private DynamicLoadingPage dynamicLoadingPage;
    private DynamicLoadingExample2Page dynamicLoadingExample2Page;

    @Test(description = "TC002 - Wait for Dynamic loading example 2 result to be displayed")
    @Description("Given I am on Dynamic loading Example2 page, When I click on start, Then Text will be displayed after loading finished.")
    public void WaitUntilDisplayed(){
        internetHerokuappHomePage = new InternetHerokuappHomePage(driver);
        internetHerokuappHomePage.navigateToInternetHerokuapp();

        dynamicLoadingPage = internetHerokuappHomePage.clickDynamicLoading();

        dynamicLoadingExample2Page = dynamicLoadingPage.clickExample2();

        dynamicLoadingExample2Page.isStartButtonDisplayed();
        dynamicLoadingExample2Page.clickStart();
        assertEquals(dynamicLoadingExample2Page.getDisplayedText(), "Hello World!", "Displayed text isn't correct");
    }
}
