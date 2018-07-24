package labs.vish.automation.core;

public class Locator {
    
    private String locatorName;
    private String locatorValue;

    /**
	 * Constructor to initizlie the locator
	 * @param  locatorName  : Custom locator name
	 * @param  locatorValue : HTML locator value	 
	 */
	public Locator(String locatorName, String locatorValue) {
		this.locatorName = locatorName;
		this.locatorValue = locatorValue;
    }
    
    /**
	 * Get the name of the locator
	 * @return locator name
	 */
	public String getName() {
		return this.locatorName;
	}
	
	/**
	 * Get HTML value of the locator being used
	 * @return locator value
	 */
	public String getValue() {
		return this.locatorValue;
	}

}