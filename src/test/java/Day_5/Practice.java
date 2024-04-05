package Day_5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://www.bing.com/");
			driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys("Testing");
			
			Thread.sleep(3000);
		List	<WebElement> E2= driver.findElements(By.xpath("//*[@class=\"sa_tm_text\"]"));
		//Thread.sleep(3000);
		System.out.println("The total no. of elements are : " + E2.size());
		
		for(WebElement Elements:E2)
		{
			System.out.println(Elements.getText());
		}
		for(WebElement Elements:E2)
		{
			if(Elements.getText().equals("testing tools"))
			{
				Thread.sleep(3000);
				Elements.click();
			}
		}
		
	}

}
