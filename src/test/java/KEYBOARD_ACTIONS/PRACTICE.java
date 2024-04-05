package KEYBOARD_ACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PRACTICE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		driver.findElement(By.id("target")).click();
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).perform();
		
		String text=driver.findElement(By.id("result")).getText();
		System.out.println(text);
		if(text.equals("You entered: CONTROL"))
		{
			System.out.println("The Key is correct ");
		}
		else
		{
			System.out.println("The Key is incorrect ");
		}
	}

}
