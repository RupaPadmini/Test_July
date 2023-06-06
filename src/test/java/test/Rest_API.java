package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest_API {

	@Test
	public void http_res() {
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification httpreq = RestAssured.given();
		
		Response httpres = httpreq.request(Method.DELETE, "/api/users/2");
		String response = httpres.getBody().asString();
		System.out.println(response);
		int code = httpres.getStatusCode();
		System.out.println("Code:" +code);
		
		Assert.assertEquals(code, 204);
	}
}
