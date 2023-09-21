/**
 * @author TrevorDickey - tjdickey
 * CIS175 - Fall 2023
 * Sep 14, 2023
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
