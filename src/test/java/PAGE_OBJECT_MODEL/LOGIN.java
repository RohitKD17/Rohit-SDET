package PAGE_OBJECT_MODEL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOGIN {

	
	WebDriver driver;  //global
	//Constructor
	
	LOGIN(WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	//LOCATE ELEMENT
	
	By logo=By.cssSelector("img[alt='company-branding']");
	By username=By.name("username");
	By password=By.name("password");
	By click= By.xpath("//button[@type='submit']");
	
	//ACTIONS
	
	public void setUserName(String Uname)
	{
		driver.findElement(username).sendKeys(Uname);
	}
	
	public void setPassword(String Pvalue)
	{
		driver.findElement(password).sendKeys(Pvalue);
	}
	
	public void ClickSubmit()
	{
		driver.findElement(click).click();
	}
	
	public boolean CheckLogo()
	{
		Boolean status=driver.findElement(logo).isDisplayed();
		return status;
	}
}
