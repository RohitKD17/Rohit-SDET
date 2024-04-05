package ASSIGNMENT_2_LOCATORS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DROPDOWN_VISIBLETEXT {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		WebElement dd=driver.findElement(By.id("country-list"));
		dd.click();
		Select drp =new Select(dd);
		drp.selectByVisibleText("India");
		Thread.sleep(3000);
		String Country=drp.getFirstSelectedOption().getText();
		System.out.println(Country);
		
		WebElement dd1=driver.findElement(By.name("state"));
		dd1.click();
		
		Select drp1 =new Select(dd1);
		drp1.selectByVisibleText("Haryana");
		String State=drp1.getFirstSelectedOption().getText();
		System.out.println(State);
		
		
		
	}

}
