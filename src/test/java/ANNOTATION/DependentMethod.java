package ANNOTATION;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentMethod {

	@Test
	void openurl()
	{
		Assert.assertTrue(true);
		
	}
	
	@Test
	void Login()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	void Search()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	void AdvanceSearch()
	{
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods = {"Login"})
	void Logout()
	{
		Assert.assertTrue(true);
	}
}
