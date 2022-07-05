package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");
		
		WebElement textbox=driver.findElement(By.id("tags"));
		textbox.sendKeys("s");
		Thread.sleep(2000);
		
		List<WebElement> lists=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		for (WebElement option : lists) {
			if(option.getText().equals("Web Services"))
				option.click();
			break;
			
		}
		
	}

}
