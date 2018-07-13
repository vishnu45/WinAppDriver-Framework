package labs.vish.automation.Calculator.Pages;

public class StandardPage extends MasterPage {
    
    public StandardPage() {
        PageName = "Standard Page";
        // Page object initilization
    }

    public StandardPage StartStandardPage() {
        StandardPage page = new StandardPage();
        // Actions . wait until ST page title        
        return page;
    }

}