package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		List<WebElement> columns=driver.findElements(By.tagName("th"));
		int totalcolumns=columns.size();
		System.out.println(totalcolumns);
		
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int totalrows=rows.size();
		System.out.println(totalrows);
		
		List<WebElement> cells=driver.findElements(By.tagName("td"));
		int totalcells=cells.size();
		System.out.println(totalcells);
		
		WebElement getpetcentage=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']/following::td[1]"));
		String value=getpetcentage.getText();
		System.out.println(value);
	}

}
