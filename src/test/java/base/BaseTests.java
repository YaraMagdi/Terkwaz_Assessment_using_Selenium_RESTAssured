package base;

import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

public class BaseTests {
    // Declaring WebDriver instances
    protected WebDriver driver;

    /**
     * This is a Set-up method @BeforeClass, to be always run once before the first test in the extended class
     */
    @BeforeClass
    public void setUp(){
        //setup the chromedriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        //initializing driver object for Chrome and manage window
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    /**
     * This is a tearDown method @AfterClass, to be always run once after all tests in the extended class
     */
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    /** Taking screenshots for failed test case result using from TestNG package
     * @param testResult A result for running test methods
     */
    @AfterMethod
    public void takeScreenshots(ITestResult testResult){
        if(ITestResult.FAILURE == testResult.getStatus()) {
            // Create object to take Screenshot and cast our driver
            var camera = (TakesScreenshot) driver;

            // Saving Screenshot as file using JavaIO
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("src\\test\\resources\\screenshots\\" + testResult.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}