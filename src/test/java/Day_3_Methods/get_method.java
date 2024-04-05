package Day_3_Methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	/*	System.out.println("The title of the page is :" +driver.getTitle());
		
		System.out.println("The url of the page is :" + driver.getCurrentUrl());
		
		System.out.println("The source of the page is :" + driver.getPageSource());
*/		
		
	//	String windowid=driver.getWindowHandle();
		
	//	System.out.println("The window id is :" + windowid);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']"));
		
		Set <String> windowids=driver.getWindowHandles();
		
		for(String winids:windowids)
		{
			System.out.println("The window id is : " + winids);
		}
		
		
	}

}
