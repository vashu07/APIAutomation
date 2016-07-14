package Automation.TrailVersion01;

import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import MethodsDetails.ConfigUrls;

public class DeletePetDetailsTest {
	ConfigUrls urlsProperties = new ConfigUrls();
	CreateAPetTest creatpetdetails = new CreateAPetTest();

	@Test
	public void validateDeleteAPetAPI() {
		creatpetdetails.validateCreatsAPetAPI();
		Response res = RestAssured.given()
				.delete(urlsProperties.setValue() + 1);
		res.then().assertThat().statusCode(200);
		System.out.println(res.getBody().asString());

	}

}
