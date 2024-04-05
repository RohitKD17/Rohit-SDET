package ANNOTATION;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parameter_Test {

	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br,String appurl) throws InterruptedException
	{
		if(br.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(br.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(appurl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority=2)
	void testlogo()
	{
		try
		{
		boolean status=driver.findElement(By.xpath("//*[@alt=\"company-branding\"]")).isDisplayed();
		Assert.assertEquals(status, true);
		}
		catch(Exception e)
		{
			Assert.fail();  //fail
		}
	}
	
	void testlogin()
	{
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		Thread.sleep(3000);
		driver.findElement(By.className("oxd-button")).click();
		
	}
	
	@Test
	void homepage()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM","Titles are not matched... ");
	}
	
	@AfterClass
	void tearup()
	{
		driver.close();
	}
}
