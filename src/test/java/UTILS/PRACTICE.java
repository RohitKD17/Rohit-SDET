package UTILS;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class PRACTICE {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		
	    String file=	System.getProperty("user.dir") + "\\ExcelFiles\\Utils.xlsx";
	    int row=ExcelUtils.getRowCount(file, "Sheet2");
	    
	    //Read the data from excel
	    for(int i=1;i<=row;i++)
	    {
	    	String deposit=ExcelUtils.getCellData(file, "Sheet2", i, 0);
	    	String Months=ExcelUtils.getCellData(file, "Sheet2", i, 1);
	    	String Roi=ExcelUtils.getCellData(file, "Sheet2", i, 2);
	    	String Compounding=ExcelUtils.getCellData(file, "Sheet2", i, 3);
	    	String Annual=ExcelUtils.getCellData(file, "Sheet2", i, 4);
	    	
	    	//PASS THE DATA TO APPLICATION
	    	
	    	driver.findElement(By.id("mat-input-0")).clear();
	    	driver.findElement(By.id("mat-input-0")).sendKeys(deposit);
	    	driver.findElement(By.id("mat-input-1")).clear();
	    	driver.findElement(By.id("mat-input-1")).sendKeys(Months);
	    	driver.findElement(By.id("mat-input-2")).clear();
	    	driver.findElement(By.id("mat-input-2")).sendKeys(Roi);
	    	
	    	//for dropdown element
	    	
	    //	Select drop=new Select(driver.findElement(By.id("mat-select-value-1")));
	    //	drop.deselectAll();
	    //	drop.selectByVisibleText(Compounding);
	    	
	    	//Clicking button
	    //	WebElement p=driver.findElement(By.id("cdAPY"));
	    //	driver.findElement(RelativeLocator.with(By.tagName("div")).below(p)).click();
	    	driver.findElement(By.id("CIT-chart-submit")).click();
	    	String actual=driver.findElement(By.id("cdAPY")).getText();
	    	System.out.println(actual);
	    	
	    	if(Double.parseDouble(Annual)==Double.parseDouble(actual))
	    	{
	    		System.out.println("Test Passed");
	    		
	    		ExcelUtils.setCellData(file, "Sheet2", i, 4, "Passed");
	    		ExcelUtils.fillGreenColor(file, "Sheet2", i, 4);
	    	}
	    	else
	    	{
                System.out.println("Test Failed");
	    		
	    		ExcelUtils.setCellData(file, "Sheet2", i, 4, "Failed");
	    		ExcelUtils.fillGreenColor(file, "Sheet2", i, 4);
	    	}
	    	
	    	
	    }
	    
	
	}

}
