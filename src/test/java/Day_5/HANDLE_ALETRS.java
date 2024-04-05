package Day_5;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HANDLE_ALETRS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver =new ChromeDriver();
		
		WebDriverWait myw8=new WebDriverWait(driver, Duration.ofSeconds(5) );
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		//ALERT ---special class for handling the popups/alert window
		//
		myw8.until(ExpectedConditions.alertIsPresent());
	    Alert alert =	driver.switchTo().alert(); //driver moves to popup
		
	    
		//accept()------click ok
		//dismiss()-----click cancel
		//getText()------to get the text of popup
	    
	    alert.accept();  //this will click ok on popup
	    
	   String text= driver.findElement(By.id("result")).getText();
	    
	    if(text.equals("You clicked: Ok"))
	    	System.out.println("Test Passed");
	    else
	    	System.out.println("Test Failed");
	
	
	
	}

}
