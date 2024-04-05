package BrokenLinks_Screenshot_;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
public class SCREENSHOT_DEMO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		TakesScreenshot ts=driver;
	//	File src = ts.getScreenshotAs(OutputType.FILE);
	//	File trg=new File("D:\\eclipse\\Selenium_Mavin\\src\\test\\java\\BrokenLinks_Screenshot_\\sCREENSHOT.png");
	//	FileUtils.copyFile(src, trg);
		
	WebElement search=	driver.findElement(By.id("small-searchterms"));
		File logo = search.getScreenshotAs(OutputType.FILE);
		File trg=new File("D:\\eclipse\\Selenium_Mavin\\src\\test\\java\\logo.png");
		FileUtils.copyFile(logo, trg);
		
	//	WebElement fl = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	//	File logo= fl.getScreenshotAs(OutputType.FILE);
	//	File sc2 =new File("D:\\eclipse\\Selenium_Mavin\\src\\test\\java\\ScreenShot\\logo.png");
	//	FileUtils.copyFile(logo, sc2);
		
		
		
		
	}

}
