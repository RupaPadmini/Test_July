package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
	@Parameters("usrname")
	@Test(priority =1)
	public static void Myaccount(String usrname) {
		System.out.println(usrname);
		System.out.println("My Account Opened");
	}
	@Parameters("pswd")
	@Test
	public static void ABC(String psw) {
		System.out.println(psw);
		System.out.println("Sample test case");
	}

}
