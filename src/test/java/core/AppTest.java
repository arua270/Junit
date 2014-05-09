package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

	@BeforeClass

	public static void BeforeClass() throws Exception {

	System.out.println("BeforeClass method will be executed before first test method starts");

	       }

	@AfterClass

	public static void AfterClass() throws Exception {

	System.out.println("AfterClass method will be executed after last test method completed");

	       }

	 @Before

	public void Before() throws Exception {

	       System.out.println("Before method will execute before every test method");

	       }

	 
	@After

	public void After() throws Exception {
	       System.out.println("After method will execute after every test method");

	       }

	 

	@Test
	public void Test_01_assertEquals_Positive() {assertEquals("String not the same", "Testing JUnit 4", App.s);
	      // System.out.println("Test_01_assertEquals_Positive");
	}

	@Test
	public void Test_02_assertEquals_Negative() {assertEquals("String not the same", "Testing JUnit 6", App.s);
	      // System.out.println("Test_02_assertEquals_Negative");
	       }

	
	@Ignore
	@Test
	public void Test_03_assertEquals_Ignored() {assertEquals("String not the same", "Testing JUnit 6", App.s);
	      // System.out.println("Test_03_assertEquals_Ignored");
	       }

	@Test
	public void Test_04_AssertSame_Positive() {assertSame("Integer not the same.", 55,App.i);
	     //  System.out.println("Test_04_AssertSame_Positive");
	       }
	
	@Test
	public void Test_05_AssertSame_Negative() {assertSame("Integer not the same.", 54,App.i);
	     //  System.out.println("Test_05_AssertSame_Negative");
	       }
	
	@Ignore
	@Test
	public void Test_06_AssertSame_Ignored() {assertSame("Integer not the same.", 56,App.i);
	     //  System.out.println("Test_06_AssertSame_Ignored");
	       }

	@Test
	public void Test_07_assertFalse_Positive() {assertFalse("Boolean should be false", App.f);
	      // System.out.println("Test_07_assertFalse_Positive");
	       }

	@Test
	public void Test_08_assertFalse_Negative() {assertFalse("Boolean should be false", App.t);
	       //System.out.println("Test_08_assertFalse_Negative");
	       }

	@Test
	public void Test_09_assertTrue_Positive() {assertTrue("Boolean should be true", App.t);
	      // System.out.println("Test_09_assertTrue_Positive");
	       }

	@Test
	public void Test_10_assertTrue_Negative() {assertTrue("Boolean should be true", App.f);
	     // System.out.println("Test_10_assertTrue_Negative");
	       }

}
