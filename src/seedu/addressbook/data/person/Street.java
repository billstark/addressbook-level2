package seedu.addressbook.data.person;

/**
 * represents the street name of address
 * Guarantees: immutable
 */
public class Street {
	
	private String value;
	
	/**
	 * Constructor of Street
	 * @param streetName
	 */
	public Street(String streetName) {
		this.value = streetName;
	}
	
	/**
	 * Get the value of street name
	 */
	public String getStreetName() {
		return value;
	}
}
