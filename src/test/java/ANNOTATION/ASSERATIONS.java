package ANNOTATION;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ASSERATIONS {

	@Test
	void test()
	{
		
	//	int x=10;  //20 for same 
	//	int y=20;
	//	if(x==y)
	//	{
	//		System.out.println("Test passed");
	//	}
	//	else
	//	{
	//		System.out.println("Test failed");
	//	}
		
	//	Assert.assertEquals(x, y);  //hard asseration
		//Assert.asserEquals(true);   //passed
		//Assert.asserEquals(false);  //failed

		// intentionally making test pass or fail
	//	Assert.assertTrue(true);  //pass
	//	Assert.assertTrue(true);  //fail
		
		int a=10;
		int b=20;
		//Assert.assertEquals(actual, expected, description);
		Assert.assertEquals(a>b, true,"a is not small");
		
		String a1="abc";
		String a2="abc";
		Assert.assertEquals(a1,a2,"Both value must be equal"); //passed
		
		if(true)
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
		Assert.fail();  //no method for pass
	}

}
