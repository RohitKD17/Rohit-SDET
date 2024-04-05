package Day_3_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		driver.findElement(By.xpath("//*[@id='gender-male']")).click();
		driver.findElement(By.xpath("//*[@id='FirstName']")).sendKeys("John");
		driver.findElement(By.xpath("//*[@id='LastName']")).sendKeys("Reacher");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("Jreacher@gmail.com");
		driver.findElement(By.xpath("//*[@id='Company']")).sendKeys("Bebo Technologies");
		driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("ReacherBebo");
		driver.findElement(By.xpath("//*[@id='ConfirmPassword']")).sendKeys("ReacherBebo");
		driver.findElement(By.xpath("//*[@id='register-button']")).click();
		
		String text=driver.findElement(By.xpath("//*[@class='result']")).getText();
		System.out.println(text);
		
		
	}

}
