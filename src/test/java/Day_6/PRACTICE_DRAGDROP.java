package Day_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PRACTICE_DRAGDROP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement box=driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement account=driver.findElement(By.id("bank"));
		
		WebElement box1=driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
		WebElement amt=driver.findElement(By.id("amt7"));
		
		WebElement box2=driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
		WebElement acc1=driver.findElement(By.xpath("//*[@class=\"field15 ui-droppable ui-sortable\"]"));
		
		WebElement box3=driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
		WebElement amt2=driver.findElement(By.id("amt8"));
		
		
		Actions act=new Actions(driver);
		act.dragAndDrop(box, account).perform();
		act.dragAndDrop(box1, amt).build().perform();
		act.dragAndDrop(box2, acc1).perform();
		act.dragAndDrop(box3, amt2).perform();
		
	}

}
