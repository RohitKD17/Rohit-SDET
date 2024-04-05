package ANNOTATION;

import org.testng.annotations.Test;

public class INVOCATION_COUNT_DEMO {

	@Test(invocationCount=5)
	void test()
	{
		System.out.println("Testing...");
	}
}
