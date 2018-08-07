package labs.vish.automation.core;

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
    
    public static WindowsDriver AppSession;
    public static WebDriverWait explicitWait;
    public static Actions keyAction;

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite(ITestContext context) throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("app", context.getCurrentXmlTest().getSuite().getParameter("application"));
        capabilities.setCapability("deviceName", context.getCurrentXmlTest().getSuite().getParameter("device.name"));
        capabilities.setCapability("platformName", context.getCurrentXmlTest().getSuite().getParameter("platform.name"));

        AppSession = new WindowsDriver(new URL("http://0.0.0.0:4747/wd/hub"), capabilities);

        // OTHER INITIALIZATIONS
        explicitWait = new WebDriverWait(AppSession, 60);
        keyAction = new Actions(AppSession);

        Thread.sleep(2000);

    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {

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
    public void beforeMethod() {
        
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        
    }

}
