/**
 * @author TrevorDickey - tjdickey
 * CIS175 - Spring 2024
 * Jan 24, 2024
 */
package tests;

import static org.junit.Assert.*;

import model.Child;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */
public class TestChild {
	
	Child child = new Child("Brendan");

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testChildNotNull() {
		assertNotNull(child);
	}
	
	@Test
	public void testName() {
		String childName = "Brendan";
		assertEquals(childName, child.getName());
		}
	
	@Test
	public void testGenderMale () {
		child.setGender('M');
		assertEquals(child.getGender(), 'M');
		
	}

}
