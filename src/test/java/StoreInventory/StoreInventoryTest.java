package StoreInventory;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MethodsDetails.ConfigUrls;
import MethodsDetails.PetDetailsMethod;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.ValidatableResponse;

public class StoreInventoryTest {
	ConfigUrls urlsProperties = new ConfigUrls();
	PetDetailsMethod setValue = new PetDetailsMethod();

	@BeforeTest
	public String getProfileSetUp() {
		return urlsProperties.getUrlOfStore();
	}

	@Test
	public void validateStoreInventoryAPI() {
		ValidatableResponse res = RestAssured.given().get(getProfileSetUp())
				.then().assertThat().statusCode(200);
	}
}
