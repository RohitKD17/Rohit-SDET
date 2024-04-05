package Day_2_Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//className
//tag

//Three Requirements;

public class Two_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://www.automationpractice.pl/index.php");
	
	List <WebElement>sliders=driver.findElements(By.className("homeslider-container"));
	
	System.out.println("The slider contains total images :"  + sliders.size());
	
	//total no. of images available on the page---tag
	
	List<WebElement> image=driver.findElements(By.tagName("img"));
	System.out.println("The page contains total images :"  + image.size());
	
	List<WebElement> Links=driver.findElements(By.tagName("a"));
	System.out.println("The page contains total links :"  + Links.size());
	}

}
