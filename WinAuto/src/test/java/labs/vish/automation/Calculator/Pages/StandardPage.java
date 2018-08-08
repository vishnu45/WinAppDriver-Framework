package labs.vish.automation.Calculator.Pages;

import org.apache.commons.lang3.StringUtils;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import labs.vish.automation.Calculator.PageObjects.StandardPageObjects;
import labs.vish.automation.core.Common;
import labs.vish.automation.core.DriverActions;
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
        
        DriverActions.Click(StandardPgObj.BTN_NUM_ONE);
        DriverActions.Click(StandardPgObj.BTN_OPR_PLUS);
        DriverActions.Click(StandardPgObj.BTN_NUM_TWO);
        DriverActions.Click(StandardPgObj.BTN_OPR_EQUALS);        
        
        String result = DriverActions.GetText(StandardPgObj.CALC_RESULTS);
        result = StringUtils.substringAfter(result, "Display is ");
        Assertions.assertThat(result).isEqualTo(Integer.toString(3));
        
        return this;
    }

}