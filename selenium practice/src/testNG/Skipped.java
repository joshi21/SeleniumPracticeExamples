package testNG;

import org.testng.annotations.Test;

public class Skipped {

	@Test	
	public void method1() {
	System.out.println("This is method1");
}
	@Test(enabled=false)
	public void method2() {
		System.out.println("This is method2");
	}

}
