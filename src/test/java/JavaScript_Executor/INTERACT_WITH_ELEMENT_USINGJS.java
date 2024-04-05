package JavaScript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
public class INTERACT_WITH_ELEMENT_USINGJS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
	//	WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js= driver;
		
		WebElement inputbox=driver.findElement(By.id("name"));
		js.executeScript("arguments[0].setAttribute('value','Reacher')",inputbox);  //javascript
		
		WebElement ib=driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','Rea@gamail.com')", ib);
		
		WebElement ib1=driver.findElement(By.id("phone"));
		js.executeScript("arguments[0].setAttribute('value','1234567890')", ib1);
		
		WebElement ib11=driver.findElement(By.id("phone"));
		js.executeScript("arguments[0].setAttribute('value','1234567890')", ib11);
		
		
		//Radiobutton
		WebElement male=driver.findElement(By.id("male"));
		js.executeScript("arguments[0].click();", male);
	 
		
		//Checkboxes
		WebElement chk=driver.findElement(By.id("monday"));
		js.executeScript("arguments[0].click();", chk);
		
		//Button
		WebElement button=driver.findElement(By.id("FSsubmit"));
		js.executeScript("arguments[0].click();", button);
		
		//Dropdown
		WebElement dd=driver.findElement(By.id("country"));
		js.executeScript("arguments[0].click();", dd);
		
		//USe javascript to select an option from dropdown
		String option="";
		String script= "arguments[0].'value'" + option +"';";
		
		driver.executeScript(script, dd);
		
		//Verify selection if needed
		String selectedoption=(String) js.executeScript("return arguments[0].value;", dd);
		System.out.println("Selected option is : " + selectedoption);
		
	}

}
