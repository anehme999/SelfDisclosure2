package TestCase;

import static WebDriver.function.SD_Test_Function.*;
import static WebDriver.function.ReadProp.GetConfig;
import java.util.HashMap;

/**
 * The test driver for all the Switzerland Jurisdiction test cases. Each function takes four inputs:
 * username, password, organization, and the hashmap representation of the corresponding
 * csv file.
 * @author Swetha Ramakrishna
 */
public class SwitzerlandJurisdiction {

	public void SD_SwitzerLand_86138 (HashMap<String, String> TestData) {
		Case29(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
    }

	public void SD_AANAModal_85451 (HashMap<String, String> TestData) {
		Case30(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	
	public void SD_SwitzerLand_85449 (HashMap<String, String> TestData) {
		Case31(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}

	public void SLFDSC_116_01_85273 (HashMap<String, String> TestData) {
		Case32(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
		
	public void SLFDSC_117_85274 (HashMap<String, String> TestData) {
		Case33(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	
	public void SLFDSC_118_85276 (HashMap<String, String> TestData) {
		Case34(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}

	public void SLFDSC_150_86215 (HashMap<String, String> TestData) {
		Case35(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	
	public void SLFDSC_152_2_86330 (HashMap<String, String> TestData) {
		Case36(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	
	public void SLFDSC_152_1_86204 (HashMap<String, String> TestData) {
		Case37(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}

	public void SLFDSC_154_86180 (HashMap<String, String> TestData) {
		Case38(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}

	public void SLFDSC_156_86197 (HashMap<String, String> TestData) {
		Case39(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	
	public void SLFDSC_158_86210 (HashMap<String, String> TestData) {
		Case40(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	
	public void SLFDSC_160_86217 (HashMap<String, String> TestData) {
		Case41(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	
	public void SLFDSC_162_1_86221 (HashMap<String, String> TestData) {
		Case42(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	
	public void SLFDSC_162_2_86222 (HashMap<String, String> TestData) {
		Case43(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	
	public void SLFDSC_162_3_86227 (HashMap<String, String> TestData) {
		Case44(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	
	public void SLFDSC_164_86218 (HashMap<String, String> TestData) {
		Case45(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	

}

	

