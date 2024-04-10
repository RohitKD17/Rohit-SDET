package ASSIGNMENT_2_LOCATORS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class DYNAMIC_DROP {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

        ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.bing.com/#");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Thread.sleep(3000);
		List<WebElement> E1=driver.findElements(By.xpath("//*[@class=\"sa_drw\"]/child::*"));
		
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
