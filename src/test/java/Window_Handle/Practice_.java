package Window_Handle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Practice_ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.className("wikipedia-search-input")).sendKeys("Selenium");
		driver.findElement(By.className("wikipedia-search-button")).click();
		
		
		WebElement E2=driver.findElement(By.xpath("//a[contains(text(),\"Selenium in biology\")]"));
		E2.click();
		driver.findElement(RelativeLocator.with(By.tagName("a")).above(E2)).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Selenium (software)\")]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Selenium disulfide\")]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Selenium dioxide\")]")).click();
		
		Set <String> Wid=driver.getWindowHandles();
		for(String Winid:Wid)
		{
			String Title=driver.switchTo().window(Winid).getTitle();
			if(Title.equals("Selenium in biology - Wikipedia") || Title.equals("Selenium dioxide - Wikipedia"))
			{
				driver.close();
			}
			else if(Title.equals("Selenium disulfide - Wikipedia") || Title.equals("Selenium (software) - Wikipedia") || Title.equals("Selenium - Wikipedia"))
			{
				System.out.println("The opened Windows are : " + driver.getTitle());
			}
		}
		
		
		
		
		
	}

}
