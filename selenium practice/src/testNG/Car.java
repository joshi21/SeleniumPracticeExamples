package testNG;

import org.testng.annotations.Test;

public class Car {

	@Test(priority = 0)
	public void startthecar() {
		System.out.println("start the car");
	}
	@Test(priority = 1)
	public void putfirstgear() {
		System.out.println("firstgear");
	}
	@Test(priority = 2)
	public void putsecondgear() {
		System.out.println("secondgear");
	}
	@Test(priority = 3)
	public void putthirdgear() {
		System.out.println("thirdgear");
	}
	@Test(priority = 4)
	public void putfourthgear() {
		System.out.println("fourthgear");
	}
}
