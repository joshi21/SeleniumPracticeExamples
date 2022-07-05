package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/drop.html");
		
		WebElement fromElement=driver.findElement(By.id("draggable"));
		WebElement toElement=driver.findElement(By.id("droppable"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(fromElement, toElement).release(toElement).build().perform();
		
		

	}

}
