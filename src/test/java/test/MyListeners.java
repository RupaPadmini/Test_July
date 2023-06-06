package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener{
	
public void onTestFailure(ITestResult arg0) {
	System.out.println("Test case failed.....");
}
public void onTestSkipped(ITestResult arg0) {
	System.out.println("Test case skipped......");
}
}
