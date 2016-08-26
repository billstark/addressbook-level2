package seedu.addressbook.data.person;

/**
 * represents the unit number of address
 * Guarantees: immutable
 */
public class Unit {
	
	private String value;
	
	/**
	 * Constructor of Unit
	 * @param unitNumber
	 */
	public Unit(String unitNumber) {
		this.value = unitNumber;
	}
	
	/**
	 * Get the value of unit number
	 */
	public String getUnitNumber() {
		return value;
	}
}