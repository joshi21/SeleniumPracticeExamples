package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PendingLeaveRequestPageObject {

	@FindBy(xpath="//legend[text()='Pending Leave Requests']//following::td[1]")
	public static WebElement pendingleaverequest;
}
