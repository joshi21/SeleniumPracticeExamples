package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassingParameters {
	@Test
	@Parameters("Name")
	public void print(String value) {
		System.out.println(value);
	}
}
