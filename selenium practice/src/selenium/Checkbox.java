package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/");
		
		WebElement check = driver.findElement(By.xpath("//img[@alt='Checkbox']"));
		check.click();
		
		WebElement java = driver.findElement(By.xpath("//div[@class='example']/child::input[1]"));
		java.click();

		WebElement sql = driver.findElement(By.xpath("//div[@class='example']/child::input[3]"));
		sql.click();

		WebElement confirm =driver.findElement(By.xpath("//div[@class='example']/following::input[1]"));
		boolean status= confirm.isSelected();
		System.out.println(status);
		
		WebElement deselect =driver.findElement(By.xpath("//div[@class='example']/following::input[3]"));
		if (deselect.isSelected())
			{
					deselect.click();
			}
		
		
		WebElement option1 =driver.findElement(By.xpath("//div[@class='example']/following::input[4]"));
		option1.click();
		WebElement option2 =driver.findElement(By.xpath("//div[@class='example']/following::input[5]"));
		option2.click();
		WebElement option3 =driver.findElement(By.xpath("//div[@class='example']/following::input[6]"));
		option3.click();
		WebElement option4 =driver.findElement(By.xpath("//div[@class='example']/following::input[7]"));
		option4.click();
		WebElement option5 =driver.findElement(By.xpath("//div[@class='example']/following::input[8]"));
		option5.click();
		WebElement option6 =driver.findElement(By.xpath("//div[@class='example']/following::input[9]"));
		option6.click();
	}

}
