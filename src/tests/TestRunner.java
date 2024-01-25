/**
 * @author TrevorDickey - tjdickey
 * CIS175 - Spring 2024
 * Jan 24, 2024
 */
package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * 
 */
public class TestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(AllTests.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());

	}

}
