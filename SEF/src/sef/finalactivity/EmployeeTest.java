package sef.finalactivity;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void introduceTest() {
		Employee emp = new Employee("Mindy Salazar", 45, "homeless", 0);
		
		assertTrue("My name is Mindy Salazar and I am 45 years old. I work as homeless in company".equals(emp.introducePerson()));

	}

	@Test
	public void titleTest() {
		Employee emp = new Employee();
		emp.setJobTitle("Bob");
		

		assertTrue("Bob".equals(emp.getJobTitle()));

	}

	@Test
	public void salaryTest() {
		Employee emp = new Employee();
		emp.setSalary(20);

		assertTrue(20 == emp.getSalary());
	}
}



