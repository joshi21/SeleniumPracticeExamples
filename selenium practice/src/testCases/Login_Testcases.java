package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.LoginPageObject;
import pageObject.PendingLeaveRequestPageObject;

public class Login_Testcases {

	@Test
	public void logintestcase() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	PageFactory.initElements(driver, LoginPageObject.class);
	LoginPageObject.username.sendKeys("Admin");
	LoginPageObject.password.sendKeys("admin123");
	LoginPageObject.loginbutton.click();
	
	PageFactory.initElements(driver, PendingLeaveRequestPageObject.class);
	String text=PendingLeaveRequestPageObject.pendingleaverequest.getText();
	System.out.println(text);
	
	
}
}
