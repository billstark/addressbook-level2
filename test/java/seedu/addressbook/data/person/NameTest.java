package seedu.addressbook.data.person;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Name;
import seedu.addressbook.parser.Parser;

import static org.junit.Assert.*;

public class NameTest {
	
	private Name testName;
	
	@Before
    public void setup() {
		
		// define a test name first
        try {
			testName = new Name("John K Smith");
		} catch (IllegalValueException e) {
			e.printStackTrace();
		}
    }
}
