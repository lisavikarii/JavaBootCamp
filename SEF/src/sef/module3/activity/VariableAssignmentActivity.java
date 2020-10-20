/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class VariableAssignmentActivity {
	static String hello = "Hello"; 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String abc = "hello";
		abc = "bye";
		int a = 10;
		a = 12;
		System.out.println(abc);
		System.out.println(a);
		
	
		// 1- Declare a variable of type int and assign it default value.
		// 2- Update the value 
		// 3- Print updated value to the console
Foo();
	}
	
	static void Foo() {
		String greetings = hello + " Me";
		System.out.println(greetings);
	}

}

