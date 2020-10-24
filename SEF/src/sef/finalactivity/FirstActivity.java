package sef.finalactivity;

import java.util.Arrays;

public class FirstActivity {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Mindy Salazar", 45, "homeless", 0);
		Employee emp2 = new Employee("Elina Lamb", 18, "intern", 1000);
		Employee emp3 = new Employee("Nelson Fletcher", 30, "spaceman", 500000);
		Employee emp4 = new Employee("Aryaan Fry", 78, "retiree", 2000);
		SalaryComparator comp = new SalaryComparator();

		Employee[] emplArr = { emp1, emp2, emp3, emp4 };
		Arrays.sort(emplArr, comp);
		
		for(int i = 0; i < emplArr.length; i++ ) {
			Employee tmpEmp = emplArr[i];
			System.out.println(tmpEmp.getSalary());
		}
	}
     
}
