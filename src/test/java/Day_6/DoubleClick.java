package Day_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.id("field1")).clear();
		driver.findElement(By.xpath("//input[@id='field1']")).sendKeys("HAlluuu");
		
		
		WebElement button=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(button).perform();
		
		//Validation
		
		WebElement f2=driver.findElement(By.id("field2"));
		String text=f2.getAttribute("value"); //return value
		System.out.println(text);
		
		if(text.equals("HAlluuu"))
		{
			System.out.println("The test is passed");
		}
		else
		{
			System.out.println("The test is failed");
		}
	}

}
