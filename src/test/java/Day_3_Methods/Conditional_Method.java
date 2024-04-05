package Day_3_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		
		WebElement Register =driver.findElement(By.xpath("//h1[normalize-space()='Register']"));
				
		Boolean Display=Register.isDisplayed();
		System.out.println("The Register Text is available: " + Display);
		
		WebElement textbox2=driver.findElement(By.xpath("//input[@id='LastName']"));
		
		System.out.println("The textbox2 is visible :" + textbox2.isDisplayed());
		
		System.out.println("The textbox2 is visible :" + textbox2.isEnabled());
		
		WebElement MRadiobutton=driver.findElement(By.xpath("//input[@id='gender-male']"));
		
        System.out.println("The Male radiobutton is visible :" + MRadiobutton.isDisplayed());
		
		System.out.println("The Male radiobutton is enabled :" + MRadiobutton.isEnabled());
		MRadiobutton.click();
		
	}

}
