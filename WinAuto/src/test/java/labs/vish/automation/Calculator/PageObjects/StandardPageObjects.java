package labs.vish.automation.Calculator.PageObjects;

import labs.vish.automation.core.Locator;

public class StandardPageObjects {

    public Locator SP_MAIN_LABEL = new Locator("SP_MAIN_LABEL", "Standard Calculator mode");
    
    // NUMBER PAD
    public Locator BTN_NUM_0 = new Locator("BTN_NUM_0", "name=Zero");
    public Locator BTN_NUM_1 = new Locator("BTN_NUM_1", "name=One");
    public Locator BTN_NUM_2 = new Locator("BTN_NUM_2", "name=Two");
    public Locator BTN_NUM_3 = new Locator("BTN_NUM_3", "name=Three");
    public Locator BTN_NUM_4 = new Locator("BTN_NUM_4", "name=Four");
    public Locator BTN_NUM_5 = new Locator("BTN_NUM_5", "name=Five");
    public Locator BTN_NUM_6 = new Locator("BTN_NUM_6", "name=Six");
    public Locator BTN_NUM_7 = new Locator("BTN_NUM_7", "name=Seven");
    public Locator BTN_NUM_8 = new Locator("BTN_NUM_8", "name=Eight");
    public Locator BTN_NUM_9 = new Locator("BTN_NUM_9", "name=Nine");

    // MEMORY CONTROLS

    // STANDARD FUNCTIONS

    // STANDARD OPERATORS
    public Locator BTN_OPR_DIVIDE = new Locator("BTN_OPR_DIVIDE", "name=Divide by");
    public Locator BTN_OPR_MULTIPLY = new Locator("BTN_OPR_MULTIPLY", "name=Multiply by");
    public Locator BTN_OPR_MINUS = new Locator("BTN_OPR_MINUS", "name=Minus");
    public Locator BTN_OPR_PLUS = new Locator("BTN_OPR_PLUS", "name=Plus");
    public Locator BTN_OPR_EQUALS = new Locator("BTN_OPR_EQUALS", "name=Equals");

    // DISPLAY CONTROLS

    

    public Locator BTN_OPR_ROOT = new Locator("BTN_OPR_ROOT", "name=Square root");

    public Locator CALC_RESULTS = new Locator("CALC_RESULTS", "automationId=CalculatorResults");
    
}