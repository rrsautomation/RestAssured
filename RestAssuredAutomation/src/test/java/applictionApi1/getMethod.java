package applictionApi1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getMethod {
	@Test
	public void function1() {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
	
		int statusCode = response.getStatusCode();
		System.out.println(response.getBody().asString());
		//System.out.println(response.getContentType());
		//System.out.println(response.getHeaders());
		
		Assert.assertEquals(statusCode, 200);
	}

	
}
