package Day_5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown_ {
	
	//aUTOsUGGESTED

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
		
		Thread.sleep(3000);
		List<WebElement> E1=driver.findElements(By.xpath("//*[@class=\"wM6W7d\"]"));
		
		Thread.sleep(3000);
		System.out.println(E1.size());
		
		for(WebElement Elements:E1)
		{
			System.out.println(Elements.getText());
		}
		for(WebElement Elements:E1)
		{
			if(Elements.getText().equals("selenium tutorial"))
			{
				Elements.click();
			}
		}
		
	}

}
