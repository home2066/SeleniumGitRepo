package basicPgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstSamplePgm {
	
	@Test
	public void sample()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PRIYA\\selenium jars and drivers\\drivers\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
	}
	

}
