package Automation.TrailVersion01;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MethodsDetails.ConfigUrls;
import MethodsDetails.PetDetailsMethod;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;

public class GetPetDetailsTest {
	ConfigUrls urlsProperties = new ConfigUrls();
	PetDetailsMethod setValue = new PetDetailsMethod();

	@BeforeTest
	public void getProfileSetUp() {
		urlsProperties.setValue();
		System.out.println(urlsProperties.url);
	}

	@Test
	public String validateGetProfileAPI() {

		Response res = RestAssured.given().get(
				urlsProperties.url + setValue.getProfile());
		System.out.println(res.getBody().asString());
		return res.getBody().asString();
	}

	@Test
	public void validateGetProfileHeaders() {
		ValidatableResponse validateResponse = RestAssured.given().when()
				.get(urlsProperties.url + setValue.getProfile()).then()
				.assertThat().header("content-type", "application/json");
	}
}
