package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement dropdown=driver.findElement(By.id("dropdown1"));
		//dropdown.click();
		
		Select s=new Select(dropdown);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("1");
		Thread.sleep(2000);
		s.selectByVisibleText("Appium");
		Thread.sleep(2000);
		dropdown.sendKeys("Loadrunner");
		
		int totalcount=s.getOptions().size();
		System.out.println(totalcount);
	}

}
