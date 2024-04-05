package ANNOTATION;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HARD_SOFT_ASSERATION {

	
	//@Test
	void HardAsseration()
	{
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
		Assert.assertTrue(false); //failed
		
		System.out.println("This is an example of hard asseration");
		
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		
	}
	
	@Test
	void SoftAsseration()
	{
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(false); //fail but execution will not stop
		
		System.out.println("This is an example of soft asseration");
		
		sa.assertTrue(true);
		sa.assertTrue(true);
		sa.assertTrue(true);
		
		
		sa.assertAll(); //required
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
