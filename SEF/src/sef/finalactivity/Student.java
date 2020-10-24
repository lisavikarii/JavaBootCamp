package sef.finalactivity;

public class Student extends Person {
	String schoolName;

	public Student() {
		
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	
	public String introducePerson() {
		return "I am studying at " + schoolName;
	}
}
