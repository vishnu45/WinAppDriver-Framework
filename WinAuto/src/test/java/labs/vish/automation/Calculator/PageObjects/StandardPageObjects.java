package labs.vish.automation.Calculator.PageObjects;

import labs.vish.automation.core.Locator;

public class StandardPageObjects {

    public Locator SP_MAIN_LABEL = new Locator("SP_MAIN_LABEL", "Standard Calculator mode");
    
    public Locator BTN_NUM_ONE = new Locator("BTN_NUM_ONE", "name=One");
    public Locator BTN_NUM_TWO = new Locator("BTN_NUM_TWO", "name=Two");
    public Locator BTN_NUM_THREE = new Locator("BTN_NUM_THREE", "name=Three");

    public Locator BTN_OPR_PLUS = new Locator("BTN_OPR_PLUS", "name=Plus");
    public Locator BTN_OPR_EQUALS = new Locator("BTN_OPR_EQUALS", "name=Equals");

    public Locator CALC_RESULTS = new Locator("CALC_RESULTS", "automationId=CalculatorResults");
    
}