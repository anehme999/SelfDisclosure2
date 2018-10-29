package TestCase;

import static WebDriver.function.SD_Test_Function.*;
import static WebDriver.function.ReadProp.GetConfig;
import java.util.HashMap;

/**
 * The test driver for all the EU Jurisdiction test cases. Each function takes four inputs:
 * username, password, organization, and the hashmap representation of the corresponding
 * csv file.
 * @author Swetha Ramakrishna
 */
public class EUJurisdiction {
	
	public void SD_AANAModel_85410(HashMap<String, String> TestData) {
		Case18(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
    }
	
	public void SD_94_EU_86304 (HashMap<String, String> TestData) {
		Case19(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	
	public void SD_94_EU_86308 (HashMap<String, String> TestData) {
		Case20(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	
	public void SD_94_EU_86306 (HashMap<String, String> TestData) {
		Case21(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	
	public void SD_94_EU_86312 (HashMap<String, String> TestData) {
		Case22(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}

	public void SD_94_EU_86310 (HashMap<String, String> TestData) {
		Case23(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}

	public void SD_94_EU_86302 (HashMap<String, String> TestData) {
		Case24(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}

	public void SD_95_EU_86296 (HashMap<String, String> TestData) {
		Case25(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	
	public void SD_95_EU_86300 (HashMap<String, String> TestData) {
		Case26(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	
	public void SD_95_EU_86298 (HashMap<String, String> TestData) {
		Case27(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	
	public void SD_EU_RegulatoryJurisdiction_86143 (HashMap<String, String> TestData) {
		Case28(GetConfig("Username_TEST"),GetConfig("Password_TEST"), GetConfig("Organization_TEST"), TestData);	
	}
	
}


		
	

