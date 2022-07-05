package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExp {


	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		//WebElement button= driver.findElement(By.id("btnLogin"));
		
		//button.click();
		
		//WebDriverWait wait=new WebDriverWait(driver, 30);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		
	}

}
