package guitests;

import base.BaseTests;
import gui.internetherokuapp.DynamicLoadingExample2Page;
import gui.internetherokuapp.DynamicLoadingPage;
import gui.internetherokuapp.InternetHerokuappHomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingExample2Tests extends BaseTests {

    private InternetHerokuappHomePage internetHerokuappHomePage;
    private DynamicLoadingPage dynamicLoadingPage;
    private DynamicLoadingExample2Page dynamicLoadingExample2Page;

    @Test
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
