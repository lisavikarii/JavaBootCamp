package sef.finalactivity;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void introduceTest() {
		Student st = new Student();
		st.setSchoolName("Hogwarts");
		
		assertTrue("I am studying at Hogwarts".equals(st.introducePerson()));

	}

	@Test
	public void schoolNameTest() {
		Student st = new Student();
		st.setSchoolName("Hogwarts");

		assertTrue("Hogwarts".equals(st.getSchoolName()));

	}

}
