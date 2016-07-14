package Automation.TrailVersion01;

import java.io.FileInputStream;
import java.util.Properties;

import MethodsDetails.ConfigUrls;

public class CreateAPetDetail {
	//ConfigUrls urlsProperties = new ConfigUrls();
	public static Properties config = new Properties();
	public static String apiBody;

	
	public String createapetbody() {
		try {
			FileInputStream datasheet = new FileInputStream(
					"./src/test/resources/config/createPetDetailsJson");
			config.load(datasheet);
			apiBody = config.getProperty("create.petDetails.json");
		// System.out.println(apiBody);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return apiBody;
	}
}
