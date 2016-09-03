package seedu.addressbook.data.person;

/**
 * Represents the contact information for person.
 * Shows whether this contact is private or not
 */
public class Contact {
	
	// Differentiates whether the contact is private or not
    private boolean isPrivate;
    
    // Constructor
    public Contact(boolean isPrivate) {
    	this.isPrivate = isPrivate;
    }
    
    // Returns true if it is private
    //         false if it is not
    public boolean isPrivate() {
        return isPrivate;
    }
}
