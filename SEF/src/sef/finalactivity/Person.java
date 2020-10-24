
package sef.finalactivity;

public class Person {
	String name;
	int age;


	public void setName(String name) throws Exception {
		if(name.matches("^[a-zA-Z]+$") == false) {
			throw new Exception("no numbers");
		}
			
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String introducePerson() {
		return "My name is " + name + " and I am " + age + " years old";
	}
}
