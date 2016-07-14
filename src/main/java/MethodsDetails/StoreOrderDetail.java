package MethodsDetails;

import java.io.FileInputStream;
import java.util.Properties;

public class StoreOrderDetail {
	ConfigUrls urlsProperties = new ConfigUrls();
	public static Properties config = new Properties();
	public static String apiBody;

	
	public String storeOrderBody() {
		try {
			FileInputStream datasheet = new FileInputStream(
					"./src/test/resources/config/storeOrderDetailsJson");
			config.load(datasheet);
			apiBody = config.getProperty("store.order");
			System.out.println(apiBody);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return apiBody;
	}
}
