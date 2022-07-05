package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		
		WebElement alertbutton = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		Thread.sleep(2000);
		alertbutton.click();
		
		org.openqa.selenium.Alert a1=driver.switchTo().alert();
		Thread.sleep(2000);
		a1.accept();
		
		WebElement confirmbox=driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		Thread.sleep(2000);
		confirmbox.click();
		
		org.openqa.selenium.Alert a2=driver.switchTo().alert();
		Thread.sleep(2000);
		a2.dismiss();
		
		WebElement promptbox=driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		Thread.sleep(2000);
		promptbox.click();

		org.openqa.selenium.Alert a3=driver.switchTo().alert();
		a3.sendKeys("Selenium");
		Thread.sleep(2000);
		a3.accept();
	
		
		
		
		
	}

}
