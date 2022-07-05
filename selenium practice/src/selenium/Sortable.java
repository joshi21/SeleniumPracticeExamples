package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/sortable.html");
		
		List<WebElement> sortable=driver.findElements(By.xpath("//ul[@id='sortable']//li"));
		WebElement fromElement=sortable.get(1);
		WebElement toElement=sortable.get(6);
		
		Actions actions=new Actions(driver);
		actions.clickAndHold(fromElement).moveToElement(toElement).release(toElement).build().perform();
		
		

	}

}
