package TestCase;

import static WebDriver.function.SD_Test_Function.*;
import static WebDriver.function.ReadProp.GetConfig;

import java.util.HashMap;
/**
 * The test driver for all the USA Jurisdiction test cases. Each function takes four inputs:
 * username, password, organization, and the hashmap representation of the corresponding
 * csv file.
 * @author Anthony Chan
 */
public class USAJurisdiction {
	public void SD_112_86274(HashMap<String, String> TestData){
		Case55(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_110_86274(HashMap<String, String> TestData){
		Case56(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_106_86292(HashMap<String, String> TestData){
		Case57(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_108_86294(HashMap<String, String> TestData){
		Case58(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_112_86276(HashMap<String, String> TestData){
		Case59(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_301_86286(HashMap<String, String> TestData){
		Case60(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_104_86290(HashMap<String, String> TestData){
		Case61(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);		
	}
	public void SD_300_86282(HashMap<String, String> TestData){
		Case62(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);		
	}
	public void SD_300_86284(HashMap<String, String> TestData){
		Case63(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_301_86288(HashMap<String, String> TestData){
		Case64(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_112_86280(HashMap<String, String> TestData){
		Case65(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_112_86270(HashMap<String, String> TestData){
		Case66(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void US_115_85412(HashMap<String, String> TestData){
		Case67(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	public void SD_US_86146(HashMap<String, String> TestData){
		Case68(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);		
	}
}
