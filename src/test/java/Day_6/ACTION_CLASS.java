package Day_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import jdk.javadoc.internal.doclets.toolkit.taglets.snippet.Action;

public class ACTION_CLASS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		Actions act =new Actions(driver);
	//	act.contextClick(button).build().perform();
		
		//build()----creates the steps
		//perform()----execute the steps
		
		Action steps =(Action) act.contextClick(button).build();
		steps.perform();
		
		driver.findElement(By.xpath("/html/body/ul/li[3]"));
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
	}

}
