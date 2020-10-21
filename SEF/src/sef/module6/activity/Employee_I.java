package sef.module6.activity;

// class Employee_I must extend class Person_I. Complete code for the same
public class Employee_I extends Person_I  {
	
	//Attributes
	private int salary;
	private String title;
	
	public Employee_I() {
		System.out.println("I'm an Employee_I Constructor");
	}
	
	public Employee_I(int salary, String title) {
		System.out.println("I'm an Employee_I Constructor");
		this.salary = salary;
		this.title = title;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	//Behavior - write default constructor. Print 'I'm an Employee_I Constructor'
	
	
	// write getter for int salary
	
	
	// write setter for int salary
	
	
	// write getter for String title
	
	
	// write setter for String title
	
}
