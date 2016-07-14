package StoreInventory;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Automation.TrailVersion01.CreateAPetTest;
import Automation.TrailVersion01.DeletePetDetailsTest;
import MethodsDetails.ConfigUrls;
import MethodsDetails.PetDetailsMethod;
import MethodsDetails.StoreOrderDetail;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;

public class DeleteStoreOrderTest {
	ConfigUrls urlsProperties = new ConfigUrls();
	

	@BeforeTest
	public String getProfileSetUp() {
		return urlsProperties.getUrlOfDeleteOrder();
	}

	@Test
	public void validateStoreOrderAPI() {
		StoreOrderTest orderPet = new StoreOrderTest();
		orderPet.validateStoreOrderAPI();
		try {
			ValidatableResponse res =  RestAssured.given()
					.header("Content-Type", "application/json")					
					.delete(getProfileSetUp()).then().assertThat().statusCode(200);
			//System.out.println(res.getBody().asString());
			//DeletePetDetailsTest deletePet = new DeletePetDetailsTest();
			//deletePet.validateDeleteAPetAPI();
		} catch (Exception e) {
			System.out.println(e);
		}
				
	}

}
