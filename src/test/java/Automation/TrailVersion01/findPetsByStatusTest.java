package Automation.TrailVersion01;

import org.testng.annotations.Test;

import MethodsDetails.ConfigUrls;

import com.jayway.restassured.RestAssured;

import com.jayway.restassured.response.ValidatableResponse;

public class findPetsByStatusTest {
	ConfigUrls urlsProperties = new ConfigUrls();

	@Test
	public void validatefindPetsByStatusAPI() {

		ValidatableResponse res = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.get(urlsProperties.setValue()
						+ "findByStatus?status=available").then().assertThat()
				.statusCode(200);

	}
}
