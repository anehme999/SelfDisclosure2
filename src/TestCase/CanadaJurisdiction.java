package TestCase;

import static WebDriver.function.SD_Test_Function.*;
import static WebDriver.function.ReadProp.GetConfig;

import java.util.HashMap;
/**
 * The test driver for all the Canada Jurisdiction test cases. Each function takes four inputs:
 * username, password, organization, and the hashmap representation of the corresponding
 * csv file.
 * @author Anthony Chan
 */
public class CanadaJurisdiction {
	public void SD_118_85446(HashMap<String, String> TestData){
		Case10(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_118_86314(HashMap<String, String> TestData){
		Case11(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_118_86418(HashMap<String, String> TestData){
		Case12(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_118_86422(HashMap<String, String> TestData){
		Case13(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_118_86420(HashMap<String, String> TestData){
		Case14(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_118_86424(HashMap<String, String> TestData){
		Case15(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_118_86426(HashMap<String, String> TestData){
		Case16(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);		
	}
	public void SD_118_86133(HashMap<String, String> TestData){
		Case17(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);		
	}
}
