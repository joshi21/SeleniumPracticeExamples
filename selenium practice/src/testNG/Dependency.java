package testNG;

import org.testng.annotations.Test;

public class Dependency {
	@Test(enabled=true,priority=0)
	public void method1() {
	System.out.println("This is method1");
}
	@Test(dependsOnMethods = "method1",priority=1)
	public void method2() {
		System.out.println("This is method2");
	}
	@Test(priority=2)
	public void method3() {
		System.out.println("This is method3");
	}


}
