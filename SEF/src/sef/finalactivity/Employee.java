package sef.finalactivity;

public class Employee extends Person {
	String jobTitle;
	double salary;

	public Employee() {
	}

	public Employee(String name, int age, String jobTitle, double salary) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String introducePerson() {
		return "My name is " + name + " and I am " + age + " years old. I work as " + jobTitle + " in company";

	}

}
