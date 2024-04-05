package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List <WebElement> E1=driver.findElements(By.tagName("a"));
		System.out.println("The total number of links are : " + E1.size());
		
		System.out.println("The links are :");
		
		for(int i=0;i<E1.size();i++)
		{
			System.out.println(E1.get(i).getText());
		}
		
	}

}
