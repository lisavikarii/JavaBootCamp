package sef.finalactivity;

import java.util.*;

public class SalaryComparator implements Comparator {

	@Override
	public int compare(Object emp1, Object emp2) {
		double empSalary1 = ((Employee) emp1).getSalary();
		double empSalary2 = ((Employee) emp2).getSalary();
		if (empSalary1 < empSalary2) {
			return 1;
		} else if (empSalary1 == empSalary2) {
			return 0;
		} else {
			return -1;
		}
	}

}
