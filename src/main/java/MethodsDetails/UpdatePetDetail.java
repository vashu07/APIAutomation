package MethodsDetails;

import java.io.FileInputStream;
import java.util.Properties;

public class UpdatePetDetail {
	ConfigUrls urlsProperties = new ConfigUrls();
	public static Properties config = new Properties();
	public static String apiBody;

	
	public String updatePetBody() {
		try {
			FileInputStream datasheet = new FileInputStream(
					"./src/test/resources/config/updatePetDetailsJson");
			config.load(datasheet);
			apiBody = config.getProperty("update.petDetails.json");
			// System.out.println(apiBody);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return apiBody;
	}
}
