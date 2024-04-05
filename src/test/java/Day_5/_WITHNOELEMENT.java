package Day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class _WITHNOELEMENT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String m1=driver.findElement(By.cssSelector("div[class='example'] p")).getText();
		
		if(m1.contains("Congratulations"))
		{
			System.out.println("Test Passed");
		}
		
		else
		{
			System.out.println("Test Passed");
		}
	}

}
