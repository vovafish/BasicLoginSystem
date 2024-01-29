package main;

import java.util.HashMap;

public class IDandPassword {
	
	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	IDandPassword() {
		
		loginInfo.put("Vlad", "Sushi");
		loginInfo.put("Code", "Security");
		loginInfo.put("123", "321");
	}
	
	protected HashMap getLoginInfo() {
		return loginInfo;
	}
}
