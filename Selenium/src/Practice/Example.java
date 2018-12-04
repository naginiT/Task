package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example {
	WebDriver driver;
	
	@BeforeMethod
		public void m()
		{
	System.setProperty("webdriver.chrome.driver", "D:\\vijaylaxmi\\drivers\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
}
@Test
public void m1()
{
	
		System.out.println("hellos");
		
	}
@AfterMethod
public void m2()
{
	driver.close();
}
	
	
}
