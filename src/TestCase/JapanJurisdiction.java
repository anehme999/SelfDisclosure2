package TestCase;

import static WebDriver.function.SD_Test_Function.*;
import static WebDriver.function.ReadProp.GetConfig;

import java.util.HashMap;

/**
 * The test driver for all the Japan Jurisdiction test cases. Each function takes four inputs:
 * username, password, organization, and the hashmap representation of the corresponding
 * csv file.
 * @author Anthony Chan
 */
public class JapanJurisdiction {
	public void SD_140_86145(HashMap<String, String> TestData){
		Case46(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	
	public void SLFDSC_147_86228(HashMap<String, String> TestData){
		Case47(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_148_86258(HashMap<String, String> TestData){
		Case48(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_143_86264(HashMap<String, String> TestData){
		Case49(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_148_86260(HashMap<String, String> TestData){
		Case50(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_148_86266(HashMap<String, String> TestData){
		Case51(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);		
	}
	public void SLFDSC_141_86229(HashMap<String, String> TestData){
		Case52(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);		
	}
	public void SLFDSC_145_86326(HashMap<String, String> TestData){
		Case53(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);		
	}
	public void SD_AANA_Modal_85403(HashMap<String, String> TestData){
		Case54(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);		
	}
}
