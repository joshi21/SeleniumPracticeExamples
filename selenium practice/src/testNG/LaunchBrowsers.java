package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

public class LaunchBrowsers {
	WebDriver driver;
	@BeforeSuite
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		
	}
	@Test
	public void google() {
		driver.get("https://www.google.com");
	}
	@Test
	public void bingo() {
		driver.get("https://www.bingo.com");
	}
	@AfterSuite
	public void close() {
		driver.close();
	}


}
