package seedu.addressbook.data.person;

import java.util.ArrayList;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street, some unit number, some postal code";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";
    
    public static final int BLOCK_INDEX = 0;
    public static final int STREET_INDEX = 1;
    public static final int UNIT_INDEX = 2;
    public static final int POSTAL_CODE_INDEX = 3;
    public static final int NUMBER_OF_ATTIBUTES = 4;
    
    private boolean isPrivate;
    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalCode;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        String[] addressArray = splitAddress(address);
        this.block = new Block(addressArray[BLOCK_INDEX]);
        this.street = new Street(addressArray[STREET_INDEX]);
        this.unit = new Unit(addressArray[UNIT_INDEX]);
        this.postalCode = new PostalCode(addressArray[POSTAL_CODE_INDEX]);
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }
    
    /**
     * Return an array of a split address
     */
    public static String[] splitAddress(String address) {
    	System.out.println(address);
    	return address.split("\\, ");
    }
    
    /**
     * Return the complete address
     */
    public String getAddressValue() {
    	String[] addressArray = new String[NUMBER_OF_ATTIBUTES];
    	addressArray[BLOCK_INDEX] = block.getBlockNumber();
    	addressArray[STREET_INDEX] = street.getStreetName();
    	addressArray[UNIT_INDEX] = unit.getUnitNumber();
    	addressArray[POSTAL_CODE_INDEX] = postalCode.getPostalCode();
    	
    	return displayAddress(addressArray);
    }
    
    /**
     * Convert a string array to a string
     */
    public static String displayAddress(String[] addressArray) {
    	return String.join(", ", addressArray);
    }

    @Override
    public String toString() {
        return getAddressValue();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.getAddressValue().equals(((Address) other).getAddressValue())); // state check
    }

    @Override
    public int hashCode() {
        return getAddressValue().hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}