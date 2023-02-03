package webDriverConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chrome {
	
	@Test
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\harik\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.orangehrm.com/");
		dr.manage().window().maximize();
		Thread.sleep(1000);
		dr.close();
		
	}

}
