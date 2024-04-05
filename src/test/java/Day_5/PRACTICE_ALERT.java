package Day_5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PRACTICE_ALERT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		 Alert alert =	driver.switchTo().alert();
		 
		 alert.accept();
		 String text= driver.findElement(By.id("result")).getText();
		    
		    if(text.equals("You clicked: Ok"))
		    {
		    	System.out.println("Test Passed");
		    }
	}

}
