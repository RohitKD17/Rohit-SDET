package Day_2_Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Facebook_Following {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		//driver.findElement(By.xpath("//input[@id='email']"));
		
		//List <WebElement> item=driver.findElements(By.xpath("//*[@name=\"email\"]/following::*"));
		
		//System.out.println(item.size());
		
		
		//to count elements we use tagName
		List<WebElement> input=driver.findElements(By.tagName("input"));
		System.out.println(input.size());
		
	}

}
