package FRAMES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PRACTICE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Haallluuuu");
		
		driver.switchTo().frame("frm1");  //locating frame with id
		WebElement drp=driver.findElement(By.xpath("//*[@id=\"course\"]"));
		
		Select drpdwn=new Select(drp);
		drpdwn.selectByVisibleText("Java");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("John");
		driver.findElement(By.id("lastName")).sendKeys("Wick");
		driver.findElement(By.id("malerb")).click();
		driver.findElement(By.id("englishchbx")).click();
		driver.findElement(By.id("email")).sendKeys("jw@gmail.com");
		
		
		
		
	}

}
