package Day_4;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluent_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		FluentWait mywait =new FluentWait(driver);
		
		mywait.withTimeout(Duration.ofSeconds(30));
		mywait.pollingEvery(Duration.ofSeconds(5));
		mywait.ignoring(NoSuchElementException.class);
		
		driver.get("");
		
		mywait.until(ExpextedConditions)
	}

}
