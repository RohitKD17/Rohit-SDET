package TESTNG;

import org.testng.annotations.Test;

public class SecondTest {

	@Test(priority=1)
	void Login()
	{
		System.out.println("This is login");

	}

	@Test(priority=2)
	void Search()
	{
		System.out.println("This is Search");
	}
	
	@Test(priority=3)
	void Logout()
	{
		System.out.println("This is logout");
	}
}
