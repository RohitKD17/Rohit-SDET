package Day_4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver=new ChromeDriver();
		
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		
	
		driver.findElement(By.name("password")).sendKeys("Admin");
	}

}
