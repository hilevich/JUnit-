package edu.cursor.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	App app;

	@Before
	public void before() {
		app = new App();
		System.out.println("In before");
	}

	@After
	public void after() {

		app = null;
		System.out.println("In after");
	}
	
	@BeforeClass
	public static void beforeClass () {
		System.out.println("BeforeClass....");
	}
	
	@AfterClass
	public static void afterClass () {
		System.out.println("AfterClass....");
	}
	@Test
	public void addTest (){
		assertEquals (4,app.add(2, 2));
		System.out.println("Add TEST ");
	}
	@Test
	public void divTest(){
		assertEquals(2, app.div(4, 2));
		System.out.println("Div TEST");
	}
	
	@Test
	public void returnTextTest(){
		assertEquals("yura", app.returnText("yura"));
		System.out.println("RETURN text");
	}
	@Test
	public void listTest () {
		assertEquals(0, app.yura.size());
		System.out.println("List check");
	}
	
	@Test
	public void loopTest() {
		assertEquals(5, app.loop(0));
		System.out.println("LOOP TEST");
	}
	@Test
	public void divTest2 (){
		assertEquals(10, app.div(10, 0));
		System.out.println("10 / 0");
	}
	
	
	
	
	
	
}
