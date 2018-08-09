package labs.vish.automation.core;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.windows.WindowsDriver;

public class TestBase {
    
    @BeforeSuite(alwaysRun = true)
    public void beforeSuite(ITestContext testContext) throws MalformedURLException, InterruptedException {
        Log.startTestSuite(testContext);
        DriverFactory.StartApplication(testContext);
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {        
        DriverFactory.StopApplication();
        Log.endTestSuite();
    }

    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        
    }

    @BeforeGroups(alwaysRun = true)
    public void beforeGroups() {
        
    }

    @AfterGroups(alwaysRun = true)
    public void afterGroups() {
        
    }

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(Method method) {
        Log.startTestCase(method);
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        Log.endTestCase();
    }

}
