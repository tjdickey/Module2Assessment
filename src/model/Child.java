/**
 * @author TrevorDickey - tjdickey
 * CIS175 - Fall 2023
 * Sep 14, 2023
 */
package model;

/**
 * 
 */
public class Child {
	private String name;
	private char gender;
	private int age;
	
	public Child() {
		setName(name);
		setGender(gender);
		setAge(age);
	}
	
	public Child(String name) {
		setName(name);
		setGender(gender);
		setAge(age);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
