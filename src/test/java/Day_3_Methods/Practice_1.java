package Day_3_Methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Practice_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		System.out.println("The Title of the page is: " + driver.getTitle());
		System.out.println("The Url of the page is: " + driver.getCurrentUrl());
		
		String winid=driver.getWindowHandle();
		System.out.println("The Window id is : " + winid);
		
		driver.findElement(By.xpath("//*[contains(text(),\"gotten\")]")).click();
		
		String winid1=driver.getWindowHandle();
		System.out.println("The Window id is : " + winid);
		//Thread.sleep(3000);
		
		WebElement text=driver.findElement(By.xpath("//*[contains(text(),\"gotten\")]"));
		WebElement t1=	driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(text));
		t1.click();
		
	 //   driver.findElement(By.xpath("//a[normalize-space()='Sign up for Facebook']")).click();
	    
	//    String winid2=driver.getWindowHandle();
	//	System.out.println("The Window id is : " + winid);
		
	 //   Set <String> winid1=driver.getWindowHandles();
	   
	 //   for(String wi:winid1)
	 //    {
	//	   System.out.println("The window ids are : " + wi);
	 //    }
	    
	
		
	}

}
