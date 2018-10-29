package WebDriver.function;

import static WebDriver.function.ReadProp.*;
import static WebDriver.function.Keywords.*;
import static WebDriver.function.SD_Common_Functions.*;
import static WebDriver.function.SD_Function1.*;

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

/**
 * This is a collection of all Self Disclosure UI related functions. A majority of these
 * functions are representative of test steps in the Self Disclosure test cases.
 * @author Anthony Chan
 *     Created the test cases for these jurisdictions: BioInfo, Canada, Japan, USA
 * @author Swetha Ramakrishna
 *     Created the test cases for these jurisdictions: EU, Switzerland
 */

public class SD_Test_Function {
	
	//FOR SCTM SELF DISCLOSURE TEST CASES (BIOINFO)
	public static void Case1(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		// 34 steps in total
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyLegalEntityName(TestData);
		verifyGenBioInfo(TestData);
		verifyLegalEntityNameHeading(TestData);
		//Test Step: Enter numerical value
		//Test Step: Enter special chars value
		checkPrefilled_LegalEntityName();
		//Test Step: User can amend legal entity name
		//Test Step: ZipCode - cannot enter alphabetical values and special chars
		//Test Step: ZipCode - Can enter numerical values
		
		confirmDisplay_EntityIsMultibranchHeading(TestData);
		//Test Step: Confirm display of checkbox; box is selectable; check and uncheck box
		confirmDisplay_BeneficialOwnerHeading(TestData);
		//Test Step: Beneficial Owner - cannot enter numerical and special chars
		//Test Step: Beneficial Owner - able to enter alphabetical value
		verifyNotificationsHeading(TestData);
		checkAndUncheckNotificationsCheckbox();
		verifyEmailListHeading(TestData);
		verifyServiceProviderHeading(TestData);
		verifyAstrikDisplayConfirmation(TestData);
		//Test Step: Confirm display of list of emails
		verifyAliasesHeading(TestData);
		
		verifyLegalEntityIdentifierHeading(TestData);
		checkPrefilled_LegalEntityIdentifier();
		verifyShortNameHeading(TestData);
		checkPrefilled_ShortNameHeading();
		verifyReferenceIdentifierHeading(TestData);
		checkPrefilled_ReferenceIdentifierHeading();
		verifyTriOptPartyCode(TestData);
		checkPrefilled_TriOptPartyCode();
		verifyFundNumber(TestData);
		checkPrefilled_FundNumber();

		// how should each session end
		// save? cancel? quit browser.
		endSession();
	}
	public static void Case2(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		// 26 steps in total
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyLegalEntityName(TestData);
		verifyGenBioInfo(TestData);
		verifyLegalEntityNameHeading(TestData);
		//Test Step: Enter numerical value
		//Test Step: Enter special chars value
		checkPrefilled_LegalEntityName();
		//Test Step: User can amend legal entity name
		
		verifyAddressHeading(TestData);
		//Test Step: User can enter required value
		verifyAddress2Heading(TestData);
		//Test Step: User can enter required value
		verifyAddress3Heading(TestData);
		//Test Step: User can enter required value
		verifyCityHeading(TestData);
		//Test Step: cannot enter alphabetical values and special chars
		//Test Step: Can enter numerical values
		verifyCountryHeading(TestData);
		//Test Step: Confirms dropdown button; verify names are in alphabetical order
		verifyStateProvinceHeading(TestData);
		//Test Step: Confirms dropdown button; verify names are in alphabetical order
		verifyZipPostalCodeHeading(TestData);
		//Test Step: ZipCode - cannot enter alphabetical values and special chars
		//Test Step: ZipCode - Can enter numerical values
		
		endSession();
	}
	public static void Case3(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		//10 steps total
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyLegalEntityName(TestData);
		verifyGenBioInfo(TestData);
		confirmDisplay_EntityIsMultibranchHeading(TestData);
		checkAndUncheckEntityIsMultibranchCheckbox();
		
		confirmDisplay_BeneficialOwnerHeading(TestData);
		//Test Step: Beneficial Owner - cannot enter numerical and special chars
		//Test Step: Beneficial Owner - able to enter alphabetical value
		endSession();
	}
	public static void Case4(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		//17 steps total
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		
		verifySD_ContactInformationHeading(TestData);
		// Test Steps: future story (2)
		verifyContactInformationHeading(TestData);
		// Test Step: not allowed to enter numbers
		// Test Step: not allowed to enter special characters
		// Test Step: must enter letters only; no combinations
		// Test Step: allowed to enter letters
		verifyPhoneNumberHeading(TestData);
		//Test Step: user cannot enter letters or special chars
		// Test Step: user can enter digits into field
		verifyEmailHeading(TestData);
		// Test Step: enter the correct email address in field
		
		endSession();
	}
	public static void Case5(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(3000);
		clickAmendEntity();
		verifyLegalEntityName(TestData);
		verifyGenBioInfo(TestData);
		
		verifyNotificationsHeading(TestData);
		checkAndUncheckNotificationsCheckbox();
		verifyEmailListHeading(TestData);
		verifyServiceProviderHeading(TestData);
		verifyAstrikDisplayConfirmation(TestData);
		// Test Step: confirms display list of emails
		
		endSession();
	}
	public static void Case6(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyLegalEntityName(TestData);
		verifyGenBioInfo(TestData);
		
		sleep(2000);
		verifyAliasesHeading(TestData);
		verifyLegalEntityIdentifierHeading(TestData);
		checkPrefilled_LegalEntityIdentifier();
		verifyShortNameHeading(TestData);
		checkPrefilled_ShortNameHeading();
		verifyReferenceIdentifierHeading(TestData);
		checkPrefilled_ReferenceIdentifierHeading();
		verifyTriOptPartyCode(TestData);
		checkPrefilled_TriOptPartyCode();
		verifyFundNumber(TestData);
		checkPrefilled_FundNumber();

		endSession();
	}
	public static void Case7(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		// 11 total
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyLegalEntityName(TestData);
		verifyGenBioInfo(TestData);
		
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyCountriesHeadings(TestData);
		verifyCountriesCollapsed(TestData);
		verifyCountriesOpen(TestData);
		// Test Step: verify that only clicked country's jurisdiction is open
		
		endSession();
	}
	public static void Case8(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		// 9 steps total
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyLegalEntityName(TestData);
		verifyGenBioInfo(TestData);
		verifyAstrikDisplayConfirmation(TestData);
		verifyAstrikDisplayConfirmation2(TestData);
		
		// Test Step: confirm the display of message associated with astrik
		// Test Step: confirm the display of message associated with astrik
		
		// verify email list, service provider email list
		verifyAstrikDisplayConfirmation(TestData);
		
		
		endSession();
	}
	public static void Case9(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		// 60 steps total
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyLegalEntityName(TestData);
		verifyGenBioInfo(TestData);
		
		verifyLegalEntityNameHeading(TestData);
		// TS - numerical values
		// TS - special chars
		checkPrefilled_LegalEntityName();
		// TS - amend the name
		
		verifyAddressHeading(TestData);
		//Test Step: User can enter required value
		verifyAddress2Heading(TestData);
		//Test Step: User can enter required value
		verifyAddress3Heading(TestData);
		//Test Step: User can enter required value
		verifyCityHeading(TestData);
		//Test Step: cannot enter alphabetical values and special chars
		//Test Step: Can enter numerical values
		verifyCountryHeading(TestData);
		//Test Step: Confirms dropdown button; verify names are in alphabetical order
		verifyStateProvinceHeading(TestData);
		//Test Step: Confirms dropdown button; verify names are in alphabetical order
		verifyZipPostalCodeHeading(TestData);
		//Test Step: ZipCode - cannot enter alphabetical values and special chars
		//Test Step: ZipCode - Can enter numerical values
		verifyAstrikDisplayConfirmation2(TestData);
		// Test Step: confirm the display of message associated with astrik
		// Test Step: confirm the display of message associated with astrik
		
		confirmDisplay_EntityIsMultibranchHeading(TestData);
		checkAndUncheckEntityIsMultibranchCheckbox();
		
		confirmDisplay_BeneficialOwnerHeading(TestData);
		verifyNotificationsHeading(TestData);
		checkAndUncheckNotificationsCheckbox();
		verifyEmailListHeading(TestData);
		verifyServiceProviderHeading(TestData);
		verifyAstrikDisplayConfirmation(TestData);
		// Test STep: confirm display of list of emails
		
		// Test Steps (9): not displaying anymore or future story?
		
		
		sleep(2000);
		verifyAliasesHeading(TestData);
		verifyLegalEntityIdentifierHeading(TestData);
		checkPrefilled_LegalEntityIdentifier();
		verifyShortNameHeading(TestData);
		checkPrefilled_ShortNameHeading();
		verifyReferenceIdentifierHeading(TestData);
		checkPrefilled_ReferenceIdentifierHeading();
		verifyTriOptPartyCode(TestData);
		checkPrefilled_TriOptPartyCode();
		verifyFundNumber(TestData);
		checkPrefilled_FundNumber();
		
		endSession();
	}
	
	//CANADA	
	public static void Case10(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		
		verifyRelevantRegulatoryJurisdiction(TestData);
		//verifyCanadaHeading(TestData);
		//verifyCanadaHeadingCollapsed(TestData);
		clickCanadaHeading(TestData);
		
		String[] headings = {"CanadaOSFIEntity","CanadaOSFIEntity2","CanadaBranchFRFI","CanadaCoveredEntity","CanadaCrossBorderStatus","CanadaCrossBorderStatus2","CanadaAANAInformation","CanadaAANAInformation2","CanadaAANAThreshold","CanadaAANAThresholdEstimate"};
		CanadaMegaFunction(TestData, headings);
		
		// Test Step: confirm display of modal
		
		// NOTE: some test steps refer to the "i" icon which is not visible. Future story?
		
		/* NOTE: this is the old way replaced by megafunction
		verifyCanadaOSFIHeading(TestData);
		verifyCanadaOSFIHeading2(TestData);
		verifyCanadaDomesticFRFI(TestData);
		verifyCanadaCoveredEntity(TestData);
		verifyCanadaCrossBorder(TestData);
		verifyCanadaCrossBorder2(TestData);
		verifyCanadaAANAInformation(TestData);
		verifyCanadaAANAInformation2(TestData);
		verifyCanadaAANAThreshold(TestData);
		verifyCanadaAANAThresholdEstimate(TestData);
		
		checkTextCanadaAANAThreshold(TestData,1);
		*/

		endSession();
	}
	
	public static void Case11(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyCanadaHeading(TestData);
		//verifyCanadaHeadingCollapsed(TestData);
		clickCanadaHeading(TestData);
		
		selectYes(TestData,"CanadaBranchFRFI");
		//saveEntity();
		sleep(3000);
		//capture error message
		clickEntityIsMultibranch();
		sleep(3000);
		selectYes(TestData,"CanadaAANAInformation");
		
		saveEntity();
		// verify no error message
		sleep(3000);
		quitBrowser();
	}
	
	public static void Case12(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyCanadaHeading(TestData);
		//verifyCanadaHeadingCollapsed(TestData);
		clickCanadaHeading(TestData);
		
		selectYes(TestData,"CanadaAANAInformation");
		//saveEntity();
		//sleep(4000);
		//capture error message?
		selectYes(TestData,"CanadaCoveredEntity");
		saveEntity();
		// verify no error message
		sleep(4000);
		quitBrowser();
	}
	
	public static void Case13(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyCanadaHeading(TestData);
		verifyCanadaHeadingCollapsed(TestData);
		clickCanadaHeading(TestData);
		
		selectCanadianBranch(TestData,1);
		// Test Step: check option "Yes" under FRFI is automatically selected
		selectCanadianBranch(TestData,2);
		// Test Step: check option "No" under FRFI is automatically selected
		
		endSession();
	}
	
	public static void Case14(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyCanadaHeading(TestData);
		verifyCanadaHeadingCollapsed(TestData);
		clickCanadaHeading(TestData);
		
		selectCanadaAANAThreshold(TestData,2);
		//saveEntity();
		//sleep(4000);
		// Test Step: Verify error message

		// user selects any one option
		selectCanadaAANAThresholdEstimate(TestData,1);
		saveEntity();
		sleep(4000);
		quitBrowser();
	}
	
	public static void Case15(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyCanadaHeading(TestData);
		verifyCanadaHeadingCollapsed(TestData);
		clickCanadaHeading(TestData);
		
		selectCanadaAANAThreshold(TestData,1);
		// Test Step: verify radio button is automatically set to none of the above
		
		// choose any option but 5;
		selectCanadaAANAThresholdEstimate(TestData,1);
		saveEntity();
		sleep(3000);
		// Test Step: verify error message
		
		// choose option 5
		selectCanadaAANAThresholdEstimate(TestData,5);
		saveEntity();
		sleep(3000);
		quitBrowser();
	}
	
	public static void Case16(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyCanadaHeading(TestData);
		verifyCanadaHeadingCollapsed(TestData);
		clickCanadaHeading(TestData);
		
		selectCanadaAANAThreshold(TestData,3);
		// Test Step: radio button is automatically set to option Decline to answer
		
		selectCanadaAANAThreshold(TestData,4);
		// Test Step: radio button is automatically set to option Decline to answer
		
		//choose any option but 6
		selectCanadaAANAThresholdEstimate(TestData,1);
		saveEntity();
		// Test Step: verify the error message
		sleep(4000);
		// choose option 6
		selectCanadaAANAThresholdEstimate(TestData,6);
		saveEntity();
		sleep(3000);
		// Test Step: verify no error message
		quitBrowser();
	}
	
	public static void Case17(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyCanadaHeading(TestData);
		verifyCanadaHeadingCollapsed(TestData);
		clickCanadaHeading(TestData);
		
		sleep(2000);
		String[] headings = {"CanadaOSFIEntity","CanadaOSFIEntity2","CanadaBranchFRFI","CanadaCoveredEntity","CanadaCrossBorderStatus","CanadaCrossBorderStatus2","CanadaAANAInformation","CanadaAANAInformation2","CanadaAANAThreshold","CanadaAANAThresholdEstimate"};
		CanadaMegaFunction(TestData, headings);
		
		// Test Step: confirm display of modal
		
		/*
		verifyCanadaOSFIHeading(TestData);
		verifyCanadaOSFIHeading2(TestData);
		verifyCanadaDomesticFRFI(TestData);
		verifyCanadaCoveredEntity(TestData);
		verifyCanadaCrossBorder(TestData);
		verifyCanadaCrossBorder2(TestData);
		verifyCanadaAANAInformation(TestData);
		verifyCanadaAANAInformation2(TestData);
		verifyCanadaAANAThreshold(TestData);
		verifyCanadaAANAThresholdEstimate(TestData);
		*/
		endSession();
	}
	
	
	
	//FOR SCTM SELF DISCLOSURE TEST CASES (EU)
	
	public static void Case18(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
			// 34 steps in total
			Login(sUserId, sPassword, sOrganization);
			processDetails();
			fillInInformation(TestData);
			verifyRelevantRegulatoryJurisdiction(TestData);
			verifyEUheading(TestData);
			endSession();
}
        public static void Case19(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
        	//10 steps in total
        	Login(sUserId, sPassword, sOrganization);
        	processDetails();
			verifyRelevantRegulatoryJurisdiction(TestData);
			verifyEUheading(TestData);
			nonexemptEU();
			scrolldown();
			//EUValidationmessage1();
			//EUValidationmessage2();
			click("EU_NonExemptFC");
			SaveEntity();
			//EUValidationmessage2();
			endSession();
        }
        
        public static void Case20(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
        	//10 steps in total
        	Login(sUserId, sPassword, sOrganization);
        	processDetails();
        	scrolldown();
			verifyRelevantRegulatoryJurisdiction(TestData);
			verifyEUheading(TestData);
			//verifyEUCollapsed(TestData);
			nonexemptEU();
			scrolldown();
			click("EU_NonExemptFC");
			click("EU_CrossBorder_yes");
			SaveEntity();
			sleep(2000);
			//EUValidationmessage3();
			click("EU_DSF_yes");
			SaveEntity();
			endSession();
        }
    
	
	public static void Case21(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
    	//10 steps in total
    	Login(sUserId, sPassword, sOrganization);
    	processDetails();
    	scrolldown();
    	verifyRelevantRegulatoryJurisdiction(TestData);
		verifyEUheading(TestData);
		//verifyEUCollapsed(TestData);
		nonexemptEU();
		scrolldown();
		click("EU_NonExemptFC");
		click("EU_CrossBorder_no");
		SaveEntity();
		endSession();
		//EUValidationmessage3();
    }
        		

	
	public static void Case22(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
    	//10 steps in total
    	Login(sUserId, sPassword, sOrganization);
    	processDetails();
    	scrolldown();
    	verifyRelevantRegulatoryJurisdiction(TestData);
		verifyEUheading(TestData);
		//verifyEUCollapsed(TestData);
		nonexemptEU();
		scrolldown();
		click("EU_NonExemptNFC+");
		click("EU_CrossBorder_no");
		SaveEntity();
		endSession();
		//EUValidationmessage3();
    }
    
	    
	public static void Case23(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
    	//10 steps in total
    	Login(sUserId, sPassword, sOrganization);
    	processDetails();
    	scrolldown();
    	sleep(2000);
    	verifyRelevantRegulatoryJurisdiction(TestData);
    	sleep(2000);
		verifyEUheading(TestData);
		nonexemptEU();
		scrolldown();
		click("EU_NonExemptNFC+");
		click("EU_CrossBorder_yes");
		scrollup();
		clickEntityIsMultibranch();
		scrolldown();
		EUBranchyes();
		SaveEntity();
		endSession();
		
	}

		public static void Case24(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
			//10 Test steps
	    	Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	    	sleep(2000);
	    	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
			verifyEUheading(TestData);
			EUExempt(TestData);
			endSession();
		}
		
		public static void Case25(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
	    	//11 Test steps
	    	Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	    	sleep(2000);
	    	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
			verifyEUheading(TestData);
			VerifyAANAThresholdHeading(TestData);
			scrolldown();
			EUAANAThreshold(TestData,1);
			sleep(2000);
			EUAANAThresholdEstimate(TestData,2);
			SaveEntity();
			sleep(3000);
			EUAANAThresholdEstimate(TestData,5);
			SaveEntity();
			endSession();
		}
	

		public static void Case26(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
	    	//11 steps in total
	    	Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	     	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
	    	verifyEUheading(TestData);
			EUAANAThreshold(TestData,3);
			sleep(2000);
			EUAANAThresholdEstimate(TestData,1);
			SaveEntity();
			sleep(3000);
			EUAANAThresholdEstimate(TestData,6);
			SaveEntity();
			endSession();
		}
		
		public static void Case27(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
	    	//13 steps in total
	    	Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	    	sleep(2000);
	    	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
			verifyEUheading(TestData);
			EUAANAThreshold(TestData,2);
			sleep(2000);
			SaveEntity();
			EUAANAThresholdEstimate(TestData,3);
			SaveEntity();
			endSession();
			
		}
		
		public static void Case28(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
	    	//39 steps in total
	    	Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	    	sleep(2000);
	    	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
	    	verifyEUheading(TestData);
	    	sleep(2000);
	    	String[] headings= {"EUEntityStatus","EUExempt","EUNonExempt","EuCrossBorderStatus","EUThirdCountryEntity","EU_DSF","EUBranchTransaction","EUAANAGroupInfo2","EUAANAGroupInformation","EU_AANAThreshold","EUAANAThresholdEstimate"};
	    	EUMegaFunction(TestData, headings);
	    	sleep(2000);
	    	SaveEntity();
	    	endSession();
		}
		
	//SWITZERLAND JURISDICTION
		
		public static void Case29 (String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
	    	//6 steps in total
	    	Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	    	sleep(2000);
	    	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
	    	verifySwitzerlandheading(TestData);
	    	String[] headings= {"SwissFMIAEntityStatus","SwissExempt","SwissNonExempt","SwissThirdCountryEntity","FMIAAANAGroupInformation","FMIAAANAGroupInformation2", 
	    			"SwissAANAThreshold","FMIAAANAThresholdEstimate"};
	    	SwitzerlandMegaFunction(TestData, headings);
	    	SaveEntity();
		     endSession();
		}
		
		public static void Case30(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
	    	//6 steps in total
	    	Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	    	sleep(2000);
	    	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
	    	verifySwitzerlandheading(TestData);
		   endSession();
		}
		
		public static void Case31(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
	    	//6 steps in total
	    	Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	    	sleep(2000);
	    	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
	    	verifySwitzerlandheading(TestData);
	    	//String[] headings= {"SwissAANAThreshold","FMIAAANAThresholdEstimate"};
	    	String[] headings= {"SwissFMIAEntityStatus","SwissExempt","SwissNonExempt","SwissThirdCountryEntity","FMIAAANAGroupInformation","FMIAAANAGroupInformation2","SwissAANAThreshold","FMIAAANAThresholdEstimate"};
	    	SwitzerlandMegaFunction(TestData, headings);
		   // endSession();
		}
		
		public static void Case32(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
	    	//6 steps in total
	    	Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	    	sleep(2000);
	    	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
	    	verifySwitzerlandheading(TestData);
			endSession();
		}
		
		public static void Case33(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
	    	//6 steps in total
	    	Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	    	sleep(2000);
	    	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
	    	verifySwitzerlandheading(TestData);
			endSession();
		}
		
		public static void Case34(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
	    	//6 steps in total
	    	Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	    	sleep(2000);
	    	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
	    	verifySwitzerlandheading(TestData);
			endSession();
		}
		
		public static void Case35(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
	    	//10 steps in total
	    	Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	    	sleep(2000);
	    	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
	    	verifySwitzerlandheading(TestData);
	    	sleep(2000);
	    	String[] headings= {"SwissFMIAEntityStatus","SwissExempt","SwissNonExempt"};
	    	SwitzerlandMegaFunction(TestData, headings);
	        endSession();
		}
		public static void Case36(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
	    	//17 steps in total
	    	Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	    	sleep(2000);
	    	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
	    	verifySwitzerlandheading(TestData);
	    	sleep(2000);
	    	String[] headings= {"SwissFMIAEntityStatus"};
	    	SwitzerlandMegaFunction(TestData, headings);
	    	
	    	FMIAANNAThresholdEstimateHeading(TestData);
	    	VerifySwissFMIAAANAThreshold(TestData,1);
	    	sleep(2000);
	    	VerifySwissFMIAAANAThresholdEstimate(TestData,2);
	    	SaveEntity();
	    	VerifySwissFMIAAANAThresholdEstimate(TestData,5);
	    	VerifySwissFMIAAANAThreshold(TestData,2);
	    	VerifySwissFMIAAANAThresholdEstimate(TestData,1);
	    	sleep(2000);
	    	VerifySwissFMIAAANAThreshold(TestData,3);
	    	VerifySwissFMIAAANAThresholdEstimate(TestData,1);
	    	SaveEntity();
	    	VerifySwissFMIAAANAThresholdEstimate(TestData,6);
	    	VerifySwissFMIAAANAThreshold(TestData,4);
	    	VerifySwissFMIAAANAThresholdEstimate(TestData,1);
	    	SaveEntity();
	    	VerifySwissFMIAAANAThresholdEstimate(TestData,6);
	    	SaveEntity();
	    	endSession();
		}
		
		public static void Case37(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
	    	//10 steps in total
	    	Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	    	sleep(2000);
	    	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
	    	verifySwissCollapsed(TestData);
	    	verifySwitzerlandheading(TestData);
	    	sleep(2000);
	    	/*verifyFMIAEntityStatusheading(TestData);
	    	SwissThirdCountryEntityHeading(TestData);*/
	    	String[] headings= {"SwissFMIAEntityStatus","SwissExempt","SwissNonExempt","SwissThirdCountryEntity","FMIAAANAGroupInformation","FMIAAANAGroupInformation2"};
	    	SwitzerlandMegaFunction(TestData, headings);
	    	//VerifyFMIANonExempt(TestData, 1);
	    	SaveEntity();
	    	//VerifySwissAANAGroupInfo(TestData,2);
	    	//SaveEntity();
	    	endSession();
	    	
		}
		
		public static void Case38(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
	    	//10 steps in total
	    	Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	    	sleep(2000);
	    	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
	    	verifySwitzerlandheading(TestData);
	    	sleep(2000);
	    	//verifyFMIAEntityStatusheading(TestData);
	    	//SwissThirdCountryEntityHeading(TestData);
	    	String[] headings= {"SwissFMIAEntityStatus","SwissThirdCountryEntity"};
	    	SwitzerlandMegaFunction(TestData, headings);
	    	
	    	//endSession();
	    	
		}
	
		public static void Case39(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
	    	//10 steps in total
	    	Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	    	sleep(2000);
	    	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
	    	verifySwitzerlandheading(TestData);
	    	sleep(2000);
	    	String[] headings= {"SwissFMIAEntityStatus","SwissNonExempt"};
	    	SwitzerlandMegaFunction(TestData, headings);
	    	SaveEntity();
	    	endSession();
	    	
		}
		
		public static void Case40(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
	    	//10 steps in total
	    	Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	    	sleep(2000);
	    	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
	    	verifySwitzerlandheading(TestData);
	    	sleep(2000);
	    	/*SwissThirdCountryEntityHeading(TestData);
	    	VerifyFMIANonExempt(TestData,2);
	    	VerifyThirdCountryEntity(TestData,1);
	    	SaveEntity();
	    	VerifySwissAANAGroupInfo(TestData,2);*/
	    	String[] headings= {"SwissFMIAEntityStatus","SwissExempt","SwissNonExempt","SwissThirdCountryEntity","FMIAAANAGroupInformation","FMIAAANAGroupInformation2"};
	    	SwitzerlandMegaFunction(TestData, headings);

	    	SaveEntity();
	    	endSession();
	    	
		}
		
		public static void Case41(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
	    	//10 steps in total
	    	Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	    	sleep(2000);
	    	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
	    	verifySwitzerlandheading(TestData);
	    	sleep(2000);
	    	String[] headings= {"SwissFMIAEntityStatus","SwissExempt","SwissNonExempt","SwissThirdCountryEntity"};
	    	SwitzerlandMegaFunction(TestData, headings);
	    	SaveEntity();
	    	endSession();
	    	
		}
		
		public static void Case42(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
	    	//10 steps in total
	    	Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	    	sleep(2000);
	    	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
	    	verifySwitzerlandheading(TestData);
	    	sleep(2000);
	    	//VerifySwissFMIAAANAThreshold(TestData,1);
	    	String[] headings= {"SwissFMIAEntityStatus", "SwissExempt","SwissNonExempt","SwissThirdCountryEntity","FMIAAANAGroupInformation","FMIAAANAGroupInformation2",
	    			"SwissAANAThreshold","FMIAAANAThresholdEstimate"};
	    	SwitzerlandMegaFunction(TestData, headings);
	    	sleep(2000);
	    	//VerifySwissFMIAAANAThreshold(TestData,1);
	    	
	    	endSession();
	    	
		}
		
		public static void Case43(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
	    	//10 steps in total
			Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	    	//sleep(2000);
	    	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
	    	verifySwitzerlandheading(TestData);
	    	scrolldown();
	    	scrolldown();
	       	String[] headings= {"SwissAANAThreshold","FMIAAANAThresholdEstimate"};
	       	SwitzerlandMegaFunction(TestData, headings);
	    	sleep(2000);
	    	//VerifySwissFMIAAANAThreshold(TestData,2);
	    	//SaveEntity();
	    	endSession();
		}
		
		public static void Case44(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
	    	//10 steps in total
			Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	    	sleep(2000);
	    	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
	    	verifySwitzerlandheading(TestData);
	    	sleep(2000);
	    	String[] headings= {"SwissFMIAEntityStatus", "SwissExempt","SwissNonExempt","SwissThirdCountryEntity","FMIAAANAGroupInformation","FMIAAANAGroupInformation2",
	    			"SwissAANAThreshold","FMIAAANAThresholdEstimate"};
	    	SwitzerlandMegaFunction(TestData, headings);
	    	VerifySwissFMIAAANAThreshold(TestData,3);
	    	endSession();
		}
		
		public static void Case45(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
	    	//10 steps in total
			Login(sUserId, sPassword, sOrganization);
	    	processDetails();
	    	scrolldown();
	    	sleep(2000);
	    	verifyRelevantRegulatoryJurisdiction(TestData);
	    	sleep(2000);
	    	verifySwitzerlandheading(TestData);
	    	sleep(2000);
	    	String[] headings= {"SwissFMIAEntityStatus", "SwissExempt","SwissNonExempt","SwissThirdCountryEntity","FMIAAANAGroupInformation","FMIAAANAGroupInformation2",
	    			"SwissAANAThreshold","FMIAAANAThresholdEstimate"};
	    	SwitzerlandMegaFunction(TestData, headings);
	    	VerifySwissFMIAAANAThreshold(TestData,4);
	    	VerifySwissFMIAAANAThresholdEstimate(TestData,1);
	    	SaveEntity();
	    	VerifySwissFMIAAANAThresholdEstimate(TestData,6);
	    	SaveEntity();
	    	endSession();
		}
		
	
	
	// JAPAN
	public static void Case46(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		scrolldown();
    	sleep(2000);
		
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyJapanHeading(TestData);
		verifyJapanHeadingCollapsed(TestData);
		clickJapanHeading(TestData);
		sleep(1000);
		
		String[] headings = {"JP_Entities","JP_EntitiesNotAMultiBranch","JP_AANAGroup","JP_AANAGroup2","JP_AANAThreshold","JP_AANAThresholdEstimate"};
		JapanMegaFunction(TestData, headings);
		
		endSession();
	}
	
	public static void Case47(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		scrolldown();
    	sleep(2000);
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyJapanHeading(TestData);
		verifyJapanHeadingCollapsed(TestData);
		clickJapanHeading(TestData);
		
		//String[] headings = {"JP_AANAThreshold","JP_AANAThresholdEstimate"};
		//JapanMegaFunction(TestData, headings);
		
		if(click("JP_AANAThreshold_above")) {
			test.log(LogStatus.PASS, "Select Above 420 trillion radio button", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select Above 420 trillion radio button", "Not verified");
		}
		// automatically None of the Above should also be selected
		if(click("JP_AANAThresholdEstimate_2017")) {
			test.log(LogStatus.PASS, "Change option from None of the Above", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Change option from None of the Above", "Not verified");
		}
		
		// TEST STEP: validate ensuing error message
		
		if(click("JP_AANAThreshold_notabove")) {
			test.log(LogStatus.PASS, "Select Not above 420 trillion radio button", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select Not above 420 trillion radio button", "Not verified");
		}
		if(click("JP_AANAThreshold_ultimate")) {
			test.log(LogStatus.PASS, "Select one of last two radio buttons under Threshold heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select one of last two radio buttons under Threshold heading", "Not verified");
		}
		if(click("JP_AANAThresholdEstimate_2017")) {
			test.log(LogStatus.PASS, "Change option to any other options other than Decline to answer", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Change option to any other options other than Decline to answer", "Not verified");
		}
		saveEntity();
		
		// TEST STEP: validate ensuing error message
		
		// TEST STEP: choose all the required mandatory options
		
		saveEntity();
		endSession();
		
	}
	public static void Case48(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyJapanHeading(TestData);
		verifyJapanHeadingCollapsed(TestData);
		clickJapanHeading(TestData);
		
		if(click("JP_AANAThreshold_above")) {
			test.log(LogStatus.PASS, "Select Above 420 trillion radio button", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select Above 420 trillion radio button", "Not verified");
		}
		
		// TEST STEP: checks heading Threshold Estimate
		
		if(click("JP_AANAThresholdEstimate_2017")) {
			test.log(LogStatus.PASS, "Change option to any other options other than Decline to answer", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Change option to any other options other than Decline to answer", "Not verified");
		}
		saveEntity();
		// TEST STEP: validate ensuing error message
		// TEST STEP: user must select none of the above to save
		endSession();
	}
	
	public static void Case49(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyJapanHeading(TestData);
		verifyJapanHeadingCollapsed(TestData);
		clickJapanHeading(TestData);
		
		if(click("JP_AANAGroup_yes")) {
			test.log(LogStatus.PASS, "Select one option under Member of a Japan AANA Group heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select one option under Member of a Japan AANA Group heading", "Not verified");
		}
		
		// TEST STEP: user does not select an option under Entities in Japan Entity Status heading
		click("SaveEntities");
		// TEST STEP: validate ensuing error message
		if(click("JP_Entities_FIBO")) {
			test.log(LogStatus.PASS, "Select one option under Entities in Japan Entity Status heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select one option under Entities in Japan Entity Status heading", "Not verified");
		}
		saveEntity();
		// TEST STEP: if no validation message, that's it;
		// if validation message, select one option under Principal that is NOT a Multi-Branch Entity
	
		endSession();
	}
	
	public static void Case50(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyJapanHeading(TestData);
		verifyJapanHeadingCollapsed(TestData);
		clickJapanHeading(TestData);
		
		if(click("JP_AANAThreshold_notabove")) {
			test.log(LogStatus.PASS, "Select Not above 420 trillion radio button", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select Not above 420 trillion radio button", "Not verified");
		}
		saveEntity();
		// TEST STEP: validate ensuing error message
		
		if(click("JP_AANAThresholdEstimate_2017")) {
			test.log(LogStatus.PASS, "Change option to any other options other than Decline to answer", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Change option to any other options other than Decline to answer", "Not verified");
		}
		saveEntity();
		
		endSession();
		
	}
	
	public static void Case51(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyJapanHeading(TestData);
		verifyJapanHeadingCollapsed(TestData);
		clickJapanHeading(TestData);
		
		if(click("JP_AANAThreshold_ultimate")) {
			test.log(LogStatus.PASS, "Select Principal Japan Ultimate Parent radio button", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select Principal Japan Ultimate Parent radio button", "Not verified");
		}
		
		// TEST STEP: check heading and that decline to answer to automatically selected
		
		if(click("JP_AANAThreshold_person")) {
			test.log(LogStatus.PASS, "Select \"separately reported by the following person\" radio button", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select \"separately reported by the following person\" radio button", "Not verified");
		}
		
		// TEST STEP: check heading and that decline to answer to automatically selected
		
		if(click("JP_AANAThresholdEstimate_2017")) {
			test.log(LogStatus.PASS, "Change option to any other options other than Decline to answer", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Change option to any other options other than Decline to answer", "Not verified");
		}
		saveEntity();
		// TEST STEP: validate ensuing error message
		
		if(click("JP_AANAThresholdEstimate_decline")) {
			test.log(LogStatus.PASS, "Change option to any other options other than Decline to answer", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Change option to any other options other than Decline to answer", "Not verified");
		}
		saveEntity();
		// TEST STEP: validate there's no ensuing error message
		
		endSession();
	}
	
	public static void Case52(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyJapanHeading(TestData);
		verifyJapanHeadingCollapsed(TestData);
		clickJapanHeading(TestData);
		
		// without selecting entities in Japan, select the following:
		if(click("JP_AANAGroup_yes")) {
			test.log(LogStatus.PASS, "Select one option under Member of a Japan AANA Group heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select one option under Member of a Japan AANA Group heading", "Not verified");
		}
		saveEntity();
		
		// TEST STEP: validate Entities in Japan Entity Status is highlighted in red border
		
		// TEST STEP: select all required options
		// must include an option in Japan Entity Status
		saveEntity();
		
		endSession();
	}
	
	public static void Case53(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		clickEntityIsMultibranch();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyJapanHeading(TestData);
		verifyJapanHeadingCollapsed(TestData);
		clickJapanHeading(TestData);
		
		if(click("JP_Entities_FIBO")) {
			test.log(LogStatus.PASS, "Select one option under Entities in Japan Entity Status heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select one option under Entities in Japan Entity Status heading", "Not verified");
		}
		saveEntity();
		// TEST STEP: validate ensuing error message
		
		// TEST STEP: validate Entities NOT in Japan Entity Status is highlighted in red border
		if(click("JP_NoBranch")) {
			test.log(LogStatus.PASS, "Select one option under Entities in Japan Entity Status heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select one option under Entities in Japan Entity Status heading", "Not verified");
		}
		// TEST STEP: one of the options below must be checked
		
		if(click("JP_SomeOrAllBranch")) {
			test.log(LogStatus.PASS, "Select one option under Entities in Japan Entity Status heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select one option under Entities in Japan Entity Status heading", "Not verified");
		}
		// TEST STEP: one of the options below must be checked
		
		saveEntity();
		// TEST STEP: verify the error message
		// TEST STEP: validate Head Office heading is highlighted in red border
		// with correct error message
		if(click("JP_HeadOffice_regulated")) {
			test.log(LogStatus.PASS, "Select one option under Head Office and/or Branches Outside Japan heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select one option under Head Office and/or Branches Outside Japan heading", "Not verified");
		}
		saveEntity();
		
		endSession();
	}
	
	public static void Case54(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyJapanHeading(TestData);
		verifyJapanHeadingCollapsed(TestData);
		clickJapanHeading(TestData);
		sleep(2000);
		click("JP_AANAThreshold_person");
		if(click("JP_AANAThreshold_person")) {
			test.log(LogStatus.PASS, "Select Principal Japan Ultimate Parent radio button", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select Principal Japan Ultimate Parent radio button", "Not verified");
		}
		sleep(1000);
		// A modal should appear on its own?
		clickLink("JP_linkToModal");
		
		sleep(2000);
		// have one for each heading
		verifyModalHeading(TestData,"JPModal_LegalName","JPModal_legalNameHeading");
		verifyModalHeading(TestData,"JPModal_EntityIdentifier","JPModal_entityIdentifierHeading");
		verifyModalHeading(TestData,"JPModal_Address","JPModal_addressHeading");
		verifyModalHeading(TestData,"JPModal_City","JPModal_cityHeading");
		verifyModalHeading(TestData,"JPModal_StateOrProvince","JPModal_stateOrProvinceHeading");
		verifyModalHeading(TestData,"JPModal_Country","JPModal_countryHeading");
		verifyModalHeading(TestData,"JPModal_PostalCode","JPModal_postalCodeHeading");
		//check inputs
		
		if (click("JPModal_cancelButton")) {
			test.log(LogStatus.PASS, "Cancel Button", "Able to click");
		} else {
			test.log(LogStatus.FAIL, "Cancel Button", "Not able to click");
		}
		/*
		click("JP_linkToModal");
		if (click("JPModal_OKButton")) {
			test.log(LogStatus.PASS, "Save Button", "Able to click");
		} else {
			test.log(LogStatus.FAIL, "Save Button", "Not able to click");
		}
		click("JP_linkToModal");
		if (click("JPModal_CloseButton")) {
			test.log(LogStatus.PASS, "Close Button", "Able to click");
		} else {
			test.log(LogStatus.FAIL, "Close Button", "Not able to click");
		}
		*/
		endSession();
	}
	
	//USA
	
	public static void Case55(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		
		verifyUSAHeading(TestData);
		verifyUSAHeadingCollapsed(TestData);
		clickUSAHeading(TestData);
		sleep(1000);
		
		if(click("US_AANAThreshold_above")) {
			test.log(LogStatus.PASS, "Select Above 3 trillion radio button", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select Above 3 trillion radio button", "Not verified");
		}
		// automatically None of the Above should also be selected
		if(click("US_AANAThresholdEstimate_2017")) {
			test.log(LogStatus.PASS, "Change option from None of the Above", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Change option from None of the Above", "Not verified");
		}
		saveEntity();
		// TEST STEP: validate ensuing error message
		if(click("US_AANAThresholdEstimate_none")) {
			test.log(LogStatus.PASS, "Change option from None of the Above", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Change option from None of the Above", "Not verified");
		}
		saveEntity();
		
		endSession();
	}
	
	public static void Case56(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyUSAHeading(TestData);
		verifyUSAHeadingCollapsed(TestData);
		clickUSAHeading(TestData);
		sleep(1000);
		if(click("US_SEC_Issuer")) {
			test.log(LogStatus.PASS, "Select SEC Issuer/Filer", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select SEC Issuer/Filer", "Not verified");
		}
		saveEntity();
		// TEST STEP: validate ensuing error message
		String textToEnter = "";
		if(writeInInput("US_SEC_centralIndexKey",textToEnter)) {
			test.log(LogStatus.PASS, "Enter SEC Central Index Key Number", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Enter SEC Central Index Key Number", "Not verified");
		}
		saveEntity();
		// TEST STEP: validate ensuing error message
		if(click("US_BoardApproval_approved")) {
			test.log(LogStatus.PASS, "Select an option under Board Approval heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under Board Approval heading", "Not verified");
		}
		// TEST STEP: no more red highlight around section
		saveEntity();

		endSession();
	}
	
	public static void Case57(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyUSAHeading(TestData);
		verifyUSAHeadingCollapsed(TestData);
		clickUSAHeading(TestData);
		scrolldown();
		if(click("US_AANAGroup_yes")==true) {
			test.log(LogStatus.PASS, "Select an option under Member of a US AANA Group heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under Member of a US AANA Group heading", "Not verified");
		}
		saveEntity();
		sleep(2000);
		
		// TEST STEP: validate ensuing error message
		// and check if section is highlighted in red
		if(click("US_PREntityStatus_MSP_PR")==true) {
			test.log(LogStatus.PASS, "Select None of the above option under PR Cross Border Status general heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select None of the above option under PR Cross Border Status general heading", "Not verified");
		}
	
		sleep(2000);
		saveEntity();
		sleep(4000);
		// TEST STEP: validate ensuing error message
		
		if(click("US_PR_none")==true) {
			test.log(LogStatus.PASS, "Select an option under PR Cross Border Status US Branches & Agencies heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under PR Cross Border Status US Branches & Agencies heading", "Not verified");
		}
		scrollup();sleep(3000);
		//click("EntityIsMultibranch");
		clickEntityIsMultibranch();
		sleep(2000);
		saveEntity();
		sleep(3000);
		
		// TEST STEP: validate ensuing error message
		
		if(click("US_PR_noGuarentees")==true) {
			test.log(LogStatus.PASS, "Select an option under PR Cross Border Status US Guarantees heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under PR Cross Border Status US Guarantees heading", "Not verified");
		}
		saveEntity();
		// TEST STEP: validate no ensuing error message
		sleep(3000);
		if(click("US_PR_someOrAllBranch")==true) {
			test.log(LogStatus.PASS, "Select an option under PR Cross Border Status - PR US Branches & Agencies", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under PR Cross Border Status - PR US Branches & Agencies", "Not verified");
		}
		saveEntity();
		sleep(3000);
		
		if(click("US_PR_guarentees")==true) {
			test.log(LogStatus.PASS, "Select an option under PR Cross Border Status - US Guarantees", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under PR Cross Border Status - US Guarantees", "Not verified");
		}
		//endSession();
	}
	
	public static void Case58(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyUSAHeading(TestData);
		verifyUSAHeadingCollapsed(TestData);
		clickUSAHeading(TestData);
		
		if(click("US_CFTC_nonfinancial")) {
			test.log(LogStatus.PASS, "Select an option under PR Cross Border Status US Branches & Agencies heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under PR Cross Border Status US Branches & Agencies heading", "Not verified");
		}
		saveEntity();
		// TEST STEP: validate ensuing error message
		
		if(click("US_Swaps_allTransactions")) {
			test.log(LogStatus.PASS, "Select an option under Swaps Hedging Exemption Elections heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under Swaps Hedging Exemption Elections heading", "Not verified");
		}
		if(click("US_Swaps_annualFiling")) {
			test.log(LogStatus.PASS, "Select an option under Swaps Hedging Exemption Reporting heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under Swaps Hedging Exemption Reporting heading", "Not verified");
		}
		saveEntity();
		// TEST STEP: validate ensuing error message
		
		endSession();
	}
	
	public static void Case59(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyUSAHeading(TestData);
		verifyUSAHeadingCollapsed(TestData);
		clickUSAHeading(TestData);
		
		if(click("US_AANAThreshold_notabove")) {
			test.log(LogStatus.PASS, "Select Not Above option under2016 US AANA Threshold heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select Not Above option under2016 US AANA Threshold heading", "Not verified");
		}
		saveEntity();
		// TEST STEP: validate ensuing error message
		
		if(click("US_AANAThresholdEstimate_2017")) {
			test.log(LogStatus.PASS, "Select an option under US AANA Threshold Estimate heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under US AANA Threshold Estimate heading", "Not verified");
		}
		saveEntity();
		endSession();
		
	}
	
	public static void Case60(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyUSAHeading(TestData);
		verifyUSAHeadingCollapsed(TestData);
		clickUSAHeading(TestData);
		
		if(click("US_CFTC_none")) {
			test.log(LogStatus.PASS, "Select an option under CFTC Cross-Border Status - General heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under CFTC Cross-Border Status - General heading", "Not verified");
		}
		sleep(4000);
		scrollup();
		clickEntityIsMultibranch();
		saveEntity();
		// TEST STEP: validate ensuing error message
		sleep(4000);
		if(click("US_CFTC_noBranch")) {
			test.log(LogStatus.PASS, "Select an option under CFTC Cross-Border Status - CFTC US Branches heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under CFTC Cross-Border Status - CFTC US Branches heading", "Not verified");
		}
		saveEntity();
		
		endSession();
	}

	public static void Case61(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyUSAHeading(TestData);
		verifyUSAHeadingCollapsed(TestData);
		clickUSAHeading(TestData);
		
		if(click("US_AANAGroup_yes")) {
			test.log(LogStatus.PASS, "Select an option under Member of a US AANA Group heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under Member of a US AANA Group heading", "Not verified");
		}
		saveEntity();
		// TEST STEP: validate ensuing error message
		if(click("US_CFTCEntityStatus_none")) {
			test.log(LogStatus.PASS, "Select an option under CFTC Entity Status heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under CFTC Entity Status heading", "Not verified");
		}
		saveEntity();
		// TEST STEP: validate ensuing error message
		if(click("US_CFTC_none")) {
			test.log(LogStatus.PASS, "Select an option under CFTC Cross-Border Status heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under CFTC Cross-Border Status heading", "Not verified");
		}
		saveEntity();
		// TEST STEP: validate ensuing error message
		if(click("US_CFTC_noGuarentees")) {
			test.log(LogStatus.PASS, "Select an option under CFTC Cross-Border Status - US Guarantees heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under CFTC Cross-Border Status - US Guarantees heading", "Not verified");
		}
		saveEntity();
		
		endSession();
	}
	
	public static void Case62(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyUSAHeading(TestData);
		verifyUSAHeadingCollapsed(TestData);
		clickUSAHeading(TestData);
		
		if(click("US_CFTC_none")) {
			test.log(LogStatus.PASS, "Select an option under CFTC Cross-Border Status heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under CFTC Cross-Border Status heading", "Not verified");
		}
		scrollup();
		sleep(4000);
		clickEntityIsMultibranch();
		saveEntity();
		// TEST STEP: validate ensuing error message
		scrolldown();
		if(click("US_PR_noBranch")) {
			test.log(LogStatus.PASS, "Select an option under PR Cross-Border Status - PR US Branches & Agencies heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under PR Cross-Border Status - PR US Branches & Agencies heading", "Not verified");
		}
		sleep(3000);
		endSession();
	}
	
	public static void Case63(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyUSAHeading(TestData);
		verifyUSAHeadingCollapsed(TestData);
		clickUSAHeading(TestData);
		
		if(click("US_PREntityStatus_SD_PR")) {
			test.log(LogStatus.PASS, "Select an option under PR Entity Status heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under PR Entity Status heading", "Not verified");
		}
		if(click("US_PR_none")) {
			test.log(LogStatus.PASS, "Select an option under PR Cross-Border Status - General heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under PR Cross-Border Status - General heading", "Not verified");
		}
		sleep(4000);
		scrollup();
		clickEntityIsMultibranch();
	
		saveEntity();
		sleep(4000);
		// TEST STEP: validate ensuing error message
		if(click("US_PR_noBranch")) {
			test.log(LogStatus.PASS, "Select an option under PR Cross-Border Status - PR US Branches & Agencies heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under PR Cross-Border Status - PR US Branches & Agencies heading", "Not verified");
		}
		saveEntity();
		
		endSession();
	}
	
	public static void Case64(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyUSAHeading(TestData);
		verifyUSAHeadingCollapsed(TestData);
		clickUSAHeading(TestData);
		
		if(click("US_CFTCEntityStatus_SD_PR")) {
			test.log(LogStatus.PASS, "Select an option under CFTC Entity Status heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under CFTC Entity Status heading", "Not verified");
		}
		if(click("US_CFTC_none")) {
			test.log(LogStatus.PASS, "Select an option under CFTC Cross-Border Status - General heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under CFTC Cross-Border Status - General heading", "Not verified");
		}
		scrollup();
		sleep(4000);
		clickEntityIsMultibranch();
		sleep(3000);
		saveEntity();
		// TEST STEP: validate ensuing error message
		scrolldown();
		if(click("US_CFTC_noBranch")) {
			test.log(LogStatus.PASS, "Select an option under CFTC Cross-Border Status - US Branches & Agencies heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under CFTC Cross-Border Status - US Branches & Agencies heading", "Not verified");
		}
		saveEntity();
		
		endSession();
	}

	
	public static void Case65(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyUSAHeading(TestData);
		verifyUSAHeadingCollapsed(TestData);
		clickUSAHeading(TestData);
		
		if(click("US_AANAThreshold_ultimate")==true) {
			test.log(LogStatus.PASS, "Select US AANA will be separately reported by Principal’s US Ultimate ", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select US AANA information will be separately reported by Principal’s US Ultimate ", "Not verified");
		}
		// automatically Decline to Answer should also be selected
		if(click("US_AANAThreshold_person")==true) {
			test.log(LogStatus.PASS, "Select US AANA information will be separately reported by Principal’s US Ultimate ", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select US AANA information will be separately reported by Principal’s US Ultimate ", "Not verified");
		}
		// automatically Decline to Answer should also be selected
		
		if(click("US_AANAThresholdEstimate_2017")==true) {
			test.log(LogStatus.PASS, "Select an option under US AANA Threshold Estimate heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under US AANA Threshold Estimate heading", "Not verified");
		}
		saveEntity();
		// TEST STEP: validate ensuing error message
		if(click("US_AANAThresholdEstimate_decline")==true) {
			test.log(LogStatus.PASS, "Select an option under US AANA Threshold Estimate heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under US AANA Threshold Estimate heading", "Not verified");
		}
		sleep(3000);
		saveEntity();
		// TEST STEP: validate no ensuing error message
		
		//endSession();
	}
	
	public static void Case66(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		verifyUSAHeading(TestData);
		verifyUSAHeadingCollapsed(TestData);
		clickUSAHeading(TestData);
		
		if(click("US_CFTCEntityStatus_SD_PR")) {
			test.log(LogStatus.PASS, "Select an option under CFTC Entity Status heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under CFTC Entity Status heading", "Not verified");
		}
		saveEntity();
		// TEST STEP: validate ensuing error message
		if(click("US_PREntityStatus_SD_PR")) {
			test.log(LogStatus.PASS, "Select an option under PR Entity Status heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under PR Entity Status heading", "Not verified");
		}
		sleep(2000);
		saveEntity();
		// TEST STEP: validate ensuing error message
		if(click("US_AANAGroup_yes")) {
			test.log(LogStatus.PASS, "Select an option under Member of a US AANA Group heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Select an option under Member of a US AANA Group heading", "Not verified");
		}
		sleep(2000);
		saveEntity();
		
		endSession();
	}
	
	public static void Case67(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		
		endSession();
	}
	
	public static void Case68(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		clickDetails();
		sleep(1000);
		clickAmendEntity();
		verifyRelevantRegulatoryJurisdiction(TestData);
		scrolldown();
		verifyUSAHeading(TestData);
		verifyUSAHeadingCollapsed(TestData);
		clickUSAHeading(TestData);
		String[] headings = {"US_CFTCEntityStatus","US_CFTC_General","US_CFTC_Branches","US_CFTC_Guarantees","US_PREntityStatus","US_PR_General","US_PR_Branches","US_PR_Guarentees","US_CFTC_Hedging_Exception_Status","US_CFTC_Hedging_Exception_Status2","US_Swaps_Elections","US_Swaps_Reporting","US_Financial_Obligations","US_SEC_IssuerHeading",	
		"US_SEC_centralIndexKeyHeading","US_BoardApproval","US_AANAGroup","US_AANAGroup2","US_AANAThreshold","US_AANAThresholdEstimate"};
		USAMegaFunction(TestData, headings);
		endSession();
	}
	
	
	
	
	
	
	/////////////////////FOR TEST MODULE//////////////////////////////////
	
	public static void TestFunction(String sUserId, String sPassword, String sOrganization, HashMap<String, String> TestData) {
		Login(sUserId, sPassword, sOrganization);
		
		getLegalEntityIdentifier();
		
		processDetails();
		
		// fill in the module information
		fillInInformation(TestData);
		
		// radio buttons functionality
		SelectRadioButtons(TestData);
		
		endSession();

	}
	
	//COMMON FUNCTIONS AVAILABLE FOR SELF DISCLOSURE
	
	public static void Login(String sUserId, String sPassword, String sOrganization) {
		if (sLogin == "YES") {
			Logout();
		} else {
			openBrowser();
			navigate("link");
		}
		writeInInput("Username_TEST", sUserId);
		writeInInput("Password_TEST", sPassword);
		writeInInput("Organization_TEST", sOrganization);
		clickButton("Submit");
		
		if (verifyTitle("Self Disclosure")) {
			test.log(LogStatus.PASS, "Login", "Self Disclosure Title Verified");
		} else {
			test.log(LogStatus.FAIL, "Login", "Self Disclosure Title Not Found");
		}
	}

	public static void processDetails(){
		
		clickButton("Details");
		clickButton("AmendEntities");
		sleep(3000);
		checkCheckBox("EntityIsActiveCheckBox");
	}
	
	public static void getLegalEntityIdentifier(){
		String identifier = GetText("LegalEntityIdentifier");
		if (identifier != null) {
			test.log(LogStatus.PASS, "LegalEntityIdentifer", "Self Disclosure Legal Entity Identifer Obtained");
			test.log(LogStatus.INFO, "Legal Entity Identifer is \""+ identifier+"\"");
		} else {
			test.log(LogStatus.FAIL, "LegalEntityIdentifer", "Self Disclosure Legal Entity Identifer Not Found");
		}
	}
	
	public static void fillInInformation(HashMap<String, String> TestData){
		if (exist("LegalEntityName")){
			test.log(LogStatus.PASS, "LegalEntityName", "Self Disclosure Has Legal Entity Name");
			clearInputText("LegalEntityName");
			writeInInput("LegalEntityName", "AcadiaSoft Inc.");
		} else {
			test.log(LogStatus.FAIL, "LegalEntityName", "Self Disclosure Does Not Have Legal Entity Name");
			writeInInput("LegalEntityName", "AcadiaSoft Inc.");
		}
		writeInInput("Address", GetConfig("Address"));
		writeInInput("City", GetConfig("City"));
		selectList("Country",GetConfig("Country"));
		selectList("State/Province",GetConfig("State/Province"));
		writeInInput("Zip/PostalCode", GetConfig("Zip/PostalCode"));
		
		writeInInput("BeneficialOwner",GetConfig("BeneficialOwner"));
		
		writeInInput("ContactName",GetConfig("ContactName"));
		writeInInput("PhoneNumber",GetConfig("PhoneNumber"));
		writeInInput("Email",GetConfig("Email"));
		
		// check multi-entity column
		if (TestData.get("MULTIENTITYCHECK").equals("YES")){
			click("EntityIsMultibranch");
		}
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
	
	public static void endSession(){
		// end test/
		
		//clickButton("Cancel");
		sleep(1000);
		quitBrowser();
	}
	
	
	//OTHER TEST FUNCTIONS
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
	
	public static void SaveEntity() {
		click("SaveEntities");
	}
	
	public static void Logout() {

		click("LogOut");
		if (exist("Username_SD") && exist("Password_SD")&& exist("Organization_SD")) {
			test.log(LogStatus.INFO, "Logout",
					"Application logged out successfully");
		} else {
			test.log(LogStatus.FAIL, "Logout", "Application log out failed");
		}

	}


	
}
