package Day_4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HANDLE_CHECKBOXES {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
	//	driver.findElement(By.id("monday")).click();
		
		//Count no. of checkBoxes 
		List <WebElement> E1=driver.findElements(By.xpath("//*[@class=\"form-check-input\"][@type=\"checkbox\"]"));
		System.out.println(E1.size());
		
		//Select all the check-boxes
		
	//	for(int i=0;i<E1.size();i++)
	//	{
	//		E1.get(i).click();
	//		
	//	}
		
	//	for(WebElement Checkboxes:E1) 
	//	{
	//		Checkboxes.click();
	//	}
		
		//Selecting Bottom two or 3
		
	//	for(int i=4;i<E1.size();i++)
	//	{
	//		E1.get(i).click();
	//	}
		
		//Selecting first two
		
	//	for(int i=0;i<2;i++)
	//	{
	//		E1.get(i).click();
	//	}
		
		//UNCHECKED OR CLEAR CHECKBOXES
		
	//	for(WebElement Checkboxes:E1) 
			//	{
		//			Checkboxes.click();
		//		}
		
	//	Thread.sleep(3000);
	//	for(WebElement Checkboxes:E1) 
	//	{
		//	Checkboxes.click();
	//	}

	
	    //for selecting unselecting first three
	for(int i=0;i<3;i++)
			{
				E1.get(i).click();
			}
	
	Thread.sleep(3000);
	for(int i=0;i<3;i++)
	{
		E1.get(i).click();
	}
	
	//REQUIREMENT IS ONLY TO UNSELECT IF THE CHECKBOX IS SELECTED
	
	for(int i=0;i<3;i++)
	{
		E1.get(i).click();
	}
	
	for(int i=0;i<E1.size();i++)
	{
		if(E1.get(i).isSelected())
				{
			E1.get(i).click();
				}
	}
	
}
}