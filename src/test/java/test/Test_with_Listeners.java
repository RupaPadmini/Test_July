package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(test.MyListeners.class)
public class Test_with_Listeners {

	@Parameters("brw")
	@BeforeTest
	public static void browser(String brw) {
		if(brw.contentEquals("chrome")) {
			System.out.println("chome browser opened...");
		}
		else
		{
			System.out.println("edge");
		}
	}
	@Test(priority = 1)
	public static void Openbrowser() {
		System.out.println("browser opened");
	}
	@Test(priority = 2)
	public static void Setup() {
		AssertJUnit.fail();
	}
	@Test(dependsOnMethods = {"Setup"})
	public static void testcase() {
		System.out.println("testcase 3 executed");
	}
}
