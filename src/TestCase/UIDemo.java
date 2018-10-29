package TestCase;

import static WebDriver.function.Config.*;
import static WebDriver.function.Keywords.*;
import static WebDriver.function.PCfunction1.*;

import java.util.Arrays;
import java.util.List;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//Header
public class UIDemo {
	
	
//TestCase Starting	
	
	
	public void LogIn(List<String> TestData,ExtentTest test){
	
		Login(TestData.get(2),TestData.get(3));
		
	}
	
	public void CreateAgreement(List<String> TestData,ExtentTest test){
		
		
		String sAgrementData=TestData.get(4);
		String[] lsAgreement = sAgrementData.split("#");
		click("AgreementLink");
		click("CreateAgreementButtion");
		
		//writeInInput("CodeName");
	
		//writeInInput("Type","");
		writeInInput("AgreementCode",Arrays.asList(lsAgreement).get(0));
		writeInInput("AgreementName",Arrays.asList(lsAgreement).get(1));
		selectList("PrincipalCode",Arrays.asList(lsAgreement).get(2));
		selectList("WorkGroup",Arrays.asList(lsAgreement).get(3));
		selectList("Scope",Arrays.asList(lsAgreement).get(4));
		selectList("AgreementType",Arrays.asList(lsAgreement).get(5));
		selectList("AgreementMutuality",Arrays.asList(lsAgreement).get(6));
		selectList("BaseCurrency",Arrays.asList(lsAgreement).get(7));
		selectList("CounterParty",Arrays.asList(lsAgreement).get(8));
		click("LookupButton");
		click("Lookup.Search");
		click("Lookup.Select");
		
		if(click("CancelButton"))
		{
			test.log(LogStatus.PASS, "Create Agreement", "Agreement Filled and Canceled Successfull");
		}
		
	}
	
	public void SearchAgreement(List<String> TestData,ExtentTest test){
		
		String sAgrementData=TestData.get(4);
		//String[] lsAgreement = sAgrementData.split("#");
		
		List<String> lsAgreement = Arrays.asList(sAgrementData.split("#"));
		
		click("AgreementLink");
		writeInInput("F.AgreementCode",lsAgreement.get(0));
		writeInInput("F.AgreementName",lsAgreement.get(1));
		writeInInput("F.PCode",lsAgreement.get(2));
		writeInInput("F.WorkGroup",lsAgreement.get(3));
		writeInInput("F.AType",lsAgreement.get(4));
		doubleClick("AgreeTable1R");
		if(click("AgreeDetail.Close")){
			test.log(LogStatus.PASS, "Search Agreement", "Agreement searched Successfull ");
		}
	
	}
	
	
}
