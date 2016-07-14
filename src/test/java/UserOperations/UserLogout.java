package UserOperations;

import org.testng.annotations.Test;

import MethodsDetails.ConfigUrls;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;

public class UserLogout {
	ConfigUrls urlsProperties = new ConfigUrls();

	@Test
	public void validateUserLogoutAPI() {
		ValidatableResponse validateResponse = RestAssured.given().when()
				.get(urlsProperties.getUrlOfUserLogout()).then().assertThat()
				.header("content-type", "application/json").assertThat()
				.statusCode(200);
		Response res = RestAssured.given().when()
				.get(urlsProperties.getUrlOfUserLogout());
		System.out.println(res.getBody().asString());
	}
}
