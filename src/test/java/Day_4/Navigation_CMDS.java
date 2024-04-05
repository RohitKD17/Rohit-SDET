package Day_4;

import java.net.MalformedURLException;
import java.net.URL;

import org.bouncycastle.oer.its.etsi102941.Url;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_CMDS {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
	//	driver.get("https://www.amazon.in/");
		
	//	driver.navigate().to("https://www.amazon.in/");
		
		URL url=new URL("https://www.amazon.in/");
		driver.navigate().to(url);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
	}

}
