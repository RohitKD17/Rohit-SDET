package ANNOTATION;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.*;

public class DataProvider_demo {

	ChromeDriver driver;
	@Test(priority=1)
	void setup()
	{
		driver =new ChromeDriver();
	}
	
	@Test(priority=2,dataProvider="dp")
	void Testlogin(String email,String passwd)
	{
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.findElement(By.id("Email")).sendKeys("asd@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("test123");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		String exp="nopCommerce demo store";
		String act=driver.getTitle();
		
		Assert.assertEquals(exp, act);
		
	}
	
	@AfterClass
	void tearup()
	{
		driver.close();
	}
	
	@DataProvider(name="dp")
	String[][] loginData()
	{
		String data[][]= { {"das@gmail.com","test"},
				           {"qweewq@gmail.com","test1"},
		                   {"ddrake@gmail.com","dDrake123"}
				           };
		
		return data;
		}
	}
