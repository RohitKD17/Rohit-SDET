import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOUSE_HOVER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
	//	WebElement Desktops=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	//	WebElement Mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
	//	Actions act = new Actions(driver);
		
		//Mouse Hover---moveElement()
		
	//	act.moveToElement(Desktops).moveToElement(Mac).click().build().perform();
		
		WebElement Laptop=driver.findElement(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));
		WebElement Window=driver.findElement(By.xpath("//a[normalize-space()='Windows (0)']"));
		
		Actions act1 = new Actions(driver);
		
		act1.moveToElement(Laptop).moveToElement(Window).click().perform();
	}

}
