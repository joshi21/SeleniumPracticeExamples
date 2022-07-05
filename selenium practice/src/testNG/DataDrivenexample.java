package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenexample {
	
	String data[][]=null;
	
	@DataProvider(name="logindata")
	public String[][] logindataprovider() throws BiffException, IOException {
		data=getExcel();
		return data;
		
	}
	@Test
	public String[][] getExcel() throws BiffException, IOException {
		FileInputStream stream= new FileInputStream("C:\\Users\\Deepa\\Downloads\\TestData.xls");
		Workbook workbook= Workbook.getWorkbook(stream);
		Sheet sheet= workbook.getSheet(0);
		int rowCount=sheet.getRows();
		int columnCount=sheet.getColumns();
		String data[][]=new String[rowCount-1][columnCount];
		
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<columnCount;j++) {
				data[i-1][j]=sheet.getCell(j, i).getContents();
			}
		}
		return data;
		
	}
	
	
	@Test(dataProvider = "logindata")
	public void login(String uName, String pword) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys(uName);
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(pword);
		WebElement button= driver.findElement(By.id("btnLogin"));
		button.click();
		
	}

}
