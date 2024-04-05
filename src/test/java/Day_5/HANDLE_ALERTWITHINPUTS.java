package Day_5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HANDLE_ALERTWITHINPUTS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		Alert alert=driver.switchTo().alert();
		
		alert.sendKeys("HAALLOO");
		
		alert.accept();
		
		//validation
		
		String text=driver.findElement(By.id("result")).getText();
		
		if(text.equals("You entered: HAALLOO"))
	    	System.out.println("Test Passed");
	    else
	    	System.out.println("Test Failed");
		
		
		//for dismiss
		alert.dismiss();
        String text1=driver.findElement(By.id("result")).getText();
		
		if(text1.equals("You entered: null"))
	    	System.out.println("Test Passed");
	    else
	    	System.out.println("Test Failed");
		
		
		
	}

}
