package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		WebElement username=driver.findElement(By.id("txtUsername"));
		Thread.sleep(2000);
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		Thread.sleep(2000);
		password.sendKeys("admin123");
		
		WebElement loginbutton =driver.findElement(By.id("btnLogin"));
		loginbutton.click();
		
		WebElement forgetlink = driver.findElement(By.linkText("Forgot your password?"));
		forgetlink.click();
		
		WebElement textbox=driver.findElement(By.id("securityAuthentication_userName"));
		textbox.sendKeys("Selenium");
		
		WebElement resetpwd =driver.findElement(By.id("btnSearchValues"));
		resetpwd.click();
	}

}
