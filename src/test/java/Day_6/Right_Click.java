package Day_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		Actions act =new Actions(driver);
		act.contextClick(button).build().perform();
		
		driver.findElement(By.xpath("/html/body/ul/li[3]"));
		driver.switchTo().alert().accept();
		
		
	}

}
