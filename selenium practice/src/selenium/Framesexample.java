package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesexample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		WebElement frames= driver.findElement(By.xpath("//button[@id='Click']"));
		Thread.sleep(2000);
		frames.click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement nestedframe= driver.findElement(By.xpath("//button[@id='Click1']"));
		Thread.sleep(2000);
		nestedframe.click();
		driver.switchTo().defaultContent();
		
		List<WebElement> framescount=driver.findElements(By.tagName("iframe"));
		int totalframes=framescount.size();
		System.out.println(totalframes);
	}

}
