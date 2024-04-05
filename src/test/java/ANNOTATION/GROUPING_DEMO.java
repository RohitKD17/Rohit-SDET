package ANNOTATION;

import org.testng.annotations.Test;

//loginByEmail - sanity & regression
//loginByfacebook - sanity
//loginBytwitter - sanity

//signupbyemail - sanity & regression
//signupbyfacebook - regression
//signupbytwitter - regression

//paymentinrupees - sanity & regression
//paymentindollar - sanity
//paymentReturnbyBank - regression

public class GROUPING_DEMO {

	@Test(priority=1,groups= {"sanity","regression"})
	void loginByEmail()
	{
		System.out.println("This is by email");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void loginByFacebook()
	{
		System.out.println("This is by facebook");
	}
	
	@Test(priority=3,groups= {"sanity"})
	void loginByTwitter()
	{
		System.out.println("This is by twitter");
	}
	
	@Test(priority=4,groups= {"sanity","regression"})
	void signupbyemail()
	{
		System.out.println("sign up by email");
	}
	
	@Test(priority=5,groups= {"regression"})
	void signupbyfacebook()
	{
		System.out.println("sign up by facebook");
	}
	
	@Test(priority=6,groups= {"regression"})
	void signupbytwitter()
	{
		System.out.println("sign up by twitter");
	}
	
	@Test(priority=7,groups= {"sanity","regression"})
	void paymentinrupees()
	{
		System.out.println("This is in rupees");
	}
	
	@Test(priority=8,groups= {"sanity"})
	void paymentindollar()
	{
		System.out.println("This is in dollar");
	}
	
	@Test(priority=9,groups= {"regression"})
	void paymentReturnbyBank()
	{
		System.out.println("This is by bank");
	}
	
}
