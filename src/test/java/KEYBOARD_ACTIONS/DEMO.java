package KEYBOARD_ACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		
		driver.findElement(By.id("inputText1")).sendKeys("Halluuu");
		
		Actions act = new Actions(driver);
		
		
		// CNTRL + A
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		//Another way of writing
	//	act.keyDown(Keys.CONTROL)
	//	.sendKeys("a")
	//	.keyUp(Keys.CONTROL)
	//	.perform();
		
		// CNTRL + C
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		//tab
		
		act.sendKeys(Keys.TAB);
		
		//CNTRL + V
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	}

}
