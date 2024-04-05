package UTILS;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FixedDepositCalculator {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		
		String file=System.getProperty("user.dir") + "\\ExcelFiles\\Utils.xlsx";
		
		int rows=ExcelUtils.getRowCount(file, "Sheet1"); //no. of rows from excel table
		
		//read the data from excel
		
		for(int i=1;i<=rows;i++)
		{
			String Princple=ExcelUtils.getCellData(file, "Sheet1", i, 0);
			String Roi=ExcelUtils.getCellData(file, "Sheet1", i, 1);
			String Period=ExcelUtils.getCellData(file, "Sheet1", i, 2);
			String Time=ExcelUtils.getCellData(file, "Sheet1", i, 3);
			String Frequency=ExcelUtils.getCellData(file, "Sheet1", i, 4);
			String Maturity=ExcelUtils.getCellData(file, "Sheet1", i, 5);
		
		
		
		//pass the data to application
		
		driver.findElement(By.id("principal")).sendKeys(Princple);
		driver.findElement(By.id("interest")).sendKeys(Roi);
		driver.findElement(By.id("tenure")).sendKeys(Period);
		Select drpdwn=new Select(driver.findElement(By.id("tenurePeriod")));
		drpdwn.selectByVisibleText(Time);
		
		
		Select drp=new Select(driver.findElement(By.name("frequency")));
		drpdwn.selectByVisibleText(Frequency);
		
		
		
		//Clicking on calculate button
		
		driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
		
		
		String act_mvalue=driver.findElement(By.xpath("//*[@id=\"response_div\"]/div/div[2]/span[1]")).getText();
		
		if(Double.parseDouble(Maturity)==Double.parseDouble(act_mvalue))
		{
			System.out.println("Test Passed");
			
			ExcelUtils.setCellData(file, "Sheet1", i, 7, "Passed");
			ExcelUtils.fillGreenColor(file, "Sheet1", i, 7);
		}
		else
		{
            System.out.println("Test Failed");
			
			ExcelUtils.setCellData(file, "Sheet1", i, 7, "Failed");
			ExcelUtils.fillRedColor(file, "Sheet1", i, 7);
			
		}
		
		
		
		
		//validation and write the data to table
		driver.findElement(By.xpath("//img[@class='PL5']")).click();
		
		}	
	}

}
