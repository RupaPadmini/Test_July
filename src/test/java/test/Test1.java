package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	
	
@BeforeTest
public static void Openbrowser() {
	System.out.println("Opening browser");
	
}

@Test
public static void Openurl() {
	
	Assert.assertTrue(false);
	System.out.println("Opening url.....");
}

@Test(priority = 1, dependsOnMethods = {"Openurl"},alwaysRun = true)
public static void Login() {
	System.out.println("Logging in....");
}

@Test(invocationCount = 2, enabled =false)
public static void Cartbutton() {
	System.out.println("Check cart button");
}

@AfterTest
public static void closebrowser() {
	System.out.println("closing browser");
}

}
