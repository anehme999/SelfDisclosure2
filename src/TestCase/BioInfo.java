package TestCase;

/**
 * The test driver for all the BioInfo test cases. Each function takes four inputs:
 * username, password, organization, and the hashmap representation of the corresponding
 * csv file.
 * @author Anthony Chan
 */
import static WebDriver.function.SD_Test_Function.*;
import static WebDriver.function.ReadProp.GetConfig;

import java.util.HashMap;

public class BioInfo {

	public void SD_131_85601(HashMap<String, String> TestData){
		Case1(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_131_85602(HashMap<String, String> TestData){
		Case2(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_131_85603(HashMap<String, String> TestData){
		Case3(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_131_85437(HashMap<String, String> TestData){
		Case4(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_131_85604(HashMap<String, String> TestData){
		Case5(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
		public void SD_131_85605(HashMap<String, String> TestData){
		Case6(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_131_86117(HashMap<String, String> TestData){
		Case7(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);		
	}

	public void SD_131_86116(HashMap<String, String> TestData){
		Case8(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);		
	}
	public void SD_131_85435(HashMap<String, String> TestData){
		Case9(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}

}
