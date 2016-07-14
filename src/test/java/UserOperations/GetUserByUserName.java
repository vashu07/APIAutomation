package UserOperations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MethodsDetails.ConfigUrls;
import MethodsDetails.PetDetailsMethod;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;

public class GetUserByUserName {
	ConfigUrls urlsProperties = new ConfigUrls();
	CreateUserTest createUser = new CreateUserTest();

	@Test
	public void validateUserDetailsAPI() {

		createUser.validateCreatUserAPI();
		Response res = RestAssured.given().get(
				urlsProperties.getUrlOfUserDetails());
		System.out.println(res.getBody().asString());

	}
}
