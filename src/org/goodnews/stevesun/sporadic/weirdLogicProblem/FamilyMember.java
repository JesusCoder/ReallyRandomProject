/**
 * 
 */
package org.goodnews.stevesun.sporadic.weirdLogicProblem;

/**
 * @author SteveSun
 *
 */
public class FamilyMember {
	private String gender;
	private int age;
	private String name;
	private String role;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public FamilyMember(String gender, String name, int age) {
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
}
