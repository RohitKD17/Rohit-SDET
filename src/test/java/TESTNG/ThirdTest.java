package TESTNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThirdTest {
	
	ChromeDriver driver;
  @Test(priority=1)
  public void OpenApp() 
  {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  
  @Test(priority=2)
  public void Login()
  {
	 driver.findElement(By.name("username")).sendKeys("Admin");
	 driver.findElement(By.name("password")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 
   }
  @Test(priority=3)
  public void Closeapp()
  {
	  driver.close();
  }
}
