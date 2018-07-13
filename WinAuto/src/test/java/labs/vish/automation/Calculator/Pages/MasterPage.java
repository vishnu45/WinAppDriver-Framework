package labs.vish.automation.Calculator.Pages;

import labs.vish.automation.Calculator.PageObjects.StandardPageObjects;
import labs.vish.automation.core.PageBase;

public class MasterPage extends PageBase {

    public StandardPageObjects homePageObjects = new StandardPageObjects();

    public StandardPage GetStandardPage() {
        StandardPage page = new StandardPage();
        // Action.waitUntilPageLoad(page)
        return page;
    }
    
}