package UserOperations;

import org.testng.annotations.Test;

import Automation.TrailVersion01.CreateUserDetail;
import MethodsDetails.ConfigUrls;
import MethodsDetails.CreateAPetDetail;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;

public class CreateUserTest {
	ConfigUrls urlsProperties = new ConfigUrls();
	CreateUserDetail getBody = new CreateUserDetail();

	@Test
	public void validateCreatUserAPI() {
		Response res = RestAssured.given()
				.header("Content-Type", "application/json")
				.body(getBody.createUserBody()).then()
				.post(urlsProperties.getUrlOfCreateUser());
		System.out.println(res.getBody().asString());
		ValidatableResponse res1 = res.then().assertThat().statusCode(200);
		// System.out.println(res.getBody().asString());
	}

	@Test
	public void validateCreatUserWithArrayAPI() {
		Response res = RestAssured.given()
				.header("Content-Type", "application/json")
				.body(getBody.createUserBodyWithArray()).then()
				.post(urlsProperties.getUrlOfCreateUserWithArray());
		System.out.println(res.getBody().asString());
		ValidatableResponse res1 = res.then().assertThat().statusCode(200);

	}

	@Test
	public void validateCreatUserWithListAPI() {
		Response res = RestAssured.given()
				.header("Content-Type", "application/json")
				.body(getBody.createUserBodyWithList()).then()
				.post(urlsProperties.getUrlOfCreateUserWithList());
		System.out.println(res.getBody().asString());
		ValidatableResponse res1 = res.then().assertThat().statusCode(200);

	}
}
