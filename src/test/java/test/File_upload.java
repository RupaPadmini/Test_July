package test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_upload {
	static WebDriver driver;
	@Test
	public void Test_File() throws InterruptedException, IOException {
	driver = WebDriverManager.chromedriver().create();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//	driver.get("https://demoqa.com/upload-download");
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/form/div/label")).click();
	driver.get("https://the-internet.herokuapp.com/upload");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.id("drag-drop-upload")).click();
	Runtime.getRuntime().exec("C:\\Users\\ravik\\Desktop\\BusyQA_Projects\\TestNG_Project\\autoit_sample.exe");
/*	driver.get("https://the-internet.herokuapp.com/upload");
	driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\ravik\\Downloads\\AutomationTesting.png");
	driver.findElement(By.id("file-submit")).submit();
	if(driver.getPageSource().contains("File Uploaded!")) {
		System.out.println("file uploaded");
	}
	else{
			System.out.println("file not uploaded");
		}  */
	Thread.sleep(10000); 
			}
}
