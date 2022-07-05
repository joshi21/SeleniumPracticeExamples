package testNG;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups= {"Apple"})
	public void apple() {
		System.out.println("This is Apple fruit");
	}
	@Test(groups= {"Orange"})
	public void orange() {
		System.out.println("This is orange fruit");
	}
	@Test(groups= {"Mango"})
	public void mango() {
		System.out.println("This is mango fruit");
	}
	@Test(groups= {"Banana"})
	public void banana() {
		System.out.println("This is banana fruit");
	}




}
