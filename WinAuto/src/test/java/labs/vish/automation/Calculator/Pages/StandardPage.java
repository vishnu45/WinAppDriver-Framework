package labs.vish.automation.Calculator.Pages;

import org.apache.commons.lang3.StringUtils;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import labs.vish.automation.Calculator.PageObjects.StandardPageObjects;
import labs.vish.automation.core.Common;
import labs.vish.automation.core.DriverActions;
import labs.vish.automation.core.Log;
import labs.vish.automation.core.TestBase;

public class StandardPage extends MasterPage {
    
    public StandardPageObjects StandardPgObj = new StandardPageObjects();

    public StandardPage() {
        PageName = "Standard Page";
        // Page object initilization
    }

    public StandardPage StartStandardPage() {
        StandardPage page = new StandardPage();
        Common.explicitWait
            .until(ExpectedConditions
                .visibilityOfElementLocated(By.name(StandardPgObj.SP_MAIN_LABEL.getValue())));        
        return page;
    }

    public StandardPage VerifyAddOperation() throws InterruptedException {
        
        Log.expected("Check if sum of 2 numbers is correct");
        DriverActions.Click(StandardPgObj.BTN_NUM_1);
        DriverActions.Click(StandardPgObj.BTN_OPR_PLUS);
        DriverActions.Click(StandardPgObj.BTN_NUM_2);
        DriverActions.Click(StandardPgObj.BTN_OPR_EQUALS);        
                
        Assertions.assertThat(getDisplayOutputText()).isEqualTo(Integer.toString(3));
        Log.actual("Sum of 2 numbers is correct");        
        return this;
    }

    public StandardPage VerifySubtractOperation() throws InterruptedException {
        
        Log.expected("Check if sum of 2 numbers is correct");
        DriverActions.Click(StandardPgObj.BTN_NUM_9);
        DriverActions.Click(StandardPgObj.BTN_OPR_MINUS);
        DriverActions.Click(StandardPgObj.BTN_NUM_4);
        DriverActions.Click(StandardPgObj.BTN_OPR_EQUALS);        
                
        Assertions.assertThat(getDisplayOutputText()).isEqualTo(Integer.toString(5));
        Log.actual("Sum of 2 numbers is correct");        
        return this;
    }

    /**
     * To retrieve Calculator output display text
     */
    public String getDisplayOutputText() {
        String result = DriverActions.GetText(StandardPgObj.CALC_RESULTS);
        return StringUtils.substringAfter(result, "Display is ");
    }

}