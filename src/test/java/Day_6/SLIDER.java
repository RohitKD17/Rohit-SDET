package Day_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SLIDER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		// min slider element
	//	WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
	//	System.out.println("Loaction of Slider at initial : " + slider.getLocation());
		
	//	Actions act=new Actions(driver);
	//	act.dragAndDropBy(slider, 100, 0).perform();
		
	//	System.out.println("Loaction of Slider after moved : " + slider.getLocation());
		
		// Max slider element
		
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		System.out.println("Loaction of Slider at initial : " + slider.getLocation());
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider, -100, 0).perform();
		
		System.out.println("Loaction of Slider after moved : " + slider.getLocation());
		
		
	}

}
