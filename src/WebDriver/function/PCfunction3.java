package WebDriver.function;

import static WebDriver.function.ReadProp.GetConfig;
import static WebDriver.function.ReadProp.GetLocator;
import static WebDriver.function.Keywords.*;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.*;

import com.relevantcodes.extentreports.*;

import static WebDriver.function.Config.CMDCommand;
import static WebDriver.function.Config.LoadConfig;

import java.util.HashMap;

//import static WebDriver.function.PCfunction2.*;

public class PCfunction3 {
	// here are all the test case functions to be called
	// the function names should correspond to the TestCaseID in csv files
	
	public static void TestFunction(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		// set up web browser
		openBrowser();
		navigate("link");
		// log in
		writeInInput("Username_SD", sUserId);
		writeInInput("Password_SD", sPassword);
		writeInInput("Organization_SD", sOrganization);
		clickButton("Submit");
		
		// log the status of previous step
		if (verifyTitle("Self Disclosure")) {
			test.log(LogStatus.PASS, "Login", "Self Disclosure Title Verified");
		} else {
			test.log(LogStatus.FAIL, "Login", "Self Disclosure Title Not Found");
		}
		
		// to work with modules
		clickButton("Details");
		clickButton("AmendEntities");
		sleep(3000);
		checkCheckBox("EntityIsActiveCheckBox");
		
		// fill in the module information
		fillInInformation();

		// check multi-entity column
		if (TestData.get("MULTIENTITYCHECK").equals("YES")){
			click("EntityIsMultibranch");
		}
		
		// radio buttons functionality
		SelectRadioButtons(TestData);
		
		// end test
		clickButton("Cancel");
		sleep(1000);
		quitBrowser();

	}
	
	public static void fillInInformation(){
		if (exist("LegalEntityName")){
			test.log(LogStatus.PASS, "LegalEntityName", "Self Disclosure Has Legal Entity Name");
			clearInputText("LegalEntityName");
			writeInInput("LegalEntityName", "AcadiaSoft Inc.");
		} else {
			test.log(LogStatus.FAIL, "LegalEntityName", "Self Disclosure Does Not Have Legal Entity Name");
			writeInInput("LegalEntityName", "AcadiaSoft Inc.");
		}
		writeInInput("Address", "93 Longwater Cir");
		writeInInput("City", "Norwell");
		selectList("Country","United States");
		selectList("State/Province","Massachusetts");
		writeInInput("Zip/PostalCode", "02061");
	}
	
	public static void SelectRadioButtons(HashMap<String, String> TestData){
		// check country and check for which radio buttons (data-driven)
		if (TestData.get("COUNTRY").equals("Canada")){
			SelectSameRadio(TestData);
			click(TestData.get("BRANCHFRFI"));
			click(TestData.get("COVEREDENTITY"));
			click(TestData.get("CROSSBORDERSTATUS"));
		} else if (TestData.get("COUNTRY").equals("EU")){
			SelectSameRadio(TestData);
			click(TestData.get("CROSSBORDERPRINCIPAL"));
			click(TestData.get("DSFGUARENTEES"));
			click(TestData.get("BRANCHTRANSACTION"));
		} else if (TestData.get("COUNTRY").equals("Japan")){
			SelectSameRadio(TestData);
			click(TestData.get("NOTMULTIBRANCHENTITY"));
		} else if (TestData.get("COUNTRY").equals("Switzerland")){
			SelectSameRadio(TestData);
			click(TestData.get("THIRDCOUNTRYENTITY"));
		} else if (TestData.get("COUNTRY").equals("USA")){
			SelectSameRadio(TestData);
			
			// checkboxes or multiple selection
			selectMultiple(TestData.get("CFTCGENERAL"));
			selectMultiple(TestData.get("CFTCCROSSBORDER"));
			selectMultiple(TestData.get("PRGENERAL"));
			selectMultiple(TestData.get("PRCROSSBORDER"));
			selectMultiple(TestData.get("SWAPSSTATUS"));
			selectMultiple(TestData.get("SWAPSHEDGING"));
			selectMultiple(TestData.get("FINANCIALOBLIGATIONS"));
			
			click(TestData.get("SECISSUER"));
			
			// enter textbox
			writeInInput(TestData.get("SECCENTRALINDEX"),"some index");
			
			click(TestData.get("BOARDAPPROVAL"));
		}
	}
	
	// common categories for all countries
	public static void SelectSameRadio(HashMap<String, String> TestData){
		click(TestData.get("COUNTRY"));
		sleep(1000);
		String entity = TestData.get("ENTITYSTATUS");
		if (entity.contains(";")){
			selectMultiple(entity);
		} else {
			click(entity);
		}
		click(TestData.get("AANAINFORMATION"));
		click(TestData.get("AANATHRESHOLD"));
		click(TestData.get("AANATHRESHOLDESTIMATE"));
	}
	
	// to extract nested values
	public static void selectMultiple(String data){
		String[] ar = data.split(";");
		for (String s : ar){
			click(s);
		}
	}
	
	public static void sleep(int milliseconds){
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 public static void Login_AN(String sUserId, String sPassword, String sOrganization, String sTitle)
	 {
		 
		writeInInput("Username_SD", sUserId);
		writeInInput("Password_SD", sPassword);
		writeInInput("Organization_SD", sOrganization);
		clickButton("Submit");
		
		// log the status of previous step
		if (verifyTitle(sTitle)) {
			test.log(LogStatus.PASS, "Login", sTitle);
		} else {
			test.log(LogStatus.FAIL, "Login", sTitle);
			}
		
	 }
	public static void SampleTest(String sUserId, String sPassword, String sOrganization){
		
		openBrowser();
		navigate("link");
		writeInInput("Username_SD", sUserId);
		writeInInput("Password_SD", sPassword);
		writeInInput("Organization_SD", sOrganization);
		clickButton("Submit");
		
		if (verifyTitle("Self Disclosure")) {
			test.log(LogStatus.PASS, "Login", "Self Disclosure Title Verified");
		} else {
			test.log(LogStatus.FAIL, "Login", "Self Disclosure Title Not Found");
		}
		clickButton("Details");
		clickButton("AmendEntities");

		checkCheckBox("EntityIsMultibranch");
		click("Canada");
		click("CA_OSFI_yes");
		click("CA_FRFI_yes");
		click("CA_CoveredEntity_yes");
		click("CA_CrossBorderStatus_yes");
		click("CA_AANAGroupInfo_yes");
		click("CA_AANAThreshold_above");
		click("CA_AANAThresholdEstimate_2017");
		
		clickButton("Cancel");
		closeBrowser();
	}
	
	
	//END OF TEST CASE FUNCTIONS
	
	
	public static WebElement getwebLocator(String actualLocator) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath(actualLocator));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return element;
	}
	
	public static void writeInInput(String object, String data) {
		// //APP_LOGS.debug("Writing in text box");

		try {
			WebElement we = getwebLocator(GetLocator(object));
			we.sendKeys(data);
		} catch (Exception e) {
			test.log(LogStatus.ERROR.FAIL, "writeInInput", "Unable to write "
					+ e.getMessage());

		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

	public static WebElement fluentWait(String sLocator) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(ExpectedConditions
				.presenceOfElementLocated((By) getwebLocator(sLocator)));
		return foo;

	}

	public static WebElement getWhenVisible(String string, int timeout) {
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated((By) getwebLocator(string)));
		return element;
	}

	

	public static void Logout() {

		click("LogOut");
		closeBrowser();
		if (exist("loginID") && exist("password")) {
			test.log(LogStatus.INFO, "Logout",
					"Application Logged out Successfull");
		} else {
			test.log(LogStatus.FAIL, "Logout", "Application Log out Failed");
		}

	}
	
}
