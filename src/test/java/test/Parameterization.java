package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Parameterization {
	
	@Test(dataProvider = "users")
	public static void Login(String usrname,String pswd) throws InterruptedException {
		WebDriver driver = WebDriverManager.firefoxdriver().create();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(usrname);
		driver.findElement(By.id("password")).sendKeys(pswd);
		driver.findElement(By.id("login-button")).click();
		//Assert.assertTrue(false);
		Thread.sleep(10000);
	}
	
	@DataProvider(name ="users")
	String [][] log()
	{
		String users[][] = {{"user1","pswd1"},{"standard_user", "secret_sauce"}};
		return users;
	}
	
	@Test(dependsOnMethods = {"Login"})
	public static void MyAcc() {
		System.out.println("Logged in to MyAcc....");
	}

}
