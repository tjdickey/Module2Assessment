/**
 * @author TrevorDickey - tjdickey
 * CIS175 - Fall 2023
 * Sep 14, 2023
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Child;
import model.ChildBusinessLogic;

/**
 * 
 */
public class TestChildLogic {
	ChildBusinessLogic childBL = new ChildBusinessLogic();
	String name = "Aubrie";
	Child child = new Child(name);

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsMinor() {
		child.setAge(12);
		assertTrue(childBL.isMinor(child));
	}
	
	@Test
	public void testChildType() {
		child.setAge(12);
		String childType = "teen";
		assertEquals(childType, childBL.generateChildType(child));
	}
	
	@Test
	public void testChildDescription() {
		child.setAge(12);
		child.setGender('F');
		
		String childDescription = "Aubrie is a 12 year old teen girl.";
		
		assertEquals(childDescription, childBL.childDescription(child));

	}

}
