package Automation.TrailVersion01;

import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import MethodsDetails.ConfigUrls;
import MethodsDetails.CreateAPetDetail;
import MethodsDetails.UpdatePetDetail;

public class UpdatePetDetailsTest {
	
	ConfigUrls urlsProperties = new ConfigUrls();
	UpdatePetDetail getBody = new UpdatePetDetail();
	CreateAPetTest createNewPet = new CreateAPetTest();
	GetPetDetailsTest getPetDetails = new GetPetDetailsTest();

	@Test
	public void validateUpdatePetDetailsAPI() {
		createNewPet.validateCreatsAPetAPI();
		Response res = RestAssured.given()
				.header("Content-Type", "application/json")
				.body(getBody.updatePetBody()).then()
				.post(urlsProperties.setValue());
		String res2= res.getBody().asString();
		String res1= getPetDetails.validateGetProfileAPI();
		res2.compareTo(res1);
		System.out.println(res.getBody().asString());
	}

}
