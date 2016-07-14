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

public class StoreOrderTest {
	ConfigUrls urlsProperties = new ConfigUrls();
	PetDetailsMethod setValue = new PetDetailsMethod();
	StoreOrderDetail storeOrder = new StoreOrderDetail();

	@BeforeTest
	public String getProfileSetUp() {
		return urlsProperties.getUrlOfOrder();
	}

	@Test
	public void validateStoreOrderAPI() {
		CreateAPetTest createpet = new CreateAPetTest();
		createpet.validateCreatsAPetAPI();
		try {
			Response res =  RestAssured.given()
					.header("Content-Type", "application/json")
					.body(storeOrder.storeOrderBody())
					.post(getProfileSetUp());
			//System.out.println(res.getBody().asString());
			DeletePetDetailsTest deletePet = new DeletePetDetailsTest();
			deletePet.validateDeleteAPetAPI();
		} catch (Exception e) {
			System.out.println(e);
		}
				
	}

}
