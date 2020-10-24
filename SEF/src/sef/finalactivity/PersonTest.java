package sef.finalactivity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sun.tools.tree.SuperExpression;

public class PersonTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void introduceTest() {
		Person p = new Person();
		try {
			p.setName("Bob");
			p.setAge(20);
		} catch (Exception e) {
			System.out.println("Oops =(");
		}

		assertTrue("My name is Bob and I am 20 years old".equals(p.introducePerson()));

	}

	@Test(expected = Exception.class)
	public void nameFailTest() throws Exception {
		Person p = new Person();
		p.setName("Bob2");
	}

	@Test
	public void nameTest() {
		Person p = new Person();
		try {
			p.setName("Bob");
		} catch (Exception e) {
			System.out.println("Oops =(");
		}

		assertTrue("Bob".equals(p.getName()));

	}

	@Test
	public void ageTest() {
		Person p = new Person();
		p.setAge(20);

		assertEquals(20, p.getAge());
	}
}
