package UserOperations;

import org.testng.annotations.Test;

import MethodsDetails.ConfigUrls;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;

public class DeleteUser {
	ConfigUrls urlsProperties = new ConfigUrls();
	CreateUserTest createUser = new CreateUserTest();

	@Test
	public void validateDeleteUserAPI() {
		createUser.validateCreatUserAPI();
		ValidatableResponse validateResponse = RestAssured.given().when()
				.get(urlsProperties.getUrlOfDeleteUser()).then().assertThat()
				.header("content-type", "application/json").assertThat()
				.statusCode(200);
		Response res = RestAssured.given().when()
				.get(urlsProperties.getUrlOfUserLogin());
		System.out.println(res.getBody().asString());
	}
}
