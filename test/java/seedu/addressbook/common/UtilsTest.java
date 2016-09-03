package seedu.addressbook.common;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Collection;
import seedu.addressbook.common.Utils;

import static org.junit.Assert.*;

public class UtilsTest {

	private final Object NULL_OBJECT = null;
	private final Object NOT_NULL_OBJECT = new String("test");
	private final Object STRING_OBJECT = new String("abc");
	private final Collection<?> EMPTY_COLLECTION = new ArrayList<>();
	
	private Collection<Object> MIXED_ELEMENT_COLLECTION = new ArrayList<Object>();
	private Collection<Object> SAME_ELEMENT_COLLECTION = new ArrayList<Object>();
	/**
	 * Tests for isAnyNull
	 */
	// Tests for 0 input arguments
	@Test
	public void emptyInputReturnFalse() {
		assertEquals(false, Utils.isAnyNull());
	}

	// Arguments exist but all null
	@Test
	public void allNullReturnTrue() {
		assertEquals(true, Utils.isAnyNull(NULL_OBJECT, NULL_OBJECT, NULL_OBJECT));
	}

	// Arguments exist but not all null
	@Test
	public void notAllNullReturnTrue() {
		assertEquals(true, Utils.isAnyNull(NOT_NULL_OBJECT, NOT_NULL_OBJECT, NULL_OBJECT));
	}

	// Arguments exist and all of them are not null
	@Test
	public void allNotNullReturnFalse() {
		assertEquals(false, Utils.isAnyNull(NOT_NULL_OBJECT, NOT_NULL_OBJECT, NOT_NULL_OBJECT));
	}

	/**
	 * Tests for elementsAreUnique
	 */
	// Test for 0 argument input
	@Test
	public void emptyInputReturnTrue() {
		assertEquals(true, Utils.elementsAreUnique(EMPTY_COLLECTION));
	}
	
	// Test for all the items in the collection are unique
	public void mixedItemReturnTrue() {
		MIXED_ELEMENT_COLLECTION.add(NOT_NULL_OBJECT);
		MIXED_ELEMENT_COLLECTION.add(STRING_OBJECT);
		assertEquals(true, Utils.elementsAreUnique(MIXED_ELEMENT_COLLECTION));
	}
	
	// Test for all the items in the collection are the same
	public void sameItemReturnFalse() {
		SAME_ELEMENT_COLLECTION.add(STRING_OBJECT);
		SAME_ELEMENT_COLLECTION.add(STRING_OBJECT);
		SAME_ELEMENT_COLLECTION.add(STRING_OBJECT);
		assertEquals(false, Utils.elementsAreUnique(SAME_ELEMENT_COLLECTION));
	}
}
