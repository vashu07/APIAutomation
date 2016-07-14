package MethodsDetails;

import Automation.TrailVersion01.GetPetDetails;

public class PetDetailsMethod {
	public String getProfile() {
		GetPetDetails obj = new GetPetDetails();
		obj.setpetId("1");
		return obj.getpetId();
	}
}
