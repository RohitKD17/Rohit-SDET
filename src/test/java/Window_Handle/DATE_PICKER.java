package Window_Handle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DATE_PICKER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		//APPROACH----1
		
	//	driver.switchTo().frame(0);
	//	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("05/15/2024");
		
		//APPROACH----2
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
	//	String year="2026";
	//	String month="June";
	//	String date="25";
		
		//FOR PAST
		String year="2020";
		String month="June";
		String date="25";
		
		while(true)
		{
			String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String mn=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			//String date=driver.findElement(By.xpath("")).getText();
		
		
		if(year.equals(yr) && month.equals(mn))
		{
			break;
		}
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
	//	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		//DATE
		
	    List<WebElement> alldates=	driver.findElements(By.xpath("//*[@class=\"ui-datepicker-calendar\"]//td"));
	    
	    /*for(WebElement dates:alldates)
	    {
	    	if(dates.getText().equals(date))
	    	{
	    		dates.click();
	    		break;
	    	}
	    }*/
	    for(int i=0;i<alldates.size();i++)
	    {
	    	if(alldates.get(i).getText().equals(date))
	    	{
	    		alldates.get(i).click();
	    		break;
	    	}



	    }
	
	}

}
