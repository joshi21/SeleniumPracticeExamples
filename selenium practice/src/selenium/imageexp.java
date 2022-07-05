package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class imageexp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/");
		WebElement imagelink=driver.findElement(By.xpath("//img[@alt='Images']"));
		imagelink.click();
		WebElement image = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		
		//naturalWidth=0;
		if(image.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("Image is broken");
		}
		
	}

}
