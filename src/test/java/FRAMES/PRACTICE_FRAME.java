package FRAMES;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PRACTICE_FRAME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		
		
		WebElement F1=driver.findElement(By.xpath("/html/frameset/frame[1]"));
		driver.switchTo().frame(F1);
		driver.findElement(By.name("mytext1")).sendKeys("Halluu");
		
		driver.switchTo().defaultContent();
		
		WebElement F2=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		driver.switchTo().frame(F2);
		driver.findElement(By.name("mytext3")).sendKeys("Haalluuu");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"i8\"]/div[3]/div")).click();
		
		driver.switchTo().defaultContent();
		WebElement F5=driver.findElement(By.xpath("/html/frameset/frame[2]"));
		driver.switchTo().frame(F5);
		driver.findElement(By.name("mytext5")).sendKeys("Halluuu");
		
	}

}
