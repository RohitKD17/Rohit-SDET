package Day_6;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GETLOCATION_DEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
		
		System.out.println("The value of element before maximize : " + logo.getLocation());
		
		driver.manage().window().maximize();
		System.out.println("The value of element after maximize : " + logo.getLocation());
		
		driver.manage().window().fullscreen();  //fullscreen wil,l not show tabs 
		System.out.println("The value of element after fullscreen : " + logo.getLocation());
		
		Point p=new Point(84,35);
		driver.manage().window().setPosition(p);
		System.out.println("The value of element after setting positions : " + logo.getLocation());
		
		
		
	}

}
