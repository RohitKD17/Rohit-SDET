import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("mobiles");	//tag and class name 
		
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("mobiles");
	}

}
