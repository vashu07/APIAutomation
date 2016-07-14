package Automation.TrailVersion01;

import javax.imageio.plugins.jpeg.JPEGImageWriteParam;

import org.testng.annotations.Test;

import MethodsDetails.ConfigUrls;
import MethodsDetails.UpdatePetDetail;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;

public class UploadImageForPets {
	ConfigUrls urlsProperties = new ConfigUrls();
	//UpdatePetDetail getBody = new UpdatePetDetail();
	CreateAPetTest createNewPet = new CreateAPetTest();
	//GetPetDetailsTest getPetDetails = new GetPetDetailsTest();

	@Test
	public void validateUploadImageForPetsAPI() {
		createNewPet.validateCreatsAPetAPI();
		Response res = RestAssured.given()
				.header("Content-Type", "application/json")
				
				.formParam("ajsdjs", "./src/test/resources/varsha.jpg")
				.post(urlsProperties.setValue()+"1/uploadImage");
		System.out.println(res.getBody().asString());
		System.out.println(res.statusCode());

		ValidatableResponse res2 = res.then().assertThat().statusCode(200);

		
	}

}
