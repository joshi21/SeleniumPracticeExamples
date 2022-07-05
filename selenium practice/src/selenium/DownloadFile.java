package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infycletechnologies.com/testing/pages/download.html");
		
		WebElement downloadlink=driver.findElement(By.linkText("Download Excel"));
		downloadlink.click();
		
		File filelocation=new File("C:\\Users\\Deepa\\Downloads");
		File[] allfiles=filelocation.listFiles();
		for (File file : allfiles) {
			if(file.getName().equals("Infycle (6).xlsx")) {
				System.out.println("file is downloaded");
			break;
		}
		

	}

}
}
