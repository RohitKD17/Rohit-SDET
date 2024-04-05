package Day_3_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	//	Thread.sleep(3000);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
	//	driver.close();
		driver.quit();
	}

}
