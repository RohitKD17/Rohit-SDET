package Day_2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		
		driver.findElement(By.name("submit_search")).click();  //to locate 
		
		driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
		
		driver.findElement(By.partialLinkText("Faded Short")).click();
		
		System.out.println("Successfully Executed---Script Passed");
		
		driver.close();
	}

}
