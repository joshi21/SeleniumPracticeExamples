package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleSelect {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");
		
		List<WebElement> selectable=driver.findElements(By.xpath("//ol[@id='selectable']//li"));
		Actions actions=new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(2)).click(selectable.get(4)).build().perform();
	}
}