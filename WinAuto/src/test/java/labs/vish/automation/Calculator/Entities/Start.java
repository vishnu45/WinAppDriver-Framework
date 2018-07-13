package labs.vish.automation.Calculator.Entities;

import labs.vish.automation.Calculator.Pages.StandardPage;

public class Start {
    
    private static StandardPage standardPage = new StandardPage();

    public static StandardPage GoToStandardPage() {
        return standardPage.StartStandardPage();
    }

}