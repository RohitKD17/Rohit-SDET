import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		// Absolute Xpath
		
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/h2/a")).click();
		
	//	String text= above
		
	//	String text=driver.findElement(By.xpath("//a[normalize-space()='Apple MacBook Pro 13-inch']")).getText();
	//	System.out.println(text);
		
	
		
	}

}
