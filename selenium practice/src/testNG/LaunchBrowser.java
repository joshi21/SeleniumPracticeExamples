package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchBrowser {
WebDriver driver;
	@BeforeTest
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		
	}
	@Test
	public void open() {
		driver.get("https://www.google.com");
	}
	@AfterTest
	public void close() {
		driver.close();
		
	}
	
}
