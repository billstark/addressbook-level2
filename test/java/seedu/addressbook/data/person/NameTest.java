package seedu.addressbook.data.person;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Name;

import static org.junit.Assert.*;

public class NameTest {
	
	private Name testName;
	private Name disorderedName;
	private Name shortName;
	private Name longName;
	private Name allUpperCaseName;
	private Name allLowerCaseName;
	private Name notSameName;
	
	@Before
    public void setup() {
		
		// define a test name first
        try {
			testName = new Name("John K Smith");
			disorderedName = new Name("Smith K John");
			shortName = new Name("Smith K");
			longName = new Name("Smith John K B");
			allUpperCaseName = new Name("JOHN K SMITH");
			allLowerCaseName = new Name("john k smith");
			notSameName = new Name("Jon Snow");
		} catch (IllegalValueException e) {
			e.printStackTrace();
		}
    }
	
	// Able to handle null input
	@Test
	public void nullShouldReturnFlase() {
		assertEquals(false, testName.isSimilar(null));
	}
	
	// Able to check disordered/shorter/longer names
	@Test
	public void disorderedShouldReturnTrue() {
		assertEquals(true, testName.isSimilar(disorderedName));
		assertEquals(true, testName.isSimilar(longName));
		assertEquals(true, testName.isSimilar(shortName));
	}
	
	// Able to check word cases
	@Test
	public void shortShouldReturnTrue() {
		assertEquals(true, testName.isSimilar(allLowerCaseName));
		assertEquals(true, testName.isSimilar(allUpperCaseName));
	}
	
	// Differentiate a different name
	@Test
	public void differentShouldReturnFlase() {
		assertEquals(false, testName.isSimilar(notSameName));
	}
}
