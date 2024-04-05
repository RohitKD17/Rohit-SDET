package Day_4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HANDLE_DROPDOWN {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		
		WebElement dd=driver.findElement(By.xpath("//select[@id='country-list']"));
		Select drp=new Select(dd);  //DROPDOWN
		
		//SELECTING AN OPTION FROM DROP DOWN
		
		drp.selectByVisibleText("India");
		Thread.sleep(3000);
		
	//	drp.selectByIndex(4);
	//	Thread.sleep(3000);
		
	//	drp.selectByValue("4");  //VALUE ATTRIBUTE APPLICABLE ONLY WHEN VALUE IS GIVEN
		
		WebElement dd1=driver.findElement(By.xpath("//select[@id='state-list']"));
		Select drp1=new Select(dd1);
		
	//	drp1.selectByValue("23");
	
	//	drp1.selectByVisibleText("Delhi");
	
		
	//	drp1.selectByIndex(3);
		
		
		//TOTAL NO. OF OPTIONS---- COUNT
	/*	List <WebElement> options=drp.getOptions();
		System.out.println(options.size());
	
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}*/
		
		List <WebElement> option=drp1.getOptions();
		System.out.println(option.size());
		for(WebElement op1:option)
		{
			System.out.println(op1.getText());
		}
		
	}

}
