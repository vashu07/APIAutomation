package MethodsDetails;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigUrls {
	public static Properties config = new Properties();
	public static FileInputStream datasheet;
	public static String url;

	public String setValue() {
		try {
			datasheet = new FileInputStream(
					"./src/test/resources/config/url.properties");
			config.load(datasheet);
			url = config.getProperty("domain");						
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return url;
	}
	public String getUrlOfStore() {
		try {
			datasheet = new FileInputStream(
					"./src/test/resources/config/url.properties");
			config.load(datasheet);
			url = config.getProperty("store.url");						
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return url;
	}
	public String getUrlOfOrder() {
		try {
			datasheet = new FileInputStream(
					"./src/test/resources/config/url.properties");
			config.load(datasheet);
			url = config.getProperty("order.url");						
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return url;
	}
	public String getUrlOfDeleteOrder() {
		try {
			datasheet = new FileInputStream(
					"./src/test/resources/config/url.properties");
			config.load(datasheet);
			url = config.getProperty("delete.order.url");						
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return url;
	}
	public String getUrlOfCreateUser() {
		try {
			datasheet = new FileInputStream(
					"./src/test/resources/config/url.properties");
			config.load(datasheet);
			url = config.getProperty("create.user");						
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return url;
	}
	public String getUrlOfCreateUserWithArray() {
		try {
			datasheet = new FileInputStream(
					"./src/test/resources/config/url.properties");
			config.load(datasheet);
			url = config.getProperty("create.user.withArray");						
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return url;
	}
	public String getUrlOfCreateUserWithList() {
		try {
			datasheet = new FileInputStream(
					"./src/test/resources/config/url.properties");
			config.load(datasheet);
			url = config.getProperty("create.user.withList");						
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return url;
	}
	
	public String getUrlOfUserLogin() {
		try {
			datasheet = new FileInputStream(
					"./src/test/resources/config/url.properties");
			config.load(datasheet);
			url = config.getProperty("login.user");						
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return url;
	}
	public String getUrlOfUserLogout() {
		try {
			datasheet = new FileInputStream(
					"./src/test/resources/config/url.properties");
			config.load(datasheet);
			url = config.getProperty("logout.user");						
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return url;
	}
	public String getUrlOfDeleteUser() {
		try {
			datasheet = new FileInputStream(
					"./src/test/resources/config/url.properties");
			config.load(datasheet);
			url = config.getProperty("delete.user");						
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return url;
	}
	public String getUrlOfUserDetails() {
		try {
			datasheet = new FileInputStream(
					"./src/test/resources/config/url.properties");
			config.load(datasheet);
			url = config.getProperty("user.details");						
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return url;
	}
	
}
