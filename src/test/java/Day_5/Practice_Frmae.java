package Day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Frmae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.switchTo().frame("id3");
		driver.findElement(By.name("mytext3")).sendKeys("halluu");
	}

}
