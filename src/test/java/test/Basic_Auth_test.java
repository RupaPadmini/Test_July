package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Basic_Auth_test {
	
	@Test
	public void Demo() {
		
	int status = RestAssured.given().auth().preemptive().basic("postman", "password").
		when().get("https://postman-echo.com/basic-auth").getStatusCode();
	System.out.println(status);
	
	Assert.assertEquals(status, 200);
	}

}
