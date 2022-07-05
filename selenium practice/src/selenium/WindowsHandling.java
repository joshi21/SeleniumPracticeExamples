package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		
		String parent=driver.getWindowHandle();
		WebElement homepage=driver.findElement(By.xpath("//button[@id='home']"));
		Thread.sleep(2000);
		homepage.click();
		
		Set<String> windows=driver.getWindowHandles();
		for (String newwindows : windows) {
			driver.switchTo().window(newwindows);
			}
		WebElement edit=driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']"));
		Thread.sleep(2000);
		edit.click();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parent);
		
		WebElement windowscount=driver.findElement(By.xpath("//button[@onclick='openWindows()']"));
		Thread.sleep(2000);
		windowscount.click();
		int totalwindowscount=driver.getWindowHandles().size();
		System.out.println(totalwindowscount);
		Thread.sleep(2000);
		driver.quit();
		

	}

}
