package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	String name="deepa";
	@Test
	public void checking() {
		Assert.assertEquals(name, "Deepa");
	}

}
