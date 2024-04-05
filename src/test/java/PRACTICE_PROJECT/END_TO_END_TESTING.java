package PRACTICE_PROJECT;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class END_TO_END_TESTING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://blazedemo.com/");
		
		
		driver.findElement(By.xpath("//option[@value='Boston']")).click();
		driver.findElement(By.xpath("//option[@value='New York']")).click();
		driver.findElement(By.xpath("//*[@value=\"Find Flights\"]")).click();
		
		int rows1=driver.findElements(By.tagName("tr")).size();
		for(int r=1;r<=rows1;r++)
		{
			
		
		String text=driver.findElement(By.xpath("//*[@class=\"table\"]//tr["+r+"]//td[6]")).getText();
		System.out.println(text);
		
		String[] = new String[5];
		Arrays.sort(text);
		String LowestPrice =PriceArray[0];
		System.out.println(LowestPrice);
	
		}
	}
}

