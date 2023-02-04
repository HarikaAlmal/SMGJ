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
		Thread.sleep(1000);
		System.out.println("helloo___________________________________________");
		dr.get("https://www.orangehrm.com/");
		Thread.sleep(1000);
		System.out.println("helloo___________________________________________");
		dr.manage().window().maximize();
		System.out.println("helloo___________________________________________");
		Thread.sleep(1000);
		dr.close(); 
		//changes
		
	}

}
