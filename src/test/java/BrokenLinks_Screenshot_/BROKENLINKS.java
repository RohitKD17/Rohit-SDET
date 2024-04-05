package BrokenLinks_Screenshot_;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BROKENLINKS {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		List <WebElement> E1=driver.findElements(By.tagName("a"));
		System.out.println("The total number of links are : " + E1.size());
		
		int brokenlink=0; //for storing the no. of broken links
		
		for(WebElement Links:E1)
		{
			String hrefvalue=Links.getAttribute("href");
			
			if(hrefvalue==null || hrefvalue.isEmpty())
			{
				System.out.println("href value is empty");
				continue;
			}
			
			//connection---open ,send
			URL linkurl = new URL(hrefvalue); //convert string to url
			
			HttpURLConnection Conn=(HttpURLConnection) linkurl.openConnection(); //sending request to server
			Conn.connect();
			
			if(Conn.getResponseCode()>400)  //getResponseCode gives ths status code
			{
				System.out.println(hrefvalue + "Broken Link");
			}
			else
			{
				System.out.println(hrefvalue + "Not Broken Link");
			}
		}
		
		System.out.println("Total no. of broken links are");
			
	}
}


