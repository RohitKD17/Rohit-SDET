package ANNOTATION;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {

	    @BeforeMethod
		@BeforeClass
		@BeforeTest
		@BeforeSuite
		public void Login()
		{
			System.out.println("Login.....");
		}
		
		@Test
		public void Search()
		{
			System.out.println("Search.....");
		}
		
		@Test
		public void AdvanceSearch()
		{
			System.out.println("AdvanceSearch....");
		}
		
		@AfterMethod    //method level
		@AfterClass    //Class Level
		@AfterTest
		@AfterSuite
		public void Logout()
		{
			System.out.println("Logout.....");
		}
		
		
	}


