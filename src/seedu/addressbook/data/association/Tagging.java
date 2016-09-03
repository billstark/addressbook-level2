package seedu.addressbook.data.association;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.tag.Tag;

/**
 * Specifies an association for a person and a tag
 * Tag is changeable
 */
public class Tagging {
	
	// Store the person and tag
	private Person person;
	private Tag tag;
	
	// Constructor
	public Tagging(Person person, Tag tag) {
		this.person = person;
		this.tag = tag;
	}
	
	// Returns the tagged person
	public Person getPerson() {
		return person;
	}
	
	// Returns the tag
	public Tag getTag() {
		return tag;
	}
	
	// Changes/Adds a tag to a person
	public void addOrChangeTag(Tag tag) {
		this.tag = tag;
	}
	
	// Removes the tag of that person
	public void removeTag() {
		this.tag = null;
	}
}
