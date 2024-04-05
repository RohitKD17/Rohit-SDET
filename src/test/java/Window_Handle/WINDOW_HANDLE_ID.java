package Window_Handle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WINDOW_HANDLE_ID {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set <String> Wid=driver.getWindowHandles();
		
		//APPROACH----1  LIST-----ARRAYLIST,SET
		
	/*	List<String> L1=new ArrayList(Wid);
		String parentWid =L1.get(0);
		String childWid  =L1.get(1);
		
		driver.switchTo().window(childWid);  //
		
		
		System.out.println()*/
		
		
		
		
		//APPROACH --2 
		for(String Winid:Wid)
		{
			String Title= driver.switchTo().window(Winid).getTitle();
			
			if(Title.equals("Human Resources Management Software | OrangeHRM"))
			{
				Thread.sleep(3000);
			//	driver.close();
			//	driver.findElement(By.xpath("//*[contains(text(),\"Service Privacy Policy\")]")).click();
			//	Thread.sleep(3000);
			//	System.out.println(driver.getTitle());
				
			}
			else if(Title.equals("OrangeHRM"))
				
			{
			//	Thread.sleep(3000);
				driver.findElement(By.name("username")).sendKeys("Haallluu");
			//	Thread.sleep(3000);
				System.out.println(driver.getTitle());
			}
		}
		
	}

}
