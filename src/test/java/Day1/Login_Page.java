package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Page {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	//	System.setProperty("webdriver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//this approcah is also previous
		//WebDriverManager.ChromeDriver().setup();
		
		
		ChromeDriver driver=new ChromeDriver();   //open the browser
		
	   // driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.7.0");	
	    
	    /*driver.get("https://demo.guru99.com/test/newtours/index.php");   //open the given url
	    
	    driver.findElement(By.name("userName")).sendKeys("mercury");
	    
	    driver.findElement(By.name("password")).sendKeys("mercury");
	    
	    driver.findElement(By.name("submit")).click();
	    
	    
	    String act_value = driver.getTitle();
	    
	    String exp_value="Login: Mercury Tours";
	    
	    if(act_value.equals(exp_value))
	    {
	    	System.out.println("test is passed");
	    }
	    else
	    {
	    	System.out.println("test is fail");
	    }
	    driver.close();*/
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		Thread.sleep(3000);
		driver.findElement(By.className("oxd-button")).click();
		
		String act_value =driver.getTitle();
		
		String exp_value="OrangeHRM";
				
				if(act_value.equals(exp_value))
			    {
			    	System.out.println("test is passed");
			    }
			    else
			    {
			    	System.out.println("test is fail");
			    }		
	    }

}
