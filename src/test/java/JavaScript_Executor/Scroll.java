package JavaScript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		//	WebDriver driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://testautomationpractice.blogspot.com/");
			
			JavascriptExecutor js= driver;
			
			//Scroll by pixel
		//	js.executeScript("window.scrollBy(0,3000)", " ");
		//	System.out.println(js.executeScript("return window.pageYOffset;", args));
			
			//Scroll down to specific element
		//	WebElement table=driver.findElement(By.xpath("//*[@id=\"HTML7\"]/h2"));
		//	js.executeScript("arguments[0].scrollIntoView();", table);
		//	System.out.println(js.executeScript("return window.pageYOffset;", args));
			
			
			//Scroll to end of the page
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)", args);
			System.out.println(js.executeScript("return window.pageYOffset;", args));
			
			//Scroll to start of page
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", args);
				System.out.println(js.executeScript("return window.pageYOffset;", args));
		}
			
			
			
	}


