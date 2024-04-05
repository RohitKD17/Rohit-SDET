package Day_5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HANDLE_DROPDOWN_BOOTSTRAP {
	
	//WITHOUT SELECTING TAG

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[@title='HTML, CSS']")).click();
		
		List<WebElement> all=(List<WebElement>) driver.findElements(By.xpath("//*[@class=\"multiselect-container dropdown-menu\"]/child::*"));
		
	    System.out.println("The total no. of items under dropdown : " + all.size());
	    
	/*    for(WebElement List:all)
	    {
	    	System.out.println(List.getText());
	    }
	    
	    for(int i=0;i<all.size();i++)
	    {
	    	System.out.println(all.get(i).getText());
	    } 
	    
	    //select the option from dropdown
	    
	    for(int i=0;i<all.size();i++)
	    {
	    	if(all.get(i).getText().equals("Java"))
	    	{
	    		all.get(i).click();
	    	}
	    } */
	    
	    for(int i=0;i<all.size();i++)
	    {
	    String	optionName=all.get(i).getText();
	    
	    if(optionName.equals("Java") || optionName.equals("Python"))
	    {
	    	all.get(i).click();
	    }
	    }
		
	}

}
