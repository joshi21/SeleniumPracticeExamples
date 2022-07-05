package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/");
		
		WebElement radiobutton = driver.findElement(By.xpath("//img[@src='images/radio.png']"));
		radiobutton.click();
		
		WebElement yesoption =driver.findElement(By.xpath("//input[@value='0']"));
		yesoption.click();
		
		WebElement checked =driver.findElement(By.xpath("//input[@value='1']/following::input[2]"));
		boolean status = checked.isSelected();
		System.out.println(status);
		
		WebElement first =driver.findElement(By.name("age"));
		first.click();
		

	}

}
