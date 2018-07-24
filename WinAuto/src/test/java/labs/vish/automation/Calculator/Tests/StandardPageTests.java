package labs.vish.automation.Calculator.Tests;

import org.testng.annotations.Test;

import labs.vish.automation.Calculator.Entities.Start;
import labs.vish.automation.core.TestBase;

public class StandardPageTests extends TestBase {
    
    @Test(  description = "Add 2 numbers",
            groups = {"ORTTest"} )
    public void testAdditionOperation() throws InterruptedException {
        // System.out.println("ADD");
        Start
            .GoToStandardPage()
            .VerifyAddOperation();
    }

}