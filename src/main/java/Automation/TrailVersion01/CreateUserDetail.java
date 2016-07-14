package Automation.TrailVersion01;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;



public class CreateUserDetail {
	//ConfigUrls urlsProperties = new ConfigUrls();
	public static Properties config = new Properties();
	public static String apiBody;

	
	public String createUserBody() {
		try {
			FileInputStream datasheet = new FileInputStream(
					"./src/test/resources/config/CreateUserJson");
			config.load(datasheet);
			apiBody = config.getProperty("create.UserDetails.json");
			 System.out.println(apiBody);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return apiBody;
	}
	public String createUserBodyWithArray() {
		try {
			FileInputStream datasheet = new FileInputStream(
					"./src/test/resources/config/CreateUserJson");
			config.load(datasheet);
			apiBody = config.getProperty("create.UserDetailsWithArray.json");
			 System.out.println(apiBody);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return apiBody;
	}
	public String createUserBodyWithList() {
		try {
			FileInputStream datasheet = new FileInputStream(
					"./src/test/resources/config/CreateUserJson");
			config.load(datasheet);
			apiBody = config.getProperty("create.UserDetailsWithList.json");
			 System.out.println(apiBody);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return apiBody;
	}
}
