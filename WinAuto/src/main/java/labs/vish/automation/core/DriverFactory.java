package labs.vish.automation.core;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;

import io.appium.java_client.windows.WindowsDriver;

public class DriverFactory {
    
    public static void StartApplication(ITestContext testContext) throws MalformedURLException, InterruptedException {
        
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("app", testContext.getCurrentXmlTest().getSuite().getParameter("application"));
        capabilities.setCapability("deviceName", testContext.getCurrentXmlTest().getSuite().getParameter("device.name"));
        capabilities.setCapability("platformName", testContext.getCurrentXmlTest().getSuite().getParameter("platform.name"));

        Common.AppSession = new WindowsDriver(new URL("http://0.0.0.0:4747/wd/hub"), capabilities);

        // OTHER INITIALIZATIONS
        Common.explicitWait = new WebDriverWait(Common.AppSession, 60);
        Common.keyAction = new Actions(Common.AppSession);

        Thread.sleep(2000);
    }

}