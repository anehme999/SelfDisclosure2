package WebDriver.function;

import static WebDriver.function.Keywords.*;
import static WebDriver.function.SD_Test_Function.*;
import static WebDriver.function.ReadProp.*;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.LogStatus;

/**
 * This is a collection of all Self Disclosure UI related functions. A majority of these
 * functions are representative of test steps in the Self Disclosure test cases.
 * @author Anthony Chan
 *     Created a majority of the functions, including the ones for these jurisdictions:
 *     BioInfo, Canada, Japan, USA
 * @author Swetha Ramakrishna
 *     Created functions for these jurisdictions: EU, Switzerland
 */
public class SD_Common_Functions {
	public static void setUp(){
		openBrowser();
		navigate("link");
	}
	
	//SCTM TEST CASE STEP FUNCTIONS (34)
	public static void Login(String sUserId, String sPassword, String sOrganization) {
		writeInInput("Username_SD", sUserId);
		writeInInput("Password_SD", sPassword);
		writeInInput("Organization_SD", sOrganization);
		clickButton("Submit");
		
		if (verifyTitle("Self Disclosure")) {
			test.log(LogStatus.PASS, "Login", "Self Disclosure Title Verified");
		} else {
			test.log(LogStatus.FAIL, "Login", "Self Disclosure Title Not Found");
		}
	}
	
	public static void clickDetails(){
		clickButton("Details");
		sleep(1000);
		if (verifyText("DetailsHeader", "Details")) {
			test.log(LogStatus.PASS, "Click Details", "Able to click");
		} else {
			test.log(LogStatus.FAIL, "Click Details", "Not able to click");
		}
	}
	
	public static void clickAmendEntity(){
		clickButton("AmendEntities");
		sleep(1000);
		if (verifyButtonText("SaveEntities","Save Entity")) {
			test.log(LogStatus.PASS, "Click Amend Entities", "Able to click");
		} else {
			test.log(LogStatus.FAIL, "Click Amend Entities", "Not able to click");
		}
	}
	
	public static void verifyLegalEntityName(HashMap<String, String> TestData){
		if (verifyText("LegalEntityNameHeading", TestData.get("LEGALENTITYNAMEHEADING"))) {
			test.log(LogStatus.PASS, "Legal Entity Name Heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Legal Entity Name Heading", "Not verified");
		}
	}
	
	public static void verifyGenBioInfo(HashMap<String, String> TestData){
		if (verifyText("GeneralBiographicalInformationHeading", TestData.get("GENERALBIOGRAPHICALINFORMATIONHEADING"))) {
			test.log(LogStatus.PASS, "General Biographical Information Heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "General Biographical Information Heading", "Not verified");
		}
	}
	
	public static void verifyLegalEntityNameHeading(HashMap<String, String> TestData){
		if (verifyText("LegalEntityNameHeading", TestData.get("LEGALENTITYNAMEHEADING"))) {
			test.log(LogStatus.PASS, "Legal Entity Name Heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Legal Entity Name Heading", "Not verified");
		}
	}
	public static void enterNumerical_LegalEntityName(){
		
	}
	public static void enterSpecialChars_LegalEntityName(){
		
	}
	public static void checkPrefilled_LegalEntityName(){
		if (GetText("LegalEntityName") != null){
			test.log(LogStatus.PASS, "Legal Entity Name is prefilled", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Legal Entity Name not prefilled", "Not verified");
		}
	}
	public static void amendLegalEntityName(){
		
	}
	public static void enterAlphaOrSpecialChars_ZipCode(){
		
	}
	public static void enterNumericals_ZipCode(){
		
	}
	public static void confirmDisplay_EntityIsMultibranchHeading(HashMap<String, String> TestData){
		if (verifyText("EntityIsMultibranchHeading", TestData.get("ENTITYISMULTIBRANCHHEADING"))) {
			test.log(LogStatus.PASS, "Entity Is Multibranch Heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Entity Is Multibranch Heading", "Not verified");
		}
	}
	public static void confirmDisplay_EntityIsMultibranchCheckbox(){
		
	}
	public static void checkAndUncheckEntityIsMultibranchCheckbox(){
		checkCheckBox("EntityIsMultibranch");
		if (verifyCheckBoxSelected("EntityIsMultibranch") == true) {
			test.log(LogStatus.PASS, "EntityIsMultibranch", "Checked");
		} else {
			test.log(LogStatus.FAIL, "EntityIsMultibranch", "Not Checked");
		}
		unCheckCheckBox("EntityIsMultibranch");
		if (verifyCheckBoxSelected("EntityIsMultibranch") == false) {
			test.log(LogStatus.PASS, "EntityIsMultibranch", "UnChecked");
		} else {
			test.log(LogStatus.FAIL, "EntityIsMultibranch", "Not UnChecked");
		}
		
	}
	public static void confirmDisplay_BeneficialOwnerHeading(HashMap<String, String> TestData){
		if (verifyText("BeneficialOwnerHeading", TestData.get("BENEFICIALOWNERHEADING"))) {
			test.log(LogStatus.PASS, "Beneficial Owner Heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Beneficial Owner Heading", "Not verified");
		}
	}
	public static void enterNumericalOrSpecialChars_BeneficialOwner(){
		
	}
	public static void enterAlpha_BeneficialOwner(){
		
	}
	public static void verifyNotificationsHeading(HashMap<String, String> TestData){
		if (verifyText("NotificationsHeading", TestData.get("NOTIFICATIONSHEADING"))) {
			test.log(LogStatus.PASS, "Notifications Heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Notifications Heading", "Not verified");
		}
	}
	public static void checkAndUncheckNotificationsCheckbox(){
		checkCheckBox("NotificationsCheckbox");
		if (verifyCheckBoxSelected("NotificationsCheckbox") == true) {
			test.log(LogStatus.PASS, "NotificationsCheckbox", "Checked");
		} else {
			test.log(LogStatus.FAIL, "NotificationsCheckbox", "Not Checked");
		}
		unCheckCheckBox("NotificationsCheckbox");
		if (verifyCheckBoxSelected("NotificationsCheckbox") == false) {
			test.log(LogStatus.PASS, "NotificationsCheckbox", "UnChecked");
		} else {
			test.log(LogStatus.FAIL, "NotificationsCheckbox", "Not UnChecked");
		}
		
	}
	public static void verifyEmailListHeading(HashMap<String, String> TestData){
		if (verifyText("EmailListHeading", TestData.get("EMAILLISTHEADING"))) {
			test.log(LogStatus.PASS, "Email List Heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Email List Heading", "Not verified");
		}
	}
	public static void verifyServiceProviderHeading(HashMap<String, String> TestData){
		if (verifyText("ServiceProviderEmailListHeading", TestData.get("SERVICEPROVIDEREMAILLISTHEADING"))) {
			test.log(LogStatus.PASS, "Service Provider Email List Heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Service Provider Email List Heading", "Not verified");
		}
	}
	public static void verifyAstrikDisplayConfirmation(HashMap<String, String> TestData){
		if (((GetText("EmailListHeading")).indexOf('*') > -1) && ((GetText("ServiceProviderEmailListHeading")).indexOf('*') > -1)) {
			test.log(LogStatus.PASS, "AstrikDisplayConfirmation", "Verified");
		} else {
			test.log(LogStatus.FAIL, "AstrikDisplayConfirmation", "Not verified");
		}
	}
	public static void verifyListOfEmails(HashMap<String, String> TestData){
		
	}
	public static void verifyAliasesHeading(HashMap<String, String> TestData){
		if (verifyText("AliasesHeading", TestData.get("ALIASESHEADING"))) {
			test.log(LogStatus.PASS, "Aliases Heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Aliases Provider Email List Heading", "Not verified");
		}
	}
	public static void verifyLegalEntityIdentifierHeading(HashMap<String, String> TestData){
		if (verifyText("LegalEntityIdentifierHeading", TestData.get("LEGALENTITYIDENTIFIERHEADING"))) {
			test.log(LogStatus.PASS, "LegalEntityIdentifierHeading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "LegalEntityIdentifierHeading", "Not verified");
		}
	}
	public static void checkPrefilled_LegalEntityIdentifier(){
		if (GetText("LegalEntityIdentifier_Value") != null) {
			test.log(LogStatus.PASS, "LegalEntityIdentifier Prefilled", "Verified");
		} else {
			test.log(LogStatus.FAIL, "LegalEntityIdentifier Prefilled", "Not verified");
		}
	}
	public static void verifyShortNameHeading(HashMap<String, String> TestData){
		if (verifyText("ShortNameHeading", TestData.get("SHORTNAMEHEADING"))) {
			test.log(LogStatus.PASS, "ShortNameHeading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "ShortNameHeading", "Not verified");
		}
	}
	public static void checkPrefilled_ShortNameHeading(){
		if (GetText("ShortName_Value") != null) {
			test.log(LogStatus.PASS, "ShortNameHeading Prefilled", "Verified");
		} else {
			test.log(LogStatus.FAIL, "ShortNameHeading Prefilled", "Not verified");
		}
	}
	public static void verifyReferenceIdentifierHeading(HashMap<String, String> TestData){
		if (verifyText("ReferenceIdentifier", TestData.get("REFERENCEIDENTIFIER"))) {
			test.log(LogStatus.PASS, "ReferenceIdentifierHeading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "ReferenceIdentifierHeading", "Not verified");
		}
	}
	public static void checkPrefilled_ReferenceIdentifierHeading(){
		if (GetText("ReferenceIdentifier_Value") != null) {
			test.log(LogStatus.PASS, "ReferenceIdentifierHeading Prefilled", "Verified");
		} else {
			test.log(LogStatus.FAIL, "ReferenceIdentifierHeading Prefilled", "Not verified");
		}
	}
	public static void verifyTriOptPartyCode(HashMap<String, String> TestData){
		if (verifyText("TriOptPartyCode", TestData.get("TRIOPTPARTYCODE"))) {
			test.log(LogStatus.PASS, "TriOptPartyCode", "Verified");
		} else {
			test.log(LogStatus.FAIL, "TriOptPartyCode", "Not verified");
		}
	}
	public static void checkPrefilled_TriOptPartyCode(){
		if (GetText("TriOptPartyCode_Value") != null) {
			test.log(LogStatus.PASS, "TriOptPartyCode Prefilled", "Verified");
		} else {
			test.log(LogStatus.FAIL, "TriOptPartyCode Prefilled", "Not verified");
		}
	}
	public static void verifyFundNumber(HashMap<String, String> TestData){
		if (verifyText("FundNumber", TestData.get("FUNDNUMBER"))) {
			test.log(LogStatus.PASS, "FundNumber", "Verified");
		} else {
			test.log(LogStatus.FAIL, "FundNumber", "Not verified");
		}
	}
	public static void checkPrefilled_FundNumber(){
		if (GetText("FundNumber_Value") != null) {
			test.log(LogStatus.PASS, "FundNumber Prefilled", "Verified");
		} else {
			test.log(LogStatus.FAIL, "FundNumber Prefilled", "Not verified");
		}
	}
	
	//2----
	public static void verifyAddressHeading(HashMap<String, String> TestData){
		if (verifyText("AddressHeading", TestData.get("ADDRESSHEADING"))) {
			test.log(LogStatus.PASS, "AddressHeading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "AddressHeading", "Not verified");
		}
	}
	
	public static void verifyAddress2Heading(HashMap<String, String> TestData){
		if (verifyText("Address2Heading", TestData.get("LEGALADDRESS2HEADING"))) {
			test.log(LogStatus.PASS, "Address2Heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Address2Heading", "Not verified");
		}
	}
	public static void verifyAddress3Heading(HashMap<String, String> TestData){
		if (verifyText("Address3Heading", TestData.get("LEGALADDRESS3HEADING"))) {
			test.log(LogStatus.PASS, "Address3Heading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Address3Heading", "Not verified");
		}
	}
	public static void verifyCityHeading(HashMap<String, String> TestData){
		if (verifyText("CityHeading", TestData.get("CITYHEADING"))) {
			test.log(LogStatus.PASS, "CityHeading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "CityHeading", "Not verified");
		}
	}
	public static void verifyCountryHeading(HashMap<String, String> TestData){
		if (verifyText("CountryHeading", TestData.get("COUNTRYHEADING"))) {
			test.log(LogStatus.PASS, "CountryHeading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "CountryHeading", "Not verified");
		}
	}
	public static void verifyStateProvinceHeading(HashMap<String, String> TestData){
		if (verifyText("State/ProvinceHeading", TestData.get("STATE/PROVINCEHEADING"))) {
			test.log(LogStatus.PASS, "State/ProvinceHeading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "State/ProvinceHeading", "Not verified");
		}
	}
	public static void verifyZipPostalCodeHeading(HashMap<String, String> TestData){
		if (verifyText("Zip/PostalCodeHeading", TestData.get("ZIP/POSTALCODEHEADING"))) {
			test.log(LogStatus.PASS, "Zip/PostalCodeHeading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "Zip/PostalCodeHeading", "Not verified");
		}
	}
	
	//3 --
	public static void verifySD_ContactInformationHeading(HashMap<String, String> TestData){
		if (verifyText("SD_ContactInformationHeading", TestData.get("SD_CONTACTINFORMATIONHEADING"))) {
			test.log(LogStatus.PASS, "SD_ContactInformationHeading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "SD_ContactInformationHeading", "Not verified");
		}
	}
	public static void verifyContactInformationHeading(HashMap<String, String> TestData){
		if (verifyText("ContactInformationHeading", TestData.get("CONTACTNAMEHEADING"))) {
			test.log(LogStatus.PASS, "ContactInformationHeading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "ContactInformationHeading", "Not verified");
		}
	}
	public static void verifyPhoneNumberHeading(HashMap<String, String> TestData){
		if (verifyText("PhoneNumberHeading", TestData.get("PHONENUMBERHEADING"))) {
			test.log(LogStatus.PASS, "PhoneNumberHeading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "PhoneNumberHeading", "Not verified");
		}
	}
	public static void verifyEmailHeading(HashMap<String, String> TestData){
		if (verifyText("EmailHeading", TestData.get("EMAILHEADING"))) {
			test.log(LogStatus.PASS, "EmailHeading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "EmailHeading", "Not verified");
		}
	}
	
	//7--
	public static void verifyRelevantRegulatoryJurisdiction(HashMap<String, String> TestData){
		if (verifyText("RelevantRegulatoryJurisdiction", TestData.get("RELEVANTREGULATORYJURISDICTIONHEADING"))) {
			test.log(LogStatus.PASS, "RelevantRegulatoryJurisdiction", "Verified");
		} else {
			test.log(LogStatus.FAIL, "RelevantRegulatoryJurisdiction", "Not verified");
		}
	}
	public static void verifyCountriesHeadings(HashMap<String, String> TestData){
		if (GetText("CanadaHeading").toLowerCase().contains(TestData.get("COUNTRYNAME1").toLowerCase())) {
			test.log(LogStatus.PASS, "CanadaHeading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "CanadaHeading", "Not verified");

		}
		if (GetText("EUHeading").toLowerCase().contains(TestData.get("COUNTRYNAME2").toLowerCase())) {
			test.log(LogStatus.PASS, "EUHeading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "EUHeading", "Not verified");
		}
		if (GetText("JapanHeading").toLowerCase().contains(TestData.get("COUNTRYNAME3").toLowerCase())) {
			test.log(LogStatus.PASS, "JapanHeading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "JapanHeading", "Not verified");
		}
		if (GetText("SwitzerlandHeading").toLowerCase().contains(TestData.get("COUNTRYNAME4").toLowerCase())) {
			test.log(LogStatus.PASS, "SwitzerlandHeading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "SwitzerlandHeading", "Not verified");
		}
		if (GetText("USAHeading").toLowerCase().contains(TestData.get("COUNTRYNAME5").toLowerCase())) {
			test.log(LogStatus.PASS, "USAHeading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "USAHeading", "Not verified");
		}
	}
	
	public static void verifyCountriesCollapsed(HashMap<String, String> TestData){
		if (getwebLocator(GetLocator("CA_not_collapsed")).getAttribute("open") == null) {
			test.log(LogStatus.PASS, "CanadaHeading Collapsed", "Verified");
		} else {
			test.log(LogStatus.FAIL, "CanadaHeading Collapsed", "Not verified");
		}
		if (getwebLocator(GetLocator("EU_not_collapsed")).getAttribute("open") == null) {
			test.log(LogStatus.PASS, "EUHeading Collapsed", "Verified");
		} else {
			test.log(LogStatus.FAIL, "EUHeading Collapsed", "Not verified");
		}
		if (getwebLocator(GetLocator("JP_not_collapsed")).getAttribute("open") == null) {
			test.log(LogStatus.PASS, "JapanHeading Collapsed", "Verified");
		} else {
			test.log(LogStatus.FAIL, "JapanHeading Collapsed", "Not verified");
		}
		if (getwebLocator(GetLocator("CH_not_collapsed")).getAttribute("open") == null) {
			test.log(LogStatus.PASS, "SwitzerlandHeading Collapsed", "Verified");
		} else {
			test.log(LogStatus.FAIL, "SwitzerlandHeading Collapsed", "Not verified");
		}
		if (getwebLocator(GetLocator("US_not_collapsed")).getAttribute("open") == null) {
			test.log(LogStatus.PASS, "USAHeading Collapsed", "Verified");
		} else {
			test.log(LogStatus.FAIL, "USAHeading Collapsed", "Not verified");
		}
	}
	public static void verifyCountriesOpen(HashMap<String, String> TestData){
		click("CanadaHeading");
		if (getwebLocator(GetLocator("CA_not_collapsed")).getAttribute("open") != null) {
			test.log(LogStatus.PASS, "CanadaHeading Open", "Verified");
			click("CanadaHeading");
		} else {
			test.log(LogStatus.FAIL, "CanadaHeading Open", "Not verified");
		}
		
		click("EUHeading");
		if (getwebLocator(GetLocator("EU_not_collapsed")).getAttribute("open") != null) {
			test.log(LogStatus.PASS, "EUHeading Open", "Verified");
			click("EUHeading");
		} else {
			test.log(LogStatus.FAIL, "EUHeading Open", "Not verified");
		}
		
		click("JapanHeading");
		if (getwebLocator(GetLocator("JP_not_collapsed")).getAttribute("open") != null) {
			test.log(LogStatus.PASS, "JapanHeading Open", "Verified");
			click("JapanHeading");
		} else {
			test.log(LogStatus.FAIL, "JapanHeading Open", "Not verified");
		}
		
		click("SwitzerlandHeading");
		if (getwebLocator(GetLocator("CH_not_collapsed")).getAttribute("open") != null) {
			test.log(LogStatus.PASS, "SwitzerlandHeading Open", "Verified");
			click("SwitzerlandHeading");
		} else {
			test.log(LogStatus.FAIL, "SwitzerlandHeading Open", "Not verified");
		}
		
		click("USAHeading");
		if (getwebLocator(GetLocator("US_not_collapsed")).getAttribute("open") != null) {
			test.log(LogStatus.PASS, "USAHeading Open", "Verified");
			click("USAHeading");
		} else {
			test.log(LogStatus.FAIL, "USAHeading Open", "Not verified");
		}
	}
	
	//8--
	// Verify the astrik at the right side of these headings:
	// legal entity name, country, zip/postal code
	public static void verifyAstrikDisplayConfirmation2(HashMap<String, String> TestData){
		if (((GetText("LegalEntityNameHeading")).indexOf('*') > -1) && ((GetText("CountryHeading")).indexOf('*') > -1)&& ((GetText("Zip/PostalCodeHeading")).indexOf('*') > -1)) {
			test.log(LogStatus.PASS, "AstrikDisplayConfirmation: Legal Entity Name, Country, Zip/PostalCode", "Verified");
		} else {
			test.log(LogStatus.FAIL, "AstrikDisplayConfirmation: Legal Entity Name, Country, Zip/PostalCode", "Not verified");
		}
	}
	
	//9--
	
	
	
	// CANADA FUNCTIONS
	public static void verifyCanadaHeading(HashMap<String, String> TestData){
		if (GetText("CanadaHeading").toLowerCase().contains(TestData.get("COUNTRYNAME1").toLowerCase())) {
			test.log(LogStatus.PASS, "CanadaHeading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "CanadaHeading", "Not verified");
		}
	}
	
	public static void verifyCanadaHeadingCollapsed(HashMap<String, String> TestData){
		if (getwebLocator(GetLocator("CA_not_collapsed")).getAttribute("open") == null) {
			test.log(LogStatus.PASS, "CanadaHeading Collapsed", "Verified");
		} else {
			test.log(LogStatus.FAIL, "CanadaHeading Collapsed", "Not verified");
		}
	}
	
	public static void clickCanadaHeading(HashMap<String, String> TestData){
		click("CanadaHeading");
		if (getwebLocator(GetLocator("CA_not_collapsed")).getAttribute("open") != null) {
			test.log(LogStatus.PASS, "CanadaHeading Open", "Verified");
		} else {
			test.log(LogStatus.FAIL, "CanadaHeading Open", "Not verified");
		}
	}
	
	public static void verifyCanadaOSFIHeading(HashMap<String, String> TestData){
		if (verifyText("CA_OSFI", TestData.get("CANADAOSFIENTITY"))) {
			test.log(LogStatus.PASS, "CA_OSFI", "Verified");
		} else {
			test.log(LogStatus.FAIL, "CA_OSFI", "Not verified");
		}
	}
	
	public static void verifyCanadaOSFIHeading2(HashMap<String, String> TestData){
		if (verifyText("CA_OSFI2", TestData.get("CANADAOSFIENTITY2"))) {
			test.log(LogStatus.PASS, "CA_OSFI2", "Verified");
		} else {
			test.log(LogStatus.FAIL, "CA_OSFI2", "Not verified");
		}
	}
	
	public static void verifyCanadaDomesticFRFI(HashMap<String, String> TestData){
		if (verifyText("CA_FRFI", TestData.get("CANADABRANCHFRFI"))) {
			test.log(LogStatus.PASS, "CA_FRFI", "Verified");
		} else {
			test.log(LogStatus.FAIL, "CA_FRFI", "Not verified");
		}
	}
	
	public static void verifyCanadaCoveredEntity(HashMap<String, String> TestData){
		if (verifyText("CA_CoveredEntity", TestData.get("CANADACOVEREDENTITY"))) {
			test.log(LogStatus.PASS, "CA_CoveredEntity", "Verified");
		} else {
			test.log(LogStatus.FAIL, "CA_CoveredEntity", "Not verified");
		}
	}
	
	public static void verifyCanadaCrossBorder(HashMap<String, String> TestData){
		if (verifyText("CA_CrossBorderStatus", TestData.get("CANADIANBRANCH"))) {
			test.log(LogStatus.PASS, "CA_CrossBorderStatus", "Verified");
		} else
		{
			test.log(LogStatus.FAIL, "CA_CrossBorderStatus", "Not verified");
		}
	}
	
	
	public static void verifyCanadaCrossBorder2(HashMap<String, String> TestData){
		if (verifyText("CA_CrossBorderStatus2", TestData.get("CANADIANBRANCH2"))) {
			test.log(LogStatus.PASS, "CA_CrossBorderStatus2", "Verified");
		} else {
			test.log(LogStatus.FAIL, "CA_CrossBorderStatus2", "Not verified");
		}
	}
	
	public static void verifyCanadaAANAInformation(HashMap<String, String> TestData){
		if (verifyText("CA_AANAGroupInfo", TestData.get("CANADAAANAINFORMATION"))) {
			test.log(LogStatus.PASS, "CA_AANAGroupInfo", "Verified");
		} else {
			test.log(LogStatus.FAIL, "CA_AANAGroupInfo", "Not verified");
		}
	}
	
	public static void verifyCanadaAANAInformation2(HashMap<String, String> TestData){
		if (verifyText("CA_AANAGroupInfo2", TestData.get("CANADAAANAINFORMATION2"))) {
			test.log(LogStatus.PASS, "CA_AANAGroupInfo2", "Verified");
		} else {
			test.log(LogStatus.FAIL, "CA_AANAGroupInfo2", "Not verified");
		}
	}
	
	public static void verifyCanadaAANAThreshold(HashMap<String, String> TestData){
		if (verifyText("CA_AANAThreshold", TestData.get("CANADAAANATHRESHOLD"))) {
			test.log(LogStatus.PASS, "CA_AANAThreshold", "Verified");
		} else {
			test.log(LogStatus.FAIL, "CA_AANAThreshold", "Not verified");
		}
	}
	
	public static void verifyCanadaAANAThresholdEstimate(HashMap<String, String> TestData){
		if (verifyText("CA_AANAThresholdEstimate", TestData.get("CANADAAANATHRESHOLDESTIMATE"))) {
			test.log(LogStatus.PASS, "CA_AANAThresholdEstimate", "Verified");
		} else {
			test.log(LogStatus.FAIL, "CA_AANAThresholdEstimate", "Not verified");
		}
	}
	
	
	public static void clickJapanHeading(HashMap<String, String> TestData){
		click("JapanHeading");
		if (getwebLocator(GetLocator("JP_not_collapsed")).getAttribute("open") != null) {
			test.log(LogStatus.PASS, "JapanHeading Open", "Verified");
		} else {
			test.log(LogStatus.FAIL, "JapanHeading Open", "Not verified");
		}
	}
	public static void verifyJapanHeading(HashMap<String, String> TestData){
		if (GetText("JapanHeading").toLowerCase().contains(TestData.get("COUNTRYNAME3").toLowerCase())) {
			test.log(LogStatus.PASS, "JapanHeading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "JapanHeading", "Not verified");
		}
	}
	
	public static void verifyJapanHeadingCollapsed(HashMap<String, String> TestData){
		if (getwebLocator(GetLocator("JP_not_collapsed")).getAttribute("open") == null) {
			test.log(LogStatus.PASS, "JapanHeading Collapsed", "Verified");
		} else {
			test.log(LogStatus.FAIL, "JapanHeading Collapsed", "Not verified");
		}
	}
	
	//USA
	
	public static void clickUSAHeading(HashMap<String, String> TestData){
		click("USAHeading");
		if (getwebLocator(GetLocator("US_not_collapsed")).getAttribute("open") != null) {
			test.log(LogStatus.PASS, "USAHeading Open", "Verified");
		} else {
			test.log(LogStatus.FAIL, "USAHeading Open", "Not verified");
		}
	}
	public static void verifyUSAHeading(HashMap<String, String> TestData){
		if (GetText("USAHeading").toLowerCase().contains(TestData.get("COUNTRYNAME5").toLowerCase())) {
			test.log(LogStatus.PASS, "USAHeading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "USAHeading", "Not verified");
		}
	}
	
	public static void verifyUSAHeadingCollapsed(HashMap<String, String> TestData){
		if (getwebLocator(GetLocator("US_not_collapsed")).getAttribute("open") == null) {
			test.log(LogStatus.PASS, "USAHeading Collapsed", "Verified");
		} else {
			test.log(LogStatus.FAIL, "USAHeading Collapsed", "Not verified");
		}
	}
	
	public static void selectYes(HashMap<String, String> TestData, String data){
		String radioButtonLocator = null;
		switch (data){
		//
			case "CanadaOSFIEntity": radioButtonLocator = "CA_OSFI_yes";
			break;
			case "CanadaBranchFRFI": radioButtonLocator = "CA_FRFI_yes";
			break;
			case "CanadaCoveredEntity": radioButtonLocator = "CA_CoveredEntity_yes";
			break;
			case "CanadaCrossBorderStatus": radioButtonLocator = "CA_CrossBorderStatus_yes";
			break;
			case "CanadaAANAInformation": radioButtonLocator = "CA_AANAGroupInfo_yes";
			break;
			//
			case "JP_HeadOffice": radioButtonLocator = "JP_HeadOffice_regulated";
			break;
			case "JP_EntitiesNotAMultiBranch": radioButtonLocator = "JP_NotMultiBranch_regulated";
			break;
			case "JP_AANAGroup": radioButtonLocator = "JP_AANAGroup_yes";
			break;
		}
		click(radioButtonLocator);	
		if (radioButtonLocator != null)
			test.log(LogStatus.PASS, "Select yes radio button", "Verified");
		else
			test.log(LogStatus.FAIL, "Select yes radio button", "Not verified");
	}
	
	public static void selectNo(HashMap<String, String> TestData, String data){
		String radioButtonLocator = null;
		switch (data){
			case "CanadaOSFIEntity": radioButtonLocator = "CA_OSFI_no";
			break;
			case "CanadaBranchFRFI": radioButtonLocator = "CA_FRFI_no";
			break;
			case "CanadaCoveredEntity": radioButtonLocator = "CA_CoveredEntity_no";
			break;
			case "CanadaCrossBorderStatus": radioButtonLocator = "CA_CrossBorderStatus_no";
			break;
			case "CanadaAANAInformation": radioButtonLocator = "CA_AANAGroupInfo_no";
			break;
			//
			case "JP_HeadOffice": radioButtonLocator = "JP_HeadOffice_notRegulated";
			break;
			case "JP_EntitiesNotAMultiBranch": radioButtonLocator = "JP_NotMultiBranch_notRegulated";
			break;
			case "JP_AANAGroup": radioButtonLocator = "JP_AANAGroup_no";
			break;
		}
		click(radioButtonLocator);	
		if (radioButtonLocator != null)
			test.log(LogStatus.PASS, "Select no radio button", "Verified");
		else
			test.log(LogStatus.FAIL, "Select no radio button", "Not verified");
	}
	
	public static void selectCanadianBranch(HashMap<String, String> TestData, int choice){
		String radioButtonLocator;
		if (choice < 1 || choice > 2){
			test.log(LogStatus.FAIL, "Select radio button", "Please enter valid choice (1-2)");
		}
		switch (choice){
			case 1: radioButtonLocator = "CA_CrossBorderStatus_yes";
			break;
			case 2: radioButtonLocator = "CA_CrossBorderStatus_no";
			break;
			default: radioButtonLocator = null;
			test.log(LogStatus.FAIL, "Select radio button", "Not verified");
			return;
		}
		click(radioButtonLocator);	
		test.log(LogStatus.PASS, "Select radio button", "Verified");
	}
	
	public static void selectCanadaAANAThreshold(HashMap<String, String> TestData, int choice){
		String radioButtonLocator;
		if (choice < 1 || choice > 4){
			test.log(LogStatus.FAIL, "Select radio button", "Please enter valid choice (1-4)");
		}
		switch (choice){
			case 1: radioButtonLocator = "CA_AANAThreshold_above";
			break;
			case 2: radioButtonLocator = "CA_AANAThreshold_notAbove";
			break;
			case 3: radioButtonLocator = "CA_AANAThreshold_ultimate";
			break;
			case 4: radioButtonLocator = "CA_AANAThreshold_person";
			break;
			default: radioButtonLocator = null;
			test.log(LogStatus.FAIL, "Select radio button", "Not verified");
			return;
		}
		click(radioButtonLocator);	
		test.log(LogStatus.PASS, "Select radio button", "Verified");
	}
	
	public static void selectCanadaAANAThresholdEstimate(HashMap<String, String> TestData,int choice){
		String radioButtonLocator;
		if (choice < 1 || choice > 6){
			test.log(LogStatus.FAIL, "Select radio button", "Please enter valid choice (1-4)");
		}
		switch (choice){
			case 1: radioButtonLocator = "CA_AANAThresholdEstimate_2017";
			break;
			case 2: radioButtonLocator = "CA_AANAThresholdEstimate_2018";
			break;
			case 3: radioButtonLocator = "CA_AANAThresholdEstimate_2019";
			break;
			case 4: radioButtonLocator = "CA_AANAThresholdEstimate_2020";
			break;
			case 5: radioButtonLocator = "CA_AANAThresholdEstimate_none";
			break;
			case 6: radioButtonLocator = "CA_AANAThresholdEstimate_decline";
			break;
			default: radioButtonLocator = null;
			test.log(LogStatus.FAIL, "Select radio button", "Not verified");
			return;
		}
		click(radioButtonLocator);	
		test.log(LogStatus.PASS, "Select radio button", "Verified");
	}
	
	public static void checkTextCanadaAANAThreshold(HashMap<String, String> TestData, int choice){
		String radioButtonLocator = null;
		if (choice < 1 || choice > 4){
			test.log(LogStatus.FAIL, "Check radio button text", "Please enter valid choice (1-4)");
		}
		switch (choice){
			case 1: radioButtonLocator = "CA_AANAThreshold_above_text";
			break;
			case 2: radioButtonLocator = "CA_AANAThreshold_notAbove_text";
			break;
			case 3: radioButtonLocator = "CA_AANAThreshold_ultimate_text";
			break;
			case 4: radioButtonLocator = "CA_AANAThreshold_person_text";
			break;
		}
		//GetText(radioButtonLocator) == TestData.get(radioButtonLocator)
		if (radioButtonLocator != null) {
			test.log(LogStatus.PASS, "Check radio button text", "Verified");
		}else {
			test.log(LogStatus.FAIL, "Check radio button text", "Not verified");
		}
	}
	
	// Japan
	public static void selectJapanAANAThreshold(HashMap<String, String> TestData, int choice){
		String radioButtonLocator;
		if (choice < 1 || choice > 4){
			test.log(LogStatus.FAIL, "Select radio button", "Please enter valid choice (1-4)");
		}
		switch (choice){
			case 1: radioButtonLocator = "JP_AANAThreshold_above";
			break;
			case 2: radioButtonLocator = "JP_AANAThreshold_notabove";
			break;
			case 3: radioButtonLocator = "JP_AANAThreshold_ultimate";
			break;
			case 4: radioButtonLocator = "JP_AANAThreshold_person";
			break;
			default: radioButtonLocator = null;
			test.log(LogStatus.FAIL, "Select radio button", "Not verified");
			return;
		}
		click(radioButtonLocator);	
		test.log(LogStatus.PASS, "Select radio button", "Verified");
	}
	
	public static void selectJapanAANAThresholdEstimate(HashMap<String, String> TestData,int choice){
		String radioButtonLocator;
		if (choice < 1 || choice > 6){
			test.log(LogStatus.FAIL, "Select radio button", "Please enter valid choice (1-4)");
		}
		switch (choice){
			case 1: radioButtonLocator = "JP_AANAThresholdEstimate_2017";
			break;
			case 2: radioButtonLocator = "JP_AANAThresholdEstimate_2018";
			break;
			case 3: radioButtonLocator = "JP_AANAThresholdEstimate_2019";
			break;
			case 4: radioButtonLocator = "JP_AANAThresholdEstimate_2020";
			break;
			case 5: radioButtonLocator = "JP_AANAThresholdEstimate_none";
			break;
			case 6: radioButtonLocator = "JP_AANAThresholdEstimate_decline";
			break;
			default: radioButtonLocator = null;
			test.log(LogStatus.FAIL, "Select radio button", "Not verified");
			return;
		}
		click(radioButtonLocator);	
		test.log(LogStatus.PASS, "Select radio button", "Verified");
	}
	
	// USA
	public static void selectUnitedStatesAANAThreshold(HashMap<String, String> TestData, int choice){
		String radioButtonLocator;
		if (choice < 1 || choice > 4){
			test.log(LogStatus.FAIL, "Select radio button", "Please enter valid choice (1-4)");
		}
		switch (choice){
			case 1: radioButtonLocator = "US_AANAThreshold_above";
			break;
			case 2: radioButtonLocator = "US_AANAThreshold_notabove";
			break;
			case 3: radioButtonLocator = "US_AANAThreshold_ultimate";
			break;
			case 4: radioButtonLocator = "US_AANAThreshold_person";
			break;
			default: radioButtonLocator = null;
			test.log(LogStatus.FAIL, "Select radio button", "Not verified");
			return;
		}
		click(radioButtonLocator);	
		test.log(LogStatus.PASS, "Select radio button", "Verified");
	}
	
	public static void selectUnitedStatesAANAThresholdEstimate(HashMap<String, String> TestData,int choice){
		String radioButtonLocator;
		if (choice < 1 || choice > 6){
			test.log(LogStatus.FAIL, "Select radio button", "Please enter valid choice (1-4)");
		}
		switch (choice){
			case 1: radioButtonLocator = "US_AANAThresholdEstimate_2017";
			break;
			case 2: radioButtonLocator = "US_AANAThresholdEstimate_2018";
			break;
			case 3: radioButtonLocator = "US_AANAThresholdEstimate_2019";
			break;
			case 4: radioButtonLocator = "US_AANAThresholdEstimate_2020";
			break;
			case 5: radioButtonLocator = "US_AANAThresholdEstimate_none";
			break;
			case 6: radioButtonLocator = "US_AANAThresholdEstimate_decline";
			break;
			default: radioButtonLocator = null;
			test.log(LogStatus.FAIL, "Select radio button", "Not verified");
			return;
		}
		click(radioButtonLocator);	
		test.log(LogStatus.PASS, "Select radio button", "Verified");
	}
	
	// FUNCTIONS FOR JAPAN MODAL
	public static void verifyModalHeading(HashMap<String, String> TestData, String data, String object){
		String expected = TestData.get(data.toUpperCase());
		String actual = getwebLocator(GetLocator(object)).getText();
		if (actual.equals(expected)) {
			test.log(LogStatus.PASS, "verifyHeading", "Verified");
		} else {
			test.log(LogStatus.FAIL, "verifyHeading", "Not verified: " + expected + " -- " + actual);
		}
	}
	
	// handle inputting alphanumeric, special chars, etc
	public static void inputModalText(HashMap<String, String> TestData, String data, String object) {
		
	}
	
	
	public static void clickEntityIsMultibranch(){
		if (click("EntityIsMultibranch")==true) {
		//if (verifyCheckBoxSelected("EntityIsMultibranch") == true) {
			test.log(LogStatus.PASS, "EntityIsMultibranch", "Checked");
		} else {
			test.log(LogStatus.FAIL, "EntityIsMultibranch", "Not Checked");
		}
	}
	
	public static void saveEntity(){
		if (click("SaveEntities")==true) {
		test.log(LogStatus.PASS, "Save Entity", "Able to click");
		} else {
		test.log(LogStatus.FAIL, "Save Entity", "Not able to click");
		}
	}
	
	//EU JURISDICTION

	public static void scrolldown() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		
}
	public static void scrollup() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-500)", "");
		
	}
	public static void verifyEUheading(HashMap<String, String> TestData) {
		if (GetText("EU").toLowerCase().contains(TestData.get("COUNTRYNAME2").toLowerCase())) {
			test.log(LogStatus.PASS, "EU", "EU Heading Verified");
		} else {
			test.log(LogStatus.FAIL, "EU", "EU Heading Not Found");
	}
		  click("EU");
		
	}
	
	public static void verifyEUCollapsed(HashMap<String, String> TestData) {
	click("EU");
	if (getwebLocator(GetLocator("EU_not_collapsed")) != null) {
		test.log(LogStatus.PASS, "EUHeading Collapse", "Verified");
		click("EU");
	} else {
		test.log(LogStatus.FAIL, "EUHeading Collapse", "Not verified");
	}
	}


	public static void EUValidationmessage1() {
		if (verifyText("EUValidationmessage1", "Non-Exempt options must be one of [FC, NFC_POS, NFC_NEG]., Is Principal a Third Country Entity must be set yes or no., AANA Group member must be set as \"Yes\" or \"No\".")){
			test.log(LogStatus.PASS, "EUValidationmessage1", "Validation passed");
		} else {
		test.log(LogStatus.FAIL, "EUValidationmessage1", "Validation failed");
		       
			}
}
	
	public static void EUValidationmessage2() {
		if  (verifyText("NonExemptErrorMessage", "Non-Exempt options must be one of [FC, NFC_POS, NFC_NEG].")) {
			test.log(LogStatus.PASS, "NonExemptErrorMessage", "Error Message Verified");
		} else {
			test.log(LogStatus.FAIL, "NonExemptErrorMessage", "Error Message Not Found");
	}
		  
		}
	
	public static void EUValidationmessage3() {
		if (verifyText("EUThirdCountryErrorMsg", "Third Country Entity mandates that DSF Guarantees must be set to \"Yes\" or \"No\"., AANA Group member must be set as \"Yes\" or \"No\".")){
		test.log(LogStatus.PASS, "EUValidationmessage3", "Validation Message Verified");
		} else {
			test.log(LogStatus.FAIL, "EUValidationmessage3", "Validation Message Not Found");
	}
		  
		}

	public static void VerifyAANAThresholdHeading(HashMap<String, String> TestData) {
	 if (verifyText("EU_AANAThreshold", TestData.get("EU_AANATHRESHOLD"))) {
		 test.log(LogStatus.PASS, "EU_AANAThreshold", "Heading Verified");
		} else {
			test.log(LogStatus.FAIL, "EU_AANAThreshold", "Heading Not Verified");
		}
	}		 
	
	public static void VerifyEUEntityStatusHeading(HashMap<String, String> TestData) {
		if (verifyText("EU_AANAThreshold", TestData.get("EUAANAThreshold"))) {
			 test.log(LogStatus.PASS, "EU_AANAThreshold", "Heading Verified");
			} else {
				test.log(LogStatus.FAIL, "EU_AANAThreshold", "Heading Not Verified");
			}
	}
	//SWETHA
		public static void nonexemptEU() {
			click("EU_NonExempt");
			
			}
		
		public static void EUBranchyes() {
	     click("EU_Branch_yes");
		}
		
		public static void EUExempt(HashMap<String, String> TestData) {
			click("EU_Exempt");
			click("SaveEntities");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			checkCheckBox("EU_Exempt4a");
			checkCheckBox("EU_Exempt4b");
			checkCheckBox("EU_Exempt4c");
			checkCheckBox("EU_Exempt5a");
			checkCheckBox("EU_Exempt5b");
			checkCheckBox("EU_Exempt5c");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			click("SaveEntities");
		}
		public static void EUAANAThreshold(HashMap<String, String> TestData, int option){
		
			String Locator = "";
						
			switch (option){
				case 1: Locator = "EU_AANAThreshold_above";
				break;
				case 2: Locator = "EU_AANAThreshold_notabove";
				break;
				case 3: Locator = "EU_AANAThreshold_ultimate";
				break;
				case 4: Locator = "EU_AANAThreshold_person";
				break;
				default: Locator = null;
				test.log(LogStatus.FAIL, "Select radio button", "Not verified");
				return;
			}
			click(Locator);	
			test.log(LogStatus.PASS, "Select radio button", "Verified");
		}
		public static void EUAANAThresholdEstimate(HashMap<String, String> TestData, int option){
			
			String Locator = "";
			
			switch (option){
				case 1: Locator = "EU_AANAThresholdEstimate_2017";
				break;
				case 2: Locator = "EU_AANAThresholdEstimate_2018";
				break;
				case 3: Locator = "EU_AANAThresholdEstimate_2019";
				break;
				case 4: Locator = "EU_AANAThresholdEstimate_2020";
				break;
				case 5: Locator = "EU_AANAThresholdEstimate_none";
				break;
				case 6: Locator = "EU_AANAThresholdEstimate_decline";
				break;
				default: Locator = null;
				test.log(LogStatus.FAIL, "Select radio button", "Not verified");
				return;
			}
			click(Locator);	
			test.log(LogStatus.PASS, "Select radio button", "Verified");
		}
		
		
		//SWITZERLAND JURISDICTION COMMON FUNCTIONS
		public static void verifySwitzerlandheading(HashMap<String, String> TestData) {
			if (verifyText("Switzerland",TestData.get("COUNTRYNAME4"))) {
				test.log(LogStatus.PASS, "Switzerland", "Switzerland Heading Verified");
			} else {
				test.log(LogStatus.FAIL, "Switzerland", "Switzerland Heading Not Found");
		}
			  click("Switzerland");
			
		}
		
		public static void verifySwissCollapsed(HashMap<String, String> TestData) {
			click("Switzerland");
			if (getwebLocator(GetLocator("CH_not_collapsed")) != null) {
				test.log(LogStatus.PASS, "SwitzerlandHeading Collapse", "Verified");
			click("Switzerland");
			} else {
				test.log(LogStatus.FAIL, "SwitzerlandHeading Collapse", "Not verified");
			}
			}
			
		public static void verifyFMIAEntityStatusheading(HashMap<String, String> TestData) {
			if (verifyText("CH_FMIAEntityStatus",TestData.get("SWISSFMIAENTITYSTATUS"))) {
				test.log(LogStatus.PASS, "CH_FMIAEntityStatus", " Entity Status Heading Verified");
			} else {
				test.log(LogStatus.FAIL, "CH_FMIAEntityStatus", " Entity Status Heading Not Found");
		}
			
		}
		public static void VerifyCHFMIAEntityOptions(HashMap<String, String> TestData, int option){
			
			String Locator = "";
						
			switch (option){
				case 1: Locator = "CH_Exempt4a";
				break;
				case 2: Locator = "CH_Exempt4b";
				break;
				case 3: Locator = "CH_Exempt1a";
				break;
				case 4: Locator = "CH_Exempt1b";
				break;
				case 5: Locator = "CH_Exempt1c";
				break;
				case 6: Locator = "CH_Exempt2";
				break;
				case 7: Locator = "CH_ExemptNonUndertaking";
				break;
				default: Locator = null;
				test.log(LogStatus.FAIL, "Select radio button", "Not verified");
				return;
			}
			click(Locator);	
			test.log(LogStatus.PASS, "Select radio button", "Verified");
		}
		
		public static void FMIAANNAThresholdEstimateHeading(HashMap<String, String> TestData) {
			if (verifyText("CH_AANAThresholdEstimate",TestData.get("FMIAAANATHRESHOLDESTIMATE"))) {
				test.log(LogStatus.PASS, "CH_AANAThresholdEstimate", "FMIAA ANAThreshold Estimate Heading Verified");
			} else {
				test.log(LogStatus.FAIL, "CH_AANAThresholdEstimate", "FMIA AANA Threshold Estimate Heading Not Found");
		}
		
}
		public static void SwissThirdCountryEntityHeading(HashMap<String, String> TestData) {
			if (verifyText("CH_ThirdCountryEntity",TestData.get("SWISSTHIRDCOUNTRYENTITY"))) {
				test.log(LogStatus.PASS, "CH_ThirdCountryEntity", " Entity Status Heading Verified");
			} else {
				test.log(LogStatus.FAIL, "CH_ThirdCountryEntity", " Entity Status Heading Not Found");
		}
		
}


public static void VerifySwissFMIAAANAThreshold(HashMap<String, String> TestData, int option){
			
			String Locator = "";
						
			switch (option){
				case 1: Locator = "CH_AANAThreshold_above";
				break;
				case 2: Locator = "CH_AANAThreshold_notabove";
				break;
				case 3: Locator = "CH_AANAThreshold_ultimate";
				break;
				case 4: Locator = "CH_AANAThreshold_person";
				break;
				default: Locator = null;
				test.log(LogStatus.FAIL, "Select radio button", "Not verified");
				return;
			}
			click(Locator);	
			test.log(LogStatus.PASS, "Select radio button", "Verified");
		}
    

public static void VerifySwissFMIAAANAThresholdEstimate(HashMap<String, String> TestData, int option){
	
	String Locator = "";
				
	switch (option){
		case 1: Locator = "CH_AANAThresholdEstimate_2017";
		break;
		case 2: Locator = "CH_AANAThresholdEstimate_2018";
		break;
		case 3: Locator = "CH_AANAThresholdEstimate_2019";
		break;
		case 4: Locator = "CH_AANAThresholdEstimate_2020";
		break;
		case 5: Locator = "CH_AANAThresholdEstimate_none";
		break;
		case 6: Locator = "CH_AANAThresholdEstimate_decline";
		break;
		default: Locator = null;
		test.log(LogStatus.FAIL, "Select radio button", "Not verified");
		return;
	}
	click(Locator);	
	test.log(LogStatus.PASS, "Select radio button", "Verified");
}

public static void VerifyFMIANonExempt(HashMap<String, String> TestData, int option){
	
	String Locator = "";
				
	switch (option){
		case 1: Locator = "CH_NonExempt_FC+";
		break;
		case 2: Locator = "CH_NonExempt_FC-";
		break;
		case 3: Locator = "CH_NonExempt_NFC+";
		break;
		case 4: Locator = "CH_NonExempt_NFC-";
		break;
		default: Locator = null;
		test.log(LogStatus.FAIL, "Select radio button", "Not verified");
		return;
	}
	click(Locator);	
	test.log(LogStatus.PASS, "Select radio button", "Verified");
}
/*
public static void VerifySwissThirdCountry(HashMap<String, String> TestData, int choice){
	String radioButtonLocator;
	if (choice < 1 || choice > 4){
		test.log(LogStatus.FAIL, "Select radio button", "Please enter valid choice (1-4)");
	}
	switch (choice){
		case 1: radioButtonLocator = "CH_NonExempt_FC+";
		break;
		case 2: radioButtonLocator = "CH_NonExempt_FC-";
		break;
		case 3: radioButtonLocator = "CH_NonExempt_NFC+";
		break;
		case 4: radioButtonLocator = "CH_NonExempt_NFC-";
		break;
		default: radioButtonLocator = null;
		test.log(LogStatus.FAIL, "Select radio button", "Not verified");
		return;
	}
	click(GetLocator(radioButtonLocator));	
	test.log(LogStatus.PASS, "Select radio button", "Verified");
}
*/

public static void VerifyThirdCountryEntity(HashMap<String, String> TestData, int option){
	
	String Locator = "";
				
	switch (option){
		case 1: Locator = "CH_ThirdCountry_yes";
		break;
		case 2: Locator = "CH_ThirdCountry_no";
		break;
		
		default: Locator = null;
		test.log(LogStatus.FAIL, "Select radio button", "Not verified");
		return;
	}
	click(Locator);	
	test.log(LogStatus.PASS, "Select radio button", "Verified");
}

public static void VerifySwissAANAGroupInfo(HashMap<String, String> TestData, int option){
	
	String Locator = "";
				
	switch (option){
		case 1: Locator = "CH_AANAGroup_yes";
		break;
		case 2: Locator = "CH_AANAGroup_no";
		break;
		
		default: Locator = null;
		test.log(LogStatus.FAIL, "Select radio button", "Not verified");
		return;
	}
	click(Locator);	
	test.log(LogStatus.PASS, "Select radio button", "Verified");
}




	
}
