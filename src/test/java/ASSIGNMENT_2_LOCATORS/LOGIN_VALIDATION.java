package ASSIGNMENT_2_LOCATORS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOGIN_VALIDATION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		String title= driver.getTitle();
		System.out.println(title);
		if(title.contentEquals("OrangeHRM"))
		{
			System.out.println("Login Successfully");
		}
		
				
	}

}
