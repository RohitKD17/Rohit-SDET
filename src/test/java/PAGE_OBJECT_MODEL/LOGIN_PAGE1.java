package PAGE_OBJECT_MODEL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOGIN_PAGE1 {

	WebDriver driver;  //global
	//Constructor
	
	LOGIN_PAGE1(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css="img[alt='company-branding']")
	WebElement logo;
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement click;
	//LOCATE ELEMENT
	
	//By logo=By.cssSelector("img[alt='company-branding']");
	//By username=By.name("username");
	//By password=By.name("password");
	//By click= By.xpath("//button[@type='submit']");
	
	//ACTIONS
	
	public void setUserName(String Uname)
	{
		//driver.findElement(username).sendKeys(Uname);
		username.sendKeys(Uname);
	}
	
	public void setPassword(String Pvalue)
	{
		//driver.findElement(password).sendKeys(Pvalue);
		password.sendKeys(Pvalue);
	}
	
	public void ClickSubmit()
	{
		//driver.findElement(click).click();
		click.click();
	}
	
	public boolean CheckLogo()
	{
		//Boolean status=driver.findElement(logo).isDisplayed();
		boolean status=logo.isDisplayed();
		return status;
	}
}


