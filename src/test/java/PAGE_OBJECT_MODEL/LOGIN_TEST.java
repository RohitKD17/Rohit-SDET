package PAGE_OBJECT_MODEL;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LOGIN_TEST {

	
	WebDriver driver;
	//LOGIN LP;
	LOGIN_PAGE1 LP;
	
	@BeforeClass
	void setup() throws Throwable
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
	}
	
	@Test(priority=2)
	void TestLogin()
	{
		
		LP.setUserName("Admin");
		LP.setPassword("admin123");
		LP.ClickSubmit();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test(priority=1)
	void Logo_Check()
	{
		//LP=new LOGIN(driver);
		LP=new LOGIN_PAGE1(driver);
		Assert.assertEquals(LP.CheckLogo(),true);
	}
	
	@AfterClass
	
	void teardown()
	{
		driver.close();
	}
}
