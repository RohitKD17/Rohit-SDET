package Day_2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Locators_Version4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.get("https://automationbookstore.dev/");
		
		//Thread.sleep(4000);
		
//	WebElement password=	driver.findElement(By.xpath("//input[@placeholder='Password']"));
	//	driver.findElement(RelativeLocator.with(By.tagName("input")).above(password)).sendKeys("Hello");
		
		WebElement text=driver.findElement(By.xpath("//li[@id='pid1']"));
	String t1=	driver.findElement(RelativeLocator.with(By.tagName("li")).below(text)).getText();
		
		System.out.println(t1);
		
	}

}
