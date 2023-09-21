/**
 * @author TrevorDickey - tjdickey
 * CIS175 - Fall 2023
 * Sep 14, 2023
 */
package model;

/**
 * 
 */
public class ChildBusinessLogic {
	
	public boolean isMinor(Child child) {
		boolean isMinor = false;
		if (child.getAge() <= 18) {
			isMinor = true;
		}
		
		return isMinor;
	}
	
	public String generateChildType(Child child) {
		String childType = "";
		int age = child.getAge();
		
		if (age < 1) {
			childType = "baby";
		} else if (age < 3) {
			childType = "todler";
		} else if (age < 5) {
			childType = "preschooler";
		} else if (age < 12) {
			childType = "gradeschooler";
		} else if (age < 18) {
			childType = "teen";
		} else if  (age < 21) {
			childType = "young adult";
		} else {
			childType = "adult";
		}
		
		return childType;
	}
	
	public String genderToString(Child child) {
		String genderString = "";
		
		if (child.getGender() == 'F') {
			if (child.getAge() < 18) {
				genderString = "girl";
			} else {
			genderString = "woman";	
			}
		} else {
			if (child.getAge() < 18) {
				genderString = "boy";
			} else {
			genderString = "man";	
			}
		}
		return genderString;
	}
	
	public String childDescription(Child child) {
		String descriptionString = child.getName() + " is a " + child.getAge() + " year old " + generateChildType(child) + " " + genderToString(child) +".";
		return descriptionString;
	}

}
