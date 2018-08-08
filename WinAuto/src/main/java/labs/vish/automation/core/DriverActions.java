package labs.vish.automation.core;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;

public class DriverActions {
    
    /**
     * To get the corresponding WebElement object of the element locator provided
     */
    public static WebElement FindElement(Locator locator) {
        WebElement element = null;
        
        if (locator.getValue().contains("automationId=")) {
            element = Common.AppSession
                .findElementByAccessibilityId(StringUtils.substringAfter(locator.getValue(), "automationId="));
        }
        if (locator.getValue().contains("className=")) {
            element = Common.AppSession
            .findElementByClassName(StringUtils.substringAfter(locator.getValue(), "className="));
        }
        if (locator.getValue().contains("name=")) {            
            element = Common.AppSession            
                .findElementByName(StringUtils.substringAfter(locator.getValue(), "name="));
        }
        if (locator.getValue().contains("xpath=")) {
            element = Common.AppSession
                .findElementByName(StringUtils.substringAfter(locator.getValue(), "xpath="));
        }
        
        return element;    
    }

    /**
     * Action to click particular locator element
     */
    public static void Click(Locator locator) {        
        FindElement(locator).click();
    }

    /**
     * Action to get embedded text in locator
     */
    public static String GetText(Locator locator) {        
        return FindElement(locator).getText();
    }



}