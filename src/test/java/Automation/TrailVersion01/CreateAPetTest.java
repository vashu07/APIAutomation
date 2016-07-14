package Automation.TrailVersion01;


import org.testng.annotations.Test;

import MethodsDetails.ConfigUrls;


import MethodsDetails.CreateAPetDetail;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;


public class CreateAPetTest {
	ConfigUrls urlsProperties = new ConfigUrls();
	CreateAPetDetail getBody = new CreateAPetDetail();

	@Test
	public void validateCreatsAPetAPI() {
		Response res = RestAssured.given()
				.header("Content-Type", "application/json")
				.body(getBody.createapetbody()).then()
				.post(urlsProperties.setValue());
		//System.out.println(res.getBody().asString());
	}

}
