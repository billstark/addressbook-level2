package seedu.addressbook.data.person;

/**
 * represents the postal code of address
 * Guarantees: immutable
 */
public class PostalCode {
	
	private String value;
	
	/**
	 * Constructor of PostalCode
	 * @param postalCode
	 */
	public PostalCode(String postalCode) {
		this.value = postalCode;
	}
	
	/**
	 * Get the value of unit number
	 */
	public String getPostalCode() {
		return value;
	}
}