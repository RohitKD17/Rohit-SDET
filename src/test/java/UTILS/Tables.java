package UTILS;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Approach for single table on web page
		int rows=driver.findElements(By.tagName("tr")).size();
		System.out.println("Total no. of rows " + rows);
		
		//Approach 2 for multiple tables
		int rows1=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Total no. of rows " + rows);
		
		//for columns multiple
		int col=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Total no. of column " + col);
		
		//for columns single
		int col1=driver.findElements(By.tagName("th")).size();
		System.out.println("Total no. of column " + col1);
		
		String text=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
		System.out.println(text);
		
		//for reading data from all rows and columns
		
		
	/*	System.out.println("BookName" + "  " + "Author" + "  " + "Subject" + "  " + "Price" + "  ");
		for(int r=2;r<rows1;r++)
		{
			for(int c=1;c<=col;c++)
			{
				String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(data);
				
			}
			System.out.println();
		}*/
		
		//For 
		for(int r=2;r<rows1;r++)
		{
			String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			
			if(data.equals("Mukesh"))
			{
				String Book=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(Book);
				
			}
		}
		int sum=0;
		for(int r=2;r<=rows1;r++)
		{
		String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		sum=sum+Integer.parseInt(price); //typecasting
		}
		
		System.out.println("Addition of all price of book is : " + sum);
		
	}

}
